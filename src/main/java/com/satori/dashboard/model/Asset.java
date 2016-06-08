package com.satori.dashboard.model;

import java.time.Instant;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Asset {
	
	public enum SystemClass{
		UNDEFINED("Undefined", ""),
		NETWORK_GEAR("Network Gear", ""),
		ESX_SERVER("VMware ESX Server", ""),
		LINUX_SERVER("Linux Server", ""),
		HOST("Host", ""),
		WIN_SERVER("Windows Server", ""),
		NODE("Node", ""),
		ROUTER("Router", ""),
		SWITCH("Switch", ""),
		FIREWALL("Firewall", ""),
		FILE_SERVER("FileServer", ""),
		MFSC("Multilayer Feature Switch Card", ""),
		VM_INSTANCE("Virtual Machine Instance", ""),
		SERVER("Server", "");
		
		private String className;
		private String description;

		private SystemClass(String className, String description) {
			this.className = className;
			this.description = description;
		}

		public static SystemClass toEnum(String value) {
			return Arrays.asList(SystemClass.values()).stream().filter(type -> type.className().equalsIgnoreCase(value))
					.findFirst().orElse(null);
		}

		public String className() {
			return className;
		}

		public String description() {
			return description;
		}

	}
	
	public enum Status{
		INSTALLED("Installed"),
		ORDERING("On Order"),
		MAINTENANCE("In Maintenance"),
		INSTALLING("Pending Install"),
		REPAIR("Pending Repair"),
		IN_STOCK("In Stock"),
		RETIRED("Retired"),
		STOLEN("Stolen"),
		ABSENT("Absent");
		
		private String status;

		private Status(String status) {
			this.status = status;
		}
		
		public static Status toEnum(String value) {
			return Arrays.asList(Status.values()).stream().filter(type -> type.statusName().equalsIgnoreCase(value))
					.findFirst().orElse(null);
		}

		private String statusName() {
			return status;
		}
		
	}
	private static final Logger logger = LoggerFactory.getLogger(Asset.class);
	
	@Id
    private Long id;
	
    private String assetSysId;

    private String assetName;

    private String ipAddress;

    private String modelNumber;
	
    private Address address;

    private Instant createdDate;

    private Instant updatedDate;
    
    private Status status;

    private Organization organization;

    private Set<Partnership> partnerships;

    private Set<ServiceAssetXref> serviceAssetXrefs;

    private SystemClass systemClass;

    private Set<Ticket> tickets;

	public Long getId() {
		return id;
	}

	public String getAssetSysId() {
		return assetSysId;
	}

	public String getAssetName() {
		return assetName;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public Address getAddress() {
		return address;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public Status getStatus() {
		return status;
	}

	public Organization getOrganization() {
		return organization;
	}

	public Set<Partnership> getPartnerships() {
		return partnerships;
	}

	public Set<ServiceAssetXref> getServiceAssetXrefs() {
		return serviceAssetXrefs;
	}

	public SystemClass getSystemClass() {
		return systemClass;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public Instant getUpdatedDate() {
		return updatedDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAssetSysId(String assetSysId) {
		this.assetSysId = assetSysId;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setPartnerships(Set<Partnership> partnerships) {
		this.partnerships = partnerships;
	}

	public void setServiceAssetXrefs(Set<ServiceAssetXref> serviceAssetXrefs) {
		this.serviceAssetXrefs = serviceAssetXrefs;
	}

	public void setSystemClass(SystemClass systemClass) {
		this.systemClass = systemClass;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String toString() {
	    return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
	    .setExcludeFieldNames()
	    .toString();
	}
	
}
