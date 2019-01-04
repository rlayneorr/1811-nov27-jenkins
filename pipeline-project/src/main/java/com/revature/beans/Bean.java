package com.revature.beans;

public class Bean {
	private String strain;
	private String color;
	private Integer yield;
	private Double mass;
	public Bean() {
		super();
	}
	
	public Bean(String strain, String color, Integer yield, Double mass) {
		super();
		this.strain = strain;
		this.color = color;
		this.yield = yield;
		this.mass = mass;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getYield() {
		return yield;
	}

	public void setYield(Integer yield) {
		this.yield = yield;
	}

	public Double getMass() {
		return mass;
	}

	public void setMass(Double mass) {
		this.mass = mass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((mass == null) ? 0 : mass.hashCode());
		result = prime * result + ((strain == null) ? 0 : strain.hashCode());
		result = prime * result + ((yield == null) ? 0 : yield.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bean other = (Bean) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (mass == null) {
			if (other.mass != null)
				return false;
		} else if (!mass.equals(other.mass))
			return false;
		if (strain == null) {
			if (other.strain != null)
				return false;
		} else if (!strain.equals(other.strain))
			return false;
		if (yield == null) {
			if (other.yield != null)
				return false;
		} else if (!yield.equals(other.yield))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bean [strain=" + strain + ", color=" + color + ", yield=" + yield + ", mass=" + mass + "]";
	}
}
