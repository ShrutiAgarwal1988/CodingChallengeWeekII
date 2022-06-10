
public class Encapsulation {
private String country="India";
private String touristspot="Nainital";
private String nationalAnthem="Jana Gana Mana";
public String getCountry()
{
	
	return country;
}
public void setCountry(String country)// error
{
	this.country=country;
}
public String getTouristspot()
{
	
	 return touristspot;
	
}
public void setTouristSpot(String touristspot)//error
{
	this.touristspot=touristspot;
}
public String getnationalAnthem()
{
	
	return nationalAnthem;
	
}
public void setnationalAnthem(String nationalAnthem)
{
	this.nationalAnthem=nationalAnthem;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulation encap=new Encapsulation();
System.out.println("country is:"+encap.country);
System.out.println("tourist spot is:"+encap.touristspot);
System.out.println("nationalAnthem:"+encap.nationalAnthem);
encap.setCountry("New Zealand");
encap.setTouristSpot("wellington");
encap.setnationalAnthem("God Defend New Zealand and God Save The Queen.");//error
System.out.println("country is:"+encap.country);
System.out.println("tourist spot is:"+encap.touristspot);
System.out.println("nationalAnthem:"+encap.nationalAnthem);



	}

}
