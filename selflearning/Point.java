package selflearning;

public class Point
{
	private int x;
	private int y;
	
public Point (int x,int y)
{
	this.x=x;
	this.y=y;	
}
public Point ()
{}
public double distance(Point p2)
{                                  
	double d=Math.sqrt(Math.pow((this.x-p2.x),2)+Math.pow((this.y-p2.y),2));
	return d;	 
}
public static void main(String[] args) {
	Point p1=new Point(3,8);
	Point p2=new Point(12,24);
	double distance=p2.distance(p1);
	System.out.print("distance"+distance);
}
}
