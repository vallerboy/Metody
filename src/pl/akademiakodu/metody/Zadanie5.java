package pl.akademiakodu.metody;

public class Zadanie5 {

	   public static void main(String[] args) {
		   
	        System.out.println(checkNumber(9, 5, 6));
	 
	    }
	 
	    public static boolean checkNumber(int a, int b, int c) {
	        if (Math.pow(a, 2) + Math.pow(a, 2) == Math.pow(c, 2))
	            return true;
	        else
	            return  false;
	    }
	    
	    boolean ifPita(int a, int b, int c) {
			if ((a * a) + (b * b)  == (c * c)) {
				return true;
			} else
				return false;
		}
	 
}
