package com.mj.beans.sales;

import java.util.List;

import com.mj.beans.Client;
import com.mj.beans.VisitingLocation;

public class VisitRequest {

	private Client client;
	private String dateOfVisit;
	private List<VisitingLocation> visitingLocations;
	private String remarks;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public List<VisitingLocation> getVisitingLocations() {
		return visitingLocations;
	}

	public void setVisitingLocations(List<VisitingLocation> visitingLocations) {
		this.visitingLocations = visitingLocations;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
