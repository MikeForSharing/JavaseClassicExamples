package clone.deepClone;

import java.io.Serializable;

public class Address implements Serializable {
	private String country;
	private String city;
	private String district;
	
	public Address(String country, String city, String district) {
		this.country = country;
		this.city = city;
		this.district = district;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("国家是：" + country);
		sb.append("城市是：" + city);
		sb.append("县是：" + district);
		return sb.toString();
	}

	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	
	
}
