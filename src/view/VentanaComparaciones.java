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
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

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
		lblquTeParece.setBounds(0, 4, 825, 34);
		contentPane.add(lblquTeParece);
		
		JLabel lblVelocidadVsCapacidad = new JLabel("Velocidad vs Capacidad");
		lblVelocidadVsCapacidad.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblVelocidadVsCapacidad.setBounds(10, 50, 340, 20);
		contentPane.add(lblVelocidadVsCapacidad);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La velocidad y la capacidad son igual de importantes";
				else{
					if(valor>1)
						texto="La velocidad es "+valor+" veces mas importante que la capacidad";
					else
						texto="La capacidad es "+valor*-1+" veces mas importante que la velocidad";
				}
				lblVelocidadVsCapacidad.setText(texto);
			}
		});
		slider.setMaximum(9);
		slider.setValue(0);
		slider.setMinimum(-9);
		slider.setBounds(99, 65, 165, 26);
		contentPane.add(slider);
		sliders.add(slider);
		
		
		JLabel lblVelocidadVsAutonomia = new JLabel("Velocidad vs Autonomía");
		lblVelocidadVsAutonomia.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblVelocidadVsAutonomia.setBounds(10, 100, 340, 20);
		contentPane.add(lblVelocidadVsAutonomia);
		
		JSlider slider_1 = new JSlider();
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_1.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La velocidad y la autonomia son igual de importantes";
				else{
					if(valor>1)
						texto="La velocidad es "+valor+" veces mas importante que la autonomia";
					else
						texto="La autonomia es "+valor*-1+" veces mas importante que la velocidad";
				}
				lblVelocidadVsAutonomia.setText(texto);
			}
		});
		slider_1.setValue(0);
		slider_1.setToolTipText("0");
		slider_1.setMinimum(-9);
		slider_1.setMaximum(9);
		slider_1.setBounds(99, 115, 165, 26);
		contentPane.add(slider_1);
		sliders.add(slider_1);
		
		JLabel lblVelocidadVsConectividad = new JLabel("Velocidad vs Conectividad");
		lblVelocidadVsConectividad.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblVelocidadVsConectividad.setBounds(10, 150, 340, 20);
		contentPane.add(lblVelocidadVsConectividad);
		
		JSlider slider_2 = new JSlider();
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_2.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La velocidad y la conectividad son igual de importantes";
				else{
					if(valor>1)
						texto="La velocidad es "+valor+" veces mas importante que la conectividad";
					else
						texto="La conectividad es "+valor*-1+" veces mas importante que la velocidad";
				}
				lblVelocidadVsConectividad.setText(texto);
			}
		});
		slider_2.setValue(0);
		slider_2.setMinimum(-9);
		slider_2.setMaximum(9);
		slider_2.setBounds(99, 165, 165, 26);
		contentPane.add(slider_2);
		sliders.add(slider_2);
		
		JLabel lblVelocidadVsPeso = new JLabel("Velocidad vs Peso");
		lblVelocidadVsPeso.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblVelocidadVsPeso.setBounds(10, 200, 340, 20);
		contentPane.add(lblVelocidadVsPeso);
		
		JSlider slider_3 = new JSlider();
		slider_3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_3.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La velocidad y el peso son igual de importantes";
				else{
					if(valor>1)
						texto="La velocidad es "+valor+" veces mas importante que el peso";
					else
						texto="El peso es "+valor*-1+" veces mas importante que la velocidad";
				}
				lblVelocidadVsPeso.setText(texto);
			}
		});
		slider_3.setMinimum(-9);
		slider_3.setMaximum(9);
		slider_3.setValue(0);
		slider_3.setBounds(99, 215, 165, 26);
		contentPane.add(slider_3);
		sliders.add(slider_3);
		
		JLabel lblVelocidadVsPantalla = new JLabel("Velocidad vs Tamaño de pantalla");
		lblVelocidadVsPantalla.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblVelocidadVsPantalla.setBounds(10, 250, 372, 20);
		contentPane.add(lblVelocidadVsPantalla);
		
		JSlider slider_4 = new JSlider();
		slider_4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_4.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La velocidad y el tamaño de la pantalla son igual de importantes";
				else{
					if(valor>1)
						texto="La velocidad es "+valor+" veces mas importante que el tamaño de la pantalla";
					else
						texto="El tamaño de la pantalla es "+valor*-1+" veces mas importante que la velocidad";
				}
				lblVelocidadVsPantalla.setText(texto);
			}
		});
		slider_4.setValue(0);
		slider_4.setMinimum(-9);
		slider_4.setMaximum(9);
		slider_4.setBounds(99, 265, 165, 26);
		contentPane.add(slider_4);
		sliders.add(slider_4);
		
		JLabel lblCapacidadVsAutonoma = new JLabel("Capacidad vs Autonomía");
		lblCapacidadVsAutonoma.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblCapacidadVsAutonoma.setHorizontalAlignment(SwingConstants.LEFT);
		lblCapacidadVsAutonoma.setBounds(10, 300, 340, 20);
		contentPane.add(lblCapacidadVsAutonoma);
		
		JSlider slider_5 = new JSlider();
		slider_5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_5.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La capacidad y la autonomia son igual de importantes";
				else{
					if(valor>1)
						texto="La capacidad es "+valor+" veces mas importante que la autonomia";
					else
						texto="La autonomia es "+valor*-1+" veces mas importante que la capacidad";
				}
				lblCapacidadVsAutonoma.setText(texto);
			}
		});
		slider_5.setMinimum(-9);
		slider_5.setMaximum(9);
		slider_5.setValue(0);
		slider_5.setBounds(99, 315, 165, 26);
		contentPane.add(slider_5);
		sliders.add(slider_5);

		
		JLabel lblCapacidadVsConectividad = new JLabel("Capacidad vs Conectividad");
		lblCapacidadVsConectividad.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblCapacidadVsConectividad.setHorizontalAlignment(SwingConstants.LEFT);
		lblCapacidadVsConectividad.setBounds(10, 350, 340, 20);
		contentPane.add(lblCapacidadVsConectividad);
		
		JSlider slider_6 = new JSlider();
		slider_6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_6.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La capacidad y la conectividad son igual de importantes";
				else{
					if(valor>1)
						texto="La capacidad es "+valor+" veces mas importante que la conectividad";
					else
						texto="La conectividad es "+valor*-1+" veces mas importante que la capacidad";
				}
				lblCapacidadVsConectividad.setText(texto);
			}
		});
		slider_6.setValue(0);
		slider_6.setMinimum(-9);
		slider_6.setMaximum(9);
		slider_6.setBounds(99, 365, 165, 26);
		contentPane.add(slider_6);
		sliders.add(slider_6);
		
		JLabel lblCapacidadVsPeso = new JLabel("Capacidad vs Peso");
		lblCapacidadVsPeso.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblCapacidadVsPeso.setHorizontalAlignment(SwingConstants.LEFT);
		lblCapacidadVsPeso.setBounds(10, 400, 340, 20);
		contentPane.add(lblCapacidadVsPeso);
		
		JSlider slider_7 = new JSlider();
		slider_7.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_7.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La capacidad y el peso son igual de importantes";
				else{
					if(valor>1)
						texto="La capacidad es "+valor+" veces mas importante que el peso";
					else
						texto="El peso es "+valor*-1+" veces mas importante que la capacidad";
				}
				lblCapacidadVsPeso.setText(texto);
			}
		});
		slider_7.setMinimum(-9);
		slider_7.setMaximum(9);
		slider_7.setValue(0);
		slider_7.setBounds(99, 415, 165, 26);
		contentPane.add(slider_7);
		sliders.add(slider_7);
		
		JLabel lblCapacidadVsPantalla = new JLabel("Capacidad vs Tamaño de pantalla");
		lblCapacidadVsPantalla.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblCapacidadVsPantalla.setHorizontalAlignment(SwingConstants.LEFT);
		lblCapacidadVsPantalla.setBounds(10, 450, 396, 20);
		contentPane.add(lblCapacidadVsPantalla);
		
		JSlider slider_8 = new JSlider();
		slider_8.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_8.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La capacidad y la tamaño de la pantalla son igual de importantes";
				else{
					if(valor>1)
						texto="La capacidad es "+valor+" veces mas importante que el tamaño de la pantalla";
					else
						texto="El tamaño de la pantalla es "+valor*-1+" veces mas importante que la capacidad";
				}
				lblCapacidadVsPantalla.setText(texto);
			}
		});
		slider_8.setMinimum(-9);
		slider_8.setMaximum(9);
		slider_8.setValue(0);
		slider_8.setBounds(99, 465, 165, 26);
		contentPane.add(slider_8);
		sliders.add(slider_8);
		
		JLabel lblPantallaVsAutonomia = new JLabel("Tamaño de pantalla vs Autonomía");
		lblPantallaVsAutonomia.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblPantallaVsAutonomia.setHorizontalAlignment(SwingConstants.LEFT);
		lblPantallaVsAutonomia.setBounds(400, 50, 396, 20);
		contentPane.add(lblPantallaVsAutonomia);
		
		JSlider slider_9 = new JSlider();
		slider_9.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_9.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="El tamaño de la pantalla y la autonomia son igual de importantes";
				else{
					if(valor>1)
						texto="El tamaño de la pantalla es "+valor+" veces mas importante que la autonomia";
					else
						texto="La autonomia es "+valor*-1+" veces mas importante que el tamaño de la pantalla";
				}
				lblPantallaVsAutonomia.setText(texto);
			}
		});
		slider_9.setMinimum(-9);
		slider_9.setMaximum(9);
		slider_9.setValue(0);
		slider_9.setBounds(558, 65, 165, 26);
		contentPane.add(slider_9);
		sliders.add(slider_9);
		
		JLabel lblPantallaVsConectividad = new JLabel("Tamaño de pantalla vs Conectividad");
		lblPantallaVsConectividad.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblPantallaVsConectividad.setHorizontalAlignment(SwingConstants.LEFT);
		lblPantallaVsConectividad.setBounds(400, 100, 396, 20);
		contentPane.add(lblPantallaVsConectividad);
		
		JSlider slider_10 = new JSlider();
		slider_10.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_10.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="El tamaño de la pantalla y la conectividad son igual de importantes";
				else{
					if(valor>1)
						texto="El tamaño de la pantalla es "+valor+" veces mas importante que la conectividad";
					else
						texto="La conectividad es "+valor*-1+" veces mas importante que el tamaño de la pantalla";
				}
				lblPantallaVsConectividad.setText(texto);
			}
		});
		slider_10.setValue(0);
		slider_10.setMinimum(-9);
		slider_10.setMaximum(9);
		slider_10.setBounds(558, 115, 165, 26);
		contentPane.add(slider_10);
		sliders.add(slider_10);
		
		JLabel lblPantallaVsPeso = new JLabel("Tamaño de pantalla vs Peso");
		lblPantallaVsPeso.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblPantallaVsPeso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPantallaVsPeso.setBounds(400, 150, 396, 20);
		contentPane.add(lblPantallaVsPeso);
		
		JSlider slider_11 = new JSlider();
		slider_11.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_11.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="El tamaño de la pantalla y el peso son igual de importantes";
				else{
					if(valor>1)
						texto="El tamaño de la pantalla es "+valor+" veces mas importante que el peso";
					else
						texto="El peso es "+valor*-1+" veces mas importante que el tamaño de la pantalla";
				}
				lblPantallaVsPeso.setText(texto);
			}
		});
		slider_11.setMinimum(-9);
		slider_11.setMaximum(9);
		slider_11.setValue(0);
		slider_11.setBounds(558, 165, 165, 26);
		contentPane.add(slider_11);
		sliders.add(slider_11);
		
		JLabel lblAutonomaVsConectividad = new JLabel("Autonomía vs Conectividad");
		lblAutonomaVsConectividad.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblAutonomaVsConectividad.setHorizontalAlignment(SwingConstants.LEFT);
		lblAutonomaVsConectividad.setBounds(400, 200, 350, 20);
		contentPane.add(lblAutonomaVsConectividad);
		
		JSlider slider_12 = new JSlider();
		slider_12.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_12.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La autonomia y la conectividad son igual de importantes";
				else{
					if(valor>1)
						texto="La autonomia es "+valor+" veces mas importante que la conectividad";
					else
						texto="La conectividad es "+valor*-1+" veces mas importante que la autonomia";
				}
				lblAutonomaVsConectividad.setText(texto);
			}
		});
		slider_12.setValue(0);
		slider_12.setMinimum(-9);
		slider_12.setMaximum(9);
		slider_12.setBounds(558, 215, 165, 26);
		contentPane.add(slider_12);
		sliders.add(slider_12);

		
		JLabel lblAutonomaVsPeso = new JLabel("Autonomía vs Peso");
		lblAutonomaVsPeso.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblAutonomaVsPeso.setHorizontalAlignment(SwingConstants.LEFT);
		lblAutonomaVsPeso.setBounds(400, 250, 350, 20);
		contentPane.add(lblAutonomaVsPeso);
		
		JSlider slider_13 = new JSlider();
		slider_13.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_13.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La autonomia y el peso son igual de importantes";
				else{
					if(valor>1)
						texto="La autonomia es "+valor+" veces mas importante que el peso";
					else
						texto="El peso es "+valor*-1+" veces mas importante que la autonomia";
				}
				lblAutonomaVsPeso.setText(texto);
			}
		});
		slider_13.setMinimum(-9);
		slider_13.setMaximum(9);
		slider_13.setValue(0);
		slider_13.setBounds(558, 265, 165, 26);
		contentPane.add(slider_13);
		sliders.add(slider_13);
		
		JLabel lblConectividadVsPeso = new JLabel("Conectividad vs Peso");
		lblConectividadVsPeso.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblConectividadVsPeso.setHorizontalAlignment(SwingConstants.LEFT);
		lblConectividadVsPeso.setBounds(400, 300, 350, 20);
		contentPane.add(lblConectividadVsPeso);
		
		JSlider slider_14 = new JSlider();
		slider_14.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String texto;
				int valor=slider_14.getValue();
				if((valor<=1)&&(valor>=-1))
					texto="La conectividad y el peso son igual de importantes";
				else{
					if(valor>1)
						texto="La conectividad es "+valor+" veces mas importante que el peso";
					else
						texto="El peso es "+valor*-1+" veces mas importante que la conectividad";
				}
				lblConectividadVsPeso.setText(texto);
			}
		});
		slider_14.setValue(0);
		slider_14.setMinimum(-9);
		slider_14.setMaximum(9);
		slider_14.setBounds(558, 315, 165, 26);
		contentPane.add(slider_14);
		sliders.add(slider_14);
		
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
