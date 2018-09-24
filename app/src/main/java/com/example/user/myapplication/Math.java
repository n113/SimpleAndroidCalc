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
        String toReturn=null;

        switch(operation){
            case 0 :
                if(a==07.01&&b==1992){
                    toReturn="olololo";
                }
                else if(a==03.01&&b==1994){
                    toReturn="olololol";
                }
                else{
                    toReturn= String.valueOf(sum(a,b));
                }
                break;
            case 1 :
                toReturn= String.valueOf(subs(a,b));
                break;
            case 2 :
                toReturn= String.valueOf(multyp(a,b));
                break;//
            case 3 :
                toReturn= String.valueOf(devide(a,b));
                break;
        }
        return  toReturn;
    }

    private double stringTodouble(String string){
        Scanner scanner = new Scanner(string);
        return scanner.nextDouble();
    }
}
