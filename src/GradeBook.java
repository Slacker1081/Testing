/**
 * 
 */
import javax.swing.JOptionPane;
/**
 * @author Slacker1081
 *
 */
public class GradeBook {
	private String courseName;
	
	public GradeBook (String name)
	{
		setCourseName(name);
	}
	
	public void setCourseName(String name)//setter
	{
	this.courseName = name;
	}
	
	public String getCourseName()//getter
	{
		return this.courseName;
	}
	
	public void displayMessage()// Displays a welcome message
	{
		String message = String.format("Welcome to the grade book for %s",getCourseName()); 
		JOptionPane.showMessageDialog(null, message );
	}
}
