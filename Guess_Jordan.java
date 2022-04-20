package practice_1;



public class Guess_Jordan {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// At first initialize the values
		
		double a[][] = new double [100][100];
		a[0][0] = 3;
		a[0][1] = 2;
		a[0][2] = 1;
		a[0][3] = 10;
		
		a[1][0] = 2;
		a[1][1] = 3;
		a[1][2] = 2;
		a[1][3] = 14;
		
		a[2][0] = 1;
		a[2][1] = 2;
		a[2][2] = 3;
		a[2][3] = 14;
		
		double x[] = new double[100];
		double ratio = 0;
		int i,j,k,n=3;
		
		 for(i=1;i<=n;i++)
		 {
			  if(a[i][i] == 0.0) 
			  {
				  System.out.println("...");
				  
			  }
			  for(j=1;j<=n;j++)
			  {
				   if(i!=j)
				   {
					    ratio = a[j][i]/a[i][i];
					    for(k=1;k<=n+1;k++)
					    {
					     	a[j][k] = a[j][k] - ratio*a[i][k];
					    }
				   }
			  }
		 }
		 /* Obtaining Solution */
		 for(i=1;i<=n;i++)
		 {
		  	x[i] = a[i][n+1]/a[i][i];
		 }
		 /* Displaying Solution */
		 System.out.print("Successfully fail... kal mara khabo");
		 for(i=1;i<=n;i++)
		 {
			 System.out.print(x[i]);
		 }
		
		
		
	}

}
