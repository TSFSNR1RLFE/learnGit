package circle;
/*
 * 定义一个圆类Area
 * 分析：由于圆的半径用于区分圆，所以作为圆类的成员变量
 * 方法：为使用圆类功能的使用者提供算圆的面积、周长，同时可以对半径值进行修改
 * 所以方法有：求面积、求周长、getXX()、setXX()
 */
public class Area {
	private float r;	//半径
	
	Area(){
		r = 1;
	}
	
	Area(float r){
		this.r = r;
		
	}
	
	//修改半径的值
	public void setR(float r) {
		this.r = r;
	}
	
	public float getR() {
		return r;
	}
	
	//计算圆的面积
	public double area() {
		return r * r * 3.14;
	}
	
	//计算圆的周长
	public double perimeter() {
		return 2 * r * 3.14;
	}
	
}
