package pl.akademiakodu.metody;

public class Zadanie14 {
   
	 
	public static void main(String[] args){ 
		
	}
	
	 int euklides(int x, int y) {
		 
	        while (x != y) {
	            if (x > y) {
	                x -= y;
	            } else {
	                y -= x;
	            }
	        }
	       
	        return x;
	    }
}
