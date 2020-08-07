package randomizer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RLrandomizer {
	
	private JFrame frame;
	private int FOV;
	private JTextField FOVtextField;
	
	private int distance;
	private JTextField distanceTextField;
	
	private int height;
	private JTextField heightTextField;
	
	private int angle;
	private JTextField angleTextField;
	
	private double stiffness;
	private JTextField stiffnessTextField;
	
	private double swivSpeed;
	private JTextField swivSpeedTextField;
	
	private double transSpeed;
	private JTextField transSpeedTextField;
	
	





	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RLrandomizer window = new RLrandomizer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RLrandomizer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JButton btnGenerate = new JButton("GENERATE");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setTags();
			}
		});
		
		btnGenerate.setBounds(175, 260, 100, 23);
		
		frame.getContentPane().add(btnGenerate);
		
		JLabel FOVLabel = new JLabel("Field of View:");
		FOVLabel.setBounds(33, 27, 100, 14);
		frame.getContentPane().add(FOVLabel);
		
		FOVtextField = new JTextField();
		FOVtextField.setBounds(150, 24, 86, 20);
		frame.getContentPane().add(FOVtextField);
		FOVtextField.setColumns(10);
		
		JLabel distanceLabel = new JLabel("Distance:");
		distanceLabel.setBounds(33, 55, 100, 14);
		frame.getContentPane().add(distanceLabel);
		
		distanceTextField = new JTextField();
		distanceTextField.setColumns(10);
		distanceTextField.setBounds(150, 52, 86, 20);
		frame.getContentPane().add(distanceTextField);
		
		JLabel heightLabel = new JLabel("Height:");
		heightLabel.setBounds(33, 83, 100, 14);
		frame.getContentPane().add(heightLabel);
		
		heightTextField = new JTextField();
		heightTextField.setColumns(10);
		heightTextField.setBounds(150, 80, 86, 20);
		frame.getContentPane().add(heightTextField);
		
		JLabel angleLabel = new JLabel("Angle:");
		angleLabel.setBounds(33, 111, 100, 14);
		frame.getContentPane().add(angleLabel);
		
		angleTextField = new JTextField();
		angleTextField.setColumns(10);
		angleTextField.setBounds(150, 108, 86, 20);
		frame.getContentPane().add(angleTextField);
		
		JLabel stiffnessLabel = new JLabel("Stiffness:");
		stiffnessLabel.setBounds(33, 139, 100, 14);
		frame.getContentPane().add(stiffnessLabel);
		
		stiffnessTextField = new JTextField();
		stiffnessTextField.setColumns(10);
		stiffnessTextField.setBounds(150, 136, 86, 20);
		frame.getContentPane().add(stiffnessTextField);
		
		JLabel swivSpeedLabel = new JLabel("Swivel Speed:");
		swivSpeedLabel.setBounds(33, 167, 100, 14);
		frame.getContentPane().add(swivSpeedLabel);
		
		swivSpeedTextField = new JTextField();
		swivSpeedTextField.setColumns(10);
		swivSpeedTextField.setBounds(150, 164, 86, 20);
		frame.getContentPane().add(swivSpeedTextField);
		
		JLabel transSpeedLabel = new JLabel("Transition Speed:");
		transSpeedLabel.setBounds(33, 195, 100, 14);
		frame.getContentPane().add(transSpeedLabel);
		
		transSpeedTextField = new JTextField();
		transSpeedTextField.setColumns(10);
		transSpeedTextField.setBounds(150, 192, 86, 20);
		frame.getContentPane().add(transSpeedTextField);
	}
	
	private void setTags() {
		System.out.println("btn pressed");
		
		FOV =(int) (Math.random()*100);
		
		FOVtextField.setText(Integer.toString(FOV));
		
		
	}
}
