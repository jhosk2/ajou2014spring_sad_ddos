package CAR;

import java.util.ArrayList;

public class Item {
	
	private ArrayList<ItemDescription> listDescription = new ArrayList<ItemDescription>();
	
	public ItemDescription[] getList()
	{
		ItemDescription[] aryDescription = new ItemDescription[ listDescription.size() ];
		
		return listDescription.toArray(aryDescription);
	}	
	
	public void addItemDescription( ItemDescription itemDescription )
	{
		listDescription.add( itemDescription );
	}
}
