package com.cg.frs.dao;

import java.util.Scanner;

import com.cg.frs.beans.CustomerDetails;

public class InsertOperationsImpl implements InsertOperations{
	CustomerDetails custDetails=new CustomerDetails();
	Validation validate=new Validation();
	public void getDetails() {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("please enter your name");
		String name=in.next();
		custDetails.setCustName(name);
		
		System.out.println("please enter your email");
		String email=in.next();
		custDetails.setEmail(email);
		
		System.out.println("please enter your address");
		String address=in.next();
		custDetails.setCustAddress(address);
		
		System.out.println("please enter your mobile number");
		long number=in.nextLong();
		custDetails.setCustMobile(number);
		
		System.out.println("please enter the room number");
		int roomNo=in.nextInt();
		custDetails.setRoomNo(roomNo);
		
		System.out.println("please enter room type");
		String roomType=in.next();
		custDetails.setRoomType(roomType);
		
		
		boolean resultEmail=validate.emailValidate(email);
		boolean resultMobile=validate.mobileValidate(number);
		boolean resultRoomNo=validate.roomNoValidate(roomNo,roomType);
		
		
		if(resultEmail==false || resultMobile==false || resultRoomNo==false) {
			System.out.println("please enter details correctly");
			getDetails();
		}
		
		else {
			
		}
		
		
		
		
		
		
		
		
	}
}
