/**
 * 
 */
package com.soccerfaces.dto;

import javax.annotation.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

/**
 * @author TOSHIBA
 *
 */
@Named
@ManagedBean
@Scope("session")
public class Soccer {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	} 

}
