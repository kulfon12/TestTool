
public class Calcuation {
	
	void fact(int n){
		int fact=1;
		for(int i=1; i<=n;i++){
			fact=fact*i;
			System.out.println("factor is " + fact);
		}
	}

	public static void main(String[] args) {
		
      new Calcuation().fact(4);
      
	}

}
