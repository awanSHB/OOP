import java.util.*;
class Search{
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
		for(int i=0; i<list.length; i++){
			if((list[i]).compareTo(key)==0)
				return i;
		}
		return -1;
	}
	
	public static void main(String args[]){
		Integer[] ml = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println(linearSearch(ml, 30));
	}
}