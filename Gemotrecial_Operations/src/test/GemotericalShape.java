package test;

public class GemotericalShape {
	 String shapeType;
	
	double area;
	 public GemotericalShape() {
		 this.shapeType="default";
		 this.area=0.0;
	 }
	 public double computeArea(double v1,double v2) {
		
		 return area;
	 }
	 
	public void show() {
			System.out.println("shapetype = "+this.shapeType);
			System.out.println("area = "+this.area);
		}
	 

}
