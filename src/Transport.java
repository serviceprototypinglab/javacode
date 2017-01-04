import com.csvreader.CsvReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;

class Transport
{
	private ArrayList<String> companies;
	private int entries;

	private Transport()
	{
		System.out.println("Parsing data...");

		this.parse();
		this.analyse();
	}

	private void parse()
	{
		String filename = "2016-12-30istdaten.csv";
		String fileurl = "https://opentransportdata.swiss/dataset/0edc74a3-ad4d-486e-8657-f8f3b34a0979/resource/3724e714-5480-46e2-be49-4892078b71b5/download/2016-12-30istdaten.csv";

		try
		{
			this.prepare(fileurl, filename);
		}
		catch(Exception e)
		{
			System.err.println("Could not download'" + fileurl + "': " + e.toString());
		}

		this.companies = new ArrayList<String>();

		try
		{
			this.read(filename);
		}
		catch(Exception e)
		{
			System.err.println("Could not open '" + filename + "': " + e.toString());
		}
	}

	private void prepare(String fileurl, String filename) throws Exception
	{
		if(Files.notExists(Paths.get(filename)))
		{
			System.out.println("Downloading data: " + fileurl);

			URL resource = new URL(fileurl);
			ReadableByteChannel rbc = Channels.newChannel(resource.openStream());
			FileOutputStream fos = new FileOutputStream(filename);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		}
		else
		{
			System.out.println("Using cached data: " + filename);
		}
	}

	private void read(String filename) throws Exception
	{
		CsvReader r = new CsvReader(filename, ';', Charset.forName("UTF-8"));
		if(!r.readHeaders())
		{
			throw new Exception("Invalid CSV formatting.");
		}
		while(r.readRecord())
		{
			String company = r.get("BETREIBER_ABK");
			if(!this.companies.contains(company))
			{
				this.companies.add(company);
				System.out.println(company);
			}
			this.entries += 1;
		}
		r.close();
	}

	public void analyse()
	{
		System.out.println("The total number of connections is " + new Integer(this.entries));
		System.out.println("There are " + new Integer(this.companies.size()) + " companies involved.");
	}

	public final static void main(String[] args)
	{
		Transport t = new Transport();
	}
}
