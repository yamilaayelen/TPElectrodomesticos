package ventanas;

import tp.*;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;


public class MostrarListaT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarListaT frame = new MostrarListaT();
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
	public MostrarListaT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 258, 435, -259);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(12, 10, 412, 237);
		contentPane.add(table);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(164, 290, 89, 23);
		contentPane.add(btnSalir);
	}
	
	public void listar(ArrayList<Television> lista)
	{
		ListaTelevisores tablaT =new ListaTelevisores();
		tablaT.setDataSource(lista);
		table.setModel(tablaT);
			
			
		//crear el tablemodel (Lista Televisores)
		//Asignarle l como datasource(setDataSource)
		//asignarle al jtabl el datasource
	}
}
