import java.awt.Button;
import java.awt.Frame;

public class Ex1_EssaiFenetre{
	public static void main(String[] args){
		Frame f=new Frame("Ma première fenêtre");
		Button b=new Button("coucou");
		f.add(b);
		f.pack();
		f.setVisible(true);
	}
}