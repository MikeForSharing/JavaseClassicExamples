import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ArrayMinValue extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayMinValue frame = new ArrayMinValue();
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
	public ArrayMinValue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u4E09\u4E2A\u6574\u6570");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("计算");
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		contentPane.add(label, BorderLayout.EAST);
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strArr = textField.getText().trim();
				if(strArr.equals("")) {
					JOptionPane.showMessageDialog(null, "请输入数字");
					return;
				}
				
				for(int i=0; i<strArr.length(); i++) {
					char charAt = strArr.charAt(i);
					if(!Character.isDigit(charAt) && charAt != ' ') {
						JOptionPane.showMessageDialog(null, "输入了非法字符");
						textField.setText("");
						return;
					}
				}
				String[] numStr = strArr.split(" {1,}");
				int[] numArray = new int[numStr.length];
				
				for(int i=0; i<numStr.length; i++) {
					numArray[i] = Integer.valueOf(numStr[i]);
				}
				
				int min = numArray[0];
				
				for(int i=0; i<numArray.length; i++) {
					if(min > numArray[i]) {
						min = numArray[i];
					}
				}
				
				label.setText("最小的整数是" + min);
			}
		};
		btnNewButton.addActionListener(al);
	}

	
	
	
}
