package practice_1;
public class BisectionMethod {
    /*
    1. Decide initial values for x1 and x2 and stopping criterion E
    2. Compute f1=f(x1) and f2=f(x2)
    3. If--> f1 * f2 >0, and x2 do not bracket any root go to step 7
       Otherwise --> continue
    4. Compute x0=(x1+x2)/2 and compute f0=f(x0)
    5. If--> f1 * f2<0 then
             set x2=x0
       else
             set x1=x0
             set f1=f0
     6. If--> Absolute value of (x2-x1)/x2 is less than error E, then
              root =(x1+x2)/2
              write the value of the root
              go to step 7
        else
              go to step 4
      7. Stop

    */

    static final float EPSILON = (float)0.00001;

    // An example function whose solution is determined using
    // Bisection Method. The function is x^3 - x^2  + 2
    static double func(double x)
    {
        return x*x - 4*x - 10;
    }

    // Prints root of func(x) with error of EPSILON
    static void bisection(double a, double b)
    {
        if (func(a) * func(b) > 0)
        {
            System.out.println("You have not assumed"
                    + " right a and b");
           // return;
        }

        double c = a;
        while ((b-a) >= EPSILON)
        {
            // Find middle point
            c = (a+b)/2;

            // Check if middle point is root
            if (func(c) == 0.0)
                break;

                // Decide the side to repeat the steps
            else if (func(c)*func(a) < 0)
                b = c;
            else
                a = c;
        }
        //prints value of c upto 4 decimal places
        System.out.printf("The value of root is : %.4f"
                ,c);
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        // Initial values assumed
        double a =-2, b = -1;
        bisection(a, b);
    }
}

