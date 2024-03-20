import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
    double numero1, numero2, resultado;
    String operacao;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(0, 255, 0));
		frmCalculadora.setBackground(new Color(0, 255, 0));
		frmCalculadora.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 299, 363);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setForeground(new Color(230, 183, 221));
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		txtField.setBounds(10, 11, 266, 25);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btndiv = new JButton("/");
		btndiv.setForeground(new Color(255, 0, 0));
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setFont(new Font("Arial", Font.PLAIN, 25));
		btndiv.setBounds(217, 258, 59, 49);
		frmCalculadora.getContentPane().add(btndiv);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar ;
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
			     resultado = numero1+numero2;
				selecionar = String.format("%.0f", resultado);
				txtField.setText(selecionar);
				
			}else if (operacao.equals("-")) {
				resultado = numero1-numero2;
				selecionar = String.format("%.0f", resultado);
				txtField.setText(selecionar);
			}else if (operacao.equals("*")) {
				resultado = numero1*numero2;
				selecionar = String.format("%.0f", resultado);
				txtField.setText(selecionar);
			}else if (operacao.equals("/")) {
				resultado = numero1/numero2;
				selecionar = String.format("%.0f", resultado);
				txtField.setText(selecionar);	
			}
			}
		});
		btnigual.setForeground(new Color(255, 0, 0));
		btnigual.setFont(new Font("Arial", Font.PLAIN, 25));
		btnigual.setBounds(148, 258, 59, 49);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btnponto = new JButton(".");
		btnponto.setForeground(new Color(255, 0, 0));
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btnponto.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btnponto.setFont(new Font("Arial", Font.PLAIN, 30));
		btnponto.setBounds(79, 258, 59, 49);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "*";
			}
		});
		btnmult.setForeground(new Color(255, 0, 0));
		btnmult.setFont(new Font("Arial", Font.PLAIN, 26));
		btnmult.setBounds(217, 208, 59, 49);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Arial", Font.PLAIN, 15));
		btn3.setBounds(148, 208, 59, 49);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Arial", Font.PLAIN, 15));
		btn6.setBounds(148, 158, 59, 49);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Arial", Font.PLAIN, 15));
		btn8.setBounds(79, 107, 59, 49);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Arial", Font.PLAIN, 15));
		btn0.setBounds(10, 258, 59, 49);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Arial", Font.PLAIN, 15));
		btn2.setBounds(79, 208, 59, 49);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Arial", Font.PLAIN, 15));
		btn5.setBounds(79, 158, 59, 49);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setFont(new Font("Arial", Font.PLAIN, 15));
		btn1.setBounds(10, 208, 59, 49);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Arial", Font.PLAIN, 15));
		btn9.setBounds(148, 107, 59, 49);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Arial", Font.PLAIN, 13));
		btn4.setBounds(10, 158, 59, 49);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Arial", Font.PLAIN, 15));
		btn7.setBounds(10, 107, 59, 49);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btnsub = new JButton("-");
		btnsub.setForeground(new Color(255, 0, 0));
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnsub.setFont(new Font("Arial", Font.PLAIN, 25));
		btnsub.setBounds(217, 158, 59, 49);
		frmCalculadora.getContentPane().add(btnsub);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnsoma.setForeground(new Color(255, 0, 0));
		btnsoma.setFont(new Font("Arial", Font.PLAIN, 25));
		btnsoma.setBounds(217, 107, 59, 49);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btnc = new JButton("c");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnc.setFont(new Font("Arial", Font.PLAIN, 25));
		btnc.setBounds(217, 47, 59, 49);
		frmCalculadora.getContentPane().add(btnc);
	}
}
