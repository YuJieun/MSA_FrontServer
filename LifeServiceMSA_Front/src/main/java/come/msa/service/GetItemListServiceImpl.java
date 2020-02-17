package come.msa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import come.msa.vo.Item;


public class GetItemListServiceImpl implements GetItemListService{
	
	@Override
	public ArrayList<Item> getItemList(String pnshopid) {
		ArrayList<Item> item_list = new ArrayList<>();
		
		RestTemplate restTemplate = new RestTemplate();
		String url_str = "http://127.0.0.1:8100/getitems/"+pnshopid;
		
		ResponseEntity<List<Map<String,String>>> response = 
				restTemplate.exchange(url_str, 
						HttpMethod.GET, null, new ParameterizedTypeReference<List<Map<String,String>>>() {
					
				});
		
		List<Map<String,String>> items = response.getBody();
		for(int i=0; i<items.size(); i++) {
			Item item = new Item();
			//밑에는 msa플젝에서 param정해서 맞추기
			item.setItem_id(items.get(i).get("id"));
			item.setItem_nm(items.get(i).get("name"));	
			item.setFst_sellprc(Integer.parseInt(items.get(i).get("origin_price")));
			item.setDisc_sellprc(Integer.parseInt(items.get(i).get("discount_price")));
			item_list.add(item);
		}

		return item_list;	
	}

}
