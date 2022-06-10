
public class Polymorphism {
void findArea(int l,int b)
{
int area=l*b;
System.out.println("area of rectangle is"+area);
}
void findArea(int l,int b,int h) {
	int area=l*b*h;
	System.out.println("area of cuboid is"+area);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Polymorphism polymorphism=new Polymorphism();
           polymorphism.findArea(2,3);
           polymorphism.findArea(2,3,4);
	}

}
