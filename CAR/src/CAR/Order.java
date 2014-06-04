package CAR;

import java.util.Date;

public class Order {
	
	private Date dateTime;
	private int total;
	private boolean isOrdered = false;
	private Table table = null;

	private Register register;

	private Item item = new Item();
	
	public Order(Table t)
	{
		setTable(t);
	}
	
	public void addItemDescription( int itemId, int quantity )
	{
		ItemDescription itemDescription = ItemManager.getInstance().getItemDescription(itemId);
		for ( int i = 0 ; i < quantity ; ++i )
		{
			item.addItemDescription(itemDescription);
			total += itemDescription.getPrice();
		}
	}
	
	public Item getItem()
	{
		return item;
	}
	
	public void makeOrder(Register register) {
		
		if ( isOrdered )
		{
			return;
		}
		
		this.register = register;
		this.dateTime = new Date();
		this.isOrdered = true;
		
		// 주문 들어온거 출력 
		
		Store.getinstance().addOrder(this);
		
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

	public Table getTable() {
		return table;
	}

	private void setTable(Table table) {
		this.table = table;
	}
	
}
