import java.util.*;
class FindMax{
	public static <E extends Comparable<E>> E max(E[] list){
		E maximum = list[0];
		for(int i=0; i<list.length; i++){
			if(list[i].compareTo(maximum)>0)
				maximum = list[i];
		}
		return maximum;
	}
	
	public static void main(String args[]){
		Integer[] arr = {10, 14, 12, 99, 90, 13, 61, 88, 1, 2};
		System.out.println("The largest Element is : "+max(arr));
	}
}