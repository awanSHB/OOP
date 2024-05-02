import java.util.*;

public class Elements{
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		
		for(int i=0; i<list.size()-1; i++){
			for(int j=i+1; j<list.size(); j++){
				if((list.get(i)).equals(list.get(j)))
					list.remove(j);
				
			}
		}
		return list;
	}
	
	public static void main(String args[]){
		ArrayList<Integer> mylist = new ArrayList<>();
		int[] A = {10, 11, 14, 11, 15, 14, 10, 19, 20};
		for(int k=0; k<A.length; k++)
			mylist.add(A[k]);
		System.out.println(removeDuplicates(mylist));
	}
}