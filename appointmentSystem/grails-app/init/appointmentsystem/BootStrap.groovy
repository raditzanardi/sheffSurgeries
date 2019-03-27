package com.rzanardi

class BootStrap {

    def init = { servletContext ->

	def doctorname1 = new Doctor(
	fullName: 'Hugh Laurie',
	qualification: 'PhD Medicine',
	position: 'Surgeon',
	doctorEmail: 'hugh@doctor.com',	
	password: 'password',
	doctorOffice: 'D-1',
	doctorPhone: '083649271',
	bio: 'Number one surgeon in the hospital, has PhD in Medicine').save()

	def doctorname2 = new Doctor(
	fullName: 'Jack Danger',
	qualification: 'PhD Medical Science',
	position: 'GP',
	doctorEmail: 'jack@doctor.com',	
	password: 'password',
	doctorOffice: 'D-2',
	doctorPhone: '08111901500',
	bio: 'GP in the hospital, has PhD in Medical Science').save()

	def doctorname3 = new Doctor(
	fullName: 'Alex Watson',
	qualification: 'PhD Medical Science',
	position: 'GP',
	doctorEmail: 'alex@doctor.com',	
	password: 'password',
	doctorOffice: 'D-3',
	doctorPhone: '07240098976',
	bio: 'GP in the hospital, has PhD in Medical Science').save()

	def patientname1 = new Patient(
	patientName: 'Radit Zanardi',
	patientAddress: '37 Suffolk Road',
	patientResidence: 'Sheffield',
	patientDob: new Date('03/03/1999'),
	patientID: 'P1',
	dateRegistered: new Date('09/05/2019'),
	patientPhone: '0798336629').save()

	def patientname2 = new Patient(
	patientName: 'John',
	patientAddress: '22 West Street',
	patientResidence: 'Derby',
	patientDob: new Date('08/04/1995'),
	patientID: 'P2',
	dateRegistered: new Date('02/07/2019'),
	patientPhone: '0798830275').save()

	def patientname3 = new Patient(
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
	patientName:patientname1).save()

	def appointment2 = new Appointment(
	appDate: new Date('06/09/2019'),
	appTime: '1.00pm',
	appDuration: '60',
	roomNumber: 'A-2',
	patientName:patientname2).save()

	def appointment3 = new Appointment(
	appDate: new Date('09/09/2019'),
	appTime: '12.00pm',
	appDuration: '30',
	roomNumber: 'A-3',
	patientName:patientname3).save()
	
	def nursename1 = new Nurse(
	nurseName: 'John Cho',
	qualifications: 'Registered Nurse',
	nurseEmail: 'john@nurse.com',
	nurseOffice: 'N-001',
	nursePhone: '0753046726').save()

	def nursename2 = new Nurse(
	nurseName: 'Jackie',
	qualifications: 'Registered General Nurse',
	nurseEmail: 'jackie@nurse.com',
	nurseOffice: 'N-002',
	nursePhone: '0726153830').save()
	
	def nursename3 = new Nurse(
	nurseName: 'Matt',
	qualifications: 'Registered General Nurse',
	nurseEmail: 'matt@nurse.com',
	nurseOffice: 'N-003',
	nursePhone: '07594017334').save()

	def surgeryname1 = new Surgery(
	name: 'General Health Centre',
	address: '22 Sunderland Street',
	postcode: 'S1 4BG',
	telephone: '0114 555 2390',
	numberOfPatients: '50',
	bio: 'Sheffield surgery located in Sunderland Street',
	openingTime: '09:00 - 18:00').save()
	
	def surgeryname2 = new Surgery(
	name: 'New Medical Centre',
	address: '12 Whithworth Street',
	postcode: 'M1 6LT',
	telephone: '0161 555 8872',
	numberOfPatients: '70',
	bio: 'Manchester surgery located in Whitworth Street',
	openingTime: '09:00 - 18:00').save()

	def surgeryname3 = new Surgery(
	name: 'General Medical Centre',
	address: '8 West Street',
	postcode: 'S3 4LT',
	telephone: '0114 555 8214',
	numberOfPatients: '40',
	bio: 'Local Sheffield surgery located in West Street',
	openingTime: '09:00 - 18:00').save()

	def recepname1 = new Receptionist(
	recepName: 'Alex Jones',
	recepEmail: 'alex@receptionist.com',
	recepUsername: 'alex',
	recepPassword: 'password',
	recepPhone: '0867474820').save()
	
	def recepname2 = new Receptionist(
	recepName: 'Sam Jones',
	recepEmail: 'sam@receptionist.com',
	recepUsername: 'sam',
	recepPassword: 'password',
	recepPhone: '0911635483').save()

	def recepname3 = new Receptionist(
	recepName: 'Brendan Frasier',
	recepEmail: 'brendan@receptionist.com',
	recepUsername: 'brendan',
	recepPassword: 'password',
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

	surgeryname1.addToNurses(nursename1)
	surgeryname1.addToNurses(nursename2)
	surgeryname2.addToNurses(nursename3)
	surgeryname3.addToReceptionists(recepname1)
	surgeryname3.addToReceptionists(recepname2)
	surgeryname2.addToReceptionists(recepname3)
	doctorname1.addToNurses(nursename1)
	doctorname1.addToNurses(nursename2)
	nursename3.addToDoctors(doctorname3)
	surgeryname3.addToDoctors(doctorname2)
	surgeryname1.addToDoctors(doctorname1)
	surgeryname3.addToDoctors(doctorname3)
	doctorname1.addToAppointments(appointment1)
	doctorname1.addToAppointments(appointment2)
	patientname1.addToPrescriptions(prescription1)
	patientname1.addToPrescriptions(prescription3)
	patientname2.addToPrescriptions(prescription2)
	doctorname1.addToPatients(patientname1)
	doctorname1.addToPatients(patientname2)
	patientname3.addToDoctors(doctorname2)
	doctorname1.addToPrescriptions(prescription1)
	doctorname2.addToPrescriptions(prescription2)
	doctorname2.addToPrescriptions(prescription3)
	surgeryname1.addToPatients(patientname1)
	surgeryname1.addToPatients(patientname2)
	
    }
    def destroy = {
    }
}
