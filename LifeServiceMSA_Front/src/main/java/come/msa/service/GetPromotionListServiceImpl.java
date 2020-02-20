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
import come.msa.vo.Offer;
import come.msa.vo.Promotion;

@Service
public class GetPromotionListServiceImpl implements GetPromotionListService{
	
	private static final String get_prom_url = "http://10.148.142.75:9999/compositionapi/getproms/";
	private static final String get_offer_url = "http://10.148.142.75:9999/compositionapi/getoffers/";
	
	@Override
	public ArrayList<Promotion> getPromotionList(String itemid) throws MyException{
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Promotion> prom_list = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Map<String,Object>> response = null;
		
		response = restTemplate.exchange(get_prom_url+itemid, 
				HttpMethod.GET, null, new ParameterizedTypeReference<Map<String,Object>>() {	
		});
		String status = response.getBody().get("status").toString();
		if(status.equals("success")) {
			List<Promotion> proms = mapper.convertValue(response.getBody().get("data"), new TypeReference<List<Promotion>>(){});
			for(int i=0; i<proms.size(); i++) {
				String promid = proms.get(i).getPromId();
				ResponseEntity<List<Offer>> prom_res = 
					restTemplate.exchange(get_offer_url+promid, HttpMethod.GET, null, new ParameterizedTypeReference<List<Offer>>() {	
				});
				Promotion prom = new Promotion();
				prom.setPromId(promid);
				prom.setPromNM(proms.get(i).getPromNM());
				prom.setOffers(mapper.convertValue(prom_res.getBody(), new TypeReference<List<Offer>>(){}));
				prom_list.add(prom);

			}
		}else {
			throw new MyException(response.getBody().get("msg").toString());
		}
		return prom_list;	
	}
}
