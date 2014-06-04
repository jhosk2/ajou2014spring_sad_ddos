package CAR;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Store {
	
	ArrayList<Table> listTable = new ArrayList<Table>();
	Queue<Register> queueRegister = new LinkedList<Register>();
	
	private Store()
	{
		Table t1 = new Table();
		Table t2 = new Table();
		Table t3 = new Table();

		listTable.add(t1);
		listTable.add(t2);
		listTable.add(t3);
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
