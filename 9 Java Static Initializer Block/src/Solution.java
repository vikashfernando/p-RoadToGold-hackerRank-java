import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    //Write your code here
    static int H;
    static int B;
    static boolean flag;

    static void getInput(){

        Scanner i1=new Scanner(System.in);

        System.out.println("height: ");
        H=i1.nextInt();

        System.out.println("breadth: ");
        B=i1.nextInt();



    }

    



    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

