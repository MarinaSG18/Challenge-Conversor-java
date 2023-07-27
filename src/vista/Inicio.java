package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Inicio extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Inicio() {
		setForeground(new Color(0, 128, 192));
		setBackground(new Color(0, 128, 192));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/imagenes/logo.png")));
		setTitle("Conversor");
		setSize(491, 373);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTi = new JLabel("Elige una opción");
		lblTi.setHorizontalAlignment(SwingConstants.CENTER);
		lblTi.setForeground(new Color(0, 0, 0));
		lblTi.setFont(new Font("Roboto Condensed", Font.PLAIN, 23));
		lblTi.setBounds(137, 55, 184, 35);
		panel.add(lblTi);

		
		//Boton de Temperatura 
		
		String urlImagenDiv = "/imagenes/moneda.png";
		URL urlDiv = getClass().getResource(urlImagenDiv);
		Image imgD= new ImageIcon(urlDiv).getImage();
		ImageIcon iconD=new ImageIcon(imgD.getScaledInstance(110, 100, Image.SCALE_SMOOTH));
		
		
		JButton btnDivisa = new JButton("");
		btnDivisa.setBorder(null);
		btnDivisa.setBackground(new Color(245, 255, 250));
		btnDivisa.setIcon(iconD);
		btnDivisa.setHorizontalTextPosition(SwingConstants.LEFT);
		btnDivisa.setSize(new Dimension(24, 24));
		
		btnDivisa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDivisa.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						abrir(1);
					}
				});
		
		
		//Boton de Divisas
		
		String urlImagenTemp = "/imagenes/temp.png";
		URL urlTem = getClass().getResource(urlImagenTemp);
		Image imgTemp= new ImageIcon(urlTem).getImage();
		ImageIcon iconTemp=new ImageIcon(imgTemp.getScaledInstance(110, 100, Image.SCALE_SMOOTH));
		
		
		btnDivisa.setBounds(64, 101, 150, 124);
		panel.add(btnDivisa);
		
		JButton btnTemp = new JButton("");
		btnTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrir(2);
			}
		});
		btnTemp.setBorder(null);
		btnTemp.setBackground(new Color(245, 255, 250));
		btnTemp.setIcon(iconTemp);
		btnTemp.setBounds(258, 101, 150, 124);
		btnTemp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		panel.add(btnTemp);
		
		JLabel lblDivisa = new JLabel("Divisas");
		lblDivisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivisa.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		lblDivisa.setBounds(94, 252, 99, 35);
		panel.add(lblDivisa);
		
		JLabel lblTemp = new JLabel("Temperatura");
		lblTemp.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemp.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
		lblTemp.setBounds(258, 252, 170, 35);
		panel.add(lblTemp);
		
		JLabel lblTitulo = new JLabel("Conversor");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		lblTitulo.setBounds(137, 11, 184, 35);
		panel.add(lblTitulo);
		
		
	}
	
	public void abrir(int elecion) {
		
		Principal principal = new Principal(elecion);
		principal.setVisible(true);
		setVisible(false);
			
	}
	
	
	public void botones() {
		
		
	}

}
