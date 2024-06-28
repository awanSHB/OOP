
public class Marks {
	public int oops;
	public int dsa;
	public int pf;
	
	public Marks() {
		oops = 85;
		dsa = 80;
		pf = 21;
	}
	
	public Marks(int o, int d, int p) {
		oops = o;
		dsa = d;
		pf = p;
	}
	public int calculatesum(int o, int d, int p) {
		System.out.println("The marks are :\nOOPS : "+o+"\nDSA : "+d+"\nPF : "+p);
		System.out.println("The sum of marks is : ");
		return (oops+dsa+pf);
	}
}
