package practice_1;
public class NewtonRaphsonMthod {
    /* Algorithm
    1. Assign an initial value to x, say x0
    2.Evaluate f(x0) and f'(x0)
    3. Find improved estimation of x0
       x1=x0-((f(x0)/f'(x0))
    4.Check for accuracy of the latest estimate.
      Compare relative error to a predefined value E. If |(x1-x0)/x1|<=E
      stop. Otherwise Continue.
    5. Replace x0 by x1 and repeat step 3 and 4
    */
    static final double EPSILON = 0.001;
    // The function is x^3 - x^2 + 2
    static double func(double x)
    {

        return x * x * x - x * x + 2;
    }

    // Derivative of the above function
    // which is 3*x^x - 2*x
    static double derivFunc(double x)
    {
        return 3 * x * x - 2 * x;
    }

    // Function to find the root
    static void newtonRaphson(double x)
    {
    	
        double h = func(x) / derivFunc(x);
        while (Math.abs(h) >= EPSILON)
        {
            h = func(x) / derivFunc(x);

            // x(i+1) = x(i) - f(x) / f'(x)
            x = x - h;
        }

        System.out.print("The value of the"
                + " root is : "
                + Math.round(x * 100.0) / 100.0);
    }

    // Driver code
    public static void main (String[] args)
    {

        // Initial values assumed
        double x0 = 0;
        newtonRaphson(x0);
    }
}
