package CAR;

import java.util.ArrayList;

public class Table {
	
	private boolean isOccupied = false;
	private Order order = null;
	
	public ArrayList<ItemDescription> getItemDescriptionList()
	{
		ArrayList<ItemDescription> list = ItemManager.getInstance().getItemDescriptionList();
		order = new Order();
		return list;
	}
	
	public void selectItem( int itemId, int quantity )
	{
		order.addItemDescription( itemId, quantity );
	}
	
	public void makeOrder()
	{
		order.makeOrder( Store.getinstance().allocateRegister() );
	}
	
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
