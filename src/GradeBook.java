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
	public void determinClassAverage(int numberOfStudents)
	{
		int total = 0;
		int grade;
		int average = 0;
		int counter = numberOfStudents;
		while(counter != 0)
		{
			grade = Integer.parseInt(JOptionPane.showInputDialog("Input grade"));
			total = total + grade;
			counter --;
		}
		average = total /10;
		
		JOptionPane.showMessageDialog(null, "The average is " + average);
		
	}
}
