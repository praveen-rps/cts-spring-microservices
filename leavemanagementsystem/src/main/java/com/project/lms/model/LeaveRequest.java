package com.project.lms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leave_request")
public class LeaveRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int leaveId;
	int employeeId;
	String leaveType;
	String fromDate;
	String toDate;
	int days;
	String reason;
	int managerId;
	String comments;
	String status;

	public LeaveRequest() {

	}

	public LeaveRequest(int leaveId, int employeeId,  String leaveType, String fromDate, String toDate,
			int days, String reason, int managerId, String comments, String status) {
		super();
		this.leaveId = leaveId;
		this.employeeId = employeeId;
		
		this.leaveType = leaveType;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.days = days;
		this.reason = reason;
		this.managerId = managerId;
		this.comments = comments;
		this.status = status;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
