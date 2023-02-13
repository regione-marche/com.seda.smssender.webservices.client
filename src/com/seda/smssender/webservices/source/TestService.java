package com.seda.smssender.webservices.source;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.seda.smssender.webservices.dati.SMSSenderRequestType;
import com.seda.smssender.webservices.dati.SMSSenderResponse;


public class TestService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SMSSenderServiceLocator serviceLocator=new SMSSenderServiceLocator();
		
		try {
			SMSSenderInterface senderInterface=serviceLocator.getSMSSenderPort(new URL("http://localhost:8611/SMSSenderService/service"));
			
			SMSSenderRequestType requestType=new SMSSenderRequestType();
			requestType.setSMSDataText("SMS di prova");
			requestType.setSMSEDataTOList("+393479580930");
			
			SMSSenderResponse response=senderInterface.getSMSSender(requestType);
	
			System.out.println(response.getValue());
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (ServiceException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
