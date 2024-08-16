package edu.kec.access;

import edu.kec.sms.Test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamePackageClass spc=new SamePackageClass();
		spc.b=2000;
		spc.test();
		Test test=new Test();
		test.test();
		
	}

}
