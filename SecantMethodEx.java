package practice_1;

public class SecantMethodEx {
	static int MAX_ITER = 1000000;

    // An example function whose
    // solution is determined using
    // Bisection Method. The function
    // is x^3 - x^2 + 2
    static double f(double x)
    {
        return x*x - 4*x - 10;
    }

    // Prints root of func(x)
    // in interval [a, b]
    static void SecantMethodEx(double a, double b)
    {
        if (f(a) * f(b) < 0)
        {
          

        // Initialize result
        double c = a;
         double h;
        for (int i = 0; i < MAX_ITER; i++)
        {
            // Find the point that touches x axis
        	
        	
        	
        	
        	h = (f(a)*(b-a))/(f(b) - f(a));
        	
            c = a -  h;
        	
           // c = (a * func(b) - b * func(a))/ (func(b) - func(a));

            // Check if the above found point is root
            if (f(c) == 0)
                break;

                // Decide the side to repeat the steps
            else if (f(c) * f(a) < 0)
                b = c;
            else
                a = c;
            
            
     System.out.println("New interval: [" + a + " .. " + b + "]"); 
        }
        System.out.println("The value of root is : " + c);
    }
        else {
        	  System.out.println("You have not assumed right a and b");
        }    
    
    
    }

    // Driver program
    public static void main(String[] args)
    {
        // Initial values assumed
        double a = -2, b = -1;
        SecantMethodEx(a, b);
    }
}
