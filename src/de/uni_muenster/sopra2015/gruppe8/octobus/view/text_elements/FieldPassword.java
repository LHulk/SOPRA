package de.uni_muenster.sopra2015.gruppe8.octobus.view.text_elements;

import javax.swing.*;
import javax.swing.text.Document;

/**
 * adjusted JPasswordField with limited input length of 32
 */
public class FieldPassword extends JPasswordField
{
	private int limit = 32;
	private LimitDocument limitDoc;

	/**
	 * constructs FieldPassword with limit of 32
	 */
	public FieldPassword()
	{
		super();
		limitDoc.setLimit(limit);
	}

	/**
	 * constructs FieldPassword with limit of 32 and specified column width
	 * @param columns numbers of columns to use to calculate preferred width
	 */
	public FieldPassword(int columns)
	{
		super();
		this.setColumns(columns);
		limitDoc.setLimit(limit);
	}

	@Override
	protected Document createDefaultModel()
	{
		limitDoc = new LimitDocument();
		return limitDoc;
	}
}
