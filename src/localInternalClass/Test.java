package localInternalClass;

import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		AlarmClock clock = new AlarmClock(1000,true);
		clock.start();
		JOptionPane.showMessageDialog(null, "确定关闭吗？");
		System.exit(0);
	}
	
}
