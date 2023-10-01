import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartBox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static StartBox start;
	static MatheQuiz quiz;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartBox.start = new StartBox();
					start.setVisible(true);
					start.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public StartBox() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(1000, 400, 400, 220);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Start-Quiz");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitel = new JLabel("Mathe-Quiz");
		lblTitel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitel.setFont(new Font("Rockwell", Font.BOLD, 30));
		lblTitel.setBounds(98, 12, 190, 55);
		contentPane.add(lblTitel);
		
		JButton btnStart = new JButton("Start!");
		btnStart.setBackground(new Color(34, 139, 34));
		btnStart.setForeground(new Color(255, 255, 255));
		btnStart.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quiz = new MatheQuiz();
				quiz.setVisible(true);
//				quiz.setLocationRelativeTo(null);
				start.setVisible(false); //close the window
			}
		});
		btnStart.setBounds(120, 80, 145, 55);
		contentPane.add(btnStart);
	}

}