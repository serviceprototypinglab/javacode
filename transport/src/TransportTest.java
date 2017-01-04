import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TransportTest
{
	@Test
	public void testStatistics()
	{
		int x = 42;
		TransportStatistics stats = new TransportStatistics();
		stats.setEntries(x);
		assertEquals(x, stats.getEntries());
	}

	@Test
	public void testAnalysis()
	{
		TransportAnalysis ta = new TransportAnalysis();
		TransportStatistics stats = null;
		try
		{
			stats = ta.read(null);
		}
		catch(Exception e)
		{
			System.out.println("(expected exception)");
		}
		assertNull(stats);
	}

	public final static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(TransportTest.class);
		for (Failure failure : result.getFailures())
		{
			System.out.println("FAIL: " + failure.toString());
		}
		System.out.println("SUCCESS: " + result.wasSuccessful());
	}
}
