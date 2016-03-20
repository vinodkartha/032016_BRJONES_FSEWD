/**
 * 
 */
package com.soccerfaces.ui;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.soccerfaces.dto.Soccer;
/**
 * @author TOSHIBA
 *
 */
@Named
@ManagedBean
@Scope("session")
public class SearchSoccer {
	
	@Inject
	private Soccer soccer;
	
	/**
	 * @return the soccer
	 */
	public Soccer getSoccer() {
		return soccer;
	}

	/**
	 * @param soccer the soccer to set
	 */
	public void setSoccer(Soccer soccer) {
		this.soccer = soccer;
	}

	public String execute(){
		if(soccer != null && soccer.getName().equalsIgnoreCase("epl")){
			return "search";
		}else{
			return "noresults";
		}
	}

}
