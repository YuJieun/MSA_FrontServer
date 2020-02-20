package come.msa.vo;

import java.sql.Date;

public class PnShop {
	
	private String pnshop_id;
	private String pnshop_nm;
	private String pnshop_strt_dts;
	private String pnshop_end_dts;
	
	public String getpnshop_id() {
		return pnshop_id;
	}
	
	public void setPnshopid(String pnshop_id) {
		this.pnshop_id = pnshop_id;
	}
	
	public String getpnshop_nm() {
		return pnshop_nm;
	}
	
	public void setpnshop_nm(String pnshop_nm) {
		this.pnshop_nm = pnshop_nm;
	}

	public String getPnshop_strt_dts() {
		return pnshop_strt_dts;
	}

	public void setPnshop_strt_dts(String pnshop_strt_dts) {
		this.pnshop_strt_dts = pnshop_strt_dts;
	}

	public String getPnshop_end_dts() {
		return pnshop_end_dts;
	}

	public void setPnshop_end_dts(String pnshop_end_dts) {
		this.pnshop_end_dts = pnshop_end_dts;
	}

}
