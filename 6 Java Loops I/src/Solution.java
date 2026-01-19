import java.io.*;


public class Solution {
    public static void main(String[] args)
            throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        //my work
        for(int i=1;10>=i;i++){
            int result =N*i;
            System.out.println(N+" x "+i+" = "+result);
        }


        bufferedReader.close();
    }
}
