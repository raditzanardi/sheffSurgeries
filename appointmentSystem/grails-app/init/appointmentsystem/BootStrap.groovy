package com.rzanardi

class BootStrap {

    def init = { servletContext ->

	/*def doctorName1 = new Doctor(
	fullName: 'Hugh Laurie',
	qualification: 'PhD Medicine',
	position: 'Surgeon',
	doctorEmail: 'hugh@doctor.com',	
	password: 'password',
	doctorOffice: 'D-1',
	doctorPhone: '083649271',
	bio: 'Number one surgeon in the hospital, has PhD in Medicine').save()

	def doctorName2 = new Doctor(
	fullName: 'Jack Danger',
	qualification: 'PhD Medical Science',
	position: 'GP',
	doctorEmail: 'jack@doctor.com',	
	password: 'password',
	doctorOffice: 'D-2',
	doctorPhone: '08111901500',
	bio: 'GP in the hospital, has PhD in Medical Science').save()

	def doctorName3 = new Doctor(
	fullName: 'Alex Watson',
	qualification: 'PhD Medical Science',
	position: 'GP',
	doctorEmail: 'alex@doctor.com',	
	password: 'password',
	doctorOffice: 'D-3',
	doctorPhone: '07240098976',
	bio: 'GP in the hospital, has PhD in Medical Science').save()

	def patientName1 = new Patient(
	patientName: 'Radit Zanardi',
	patientAddress: '37 Suffolk Road',
	patientResidence: 'Sheffield',
	patientDob: new Date('03/03/1999'),
	patientID: 'P1',
	dateRegistered: new Date('09/05/2019'),
	patientPhone: '0798336629').save()

	def patientName2 = new Patient(
	patientName: 'John',
	patientAddress: '22 West Street',
	patientResidence: 'Derby',
	patientDob: new Date('08/04/1995'),
	patientID: 'P2',
	dateRegistered: new Date('02/07/2019'),
	patientPhone: '0798830275').save()

	def patientName3 = new Patient(
	patientName: 'Shakkir',
	patientAddress: '15 Norfolk Street',
	patientResidence: 'Sheffield',
	patientDob: new Date('08/01/1997'),
	patientID: 'P3',
	dateRegistered: new Date('02/07/2019'),
	patientPhone: '071856339').save()

	def appointment1 = new Appointment(
	appDate: new Date('05/07/2019'),
	appTime: '3.00pm',
	appDuration: '45',
	roomNumber: 'A-1',
	patientName:patientName1).save()

	def appointment2 = new Appointment(
	appDate: new Date('06/09/2019'),
	appTime: '1.00pm',
	appDuration: '60',
	roomNumber: 'A-2',
	patientName:patientName2).save()

	def appointment3 = new Appointment(
	appDate: new Date('09/09/2019'),
	appTime: '12.00pm',
	appDuration: '30',
	roomNumber: 'A-3',
	patientName:patientName3).save()
	
	def nurseName1 = new Nurse(
	nurseName: 'John Cho',
	qualifications: 'Registered Nurse',
	nurseEmail: 'john@nurse.com',
	nurseOffice: 'N-001',
	nursePhone: '0753046726').save()

	def nurseName2 = new Nurse(
	nurseName: 'Jackie',
	qualifications: 'Registered General Nurse',
	nurseEmail: 'jackie@nurse.com',
	nurseOffice: 'N-002',
	nursePhone: '0726153830').save()
	
	def nurseName3 = new Nurse(
	nurseName: 'Matt',
	qualifications: 'Registered General Nurse',
	nurseEmail: 'matt@nurse.com',
	nurseOffice: 'N-003',
	nursePhone: '07594017334').save()

	def surgeryName1 = new Surgery(
	name: 'General Health Centre',
	address: '22 Sunderland Street',
	postcode: 'S1 4BG',
	telephone: '0114 555 2390',
	numberOfPatients: '50',
	bio: 'Sheffield surgery located in Sunderland Street',
	openingTime: '09:00 - 18:00').save()
	
	def surgeryName2 = new Surgery(
	name: 'New Medical Centre',
	address: '12 Whithworth Street',
	postcode: 'M1 6LT',
	telephone: '0161 555 8872',
	numberOfPatients: '70',
	bio: 'Manchester surgery located in Whitworth Street',
	openingTime: '09:00 - 18:00').save()

	def surgeryName3 = new Surgery(
	name: 'General Medical Centre',
	address: '8 West Street',
	postcode: 'S3 4LT',
	telephone: '0114 555 8214',
	numberOfPatients: '40',
	bio: 'Local Sheffield surgery located in West Street',
	openingTime: '09:00 - 18:00').save()

	def recepName1 = new Receptionist(
	recepName: 'Alex Jones',
	recepEmail: 'alex@receptionist.com',
	username: 'alex',
	password: 'password',
	recepPhone: '0867474820').save()
	
	def recepName2 = new Receptionist(
	recepName: 'Sam Jones',
	recepEmail: 'sam@receptionist.com',
	username: 'sam',
	password: 'password',
	recepPhone: '0911635483').save()

	def recepName3 = new Receptionist(
	recepName: 'Brendan Frasier',
	recepEmail: 'brendan@receptionist.com',
	username: 'brendan',
	password: 'password',
	recepPhone: '0987164839').save()

	def prescription1 = new Prescription(
	pharmacyName: 'General Pharmacy',
	prescripNumber: '111',
	medicine: 'Paracetamol',
	totalCost: '£5.00',
	dateIssued: new Date('04/10/2019'),
	patientPaying: 'Yes').save()

	def prescription2 = new Prescription(
	pharmacyName: 'Medical Pharmacy',
	prescripNumber: '112',
	medicine: 'Panadol',
	totalCost: '£4.50',
	dateIssued: new Date('01/09/2020'),
	patientPaying: 'Yes').save()

	def prescription3 = new Prescription(
	pharmacyName: 'General Pharmacy',
	prescripNumber: '133',
	medicine: 'Diazepam',
	totalCost: '£8.00',
	dateIssued: new Date('08/07/2019'),
	patientPaying: 'Yes').save()

	surgeryName1.addToNurses(nurseName1)
	surgeryName1.addToNurses(nurseName2)
	surgeryName2.addToNurses(nurseName3)
	surgeryName3.addToReceptionists(recepName1)
	surgeryName3.addToReceptionists(recepName2)
	surgeryName2.addToReceptionists(recepName3)
	doctorName1.addToNurses(nurseName1)
	doctorName1.addToNurses(nurseName2)
	nurseName3.addToDoctors(doctorName3)
	surgeryName3.addToDoctors(doctorName2)
	surgeryName1.addToDoctors(doctorName1)
	surgeryName3.addToDoctors(doctorName3)
	doctorName1.addToAppointments(appointment1)
	doctorName1.addToAppointments(appointment2)
	patientName1.addToPrescriptions(prescription1)
	patientName1.addToPrescriptions(prescription3)
	patientName2.addToPrescriptions(prescription2)
	doctorName1.addToPatients(patientName1)
	doctorName1.addToPatients(patientName2)
	patientName3.addToDoctors(doctorName2)
	doctorName1.addToPrescriptions(prescription1)
	doctorName2.addToPrescriptions(prescription2)
	doctorName2.addToPrescriptions(prescription3)
	surgeryName1.addToPatients(patientName1)
	surgeryName1.addToPatients(patientName2) */
	
    }
    def destroy = {
    }
}
