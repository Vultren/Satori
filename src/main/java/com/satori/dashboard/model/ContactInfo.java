package com.satori.dashboard.model;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class ContactInfo {

    private Long id;
    
    private Long phone;

    private String email;
    
    private ContactType contactType;
    
    private Group group;

    private Person person;
    
	public ContactInfo(){
		this(null, null, null, null, null);
	}
	
	public ContactInfo(Long phone, String email, ContactType contactType){
		this(phone, email, contactType, null, null);
	}
	
	public ContactInfo(Long phone, String email, ContactType contactType, Group group){
		this(phone, email, contactType, group, null);
	}
	
	public ContactInfo(Long phone, String email, ContactType contactType, Person person){
		this(phone, email, contactType, null, person);
	}
	
	private ContactInfo(Long phone, String email, ContactType contactType, Group group, Person person){
		this.phone = phone;
		this.email = email;
		this.contactType = contactType;
		this.group = group;
		this.person = person;
	}

	public Long getId() {
		return id;
	}

	public Long getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public Group getGroup() {
		return group;
	}

	public Person getPerson() {
		return person;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
