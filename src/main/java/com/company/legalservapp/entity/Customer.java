package com.company.legalservapp.entity;

import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.NumberFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "CUSTOMER", indexes = {
		@Index(name = "IDX_CUSTOMER_CUSTOMER_TYPE", columnList = "CUSTOMER_TYPE_ID")
})
@Entity
public class Customer {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "CUSTOMER_TYPE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private CustomerTypes customerType;

    @Column(name = "CUSTOMER_NAME", nullable = false)
    @NotNull
    private String customerName;

    @NumberFormat(pattern = "############")
    @Column(name = "CUSTOMER_INN")
    private Integer customerINN;

    @NumberFormat(pattern = "#############")
    @Column(name = "CUSTOMER_OGRN")
    private Integer customerOgrn;

    @Column(name = "CUSTOMER_EMAIL")
    private String customerEmail;

    @Column(name = "CUSTOMER_ADDRESS_FACT")
    private String customerAddressFact;

    @Column(name = "CUSTOMER_ADDRESS_URID")
    private String customerAddressUrid;

    @Column(name = "CUSTOMER_PHONE_NUM")
    private String customerPhoneNum;

    @Column(name = "CUSTOMER_CONTACT_PERSON")
    @Lob
    private String customerContactPerson;

    @Column(name = "CUSTOMER_NOTE")
    @Lob
    private String customerNote;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    private OffsetDateTime createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    private OffsetDateTime lastModifiedDate;

    public String getCustomerNote() {
	return customerNote;
    }

    public void setCustomerNote(String customerNote) {
	this.customerNote = customerNote;
    }

    public String getCustomerContactPerson() {
	return customerContactPerson;
    }

    public String getCustomerCOntactPerson() {
	return customerContactPerson;
    }

    public void setCustomerCOntactPerson(String customerCOntactPerson) {
	this.customerContactPerson = customerCOntactPerson;
    }

    public String getCustomerPhoneNum() {
	return customerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
	this.customerPhoneNum = customerPhoneNum;
    }

    public String getCustomerAddressUrid() {
	return customerAddressUrid;
    }

    public void setCustomerAddressUrid(String customerAddressUrid) {
	this.customerAddressUrid = customerAddressUrid;
    }

    public String getCustomerAddressFact() {
	return customerAddressFact;
    }

    public void setCustomerAddressFact(String customerAddressFact) {
	this.customerAddressFact = customerAddressFact;
    }

    public String getCustomerEmail() {
	return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
    }

    public Integer getCustomerOgrn() {
	return customerOgrn;
    }

    public void setCustomerOgrn(Integer customerOgrn) {
	this.customerOgrn = customerOgrn;
    }

    public Integer getCustomerINN() {
	return customerINN;
    }

    public void setCustomerINN(Integer customerINN) {
	this.customerINN = customerINN;
    }

    public String getCustomerName() {
	return customerName;
    }

    public void setCustomerName(String customerName) {
	this.customerName = customerName;
    }

    public CustomerTypes getCustomerType() {
	return customerType;
    }

    public void setCustomerType(CustomerTypes customerType) {
	this.customerType = customerType;
    }

    public OffsetDateTime getLastModifiedDate() {
	return lastModifiedDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
	this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
	return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
	this.lastModifiedBy = lastModifiedBy;
    }

    public OffsetDateTime getCreatedDate() {
	return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
	this.createdDate = createdDate;
    }

    public String getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    public UUID getId() {
	return id;
    }

    public void setId(UUID id) {
	this.id = id;
    }

    @InstanceName
    @DependsOnProperties({ "customerName", "customerType" })
    public String getInstanceName(MetadataTools metadataTools) {
	return String.format("%s %s",
			metadataTools.format(customerType),
			metadataTools.format(customerName));
    }
}