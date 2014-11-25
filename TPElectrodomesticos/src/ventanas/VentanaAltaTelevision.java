package ventanas;

import tp.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;


public class VentanaAltaTelevision extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField descripcion;
	private JTextField precioBase;
	private JTextField peso;
	private JTextField resolucion;
	private String colorS;
	private String consumoS;
	private String sintonizadorS; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaTelevision frame = new VentanaAltaTelevision();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public VentanaAltaTelevision() {
		setTitle("ALTA TELEVISION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(10, 33, 69, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblNewLabel = new JLabel("Precio Base");
		lblNewLabel.setBounds(10, 79, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(10, 121, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblConsumo = new JLabel("Consumo");
		lblConsumo.setBounds(10, 166, 69, 14);
		contentPane.add(lblConsumo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String descripcionAT, precioBaseAT, pesoAT, colorAT = null, consumoAT = null, resolucionAT, sintonizadorAT;
				
				descripcionAT=descripcion.getText();
				precioBaseAT=precioBase.getText();
				pesoAT=peso.getText();
				colorAT=colorS;
				consumoAT=consumoS;
				resolucionAT=resolucion.getText();
				sintonizadorAT=sintonizadorS;
				
				Principal.AltaTelevision(descripcionAT, precioBaseAT, pesoAT, colorAT, consumoAT, resolucionAT, sintonizadorAT);
				JOptionPane.showMessageDialog(null, "Televisor registrado");
			}
		});
		btnAgregar.setBounds(149, 335, 107, 35);
		contentPane.add(btnAgregar);
		
		descripcion = new JTextField();
		descripcion.setBounds(139, 30, 86, 20);
		contentPane.add(descripcion);
		descripcion.setColumns(10);
		
		precioBase = new JTextField();
		precioBase.setBounds(139, 76, 86, 20);
		contentPane.add(precioBase);
		precioBase.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(10, 206, 46, 14);
		contentPane.add(lblPeso);
		
		peso = new JTextField();
		peso.setBounds(139, 203, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		JLabel lblResolucion = new JLabel("Resolucion");
		lblResolucion.setBounds(10, 248, 69, 14);
		contentPane.add(lblResolucion);
		
		resolucion = new JTextField();
		resolucion.setBounds(139, 245, 86, 20);
		contentPane.add(resolucion);
		resolucion.setColumns(10);
		
		JLabel lblSintonizadorTdt = new JLabel("Sintonizador TDT");
		lblSintonizadorTdt.setBounds(10, 294, 98, 14);
		contentPane.add(lblSintonizadorTdt);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(347, 382, 98, 35);
		contentPane.add(btnSalir);
		
		final JComboBox colores = new JComboBox();
		colores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				colorS=colores.getSelectedItem().toString();
			}
		});
		colores.setModel(new DefaultComboBoxModel(new String[] {"blanco", "negro", "azul", "gris", "rojo"}));
		colores.setBounds(139, 118, 86, 20);
		contentPane.add(colores);
		
		final JComboBox consumos = new JComboBox();
		consumos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				consumoS=consumos.getSelectedItem().toString();
			}
		});
		consumos.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "F"}));
		consumos.setBounds(139, 163, 86, 20);
		contentPane.add(consumos);
		
		final JCheckBox sintonizador = new JCheckBox("");
		sintonizador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(sintonizador.isSelected()==true)
					sintonizadorS="true";
			}
		});
		sintonizador.setBounds(139, 290, 46, 23);
		contentPane.add(sintonizador);
	}
}
