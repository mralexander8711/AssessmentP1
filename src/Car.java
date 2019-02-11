
public class Car {

public String vin;
public String make;


public Car() {}

public Car(String vin, String make) {
	this.make = make;
	this.vin = vin;
}

public String getVin() {
	return vin;
}
public void setVin(String vin) {
	this.vin = vin;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}

public String toString() {
	return "Car [vin=" + vin + ", make=" + make + "]";
}


	// TODO Auto-generated method stub
	
}


}
