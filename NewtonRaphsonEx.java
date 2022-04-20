package practice_1;

public class NewtonRaphsonEx {
	
	public static float firstDeri(float x) {
		
		return x*x - 3*x + 2 ;
	}
	
  public static float secondDeri(float x) {
		
		return 2*x -3 ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a=0,z;
		int E = 0;
		do {
			E++;
			z=a-(firstDeri(a)/secondDeri(a));
			
			System.out.println("Iteration: "+ E +"-> Root is :"+z);
			a=z;
			
		}while(Math.abs(firstDeri(z))>0.001);
		
	}

}
