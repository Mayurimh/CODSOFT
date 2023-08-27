
    import java.lang.System;
    import java.lang.String;
    import java.util.Scanner;
    import java.util.Random;

    class Guess_number_game{
        public int number;
        public int guess_num;
        final int k=10;
        public int i;

    Guess_number_game()
    {
        Random r=new Random();
        number=r.nextInt(100);
    }
    void display()
    {
        System.out.println("***************************** NUMBER GAME *******************************");
        System.out.println();
        System.out.println("             "+"* YOU HAVE 10 CHANCES TO GUESS THE NUMBER *"+"                     ");
    }
    void checknumber()
    {
        Scanner scan= new Scanner(System.in);
        for(i=1;i<=k;i++){
        System.out.println();
        System.out.print("        "+"Enter the guess number : ");
        guess_num=scan.nextInt();
        if(number==guess_num)
        {
            System.out.println("        "+"wow! congradulations !!");
            System.out.println("        "+"you guess the the number in "+i+" attempts..");
            System.out.println("        "+"You are successfully guess the number..");
            System.out.println("        "+"YOUR SCORE IS  "+(int)1000/i);
           break;
        }
        else if(number<guess_num){
            System.out.println("        "+"the number is too high");
        }
        else if(number>guess_num)
        {
            System.out.println("        "+"the number is too low");
        }
        }
        if(i>k){
            System.out.println();
            System.out.println("        "+"ohhhhh!!  you are fail.....");
            System.out.println("        "+"the number is "+number);
            System.out.println("try again.....");
        }
    }
 }
    public class Number_game {
        public static void main(String[] args) {
        Guess_number_game g1= new Guess_number_game();
        g1.display();
        g1.checknumber();
        }
    }