package com.example.user.myapplication;

import java.util.Scanner;

public class Math {
    private double sum(double a, double b){
        return a+b;
    }

    private double subs(double a, double b){
        return a-b;
    }

    private double multyp(double a, double b){
        return a*b;
    }

    private double devide(double a, double b){
        return a/b;
    }

    public String getResult(String numA, String numB, int operation){

        double a = stringTodouble(numA);
        double b = stringTodouble(numB);

        Math math = new Math();
        String toReturn=null;
        switch(operation){
            case 0 :
                toReturn= String.valueOf(math.sum(a,b));
                break;
            case 1 :
                toReturn= String.valueOf(math.subs(a,b));
                break;
            case 2 :
                toReturn= String.valueOf(math.multyp(a,b));
                break;//
            case 3 :
                toReturn= String.valueOf(math.devide(a,b));
                break;
        }
        return  toReturn;
    }

    public double stringTodouble(String string){
        Scanner scanner = new Scanner(string);
        return scanner.nextDouble();
    }
}
