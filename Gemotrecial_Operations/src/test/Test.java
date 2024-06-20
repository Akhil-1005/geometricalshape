package test;

public class Test {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
        r.computeArea(r.getWidth(), r.getLength());
		r.show();
		
		Cuboid c=new Cuboid();
		c.computearea(10, 10, 10);
		c.show();
	}

}
