import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusStopTest {

	private BusStop stop;

	@Before
	public void setUp() {
		stop = new BusStop("My Stop");
	}

	@Test
	public void busStopHasName() {
		assertEquals("My Stop", stop.getName());
	}

	@Test
	public void queueIsEmpty() {
		assertEquals(0,stop.getQueue().size());
	}

}
