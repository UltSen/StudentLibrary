/**
 *
 * @author Cody Bo Williams
 */
package adpgui;
    import java.awt.Color;
    import java.awt.GridLayout;
    import java.awt.event.ActionListener;
    import java.awt.event.ActionEvent;
    import java.util.ArrayList;
    import java.util.Collections;
    import javax.swing.*;

public class  ADPGui extends JFrame implements ActionListener {
    
    private JLabel lblTitle;
    
    private JButton btnNewLearner;
    private JButton btnNewBook;
    private JButton btnBorrowBook;
    private JButton btnReturn;
    private JButton btnDisplay;
    
    public ADPGui(){
        
        lblTitle = new JLabel("Library Assistant");
        
        btnNewBook = new JButton("Add Book");
        btnNewLearner = new JButton("Add Learner");
        btnBorrowBook = new JButton("Borrow Book");
        btnReturn = new JButton("Return Book");
        btnDisplay = new JButton("Display Database");
    }
    
    public void setGui (){
        
        this.setLayout(new GridLayout(2,3));
        
        this.add(btnBorrowBook);
        this.add(lblTitle);
        this.add(btnReturn);
        
        this.add(btnNewBook);
        this.add(btnDisplay);
        this.add(btnNewLearner);
    }    
        
    
    public static void main(String[] args) {
        new ADPGui().setGui();
    }
}
