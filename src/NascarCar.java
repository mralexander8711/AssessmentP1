
public class NascarCar  extends Car{
 
public String teamName;

public NascarCar() {}

public NascarCar(String vin, String make, String teamName) {
	super(vin,make);
	this.teamName =teamName;
}

public String getTeamName() {
	return teamName;
}

public void setTeamName(String teamName) {
	this.teamName = teamName;
}	
@Override
public String toString() {
	return "Car [vin=" + vin + ", make=" + make + ",Team Name=" + teamName + "]";
}
}
