import java.util.Scanner;//used to read imput
public class GradeBookTest {

	public static void main(String[] args) {
		

		
		Scanner input = new Scanner(System.in );
		
		//prompt to get the course name
		System.out.println("Please enter the coursename");
		String nameOfCourse = input.nextLine();
		System.out.println();
		
		GradeBook myGradeBook = new GradeBook(nameOfCourse);
		
		myGradeBook.displayMessage();//display the welcome message
		
		input.close();// no idea why but it made the yellow lines go away. Does it really cause a memory leak?
	}

}
