package ventanas;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setForeground(Color.LIGHT_GRAY);
		setTitle("MENU ELECTRODOMESTICOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAltaLavarropas = new JButton("Alta Lavarropas");
		btnAltaLavarropas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaAltaLavarropas altaL = new VentanaAltaLavarropas();
				altaL.setVisible(true);
			}

		});
		btnAltaLavarropas.setBounds(10, 30, 195, 48);
		contentPane.add(btnAltaLavarropas);
		
		JButton btnAltaTelevisores = new JButton("Alta Televisores");
		btnAltaTelevisores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaAltaTelevision altaT = new VentanaAltaTelevision();
				altaT.setVisible(true);
			}
		});
		btnAltaTelevisores.setBounds(215, 30, 172, 48);
		contentPane.add(btnAltaTelevisores);
		
		JButton btnModifca = new JButton("Modifca Lavarropas");
		btnModifca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaModificaLavarropa modificaL = new VentanaModificaLavarropa();
				modificaL.setVisible(true);
			}
		});
		btnModifca.setBounds(10, 89, 195, 39);
		contentPane.add(btnModifca);
		
		JButton btnModificaTelevisores = new JButton("Modifica Televisor");
		btnModificaTelevisores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaModificaTelevisor modificaT = new VentanaModificaTelevisor();
				modificaT.setVisible(true);
			}
		});
		btnModificaTelevisores.setBounds(215, 89, 172, 39);
		contentPane.add(btnModificaTelevisores);
		
		JButton btnBajaLavarropas = new JButton("Baja Lavarropas");
		btnBajaLavarropas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaBajaLavarropas bajaL = new VentanaBajaLavarropas();
				bajaL.setVisible(true);
			}
		});
		btnBajaLavarropas.setBounds(10, 139, 195, 48);
		contentPane.add(btnBajaLavarropas);
		
		JButton btnBajaTelevisores = new JButton("Baja Televisor");
		btnBajaTelevisores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				VentanaBajaTelevisor bajaT = new VentanaBajaTelevisor();
				bajaT.setVisible(true);
			}
		});
		btnBajaTelevisores.setBounds(215, 139, 172, 48);
		contentPane.add(btnBajaTelevisores);
		
		JButton listaLavas = new JButton("Listado Lavarropas");
		listaLavas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaListaLavarropas listaL = new VentanaListaLavarropas();
				listaL.setVisible(true);
			}
		});
		listaLavas.setBounds(10, 198, 195, 44);
		contentPane.add(listaLavas);
		
		JButton listaTeles = new JButton("Listado Televisores");
		listaTeles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaListaTelevisores listaT = new VentanaListaTelevisores();
				listaT.setVisible(true);
			}
		});
		listaTeles.setBounds(215, 198, 172, 44);
		contentPane.add(listaTeles);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnNewButton.setBounds(270, 277, 117, 44);
		contentPane.add(btnNewButton);
		}
}