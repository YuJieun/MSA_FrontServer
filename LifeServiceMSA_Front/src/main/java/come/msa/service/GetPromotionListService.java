package come.msa.service;

import java.util.ArrayList;

import come.msa.exception.MyException;
import come.msa.vo.Promotion;

public interface GetPromotionListService {
	public ArrayList<Promotion> getPromotionList(String itemid) throws MyException;
}
