package come.msa.vo;

import java.util.Date;
import java.util.List;

public class Promotion {
	private String promId;
	private String promNM;
	private Date promEnfcStrtDts;
	private Date promEnfcEndDts;
	private String promDesc;
	private String RegpeId;
	private Date regDts;
	private String modpeId;
	private Date modDts;
	private List<Offer> offers;
	
	public Promotion() {}
	
	public String getPromId() {
		return promId;
	}
	public void setPromId(String promId) {
		this.promId = promId;
	}
	public String getPromNM() {
		return promNM;
	}
	public void setPromNM(String promNM) {
		this.promNM = promNM;
	}
	public Date getPromEnfcStrtDts() {
		return promEnfcStrtDts;
	}
	public void setPromEnfcStrtDts(Date promEnfcStrtDts) {
		this.promEnfcStrtDts = promEnfcStrtDts;
	}
	public Date getPromEnfcEndDts() {
		return promEnfcEndDts;
	}
	public void setPromEnfcEndDts(Date promEnfcEndDts) {
		this.promEnfcEndDts = promEnfcEndDts;
	}
	public String getPromDesc() {
		return promDesc;
	}
	public void setPromDesc(String promDesc) {
		this.promDesc = promDesc;
	}
	public String getRegpeId() {
		return RegpeId;
	}
	public void setRegpeId(String regpeId) {
		RegpeId = regpeId;
	}
	public Date getRegDts() {
		return regDts;
	}
	public void setRegDts(Date regDts) {
		this.regDts = regDts;
	}
	public String getModpeId() {
		return modpeId;
	}
	public void setModpeId(String modpeId) {
		this.modpeId = modpeId;
	}
	public Date getModDts() {
		return modDts;
	}
	public void setModDts(Date modDts) {
		this.modDts = modDts;
	}

	public List<Offer> getOffers() {
		return offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}
}
