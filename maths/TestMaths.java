import wizardmath.MathWizard;

import org.testng.annotations.*;

public class TestMaths
{
	@Test(groups = {"default"})
	public void simpleTest()
	{
		MathWizard mw = new MathWizard();
		assert mw.sum(1, 1) == 2;
	}

	@Test(groups = {"default"})
	public void complexTest()
	{
		MathWizard mw = new MathWizard();
		assert mw.sum(mw.sum(1, 1), mw.sum(2, 2)) == 6;
	}
}
