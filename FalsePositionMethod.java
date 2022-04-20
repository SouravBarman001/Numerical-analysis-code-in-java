package practice_1;
public class FalsePositionMethod {
    /*
     * 
     * 
    Let x0=x1-f(x1)*((x2-x1)/(f(x2)-f(x1)))
    If--> f(x0)*f(x1)<0
         set x2=x0
    Otherwise-->
    set x1=x0
    
    
    */

    static int MAX_ITER = 1000000;

    // An example function whose
    // solution is determined using
    // Bisection Method. The function
    // is x^3 - x^2 + 2
    static double func(double x)
    {
        return x*x - 4*x - 10;
    }

    // Prints root of func(x)
    // in interval [a, b]
    static void regulaFalsi(double a, double b)
    {
        if (func(a) * func(b) < 0)
        {
          

        // Initialize result
        double c = a;

        for (int i = 0; i < MAX_ITER; i++)
        {
            // Find the point that touches x axis
            c = (a * func(b) - b * func(a))/ (func(b) - func(a));

            // Check if the above found point is root
            if (func(c) == 0)
                break;

                // Decide the side to repeat the steps
            else if (func(c) * func(a) < 0)
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
        regulaFalsi(a, b);
    }
}

