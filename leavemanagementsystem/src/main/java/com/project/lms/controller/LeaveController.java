package com.project.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.project.lms.model.LeaveRequest;
import com.project.lms.service.LeaveRequestService;

@Controller
public class LeaveController {
	
	@Autowired
	private LeaveRequestService leaveRequestService;
	
	
	@GetMapping("/viewRequests")
	public String viewRequests(Model model) {
		model.addAttribute("leaveRequests", leaveRequestService.getAllLeaveRequests());
		return "viewRequests";
	}
	
	@GetMapping("/applyLeave")
	public String applyLeave(Model model) {
		LeaveRequest leaveRequest = new LeaveRequest();
		model.addAttribute("leaveRequest", leaveRequest);
		return "applyLeave";
	}
	
	@GetMapping("/submitLeave")
	public String submitLeave(@ModelAttribute LeaveRequest leaveRequest) {
		leaveRequestService.addLeaveRequest(leaveRequest);
		return "valid";
	}
	

}
