package ventanas;

import tp.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaListaTelevisores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField rango1;
	private JTextField rango2;
	private String consumoS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListaTelevisores frame = new VentanaListaTelevisores();
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
	public VentanaListaTelevisores() {
		setTitle("LISTADO TELEVISORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese rango de precio que desea listar:");
		lblNewLabel.setBounds(10, 28, 389, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setBounds(10, 66, 46, 14);
		contentPane.add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setBounds(192, 66, 46, 14);
		contentPane.add(lblHasta);
		
		rango1 = new JTextField();
		rango1.setBounds(66, 63, 86, 20);
		contentPane.add(rango1);
		rango1.setColumns(10);
		
		rango2 = new JTextField();
		rango2.setBounds(264, 63, 86, 20);
		contentPane.add(rango2);
		rango2.setColumns(10);
		
		JLabel lblIngreseConsumoEnergetico = new JLabel("Ingrese consumo energetico que desea listar:");
		lblIngreseConsumoEnergetico.setBounds(12, 116, 387, 14);
		contentPane.add(lblIngreseConsumoEnergetico);
		
		JButton listar = new JButton("Listar");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				ArrayList<Television> lista = new ArrayList<Television>();
				float r1, r2;
				String c;
				
				r1=Integer.parseInt(rango1.getText());
				r2=Integer.parseInt(rango2.getText());
				c=consumoS;
				
				lista=Principal.listaTele(r1, r2, c);
				MostrarListaT muestraT = new MostrarListaT();
				muestraT.setVisible(true);
				muestraT.listar(lista);
			}
		});
		listar.setBounds(10, 200, 105, 36);
		contentPane.add(listar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(294, 253, 105, 36);
		contentPane.add(btnSalir);
		
		final JComboBox consumos = new JComboBox();
		consumos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				consumoS=consumos.getSelectedItem().toString();
			}
		});
		consumos.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "F"}));
		consumos.setBounds(126, 141, 76, 20);
		contentPane.add(consumos);
	}

}
