/**
 * ContactInfo.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:26 PM
 */
package com.satori.dashboard.model;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class ContactInfo.
 */
@Entity
public class ContactInfo {

    /** The id. */
    private Long id;
    
    /** The phone. */
    private Long phone;

    /** The email. */
    private String email;
    
    /** The contact type. */
    private ContactType contactType;
    
    /** The group. */
    private Group group;

    /** The person. */
    private Person person;
    
	/**
	 * Instantiates a new contact info.
	 */
	public ContactInfo(){
		this(null, null, null, null, null);
	}
	
	/**
	 * Instantiates a new contact info.
	 *
	 * @param phone the phone
	 * @param email the email
	 * @param contactType the contact type
	 */
	public ContactInfo(Long phone, String email, ContactType contactType){
		this(phone, email, contactType, null, null);
	}
	
	/**
	 * Instantiates a new contact info.
	 *
	 * @param phone the phone
	 * @param email the email
	 * @param contactType the contact type
	 * @param group the group
	 */
	public ContactInfo(Long phone, String email, ContactType contactType, Group group){
		this(phone, email, contactType, group, null);
	}
	
	/**
	 * Instantiates a new contact info.
	 *
	 * @param phone the phone
	 * @param email the email
	 * @param contactType the contact type
	 * @param person the person
	 */
	public ContactInfo(Long phone, String email, ContactType contactType, Person person){
		this(phone, email, contactType, null, person);
	}
	
	/**
	 * Instantiates a new contact info.
	 *
	 * @param phone the phone
	 * @param email the email
	 * @param contactType the contact type
	 * @param group the group
	 * @param person the person
	 */
	private ContactInfo(Long phone, String email, ContactType contactType, Group group, Person person){
		this.phone = phone;
		this.email = email;
		this.contactType = contactType;
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
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public Long getPhone() {
		return phone;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Gets the contact type.
	 *
	 * @return the contact type
	 */
	public ContactType getContactType() {
		return contactType;
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
	 * Gets the person.
	 *
	 * @return the person
	 */
	public Person getPerson() {
		return person;
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
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(Long phone) {
		this.phone = phone;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Sets the contact type.
	 *
	 * @param contactType the new contact type
	 */
	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	/**
	 * Sets the group.
	 *
	 * @param group the new group
	 */
	public void setGroup(Group group) {
		this.group = group;
	}

	/**
	 * Sets the person.
	 *
	 * @param person the new person
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }
}
