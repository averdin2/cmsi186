//CountdownToArgs.java

public class CountdownToArgs {
	public static void main (String[] args) {
		try {
		int arg = Integer.parseInt(args[0]);
		    if (arg <= 0) {
		    	System.out.println("Argument must be greater than 0");
		    } else {
	        
	       		   for (int i = arg; i > 0; i--) {
	                   System.out.printf (i + " ");
	        	    }
	        	}

	   		} catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("No argument provided");
	        } catch (NumberFormatException e2) {
	        	System.out.println("Please only insert integers");
	        }
	    
	}
}
