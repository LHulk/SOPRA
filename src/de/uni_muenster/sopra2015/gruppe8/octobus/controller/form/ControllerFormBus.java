package de.uni_muenster.sopra2015.gruppe8.octobus.controller.form;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.Controller;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.ControllerDatabase;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.ControllerManager;
import de.uni_muenster.sopra2015.gruppe8.octobus.model.Bus;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.forms.FormBus;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterButton;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.ListenerButton;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;

/**
 * Created by Lars on 02-Mar-15.
 */
public class ControllerFormBus extends Controller implements ListenerButton
{
	private ControllerDatabase controllerDatabase;
	private FormBus formBus;
	private int objectID;
	private Bus bus;

	public ControllerFormBus(FormBus formBus, int objectID){
		super();
		controllerDatabase = ControllerDatabase.getInstance();
		this.objectID = objectID;
		this.formBus = formBus;
		if(objectID != -1)
		{
			setBusById();
		}
	}

	@Override
	public void buttonPressed(EmitterButton emitter)
	{
		switch (emitter)
		{
			case FORM_BUS_SAVE:
				if(parseValuesFromForm())
				{
					if(saveToDB())
					{
						closeDialog();
					}
				}
				break;
			case FORM_BUS_CANCEL:
				//TODO: If time: Check if something was changed and ask if user really wants to cancel
				closeDialog();
				break;
		}
	}

	/**
	 * Fetch a Bus object from the DB.
	 * @param id Bus-ID.
	 */
	private void setBusById()
	{
		bus = controllerDatabase.getBus(objectID);
	}

	/**
	 * Inserts the values of the Bus which is going to
	 * be changed into the form.
	 */
	public void insertValuesIntoForm()
	{
		if(objectID != -1)
		{
			formBus.setLicencePlate(bus.getLicencePlate());
			formBus.setNumberOfSeats(bus.getNumberOfSeats());
			formBus.setStandingRoom(bus.getStandingRoom());
			formBus.setManufacturer(bus.getManufacturer());
			formBus.setModel(bus.getModel());
			formBus.setNextInspectionDue(bus.getNextInspectionDue());
			formBus.setArticulatedBus(bus.isArticulatedBus());
		}
	}

	private boolean parseValuesFromForm()
	{
		if(objectID == -1)
		{
			//TODO empty constructor
			bus = new Bus("TestNummernschild", 42, 32, "Ich", "cooler Bus", new Date(2015, 5, 29), true);
		}
		String licencePlate = formBus.getLicencePlate();
		int numberOfSeats = formBus.getNumberOfSeats();
		int standingRoom = formBus.getStandingRoom();
		String manufacturer = formBus.getManufacturer();
		String model = formBus.getModel();
		Date nextInspectionDue = formBus.getNextInspectionDue();
		boolean articulatedBus = formBus.getArticulatedBus();

		ArrayList<String> errorFields = new ArrayList<>();
		if(licencePlate.trim().length() == 0)
			errorFields.add("Das Kennzeichen darf nicht leer sein.");
		else if(licencePlate.trim().length() < 5)
			errorFields.add("Das Kennzeichen muss mindestens 5 Zeichen umfassen.");
		else if(licencePlate.length() > 20)
			errorFields.add("Das Kennzeichen darf nicht mehr als 20 Zeichen umfassen.");
		if(numberOfSeats == -1)
			errorFields.add("Die Anzahl der Sitzplätze ist keine gültige Zahl");
		if(standingRoom == -1)
			errorFields.add("Die Anzahl der Stehplätze ist keine gültige Zahl.");
		if(manufacturer.trim().length() == 0)
			errorFields.add("Der Hersteller-Name darf nicht leer sein.");
		if(model.trim().length() == 0)
			errorFields.add("Der Modell-Name darf nicht leer sein.");
		if(nextInspectionDue == null)
			errorFields.add("Das Datum der nächsten Inspektion ist in keinem gültigen Format.");

		if(errorFields.size() > 0)
		{
			String errorMessage = "Die eingegeben Daten sind nicht gültig.\n";
			errorMessage += errorListToString(errorFields);
			formBus.showErrorForm(errorMessage);
			return false;
		}
		else
		{
			bus.setLicencePlate(licencePlate);
			bus.setNumberOfSeats(numberOfSeats);
			bus.setStandingRoom(standingRoom);
			bus.setManufacturer(manufacturer);
			bus.setModel(model);
			bus.setNextInspectionDue(nextInspectionDue);
			bus.setArticulatedBus(articulatedBus);
			//TODO Update into databse
			return true;
		}
	}

	private boolean saveToDB()
	{
		controllerDatabase.modifyBus(bus);
		return true;
	}

	@Override
	protected void addListeners()
	{
		ControllerManager.addListener((ListenerButton) this);
	}

	@Override
	protected void removeListeners()
	{
		ControllerManager.removeListener((ListenerButton) this);
	}

	private void closeDialog()
	{
		formBus.dispose();
		removeListeners();
	}
}
