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

	@Test
	public void canAddPersonToQueue() {
		stop.addPerson(new Person());
		stop.addPerson(new Person());
		assertEquals(2,stop.getQueue().size());
	}

	@Test
	public void canRemovePersonFromQueue() {
		Person firstInLine = new Person();
		Person secondInLine = new Person();
		stop.addPerson(firstInLine);
		stop.addPerson(secondInLine);
		assertEquals(2,stop.getQueue().size());
		Person removed = stop.removePersonFromQueue();
		assertEquals(1,stop.getQueue().size());
		assertEquals(removed, firstInLine);
	}


}
