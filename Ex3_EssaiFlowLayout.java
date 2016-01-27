import java.awt.*;
import javax.swing.*;

public class Ex3_EssaiFlowLayout extends JFrame{
	public Ex3_EssaiFlowLayout(){
		add(new JButton("Ok"));
		add(new JButton("Open"));
		add(new JButton("Close"));
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args){
		Ex3_EssaiFlowLayout t=new Ex3_EssaiFlowLayout();
	}
}