package com.pojo;

import java.util.Date;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;

public class Provider {
	
	private Integer id;   //id
	@NotEmpty(message="供应商编码不能为�?")
	private String proCode; //供应商编�?
	@NotEmpty(message="供应商名称不能为�?")
	private String proName; //供应商名�?
	private String proDesc; //供应商描�?
	@NotEmpty(message="联系人不能为�?")
	private String proContact; //供应商联系人
	@Pattern(regexp="^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$",message="请输入正确格式的手机�?")
	private String proPhone; //供应商电�?
	private String proAddress; //供应商地�?
	private String proFax; //供应商传�?
	private Integer createdBy; //创建�?
	private Date creationDate; //创建时间
	private Integer modifyBy; //更新�?
	private Date modifyDate;//更新时间
	private String companyLicPicPath;//企业营业执照的存储路�?
	private String orgCodePicPath;//组织机构代码证的存储路径
	
	public String getOrgCodePicPath() {
		return orgCodePicPath;
	}
	public void setOrgCodePicPath(String orgCodePicPath) {
		this.orgCodePicPath = orgCodePicPath;
	}
	public String getCompanyLicPicPath() {
		return companyLicPicPath;
	}
	public void setCompanyLicPicPath(String companyLicPicPath) {
		this.companyLicPicPath = companyLicPicPath;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public String getProContact() {
		return proContact;
	}
	public void setProContact(String proContact) {
		this.proContact = proContact;
	}
	public String getProPhone() {
		return proPhone;
	}
	public void setProPhone(String proPhone) {
		this.proPhone = proPhone;
	}
	public String getProAddress() {
		return proAddress;
	}
	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}
	public String getProFax() {
		return proFax;
	}
	public void setProFax(String proFax) {
		this.proFax = proFax;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
}
