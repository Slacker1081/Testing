/**
 * 
 */

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
		System.out.printf("Welcom to the grade book for \n%s!\n" , getCourseName());
	}
}
