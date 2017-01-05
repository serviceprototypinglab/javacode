import java.util.Random;

interface Plugin
{
	public String name();
	public String description();
	public String process(String image);
}

class RandomDistortion implements Plugin
{
	public RandomDistortion()
	{
	}

	public String name()
	{
		return "random";
	}

	public String description()
	{
		return "Random distortions.";
	}

	public String process(String image)
	{
		String ret = image;
		Random rand = new Random();
		for(int i = 0; i < 3; i++)
		{
			int pos = rand.nextInt(image.length()) + 1;
			ret = ret.substring(0, pos) + "X" + ret.substring(pos);
		}
		return ret;
	}
}
