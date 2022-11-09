import java.util.*;

public class RockPaperScissors {
    //MAIN FUNCTION @NAIVEASHISH
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] rps = {"r", "p", "s"};
            String yourMove;
            String computer = rps[new Random().nextInt(rps.length)];
            while (true) {
                System.out.println("Please Enter Your Move : r,p or s");
                yourMove = sc.nextLine();
                if (yourMove.equals("r") || yourMove.equals("p") || yourMove.equals("s")) {
                    break;
                } else {
                    System.out.println(yourMove + " is not Valid");
                }
            }
            System.out.println("Computer Plays  : " + computer);
            if (computer.equals(yourMove)) {
                System.out.println("It's a tie !!");
            } else if (yourMove.equals("r")) {
                if (computer.equals("p")) {
                    System.out.println("Oops You Lose");
                } else if (computer.equals("s")) {
                    System.out.println("BRAVO! YOU WON !!");
                }
            } else if (yourMove.equals("p")) {
                if (computer.equals("r")) {
                    System.out.println("BRAVO! YOU WON !!");
                } else if (computer.equals("s")) {
                    System.out.println("Oops You Lose");
                }
            } else if (yourMove.equals("s")) {
                if (computer.equals("r")) {
                    System.out.println("Oops You Lose");
                } else if (computer.equals("p")) {
                    System.out.println("BRAVO! YOU WON !!");
                }
            }
            System.out.println("PLAY AGAIN? [y/n]");
            String playAgain = sc.nextLine();
            if(!playAgain.equals("y")){
                break;
            }
        }
    }
}

