package ie.lyit.flight;
import java.util.ArrayList;

public class Booking {

	private Flight outbound;//outbound:Flight			// Flight has a flightNumber...
	private Flight inbound;	//inbound:Flight
	ArrayList<Passenger> passengers = new ArrayList<Passenger>();//passengers:ArrayList<Passenger>
	private double totalPrice; //totalPrice:double
	private int bookingNo;//bookingNo:int
	private static int	nextUniqueBookingNumber=1000; //nextUniqueBookingNumber:static int
	
//Booking(oF:Flight,iF:Flight,p:ArrayList<Passenger>)
	 public Booking (Flight oF, Flight iF,ArrayList<Passenger> p)
	 {
		if(oF!=null	) {
			this.outbound = oF;
		}
		this.totalPrice = calculatePrice();
		this.inbound = iF;
		 
		 //ensure numbers are correct 
		 if(p.size()>=1&& p.size()<=9){ 
			 this.passengers = p;
		 
		 	}
		 this.bookingNo = nextUniqueBookingNumber++;
	 }
	
	
	//toString():String
	  public String toString()
	    {
	      
		  return bookingNo + " " + outbound + " " + inbound + " "
		            + passengers + " " + bookingNo +" " + totalPrice;
		  
		  
		  
	    }
	//equals(obj:Object):boolean
	    @Override  // Overrides Object equals()
	    public boolean equals(Object obj){
	       Booking eObject;
	        if (obj instanceof Booking)
	            eObject = (Booking)obj;
	        else
	            return false;

	        return this.bookingNo == eObject.bookingNo;
	    }
 
	  //ArrayList<Passenger> passengers = new ArrayList<Passenger>();
	  
	    
	    public boolean findPassenger(Passenger p)
	    {
	    	 return passengers.contains(p);
	    }
	    
	// calculatePrice():double
	  public double calculatePrice( )
	  {
		  double out=0;
		  double in=0;
		  if(this.outbound!=null) {
			  out=this.outbound.getPrice();
			  
		  }
		  if(this.inbound!=null) {
			  out=this.inbound.getPrice();
			  
		  }
			  
			  
		  double tempPrice = out + in;
		return tempPrice*this.passengers.size();
		
	  
	  }

	  public void  setTotalPrice(double d)
	  {
		  this.calculatePrice();
	  }
	
	  public double  getTotalPrice()
	  {
		  return this.totalPrice;
	  }


	public void setInbound(Flight inbound2, Flight inbound) {
		// TODO Auto-generated method stub
		this.inbound = inbound;
	}
	
}
