package AirlineReservation;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class AirlineType implements ActionListener{
	JFrame airplaneType;
    JButton buttonPrivate, buttonPublic, buttonRegular ;
   
    //all of Pasenger
    public static  String PassengerAll[][] = new String[1350][12];
    public static int OverAllTransaction = 1 , TransactionCounting;
    
    
    public void Airplane(){ 
    	airplaneType = new JFrame("This is a TEst");
    	airplaneType.setBounds(400,100,500,500);
    	airplaneType.setVisible(true);
    	airplaneType.setLayout(null);
    	airplaneType.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	airplaneType.setResizable(false);
    	
    	
    	  
        JPanel airplaneTypePanel = new JPanel();
        airplaneType.getContentPane().add(airplaneTypePanel);
        airplaneTypePanel.setLayout(null);
        
        JLabel chooseAirplaneType = new JLabel("Choose Airplane Type");
        airplaneTypePanel.add(chooseAirplaneType);
        chooseAirplaneType.setBounds(90,40,150,30);
        
        airplaneTypePanel.setBackground(Color.DARK_GRAY);
        airplaneTypePanel.setBounds(100,20,300,300);

        
        buttonPrivate = new JButton("Private");
        buttonPublic = new JButton("Business");
        buttonRegular = new JButton("Regular Fare");
   
        
        airplaneTypePanel.add(buttonPrivate);
        airplaneTypePanel.add(buttonPublic);
        airplaneTypePanel.add(buttonRegular);
        
        
        buttonPrivate.setBounds(90,100,150,30);
        buttonPublic.setBounds(90,150,150,30);
        buttonRegular.setBounds(90,200,150,30);
        
        buttonPrivate.setBackground(Color.PINK);
        buttonPublic.setBackground(Color.PINK);
        buttonRegular.setBackground(Color.PINK);
        
        buttonPrivate.addActionListener(this);
        buttonPublic.addActionListener(this);
        buttonRegular.addActionListener(this);
    	
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		Destination Destination = new Destination();
		
		 if(e.getSource()== buttonPrivate ){
			 
			 ++OverAllTransaction;
			 TransactionCounting = OverAllTransaction - 1;
			 //System.out.println(Transaction);
			
			 PassengerAll[TransactionCounting][3] = "Private";
			 System.out.println(PassengerAll[TransactionCounting][3]);
			 System.out.println(TransactionCounting);
			 Destination.DestinationInformation();
			 airplaneType.dispose();
			 
         }else if(e.getSource()== buttonPublic){
        	 
        	 ++OverAllTransaction;
        	 TransactionCounting = OverAllTransaction - 1;
			 //System.out.println(TransactionCounting);
        	 PassengerAll[TransactionCounting][3] = "Business";
        	 
        	 System.out.println(PassengerAll[TransactionCounting][3]);
			 System.out.println(TransactionCounting);
            
        	 Destination.DestinationInformation();
        	 airplaneType.dispose();
        	 
         }else if(e.getSource()== buttonRegular){
        	 ++OverAllTransaction;
        	 TransactionCounting = OverAllTransaction - 1;
        	 PassengerAll[TransactionCounting][3] = "Regular";
        	 System.out.println(PassengerAll[TransactionCounting][3]);
			 System.out.println(TransactionCounting);
        	 
        	 Destination.DestinationInformation();
        	 airplaneType.dispose();
          }
	}	
}
