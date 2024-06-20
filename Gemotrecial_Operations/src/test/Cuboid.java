package test;

public class Cuboid extends Rectangle {
	private double height;
	public Cuboid() {
		this.height=15;
		this.shapeType="cuboid";
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double computearea(double width,double length,double height) {
		super.computeArea(width, length);
		this.height=height;
		this.area=super.area*height;
		return this.area;
	}
	public void show() {
		System.out.println("length = "+this.getLength());
		System.out.println("width = "+this.getWidth());
		System.out.println("shapetype = "+this.shapeType);
		System.out.println("area = "+this.area);
	}

	 
	

}
