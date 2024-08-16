package com.hdfc.atm;

import com.hdfc.atm.ui.iservice.ICUIService;
import com.hdfc.atm.ui.service.CUIService;;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICUIService icuiservice = new CUIService();
		icuiservice.showCUI();
	}

}
