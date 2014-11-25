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


public class VentanaBajaLavarropas extends JFrame {

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
					VentanaBajaLavarropas frame = new VentanaBajaLavarropas();
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
	public VentanaBajaLavarropas() {
		setTitle("BAJA LAVARROPAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese descripcion del Lavarropas a eliminar:");
		lblNewLabel.setBounds(25, 23, 234, 14);
		contentPane.add(lblNewLabel);
		
		descrip = new JTextField();
		descrip.setBounds(25, 48, 213, 20);
		contentPane.add(descrip);
		descrip.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				int b;
				String descripEL;
				
				descripEL= descrip.getText();
				b=Principal.bajaLava(descripEL);
				if(b==0)
				{
				JOptionPane.showMessageDialog(null, "Lavarropas no encontrado");
				}
			}
		});
		btnEliminar.setBounds(25, 92, 111, 33);
		contentPane.add(btnEliminar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(274, 148, 111, 33);
		contentPane.add(btnSalir);
	}

}
