package lab1;

public class Exercise7 {

	public static void main(String[] args) {
		Exercise7 ex = new Exercise7();
		int num = 12345;
		System.out.println(ex.checkNumber(num));
		

	}

	public boolean checkNumber(int num) {
		
		int flag = 0;
	
		 int currentDigit = num % 10;
	       num = num/10;

	       
	       while(num>0){
	           int prev=num % 10;
	           if(currentDigit <= prev){
	               flag = 1;
	               break;
	           }

	           currentDigit = prev;
	           num = num/10;
	       }
	       
	       if(flag==1){
	           //System.out.println("false");
	    	   return false;
	       }else{
	           //System.out.println("true");
	    	   return true;
	       }
		
		
	}

}
