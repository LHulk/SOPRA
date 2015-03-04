package de.uni_muenster.sopra2015.gruppe8.octobus.controller;

import de.uni_muenster.sopra2015.gruppe8.octobus.view.PanelEmployee;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.FrameMain;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.PanelPassenger;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.forms.*;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.*;

import javax.swing.*;
import java.awt.*;

/**
 * Controller for the FrameMain class.
 */
public class ControllerFrameMain extends Controller implements ListenerButton, ListenerUserState, ListenerWindow
{
	private FrameMain frame;

	public ControllerFrameMain(FrameMain frame)
	{
		super();
		this.frame = frame;
	}

	@Override
	public void buttonPressed(EmitterButton emitter)
	{
		switch (emitter)
		{

		}
	}

	@Override
	public void userStateChanged(EmitterUserState emitter)
	{
		switch (emitter)
		{
			case LOGGED_IN:
				ControllerManager.clearListeners();
				addListeners();
				PanelEmployee newPanelEmployee = new PanelEmployee();
				displayContent(newPanelEmployee);
				break;
			case LOGGED_OUT:
				ControllerManager.clearListeners();
				addListeners();
				PanelPassenger newPanelPassenger = new PanelPassenger();
				displayContent(newPanelPassenger);
				break;
		}
	}

	@Override
	public void windowOpen(EmitterWindow emitter)
	{
		JDialog f;
		switch (emitter)
		{
			case FORM_LOGIN:
				f = new FormLogin(frame);
				f.setVisible(true);
				break;

			case FORM_CHANGE_PASSWORD:
				f = new FormChangePassword(frame);
				f.setVisible(true);
				break;

			case FORM_BUS_NEW:
				f = new FormBus(frame, -1);
				f.setVisible(true);
				break;

			case FORM_TICKET_NEW:
				f = new FormTicket(frame, -1);
				f.setVisible(true);
				break;

			case FORM_EMPLOYEE_NEW:
				f = new FormEmployee(frame, -1);
				f.setVisible(true);
				break;
		}
	}

	@Override
	public void windowOpen(EmitterWindow wd, int objectID)
	{
		JDialog f;

		switch (wd)
		{
			case FORM_BUS_EDIT:
				f = new FormBus(frame, objectID);
				f.setVisible(true);
				break;
			case FORM_EMPLOYEE_EDIT:
				f = new FormEmployee(frame, objectID);
				f.setVisible(true);
				break;
			case FORM_TICKET_EDIT:
				f = new FormTicket(frame, objectID);
				f.setVisible(true);
				break;
		}
	}

	@Override
	public void windowClose(EmitterWindow emitter)
	{

	}

	/**
	 * Displays a container in the FrameMain.
	 * @param container Container to be displayed.
	 */
	public void displayContent(Container container)
	{
		Container cp = frame.getContentPane();
		cp.removeAll();
		frame.setContentPane(container);
		frame.setVisible(true);
	}

	@Override
	protected void addListeners()
	{
		ControllerManager.addListener((ListenerButton) this);
		ControllerManager.addListener((ListenerUserState) this);
		ControllerManager.addListener((ListenerWindow) this);
	}

	@Override
	protected void removeListeners()
	{
		ControllerManager.removeListener((ListenerButton) this);
		ControllerManager.removeListener((ListenerUserState) this);
		ControllerManager.removeListener((ListenerWindow) this);
	}
}