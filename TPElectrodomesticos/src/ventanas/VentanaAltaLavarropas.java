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


public class VentanaAltaLavarropas extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField descripcion;
	private JTextField precioBase;
	private JTextField peso;
	private JTextField carga;
	private String colorS;
	private String consumoS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaLavarropas frame = new VentanaAltaLavarropas();
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
	public VentanaAltaLavarropas() {
		setTitle("ALTA LAVARROPAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descripcion");
		lblNewLabel.setBounds(10, 25, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Precio Base");
		lblNewLabel_2.setBounds(10, 63, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		descripcion = new JTextField();
		descripcion.setBounds(137, 22, 86, 20);
		contentPane.add(descripcion);
		descripcion.setColumns(10);
		
		precioBase = new JTextField();
		precioBase.setBounds(137, 60, 86, 20);
		contentPane.add(precioBase);
		precioBase.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(10, 104, 46, 14);
		contentPane.add(lblPeso);
		
		peso = new JTextField();
		peso.setBounds(137, 101, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(10, 147, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblCarga = new JLabel("Carga");
		lblCarga.setBounds(10, 238, 46, 14);
		contentPane.add(lblCarga);
		
		carga = new JTextField();
		carga.setBounds(137, 235, 86, 20);
		contentPane.add(carga);
		carga.setColumns(10);
		
		JLabel lblConsumo = new JLabel("Consumo");
		lblConsumo.setBounds(10, 193, 74, 14);
		contentPane.add(lblConsumo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String descripcionAL, precioBaseAL, pesoAL, cargaAL, colorAL = null, consumoAL = null;
				
				descripcionAL=descripcion.getText();
				precioBaseAL=precioBase.getText();
				pesoAL=peso.getText();
				cargaAL=carga.getText();
				colorAL=colorS;
				consumoAL=consumoS;
				
				Principal.AltaLavarropas(descripcionAL, precioBaseAL, pesoAL, cargaAL, colorAL, consumoAL);
								
				JOptionPane.showMessageDialog(null, "Lavarropas registrado. Java putoooo");
				
			}
		});
		btnAgregar.setBounds(137, 283, 105, 40);
		contentPane.add(btnAgregar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(387, 326, 105, 40);
		contentPane.add(btnSalir);
		
		final JComboBox colores = new JComboBox();
		colores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				colorS=colores.getSelectedItem().toString();
			}
		});
		colores.setModel(new DefaultComboBoxModel(new String[] {"blanco", "negro", "azul", "gris", "rojo"}));
		colores.setBounds(137, 144, 86, 20);
		contentPane.add(colores);
		
		final JComboBox consumos = new JComboBox();
		consumos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				consumoS=consumos.getSelectedItem().toString();
			}
		});
		consumos.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "F"}));
		consumos.setBounds(137, 190, 86, 20);
		contentPane.add(consumos);

	}
}
