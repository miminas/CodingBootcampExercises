import java.util.Observable;
import java.util.Observer;

public class ObserverModel {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		Organizer organizer1 = new Organizer();
		Student student1 = new Student();
		
		Course course1 = new Course();

		course1.addObserver(student1);
		
		course1.changeTime("12:30");
	
		// student1.update(course1, "12:30");

	}

}
