import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class userlogin extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p;
	userlogin()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		setVisible(true);
		setLayout(null);
		b1=new JButton("login");
		b1.setBounds(100,170,80,30);
		b1.addActionListener(this);
		b2=new JButton("Back");
		b2.setBounds(500,30,80,30);
		b2.addActionListener(this);
		
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		l1.setBounds(50,80,80,30);
		l2.setBounds(50,140,80,30);
		t1=new JTextField();
		p=new JPasswordField();
		t1.setBounds(150,80,100,30);
		p.setBounds(150,140,100,30);
		add(b1);add(l1);add(l2);add(t1);
		add(p);add(b2);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1);
		{

		}
		if(e.getSource()==b2)
		{
			KeyListenerExample.main(new String[]{});
                dispose();
		}
	}
	public static void main(String[] args) {
		new userlogin();
	}
}


