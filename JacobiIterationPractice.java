package practice_1;

/* 20x + y - 2z = 17
   3x + 20y -z = -18
   2x - 3y + 20z = 25
 * _____________________
 * 
 * x = (17-y+2z)/20
   y = (-18-3x+z)/20
   z = (25-2x+3y)/20
 * 
 * 
 * 
 */

public class JacobiIterationPractice {
	
	public static double f1(float x,float y,float z) {
		//float  x1 = (17-y+2*z)/20;
		float  x1 = (5-y-z)/2;
		
		return x1;
	}

	public static double f2(float x,float y,float z) {
		//float  y1 = (-18-3*x+z)/20;
		float  y1 = (15-3*x-2*z)/5;
		
		return y1;
	}
	public static double f3(float x,float y,float z) {
		//float  z1 = (25-2*x+3*y)/20;
		float  z1 = (8-2*x-y)/4;
		
		return z1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float x0=0, y0=0, z0=0, x1, y1, z1, e1, e2, e3, e = (float) 0.001;
    int count = 1;
		
 
    
	do {
		
		  x1 = (float) f1(x0,y0,z0); //2.5
		  y1 = (float) f2(x0,y0,z0); // 3
		  z1 = (float) f3(x0,y0,z0); //2
		
		  System.out.println("Iteration: "+ count);
		  System.out.println("x   : "+ x1);
		  System.out.println("y   : "+ y1);
		  System.out.println("z   : "+ z1);
		  System.out.println("_______________");
		  
		
		 e1 = Math.abs(x0-x1);
		 e2 = Math.abs(y0-y1); // 0001
		 e3 = Math.abs(z0-z1);
		 
		  count++; // 2

		  /* Set value for next iteration */
		  x0 = x1; // 2.5
		  y0 = y1; // 3
		  z0 = z1; // 2

	}while(e1>e && e2>e && e3>e);	
	
	System.out.println("\nSolution x:"+x1);
	System.out.println("\nSolution y:"+y1);
	System.out.println("\nSolution z:"+z1);
	}

}
