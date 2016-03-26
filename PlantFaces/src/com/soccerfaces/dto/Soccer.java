/**
 * 
 */
package com.soccerfaces.dto;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import com.soccerfaces.dto.Country;

import org.springframework.context.annotation.Scope;

/**
 * @author TOSHIBA
 *
 */
@Named
@ManagedBean
@Scope("session")
public class Soccer {
	
	private String associationName;
	
	@Inject
	private Country country;
	
	private List<Team> teams;
	
	/**
	 * @return the associationName
	 */
	public String getAssociationName() {
		return associationName;
	}

	/**
	 * @param associationName the associationName to set
	 */
	public void setAssociationName(String associationName) {
		this.associationName = associationName;
	}

	/**
	 * @return the teams
	 */
	public List<Team> getTeams() {
		return teams;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @param teams the teams to set
	 */
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return associationName + " " + country.getName();
	}

}
