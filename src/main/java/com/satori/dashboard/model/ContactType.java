package com.satori.dashboard.model;

import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class ContactType {

	private Integer id;

	private String code;

	private String description;

	private Set<ContactInfo> contactInfoes;

	public ContactType() {
		this(null);
	}

	public ContactType(String code) {
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public Set<ContactInfo> getContactInfoes() {
		return contactInfoes;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setContactInfoes(Set<ContactInfo> contactInfoes) {
		this.contactInfoes = contactInfoes;
	}

	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}
}
