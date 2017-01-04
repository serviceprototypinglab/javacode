import com.csvreader.CsvReader;
import java.nio.charset.Charset;

class TransportAnalysis
{
	public TransportAnalysis()
	{
	}

	public TransportStatistics read(String filename) throws Exception
	{
		TransportStatistics stats = new TransportStatistics();

		CsvReader r = new CsvReader(filename, ';', Charset.forName("UTF-8"));
		if(!r.readHeaders())
		{
			throw new Exception("Invalid CSV formatting.");
		}
		while(r.readRecord())
		{
			String company = r.get("BETREIBER_ABK");
			if(!stats.getCompanies().contains(company))
			{
				stats.getCompanies().add(company);
				System.out.println(company);
			}
			stats.setEntries(stats.getEntries() + 1);
		}
		r.close();

		return stats;
	}

	public void analyse(TransportStatistics stats)
	{
		System.out.println("The total number of connections is " + new Integer(stats.getEntries()));
		System.out.println("There are " + new Integer(stats.getCompanies().size()) + " companies involved.");
	}
}
