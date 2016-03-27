/**
 * 
 */
package com.plantfaces.ui;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.plantfaces.dto.Plant;
/**
 * @author TOSHIBA
 *
 */
@Named
@ManagedBean
@Scope("session")
public class SearchPlants {
	
	@Inject
	private Plant plant;

	/**
	 * @return the plant
	 */
	public Plant getPlant() {
		return plant;
	}

	/**
	 * @param plant the plant to set
	 */
	public void setPlant(Plant plant) {
		this.plant = plant;
	}

	public String execute(){
		if(plant != null && plant.getName().equalsIgnoreCase("redbud")){
			return "search";
		}else{
			return "noresults";
		}
	}
	
	public List<Plant> completePlant(String query){
		ArrayList<Plant> plantList = new ArrayList<Plant>();
		return plantList;
	}

}
