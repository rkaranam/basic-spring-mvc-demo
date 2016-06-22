package levelup.world.domain;

import java.util.Date;

public class Country {

	private Integer id;
	private String name;
	private Double area;
	private Long population;
	private Date populationLastUpdated;
	private String currency;

	public Country(Integer id, 
			String name, 
			Double area, 
			Long population, 
			Date populationLastUpdated, 
			String currency) {
		
		this.id = id;
		this.name = name;		
		this.area = area;		
		this.population = population;
		this.populationLastUpdated = populationLastUpdated;
		this.currency = currency;
	}
	
	public boolean isNew() {
		return (null == id);
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

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Date getPopulationLastUpdated() {
		return populationLastUpdated;
	}

	public void setPopulationLastUpdated(Date populationLastUpdated) {
		this.populationLastUpdated = populationLastUpdated;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
