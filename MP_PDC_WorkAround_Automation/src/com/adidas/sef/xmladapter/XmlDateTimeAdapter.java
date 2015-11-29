/**
 * Copyright (C) 2014 adidas AG.
 *
 * Modification Log
 * Date               Author         Remarks
 * Jun, 2014          Infosys        Created
 */
package com.adidas.sef.xmladapter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * The class <code>XmlDateTimeAdapter</code> contains the methods to customise the
 * binding of an XML schema data type to a Java data type. Customisations can
 * involve writing a parse and print method for parsing and printing lexical
 * representations of a XML schema data type respectively. <br>
 * The conversion happens by wsimport command which are used in XSDs.<br>
 * <br>
 * The following conversion logics are handled:<br>
 * 1) Converting the XSD date type to java.util.Date this will be referred in
 * the XSDs and will be used by wsimport command to convert the default
 * gregorian date to java.util.Date
 * 
 * @author Infosys.
 */
public final class XmlDateTimeAdapter extends XmlAdapter<String, Date> {

	/**
	 * Got a PMDerror - All methods are static. Consider using Singleton
	 * instead. Alternatively, you could add a private constructor or make the
	 * class abstract to silence this warning. So added a public constructor
	 * and declared class as final. Default Constructor.
	 */

	public XmlDateTimeAdapter() {
		super();
	}

	/**
	 * Converts the String argument into java.util.Date representing the time
	 * value.
	 * 
	 * 
	 * @param string
	 *            <code>Date</code> in the form of String type
	 * @return The <code>Date</code> representing the time value
	 */
	public Date unmarshal(final String string) throws Exception {
		return DatatypeConverter.parseDateTime(string).getTime();
	}

	/**
	 * Converts the java.util.Date into String.
	 * 
	 * @param date
	 *            <code>Date</code> in the form of <code>java.util.Date</code>
	 *            type
	 * @return The <code>Date</code> in the form of <code>String</code>
	 */
	public String marshal(final Date date) throws Exception {
		final Calendar cal = new GregorianCalendar();
		String returnVal = null;
		if (date != null) {
			cal.setTime(date);
			returnVal = DatatypeConverter.printDateTime(cal);
		}
		return returnVal;
	}
}
