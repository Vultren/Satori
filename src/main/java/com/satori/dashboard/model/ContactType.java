/**
 * ContactType.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:26 PM
 */
package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class ContactType.
 */
@Entity
public class ContactType {

	/** The id. */
	private Integer id;

	/** The code. */
	private String code;

	/** The description. */
	private String description;

	/** The contact infoes. */
	private Set<ContactInfo> contactInfoes;

	/**
	 * Instantiates a new contact type.
	 */
	public ContactType() {
		this(null);
	}

	/**
	 * Instantiates a new contact type.
	 *
	 * @param code the code
	 */
	public ContactType(String code) {
		this.code = code;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the contact infoes.
	 *
	 * @return the contact infoes
	 */
	public Set<ContactInfo> getContactInfoes() {
		return contactInfoes;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Sets the code.
	 *
	 * @param code the new code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Sets the contact infoes.
	 *
	 * @param contactInfoes the new contact infoes
	 */
	public void setContactInfoes(Set<ContactInfo> contactInfoes) {
		this.contactInfoes = contactInfoes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}
