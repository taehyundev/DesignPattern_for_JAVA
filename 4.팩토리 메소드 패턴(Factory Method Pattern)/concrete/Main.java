package concrete;

import framework.Item;
import framework.ItemCreator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		creator = new MpCreator();
		creator.create();
	}

}
