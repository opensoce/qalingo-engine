/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.pojo.deliverymethod;

import java.util.HashSet;
import java.util.Set;

public class DeliveryMethodCountryPojo {

	private Long id;
	private String codeCountry;
	private Set<DeliveryMethodCountyPojo> deliveryMethodCounties = new HashSet<DeliveryMethodCountyPojo>(); 
	
	public DeliveryMethodCountryPojo() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeCountry() {
		return codeCountry;
	}
	
	public void setCodeCountry(String codeCountry) {
		this.codeCountry = codeCountry;
	}

	public Set<DeliveryMethodCountyPojo> getDeliveryMethodCounties() {
		return deliveryMethodCounties;
	}
	
	public void setDeliveryMethodCounties(Set<DeliveryMethodCountyPojo> deliveryMethodCounties) {
		this.deliveryMethodCounties = deliveryMethodCounties;
	}
	
}