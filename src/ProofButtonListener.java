import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProofButtonListener implements ActionListener
{
	Frame f;
	public ProofButtonListener(Frame i)
	{
		f = i;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == f.proof)
		{
			if(f.mode == "nomen")
			{
				
			}
		}
	}
	
}
