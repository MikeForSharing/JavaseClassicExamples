import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ButtonArrayExample extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonArrayExample frame = new ButtonArrayExample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonArrayExample() {
		setTitle("按钮数组实现计算器界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setText("1312.2132");
		textField.setPreferredSize(new Dimension(1000,30));
		getContentPane().add(textField, BorderLayout.NORTH);
		
		GridLayout gridLayout = new GridLayout(4,4);
		gridLayout.setHgap(4);
		gridLayout.setVgap(4);
		final JPanel panel = new JPanel();
		panel.setLayout(gridLayout);
		getContentPane().add(panel, BorderLayout.CENTER);
		
		String[][] names = {{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","*"},{".","0","=","+"}};
		JButton[][] buttons = new JButton[4][4];
		
		for(int row=0; row<names.length; row++) {
			for(int column=0; column<names.length;column++) {
				buttons[row][column] = new JButton(names[row][column]);
				panel.add(buttons[row][column]);
			}
		}
		
		
		
	}
}
