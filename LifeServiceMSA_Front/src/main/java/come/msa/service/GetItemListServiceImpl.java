package come.msa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import come.msa.exception.MyException;
import come.msa.vo.Item;
import come.msa.vo.Promotion;

@Service
public class GetItemListServiceImpl implements GetItemListService{
	
	private static final String get_item_url = "http://10.148.142.75:9999/compositionapi/getitems/";

	@Override
	public ArrayList<Item> getItemList(String pnshopid) throws MyException{
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Item> item_list = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Map<String,Object>> response = null;

		response = restTemplate.exchange(get_item_url+pnshopid, 
				HttpMethod.GET, null, new ParameterizedTypeReference<Map<String,Object>>() {
		});
		String status = response.getBody().get("status").toString();
		if(status.equals("success")) {
			List<Item> items = mapper.convertValue(response.getBody().get("data"), new TypeReference<List<Item>>(){});
			for(int i=0; i<items.size(); i++) {
				Item item = new Item();
				item.setItemId(items.get(i).getItemId());
				item.setItemNM(items.get(i).getItemNM());
				item.setFstSellPrc(items.get(i).getFstSellPrc());
				item_list.add(item);
			}
		}else {
			throw new MyException(response.getBody().get("msg").toString());
		}
		return item_list;	
	}
}
