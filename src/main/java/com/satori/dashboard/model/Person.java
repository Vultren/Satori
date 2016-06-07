package com.satori.dashboard.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class Person {

    private Long id;

    private String firstName;

    private String middleName;
    
    private String lastName;

    private String designation;

    private Address address;

    private Set<ContactInfo> contactInfoes;

    private Set<GroupPersonXref> groupPersonXrefs;

	public Person(){
		
	}
	
	public Person(String firstName, String lastName){
		
	}
	
	public Person(String firstName, String middleName, String lastName){
		
	}
	
	public Person(String firstName, String middleName, String lastName, String designation){
		
	}
	
    public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public Address getAddress() {
		return address;
	}

	public Set<ContactInfo> getContactInfoes() {
		return contactInfoes;
	}

	public Set<GroupPersonXref> getGroupPersonXrefs() {
		return groupPersonXrefs;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setContactInfoes(Set<ContactInfo> contactInfoes) {
		this.contactInfoes = contactInfoes;
	}

	public void setGroupPersonXrefs(Set<GroupPersonXref> groupPersonXrefs) {
		this.groupPersonXrefs = groupPersonXrefs;
	}

	public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames().toString();
    }

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
		
/*		String personJson = person.toJson();
        System.out.println("toJson: \r" + personJson);

        Person personFromJson = Person.fromJsonToPerson(personJson);
        System.out.println("fromJson: \r" + personFromJson);*/
		
	}
}
