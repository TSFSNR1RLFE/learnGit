package circle;
/*
 * ����һ��Բ��Area
 * ����������Բ�İ뾶��������Բ��������ΪԲ��ĳ�Ա����
 * ������Ϊʹ��Բ�๦�ܵ�ʹ�����ṩ��Բ��������ܳ���ͬʱ���Զ԰뾶ֵ�����޸�
 * ���Է����У�����������ܳ���getXX()��setXX()
 */
public class Area {
	private float r;	//�뾶
	
	Area(){
		r = 1;
	}
	
	Area(float r){
		this.r = r;
		
	}
	
	//�޸İ뾶��ֵ
	public void setR(float r) {
		this.r = r;
	}
	
	public float getR() {
		return r;
	}
	
	//����Բ�����
	public double area() {
		return r * r * 3.14;
	}
	
	//����Բ���ܳ�
	public double perimeter() {
		return 2 * r * 3.14;
	}
	
}
