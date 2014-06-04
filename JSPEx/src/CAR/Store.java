package CAR;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Store {
	
	ArrayList<Table> listTable = new ArrayList<Table>();
	Queue<Register> queueRegister = new LinkedList<Register>();
	
	private Store()
	{
	
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
		return listTable.get( tableId );
	}
	
}
