package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;
import model.filtros.Filtro;
import model.filtros.Igual;
import model.filtros.Menor;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.beans.PropertyChangeEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaInicial extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldPrecioMax;
	private JTextField textFieldAutonomia;
	private static Controller controlador;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controlador = new Controller();
					VentanaInicial frame = new VentanaInicial();
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
	public VentanaInicial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
		setTitle("Pc Browser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblquAndsBuscando = new JLabel("\u00BFQu\u00E9 est\u00E1s buscando?");
		lblquAndsBuscando.setHorizontalAlignment(SwingConstants.CENTER);
		lblquAndsBuscando.setFont(new Font("SansSerif", Font.PLAIN, 24));
		lblquAndsBuscando.setBounds(15, 16, 795, 29);
		contentPane.add(lblquAndsBuscando);
		
		JLabel lblPrecioMaximo = new JLabel("Precio m\u00E1ximo");
		lblPrecioMaximo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioMaximo.setBounds(15, 94, 155, 24);
		contentPane.add(lblPrecioMaximo);
		
		textFieldPrecioMax = new JTextField();		
		textFieldPrecioMax.setText("0.0");
		textFieldPrecioMax.setBounds(135, 94, 146, 26);
		contentPane.add(textFieldPrecioMax);
		textFieldPrecioMax.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(50, 156, 69, 20);
		contentPane.add(lblNewLabel);
		
		JComboBox listMarcas = new JComboBox();
		listMarcas.setModel(new DefaultComboBoxModel(new String[] {"No se", "Acer", "Compaq", "Dell", "HP", "Lenovo", "Mac", "Samsung", "Vaio"}));
		listMarcas.setBounds(135, 154, 146, 26);
		contentPane.add(listMarcas);
		
		JLabel lblNewLabel_1 = new JLabel("Usos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(611, 94, 125, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPantalla = new JLabel("Pantalla");
		lblPantalla.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPantalla.setBounds(50, 394, 69, 20);
		contentPane.add(lblPantalla);
		
		JLabel lblAutonomahs = new JLabel("Autonom\u00EDa");
		lblAutonomahs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAutonomahs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAutonomahs.setBounds(24, 454, 95, 20);
		contentPane.add(lblAutonomahs);
		
		textFieldAutonomia = new JTextField();
		textFieldAutonomia.setText("0.0");
		textFieldAutonomia.setBounds(135, 452, 73, 26);
		contentPane.add(textFieldAutonomia);
		textFieldAutonomia.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Conectividad");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(381, 94, 125, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblVelocidad = new JLabel("Velocidad");
		lblVelocidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVelocidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVelocidad.setBounds(24, 214, 95, 20);
		contentPane.add(lblVelocidad);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setBounds(135, 214, 146, 26);
		contentPane.add(slider);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPeso.setBounds(50, 274, 69, 20);
		contentPane.add(lblPeso);
		
		JSlider slider_1 = new JSlider();
		slider_1.setValue(0);
		slider_1.setBounds(135, 274, 146, 26);
		contentPane.add(slider_1);
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCapacidad.setBounds(14, 334, 105, 20);
		contentPane.add(lblCapacidad);
		
		JSlider slider_2 = new JSlider();
		slider_2.setMaximum(1000000);
		slider_2.setMinimum(150);
		slider_2.setValue(0);
		slider_2.setBounds(135, 334, 146, 26);
		contentPane.add(slider_2);
		
		JLabel lblProgramacin = new JLabel("Programaci\u00F3n");
		lblProgramacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgramacin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProgramacin.setBounds(600, 130, 155, 20);
		contentPane.add(lblProgramacin);
		
		JRadioButton rdbtnNulo = new JRadioButton("Nulo");
		rdbtnNulo.setBounds(562, 153, 69, 29);
		contentPane.add(rdbtnNulo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Medio");
		rdbtnNewRadioButton.setBounds(638, 153, 83, 29);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAlto = new JRadioButton("Alto");
		rdbtnAlto.setBounds(728, 153, 73, 29);
		contentPane.add(rdbtnAlto);
		
		JLabel lblEdicinAudiovisual = new JLabel("Edici\u00F3n audiovisual");
		lblEdicinAudiovisual.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdicinAudiovisual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdicinAudiovisual.setBounds(600, 197, 155, 20);
		contentPane.add(lblEdicinAudiovisual);
		
		JRadioButton rdbtnNulo_1 = new JRadioButton("Nulo");
		rdbtnNulo_1.setBounds(562, 229, 69, 29);
		contentPane.add(rdbtnNulo_1);
		
		JRadioButton rdbtnMedio = new JRadioButton("Alto");
		rdbtnMedio.setBounds(728, 229, 73, 29);
		contentPane.add(rdbtnMedio);
		
		JRadioButton rdbtnMedio_1 = new JRadioButton("Medio");
		rdbtnMedio_1.setBounds(638, 229, 75, 29);
		contentPane.add(rdbtnMedio_1);
		
		JLabel lblRedesSociales = new JLabel("Redes sociales");
		lblRedesSociales.setHorizontalAlignment(SwingConstants.CENTER);
		lblRedesSociales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRedesSociales.setBounds(600, 273, 155, 20);
		contentPane.add(lblRedesSociales);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nulo");
		rdbtnNewRadioButton_2.setBounds(562, 305, 69, 29);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnMedio_2 = new JRadioButton("Medio");
		rdbtnMedio_2.setBounds(638, 305, 83, 29);
		contentPane.add(rdbtnMedio_2);
		
		JRadioButton rdbtnAlto_1 = new JRadioButton("Alto");
		rdbtnAlto_1.setBounds(728, 305, 155, 29);
		contentPane.add(rdbtnAlto_1);
		
		JLabel lblOffice = new JLabel("Office");
		lblOffice.setHorizontalAlignment(SwingConstants.CENTER);
		lblOffice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOffice.setBounds(600, 340, 155, 20);
		contentPane.add(lblOffice);
		
		JRadioButton rdbtnNulo_2 = new JRadioButton("Nulo");
		rdbtnNulo_2.setBounds(562, 372, 69, 29);
		contentPane.add(rdbtnNulo_2);
		
		JRadioButton rdbtnMedio_3 = new JRadioButton("Medio");
		rdbtnMedio_3.setBounds(638, 372, 83, 29);
		contentPane.add(rdbtnMedio_3);
		
		JRadioButton rdbtnAlto_2 = new JRadioButton("Alto");
		rdbtnAlto_2.setBounds(728, 372, 155, 29);
		contentPane.add(rdbtnAlto_2);
				
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"13.0", "13.5", "14.0", "14.5", "15.0", "15.5", "16.0"}));
		comboBox.setBounds(135, 394, 146, 26);
		contentPane.add(comboBox);
		
		JLabel lblHs = new JLabel("hs");
		lblHs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHs.setBounds(212, 454, 38, 20);
		contentPane.add(lblHs);
		
		JRadioButton rdbtnWifi = new JRadioButton("WiFi");
		rdbtnWifi.setBounds(381, 154, 155, 29);
		contentPane.add(rdbtnWifi);
		
		JRadioButton rdbtnHdmi = new JRadioButton("HDMI");
		rdbtnHdmi.setBounds(381, 214, 83, 29);
		contentPane.add(rdbtnHdmi);
		
		JRadioButton rdbtnCddvd = new JRadioButton("CD/DVD");
		rdbtnCddvd.setBounds(381, 274, 95, 29);
		contentPane.add(rdbtnCddvd);
		
		JRadioButton rdbtnUsb = new JRadioButton("USB");
		rdbtnUsb.setBounds(381, 334, 69, 29);
		contentPane.add(rdbtnUsb);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_1.setBounds(456, 334, 50, 26);
		contentPane.add(comboBox_1);
		
		JRadioButton rdbtnBluethoot = new JRadioButton("Bluethoot");
		rdbtnBluethoot.setBounds(381, 394, 105, 29);
		contentPane.add(rdbtnBluethoot);
		
		JButton btnBuscar = new JButton("Siguiente");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Double preciomax = Double.valueOf(textFieldPrecioMax.getText());
				List <Filtro> filtros = new ArrayList<>();
				if (!preciomax.equals(0.0)){
					Filtro preciomenor = new Menor ("precio", preciomax);
					filtros.add(preciomenor);
				}
				if (!listMarcas.getSelectedItem().toString().equals("No se")){
					Filtro marcaigual = new Igual ("marca",listMarcas.getSelectedItem().toString());
					filtros.add(marcaigual);
				}
				//VER FILTROS DE LOS USOS DEPENDE DE LO QUE INVESTIGUEMOS DE LOS PROGRAMAS
				
				controlador.setFiltros(filtros);
				//VER DE PASARLE CADA DATO INGRESADO AL CONTROLADOR
				//List<Object> datos = new ArrayList<>();
				
				
				VentanaComparaciones vc = new VentanaComparaciones(controlador);
				vc.show();
			}
			
		});

		
		btnBuscar.setBounds(621, 451, 115, 29);
		contentPane.add(btnBuscar);
		
		
	}
}
