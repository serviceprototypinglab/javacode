import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TransportTest
{
	@Test
	public void testEverything()
	{
		int x = 1;
		int y = 1;
		assertEquals(x, y);
	}

	public final static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(TransportTest.class);
		for (Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
