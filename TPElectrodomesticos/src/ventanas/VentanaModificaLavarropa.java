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
import javax.swing.JTextField;

public class VentanaModificaLavarropa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField descripI;
	private JTextField descripcion;
	private JTextField precioBase;
	private JTextField peso;
	private JTextField carga;
	private JTextField colorL;
	private JTextField consumo;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaModificaLavarropa frame = new VentanaModificaLavarropa();
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
	public VentanaModificaLavarropa() {
		setTitle("MODIFICA LAVARROPAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 601);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseDescripcionDel = new JLabel("Ingrese descripcion del Lavarropas:");
		lblIngreseDescripcionDel.setBounds(10, 46, 259, 14);
		getContentPane().add(lblIngreseDescripcionDel);
		
		descripI = new JTextField();
		descripI.setBounds(262, 45, 171, 20);
		getContentPane().add(descripI);
		descripI.setColumns(10);
		
		JButton btnBusca = new JButton("Buscar");
		btnBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String desc;
				Lavarropas lava;
					
				desc=descripI.getText();
				lava=Principal.BuscaLava(desc);
				if (lava != null)
				{
				//devuelve los atributos a la ventana
				
				descripcion.setText(lava.getDescrip());
				precioBase.setText(String.valueOf(lava.getPrecioBase()));
				peso.setText(String.valueOf(lava.getPeso()));
				colorL.setText(lava.getColor());
				consumo.setText(lava.getConsumoEnergetico());
				carga.setText(String.valueOf(lava.getCarga()));
				}
				
				else if(lava==null)
				{
					JOptionPane.showMessageDialog(null, "Lavarropas no encontrado");
				}
				
				
			}
		});
		btnBusca.setBounds(500, 30, 102, 35);
		getContentPane().add(btnBusca);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(32, 116, 171, 14);
		getContentPane().add(lblDescripcion);
		
		JLabel lblPrecioBase = new JLabel("Precio Base");
		lblPrecioBase.setBounds(32, 165, 171, 14);
		getContentPane().add(lblPrecioBase);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(32, 213, 171, 14);
		getContentPane().add(lblColor);
		
		JLabel lblConsumoEnergetico = new JLabel("Consumo Energetico");
		lblConsumoEnergetico.setBounds(32, 264, 171, 14);
		getContentPane().add(lblConsumoEnergetico);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(32, 314, 171, 14);
		getContentPane().add(lblPeso);
		
		descripcion = new JTextField();
		descripcion.setEditable(false);
		descripcion.setBounds(213, 113, 86, 20);
		getContentPane().add(descripcion);
		descripcion.setColumns(10);
		
		precioBase = new JTextField();
		precioBase.setBounds(213, 162, 86, 20);
		getContentPane().add(precioBase);
		precioBase.setColumns(10);
		
		peso = new JTextField();
		peso.setEditable(false);
		peso.setBounds(213, 311, 86, 20);
		getContentPane().add(peso);
		peso.setColumns(10);
		
		carga = new JTextField();
		carga.setEditable(false);
		carga.setBounds(213, 367, 86, 20);
		getContentPane().add(carga);
		carga.setColumns(10);
		
		JLabel lblCrga = new JLabel("Carga");
		lblCrga.setBounds(32, 370, 171, 14);
		getContentPane().add(lblCrga);
		
		JButton guardar = new JButton("Guardar");
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		guardar.setBounds(213, 430, 116, 41);
		getContentPane().add(guardar);
		
		JLabel label = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------");
		label.setForeground(Color.GRAY);
		label.setBounds(10, 91, 592, 14);
		getContentPane().add(label);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(500, 510, 111, 41);
		getContentPane().add(btnSalir);
		
		colorL = new JTextField();
		colorL.setEditable(false);
		colorL.setBounds(213, 210, 86, 20);
		getContentPane().add(colorL);
		colorL.setColumns(10);
		
		consumo = new JTextField();
		consumo.setEditable(false);
		consumo.setBounds(213, 261, 86, 20);
		getContentPane().add(consumo);
		consumo.setColumns(10);
	}
}
