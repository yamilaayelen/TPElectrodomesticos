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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaListaLavarropas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField rango1;
	private JTextField rango2;
	private JTable table;
	private String consumoS;
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListaLavarropas frame = new VentanaListaLavarropas();
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
	public VentanaListaLavarropas() {
		setTitle("LISTADO LAVARROPAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseRangoDe = new JLabel("Ingrese rango de precio que desea listar:");
		lblIngreseRangoDe.setBounds(10, 22, 414, 14);
		contentPane.add(lblIngreseRangoDe);
		
		rango1 = new JTextField();
		rango1.setBounds(66, 50, 62, 20);
		contentPane.add(rango1);
		rango1.setColumns(10);
		
		rango2 = new JTextField();
		rango2.setBounds(224, 47, 62, 20);
		contentPane.add(rango2);
		rango2.setColumns(10);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setBounds(10, 53, 46, 14);
		contentPane.add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setBounds(168, 53, 46, 14);
		contentPane.add(lblHasta);
		
		JLabel lblIngreseConsumoEnergetico = new JLabel("Ingrese consumo energetico que desea listar:");
		lblIngreseConsumoEnergetico.setBounds(10, 103, 414, 14);
		contentPane.add(lblIngreseConsumoEnergetico);
		
		
		JButton listar = new JButton("Listar");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				ArrayList<Lavarropas> lista = new ArrayList<Lavarropas>();
				float r1, r2;
				String c;
				
				r1=Integer.parseInt(rango1.getText());
				r2=Integer.parseInt(rango2.getText());
				c=consumoS;
				
				lista=Principal.listaLava(r1, r2, c);
				MostrarListaL muestraL = new MostrarListaL();
				muestraL.setVisible(true);
				muestraL.listar(lista);
				
			}
		});
		listar.setBounds(10, 184, 118, 37);
		contentPane.add(listar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(312, 243, 112, 37);
		contentPane.add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(212, 349, 2, 2);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(213, 349, 1, 1);
		contentPane.add(table);
		
		final JComboBox consumos = new JComboBox();
		consumos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				consumoS=consumos.getSelectedItem().toString();
			}
		});
		consumos.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "F"}));
		consumos.setBounds(117, 128, 74, 20);
		contentPane.add(consumos);

		
	}
	

}

