package come.msa.vo;

public class Item {
	private String item_id;
	private String item_nm;
	private int fst_sellprc;
	private int disc_sellprc;

	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getItem_nm() {
		return item_nm;
	}
	public void setItem_nm(String item_nm) {
		this.item_nm = item_nm;
	}
	public int getFst_sellprc() {
		return fst_sellprc;
	}
	public void setFst_sellprc(int fst_sellprc) {
		this.fst_sellprc = fst_sellprc;
	}
	public int getDisc_sellprc() {
		return disc_sellprc;
	}
	public void setDisc_sellprc(int disc_sellprc) {
		this.disc_sellprc = disc_sellprc;
	}

}
