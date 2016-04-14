package sample_0317;

public class car {
	
	private int man;
	private int tire;
	private String color;
	
	public void setman(int man){
		this.man = man;
	}
	public int getman(){
	System.out.println(this.man);
	return man;
	}
	
	public car(){
		
	}
	
	void pr(){
		System.out.println("man : " +man +" tire : " +tire +" color : " +color);
	}

}
