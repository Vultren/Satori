/**
 * GroupPersonXref.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:25 PM
 */
package com.satori.dashboard.model;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class GroupPersonXref.
 */
@Entity
public class GroupPersonXref {

	/** The id. */
	private Long id;

	/** The person. */
	private Person person;

	/** The group. */
	private Group group;

	/**
	 * Instantiates a new group person xref.
	 */
	public GroupPersonXref() {
		this(null, null);
	}
	
	/**
	 * Instantiates a new group person xref.
	 *
	 * @param group the group
	 * @param person the person
	 */
	public GroupPersonXref(Group group, Person person) {
		this.group = group;
		this.person = person;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the person.
	 *
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * Gets the group.
	 *
	 * @return the group
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the person.
	 *
	 * @param person the new person
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * Sets the group.
	 *
	 * @param group the new group
	 */
	public void setGroup(Group group) {
		this.group = group;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}
