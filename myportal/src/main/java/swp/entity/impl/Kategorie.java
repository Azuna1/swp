package swp.entity.impl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import swp.entity.KategorieTO;

@Entity
public class Kategorie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique = true)
	private String name;

	public Kategorie() {
	}

	public Kategorie(String name) {
		this.name = name;
	}

	public KategorieTO toKategorieTO() {
		return new KategorieTO(this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
