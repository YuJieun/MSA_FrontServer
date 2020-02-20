package come.msa.service;

import java.util.List;

import come.msa.exception.MyException;
import come.msa.vo.PnShop;

public interface GetPnshopListService {
	public List<PnShop> getPnshopList() throws MyException;
}
