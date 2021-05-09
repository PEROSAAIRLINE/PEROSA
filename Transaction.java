package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends passenger{
	JFrame transactionFrame;
	JButton Payment, PaymentCancel;
	JPanel TransactionPanel;
	JLabel transactionProcessingFeeLabel, taxfee, fare, baggage, insurance, totalPayment,
			airlineType,travelType, passengerDestination, passengerName, passengerAge;
	void transactionMethod() {
		transactionFrame = new JFrame("This is a TEst");
		transactionFrame.setBounds(400,100,500,500);
		transactionFrame.setVisible(true);
		transactionFrame.setLayout(null);
    	transactionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	transactionFrame.setResizable(false);
    	
    	
    	  
    	
    	
        TransactionPanel = new JPanel();
        
        transactionFrame.getContentPane().add(TransactionPanel);
        TransactionPanel.setLayout(null);
        TransactionPanel.setBackground(Color.WHITE);
        TransactionPanel.setBounds(100,20,300,300);
        
        
        
        //mula dito 
        
        passengerName = new JLabel("Name:");
        TransactionPanel.add(passengerName);
        passengerName.setBounds(10,0,120,30);
        
        passengerAge = new JLabel("Age:");
        TransactionPanel.add(passengerAge);
        passengerAge.setBounds(10,20,120,30);
        
        airlineType = new JLabel("Airline Type");
        TransactionPanel.add(airlineType);
        airlineType.setBounds(10,40,120,30);
        
        travelType = new JLabel("Travel Type");
        TransactionPanel.add(travelType);
        travelType.setBounds(10,60,120,30);
        
        passengerDestination = new JLabel("Destination");
        TransactionPanel.add(passengerDestination);
        passengerDestination.setBounds(10,80,120,30);
        
        
        
        transactionProcessingFeeLabel = new JLabel("transaction Processing Fee:  ");
        TransactionPanel.add(transactionProcessingFeeLabel);
        transactionProcessingFeeLabel.setBounds(10,100,420,30);
        
        taxfee = new JLabel("transaction Tax:  ");
        TransactionPanel.add(taxfee);
        taxfee.setBounds(10,120,420,30);
        
        fare = new JLabel("Fare:  ");
        TransactionPanel.add(fare);
        fare.setBounds(10,140,420,30);
        
        baggage = new JLabel("baggage Fee:  ");
        TransactionPanel.add(baggage);
        baggage.setBounds(10,160,420,30);
        
        insurance = new JLabel("insurance Fee:  ");
        TransactionPanel.add(insurance);
        insurance.setBounds(10,180,420,30);
        insurance.setVisible(false);
        
        totalPayment = new JLabel("Total Payment:  ");
        TransactionPanel.add(totalPayment);
        totalPayment.setBounds(10,200,420,30);
        
        // hanggang dito ka mag set bounds 

        Payment = new JButton("Pay");
        TransactionPanel.add(Payment);
        Payment.setBounds(20,240,120,30);
        Payment.addActionListener(this);
        
        //dito ka mag set ng bg color
       
        
        PaymentCancel = new JButton("Cancel");
        TransactionPanel.add(PaymentCancel);
        PaymentCancel.setBounds(150,240,120,30);
        PaymentCancel.addActionListener(this);
        
        
        //dito ka mag set ng bg color
        
        
	}  
        @Override
    	public void actionPerformed(ActionEvent e) {
        	if(e.getSource()==Payment) {
        	Receipt Receipt = new Receipt();
        	 Receipt.receiptMethod();
        	 transactionFrame.dispose();  
        	}
        	 
        	else if(e.getSource()==PaymentCancel) {
        		
        		passenger passenger = new passenger();
        		passenger.passengerDetails(); 
        		transactionFrame.dispose();  
        		
        	}
    
	
	}
}

