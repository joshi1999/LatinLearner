
public class Nomen 
{
	public String NomSg;
	public String GenSg;
	public String DatSg;
	public String AkkSg;
	public String AblSg;
	public String NomPl;
	public String GenPl;
	public String DatPl;
	public String AkkPl;
	public String AblPl;
	public String Genus;
	public String dekGruppe;
	
	public Nomen(String[] rawNomen)
	{
		NomSg = rawNomen[0];
		GenSg = rawNomen[1];
		DatSg = rawNomen[2];
		AkkSg = rawNomen[3];
		AblSg = rawNomen[4];
		NomPl = rawNomen[5];
		GenPl = rawNomen[6];
		DatPl = rawNomen[7];
		AkkPl = rawNomen[8];
		AblPl = rawNomen[9];
		Genus = rawNomen[10];
		dekGruppe = rawNomen[11];
	}
}
