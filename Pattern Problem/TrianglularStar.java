import java.util.Scanner;
public class TriangularStar {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print('*');
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
		
	}

}
