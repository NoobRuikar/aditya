package pract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SegragateSqrt {
	public static ArrayList<Double> sortSqrt(ArrayList<Integer> list){
		ArrayList<Double> sqrtList = new ArrayList<>();
		for(int a:list) {
			sqrtList.add(Math.sqrt(a));
		}
		ArrayList<Double> sqrtListPerfect = new ArrayList<>();
		ArrayList<Double> sqrtListImperfect = new ArrayList<>();
		for(double t:sqrtList) {
			if(t == (int)t) {
				sqrtListPerfect.add(t);
			}else {
				sqrtListImperfect.add(t);
			}
		}
		for(int i=0;i<sqrtListImperfect.size();i++) {
			sqrtListImperfect.set(i, (Math.floor(sqrtListImperfect.get(i)*10))/10);
		}
		
		Collections.sort(sqrtListPerfect,Collections.reverseOrder());
		Collections.sort(sqrtListImperfect,Collections.reverseOrder());
		sqrtListPerfect.addAll(sqrtListImperfect);
		
		return sqrtListPerfect;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 34, 45, 9, 8, 90,4,6,8,16, 3));
		System.out.println(sortSqrt(list));

	}
}
