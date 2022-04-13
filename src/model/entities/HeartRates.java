package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class HeartRates {
	private String name;
	private Date dateOfBirth;
	
	public HeartRates(String name, Date dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Name: " + name + ", Date of Birth: " + sdf.format(dateOfBirth);
	}
	
	public int getAge() {
		Date currentDate = new Date();
		long ageInMilliseconds = currentDate.getTime() - dateOfBirth.getTime();
		int ageInDays = (int) TimeUnit.DAYS.convert(ageInMilliseconds, TimeUnit.MILLISECONDS);
		int ageInYears = ageInDays / 365;
		return ageInYears;
	}
	
	public int getMaximumHeartRate() {
		return 220 - getAge();
	}
	
	public String getTargetHeartRate() {
		int minimumRange = (int) (getMaximumHeartRate() * 0.5);
		int maximumRange = (int) (getMaximumHeartRate() * 0.85);
		return minimumRange + " to " + maximumRange;
	}
}
