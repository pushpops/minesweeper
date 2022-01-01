import javax.swing.*;
import javax.swing.SwingConstants;
import java.awt.*;

public class GameOver extends JFrame{
	GameFrame frame;
	GameOver(GameFrame frame){
		this.frame = frame;
		for (int i=0; i<frame.dif; i++){
			for (int j=0; j<frame.dif; j++){
				if(frame.ban.ban[i][j]==9)
					frame.masu[i][j].button.setIcon(frame.masu[i][j].bicon);
			}
		}
		JLabel label = new JLabel("GameOver!");
		label.setOpaque(true);
    	label.setBackground(Color.RED);
		frame.p2.add(label, BorderLayout.CENTER);
		frame.timer.timer.stop();
	}
} 
