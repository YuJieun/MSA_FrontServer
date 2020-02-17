package come.msa.service;

import java.util.ArrayList;

import come.msa.vo.Item;

public interface GetItemListService {
	public ArrayList<Item> getItemList(String pnshopid);
}
