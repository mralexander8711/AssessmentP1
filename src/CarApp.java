import java.util.Arrays;
import java.util.List;

public class CarApp {

public static void main(String[] args) {
	
carMakeList();
    
    
	
}

private static void carMakeList() {
	Car makes= new Car("Ford", "Chevy") {};
	
	List<Car> list1 =Arrays.asList(makes);
	System.out.println(list1);
	
	System.out.println();
}
}


