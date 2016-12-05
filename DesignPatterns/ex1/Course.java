import java.util.Observable;

public class Course extends Observable{

	private String time = "12:00";

	public void changeTime(String new_time) {
        this.time = new_time;    	
        setChanged();
        notifyObservers(time); 
    }

	public String getTime() {
		return time;
	}
}