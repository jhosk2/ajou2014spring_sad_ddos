package CAR;

import java.util.ArrayList;

public class Table {
	
	/**
	 * if table is occupied true, otherwise false;
	 */
	private boolean isOccupied = false;
	private Order order = null;
	
	public ArrayList<ItemDescription> getItemDescriptionList()
	{
		ArrayList<ItemDescription> list = ItemManager.getInstance().getItemDescriptionList();
		order = new Order();
		return list;
	}
	
	public Order selectItem( int itemId, int quantity )
	{
		order.addItemDescription( itemId, quantity );
		return order;
	}
	
	public void makeOrder()
	{
		order.makeOrder( Store.getinstance().allocateRegister() );
	}
	
	/**
	 * Get table status that is either already occupied or not.
	 * @return {@link #isOccupied}
	 */
	public boolean requestTableStatus()
	{
		return isOccupied;
	}
	
	public boolean occupyTable()
	{
		if ( isOccupied )
		{
			return false;
		}
		
		isOccupied = true;
		
		return isOccupied;
	}
	
	public void payment()
	{
		order.payment();
		release();
	}
	
	private void release()
	{
		this.order = null;
		this.isOccupied = false;
	}
}
