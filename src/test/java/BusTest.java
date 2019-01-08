import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusTest {

	private Bus bus;
	private Person person;

	@Before
	public void setUp() {
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




}
