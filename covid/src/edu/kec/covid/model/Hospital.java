package edu.kec.covid.model;

public class Hospital {
	private Integer id;
	private String name;
	private Integer areaId;
	private Integer availableBeds;

	public Hospital(Integer id, String name, Integer areaId, Integer availableBeds) {
		super();
		this.id = id;
		this.name = name;
		this.areaId = areaId;
		this.availableBeds = availableBeds;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getAvailableBeds() {
		return availableBeds;
	}

	public void setAvailableBeds(Integer availableBeds) {
		this.availableBeds = availableBeds;
	}

}
