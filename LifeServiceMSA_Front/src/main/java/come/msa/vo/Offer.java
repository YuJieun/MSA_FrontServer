package come.msa.vo;

public class Offer {
	private String offerId;
	private String offerNM;
	private String offerTypeCd;
	private String discountValue;

	public Offer() {}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getOfferNM() {
		return offerNM;
	}
	public void setOfferNM(String offerNM) {
		this.offerNM = offerNM;
	}
	public String getOfferTypeCd() {
		return offerTypeCd;
	}
	public void setOfferTypeCd(String offerTypeCd) {
		this.offerTypeCd = offerTypeCd;
	}
	public String getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}

}
