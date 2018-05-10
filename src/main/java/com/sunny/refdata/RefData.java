package com.sunny.refdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RefData {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Id;
	private String Symbol;
	private String Name;
	private Double MarketCap;
	private Integer IPOYear;
	private String Sector;
	private String Industry;
	private String SummaryQuote;
	
	public RefData() {
		super();
	}
	
	public RefData(String symbol, String name, double marketCap, int ipoYear, String sector, String industry, String summaryQuote) {
		this.Symbol = symbol;
		this.Name = name;
		this.MarketCap = marketCap;
		this.IPOYear = ipoYear;
		this.Sector = sector;
		this.Industry = industry;
		this.SummaryQuote = summaryQuote;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getSymbol() {
		return Symbol;
	}
	public void setSymbol(String symbol) {
		Symbol = symbol;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getMarketCap() {
		return MarketCap;
	}
	public void setMarketCap(Double marketCap) {
		MarketCap = marketCap;
	}
	public Integer getIPOYear() {
		return IPOYear;
	}
	public void setIPOYear(Integer iPOYear) {
		IPOYear = iPOYear;
	}
	public String getSector() {
		return Sector;
	}
	public void setSector(String sector) {
		Sector = sector;
	}
	public String getIndustry() {
		return Industry;
	}
	public void setIndustry(String industry) {
		Industry = industry;
	}
	public String getSummaryQuote() {
		return SummaryQuote;
	}
	public void setSummaryQuote(String summaryQuote) {
		SummaryQuote = summaryQuote;
	}
	
    
    
}

