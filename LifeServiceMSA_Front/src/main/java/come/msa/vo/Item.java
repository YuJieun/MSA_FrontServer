package come.msa.vo;

import java.util.Date;

public class Item {
	private String itemId;
	private String itemNM;
	private Integer fstSellPrc;
	private String regPeId;
	private Date regDts;
	private String modPeId;
	private Date modDts;
	private String promNM;
	
	public Item() {}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemNM() {
		return itemNM;
	}
	public void setItemNM(String itemNM) {
		this.itemNM = itemNM;
	}
	public Integer getFstSellPrc() {
		return fstSellPrc;
	}
	public void setFstSellPrc(Integer fstSellPrc) {
		this.fstSellPrc = fstSellPrc;
	}
	public String getRegPeId() {
		return regPeId;
	}
	public void setRegPeId(String regPeId) {
		this.regPeId = regPeId;
	}
	public String getModPeId() {
		return modPeId;
	}
	public void setModPeId(String modPeId) {
		this.modPeId = modPeId;
	}
	public Date getRegDts() {
		return regDts;
	}
	public void setRegDts(Date regDts) {
		this.regDts = regDts;
	}
	public Date getModDts() {
		return modDts;
	}
	public void setModDts(Date modDts) {
		this.modDts = modDts;
	}

	public String getPromNM() {
		return promNM;
	}

	public void setPromNM(String promNM) {
		this.promNM = promNM;
	}
	
	

}
