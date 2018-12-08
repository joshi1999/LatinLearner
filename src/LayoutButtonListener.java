import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutButtonListener implements ActionListener
{
	public Frame f;
	public LayoutButtonListener(Frame i)
	{
		f = i;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == f.nomen)
		{
			f.toggleFaceMenu(false);
			f.toggleFaceNomen(true);
		}
		else if(e.getSource() == f.verben)
		{
			f.toggleFaceMenu(false);
			f.toggleFaceVerben(true);
		}
		else if(e.getSource() == f.adjective)
		{
			f.toggleFaceMenu(false);
			f.toggleFaceAdjective(true);
		}
		else if(e.getSource() == f.back)
		{
			f.toggleFaceNomen(false);
			f.toggleFaceVerben(false);
			f.toggleFaceAdjective(false);
			f.toggleFaceMenu(true);
		}
	}
}
