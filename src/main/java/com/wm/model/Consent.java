package com.wm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commsubscriptionconsent", schema="salesforce")

public class Consent {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "sfid")
    private String consentSFDC;
    
  
    @Column(name = "ConsentGiverId")
    private String consentGiverId;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getConsentSFDC() {
		return consentSFDC;
	}


	public void setConsentSFDC(String consentSFDC) {
		this.consentSFDC = consentSFDC;
	}


	public String getConsentGiverId() {
		return consentGiverId;
	}


	public void setConsentGiverId(String consentGiverId) {
		this.consentGiverId = consentGiverId;
	}


    
    
}
