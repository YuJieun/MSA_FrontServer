package come.msa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import come.msa.exception.MyException;
import come.msa.service.GetItemListService;
import come.msa.service.GetPnshopListService;
import come.msa.service.GetPromotionListService;
import come.msa.vo.Item;
import come.msa.vo.Promotion;

@Controller
public class CommonController {
		
	@Autowired
	GetPnshopListService pnshop_service;
	
	@RequestMapping("/main")
    public ModelAndView choosePlanShop() throws MyException{
		ModelAndView main = new ModelAndView("main");
		main.addObject("pnshop_list",pnshop_service.getPnshopList());
        return main;
    }
	
	@Autowired
	GetItemListService item_service;
	
	@RequestMapping("/show")
    public ModelAndView showPlanShop(@RequestParam("pnshopid") String pnshopid) throws MyException{
		ModelAndView view = new ModelAndView("showPlanshop");
		view.addObject("item_list",item_service.getItemList(pnshopid));
        return view;
    }
	
	
	@Autowired
	GetPromotionListService prom_service;
	@RequestMapping("/prom")
    public ModelAndView showPromotion(@RequestParam("itemid") String itemid) throws MyException{
		ModelAndView view = new ModelAndView("showPromotion");
		view.addObject("promotion_list",prom_service.getPromotionList(itemid));
        return view;
    }
	
	@ExceptionHandler()
	public ModelAndView showException(Exception e){
		ModelAndView view = new ModelAndView("exception");
		view.addObject("error_msg",e.getMessage());
        return view;
	}
}
 

