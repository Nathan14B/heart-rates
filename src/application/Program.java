package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.HeartRates;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dateOfBirth = sdf.parse("23/05/1994");
		HeartRates test = new HeartRates("Amelia Bronx", dateOfBirth);
		
		System.out.println(test);
		System.out.println("Age: " + test.getAge());
		System.out.println("Maximum Heart Rate: " + test.getMaximumHeartRate());
		System.out.println("Target Heart Rate: " + test.getTargetHeartRate());
	}

}
