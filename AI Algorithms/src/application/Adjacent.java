package application;


public class Adjacent{
	private City city;
	private double Distance;

	public Adjacent(City city, double distance) {
		this.setCity(city);
		this.Distance = distance;
		
	}

	public double getCarDistance() {
		return Distance;
	}

	public void setCarDistance(double distance) {
		this.Distance = distance;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}


}
