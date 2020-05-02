import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;  
class KeyListenerExample extends JFrame implements KeyListener,ActionListener{  
    JLabel l,l2,l3,l4,l5,l6;  
    JTextField area;  
    JButton b1,b2;
    KeyListenerExample(){  
          
        l=new JLabel();  
        l.setBounds(20,50,100,20); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        area=new JTextField();  
        area.setBounds(20,100,300,35);  
        area.addKeyListener(this);  
        l2=new JLabel();

        l2.setBounds(340,80,100,40);
        l3=new JLabel();
        l3.setBounds(340,120,100,40);l4=new JLabel();
        l4.setBounds(340,160,100,40);
        b1=new JButton("user");
        b2=new JButton("admin");
        b1.setBounds(400,30,80,20);
        b2.setBounds(480,30,80,20);
        add(b1);
        add(b2);
        add(l3);  
        add(l2);
        add(l);add(l4);
        b1.addActionListener(this);
         b2.addActionListener(this);

        add(l);add(area);  
        setSize(600,400);  
        setLayout(null);  
        setVisible(true);
        

    }  
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            userlogin.main(new String[]{});
                dispose();

        }
        if (e.getSource()==b2) {
                    
        }

    }
    public void keyPressed(KeyEvent e) {
        
         // l4.setText(text);  

    //if(e.getSource()==area)  
       // l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) {  
     //   l.setText("keyReleased");
        if(e.getSource()!=area)
        {
            String text=area.getText();
          Dog tuffy = new Dog(text, 5, "white");
          l2.setText(tuffy.getColor());  
          l3.setText(tuffy.getBreed());
        }
        if(e.getSource()==area)
        {
            String text=area.getText();
          Dog tuffy = new Dog(text, 5, "white");
          l2.setText(tuffy.getColor());  
          l3.setText(tuffy.getBreed());
        }

         
        }  
   public void keyTyped(KeyEvent f) { 
     String text=area.getText();
  
        l.setText(text);

    } 
    
  
    public static void main(String[] args) {  
        new KeyListenerExample();
  
    }  
   
}  