package com.company.legalservapp.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
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
@Table(name = "CASE_PLAINTIFFS", indexes = {
		@Index(name = "IDX_CASE_PLAINTIFFS_CASE_", columnList = "CASE_ID"),
		@Index(name = "IDX_CASE_PLAINTIFFS_CUSTOMER", columnList = "CUSTOMER_ID"),
		@Index(name = "IDX_CASE_PLAINTIFFS_LINK_UNQ", columnList = "CASE_ID, CUSTOMER_ID", unique = true)
})
@Entity
public class CasePlaintiffsLink {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "CASE_ID", nullable = false)
    @NotNull
    private Cases case_;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    @NotNull
    private Customer customer;

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

    public Customer getCustomer() {
	return customer;
    }

    public void setCustomer(Customer customer) {
	this.customer = customer;
    }

    public Cases getCase_() {
	return case_;
    }

    public void setCase_(Cases case_) {
	this.case_ = case_;
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