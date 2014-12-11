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

public class VentanaBajaTelevisor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField descrip;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBajaTelevisor frame = new VentanaBajaTelevisor();
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
	public VentanaBajaTelevisor() {
		setTitle("BAJA TELEVISOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseDescripcionDel = new JLabel("Ingrese descripcion del Televisor a eliminar:");
		lblIngreseDescripcionDel.setBounds(36, 23, 363, 14);
		contentPane.add(lblIngreseDescripcionDel);
		
		descrip = new JTextField();
		descrip.setBounds(36, 48, 201, 20);
		contentPane.add(descrip);
		descrip.setColumns(10);
		
		JButton eliminar = new JButton("Eliminar");
		eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int b;
				String descripET;
				
				descripET= descrip.getText();
				b=Principal.bajaTele(descripET);
				if(b==0)
				{
				JOptionPane.showMessageDialog(null, "Televisor no encontrado");
				}

			}
		});
		eliminar.setBounds(36, 93, 103, 35);
		contentPane.add(eliminar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
			}
		});
		btnSalir.setBounds(301, 147, 98, 35);
		contentPane.add(btnSalir);
	}

}
