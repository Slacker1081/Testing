
import javax.swing.JOptionPane;
public class GradeBookTest {

	public static void main(String[] args) {
		

		
		String nameOfCourse = JOptionPane.showInputDialog("What is the course?");
		
		GradeBook myGradeBook = new GradeBook(nameOfCourse);
		
		myGradeBook.displayMessage();//display the welcome message
		
		int numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog("How many students took the course?"));
		
		myGradeBook.determinClassAverage(numberOfStudents);
		
	}

}
