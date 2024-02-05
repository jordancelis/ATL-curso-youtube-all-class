package Clase_6;

import java.util.Random;
import java.util.Scanner;

public class piedra_papel_tijera {

    public static void main (String[] args) {

        System.out.println("Welcome to game the Rock,Paper,Scissors");
        System.out.println("Chose one!!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();



        int user_wom = 0;
        int computer_won = 0;
        int tie = 0;

        while (user_wom < 3 && computer_won < 3){
            String user = scanner.nextLine();
        if (user.equals("rock") || user.equals("paper") || user.equals("scissors")) {

            int chosecompu = random.nextInt(3);
            String chosecompuM = "";

            switch (chosecompu) {
                case 0:
                    chosecompuM = "rock";
                    break;

                case 1:
                    chosecompuM = "paper";
                    break;

                case 2:
                    chosecompuM = "scissors";
                    break;
            }

            System.out.println("the choise of computer is: " + chosecompuM);

            if (user.equals(chosecompuM)) {
                System.out.println("Es un empate");
                tie++;
            } else if ((user.equals("rock") && chosecompuM.equals("scissors"))
                    || (user.equals("paper") && chosecompuM.equals("rock")) ||
                    (user.equals("scissors") && chosecompuM.equals("paper"))) {
                System.out.println("Congratulations you won !!!!! aua");
                user_wom++;
            } else {
                System.out.println("The computer has won, keep tryign ");
                computer_won++;
            }

        } else {
            System.out.println("i am sorry , wrong choice, do you have choice between rock, paper and scissors");
        }

    }

        if (user_wom >=3){
            System.out.println("\n The user wins with 3 wins ");
        }else if (computer_won >=3){
            System.out.println("\n The computer wins with 3 wins");
        }else if(tie >=3){
            System.out.println("it is a technical tie ");
        }else {
            System.out.println("Game over!!");
        }
        System.out.println("Resultados: ");
        System.out.println("wins the user: " + user_wom);
        System.out.println("wins the computer: " + computer_won);
        System.out.println("Empates : " + tie);

    }
}










