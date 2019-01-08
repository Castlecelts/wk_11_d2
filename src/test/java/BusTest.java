import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusTest {

	private Bus bus;

	@Before
	public void setUp() {
		bus = new Bus(50, "Brighton");
	}

	@Test
	public void busHasCapacity() {
		assertEquals(50, bus.getCapacity());
	}

	@Test
	public void busHasDestination() {
		assertEquals("Brighton", bus.getDestination());
	}




}
