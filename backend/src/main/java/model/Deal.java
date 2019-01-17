package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "deal")
@XmlAccessorType(XmlAccessType.FIELD)
public class Deal {

	private Long id;
	private String title;
	private String text;
	private Date createDate;
	private Date publishDate;
	private Date endDate;
	private String url;
	private Long totalSold;
	private Long dealTypeId;
	private List<BuyOption> listBuyOption;

	public Deal() {
		this(null, "", "", new Date(), new Date(), new Date(), "", 0L, DealTypeEnum.LOCAL.getId());
	}

	public Deal(Long id, String title, String text, Date createDate, Date publishDate, Date endDate, String url, Long totalSold, Long dealTypeId) {
		this(id, title, text, createDate, publishDate, endDate, url, totalSold, dealTypeId, new ArrayList<BuyOption>());
	}

	public Deal(Long id, String title, String text, Date createDate, Date publishDate, Date endDate, String url, Long totalSold, Long dealTypeId, List<BuyOption> listBuyOption) {
		super();
		setId(id);
		setTitle(title);
		setText(text);
		setCreateDate(createDate);
		setPublishDate(publishDate);
		setEndDate(endDate);
		setUrl(url);
		setTotalSold(totalSold);
		setDealTypeId(dealTypeId);
		setListBuyOption(listBuyOption);
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Long getDealTypeId() {
		return dealTypeId;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Long getId() {
		return id;
	}

	public List<BuyOption> getListBuyOption() {
		return listBuyOption;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public String getText() {
		return text;
	}

	public String getTitle() {
		return title;
	}

	public Long getTotalSold() {
		return totalSold;
	}

	public String getUrl() {
		return url;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setDealTypeId(Long dealTypeId) {
		this.dealTypeId = dealTypeId;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setListBuyOption(List<BuyOption> listBuyOption) {
		this.listBuyOption = listBuyOption;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTotalSold(Long totalSold) {
		this.totalSold = totalSold;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Deal [id=" + getId() + ", title=" + getTitle() + ", text=" + getText() + ", createDate=" + getCreateDate() + ", publishDate=" + getPublishDate() + ", endDate=" + getEndDate()
				+ ", url=" + getUrl() + ", totalSold=" + getTotalSold() + ", dealTypeId=" + getDealTypeId() + "]";
	}

}
