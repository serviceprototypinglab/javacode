import java.util.ArrayList;

class TransportStatistics
{
	private ArrayList<String> companies;
	private int entries;

	public TransportStatistics()
	{
		this.companies = new ArrayList<String>();
	}

	public boolean setCompanies(ArrayList<String> companies)
	{
		this.companies = companies;
		return true;
	}

	public boolean setEntries(int entries)
	{
		if(entries < 0)
			return false;
		this.entries = entries;
		return true;
	}

	public ArrayList<String> getCompanies()
	{
		return this.companies;
	}

	public int getEntries()
	{
		return this.entries;
	}
}
