package Default;

enum week
{
	SUN,MON,TUE,WED,THU,FRI,SAT;
}
public class EnumEx2 {

	public static void main(String[] args) {
		
		week w1 = week.SUN;
		System.out.println(w1);
		
		int indax=week.MON.ordinal();
		System.out.println(indax);

		week[] arr = week.values();
		for(week w2:arr) {
			System.out.println(w2);
		}
	}

}
