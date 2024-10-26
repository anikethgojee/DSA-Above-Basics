import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int pos=0, z=0, neg=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x==0) z++;
            else if(x<0) neg++;
            else pos++;
        }
        
        System.out.println(z + " " + pos + " " + neg);
    }
}