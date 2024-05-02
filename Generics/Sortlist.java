import java.util.*;
public class Sortlist{
	public static <E extends Comparable<E>> void sort(ArrayList<E> list){
		System.out.println(list);
		E k;
		for(int i=0; i<list.size(); i++){
			for(int j=i+1; i<list.size(); j++){
				if((list.get(i)).compareTo(list.get(j)) > 0){
					k = list.get(i);
					list.add(i, list.get(j));
					list.add(j, k);
				}
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(50);
		al.add(90);
		al.add(10);
		al.add(60);
		al.add(70);
		al.add(4);
		al.add(49);
		al.add(100);
		
		sort(al);
	}
}