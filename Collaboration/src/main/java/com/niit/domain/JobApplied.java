package com.niit.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;
@Component
@Entity
public class JobApplied extends BaseDomain {
	@Id
	@SequenceGenerator(name="SEQ_GEN", sequenceName="JOBAPPLIED_MODEL", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_GEN")
	private int jobAppliedId;
	private String userId, jobId, remarks, status;
	private Date dateApplied;

	public int getJobAppliedId() {
		return jobAppliedId;
	}

	public void setJobAppliedId(int jobAppliedId) {
		this.jobAppliedId = jobAppliedId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}
}
