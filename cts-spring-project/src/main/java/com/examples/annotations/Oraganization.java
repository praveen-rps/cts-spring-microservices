package com.examples.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("org")
public class Oraganization {
	
	int orgId;
	String orgName;
	
	@Autowired
	Address address;

	public Oraganization() {
		super();
		orgId=1001;
		orgName="CTS Ltd";
		
	}
	
	public Oraganization(int orgId, String orgName, Address address) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.address = address;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}	
    @Override
        public String toString() {
    	            return "Oraganization [orgId=" + orgId + ", orgName=" + orgName + ", address=" + address + "]";
    }
	
}
