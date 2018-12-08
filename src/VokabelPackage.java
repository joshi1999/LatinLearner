import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class VokabelPackage 
{
	ArrayList<Nomen> Nomen;
	//ArrayList<Verb> Verben = new ArrayList<>();
	//ArrayList<Adjective> Adjective = new ArrayList<>();
	
	public VokabelPackage()
	{
		Nomen = new ArrayList<>();
		getNomen();
		
	}
	
	public void getNomen()
	{
		String levelFile = "src/wordlists/nomen.csv";
		String line = "";
		String csvSplitBy = ",";
		
		try(BufferedReader br = new BufferedReader(new FileReader(levelFile)))
		{
			while((line = br.readLine()) != null)
			{
				String[] wordCats = line.split(csvSplitBy);
				Nomen.add(new Nomen(wordCats));
			}
		}
		catch(IOException e)
		{
			System.err.println("Couldn't load wordlists. Please inform the developer!");
		}
	}
}
