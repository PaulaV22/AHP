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
		setBounds(100, 100, 744, 540);
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
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCapacidad.setBounds(366, 357, 105, 20);
		contentPane.add(lblCapacidad);
		
		JSlider slider_2 = new JSlider();
		slider_2.setValue(0);
		slider_2.setBounds(486, 350, 155, 26);
		contentPane.add(slider_2);
		
		JLabel lblProgramacin = new JLabel("Programaci\u00F3n");
		lblProgramacin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProgramacin.setBounds(135, 238, 119, 20);
		contentPane.add(lblProgramacin);
		
		JRadioButton rdbtnNulo = new JRadioButton("Nulo");
		rdbtnNulo.setBounds(71, 259, 69, 29);
		contentPane.add(rdbtnNulo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Medio");
		rdbtnNewRadioButton.setBounds(153, 259, 83, 29);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAlto = new JRadioButton("Alto");
		rdbtnAlto.setBounds(243, 256, 155, 29);
		contentPane.add(rdbtnAlto);
		
		JLabel lblEdicinAudiovisual = new JLabel("Edici\u00F3n audiovisual");
		lblEdicinAudiovisual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdicinAudiovisual.setBounds(135, 296, 155, 20);
		contentPane.add(lblEdicinAudiovisual);
		
		JRadioButton rdbtnNulo_1 = new JRadioButton("Nulo");
		rdbtnNulo_1.setBounds(71, 316, 81, 29);
		contentPane.add(rdbtnNulo_1);
		
		JRadioButton rdbtnMedio = new JRadioButton("Alto");
		rdbtnMedio.setBounds(243, 316, 155, 29);
		contentPane.add(rdbtnMedio);
		
		JRadioButton rdbtnMedio_1 = new JRadioButton("Medio");
		rdbtnMedio_1.setBounds(153, 316, 75, 29);
		contentPane.add(rdbtnMedio_1);
		
		JLabel lblRedesSociales = new JLabel("Redes sociales");
		lblRedesSociales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRedesSociales.setBounds(135, 358, 146, 20);
		contentPane.add(lblRedesSociales);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nulo");
		rdbtnNewRadioButton_2.setBounds(71, 378, 69, 29);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnMedio_2 = new JRadioButton("Medio");
		rdbtnMedio_2.setBounds(153, 378, 83, 29);
		contentPane.add(rdbtnMedio_2);
		
		JRadioButton rdbtnAlto_1 = new JRadioButton("Alto");
		rdbtnAlto_1.setBounds(243, 378, 155, 29);
		contentPane.add(rdbtnAlto_1);
		
		JLabel lblOffice = new JLabel("Office");
		lblOffice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOffice.setBounds(135, 421, 69, 20);
		contentPane.add(lblOffice);
		
		JRadioButton rdbtnNulo_2 = new JRadioButton("Nulo");
		rdbtnNulo_2.setBounds(71, 443, 69, 29);
		contentPane.add(rdbtnNulo_2);
		
		JRadioButton rdbtnMedio_3 = new JRadioButton("Medio");
		rdbtnMedio_3.setBounds(153, 443, 83, 29);
		contentPane.add(rdbtnMedio_3);
		
		JRadioButton rdbtnAlto_2 = new JRadioButton("Alto");
		rdbtnAlto_2.setBounds(243, 443, 155, 29);
		contentPane.add(rdbtnAlto_2);
	}
}
