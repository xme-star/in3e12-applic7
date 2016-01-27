import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex5_EssaiActionEvent extends Frame implements ActionListener{
	public static void main(String[] args){
		Ex5_EssaiActionEvent f=new Ex5_EssaiActionEvent();
	}

	public Ex5_EssaiActionEvent(){
		super("Utilisation d'un ActionEvent");
		Button b=new Button("action");
		b.addActionListener(this);
		add(BorderLayout.CENTER,b);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		setTitle("bouton cliqué !");
	}
}