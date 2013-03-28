/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.session;

/**
 *
 * @author compaq 610
 */

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttribute implements HttpSessionAttributeListener{

	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("L'attribut " + event.getName() + " qui a pour valeur " + event.getValue() + " a été rajouté dans une session");
	}

	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("L'attribut " + event.getName() + " qui a pour valeur " + event.getValue() + " a été retiré dans une session");
	}

	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("L'attribut " + event.getName() + " qui a pour valeur " + event.getValue() + " a été remplacé dans une session");
	}
	
}
