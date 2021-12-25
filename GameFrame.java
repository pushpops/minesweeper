//task
//gameClear 条件
//タイムアップ　条件
//0　探索条件

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
 public class GameFrame extends JFrame implements ActionListener{
    int dif;
    Masu [][] masu;
    MyTimer timer;
    Ban ban;
    int count=0;
    GameFrame(int difficulty){
      dif = difficulty;
    }

    void mainframe(int dif){

      setTitle("MineSweeper");
      setSize(500,600);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      timer = new MyTimer(3, this);
      JPanel p = new JPanel();
      add(p, BorderLayout.CENTER);
      GridLayout layout = new GridLayout(dif, dif);
      layout.setHgap(0);
      layout.setVgap(0);
      p.setLayout(layout);
      ban = new Ban(dif);
      ban.print();
      masu = new Masu[dif][dif]; 
      for(int i=0; i < dif; i++){
        for (int j=0; j< dif ;j++){
          masu[i][j] = new Masu(this,ban,dif);
          masu[i][j].i = i;
          masu[i][j].j = j;
          p.add(masu[i][j].button);
          masu[i][j].button.addActionListener(this);
        }
      }
      getContentPane().add(p, BorderLayout.CENTER);  
      setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
      for(int i=0; i < dif; i++){
        for (int j=0; j< dif ;j++){
          if(masu[i][j].open==true){
            count += 1;
          }
          if(masu[i][j].open==true && ban.ban[i][j]==0){
            // Opener opener = new Opener(masu,i,j,dif);
          }
          if(count == dif*dif-ban.numOfBomb()){
            GameClear gc = new GameClear();
            break;
          }
          if(masu[i][j].signal==true){
            GameOver go = new GameOver(this);
            for(int l=0; l < dif; l++){
              for (int m=0; m< dif ;m++){
                 masu[l][m].signal=true;
              } 
            }   
          }
      }
    }
  } 

  private static void main(String[] args){
    int dif = 5;
    new GameFrame(dif);
  }
  
}

