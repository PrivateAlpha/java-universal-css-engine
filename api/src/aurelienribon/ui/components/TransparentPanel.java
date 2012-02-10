package aurelienribon.ui.components;

import java.awt.Graphics;
import java.awt.LayoutManager;
import javax.swing.JPanel;

/**
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class TransparentPanel extends JPanel {
	public TransparentPanel() {
		super();
	}

	public TransparentPanel(LayoutManager layout) {
		super(layout);
	}

	public TransparentPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	public TransparentPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

	@Override
	protected void paintComponent(Graphics g) {
		setOpaque(false);
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
	}
}
