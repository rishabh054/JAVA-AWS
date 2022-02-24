package lab6;
import java.util.HashMap;
import java.util.Map.Entry;

public class Exercise4 {
	
	public static HashMap<String,String> getStudents(HashMap<String,Integer> mp) {
	       HashMap<String,String> medalmp = new HashMap<String,String>();
	       for(Entry<String, Integer> e: mp.entrySet()) {
	              int marks = e.getValue();
	              if(marks>=90) {
	            	  medalmp.put(e.getKey(),"Gold");
	              }else if(marks >=80) {
	            	  medalmp.put(e.getKey(),"Silver");
	              }else if(marks>=70) {
	            	  medalmp.put(e.getKey(),"Bronze");
	              }
	       }
	       return medalmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> s = new HashMap<>();
	       s.put("R1",90);
	       s.put("R2",76);
	       s.put("R3",89);
	       s.put("R4",90);
	       s.put("R5",93);
	       System.out.println(getStudents(s));
	}

}