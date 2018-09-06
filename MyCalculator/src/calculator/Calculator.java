package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Point;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	private double firstNum;
	private double secondNum;
	private double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setLocation(new Point(500, 250));
		frmCalculator.setResizable(false);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setType(Type.UTILITY);
		frmCalculator.setBounds(100, 100, 288, 408);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 258, 39);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);

		// ---------- 1st Row -----------
		JButton reset = new JButton("C");
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);

			}
		});
		reset.setFont(new Font("Tahoma", Font.BOLD, 20));
		reset.setBounds(10, 53, 60, 60);
		frmCalculator.getContentPane().add(reset);

		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(strB.length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);

				}

			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBackspace.setBounds(76, 53, 60, 60);
		frmCalculator.getContentPane().add(btnBackspace);

		JButton btnRemainder = new JButton("\u0025");
		btnRemainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnRemainder.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRemainder.setBounds(142, 53, 60, 60);
		frmCalculator.getContentPane().add(btnRemainder);

		JButton btnDiv = new JButton("\u00F7");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "÷";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(208, 53, 60, 60);
		frmCalculator.getContentPane().add(btnDiv);

		// ----------- 2nd Row ------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enteredNum = textField.getText() + btn7.getText();
				textField.setText(enteredNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 115, 60, 60);
		frmCalculator.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNum = textField.getText() + btn8.getText();
				textField.setText(enteredNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(76, 115, 60, 60);
		frmCalculator.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNum = textField.getText() + btn9.getText();
				textField.setText(enteredNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(142, 115, 60, 60);
		frmCalculator.getContentPane().add(btn9);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(208, 177, 60, 60);
		frmCalculator.getContentPane().add(btnPlus);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNum = textField.getText() + btn4.getText();
				textField.setText(enteredNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 177, 60, 60);
		frmCalculator.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNum = textField.getText() + btn5.getText();
				textField.setText(enteredNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(76, 177, 60, 60);
		frmCalculator.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNum = textField.getText() + btn6.getText();
				textField.setText(enteredNum);
			}
		});

		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(142, 177, 60, 60);
		frmCalculator.getContentPane().add(btn6);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(208, 239, 60, 60);
		frmCalculator.getContentPane().add(btnSub);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNum = textField.getText() + btn1.getText();
				textField.setText(enteredNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 239, 60, 60);
		frmCalculator.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNum = textField.getText() + btn2.getText();
				textField.setText(enteredNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(76, 239, 60, 60);
		frmCalculator.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNum = textField.getText() + btn3.getText();
				textField.setText(enteredNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(142, 239, 60, 60);
		frmCalculator.getContentPane().add(btn3);

		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(208, 115, 60, 60);
		frmCalculator.getContentPane().add(btnMul);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNum = textField.getText() + btn0.getText();
				textField.setText(enteredNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 301, 60, 60);
		frmCalculator.getContentPane().add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(btnDot.getText())) {
					textField.setText(textField.getText() + btnDot.getText());
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(142, 301, 60, 60);
		frmCalculator.getContentPane().add(btnDot);

		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(textField.getText());
				ops *= (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(76, 301, 60, 60);
		frmCalculator.getContentPane().add(btnPM);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum = Double.parseDouble(textField.getText());

				switch (operations) {
				
				case "+":
					result = firstNum + secondNum;
					answer = String.format("%.3f", result);
					textField.setText(answer);
					break;
				case "-":
					result = firstNum - secondNum;
					answer = String.format("%.3f", result);
					textField.setText(answer);
					break;
				case "*":
					result = firstNum * secondNum;
					answer = String.format("%.3f", result);
					textField.setText(answer);
					break;
				case "÷":
					result = firstNum / secondNum;
					answer = String.format("%.3f", result);
					textField.setText(answer);
					break;
				case "%":
					result = firstNum % secondNum;
					answer = String.format("%.3f", result);
					textField.setText(answer);
					break;
				default:
					textField.setText(textField.getText());
					break;

				}

			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(208, 301, 60, 60);
		frmCalculator.getContentPane().add(btnEqual);

	}
}
