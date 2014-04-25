package personal;
public class Address 

{
	int i;
	private String Flatno, Doorno;
	private String Street,Landmark,City,District,State,Country,Pincode;
	
	
	public Address()
	{
		Flatno ="no flat";
		Doorno = "no doorno";
		Pincode = "no pincode";
		Street = "no street";
		Landmark = "no landmark";
		City = "no city";
		District = "no district";
		State = "no state";
		Country = "no Country";
		
	}
	public Address(String flatno,String doorno,String pincode,String street,String landmark,String city,String district,
			String state,String country)
	{
		Flatno =flatno;
		Doorno = doorno;
		Pincode = pincode;
		Street = street;
		Landmark = landmark;
		City = city;
		District = district;
		State = state;
		Country = country;
	}
	public void setpincode(String pincode)
	{
		Pincode = pincode;
	}
	public void setcountry(String country)
	{
		Country = country;
	}
	public void getpincode()
	{
		System.out.println(Pincode);
	}
	public void getcountry()
	{
		System.out.println(Country);
	}
	public String getCity() {
		
		System.out.println(City);
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public void setFlat(String flat)
	{
		Flatno = flat;
	}
	public void getflat()
	{
		System.out.println(Flatno);
	}
	public void printadd()
	{
		System.out.println("Flatno: " + Flatno);
		System.out.println("Doorno: " + Doorno);
		System.out.println("picode: " + Pincode);
		System.out.println("Street: " + Street);
		System.out.println("Landmark: " + Landmark);
		System.out.println("City: " + City);
		System.out.println("District" + District);
		System.out.println("State: " + State);
		System.out.println("Country: " + Country);
		
	}
	public void printgoastate()
	{
		if(State=="goa")
			printadd();
	}
	public void checkpin()
	{
		if(Pincode.length() == 6)
		{
			for(i=0;i<6;i++)
				{
					if((Pincode.charAt(i)>57 || Pincode.charAt(i)<47)&& (Pincode.charAt(i) !=32))
					{
					System.out.println("invalid pincode");
					}
				} 
		}
		else
			System.out.println("invalid pincode");	
		
	
	}
	

}
