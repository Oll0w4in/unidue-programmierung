package com.oppahansi.ss18.mp2;

/**
 * Implements a visitor that creates a string representation
 * from the fields of a board and makes it available via a
 * getter.
 * 
 * @author Marcus
 *
 */
public class FieldStringifyer implements Visitor {
	
	/**
	 * The text that has been gathered by the stringifyer.
	 */
	private String text = "";

	/**
	 * Returns the text that has been gathered by the
	 * stringifyer so far.
	 * 
	 * @return The text of the stringifyer.
	 */
	public String getText() {
		return text;
	}

	/**
	 * Appends the string representation of the field to
	 * the text.
	 * 
	 * @param field The field whose string representation
	 * 	should be appended.
	 */
	@Override
	public void nextField(Field field) {
        text += field.toString();
	}

	/**
	 * Appends a newline character ("\n") to the text.
	 */
	@Override
	public void nextRow() {
        text += "\n";
	}
}
