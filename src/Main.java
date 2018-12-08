
public class Main 
{
	static Frame frame;
	public static void main(String[] args)
	{
		frame = new Frame();
		System.out.println(frame.vp.Nomen.size());
		for(Nomen noun : frame.vp.Nomen)
		{
			System.err.println(noun.NomSg);
		}
	}
}
