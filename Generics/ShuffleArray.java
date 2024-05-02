import java.util.*;
public class ShuffleArray{
	public static <E> void shufflelist(ArrayList<E> list){
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		shufflelist(al);
	}
}