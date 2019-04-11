import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JavaPizza extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaPizza frame = new JavaPizza();
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
	public JavaPizza() {
		CardLayout cl = new CardLayout();
		setTitle("Java Pizza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		JPanel customerTab = new JPanel();
		tabbedPane.addTab("Customer", null, customerTab, null);
		customerTab.setLayout(null);

		JLabel lblWelcomeToJava = new JLabel("Welcome to Java Pizza");
		lblWelcomeToJava.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWelcomeToJava.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToJava.setBounds(79, 11, 217, 14);
		customerTab.add(lblWelcomeToJava);

		JLabel lblName = new JLabel("Name: ");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(158, 36, 80, 14);
		customerTab.add(lblName);

		txtName = new JTextField();
		txtName.setBounds(94, 61, 186, 20);
		customerTab.add(txtName);
		txtName.setColumns(10);

		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhoneNumber.setBounds(124, 96, 122, 14);
		customerTab.add(lblPhoneNumber);

		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(94, 121, 186, 20);
		customerTab.add(txtPhone);

		JPanel sizeTab = new JPanel();
		tabbedPane.addTab("Size", null, sizeTab, null);
		sizeTab.setLayout(null);

		JLabel lblWhatSizePizza = new JLabel("What Size Pizza?");
		lblWhatSizePizza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWhatSizePizza.setBounds(114, 11, 160, 14);
		sizeTab.add(lblWhatSizePizza);

		JRadioButton rdSmall = new JRadioButton("Small");
		rdSmall.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdSmall.setBounds(56, 54, 82, 23);
		sizeTab.add(rdSmall);

		JRadioButton rdMedium = new JRadioButton("Medium");
		rdMedium.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdMedium.setBounds(161, 54, 100, 23);
		sizeTab.add(rdMedium);

		JRadioButton rdLarge = new JRadioButton("Large");
		rdLarge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdLarge.setBounds(265, 54, 65, 23);
		sizeTab.add(rdLarge);

		JPanel toppingsTab = new JPanel();
		tabbedPane.addTab("Toppings", null, toppingsTab, null);
		toppingsTab.setLayout(null);

		JLabel lblWhatToppingsWould = new JLabel("What toppings would you like?");
		lblWhatToppingsWould.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatToppingsWould.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWhatToppingsWould.setBounds(10, 11, 373, 32);
		toppingsTab.add(lblWhatToppingsWould);

		JCheckBox cbPepperoni = new JCheckBox("Pepperoni");
		cbPepperoni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbPepperoni.setBounds(75, 59, 109, 23);
		toppingsTab.add(cbPepperoni);

		JCheckBox cbSausage = new JCheckBox("Sausage");
		cbSausage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbSausage.setBounds(216, 59, 97, 23);
		toppingsTab.add(cbSausage);

		JCheckBox cbMushroom = new JCheckBox("Mushroom");
		cbMushroom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbMushroom.setBounds(75, 85, 109, 23);
		toppingsTab.add(cbMushroom);

		JCheckBox cbOnion = new JCheckBox("Onion");
		cbOnion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbOnion.setBounds(216, 85, 97, 23);
		toppingsTab.add(cbOnion);

		JPanel totalTab = new JPanel();
		tabbedPane.addTab("Total", null, totalTab, null);
		totalTab.setLayout(null);

		JLabel lblTotalDue = new JLabel("Total Due");
		lblTotalDue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalDue.setBounds(146, 11, 89, 22);
		totalTab.add(lblTotalDue);

		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(93, 55, 53, 19);
		totalTab.add(lblTotal);

		txtTotal = new JTextField();
		txtTotal.setBounds(146, 56, 118, 20);
		totalTab.add(txtTotal);
		txtTotal.setColumns(10);

		JButton btnOrderSummary = new JButton("Order Summary");
		btnOrderSummary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				String ErrorString = "The Following inputs are missing: ", name = "", phoneNumber = "", size = "",
						toppings = "", orderSummary;
				double total = 0.0;
				boolean error = false;

				if (txtName.getText().isEmpty()) {
					ErrorString = ErrorString + "\nName";
					error = true;
				} else
					name = txtName.getText();

				if (txtPhone.getText().isEmpty()) {
					ErrorString = ErrorString + "\nPhone Number";
					error = true;
				} else
					phoneNumber = txtPhone.getText();

				// Check if any size is selected...
				if ((rdSmall.isSelected() == false) && (rdMedium.isSelected() == false)
						&& (rdLarge.isSelected() == false)) {
					ErrorString = ErrorString + "\nYou haven't selected any pizza size";
					error = true;
				} else {
					// Check if only one size type is selected....
					if ((rdSmall.isSelected()) && (rdMedium.isSelected()) && (rdLarge.isSelected()))// If
																									// all
																									// are
																									// selected
					{
						ErrorString = ErrorString + "\nYou can only select one size type";
						error = true;
					} else if (((rdSmall.isSelected()) && (rdMedium.isSelected()))
							|| ((rdLarge.isSelected()) && (rdSmall.isSelected()))
							|| ((rdMedium.isSelected()) && (rdLarge.isSelected())))// If
																					// any
																					// two
																					// are
																					// selected
					{
						ErrorString = ErrorString + "\nYou can only select one size type";
						error = true;
					} else// if only one is selected see which one is selected
							// and set it as size
					{
						if (rdSmall.isSelected())// if small is selected
						{
							size = "Small";
							total = total + 8.00;
						} else if (rdMedium.isSelected())// if medium is
															// selected
						{
							size = "Medium";
							total = total + 10.00;
						} else// if large is selected
						{
							size = "Large";
							total = total + 12.00;
						}
					}
				}

				// Now toppings if any topping is selected add two to the total
				// and and the topping to string toppings
				// Prof. looks like the user is not required to select any
				// topping if they want
				// So I will not check for that.....

				if (cbPepperoni.isSelected()) {
					toppings = toppings + "Pepperoni";
					total = total + 2.00;
				}
				if (cbSausage.isSelected()) {
					toppings = toppings + " Sausage";
					total = total + 2.00;
				}
				if (cbMushroom.isSelected()) {
					toppings = toppings + " Mushroom";
					total = total + 2.00;
				}
				if (cbOnion.isSelected()) {
					toppings = toppings + " Onion";
					total = total + 2.00;
				}

				orderSummary = "Customer Name: " + name + "\nPhone Number: " + phoneNumber + "\nSize: " + size
						+ "\nToppings: " + toppings + "\nTotal: $" + total;
				if (error) {
					JOptionPane.showMessageDialog(null, ErrorString);
				} else {
					
					String totalString = new Double(total).toString();
					txtTotal.setText(totalString);
					txtTotal.setEditable(false);
				
				    JDialog OrderMessage = new JDialog((java.awt.Frame) null, true);
				    OrderMessage.setTitle("Order summary");
				    OrderMessage.setLayout(new BorderLayout());
				    JTextArea TextArea = new JTextArea(orderSummary);
				    TextArea.setEditable(false);
				    TextArea.setColumns(40);
				    TextArea.setRows(10);
				    TextArea.setBackground(null);
				    JScrollPane zScrollPane = new JScrollPane(TextArea);
				    OrderMessage.add(zScrollPane, BorderLayout.CENTER);
				    OrderMessage.revalidate();
				    OrderMessage.pack();
				    OrderMessage.setVisible(true);
				}

				name = "";
				phoneNumber = "";
				size = "";
				toppings = "";
				total = 0.0;
				ErrorString = "";
				orderSummary = "";
				error = false;
			}
		});

		btnOrderSummary.setBounds(125, 98, 128, 23);
		totalTab.add(btnOrderSummary);

	}
}
