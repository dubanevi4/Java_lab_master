package Excercise3;

import java.util.Scanner;

class MathUtils {
    //put your code here
    static class ComplexNumber {
        private final double re; //real part
        private final double im; //imaginary part

        public ComplexNumber(double re, double im){
            this.re = re;
            this.im = im;
        }

        public double getRe(){
            return this.re;
        }

        public double getIm(){
            return this.im;
        }
    }

    static ComplexNumber add (ComplexNumber a, ComplexNumber b){
        return new ComplexNumber((a.getRe() + b.getRe()),(a.getIm() + b.getIm()));
    }

    static ComplexNumber multiply(ComplexNumber a, ComplexNumber b){
        double realPart = a.getRe() * b.getRe() - a.getIm() * b.getIm();
        double imaginaryPart = a.getRe() * b.getIm() + a.getIm() * b.getRe();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber conjugate(ComplexNumber a) {
        return new ComplexNumber(a.getRe(), -a.getIm());
    }
}

class Executor {
    public static void main(String[] args) {
        //put your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] commandParts = input.split("/");

        String command = commandParts[0];

        String[] complex1 = commandParts[1].split(";");

        double re1 = Double.parseDouble(complex1[0]);
        double im1 = Double.parseDouble(complex1[1]);

        MathUtils.ComplexNumber num1 = new MathUtils.ComplexNumber(re1, im1);

        MathUtils.ComplexNumber result = null;

        switch (command) {
            case "add":
                if (commandParts.length < 3) {
                    System.out.println("Second complex number is required for addition.");
                    return;
                }
                String[] complex2 = commandParts[2].split(";");
                double re2 = Double.parseDouble(complex2[0]);
                double im2 = Double.parseDouble(complex2[1]);
                MathUtils.ComplexNumber num2 = new MathUtils.ComplexNumber(re2, im2);
                result = MathUtils.add(num1, num2);
                break;
            case "multiply":
                if (commandParts.length < 3) {
                    System.out.println("Second complex number is required for multiplication.");
                    return;
                }
                complex2 = commandParts[2].split(";");
                re2 = Double.parseDouble(complex2[0]);
                im2 = Double.parseDouble(complex2[1]);
                num2 = new MathUtils.ComplexNumber(re2, im2);
                result = MathUtils.multiply(num1, num2);
                break;
            case "conjugate":
                result = MathUtils.conjugate(num1);
                break;
            default:
                System.out.println("Invalid command. Use add, multiply, or conjugate.");
                return;
        }
        if (result != null) {
            System.out.printf("%.1f;%.1f%n", result.getRe(), result.getIm());
        }
    }
}
