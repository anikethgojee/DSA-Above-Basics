import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int n = 0, n2=0, m=0;

        for(int i=1; i<=100; i++){
            n = n ^ (i);
        }
        for(int i=1; i<=99; i++){
            n2 = sc.nextInt();
            m = m ^ n2;
        }

        System.out.println(n^m);

    }
}