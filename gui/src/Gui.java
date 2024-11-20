/**
 * A simple GUI application demonstrating basic Swing
 * components and event handling.
 * The application creates a window with a button that shows
 * a message dialog when clicked.

 * @author Wolfgang Fahl
 * @version 0.2
 * @since 2019-04-03
 * @date 2024-11-20
 */
import javax.swing.*;
import java.awt.event.*;

public class Gui {
    /**
     * Inner class that handles button click events.
     * Implements ActionListener to respond to user interactions.
     */
    public static class MyAction implements ActionListener {
        /**
         * Called when the button is clicked.
         * Displays a message dialog with a "Thanks" message.
         *
         * @param ae The ActionEvent object containing details about the event
         */
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Thanks.", "GUI Test", 1);
        }
    }

    /**
     * Main method that creates and displays the GUI window.
     * Sets up a frame with a button and registers an action listener.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String args[]) {
        // Create the main window with title "GUI Test"
        JFrame frame = new JFrame("GUI Test");
        // Set the application to exit when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the window size to 300x300 pixels
        frame.setSize(300, 300);

        // Create a button labeled "Click me"
        JButton button1 = new JButton("Click me");
        // Add the button to the frame's content pane
        frame.getContentPane().add(button1);
        // Register an action listener for button clicks
        button1.addActionListener(new MyAction());

        // Make the frame visible
        frame.setVisible(true);
    }
}
