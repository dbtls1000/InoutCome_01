package com.biz.inout.controller;

import java.io.FileNotFoundException;

import com.biz.inout.service.InoutService_01;

public class InoutExec_01 {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		InoutService_01 ios = new InoutService_01();
		
		
		ios.readInout();
		ios.dto();
		ios.viewInout();
		
		
		
	}
}
