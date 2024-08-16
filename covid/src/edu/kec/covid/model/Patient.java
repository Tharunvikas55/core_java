package edu.kec.covid.model;

public class Patient {
	private Integer id;
	private String name;
	private Long aadhaarId;
	private Integer areaId;
	private Integer hospitalId;
	private String status;

	public Patient(Integer id, String name, Long aadhaarId, Integer areaId, Integer hospitalId, String status) {
		super();
		this.id = id;
		this.name = name;
		this.aadhaarId = aadhaarId;
		this.areaId = areaId;
		this.hospitalId = hospitalId;
		this.status = status;
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

	public Long getAadhaarId() {
		return aadhaarId;
	}

	public void setAadhaarId(Long aadhaarId) {
		this.aadhaarId = aadhaarId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
