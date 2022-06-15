package client;

import application.MMBankFactory;
import application.MMCurrentAcc;
import application.MMSavingAcc;
import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		BankFactory obj=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(101,"Rekha",2000.0f,true);
		CurrentAcc n=new MMCurrentAcc(102,"Chandana",5140.0f,10000.0f);
		System.out.println("Saving Account: ");
		p.withdraw(1000.0f);
		System.out.println();
		System.out.println("Current Account: ");
		n.withdraw(500.0f);
		System.out.println(p);
		System.out.println();
		System.out.println(n);

	}

}
