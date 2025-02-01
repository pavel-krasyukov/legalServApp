package com.company.legalservapp.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "CASE_DEFENDANTS", indexes = {
		@Index(name = "IDX_CASE_DEFENDANTS_CASE_ID", columnList = "CASE_ID"),
		@Index(name = "IDX_CASE_DEFENDANTS_CUSTOMER_ID", columnList = "CUSTOMER_ID"),
		@Index(name = "IDX_CASE_DEFENDANTS_LINK_UNQ", columnList = "CASE_ID, CUSTOMER_ID", unique = true)
})
@Entity
public class CaseDefendantsLink {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CASE_ID", nullable = false)
    @NotNull
    private Cases caseId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    @NotNull
    private Customer customerId;

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

    public Customer getCustomerId() {
	return customerId;
    }

    public void setCustomerId(Customer customerId) {
	this.customerId = customerId;
    }

    public Cases getCaseId() {
	return caseId;
    }

    public void setCaseId(Cases caseId) {
	this.caseId = caseId;
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
}