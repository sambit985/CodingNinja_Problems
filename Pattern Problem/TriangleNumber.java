/*
Print the following pattern for the given N number of rows.

Pattern for N = 4
1
22
333
4444

*/


import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
     Scanner Sc = new Scanner(System.in);
        int n=Sc.nextInt();
        
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                int p=i;
                System.out.print(p);
                p=i+1;
                j = j+1;
            }
            System.out.println();
            i=i+1;
        }
	}
}
