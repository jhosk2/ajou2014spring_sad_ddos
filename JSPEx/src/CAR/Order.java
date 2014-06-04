package CAR;

import java.util.Date;

public class Order {
	
	private Date dateTime;
	private int total;
	private boolean isOrdered = false;

	private Register register;

	private Item item = new Item();
	
	public void addItemDescription( int itemId, int quantity )
	{
		ItemDescription itemDescription = ItemManager.getInstance().getItemDescription(itemId);
		for ( int i = 0 ; i < quantity ; ++i )
		{
			item.addItemDescription(itemDescription);
			total += itemDescription.getPrice();
		}
	}
	
	public void makeOrder(Register register) {
		
		if ( isOrdered )
		{
			return;
		}
		
		this.register = register;
		this.dateTime = new Date();
		this.isOrdered = true;
	}

	public int getTotal() {
		return total;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void payment() {
		register.saveOrder(this);
	}
	
}
