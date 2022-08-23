//Используя знания об операторе IF, напишите программу, которая выводит на экран большее из 3 чисел. Числа заданы в виде переменных num1, num2, num3.

public class Main {
    public static void main(String[] args) {


        int num1 = 200;
        int num2 = 300;
        int num3 = 121;

        int max = num1;

        if (num2 > max) {
            max = num2;
            if (num3 > max) {
                max = num3;
            }
        } else {
            if (num3 > max) {
                max = num3;
            }
        }

        System.out.println("Большее из чисел " + num1 + ", " + num2 + " и " + num3 + " : " + max);
    }
}