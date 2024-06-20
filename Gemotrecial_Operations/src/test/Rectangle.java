package test;

public class Rectangle extends GemotericalShape{
	private double width;
	private double length;
	
	public Rectangle() {
		this.width=10;
		this.length=10;
		this.shapeType="Rectangle";
		
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	 public double computeArea(double width,double length) {
		 
		 this.length=length;
		 this.width=width;
		 this.area=length*width;
		 return this.area;
	 }
	 @Override
	 public void show() {
		 System.out.println("length = "+this.length);
		 System.out.println("width = "+this.width);
		 System.out.println("length = "+this.area);
			
		}

}
