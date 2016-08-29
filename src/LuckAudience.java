import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LuckAudience extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LuckAudience frame = new LuckAudience();
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
	public LuckAudience() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u5728\u573A\u89C2\u4F17\u7684\u59D3\u540D\u5E76\u56DE\u8F66");
		lblNewLabel.setBounds(10, 10, 165, 28);
		contentPane.add(lblNewLabel);
		

		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(42, 125, 121, 143);
		contentPane.add(textArea);
		
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() != '\n') {
					return;
				}
				String name = textField.getText();
				if(name.isEmpty()) {
					return;
				}
				textArea.append(name + "\n");
				textField.setText("");
			}
		});
		textField.setBounds(37, 64, 116, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("\u5E78\u8FD0\u89C2\u4F17\u4FE1\u606F\u53CA\u5927\u5956\u8BF4\u660E");
		lblNewLabel_1.setBounds(200, 17, 149, 15);
		contentPane.add(lblNewLabel_1);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(200, 66, 143, 203);
		contentPane.add(textArea_1);
		
		JButton btnNewButton = new JButton("抽取");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peopleList = textArea.getText();
				String[] peopleArr = peopleList.split("\n{1,}");
				int index = (int) (Math.random()*peopleArr.length);
				String str = "本次抽奖的幸运观众是:\n%1$s\n获得了大奖，三毛全集一套";
				String info = str.format(str, peopleArr[index]);
				
				textArea_1.setText(info);
				
			}
		});
		btnNewButton.setBounds(372, 120, 100, 33);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("退出");
		button.setBounds(372, 181, 100, 33);
		contentPane.add(button);
	}
}
