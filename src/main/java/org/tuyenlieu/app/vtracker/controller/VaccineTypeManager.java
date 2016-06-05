package org.tuyenlieu.app.vtracker.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.tuyenlieu.app.vtracker.bean.VaccineType;

@ManagedBean
@SessionScoped
public class VaccineTypeManager {
	private List<VaccineType> vaccineTypes;
	
	@PostConstruct
	public void initTempData() {
		this.vaccineTypes = new ArrayList<VaccineType>();
		Map<Date,Boolean> schedule = new HashMap<Date,Boolean>();
		schedule.put(new Date(),true);
		for (byte i=0;i < 10; i++) {
			VaccineType type = new VaccineType();
			type.setId(i);
			type.setOccurrences(i);
			type.setVaccineName("i" + i);
			
			type.setSchedule( schedule);
			this.vaccineTypes.add(type);
		}
	}
}
