
public class EncapsulationImpl {
private	int age;
private boolean bool;
public int getmethod1() // getter method for age
{
return age;	

}
public void setmethod1(int age)//setter method for age
{
	this.age=age;
	
}
public boolean getmethod2()//getter message for decision
{
	return bool;
}
public void setmethod2(boolean result)//setter method for decision
{
	this.bool=result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EncapsulationImpl obj=new EncapsulationImpl();
obj.setmethod1(70);

if(obj.getmethod1()<=60)
{
	obj.setmethod2(true);
}
else {
	obj.setmethod2(false);
}


System.out.println("the age of the candidate is"+obj.getmethod1());
System.out.println("Driving license can be issued to the candidate"+obj.getmethod2());
	}

}
