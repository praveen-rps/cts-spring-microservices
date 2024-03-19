package com.example.springbootdatajpademo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	
	@Id
	int custId;
	String custName;
	String custEmail;
    public Customers() {
    	
    }
        public Customers(int custId, String custName, String custEmail) {
        	        super();
        	        this.custId = custId;
        	           this.custName = custName;
        	           this.custEmail = custEmail;	
        	        
        }
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustEmail() {
			return custEmail;
		}
		public void setCustEmail(String custEmail) {
			this.custEmail = custEmail;
		}
		@Override
		public String toString() {
			return "Customers [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + "]";
		}
        
}
