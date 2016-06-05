package org.tuyenlieu.app.vtracker.bean;

import java.util.Date;
import java.util.Map;

public class VaccineType {
	private int id;
	private String vaccineName;
	private byte occurrences;
	private Map<Date,Boolean> schedule;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public byte getOccurrences() {
		return occurrences;
	}
	public void setOccurrences(byte occurrences) {
		this.occurrences = occurrences;
	}
	public Map<Date, Boolean> getSchedule() {
		return schedule;
	}
	public void setSchedule(Map<Date, Boolean> schedule) {
		this.schedule = schedule;
	}
	
}
