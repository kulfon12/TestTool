
public class LuckyStars {

	public static void main(String[] args) {
		String[] stars= {
				"Robert R" , "MM",
				"BK", "L",
				"HC", "T"
		};
		
		System.out.println("Your lucky star for today is " + stars[(int)(stars.length*Math.random())]);
	}

}
