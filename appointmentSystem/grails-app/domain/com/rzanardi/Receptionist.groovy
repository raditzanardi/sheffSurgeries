package com.rzanardi

class Receptionist {
	
	String recepName
	String recepEmail
	String username
	String password
	String recepPhone
	String toString(){
	return recepName
	}

    static constraints = {
	recepName nullable:false, blank:false
	recepEmail nullable:false, blank:false, email:true
	username nullable:false, blank:false, unique:true
	password nullable:false, blank:false, password:true
	recepPhone nullable:false, blank:false
    }
}
