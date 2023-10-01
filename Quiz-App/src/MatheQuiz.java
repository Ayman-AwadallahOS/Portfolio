import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class MatheQuiz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	/**
	 * Create the frame.
	 */
	public MatheQuiz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Mathe-Quiz");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitel = new JLabel("Mathe-Quiz");
		lblTitel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitel.setFont(new Font("Rockwell", Font.BOLD, 30));
		lblTitel.setBounds(150, 12, 190, 55);
		contentPane.add(lblTitel);
		
		JLabel lblFrage1 = new JLabel("1. Frage:  2 + 2 = ");
		lblFrage1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblFrage1.setBounds(57, 86, 190, 30);
		contentPane.add(lblFrage1);
		
		JLabel lblFrage2 = new JLabel("2. Frage:  5 * 4 =  ");
		lblFrage2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblFrage2.setBounds(57, 127, 190, 30);
		contentPane.add(lblFrage2);
		
		JLabel lblFrage3 = new JLabel("3. Frage:  10 - 3 =  ");
		lblFrage3.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblFrage3.setBounds(57, 169, 190, 30);
		contentPane.add(lblFrage3);
		
		JLabel lblFrage4 = new JLabel("4. Frage:  44 / 11 = ");
		lblFrage4.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblFrage4.setBounds(57, 214, 190, 30);
		contentPane.add(lblFrage4);
		
		JLabel lblFrage5 = new JLabel("5. Frage:  9 * 0 = ");
		lblFrage5.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblFrage5.setBounds(57, 255, 190, 30);
		contentPane.add(lblFrage5);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField.setBounds(212, 93, 99, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(212, 134, 99, 23);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(212, 176, 99, 23);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(212, 221, 99, 23);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(212, 262, 99, 23);
		contentPane.add(textField_4);
		
		JLabel lblres1 = new JLabel("");
		lblres1.setBounds(347, 92, 58, 24);
		contentPane.add(lblres1);
		
		JLabel lblres2 = new JLabel("");
		lblres2.setBounds(347, 133, 58, 24);
		contentPane.add(lblres2);
		
		JLabel lblres3 = new JLabel("");
		lblres3.setBounds(347, 175, 58, 23);
		contentPane.add(lblres3);
		
		JLabel lblres4 = new JLabel("");
		lblres4.setBounds(347, 220, 58, 24);
		contentPane.add(lblres4);
		
		JLabel lblres5 = new JLabel("");
		lblres5.setBounds(347, 261, 58, 24);
		contentPane.add(lblres5);
		
		JButton btnAbgeben = new JButton("Abgeben");
		btnAbgeben.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int antwEing1 = Integer.parseInt(textField.getText());
				int antwEing2 = Integer.parseInt(textField_1.getText());
				int antwEing3 = Integer.parseInt(textField_2.getText());
				int antwEing4 = Integer.parseInt(textField_3.getText());
				int antwEing5 = Integer.parseInt(textField_4.getText());
				
				List<Integer> antwEingaben = new ArrayList<>();
				antwEingaben.add(antwEing1);
				antwEingaben.add(antwEing2);
				antwEingaben.add(antwEing3);
				antwEingaben.add(antwEing4);
				antwEingaben.add(antwEing5);
				
				List<Integer> antworten = new ArrayList<>();
				antworten.add(4);
				antworten.add(20);
				antworten.add(7);
				antworten.add(4);
				antworten.add(0);
				
				List<JLabel> results = new ArrayList<>();
				results.add(lblres1);
				results.add(lblres2);
				results.add(lblres3);
				results.add(lblres4);
				results.add(lblres5);
				
				int score = 0;
				for (int i = 0; i < antwEingaben.size(); i++) {
					if (antwEingaben.get(i) == antworten.get(i)) {
						results.get(i).setText("Richtig");
						results.get(i).setForeground(new Color(0, 175, 0));
						score++;
					} else {
						results.get(i).setText("Falsch");
						results.get(i).setForeground(Color.RED);
					}
				}
				
				if (score == 5)
					JOptionPane.showMessageDialog(null, "Deine Score: " + score + " von 5 (Prima!)", "Ergebnis", JOptionPane.INFORMATION_MESSAGE);
				else if (score == 4 || score == 3) {
					JOptionPane.showMessageDialog(null, "Deine Score: " + score + " von 5 (Sehr Gut!)", "Ergebnis", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Deine Score: " + score + " von 5 (Mehr Glück nächstes Mal!)", "Ergebnis", JOptionPane.INFORMATION_MESSAGE);
				}
				
				StartBox.quiz.setVisible(false);
				StartBox.start.setVisible(true);
			}
				
		});
		btnAbgeben.setForeground(new Color(255, 255, 255));
		btnAbgeben.setBackground(new Color(46, 139, 87));
		btnAbgeben.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnAbgeben.setBounds(321, 324, 129, 55);
		contentPane.add(btnAbgeben);
		
	}

	protected Integer parseInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}