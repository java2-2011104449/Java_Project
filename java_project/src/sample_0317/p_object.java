package sample_0317;

public class p_object {
        int o_x, o_y;
        
        public p_object(){o_x = 0; o_y = 01;}
        
        
        public p_object(int o_x, int o_y){
       	 super();
       	 this.o_x = o_x;
       	 this.o_y = o_y;
        }
        
        
        public void pr(){System.out.println("o_x"+ "=" + o_x + "o_y"+ "=" + o_y);}
        public void change(int x, int y){this.o_x =x; this.o_y = y;}
}
