package CAR;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Store {
	
	ArrayList<Table> listTable = new ArrayList<Table>();
	Queue<Register> queueRegister = new LinkedList<Register>();
	ArrayList<Order> listOrder = new ArrayList<Order>();
	
	private Store()
	{
		Table t1 = new Table(0);
		Table t2 = new Table(1);
		Table t3 = new Table(2);

		listTable.add(t1);
		listTable.add(t2);
		listTable.add(t3);
		
		queueRegister.add(new Register(0));
	}
	
	private static Store instance = new Store();
	public static Store getinstance()
	{
		return instance;
	}

	public Register allocateRegister() {
		Register register = queueRegister.poll();
		queueRegister.offer(register);
		return register;
	}
	
	public void addOrder( Order order )
	{
		listOrder.add(order);
	}
	
	public ArrayList<Order> getOrders()
	{
		return listOrder;
	}
	
	public ArrayList<Table> getTables()
	{
		return listTable;
	}
	
	public Table getTable( int tableId )
	{
		if ( tableId < 0 )
		{
			return null;
		}
		
		if ( listTable.size() > tableId )
		{
			return listTable.get( tableId );
		}
		
		return null;
	}
	
}
