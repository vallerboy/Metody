package pl.akademiakodu.metody;

public class Zadanie7 {

	public static void main(String[] args) {
	 
		Zadanie7 zadanie = new Zadanie7();
		//zadanie.czyKwadrat(4);
 
		System.out.println(zadanie.ifSqrt(3));
	}

	//  Wolniejsze rozwi¹zanie
	  boolean czyKwadrat(int x){
	       
	        //Math.pow(x,y) to x^y
	       
	        for (int i = 2; i<= x; i++){
	            for (int j = 2; j<=x; j++){
	                 if(Math.pow(i, j) == x) {
	                     System.out.println("TRUE");
	                     return true;
	                 }
	            }
	        }
	        System.out.println("FALSE");
	        return true;
	    }
	  
	  // Szybsze rozwi¹zanie 
	  public static boolean kwadrat (int a){
	        for (int i = 0; i < a; i++) {
	            if (a==i*i){
	               return true;
	            }
	        }
	 
	         return false;
	    }
	  
	  // Szybsze  rozwi¹zanie O(1)
	  public static boolean isNumberQuadOf(double number) {
		  
	        double temp = Math.sqrt(number);
	        double temp2 = Math.pow(temp, 2);
	 
	        if (number == temp2) return true;
	        else return false;
	    }
	  
	  // Szybsze  rozwi¹zanie O(1)
	  boolean ifSqrt(int a) {
	        if (Math.sqrt(a) % 1 == 0) {
	            System.out.println("Jest to prawda");
	            return true;
	        }
	        else{
	            System.out.println("Jest to falsz");
	            return false;
	        }
	    }
}
