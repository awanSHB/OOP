
public class Time {
	public int hour;
	public int minute;
	public int second;
	
	public Time() {
		hour = 10;
		minute = 30;
		second = 40;
	}
	
	public Time(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
	public String check(int h, int m, int s) {
		if (h<0 || h > 12) {
			return "NOt valid!!!";
		}else if(m < 0 || m > 60) {
			return "Not valie!!!";
		}else if (s<0 || s>60) {
			return "Not valid!!!";
		}else {
			System.out.println("The time is >> "+h+" : "+m+" : "+s);
			return "BYE";
		}
	}
}
