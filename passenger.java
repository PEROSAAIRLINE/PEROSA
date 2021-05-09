package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public  class passenger extends Destination{
	
   
    JFrame jonnyMain;
    JTextField inputAge,inputName,imputNumberofPassenegrs;
    JButton passengerButtonNext1, cancelPassenger;
    JPanel passengerDetails;
    
    String userInputName, userInputAge;
   
    public void passengerDetails(){ 
    	
        jonnyMain = new JFrame("This is a TEst");
        jonnyMain.setBounds(400,100,500,500);
        jonnyMain.setVisible(true);
        jonnyMain.setLayout(null);
        jonnyMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jonnyMain.setResizable(false);
        
         passengerDetails = new JPanel();
        
        jonnyMain.getContentPane().add(passengerDetails);
        passengerDetails.setLayout(null);
       
        passengerDetails.setBackground(Color.WHITE);
        
        
        //input name
        inputName = new JTextField();
        passengerDetails.add(inputName);
        inputName.addActionListener(this);
        
        
        
        inputAge = new JTextField();
        passengerDetails.add(inputAge);
        inputAge.addActionListener(this);
        
        JLabel passengerName = new JLabel("Name");
        passengerDetails.add(passengerName);
        
        JLabel passengerAge = new JLabel("Age");
        passengerDetails.add(passengerAge);
        
        JLabel numberofPassenegrs = new JLabel("# of passenger");
        passengerDetails.add(numberofPassenegrs);
        
         imputNumberofPassenegrs = new JTextField();
        passengerDetails.add(imputNumberofPassenegrs);
        imputNumberofPassenegrs.setEditable(false);
        
        
        imputNumberofPassenegrs.setBounds(110,120,160,30);
        numberofPassenegrs.setBounds(20,120,90,30);
        inputAge.setBounds(70,80,160,30);
        passengerAge.setBounds(20,80,90,30);
        inputName.setBounds(70,40,160,30);
        passengerName.setBounds(20,40,90,30);
        passengerDetails.setBounds(100,20,300,300);
        
        
        
        //button
        passengerButtonNext1 = new JButton("Next");
        passengerDetails.add(passengerButtonNext1);
        passengerButtonNext1.setBounds(20,180,120,30);
        passengerButtonNext1.addActionListener(this);
        
        //DITO KA MAG SET NG BG COLOR SA NEXT BUTTON
        
        cancelPassenger = new JButton("Cancel");
        passengerDetails.add(cancelPassenger);
        cancelPassenger.setBounds(160,180,120,30);
        cancelPassenger.addActionListener(this);
        
        //DITO KA MAG SET NG BG COLOR SA CANCEL BUTTON
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Transaction Transaction = new Transaction();
	
		if(e.getSource()== passengerButtonNext1 ){
			
			userInputName =  inputName.getText();
			PassengerAll[TransactionCounting][6] = userInputName;
			System.out.println(PassengerAll[TransactionCounting][6]);
			 
			userInputAge = inputAge.getText();
			PassengerAll[TransactionCounting][7] = userInputAge;
			System.out.println(PassengerAll[TransactionCounting][7]);
			
			int insuranceQuestioning = JOptionPane.showConfirmDialog(null,  "Would you like to avail travel insureance?");
			
			if(insuranceQuestioning == 0) {
				
				Transaction.transactionMethod();
				Transaction.insurance.setVisible(true);
				jonnyMain.dispose();
			}else if(insuranceQuestioning == 1 ) {
				Transaction.transactionMethod();
				jonnyMain.dispose();
				
			}
		}
		else if(e.getSource()==cancelPassenger) {
			Destination Destination = new Destination();
			Destination.DestinationInformation();
			jonnyMain.dispose();
		}
	}
}

