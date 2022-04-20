package practice_1;
public class SecantMethod {
    /*
     *  Algorithm
    1. Decide two initial points x1 and x2, accuracy level required ,E.
    2. Compute f1=f(x1) and f(x2)
    3. Compute x3= (f2x1-f1x2)/(f2-f1)
    4. Test for accuracy of x3
       If--> |(x3-x2)/x3| >E then
       set x1=x2 and f1 = f2
       set x2=x3 and find f2= f(x3)
       go to step 3

       otherwise-->
       set root=x3
       print result

    5. Stop
    */



    // function takes value of x and
    // returns f(x)
    static float f(float x) {

        // we are taking equation
        // as x^3+x-1
        float f = (float)Math.pow(x, 3)+ x - 1;

        return f;
    }

    static void secant(float x1, float x2,
                       float E) {

        float n = 0, xm, x0, c,h;
        if (f(x1) * f(x2) < 0)
        {
            do {

                // calculate the intermediate
                // value
            	
                //	h = (f(x2)*(x2-x1))/(f(x2) - f(x1));
            	
                x0 = (x1 * f(x2) - x2 * f(x1))/ (f(x2) - f(x1));

                // check if x0 is root of
                // equation or not
                c = f(x1) * f(x0);

                // update the value of interval
                x1 = x2;
                x2 = x0;

                // update number of iteration
                n++;

                // if x0 is the root of equation
                // then break the loop
                if (c == 0)
                    break;
                xm = (x1 * f(x2) - x2 * f(x1))
                        / (f(x2) - f(x1));

                // repeat the loop until the
                // convergence
            } while (Math.abs(xm - x0) > = E);

            System.out.println("Root of the" +
                    " given equation=" + x0);

            System.out.println("No. of "
                    + "iterations = " + n);
        }

        else
            System.out.print("Can not find a"
                    + " root in the given inteval");
    }

    // Driver code
    public static void main(String[] args) {

        // initializing the values
        float x1 = 4, x2 = 2, E = 0.0001f;
        secant(x1, x2, E);
    }
}
