package managerService;

import java.util.List;

import model.Item;

public interface ManagerService {

	public  int  addItems(String itemName,double itemPrice,int quantity );//Adds the new items to the item list
	public   int  updateItems(String updatedItemName,double updatedItemPrice,int Updatedquantity);//Updates the item details
	public   int removeItems(String itemName);//Removes the items from the list
	public   int searchitems(String itemName);//Searches and item by name
	public   List<Item> listItems();//Returns the item listt
}
