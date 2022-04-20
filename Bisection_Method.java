package practice_1;

public class Bisection_Method {
	
	
	 static double function(double x)
	    {
	        return x*x - 4*x - 10;
	    }

	public static void main(String[] args)
    {
 	 final double epsilon = 0.001;
 	 double a, b, c, f_c, f_a;
  
 	 a = -2;  b = -1;
 	 
 	  if (function(a) * function(b) < 0)
      {

  
 	 while ( (b-a) > epsilon)
 	 {
 	    c = (a+b)/2;                 // Mid point
  
 	    f_c = c*c - 4*c - 10;       // y_m = f(m)
 	    f_a = a*a - 4*a - 10;       // y_a = f(a)
  
 	    if ( (f_c > 0 && f_a < 0) || (f_c < 0 && f_a > 0) )
 	    {  // f(a) and f(m) have different signs: move b
 	       b = c;
 	   // System.out.println("b"+b);
 	    }
 	    else
 	    {  // f(a) and f(m) have same signs: move a
 	       a = c;
 	    // System.out.println("a"+a);
 	    }
          System.out.println("New interval: [" + a + " .. " + b + "]");   
                                         // Print progress  
 	 }
  
 	 System.out.println("Approximate solution = " + (a+b)/2 );
    }
 	  
 	  else {
 		 System.out.println("You have not assumed"
                 + " right a and b");
 	  }
}
}
