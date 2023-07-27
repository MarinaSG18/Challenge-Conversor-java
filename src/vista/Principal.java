package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;
import modelo.Temeperaturas;
import modelo.ConversorDivisas;
import modelo.Divisas;
import modelo.MenuTemperatura;
import java.awt.Color;
import javax.swing.SwingConstants;


public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int eleccion;
	private JTextField txtEntrada;
	private JTextField txtResultado;
	private JComboBox<Object> comboFirstOpt = new JComboBox<Object>();
	private JComboBox<Object> comboSecOpt = new JComboBox<Object>();
	private JLabel lblDivUno = new JLabel("");;
	private JLabel divDos = new JLabel("");;
	private JLabel lblCantidad;
	private JLabel lblDatoEntrada;
	private JLabel lblResult;
	private final JLabel lblNewLabel = new JLabel("New label");
	private JLabel lblTitulo = new JLabel("Conversor");

	
	Font letraCant = new Font("Roboto Condensed", Font.PLAIN, 25);
	

	public Principal(int eleccion) {
		
		this.eleccion = eleccion;
		
		setTitle("Conversor");
		setBackground(new Color(0, 0, 0));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/logo.png")));
		getContentPane().setLayout(null);
		setSize(483, 489);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);


		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(0, 0, 470, 450);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setForeground(new Color(255, 255, 255));
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				botonConversor();
			}
		});
		btnConvertir.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		btnConvertir.setBackground(new Color(0, 153, 51));
		btnConvertir.setBounds(186, 286, 130, 38);
		panel.add(btnConvertir);

		JButton Regresar = new JButton("Regresar");
		Regresar.setForeground(new Color(255, 255, 255));
		Regresar.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		Regresar.setBackground(new Color(178, 34, 34));
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio inicio = new Inicio();
				inicio.setVisible(true);
				setVisible(false);
			}
		});
		Regresar.setBounds(10, 11, 82, 23);
		panel.add(Regresar);

		txtEntrada = new JTextField();
		txtEntrada.setText("1");
		txtEntrada.setBackground(new Color(255, 255, 255));
		txtEntrada.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEntrada.setBounds(132, 90, 236, 38);
		txtEntrada.setFont(letraCant);
		panel.add(txtEntrada);
		txtEntrada.setColumns(10);

		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBackground(new Color(240, 248, 255));
		txtResultado.setEditable(false);
		txtResultado.setFont(letraCant);
		txtResultado.setBounds(150, 354, 192, 48);
		panel.add(txtResultado);
		txtResultado.setColumns(10);

		lblDatoEntrada = new JLabel("De");
		lblDatoEntrada.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatoEntrada.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		lblDatoEntrada.setBounds(16, 151, 101, 38);
		panel.add(lblDatoEntrada);

		lblResult = new JLabel("A");
		lblResult.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResult.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		lblResult.setBounds(16, 213, 101, 38);
		panel.add(lblResult);

		
		comboFirstOpt.setBackground(new Color(255, 255, 255));
		comboFirstOpt.setFont(new Font("Roboto Condensed", Font.PLAIN, 19));
		comboFirstOpt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelFirst(eleccion);
			}
		});
		comboFirstOpt.setBounds(132, 151, 236, 38);
		panel.add(comboFirstOpt);
		
		comboSecOpt.setFont(new Font("Roboto Condensed", Font.PLAIN, 19));
		comboSecOpt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSecond(eleccion);
			}
		});

		comboSecOpt.setBounds(132, 213, 236, 38);
		panel.add(comboSecOpt);

		lblTitulo.setFont(new Font("Roboto Condensed", Font.BOLD, 23));
		lblTitulo.setBounds(122, 41, 263, 38);
		panel.add(lblTitulo);

		lblDivUno.setBounds(378, 90, 82, 37);
		lblDivUno.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		panel.add(lblDivUno);
		divDos.setHorizontalAlignment(SwingConstants.CENTER);

		divDos.setBounds(150, 401, 192, 38);
		divDos.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		panel.add(divDos);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCantidad.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		lblCantidad.setBounds(28, 91, 89, 38);
		panel.add(lblCantidad);
		
		lblNewLabel.setBounds(480, 20, 46, 48);
		panel.add(lblNewLabel);
		
		listaElementos(eleccion);
		

	}

	private void listaElementos(int eleccion) {
		eleccion = this.eleccion;

		if (eleccion == 2) {
			comboFirstOpt.setModel(new DefaultComboBoxModel<>(Temeperaturas.values()));
			comboSecOpt.setModel(new DefaultComboBoxModel<>(Temeperaturas.values()));
			lblTitulo.setText("Conversor de Temperatura");
			lblDivUno.setText("°C");
			divDos.setText("°C");

		}
		if (eleccion == 1) {

			comboFirstOpt.setModel(new DefaultComboBoxModel<>(Divisas.values()));
			comboSecOpt.setModel(new DefaultComboBoxModel<>(Divisas.values()));

			lblTitulo.setText("Conversor de Monedas");
			lblDivUno.setText("SAR");
			divDos.setText("SAR");

		}

	}


	private void botonConversor() {

		String cantidad = txtEntrada.getText();
		Double resultado = null;

		if (eleccion == 2) {
			String firstOpt = comboFirstOpt.getSelectedItem().toString();
			String secOpt = comboSecOpt.getSelectedItem().toString();

			resultado = MenuTemperatura.menuDeOpciones(firstOpt, secOpt, cantidad);

		}
		if (eleccion == 1) {

			Divisas divOrigen = (Divisas) comboFirstOpt.getSelectedItem();
			Divisas divDestino = (Divisas) comboSecOpt.getSelectedItem();

			System.out.println(divOrigen.getSigla());
			try {
				resultado = ConversorDivisas.obtenerMoneda(divOrigen.getSigla(), divDestino.getSigla(), cantidad);
				System.out.println(resultado);
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}

		DecimalFormat df = new DecimalFormat("#.00");
		txtResultado.setText(df.format(resultado));

	}

	private void labelFirst(int eleccion) {
		eleccion = this.eleccion;

		if (eleccion == 2) {
			Temeperaturas fisrtTemp = (Temeperaturas) comboFirstOpt.getSelectedItem();
			lblDivUno.setText(fisrtTemp.getSimbolo());
		}
		if (eleccion == 1) {
			Divisas divOrigen = (Divisas) comboFirstOpt.getSelectedItem();
			lblDivUno.setText(divOrigen.getSigla());
		}
	}

	private void labelSecond(int eleccion) {
		eleccion = this.eleccion;

		if (eleccion == 2) {
			Temeperaturas secondTemp = (Temeperaturas) comboSecOpt.getSelectedItem();
			divDos.setText(secondTemp.getSimbolo());
		}
		if (eleccion == 1) {
			Divisas diviDestino = (Divisas) comboSecOpt.getSelectedItem();
			divDos.setText(diviDestino.getSigla());
		}
	}

}
