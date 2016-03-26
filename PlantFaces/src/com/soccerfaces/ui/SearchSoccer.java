/**
 * 
 */
package com.soccerfaces.ui;

import java.util.ArrayList;
import java.util.List;

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
		if(soccer != null && soccer.getAssociationName().equalsIgnoreCase("epl")){
			return "search";
		}else{
			return "noresults";
		}
	}
	
	public List<Soccer> completeSoccer(String query){
		List<Soccer> soccerList = new ArrayList<Soccer>();
		Soccer epl = new Soccer();
		epl.setAssociationName("English Premier League");
		soccerList.add(epl);
		
		Soccer laliga = new Soccer();
		laliga.setAssociationName("Spanish La Liga");
		soccerList.add(laliga);
		
		Soccer bundesliga = new Soccer();
		bundesliga.setAssociationName("German Bundesliga");
		soccerList.add(bundesliga);
		
		Soccer serieA = new Soccer();
		serieA.setAssociationName("Italian Serie A");
		soccerList.add(serieA);
		
		Soccer scottish = new Soccer();
		scottish.setAssociationName("Scottish Premier League");
		soccerList.add(scottish);
		
		return soccerList;
	}

}
