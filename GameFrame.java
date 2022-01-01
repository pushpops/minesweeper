import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class GameFrame extends JFrame{
    int dif;
    Masu [][] masu;
    MyTimer timer;
    Ban ban;
    int count=0;
    Point point = new Point(0,0);
    int i=0;
    int j=0;
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    Container contentPane;
    GameFrame(int difficulty){
      dif = difficulty;
    }

    void mainframe(int dif){
      setTitle("MineSweeper");
      setSize(500,600);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(p, BorderLayout.CENTER);
      add(p2,BorderLayout.NORTH);
      GridLayout layout = new GridLayout(dif, dif);
      layout.setHgap(0);
      layout.setVgap(0);
      p.setLayout(layout);
      p2.setLayout(new BorderLayout());
      ban = new Ban(dif);
      // ban.print();
      masu = new Masu[dif][dif]; 
      for(int i=0; i < dif; i++){
        for (int j=0; j< dif ;j++){
          masu[i][j] = new Masu(this,ban,dif,i,j);
          p.add(masu[i][j].button);
        }
      }
      Container contentPane = getContentPane();
      contentPane.add(p, BorderLayout.CENTER);  
      timer = new MyTimer(dif/2, this);
      setVisible(true);
  }

  private static void main(String[] args){
    int dif = 5;
    new GameFrame(dif);
  }

}

