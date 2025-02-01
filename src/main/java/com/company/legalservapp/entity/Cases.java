package com.company.legalservapp.entity;

import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.*;
import io.jmix.core.metamodel.datatype.DatatypeFormatter;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "CASE_", indexes = {
		@Index(name = "IDX_CASE__CASE_CUSTOMER", columnList = "CASE_CUSTOMER_ID"),
		@Index(name = "IDX_CASE__CASE_TYPE", columnList = "CASE_TYPE_ID"),
		@Index(name = "IDX_CASE__EXECUTOR", columnList = "EXECUTOR_ID"),
		@Index(name = "IDX_CASE__CASE_STATUS", columnList = "CASE_STATUS_ID")
})
@Entity(name = "Case_")
public class Cases {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Composition
    @OneToMany(mappedBy = "case_")
    private List<CasePlaintiffsLink> plaintiffs;

    @Composition
    @OneToMany(mappedBy = "caseId")
    private List<CaseDefendantsLink> defendant;

    @Column(name = "CASE_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date caseDate;

    @Column(name = "CASE_NUM", nullable = false)
    @NotNull
    private String caseNum;

    @JoinColumn(name = "CASE_CUSTOMER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Customer caseCustomer;

    @JoinColumn(name = "CASE_TYPE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private CaseTypes caseType;

    @NumberFormat(pattern = "#################.##", groupingSeparator = ".")
    @Column(name = "CASE_SUM", precision = 19, scale = 2)
    private BigDecimal caseSum;

    @JoinColumn(name = "EXECUTOR_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User executor;

    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @JoinColumn(name = "CASE_STATUS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CaseStatuses caseStatus;

    @Column(name = "CASE_ESSENCE")
    @Lob
    private String caseEssence;

    @Column(name = "CASE_NOTE")
    @Lob
    private String caseNote;

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

    public String getCaseNote() {
	return caseNote;
    }

    public void setCaseNote(String caseNote) {
	this.caseNote = caseNote;
    }

    public String getCaseEssence() {
	return caseEssence;
    }

    public void setCaseEssence(String caseEssence) {
	this.caseEssence = caseEssence;
    }

    public CaseStatuses getCaseStatus() {
	return caseStatus;
    }

    public void setCaseStatus(CaseStatuses caseStatus) {
	this.caseStatus = caseStatus;
    }

    public Date getDueDate() {
	return dueDate;
    }

    public void setDueDate(Date dueDate) {
	this.dueDate = dueDate;
    }

    public User getExecutor() {
	return executor;
    }

    public void setExecutor(User executor) {
	this.executor = executor;
    }

    public BigDecimal getCaseSum() {
	return caseSum;
    }

    public void setCaseSum(BigDecimal caseSum) {
	this.caseSum = caseSum;
    }

    public CaseTypes getCaseType() {
	return caseType;
    }

    public void setCaseType(CaseTypes caseType) {
	this.caseType = caseType;
    }

    public List<CaseDefendantsLink> getDefendant() {
	return defendant;
    }

    public void setDefendant(List<CaseDefendantsLink> defendant) {
	this.defendant = defendant;
    }

    public List<CasePlaintiffsLink> getPlaintiffs() { return plaintiffs; }public void setPlaintiffs(List<CasePlaintiffsLink> plaintiffs) { this.plaintiffs = plaintiffs; }

    public Customer getCaseCustomer() {
	return caseCustomer;
    }

    public void setCaseCustomer(Customer caseCustomer) {
	this.caseCustomer = caseCustomer;
    }

    public String getCaseNum() {
	return caseNum;
    }

    public void setCaseNum(String caseNum) {
	this.caseNum = caseNum;
    }

    public Date getCaseDate() {
	return caseDate;
    }

    public void setCaseDate(Date caseDate) {
	this.caseDate = caseDate;
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
    @DependsOnProperties({ "caseDate", "caseNum" })
    public String getInstanceName(MetadataTools metadataTools, DatatypeFormatter datatypeFormatter) {
	return String.format("%s %s",
			datatypeFormatter.formatDate(caseDate),
			metadataTools.format(caseNum));
    }
}