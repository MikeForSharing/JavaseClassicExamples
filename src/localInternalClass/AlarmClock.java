package localInternalClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;

public class AlarmClock {
	private int delay;
	private boolean flag;
	
	public  AlarmClock(int delay, boolean flag) {
		this.delay = delay;
		this.flag = flag;
	}
	
	public void start() {
		class Printer implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf = new SimpleDateFormat("k:m:s");
				String time = sdf.format(new Date());
				System.out.println("当前时间为：" + time);
				if(flag) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
			
		}
		new Timer(delay, new Printer()).start();
	}
	
}
