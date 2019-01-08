import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Queue;

public class Bus {

	private Integer capacity;
	private String destination;
	private ArrayList<Person> passengers;

	public Bus(Integer busCapacity, String busDestination) {
		this.capacity = busCapacity;
		this.destination = busDestination;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getDestination() {
		return destination;
	}
}
