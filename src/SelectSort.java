import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class SelectSort extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectSort frame = new SelectSort();
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
	public SelectSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(50, 10, 317, 52);
		contentPane.add(textArea);
		
		int[] randomNum = new int[5];

		JButton btnNewButton = new JButton("生成随机数组");
		btnNewButton.setBounds(153, 82, 93, 23);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
				textArea.setText("");
				for(int i=0;i<5;i++) {
					randomNum[i] = random.nextInt(33);
					textArea.append(randomNum[i] + " ");
				}
			}
			
		});
		contentPane.add(btnNewButton);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(50, 135, 322, 52);
		contentPane.add(textArea_1);
		
		JButton btnNewButton_1 = new JButton("排序");
		btnNewButton_1.setBounds(153, 217, 93, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("");
				int max;
				for(int i=randomNum.length-1;i>=0;i--) {
					for(int j=0;j<i;j++) {
						if(randomNum[i]<randomNum[j]) {
							exch(randomNum, i,j);
						}
					}
					textArea_1.append(randomNum[i] + " ");

				}
			}
		});
		contentPane.add(btnNewButton_1);
	}
	
	public static void exch(int[] a, int i, int j) {
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
