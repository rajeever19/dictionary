import java.awt.*;  
import java.awt.event.*;  
class KeyListenerExample extends Frame implements KeyListener,MouseListener{  
    Label l,l2,l3,l4,l5,l6;  
    TextArea area;  
    KeyListenerExample(){  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
        l2=new Label();

        l2.setBounds(340,80,100,40);
        l3=new Label();
        l3.setBounds(340,120,100,40);
        add(l3);  
        add(l2);
        add(l);add(area);  
        setSize(600,400);  
        setLayout(null);  
        setVisible(true);
        addMouseListener(this);

    }  
    public void keyPressed(KeyEvent e) {
    //if(e.getSource()==area)  
        l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) {  
        String text=area.getText();
          Dog tuffy = new Dog(text, 5, "white");

        l2.setText(tuffy.getColor());  
        l3.setText(tuffy.getBreed());
    }  
   public void keyTyped(KeyEvent f) { 
    String text=area.getText();   
    if(f.getSource()==area)
    {
        l.setText("keyTyped");
    }
        //l2.setText(text);  
    } 
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }   
  
    public static void main(String[] args) {  
        new KeyListenerExample();
  
    }  
    void getdata(String t)
    {

    }
}  