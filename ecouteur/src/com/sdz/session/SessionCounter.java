/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.session;

/**
 *
 * @author compaq 610
 */

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCounter implements HttpSessionListener{

	private int countSession = 0;
	
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("Nombre de session(s) " + (++countSession));
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("Nombre de session(s) " + (--countSession));
	}
}
