package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\paula\\Documents\\UNI\\TERCERO\\OBJETOS\\AHP\\resources\\icon.png"));
		setTitle("Pc Browser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblquAndsBuscando = new JLabel("Hola! Paula");
		lblquAndsBuscando.setFont(new Font("SansSerif", Font.PLAIN, 24));
		lblquAndsBuscando.setBounds(210, 16, 261, 29);
		contentPane.add(lblquAndsBuscando);
		
		JLabel lblPrecioMximo = new JLabel("Precio m\u00E1ximo");
		lblPrecioMximo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioMximo.setBounds(15, 94, 155, 24);
		contentPane.add(lblPrecioMximo);
		
		textField = new JTextField();
		textField.setBounds(135, 94, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(49, 155, 69, 20);
		contentPane.add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(135, 154, 146, 26);
		contentPane.add(list);
		
		JLabel lblNewLabel_1 = new JLabel("Usos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(49, 209, 69, 20);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Programaci\u00F3n");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(135, 219, 155, 29);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Office");
		rdbtnNewRadioButton_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBounds(135, 255, 155, 29);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Edicion audiovisual");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_2.setBounds(135, 292, 192, 29);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Redes sociales");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_3.setBounds(135, 329, 155, 29);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JLabel lblPantalla = new JLabel("Pantalla");
		lblPantalla.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPantalla.setBounds(402, 94, 69, 20);
		contentPane.add(lblPantalla);
		
		JList list_1 = new JList();
		list_1.setToolTipText("11\r\n11.5\r\n12\r\n12.5\r\n13\r\n13.5\r\n14\r\n14.5\r\n15\r\n15.5\r\n16\r\n16.5");
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBounds(486, 91, 146, 29);
		contentPane.add(list_1);
		
		JLabel lblAutonomahs = new JLabel("Autonom\u00EDa (hs)");
		lblAutonomahs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAutonomahs.setBounds(346, 155, 125, 20);
		contentPane.add(lblAutonomahs);
		
		textField_1 = new JTextField();
		textField_1.setBounds(486, 154, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Conectividad");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(366, 209, 105, 20);
		contentPane.add(lblNewLabel_2);
		
		JList list_2 = new JList();
		list_2.setBounds(486, 209, 146, 32);
		contentPane.add(list_2);
		
		JLabel lblVelocidad = new JLabel("Velocidad");
		lblVelocidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVelocidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVelocidad.setBounds(376, 259, 95, 20);
		contentPane.add(lblVelocidad);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setBounds(486, 255, 155, 26);
		contentPane.add(slider);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPeso.setBounds(402, 312, 69, 20);
		contentPane.add(lblPeso);
		
		JSlider slider_1 = new JSlider();
		slider_1.setValue(0);
		slider_1.setBounds(486, 312, 155, 26);
		contentPane.add(slider_1);
	}
}