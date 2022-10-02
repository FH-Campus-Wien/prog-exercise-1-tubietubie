package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int literal1 = 'Z';
        int literal2 = 0xface;
        int literal3 = 012;
        long literal4 = 80L;
        float literal5 = 44e-1f;
        float literal6 = 5.5f;
        double literal7 = 8.88e1;
        double literal8 = 99.9;

        int sum = literal1+literal2+literal3+(int)literal4+(int)literal5+(int)literal6+(int)literal7+(int)literal8;

        System.out.println(sum);
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner Tubie = new Scanner(System.in);
        int x = Tubie.nextInt();
        int y = Tubie.nextInt();

        int sum = x + y;
        System.out.println(sum);
        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner Tubie = new Scanner(System.in);
        int x = Tubie.nextInt();
        int y = Tubie.nextInt();

        //Aus dem Forum übernommen nachdem der Test fehlgeschlagen ist
        System.out.println("Before Swap:"+System.lineSeparator()+"x: y: After Swap:");

        // Test hat nicht funktioniert, deshalb wurde System.out.println() geändert
        // System.out.println("x: "+x);
        // System.out.println("y: "+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scan= new Scanner(System.in);

        int n1= scan.nextInt();
        int n2= scan.nextInt();
        System.out.print("n1: n2: ");
        //System.out.println("n1: "+n1);
        //System.out.println("n2: "+n2);

        if(n1>n2){
            System.out.println("n1 > n2");
        }
        else if (n2 > n1) {
            System.out.println("n2 > n1");
        }
        else if (n1 == n2){
            System.out.println("n1 == n2");
        }

        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int umsatz = scan.nextInt();

        if (0 > umsatz || umsatz >= 100000 ) {
            System.out.println("Invalid Revenue");

        } else if (0 <= umsatz && umsatz < 20000 ) {
            System.out.println("Poor Sales Revenue");

        } else if (20000<= umsatz && umsatz < 50000 ) {
            System.out.println("Average Sales Revenue");

        } else if (50000<= umsatz && umsatz < 80000 ) {
            System.out.println("Good Sales Revenue");

        } else if (80000<= umsatz && umsatz < 100000 ) {
            System.out.println("Excellent Sales Revenue");
        }



        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int eingabe = scan.nextInt();
        double provision;

        switch (eingabe){
            case 1: provision = 0.01;
                    break;
            case 2: provision = 0.02;
                    break;
            case 3: provision = 0.03;
                    break;
            case 4: provision = 0.04;
                    break;
            default:provision = 0.00;
        }
        System.out.println("Your Commission Rate was set to " + provision);

        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Year: ");
        int jahr = scan.nextInt();

        if (jahr%4 == 0 ) {
            if (jahr%100 == 0 && jahr%400 != 0){
                System.out.println("Not a Leapyear");
            } else {
                System.out.println("Leapyear");
            }
        } else {
            System.out.println("Not a Leapyear");
        }
            // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Number: ");

        int number = scan.nextInt();
        int remainder;
        int reverse = 0;

        if (number>1000){
            System.out.println("");
        } else {
            // https://www.javatpoint.com/how-to-reverse-a-number-in-java
            while(number != 0){
                remainder = number%10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
        }

        System.out.println(reverse);

        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}