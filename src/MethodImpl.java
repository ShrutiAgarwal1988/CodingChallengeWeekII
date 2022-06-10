
public class MethodImpl {
	 public int a;
	 public String name=null;
public void method1() {
	System.out.println("method without return type");
}
public void method1(int a)
{ this.a=a;
	System.out.println("method with argument"+a);
}
public String method2()
{ 
System.out.println("method with no arguments having return type string");	
return name;
}

public String method2(String name)
{
this.name=name;	
return name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodImpl obj=new MethodImpl();
obj.method1();
obj.method1(5);
System.out.println(obj.method2());
System.out.println("method with argument string"+obj.method2("shruti"));
	}

}
