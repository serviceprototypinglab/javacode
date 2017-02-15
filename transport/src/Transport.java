import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.io.FileOutputStream;
import java.net.URL;

class Transport
{
	private TransportStatistics stats;

	private Transport()
	{
		this.parse();
		if(this.stats != null)
			new TransportAnalysis().analyse(this.stats);
	}

	private void parse()
	{
		String filename = "2017-02-14istdaten.csv";
		String fileurl = "https://opentransportdata.swiss/dataset/0edc74a3-ad4d-486e-8657-f8f3b34a0979/resource/32148695-0680-4a8b-8509-ecaff6b1a73f/download/2017-02-14istdaten.csv";

		System.out.println("Preparing data...");

		try
		{
			this.prepare(fileurl, filename);
		}
		catch(Exception e)
		{
			System.err.println("Could not download'" + fileurl + "': " + e.toString());
		}

		System.out.println("Parsing data...");

		try
		{
			this.stats = new TransportAnalysis().read(filename);
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

	public final static void main(String[] args)
	{
		Transport t = new Transport();
	}
}
