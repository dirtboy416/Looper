package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;
/**
 * Main GUI Framework for the loop Project.
 * @author Nathan Johnson
 *@version 1.2 11/5/13 Added documentation and supporting methods.
 */

public class LoopFrame extends JFrame
{

	private LoopController baseController;
	/**
	 * The referenced controller object.
	 */
	private LoopPanel basePanel;
	/**
	 * The application main panel for GUI.
	 * @param baseController
	 */
	
	public LoopFrame(LoopController baseController)
	{
		/**
		 * Creates a LoopFrame object with a linked LoopController for the MVC paradigm.
		 * @param baseController The referring controller.
		 */
		this.baseController = baseController;
		basePanel = new LoopPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		/**
		 * Sets the content, size and visibility of the frame.
		 */
		this.setContentPane(basePanel);
		this.setSize(450,450);
		this.setVisible(true);
	}
}
