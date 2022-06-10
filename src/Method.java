
public class Method {
public int a=10,num;
public int performLeftShift()
{
	int num=a<<1;//integers are stored in binary format hence 10 will be 1010 
	//and left shift by 1 will give 20 integer value
	return num;
}
public int performRightShift(int val)
{ 
  
	int output=val>>2;//here 45 is converted to binary
	// value is given as 101101 right shift will give 1011 which amounts to 11
	return output;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method obj=new Method();
System.out.println(obj.performLeftShift());
System.out.println(obj.performRightShift(45));
	}

}
