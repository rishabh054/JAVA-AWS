package lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
	public static ArrayList<Integer> getValues(HashMap<String, Integer> mp) {
		ArrayList<Integer> a = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
		    a.add(entry.getValue());
		}
		Collections.sort(a);
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> mp = new HashMap<>();
		mp.put("A", 9);
		mp.put("B", 8);
		mp.put("C", 7);
		mp.put("D", 6);
		mp.put("E", 5);
		mp.put("F", 4);
		mp.put("G", 3);
		System.out.println(getValues(mp));
	}
}
