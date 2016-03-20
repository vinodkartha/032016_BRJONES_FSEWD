/**
 * 
 */
package com.soccerfaces.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

/**
 * @author TOSHIBA
 *
 */
@Named
@ManagedBean
@Scope("session")
public class ApplicationInfo {
	
	private String slogan;

	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		setSlogan("........Promoting Diversity............");
		return slogan;
	}

	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

}
