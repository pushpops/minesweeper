import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Masu extends JFrame implements MouseListener{
	int i;
	int j;
	GameFrame frame;
	Ban ban;
	JButton button;
	int dif;
	ImageIcon icon;
	ImageIcon ficon;
	ImageIcon bicon;
	boolean flag = false;
	boolean signal = false;//trueならゲームオーバー
	boolean open = false;

	Masu(GameFrame frame, Ban ban, int dif){
		this.frame = frame;
		this.ban = ban;		
		this.dif = dif;
	
	    if(dif==10){
	        bicon = new ImageIcon("./img/bomb50.PNG");
			ficon = new ImageIcon("./img/flag50.PNG");
			icon = new ImageIcon("./img/block50.PNG");
		}else if (dif==20){
			bicon = new ImageIcon("./img/bomb25.PNG");
			ficon = new ImageIcon("./img/flag25.PNG");
			icon = new ImageIcon("./img/block25.PNG");
		}else if (dif==30){
			bicon = new ImageIcon("./img/bomb15.PNG");
			ficon = new ImageIcon("./img/flag15.PNG");
			icon = new ImageIcon("./img/block15.PNG");
		}
		button = new JButton(icon);
	    button.addMouseListener(this);
	}

    public void mouseReleased(MouseEvent e){
  		
	}

    public void mousePressed(MouseEvent e){
    	if(javax.swing.SwingUtilities.isRightMouseButton(e)){
    		// 右クリック時の処理
    		if(signal == true){
    			;
        	}else if(flag==false){
          		button.setIcon(ficon);
         		flag=true;
        	}else if (flag==true){
          		button.setIcon(icon);
                flag=false;
        	}
  		} else if(javax.swing.SwingUtilities.isMiddleMouseButton(e)){
    		// 中ボタンクリック時の処理
  		} else if(javax.swing.SwingUtilities.isLeftMouseButton(e)){
  			//　左ボタンクリック時の処理
  			if(signal==true){
  				;
  			}else if (ban.ban[i][j]==9){
	    		button.setIcon(bicon);
	    		open = true;
	    		signal = true;
	    	} else if (ban.ban[i][j]==0){
	    		button.setIcon(null);
	    		open = true;
	    		button.setForeground(Color.WHITE);
	    	} else if (ban.ban[i][j]==1){
	    		button.setIcon(null);
	    		open = true;
	    		button.setForeground(Color.BLUE);
	    		button.setText(Integer.toString(ban.ban[i][j]));
	    	} else if (ban.ban[i][j]==2){
	    		button.setIcon(null);
	    		open = true;
	    		button.setForeground(Color.GREEN);
	    		button.setText(Integer.toString(ban.ban[i][j]));
	    	} else if (ban.ban[i][j]>=2){
	    		button.setIcon(null);
	    		open = true;
	    		button.setForeground(Color.RED);
	    		button.setText(Integer.toString(ban.ban[i][j]));
	    	}
  		}

    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
} 

