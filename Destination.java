package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Destination extends AirlineType {
	int confirmationButton = 0;
	JFrame Destination;	
	JButton buttonLocal, buttonInternational, nextPassengerDetails, cancelDestination;
	JComboBox comboBoxInternational, comboBoxLocal, defaultComboBox;
	JLabel chooseTravelType ;
	JPanel DestinationPanel;
	
	public static String International[] = new String[6], Local[] = new String[4];
	int selectedValuesLocal, selectedValuesInternational;
	
	void DestinationInformation() {
	
		Destination = new JFrame("This is a TEst");
		
		Destination.setBounds(400,100,500,500);
		Destination.setVisible(true);
		Destination.setLayout(null);
		Destination.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Destination.setResizable(true);
    	
    	
    	  
        DestinationPanel = new JPanel();
        DestinationPanel.setLayout(null);
        Destination.getContentPane().add(DestinationPanel);
        Destination.setLayout(null);
     
        
        chooseTravelType = new JLabel("Choose Travel Type");
        DestinationPanel.add(chooseTravelType);
        DestinationPanel.setBackground(Color.WHITE);
        DestinationPanel.setBounds(100,20,300,300);
    
        
        buttonLocal = new JButton("Local");
        buttonInternational = new JButton("International");
       

        DestinationPanel.add(buttonLocal);
        DestinationPanel.add(buttonInternational);
        
        chooseTravelType.setBounds(90,10,120,40);
        buttonLocal.setBounds(90,100,120,30);
        buttonInternational.setBounds(90,150,120,30);
        
        
        //DITO  KA MAG SESET NG KULAY SA TATLONG JBUTTON
        
        
        //
        buttonLocal.addActionListener(this);
        buttonInternational.addActionListener(this);

       
     
        String[] Default = {"--Choose Destination--"};
        defaultComboBox = new JComboBox(Default);
        DestinationPanel.add(defaultComboBox);
        defaultComboBox.setBounds(90,220,150,30);
        
        // DITO KA MAG SET NG BG COLOR NG CHOOSE DESTINATION COMBO BOX

              
       // String[] Local = {"Manila to Batanes","Batanes  to Manila", "Manila to Palawan", "Palawan to Manila"};
       
        Local[0] = "Manila to Batanes";
        Local[1] = "Batanes to Manila";
        Local[2] = "Manila to Palawan";
        Local[3] = "Palawan to Manila";
        
        comboBoxLocal = new JComboBox(Local);
        comboBoxLocal.setVisible(false);
        DestinationPanel.add(comboBoxLocal);
        comboBoxLocal.setBounds(90,220,150,30);
        
        
     
        
        
        
        //String[] International = {"Manila to South Korea","South Korea to Manila", "Manila to Japan", "Japan to Manila", "Manila to Vietnam", "Vietnam to Manila"};
      
        International[0] = "Manila to South Korea";
        International[1] = "South Korea to Manila";
        International[2] = "Manila toJapan";
        International[3] = "Japan to Manila";
        International[4] = "Manila to Taiwan";
        International[5] = "Taiwan to Manila";
        comboBoxInternational = new JComboBox(International);
        comboBoxInternational.setVisible(false);
        DestinationPanel.add(comboBoxInternational);
        comboBoxInternational.setBounds(90,220,150,30);
      
      
        
      
        nextPassengerDetails = new JButton("Proceed");
        DestinationPanel.add(nextPassengerDetails);
        nextPassengerDetails.setBounds(20,270,90,30);
        nextPassengerDetails.addActionListener(this);
        
        //DITO KA MAG SET BG COLOR
        
        cancelDestination = new JButton("Cancel");
        DestinationPanel.add(cancelDestination);
        cancelDestination.setBounds(190,270,80,30);
        cancelDestination.addActionListener(this);
        
        //DITO KA MAG SET BG COLOR
        
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

			
		
		 if(e.getSource()== buttonLocal ){
			 comboBoxLocal.setVisible(true);
			 comboBoxInternational.setVisible(false);
			 defaultComboBox.setVisible(false); 
			 confirmationButton = 1;
			 
			 PassengerAll[TransactionCounting][4] = "Local";
			 
		 }else if(e.getSource()== buttonInternational){
            
        	 comboBoxInternational.setVisible(true);
			 comboBoxLocal.setVisible(false);
			 defaultComboBox.setVisible(false);
			 confirmationButton = 1;
			 
			 PassengerAll[TransactionCounting][4] = "International";
			 
			 
         }else if(e.getSource()== nextPassengerDetails){
        
        	 
        	 if(confirmationButton == 1) {    
        		 
        		 selectedValuesLocal = comboBoxLocal.getSelectedIndex();
        		 //saving local destination  data to two dimensional array
    			 
        		
    			 if(selectedValuesLocal == 0) {
    				 System.out.println(Local[0]);
    				 PassengerAll[TransactionCounting][5] = Local[0];
    			 }else if(selectedValuesLocal == 1){
    				 PassengerAll[TransactionCounting][5] = Local[1];
    			 }else if(selectedValuesLocal == 2){
    				 PassengerAll[TransactionCounting][5] = Local[2];
    			 }else if(selectedValuesLocal == 3){
    				 PassengerAll[TransactionCounting][5] = Local[3];
    			 }
    			 
    			 	passenger passenger = new passenger();
    			 	passenger.passengerDetails(); 
        	 		Destination.dispose();
        	 
        	 
        	 
        }else {
        	JOptionPane.showMessageDialog(null, "Input Travel Destination", "No Travel Destination Accepted", JOptionPane.ERROR_MESSAGE);
       
        }
	  }
		 
         else if(e.getSource()==cancelDestination) {
    		

    			
    			AirlineType jonnyPassenger = new AirlineType();
    			OverAllTransaction = OverAllTransaction-1;
    	        jonnyPassenger.Airplane();
    			Destination.dispose();
    		 
    	 }
	}
}


