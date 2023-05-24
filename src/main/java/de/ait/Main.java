package de.ait;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static boolean isValidLogin(String login){
        return login.length()<20 && login.length()>= 8 && login.contains("@");
    }
    public static String getRectangleArea(int a, int b){
        return "Прямоугольник с площадью " + (a * b);
    }
}