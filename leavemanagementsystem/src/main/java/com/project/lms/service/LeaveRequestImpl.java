package com.project.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.lms.dao.LeaveRepository;
import com.project.lms.model.LeaveRequest;

@Service
public class LeaveRequestImpl implements LeaveRequestService{
	
	@Autowired
	private LeaveRepository leaveRepository;

	@Override
	public LeaveRequest addLeaveRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		return leaveRepository.save(leaveRequest);
	}

	@Override
	public List<LeaveRequest> getAllLeaveRequests() {
		// TODO Auto-generated method stub
		return leaveRepository.findAll();
	}

}
