package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaComparaciones extends JFrame {

	private JPanel contentPane;
	private Controller controlador;
	private List<JSlider> sliders;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VentanaComparaciones(Controller c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		controlador = c;
		sliders = new ArrayList<>();
		
		JLabel lblquTeParece = new JLabel("\u00BFQu\u00E9 te parece m\u00E1s importante?");
		lblquTeParece.setHorizontalAlignment(SwingConstants.CENTER);
		lblquTeParece.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblquTeParece.setBounds(0, 16, 825, 34);
		contentPane.add(lblquTeParece);
		
		JLabel lblNewLabel = new JLabel("Velocidad");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(25, 80, 70, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblCapacidad.setBounds(270, 80, 80, 20);
		contentPane.add(lblCapacidad);
		
		JSlider slider = new JSlider();
		slider.setMaximum(9);
		slider.setValue(0);
		slider.setMinimum(-9);
		slider.setBounds(99, 80, 165, 26);
		contentPane.add(slider);
		sliders.add(slider);
		
		
		JLabel lblVelocidad = new JLabel("Velocidad");
		lblVelocidad.setBounds(25, 130, 70, 20);
		contentPane.add(lblVelocidad);
		
		JSlider slider_1 = new JSlider();
		slider_1.setValue(0);
		slider_1.setToolTipText("0");
		slider_1.setMinimum(-9);
		slider_1.setMaximum(9);
		slider_1.setBounds(99, 130, 165, 26);
		contentPane.add(slider_1);
		sliders.add(slider_1);
		
		JLabel lblAutonoma = new JLabel("Autonom\u00EDa");
		lblAutonoma.setHorizontalAlignment(SwingConstants.LEFT);
		lblAutonoma.setBounds(270, 130, 80, 20);
		contentPane.add(lblAutonoma);
		
		JLabel label = new JLabel("Velocidad");
		label.setBounds(25, 180, 70, 20);
		contentPane.add(label);
		
		JSlider slider_2 = new JSlider();
		slider_2.setValue(0);
		slider_2.setMinimum(-9);
		slider_2.setMaximum(9);
		slider_2.setBounds(99, 180, 165, 26);
		contentPane.add(slider_2);
		sliders.add(slider_2);

		
		JLabel lblConectividad = new JLabel("Conectividad");
		lblConectividad.setHorizontalAlignment(SwingConstants.LEFT);
		lblConectividad.setBounds(270, 180, 90, 20);
		contentPane.add(lblConectividad);
		
		JLabel label_1 = new JLabel("Velocidad");
		label_1.setBounds(25, 230, 70, 20);
		contentPane.add(label_1);
		
		JSlider slider_3 = new JSlider();
		slider_3.setMinimum(-9);
		slider_3.setMaximum(9);
		slider_3.setValue(0);
		slider_3.setBounds(99, 224, 165, 26);
		contentPane.add(slider_3);
		sliders.add(slider_3);

		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPeso.setBounds(270, 230, 90, 20);
		contentPane.add(lblPeso);
		
		JLabel label_2 = new JLabel("Velocidad");
		label_2.setBounds(25, 280, 70, 20);
		contentPane.add(label_2);
		
		JSlider slider_4 = new JSlider();
		slider_4.setValue(0);
		slider_4.setMinimum(-9);
		slider_4.setMaximum(9);
		slider_4.setBounds(99, 274, 165, 26);
		contentPane.add(slider_4);
		sliders.add(slider_4);

		
		JLabel lblTamaoDePantalla = new JLabel("Tama\u00F1o de pantalla");
		lblTamaoDePantalla.setBounds(270, 280, 148, 20);
		contentPane.add(lblTamaoDePantalla);
		
		JLabel label_3 = new JLabel("Capacidad");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(15, 330, 80, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Autonom\u00EDa");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setBounds(270, 330, 80, 20);
		contentPane.add(label_4);
		
		JSlider slider_5 = new JSlider();
		slider_5.setMinimum(-9);
		slider_5.setMaximum(9);
		slider_5.setValue(0);
		slider_5.setBounds(99, 330, 165, 26);
		contentPane.add(slider_5);
		sliders.add(slider_5);

		
		JLabel label_5 = new JLabel("Capacidad");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(15, 380, 80, 20);
		contentPane.add(label_5);
		
		JSlider slider_6 = new JSlider();
		slider_6.setValue(0);
		slider_6.setMinimum(-9);
		slider_6.setMaximum(9);
		slider_6.setBounds(99, 380, 165, 26);
		contentPane.add(slider_6);
		sliders.add(slider_6);

		
		JLabel label_6 = new JLabel("Conectividad");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setBounds(270, 380, 90, 20);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Capacidad");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(15, 430, 80, 20);
		contentPane.add(label_7);
		
		JSlider slider_7 = new JSlider();
		slider_7.setMinimum(-9);
		slider_7.setMaximum(9);
		slider_7.setValue(0);
		slider_7.setBounds(99, 430, 165, 26);
		contentPane.add(slider_7);
		sliders.add(slider_7);

		
		JLabel label_8 = new JLabel("Peso");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setBounds(270, 430, 90, 20);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Capacidad");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(15, 480, 80, 20);
		contentPane.add(label_9);
		
		JSlider slider_8 = new JSlider();
		slider_8.setMinimum(-9);
		slider_8.setMaximum(9);
		slider_8.setValue(0);
		slider_8.setBounds(99, 480, 165, 26);
		contentPane.add(slider_8);
		sliders.add(slider_8);

		
		JLabel label_10 = new JLabel("Tama\u00F1o de pantalla");
		label_10.setBounds(270, 480, 148, 20);
		contentPane.add(label_10);
		
		JSlider slider_9 = new JSlider();
		slider_9.setMinimum(-9);
		slider_9.setMaximum(9);
		slider_9.setValue(0);
		slider_9.setBounds(558, 80, 165, 26);
		contentPane.add(slider_9);
		sliders.add(slider_9);

		
		JLabel label_11 = new JLabel("Tama\u00F1o de pantalla");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setBounds(377, 80, 177, 20);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Autonom\u00EDa");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setBounds(725, 80, 80, 20);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("Tama\u00F1o de pantalla");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(406, 130, 148, 20);
		contentPane.add(label_13);
		
		JSlider slider_10 = new JSlider();
		slider_10.setValue(0);
		slider_10.setMinimum(-9);
		slider_10.setMaximum(9);
		slider_10.setBounds(558, 130, 165, 26);
		contentPane.add(slider_10);
		sliders.add(slider_10);

		
		JLabel label_14 = new JLabel("Conectividad");
		label_14.setHorizontalAlignment(SwingConstants.LEFT);
		label_14.setBounds(725, 130, 90, 20);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("Tama\u00F1o de pantalla");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setBounds(406, 180, 148, 20);
		contentPane.add(label_15);
		
		JSlider slider_11 = new JSlider();
		slider_11.setMinimum(-9);
		slider_11.setMaximum(9);
		slider_11.setValue(0);
		slider_11.setBounds(558, 180, 165, 26);
		contentPane.add(slider_11);
		sliders.add(slider_11);

		
		JLabel label_16 = new JLabel("Peso");
		label_16.setHorizontalAlignment(SwingConstants.LEFT);
		label_16.setBounds(725, 180, 90, 20);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("Autonom\u00EDa");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setBounds(474, 230, 80, 20);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("Conectividad");
		label_18.setHorizontalAlignment(SwingConstants.LEFT);
		label_18.setBounds(725, 230, 90, 20);
		contentPane.add(label_18);
		
		JSlider slider_12 = new JSlider();
		slider_12.setValue(0);
		slider_12.setMinimum(-9);
		slider_12.setMaximum(9);
		slider_12.setBounds(558, 230, 165, 26);
		contentPane.add(slider_12);
		sliders.add(slider_12);

		
		JLabel label_19 = new JLabel("Autonom\u00EDa");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setBounds(474, 280, 80, 20);
		contentPane.add(label_19);
		
		JSlider slider_13 = new JSlider();
		slider_13.setMinimum(-9);
		slider_13.setMaximum(9);
		slider_13.setValue(0);
		slider_13.setBounds(558, 280, 165, 26);
		contentPane.add(slider_13);
		sliders.add(slider_13);

		
		JLabel label_20 = new JLabel("Peso");
		label_20.setHorizontalAlignment(SwingConstants.LEFT);
		label_20.setBounds(725, 280, 90, 20);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("Conectividad");
		label_21.setHorizontalAlignment(SwingConstants.LEFT);
		label_21.setBounds(464, 330, 90, 20);
		contentPane.add(label_21);
		
		JSlider slider_14 = new JSlider();
		slider_14.setValue(0);
		slider_14.setMinimum(-9);
		slider_14.setMaximum(9);
		slider_14.setBounds(558, 330, 165, 26);
		contentPane.add(slider_14);
		sliders.add(slider_14);

		
		JLabel label_22 = new JLabel("Peso");
		label_22.setHorizontalAlignment(SwingConstants.LEFT);
		label_22.setBounds(725, 330, 90, 20);
		contentPane.add(label_22);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				List<Double> puntajes = new ArrayList<>();
				for (JSlider s : sliders)
				if (s.getValue()<0){
					Double valor=(double) (1/s.getValue());
					puntajes.add(valor);
				}
				else {
					puntajes.add((double) s.getValue());
				}
				controlador.setComparacionPareada(puntajes);
				controlador.buscar();
			}
		});
		btnBuscar.setBounds(582, 426, 115, 29);
		contentPane.add(btnBuscar);
	}
}
