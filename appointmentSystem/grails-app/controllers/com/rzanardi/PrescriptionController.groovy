package com.rzanardi

class PrescriptionController {

    def scaffold = Prescription
	
    def advSearch(){
}
    def advResults() {
	def prescriptionProps = Prescription.metaClass.properties*.name
	def prescriptions = Prescription.withCriteria {
 	"${params.queryType}" {

	params.each { field, value ->
	 if (prescriptionProps.grep(field) && value) {
	 ilike(field, value)
	 }
	 }
	 }
	 }

	return [ presciption : prescription ]
 }
}
