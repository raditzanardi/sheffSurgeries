package com.rzanardi

class Surgery {

	String name
	String address
	String postcode
	int telephone
	int numberOfPatients
	String bio
	String openingTime

    static constraints = {
	name nullable:false, blank:false
	address nullable:false, blank:false
	postcode nullable:false, blank:false
	telephone nullable:false, blank:false
	numberOfPatients nullable:false, blank:false
	bio nullable:false, blank:false, maxSize:5000, widget:'textarea'
	openingTime nullable:false, blank:false
    }
}
