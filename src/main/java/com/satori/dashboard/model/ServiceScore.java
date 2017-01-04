/**
 * ServiceScore.java 
 *
 *Satori
 * @author Eric Walden
 * Created 3:59:26 PM
 */
package com.satori.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;

import io.swagger.annotations.ApiModelProperty;

/**
 * The Class ServiceScore.
 */
@Configurable

public class ServiceScore {
	
	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(ServiceScore.class);

	/** The service id. */
	@ApiModelProperty(value = "ID of service", position = 0)
	private Long serviceId;

	/** The service name. */
	@ApiModelProperty(value = "Level of urgency", position = 1)
	private String serviceName;
	
	/** The service type name. */
	@ApiModelProperty(value = "Type of the service", position = 2)
	private String serviceTypeName;

	/** The organization name. */
	@ApiModelProperty(value = "name of the organization", position = 3)
	private String organizationName;

	/** The location. */
	@ApiModelProperty(value = "city/state combination", position = 4)
	private String location;

	/** The performance score. */
	@ApiModelProperty(value = "Performance health of service at the location", position = 5)
	private Integer performanceScore;

	/** The availability score. */
	@ApiModelProperty(value = "Availability health of service at the location", position = 6)
	private Integer availabilityScore;

	/** The capacity score. */
	@ApiModelProperty(value = "Capacity health of service at the location", position = 7)
	private Integer capacityScore;
	
	/** The configuration score. */
	@ApiModelProperty(value = "Configuration health of service at the location", position = 8)
	private Integer configurationScore;
	
	/** The environmental score. */
	@ApiModelProperty(value = "Environmental health of service at the location", position = 9)
	private Integer environmentalScore;
	
	/** The security score. */
	@ApiModelProperty(value = "Security health of service at the location", position = 10)
	private Integer securityScore;
	
	/** The overall score. */
	@ApiModelProperty(value = "Overall health of service at the location", position = 11)
	private Integer overallScore;

	/** The entity manager. */
	@PersistenceContext
	transient EntityManager entityManager;


	/**
	 * Instantiates a new service score.
	 */
	public ServiceScore() {
		super();
	}

	/**
	 * Instantiates a new service score.
	 *
	 * @param serviceId
	 *            the service id
	 * @param serviceName
	 *            the service name
	 * @param serviceTypeName
	 *            the service type name
	 * @param organizationName
	 *            the organization name
	 * @param location
	 *            the location
	 */
	public ServiceScore(Long serviceId, 
			String serviceName,
			String serviceTypeName,
			String organizationName, 
			String location) {
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceTypeName = serviceTypeName;
		this.organizationName = organizationName;
		this.location = location;
		this.performanceScore = 100;
		this.availabilityScore = 100;
		this.capacityScore = 100;
		this.configurationScore = 100;
		this.environmentalScore = 100;
		this.securityScore = 100;
		this.overallScore = 100;
	}

	/**
	 * Count service scores.
	 *
	 * @return the long
	 */
	public static long countServiceScores() {
		return findAllServiceScores().size();
	}

	/**
	 * Count composite service scores.
	 *
	 * @return the long
	 */
	public static long countCompositeServiceScores() {
	return getAllCompositeServiceScores().size();
	}

	/**
	 * Count subservice scores.
	 *
	 * @return the long
	 */
	public static long countSubserviceScores() {
		return getAllSubserviceScores().size();
	}
	
	/**
	 * Entity manager.
	 *
	 * @return the entity manager
	 */
	public static final EntityManager entityManager() {
		EntityManager em = new ServiceScore().entityManager;
		if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
		return em;
	}

	/**
	 * Find all service scores.
	 *
	 * @return the list
	 */
	public static List<ServiceScore> findAllServiceScores() {
		List<ServiceScore> scores = new ArrayList<ServiceScore>();
		scores.addAll(getAllCompositeServiceScores());
		scores.addAll(getAllSubserviceScores());
		
		return scores;
		
	}
	
	/**
	 * Gets the all subservice scores.
	 *
	 * @return the all subservice scores
	 */
	public static List<ServiceScore> getAllSubserviceScores() {
		List<ServiceScore> scores = new ArrayList<ServiceScore>();
		
		List<ServiceScore> ss = entityManager().createQuery("SELECT DISTINCT NEW com.group1901.in3sight.model.ServiceScore(s.id, s.displayServiceName, s.serviceType.serviceTypeName, s.organization.organizationName, CONCAT(ad.city, IFNULL(CONCAT(', ', ad.state.stateCode), ''))) "
				+ "FROM Service s INNER JOIN s.serviceAssetXrefs sax INNER JOIN sax.asset a INNER JOIN a.address ad "
				+ "WHERE s.compositeServices IS EMPTY "
				+ "GROUP BY s.id, CONCAT(ad.city, IFNULL(CONCAT(', ', ad.state.stateCode), ''))", ServiceScore.class).getResultList();
		
		for(ServiceScore score : ss) {
			score.computeScores();
			scores.add(score);
		}
		
		return scores;
	}
	
	/**
	 * Gets the all composite service scores.
	 *
	 * @return the all composite service scores
	 */
	public static List<ServiceScore> getAllCompositeServiceScores() {
		List<ServiceScore> scores = new ArrayList<ServiceScore>();
				
		List<ServiceScore> ss = entityManager().createQuery("SELECT DISTINCT NEW com.group1901.in3sight.model.ServiceScore(s.id, s.displayServiceName, s.serviceType.serviceTypeName, s.organization.organizationName, CONCAT(ad.city, IFNULL(CONCAT(', ', ad.state.stateCode), ''))) "
				+ "FROM Service s INNER JOIN s.subServices c INNER JOIN c.subService ss INNER JOIN ss.serviceAssetXrefs sax INNER JOIN sax.asset a INNER JOIN a.address ad  "
				+ "GROUP BY s.id, CONCAT(ad.city, IFNULL(CONCAT(', ', ad.state.stateCode), ''))", ServiceScore.class).getResultList();
		
		for(ServiceScore score : ss) {
			score.computeScores();
			scores.add(score);
		}
		
		return scores;
	}
	
	/**
	 * Gets the service scores for service.
	 *
	 * @param service
	 *            the service
	 * @return the service scores for service
	 */
	public static List<ServiceScore> getServiceScoresForService(Service service) {
		List<ServiceScore> scores = new ArrayList<ServiceScore>();
		
		/*for(Address address : Service.findLocationsForService(service.getId())) {
			ServiceScore score = new ServiceScore(service.getId(), service.getDisplayServiceName(), 
					service.getServiceType().getServiceTypeName(), service.getOrganization().getOrganizationName(), 
					Address.joinLocationString(address.getCity(), address.getState()));
			score.computeScores();
			scores.add(score);
		}*/
		
		return scores;
	}

	/**
	 * Gets the service score by service and location.
	 *
	 * @param service
	 *            the service
	 * @param cityName
	 *            the city name
	 * @param state
	 *            the state
	 * @return the service score by service and location
	 */
/*	public static ServiceScore getServiceScoreByServiceAndLocation(Service service, String cityName, UsState state) {
		if (service == null || cityName == null || cityName.equals("")) return null;
		ServiceScore score = new ServiceScore(service.getId(), service.getDisplayServiceName(), 
				service.getServiceType().getServiceTypeName(), service.getOrganization().getOrganizationName(), Address.joinLocationString(cityName, state));
		score.computeScores();
		return score;
	}*/
	
	/**
	 * Gets the composite service scores for organization.
	 *
	 * @param organization
	 *            the organization
	 * @return the composite service scores for organization
	 */
	public static List<ServiceScore> getCompositeServiceScoresForOrganization(Organization organization) {
		if (organization == null) return getAllCompositeServiceScores();
		List<ServiceScore> scores = new ArrayList<ServiceScore>();
		/*List<Service> services = Service.findCompositeServicesForOrganization(organization.getOrganizationName());
		
		if(services == null || services.size() == 0) return null;
		
		List<ServiceScore> ss = entityManager().createQuery("SELECT DISTINCT NEW com.group1901.in3sight.model.ServiceScore(s.id, s.displayServiceName, s.serviceType.serviceTypeName, s.organization.organizationName, CONCAT(ad.city, IFNULL(CONCAT(', ', ad.state.stateCode), ''))) "
				+ "FROM Service s INNER JOIN s.subServices c INNER JOIN c.subService ss INNER JOIN ss.serviceAssetXrefs sax INNER JOIN sax.asset a INNER JOIN a.address ad "
				+ "WHERE  c.compositeService IN :services "
				+ "GROUP BY s.id, CONCAT(ad.city, IFNULL(CONCAT(', ', ad.state.stateCode), ''))", ServiceScore.class).setParameter("services", services).getResultList();
		
		for(ServiceScore score : ss) {
			score.computeScores();
			scores.add(score);
		}*/
		
		return scores;
	}
	
	/**
	 * Gets the subservice scores for organization.
	 *
	 * @param organization
	 *            the organization
	 * @return the subservice scores for organization
	 */
	public static List<ServiceScore> getSubserviceScoresForOrganization(Organization organization) {
		if (organization == null) return getAllSubserviceScores();
		List<ServiceScore> scores = new ArrayList<ServiceScore>();
		/*List<Service> services = Service.findOrphanedServicesForOrganization(organization.getOrganizationName());
		
		if(services == null || services.size() == 0) return null;
		
		List<ServiceScore> ss = entityManager().createQuery("SELECT DISTINCT NEW com.group1901.in3sight.model.ServiceScore(s.id, s.displayServiceName, s.serviceType.serviceTypeName, s.organization.organizationName, CONCAT(ad.city, IFNULL(CONCAT(', ', ad.state.stateCode), ''))) "
				+ "FROM Service s INNER JOIN s.serviceAssetXrefs sax INNER JOIN sax.asset a INNER JOIN a.address ad "
				+ "WHERE  sax.service IN :services "
				+ "GROUP BY s.id, CONCAT(ad.city, IFNULL(CONCAT(', ', ad.state.stateCode), ''))", ServiceScore.class).setParameter("services", services).getResultList();
		
		for(ServiceScore score : ss) {
			score.computeScores();
			scores.add(score);
		}*/
		
		return scores;
	}

	/**
	 * Compute scores.
	 */
	public void computeScores() {
/*		Service service = Service.findService(getServiceId());
		List<Stat> stats = new ArrayList<Stat>();
		String[] location = Address.splitLocationString(getLocation());

		stats.addAll(Stat.findAllStatsForServiceLocation(service, location[0], UsState.findUsStateByStateCode(location[1])));

		for (Stat s: stats) {
			if(s.getServiceAssetXref().getIsActive().equals("Y")) {
				setAvailabilityScore(Math.min(getAvailabilityScore(), s.getAvailability()));
				setCapacityScore(Math.min(getCapacityScore(), s.getCapacity()));
				setConfigurationScore(Math.min(getConfigurationScore(), s.getConfiguration())); 
				setEnvironmentalScore(Math.min(getEnvironmentalScore(), s.getEnvironmental())); 
				setPerformanceScore(Math.min(getPerformanceScore(), s.getPerformance())); 
				setSecurityScore(Math.min(getSecurityScore(), s.getSecurity()));
				setOverallScore(Math.min(getOverallScore(), s.getOverall()));
			}
		}*/
	}
	
	
	/**
	 * Compute scores for deleted stat.
	 *
	 * @param stat
	 *            the stat
	 */
	public void computeScoresForDeletedStat(Stat stat) {
		/*for (Stat s: Stat.findAllStatsForServiceLocationButCurrentStat(stat)) {
			setAvailabilityScore(Math.min(getAvailabilityScore(), s.getAvailability()));
			setCapacityScore(Math.min(getCapacityScore(), s.getCapacity()));
			setConfigurationScore(Math.min(getConfigurationScore(), s.getConfiguration())); 
			setEnvironmentalScore(Math.min(getEnvironmentalScore(), s.getEnvironmental())); 
			setPerformanceScore(Math.min(getPerformanceScore(), s.getPerformance())); 
			setSecurityScore(Math.min(getSecurityScore(), s.getSecurity()));
			setOverallScore(Math.min(getOverallScore(), s.getOverall()));
		}*/
	}
	
	/**
	 * Gets the service score entries.
	 *
	 * @param firstResult
	 *            the first result
	 * @param maxResults
	 *            the max results
	 * @return the service score entries
	 */
	public static List<ServiceScore> getServiceScoreEntries(int firstResult, int maxResults) {
		List<ServiceScore> scores = findAllServiceScores();

		if(scores.size() > (firstResult+maxResults)) {
			return scores.subList(firstResult, (firstResult+maxResults));
		} else {
			return scores.subList(firstResult, scores.size());
		}
	}

	/**
	 * Gets the composite service score entries.
	 *
	 * @param firstResult
	 *            the first result
	 * @param maxResults
	 *            the max results
	 * @return the composite service score entries
	 */
	public static List<ServiceScore> getCompositeServiceScoreEntries(int firstResult, int maxResults) {
		List<ServiceScore> scores = getAllCompositeServiceScores();

		if(scores.size() > (firstResult+maxResults)) {
			return scores.subList(firstResult, (firstResult+maxResults));
		} else {
			return scores.subList(firstResult, scores.size());
		}
	}
	
	/**
	 * Gets the subservice score entries.
	 *
	 * @param firstResult
	 *            the first result
	 * @param maxResults
	 *            the max results
	 * @return the subservice score entries
	 */
	public static List<ServiceScore> getSubserviceScoreEntries(int firstResult, int maxResults) {
		List<ServiceScore> scores = getAllSubserviceScores();
		if(firstResult > scores.size()) return null;
		
		if(scores.size() > (firstResult+maxResults)) {
			return scores.subList(firstResult, (firstResult+maxResults));
		} else {
			return scores.subList(firstResult, scores.size());
		}
	}

	/**
	 * Gets the service id.
	 *
	 * @return the service id
	 */
	public Long getServiceId() {
		return serviceId;
	}

	/**
	 * Gets the organization name.
	 *
	 * @return the organization name
	 */
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Gets the service name.
	 *
	 * @return the service name
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * Gets the service type name.
	 *
	 * @return the service type name
	 */
	public String getServiceTypeName() {
		return serviceTypeName;
	}

	/**
	 * Gets the performance score.
	 *
	 * @return the performance score
	 */
	public Integer getPerformanceScore() {
		return performanceScore;
	}

	/**
	 * Gets the availability score.
	 *
	 * @return the availability score
	 */
	public Integer getAvailabilityScore() {
		return availabilityScore;
	}

	/**
	 * Gets the capacity score.
	 *
	 * @return the capacity score
	 */
	public Integer getCapacityScore() {
		return capacityScore;
	}

	/**
	 * Gets the configuration score.
	 *
	 * @return the configuration score
	 */
	public Integer getConfigurationScore() {
		return configurationScore;
	}

	/**
	 * Gets the environmental score.
	 *
	 * @return the environmental score
	 */
	public Integer getEnvironmentalScore() {
		return environmentalScore;
	}

	/**
	 * Gets the security score.
	 *
	 * @return the security score
	 */
	public Integer getSecurityScore() {
		return securityScore;
	}

	/**
	 * Gets the overall score.
	 *
	 * @return the overall score
	 */
	public Integer getOverallScore() {
		return overallScore;
	}

	/**
	 * Sets the service id.
	 *
	 * @param serviceId
	 *            the new service id
	 */
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * Sets the organization name.
	 *
	 * @param organizationName
	 *            the new organization name
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	/**
	 * Sets the location.
	 *
	 * @param Location
	 *            the new location
	 */
	public void setLocation(String Location) {
		this.location = Location;
	}

	/**
	 * Sets the service name.
	 *
	 * @param serviceName
	 *            the new service name
	 */
	public void setServiceName (String serviceName) {
		this.serviceName = serviceName;
	}
	
	/**
	 * Sets the service type name.
	 *
	 * @param serviceTypeName
	 *            the new service type name
	 */
	public void setServiceTypeName(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
	}

	/**
	 * Sets the performance score.
	 *
	 * @param PerformanceScore
	 *            the new performance score
	 */
	public void setPerformanceScore(Integer PerformanceScore) {
		this.performanceScore = PerformanceScore;
	}

	/**
	 * Sets the availability score.
	 *
	 * @param AvailabilityScore
	 *            the new availability score
	 */
	public void setAvailabilityScore(Integer AvailabilityScore) {
		this.availabilityScore = AvailabilityScore;
	}

	/**
	 * Sets the capacity score.
	 *
	 * @param CapacityScore
	 *            the new capacity score
	 */
	public void setCapacityScore(Integer CapacityScore) {
		this.capacityScore = CapacityScore;
	}

	/**
	 * Sets the configuration score.
	 *
	 * @param ConfigurationScore
	 *            the new configuration score
	 */
	public void setConfigurationScore(Integer ConfigurationScore) {
		this.configurationScore = ConfigurationScore;
	}

	/**
	 * Sets the environmental score.
	 *
	 * @param EnvironmentalScore
	 *            the new environmental score
	 */
	public void setEnvironmentalScore(Integer EnvironmentalScore) {
		this.environmentalScore = EnvironmentalScore;
	}

	/**
	 * Sets the security score.
	 *
	 * @param SecurityScore
	 *            the new security score
	 */
	public void setSecurityScore(Integer SecurityScore) {
		this.securityScore = SecurityScore;
	}

	/**
	 * Sets the overall score.
	 *
	 * @param OverallScore
	 *            the new overall score
	 */
	public void setOverallScore(Integer OverallScore) {
		this.overallScore = OverallScore;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
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
		organization.setId(12341324L);
		organization.setDescription("1901 Group Description".getBytes());
		organization.setOrganizationHomePageUrl("http://www.1901group.com");
		organization.setOrganizationName("1901 Group");
		organization.setOrganizationType("Services Company");

		// Service
		Service service = new Service();
		service.setId(1L);
		service.setServiceName("1901 Group LLC Email");
		service.setServiceDescription("1901 Group LLC Email");
		service.setOrganization(organization);

		ServiceScore ss = new ServiceScore();
		ss.setAvailabilityScore(61);
		ss.setCapacityScore(100);
		ss.setConfigurationScore(100);
		ss.setEnvironmentalScore(61);
		ss.setLocation("Fairfax, VA");
		ss.setOrganizationName(organization.getOrganizationName());
		ss.setOverallScore(55);
		ss.setPerformanceScore(55);
		ss.setSecurityScore(100);
		ss.setServiceId(service.getId());
		ss.setServiceName("Unknown");

		/*String ssJson = ss.toJson();
		System.out.println(ssJson);
		ServiceScore ssFromJson = ServiceScore.fromJsonToServiceScore(ssJson);
		System.out.println(ssFromJson.toString());*/

	}
}
