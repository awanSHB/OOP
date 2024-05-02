public class GenericsB{
	public static void main(String args[]){
		Integer a[] = {1, 5, 2, 4, 3};
		sort(a);
		for(Integer k:a)
			System.out.println(k.toString());
		String s[] = {"Muzzaffar", "Iqbal", "Farooq", "Ali", "Zia"};
		sort(s);
		for(String st:s)
			System.out.println(st.toString());
	}
	
	public static <T extends Comparable<T>> void sort(T[] arr){
		T temp;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				int n = arr[i].compareTo(arr[j]);
				if(n>0){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					// System.out.println("h");
				}
			}
		}
	}
}