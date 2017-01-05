interface Plugin
{
	public String name();
	public String description();
	public String process(String image);
}

class LowerCase implements Plugin
{
	public LowerCase()
	{
	}

	public String name()
	{
		return "lowercase";
	}

	public String description()
	{
		return "Changes all characters to lowercase.";
	}

	public String process(String image)
	{
		return image.toLowerCase();
	}
}
