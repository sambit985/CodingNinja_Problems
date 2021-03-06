/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32
*/
public class Solution {
	public static int power(int x, int n) {
	   // Base case
        if(n==0){
            return 1;
        }
		int smallOutput=power(x,n-1);
        int output=x*smallOutput;
        return output;       
	}
    public static void main(String[] args){
        System.out.println(power(5,2));
    }
}
