package lab9;

public class Exercise1 {
	
	interface Intf1
	{
		public int power(int x,int y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intf1 intf = (int x, int y) ->{
			return (int) Math.pow(x, y);
		};
		System.out.println(intf.power(5, 5));
		

	}

}
