package com.fwcd.breeze.viewutils;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class NoButton extends JButton {
	private static final long serialVersionUID = 1L;
	
	public NoButton() {
		setOpaque(false);
	    setFocusable(false);
	    setFocusPainted(false);
	    setBorderPainted(false);
	    setBorder(BorderFactory.createEmptyBorder());
	}
}
