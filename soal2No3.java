package ujianUKL;

import java.util.Random;
import java.util.Scanner;

public class soal2No3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        while (true ) {
            int numb1 = r.nextInt(100) + 1;
            int numb2 = r.nextInt(100) + 1;
            int operator = r.nextInt(3);

            String question = "";
            int correctAnswer = 0;

            switch (operator) {
                case 0:
                question = numb1 + " * " + numb2 + " = ";
                correctAnswer = numb1 * numb2;
                break;

                case 1:
                question = numb1 + " / " + numb2 + " = ";
                correctAnswer = numb1 / numb2;
                break;

                case 2:
                question = numb1 + " % " + numb2 + " = ";
                correctAnswer = numb1 % numb2;
                break;
            }

            System.out.print(question);
            int userAnswer = s.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Jawaban Anda Benar");
            } else {
                System.out.println("Jawaban Anda Salah, Ini adalah jawaban yang benar: " + correctAnswer);
            }

            System.out.println("Apakah Anda ingin melanjutkan quiz? (yes/no): ");
            String userResponse = s.next();

            if (userResponse.equalsIgnoreCase("no")) {
                System.out.println("Terimakasih sudah bermain quiz ini");
                break;
            }
        }
        s.close();
    }
    
}



    
    

