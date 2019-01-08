import java.util.ArrayList;

public class BusStop {

	private String name;
	private ArrayList<Person> queue;

	public BusStop(String name) {
		queue = new ArrayList<>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Person> getQueue() {
		return queue;
	}

	public void setQueue(ArrayList<Person> queue) {
		this.queue = queue;
	}

	public void addPerson(Person person) {
		this.queue.add(person);
	}

	public Person removePersonFromQueue() {
		return this.queue.remove(0);
	}
}
