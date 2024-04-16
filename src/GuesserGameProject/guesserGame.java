package GuesserGameProject;
import java.util.Scanner;
class Guesser{
    int guesserNum;
    public int takeGuesserNumber(){
        System.out.print("Guesser guess a Number: ");
        Scanner sc = new Scanner(System.in);
        guesserNum = sc.nextInt();
        return guesserNum;
    }
}
class Player{
    int playerNum;
    public int takePlayerNumber(int i){
        System.out.print("Player"+i+" guess a Number: ");
        Scanner sc = new Scanner(System.in);
        playerNum = sc.nextInt();
        return playerNum;
    }
}
class Umpire{
    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;
    void collectFromGuesser(){
        Guesser g = new Guesser();
        numberFromGuesser = g.takeGuesserNumber();
    }
    void collectFromPlayer(){
        Player p1 = new Player();
        numberFromPlayer1 = p1.takePlayerNumber(1);

        Player p2 = new Player();
        numberFromPlayer2 = p2.takePlayerNumber(2);

        Player p3 = new Player();
        numberFromPlayer3 = p3.takePlayerNumber(3);
    }
    void compare(){
        if(numberFromPlayer1 == numberFromGuesser){
            if(numberFromPlayer2 == numberFromGuesser && numberFromPlayer3 == numberFromGuesser){
                System.out.println("All players won the game!");
            } else if (numberFromPlayer2 == numberFromGuesser){
                System.out.println("Only Player1 and Player2 won the game!");
            } else if (numberFromPlayer3 == numberFromGuesser){
                System.out.println("Only Player1 and Player3 won the game!");
            } else {
                System.out.println("Only Player1 won the game!");
            }
        } else if (numberFromPlayer2 == numberFromGuesser){
            if(numberFromPlayer3 == numberFromGuesser){
                System.out.println("Only Player2 and Player3 won the game!");
            } else {
                System.out.println("Only Player2 won the game!");
            }
        } else if (numberFromPlayer3 == numberFromGuesser){
            System.out.println("Only Player 3 won the game!");
        } else {
            System.out.println("None of the Player won the game!");
        }
    }
}
public class guesserGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectFromGuesser();
        u.collectFromPlayer();
        u.compare();
    }
}
