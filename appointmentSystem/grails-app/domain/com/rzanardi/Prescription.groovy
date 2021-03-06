package com.rzanardi

class Prescription {

	String pharmacyName
	int prescripNumber
	String medicine
	String totalCost
	Date dateIssued
	Boolean patientPaying
	String daysOfsupply
	String toString(){
	return pharmacyName
	}
	static hasMany=[doctors:Doctor]
	static belongsTo=[Doctor, Patient]

    static constraints = {
	pharmacyName nullable:false, blank:false
	prescripNumber nullable:false, blank:false
	medicine nullable:false, blank:false
	totalCost nullable:false, blank:false
	dateIssued nullable:false, blank:false
	patientPaying nullable:false, blank:false
	daysOfsupply nullable:false, blank:false
    }
}
