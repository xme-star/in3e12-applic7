import java.awt.*;

public class Ex2_EssaiBorderLayout extends Frame{
	private Button b1,b2,b3,b4,b5;

	public Ex2_EssaiBorderLayout(String s){
		super(s);
		setLayout(new BorderLayout());
		b1=new Button("Nord");
		b2=new Button("Sud");
		b3=new Button("Est");
		b4=new Button("Ouest");
		b5=new Button("Centre");
		this.add(b1,BorderLayout.NORTH);
		this.add(b2,BorderLayout.SOUTH);
		this.add(b3,BorderLayout.EAST);
		this.add(b4,BorderLayout.WEST);
		this.add(b5,BorderLayout.CENTER);
	}

	public static void main(String args[]){
		Ex2_EssaiBorderLayout essai=new Ex2_EssaiBorderLayout("Mon Essai BorderLayout");
		essai.pack();
		essai.setVisible(true);
	}
}