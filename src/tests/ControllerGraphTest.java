package tests;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.ControllerGraph;
import de.uni_muenster.sopra2015.gruppe8.octobus.model.Connection;
import org.junit.Before;
import org.junit.Test;

import java.time.DayOfWeek;

import static org.junit.Assert.*;

public class ControllerGraphTest
{
	ControllerGraph controllerGraph;

	@Before
	public void setUp() throws Exception
	{
		controllerGraph = new ControllerGraph();
		controllerGraph.setTest();
		controllerGraph.init();
	}

	@Test
	public void testGetConnectionBremerEngelschanze() throws Exception
	{
		Connection connection = controllerGraph.getConnection(8, 18, DayOfWeek.MONDAY, 686);
		assertEquals(686, connection.getTime());
		assertEquals(5, connection.getDuration());
		assertEquals(1, connection.getNumberOfTransitions());
	}


	@Test
	public void testKlemensMaximilian() throws Exception
	{
		Connection connection = controllerGraph.getConnection(45, 62, DayOfWeek.MONDAY, 672);
		assertEquals(675, connection.getTime());
		assertEquals(23, connection.getDuration());
		assertEquals(4, connection.getNumberOfTransitions());
	}

	@Test
	public void testAlmostMidnight() throws Exception
	{
		Connection connection = controllerGraph.getConnection(43, 3, DayOfWeek.MONDAY, 1439);
		assertEquals(22, connection.getTime());
		assertEquals(322, connection.getDuration());
		assertEquals(1, connection.getNumberOfTransitions());
	}

	@Test
	public void testIntoMidnight() throws Exception
	{
		Connection connection = controllerGraph.getConnection(43, 3, DayOfWeek.MONDAY, 1432);
		assertEquals(1432, connection.getTime());
		assertEquals(352, connection.getDuration());
		assertEquals(1, connection.getNumberOfTransitions());
	}

	@Test
	public void testNoConnection() throws Exception
	{
		//108 = St Franziskus, nur Regional Busse, keine Innenstadtbusse
		Connection connection = controllerGraph.getConnection(43, 108, DayOfWeek.MONDAY, 1432);
		assertNull(connection);
		connection = controllerGraph.getConnection(108, 43, DayOfWeek.MONDAY, 1432);
		assertNull(connection);
	}


	@Test
	public void testWeekend() throws Exception
	{
		Connection connection = controllerGraph.getConnection(43, 3, DayOfWeek.SATURDAY, 540);
		assertEquals(549, connection.getTime());
		assertEquals(18, connection.getDuration());
		assertEquals(2, connection.getNumberOfTransitions());
	}
}