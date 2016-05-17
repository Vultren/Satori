package com.satori.dashboard.model;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class GroupPersonXref {

	private Long id;

	private Person person;

	private Group group;

	public GroupPersonXref() {
		this(null, null);
	}
	
	public GroupPersonXref(Group group, Person person) {
		this.group = group;
		this.person = person;
	}
	public Long getId() {
		return id;
	}

	public Person getPerson() {
		return person;
	}

	public Group getGroup() {
		return group;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}
