package org.brain

class InputText {
	int id
	String message
	
    static constraints = {
    	message(blank: false)
    }
}
