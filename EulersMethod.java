package practice_1;
import java.io.IOException;

public class EulersMethod {
    /* Algorithm
     * 
      y(i+1)=y1+hf(xi,yi)
      
    */


    // Consider a differential equation
    // dy/dx=(3x^2+1)

    float func(float x, float y)
    {
        return (3*x*x + 1);
    }

    // Function for Euler formula
    void euler(float x0, float y, float h, float x)
    {
        float temp = -0;

        // Iterating till the point at which we
        // need approximation
        while (x0 < x) {
            temp = y;
            y = y + h * func(x0, y);
            x0 = x0 + h;
            System.out.println("y("+x0+") = "+y);
        }

        // Printing approximation
        System.out.println("Approximate solution at x = "
                + x + " is " + y);
    }

    // Driver program
    public static void main(String args[]) throws IOException
    {
        EulersMethod obj = new EulersMethod();
        // Initial Values
        float x0 = 1;
        float y0 = 2;
        float h = 0.5f;

        // Value of x at which we need approximation
        float x = 2;

        obj.euler(x0, y0, h, x);
    }
}
