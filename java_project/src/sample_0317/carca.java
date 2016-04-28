package sample_0317;

public class carca {
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int numbers = 0;
	
	public carca(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers;
	}

}
