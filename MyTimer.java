import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTimer extends JFrame implements ActionListener{
	private long period;
	private long expiredAt;
	Timer timer;
	private JLabel label;
	GameFrame frame;

	MyTimer(int minutes, GameFrame frame){
		period = minutes*60000;
		label = new JLabel();
		label.setFont(new Font(label.getFont().getFontName(),Font.BOLD,20));
		this.frame=frame;
		updateLabel(period);
		frame.p2.add(label, BorderLayout.EAST);
		setTitle(minutes + ":" + this.getClass().getName());
		timer = new Timer(1000/*ms*/, this);
		timer.start();
		expiredAt = System.currentTimeMillis()+period;
	}

	private void updateLabel(long remainingTime){
		long min = remainingTime / 60000;
		long sec = (remainingTime / 1000) % 60;
		if(remainingTime > 0){
			remainingTime += 500;	
			label.setText(min + ":" + String.format("%02d",sec));
		}else{
			label.setText("Times Up! "+ min + ":" + String.format("%02d",sec));
			timer.stop();
			GameOver go = new GameOver(frame);
		}
	}
	public void actionPerformed(ActionEvent e){
		long remainingTime = expiredAt - System.currentTimeMillis();
		updateLabel(remainingTime);
	}
} 


