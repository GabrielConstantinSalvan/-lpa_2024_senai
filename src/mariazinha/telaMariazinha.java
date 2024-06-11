package mariazinha;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class telaMariazinha implements ActionListener{
	
	private JTextField campoNome;
	private JTextField campoTotalVendas;
	private JTextField campoSalario;
	private JTextField campoComissao;
	private JTextField campoFim;

	
	private JLabel labelResultadoComissão;

	public static void main(String[] args) {

		new telaMariazinha();

	}

	public telaMariazinha() {

		JFrame frame = new JFrame("Swing test");
		frame.setSize(400, 600);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(9, 2, 10, 10));

		JLabel Labelnome = new JLabel("Nome do Funcionário: ");
		campoNome = new JTextField();
		
		JLabel LabelTotalVendas = new JLabel("Total de vendas: ");
		campoTotalVendas = new JTextField();
		
		JLabel LabelSalario = new JLabel("Salário: ");
		campoSalario = new JTextField();
		
		JLabel LabelComissao = new JLabel("Valor da Comissão: ");
		campoComissao = new JTextField();
		
		JLabel Labelfim = new JLabel("Salário + Comissão: ");
		campoFim = new JTextField();
		
		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(this);
		
		labelResultadoComissão = new JLabel("Comissão:  ");
		
		 JRadioButton option1 = new JRadioButton("1%");
	     JRadioButton option2 = new JRadioButton("2%");
	     JRadioButton option3 = new JRadioButton("3%");
	     JRadioButton option4 = new JRadioButton("4%");
	     
	     ButtonGroup group = new ButtonGroup();
	        group.add(option1);
	        group.add(option2);
	        group.add(option3);
	        group.add(option4);

		panel.add(Labelnome);
		panel.add(campoNome);
		panel.add(LabelTotalVendas);
		panel.add(campoTotalVendas);
		panel.add(labelResultadoComissão);
		panel.add(new JLabel(""));
		panel.add(option1);
        panel.add(option2);
        panel.add(option3);
        panel.add(option4);
        panel.add(LabelComissao);
		panel.add(campoComissao);
		panel.add(LabelSalario);
		panel.add(campoSalario);
		panel.add(Labelfim);
		panel.add(campoFim);
		panel.add(calcular);
		

		
		frame.add(panel);
		frame.setVisible(true);


				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}
	
	

}
