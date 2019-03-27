package com.rzanardi

class Appointment {

	Date appDate
	String appTime
	int appDuration
	String roomNumber
	Patient patientName

    static constraints = {
	appDate nullable:false, blank:false
	appTime nullable:false, blank:false
	appDuration nullable:false, blank:false
	roomNumber nullable:false, blank:false
    }
}
