package edu.towson.cis.cosc603.project2.monopoly.gui;

import edu.towson.cis.cosc603.project2.monopoly.Cell;

// TODO: Auto-generated Javadoc
/**
 * The Class JailCellInfoFormatter.
 */
public class JailCellInfoFormatter implements CellInfoFormatter {

    /** The Constant JAIL_CELL_LABEL. */
    public static final String JAIL_CELL_LABEL = "<html><b>Jail</b></html>";

    /* (non-Javadoc)
     * @see edu.towson.cis.cosc603.project2.monopoly.gui.CellInfoFormatter#format(edu.towson.cis.cosc603.project2.monopoly.Cell)
     */
    public String format(Cell cell) {
		return JAIL_CELL_LABEL;
	}

}
