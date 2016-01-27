import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MonAction implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Une action à eu lieu");
	}
}

public class Ex4_TestBouton{
	public Ex4_TestBouton(){
		Frame f=new Frame("TestBouton");
		Button b=new Button("Cliquer ici");
		f.add(b);
		f.pack();
		f.setVisible(true);
		b.addActionListener(new MonAction());
	}
	
	public static void main(String[] args){
		Ex4_TestBouton test=new Ex4_TestBouton();
	}
}