import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusTest {

	private Bus bus;
	private Person person;
	private BusStop stop;

	@Before
	public void setUp() {
		stop = new BusStop("My Stop");
		bus = new Bus(50, "Brighton");
		person = new Person();
	}

	@Test
	public void busHasCapacity() {
		assertEquals(50, bus.getCapacity());
	}

	@Test
	public void busHasDestination() {
		assertEquals("Brighton", bus.getDestination());
	}

	@Test
	public void busHasPassengersList() {
		assertEquals(0,bus.getPassengerCount());
	}

	@Test
	public void busCanAddAPassengerTrue(){
		bus.addPassenger(person);
		assertEquals(1, bus.getPassengerCount());
	}

	@Test
	public void busCanAddAPassengerFalse(){
		for (int i = 0; i < bus.getCapacity(); i++) {
			bus.addPassenger(person);
		}
		bus.addPassenger(person);
		assertEquals(bus.getCapacity(), bus.getPassengerCount());
	}

	@Test
	public void busCanRemoveAPassenger(){
		bus.addPassenger(person);
		bus.addPassenger(person);
		bus.removePassenger();
		assertEquals(1, bus.getPassengerCount());
	}

	@Test
	public void busCanAddPassengerFromStop() {
		bus.addPassenger(new Person());
		bus.addPassenger(new Person());
		stop.addPerson(new Person());
		bus.pickUpPassenger(stop);
		assertEquals(3,bus.getPassengerCount());
		assertEquals(0,stop.getQueue().size());
	}


}
