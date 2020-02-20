package come.msa.service;

import java.util.Date;
import java.text.SimpleDateFormat;
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
import come.msa.vo.PnShop;

@Service
public class GetPnshopListServiceImpl implements GetPnshopListService{
	private static final String get_pnshop_url = "http://10.148.142.75:9999/compositionapi/getpnshop";
	@Override
	public List<PnShop> getPnshopList() throws MyException{
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<PnShop> pnshop_id_list = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Map<String,Object>> response = 
		restTemplate.exchange(get_pnshop_url, 
				HttpMethod.GET, null, new ParameterizedTypeReference<Map<String,Object>>() {
			
		});
		String status = response.getBody().get("status").toString();
		if(status.equals("success")) {
			List<PnShop> pnshop = mapper.convertValue(response.getBody().get("data"), new TypeReference<List<PnShop>>(){});
			for(int i=0; i<pnshop.size(); i++) {
				PnShop shop = new PnShop();
				shop.setPnshopid(pnshop.get(i).getpnshop_id());
				shop.setpnshop_nm(pnshop.get(i).getpnshop_nm());	
				shop.setPnshop_strt_dts(pnshop.get(i).getPnshop_strt_dts());
				shop.setPnshop_end_dts(pnshop.get(i).getPnshop_end_dts());
				pnshop_id_list.add(shop);
			}
		}else {
			throw new MyException(response.getBody().get("msg").toString());
		}
		return pnshop_id_list;	
	}
}
