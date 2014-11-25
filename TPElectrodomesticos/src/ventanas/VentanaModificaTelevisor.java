package ventanas;

import tp.*;

import java.awt.Color;
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


public class VentanaModificaTelevisor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField descripI;
	private JTextField descripcion;
	private JTextField precioBase;
	private JTextField peso;
	private JTextField resolucion;
	private JTextField colorT;
	private JTextField consumo;
	private JTextField sintonizador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaModificaTelevisor frame = new VentanaModificaTelevisor();
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
	public VentanaModificaTelevisor() {
		setTitle("MODIFICA TELEVISOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseDescripcionDel = new JLabel("Ingrese descripcion del Televisor:");
		lblIngreseDescripcionDel.setBounds(21, 42, 215, 14);
		contentPane.add(lblIngreseDescripcionDel);
		
		descripI = new JTextField();
		descripI.setBounds(272, 39, 215, 20);
		contentPane.add(descripI);
		descripI.setColumns(10);
		
		JButton busca = new JButton("Buscar");
		busca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			
			String desc;
			Television tele;
				
			desc=descripI.getText();
			tele=Principal.BuscaTele(desc);
			if (tele != null)
			{
			//devuelve los atributos a la ventana
			descripcion.setText(tele.getDescrip());
			precioBase.setText(String.valueOf(tele.getPrecioBase()));
			peso.setText(String.valueOf(tele.getPeso()));
			colorT.setText(tele.getColor());
			consumo.setText(tele.getColor());
			resolucion.setText(String.valueOf(tele.getResolucion()));
			sintonizador.setText(String.valueOf(tele.getSintonizadorTDT()));
			}
			
			else if(tele==null)
			{
				JOptionPane.showMessageDialog(null, "Televisor no encontrado");
			}
			
			}
		});
		busca.setBounds(528, 24, 114, 37);
		contentPane.add(busca);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(21, 132, 178, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(21, 218, 178, 14);
		contentPane.add(lblColor);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(21, 299, 178, 14);
		contentPane.add(lblPeso);
		
		JLabel lblResolucion = new JLabel("Resolucion");
		lblResolucion.setBounds(21, 335, 181, 14);
		contentPane.add(lblResolucion);
		
		JLabel lblSintonizadorTdt = new JLabel("Sintonizador TDT");
		lblSintonizadorTdt.setBounds(21, 372, 184, 14);
		contentPane.add(lblSintonizadorTdt);
		
		JLabel lblConsumo = new JLabel("Consumo Energetico");
		lblConsumo.setBounds(21, 259, 178, 14);
		contentPane.add(lblConsumo);
		
		JLabel lblPrecioBase = new JLabel("Precio Base");
		lblPrecioBase.setBounds(21, 175, 178, 14);
		contentPane.add(lblPrecioBase);
		
		JButton guardar = new JButton("Guardar");
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
			}
		});
		guardar.setBounds(215, 416, 100, 37);
		contentPane.add(guardar);
		
		descripcion = new JTextField();
		descripcion.setEditable(false);
		descripcion.setBounds(215, 129, 86, 20);
		contentPane.add(descripcion);
		descripcion.setColumns(10);
		
		precioBase = new JTextField();
		precioBase.setBounds(215, 172, 86, 20);
		contentPane.add(precioBase);
		precioBase.setColumns(10);
		
		peso = new JTextField();
		peso.setEditable(false);
		peso.setBounds(215, 296, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		resolucion = new JTextField();
		resolucion.setEditable(false);
		resolucion.setBounds(215, 332, 86, 20);
		contentPane.add(resolucion);
		resolucion.setColumns(10);
		
		JLabel label = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label.setForeground(Color.GRAY);
		label.setBounds(10, 91, 652, 14);
		contentPane.add(label);
		
		colorT = new JTextField();
		colorT.setEditable(false);
		colorT.setBounds(215, 215, 86, 20);
		contentPane.add(colorT);
		colorT.setColumns(10);
		
		consumo = new JTextField();
		consumo.setEditable(false);
		consumo.setBounds(215, 256, 86, 20);
		contentPane.add(consumo);
		consumo.setColumns(10);
		
		sintonizador = new JTextField();
		sintonizador.setEditable(false);
		sintonizador.setBounds(215, 369, 86, 20);
		contentPane.add(sintonizador);
		sintonizador.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(548, 492, 114, 43);
		contentPane.add(btnSalir);
	}
}
