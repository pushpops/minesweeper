import javax.swing.*;
import javax.swing.SwingConstants;
import java.awt.*;

public class GameClear extends JFrame{
	GameFrame frame;
 	GameClear(GameFrame frame) {
		this.frame = frame;
		JLabel label = new JLabel("GameClear!");
		label.setOpaque(true);
    	label.setBackground(Color.GREEN);
		frame.p2.add(label, BorderLayout.CENTER);
		frame.timer.timer.stop();
	}
} 
