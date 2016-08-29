package clone;

public class Address {
	private String country;
	private String provience;
	private String city;
	
	public Address(String country, String provience, String city) {
		this.country = country;
		this.provience = provience;
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvience() {
		return provience;
	}
	public void setProvience(String provience) {
		this.provience = provience;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("���ң�" + country);
		sb.append("ʡ��" + provience);
		sb.append("�У�" + city);
		return sb.toString();
	}
	
}
