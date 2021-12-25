import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Menu extends JFrame implements ActionListener{
	Menu(){	 
     
      setTitle("menu");
      setSize(300,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(3,1));
      JButton easy =new JButton("Easy");
      JButton normal =new JButton("Normal");
      JButton hard =new JButton("Hard");
      add(easy);
      add(normal);
      add(hard);
      setVisible(true);
      easy.addActionListener(this);
      normal.addActionListener(this);
      hard.addActionListener(this);
      
	}

	public void actionPerformed(ActionEvent e){
      JButton btn = (JButton) e.getSource();
      int dif;
      if (btn.getText()=="Easy"){
        dif = 10;
      } else if (btn.getText()=="Normal"){
        dif = 20;
      } else if (btn.getText()=="Hard"){
        dif = 30;
      } else {
      	dif = 0;
      }
      GameFrame frame = new GameFrame(dif);
      frame.mainframe(dif);    
    }

    public static void main(String[] args){
		new Menu();
	}
} 

