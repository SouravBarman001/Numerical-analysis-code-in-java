package practice_1;
public class JacobiIterationMethod {
    public static double esp=1e-2;
    public static double limit=100;
    public static double[][] a={
    		
            {2,-7,-10,-17},
            {5,1,3,14},
            {1,10,9,7}
            
    };
    public static void main(String[] args) {
        double x1=0,x2=0,x3=0;
        double y1=0,y2=0,y3=0;
        int i=0;
        while (true){
            x1=(a[0][3]-(y2*a[0][1])-(y3*a[0][2]))/a[0][0];
            x2=(a[1][3]-(y1*a[1][0])-(y3*a[1][2]))/a[1][1];
            x3=(a[2][3]-(y1*a[2][0])-(y2*a[2][1]))/a[2][2];
            y1=x1;
            y2=x2;
            y3=x3;
            System.out.println("Iteration: "+i++);
            System.out.println("\tx1="+x1+"\tx2="+x2+"\tx3="+x3);

            double d=a[0][0]*x1+a[0][1]*x2+a[0][2]*x3;
            if(Math.abs(d-a[0][3])<esp)break;
            if(i>limit)break;
        }


    }
}
