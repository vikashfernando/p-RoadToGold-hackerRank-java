import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //variables
        int num1;
        String txt1;
        int num2;

        Scanner i1=new Scanner(System.in);

        System.out.println("enter a number: ");
        num1=i1.nextInt();

        txt1=String.valueOf(num1);

        System.out.println("int converted to String: "+txt1);

        num2=Integer.parseInt(txt1);

        System.out.println("text converted to int:  "+num2);










    }
}