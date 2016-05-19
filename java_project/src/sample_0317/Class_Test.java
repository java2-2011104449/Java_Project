package sample_0317;

public class Class_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		p_object[] pob = new p_object[3];
		pob[0] = new p_object();
		pob[1] = new c1();
		pob[2] = new c2();

		pr_all(pob[0]); pr_all(pob[1]); pr_all(pob[2]);
		
		pob[0].pr(); pob[1].pr(); pob[2].pr();
		
		/*for(p_object temp : po1){
			temp = new p_object();
			pr_all(temp);
			change_all(temp, 7, 77);
			pr_all(temp);
		}*/
		

	}
	
	public static void pr_all(p_object temp) { temp.pr(); }
	public static void change_all(p_object temp, int x, int y){
		temp.change(x,y);
	}

}
