package de.uni_muenster.sopra2015.gruppe8.octobus.view.forms;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.form.ControllerFormLogin;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterButton;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jonas on 02.03.2015.
 */
public class FormLogin extends JDialog
{
	private ControllerFormLogin controllerFormLogin;

	private JTextField tfUsername;
	private JPasswordField pfPassword;
	private JLabel lbUsername, lbPassword, lbError;
	private JButton btnLogin, btnCancel;
	private JPanel panel;
	private GridBagConstraints cs;

	public FormLogin(Frame parent)
	{
		super(parent, "Login", true);

		controllerFormLogin = new ControllerFormLogin(this);

		panel = new JPanel(new GridBagLayout());
		cs = new GridBagConstraints();

		lbUsername = new JLabel("Username: ");
		cs.gridx = 0;
		cs.gridy = 0;
		cs.gridwidth = 1;
		panel.add(lbUsername, cs);

		tfUsername = new JTextField(20);
		cs.gridx = 1;
		cs.gridy = 0;
		cs.gridwidth = 2;
		panel.add(tfUsername, cs);

		lbPassword = new JLabel("Password: ");
		cs.gridx = 0;
		cs.gridy = 1;
		cs.gridwidth = 1;
		panel.add(lbPassword, cs);

		pfPassword = new JPasswordField(20);
		cs.gridx = 1;
		cs.gridy = 1;
		cs.gridwidth = 2;
		panel.add(pfPassword, cs);

		String text = " ";
		lbError = new JLabel(text);
		lbError.setForeground(Color.red);
		cs.gridx = 0;
		cs.gridy = 2;
		cs.gridwidth = 3;
		panel.add(lbError, cs);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(e -> {
			controllerFormLogin.buttonPressed(EmitterButton.FORM_LOGIN_LOGIN);
		});

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(e -> {
			controllerFormLogin.buttonPressed(EmitterButton.FORM_LOGIN_CANCEL);
		});
		JPanel bp = new JPanel();
		bp.add(btnLogin);
		bp.add(btnCancel);

		getContentPane().add(panel, BorderLayout.CENTER);
		getContentPane().add(bp, BorderLayout.PAGE_END);

		pack();
		setResizable(false);
		setLocationRelativeTo(parent);
		getRootPane().setDefaultButton(btnLogin);

		setDefaultValues();
	}

	public void illegalInput()
	{
		lbError.setText("Der Username oder das Passwort ist falsch!");
	}

	public String getUsername()
	{
		return tfUsername.getText().trim();
	}

	public String getPassword()
	{
		return new String(pfPassword.getPassword());
	}

	private void setDefaultValues()
	{
		tfUsername.setText("herbert");
		pfPassword.setText("octobus");
	}
}
