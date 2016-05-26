/**
 * Person.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:25 PM
 */
package com.satori.dashboard.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class Person.
 */
@Entity
public class Person {

	/** The id. */
	private Long id;

	/** The first name. */
	private String firstName;

	/** The middle name. */
	private String middleName;

	/** The last name. */
	private String lastName;

	/** The designation. */
	private String designation;

	/** The address. */
	private Address address;

	/** The contact infoes. */
	private Set<ContactInfo> contactInfoes;

	/** The group person xrefs. */
	private Set<GroupPersonXref> groupPersonXrefs;

	/**
	 * Instantiates a new person.
	 */
	public Person() {

	}

	/**
	 * Instantiates a new person.
	 *
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 */
	public Person(String firstName, String lastName) {

	}

	/**
	 * Instantiates a new person.
	 *
	 * @param firstName
	 *            the first name
	 * @param middleName
	 *            the middle name
	 * @param lastName
	 *            the last name
	 */
	public Person(String firstName, String middleName, String lastName) {

	}

	/**
	 * Instantiates a new person.
	 *
	 * @param firstName
	 *            the first name
	 * @param middleName
	 *            the middle name
	 * @param lastName
	 *            the last name
	 * @param designation
	 *            the designation
	 */
	public Person(String firstName, String middleName, String lastName, String designation) {

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
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the middle name.
	 *
	 * @return the middle name
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the designation.
	 *
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public Address getAddress() {
		return address;
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
	 * Gets the group person xrefs.
	 *
	 * @return the group person xrefs
	 */
	public Set<GroupPersonXref> getGroupPersonXrefs() {
		return groupPersonXrefs;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Sets the middle name.
	 *
	 * @param middleName
	 *            the new middle name
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Sets the designation.
	 *
	 * @param designation
	 *            the new designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Sets the address.
	 *
	 * @param address
	 *            the new address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Sets the contact infoes.
	 *
	 * @param contactInfoes
	 *            the new contact infoes
	 */
	public void setContactInfoes(Set<ContactInfo> contactInfoes) {
		this.contactInfoes = contactInfoes;
	}

	/**
	 * Sets the group person xrefs.
	 *
	 * @param groupPersonXrefs
	 *            the new group person xrefs
	 */
	public void setGroupPersonXrefs(Set<GroupPersonXref> groupPersonXrefs) {
		this.groupPersonXrefs = groupPersonXrefs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// Organization
		Organization organization = new Organization();
		organization.setId(1L);
		organization.setDescription("1901 Group".getBytes());
		organization.setOrganizationHomePageUrl("http://www.1901group.com");
		organization.setOrganizationName("1901 Group");
		organization.setOrganizationType("Services Company");
		// Country
		Country country = new Country();
		country.setId(333L);
		country.setCountryCode("US");
		country.setCountryName("United States of America");
		// State
		UsState state = new UsState();
		state.setId(46L);
		state.setStateCode("VA");
		state.setStateName("Virginia");
		// Address
		Address address = new Address();
		address.setId(1L);
		address.setStreetAddress1("1901 Innovation Dr.");
		address.setStreetAddress2("Suite 2000");
		address.setCity("Blacksburg");
		address.setLocation(new Location(country, state));
		address.setZip("24060");
		address.setZipExt("");
		address.setOrganization(organization);
		address.setHeadquarters(false);
		address.setLocationSysId("590226e4a9a28500241186a331c9294a");
		// ContactType
		ContactType contactType = new ContactType();
		contactType.setId(2);
		contactType.setDescription("Work");
		contactType.setCode("W");
		// ContactInfoes
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setId(1L);
		contactInfo.setPhone(5409515000L);
		contactInfo.setEmail("percival.williams@1901group.com");
		contactInfo.setGroup(new Group());
		contactInfo.setPerson(new Person());
		contactInfo.setContactType(contactType);
		Set<ContactInfo> contactInfoes = new HashSet<ContactInfo>();
		contactInfoes.add(contactInfo);
		// Group
		Group group = new Group();
		group.setId(1L);
		group.setGroupName("1901 Group");
		group.setGroupDescription("1901 Group");
		group.setOrganization(organization);
		group.setPrimary(true);
		// Person
		Person person = new Person();
		person.setId(1L);
		person.setFirstName("Percival");
		person.setMiddleName("Maurice");
		person.setLastName("Williams");
		person.setDesignation("III");
		person.setAddress(address);
		person.setContactInfoes(contactInfoes);
		// GroupPersonXrefs
		GroupPersonXref groupPersonXref = new GroupPersonXref();
		groupPersonXref.setId(1L);
		groupPersonXref.setGroup(group);
		groupPersonXref.setPerson(person);
		Set<GroupPersonXref> groupPersonXrefs = new HashSet<GroupPersonXref>();
		groupPersonXrefs.add(groupPersonXref);
		//
		person.setGroupPersonXrefs(groupPersonXrefs);

		/*
		 * String personJson = person.toJson(); System.out.println("toJson: \r"
		 * + personJson);
		 * 
		 * Person personFromJson = Person.fromJsonToPerson(personJson);
		 * System.out.println("fromJson: \r" + personFromJson);
		 */

	}
}
