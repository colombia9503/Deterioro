package com.creativosdigitales.jsf.deterioro.POJOS;

import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Policy {
	// Bean name: policy
	private String id;
	private String type;
	private String name;
	private String priority;
	private String rate;
	private String formula;
	
	//list
	private List<String> priorityOptions;

	public Policy() {
		// TODO Auto-generated constructor stub
		priorityOptions = new ArrayList<String>();
		priorityOptions.add("Alta");
		priorityOptions.add("Media");
		priorityOptions.add("Baja");
	}

	public List<String> getPriorityOptions() {
		return priorityOptions;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " : " + getRate() +" : "+getPriority();
	}

}
