package com.gq.beans;

import java.util.Date;

public class Contract {
	private Integer id;

	/**
	 * 项目编号
	 */
	private String seq;

	/**
	 * 登记日期
	 */
	private Date registerdate;

	/**
	 * 委托单位
	 */
	private String client;

	/**
	 * 项目名称
	 */
	private String projectname;

	/**
	 * 合同额
	 */
	private Double contractamount;

	/**
	 * 已收款
	 */
	private Double receipted;

	/**
	 * 是否包含税
	 */
	private String containtax;

	/**
	 * 预审单应填
	 */
	private Integer preliminary;

	/**
	 * 已填
	 */
	private Integer tianed;

	/**
	 * 已付
	 */
	private Integer paied;

	/**
	 * 结余
	 */
	private Integer balance;

	/**
	 * 几次付款时间以及金额，以json的形式存储
	 */
	private String paymentdate;

	/**
	 * 资质出具时间
	 */
	private Date qualificationsdate;

	/**
	 * 报告出具时间
	 */
	private Date reportdate;

	/**
	 * 项目联系人
	 */
	private String contacts;

	/**
	 * 联系方式
	 */
	private String contactsphone;

	/**
	 * 接洽日期
	 */
	private Date jieqiadate;

	/**
	 * 合同日期
	 */
	private Date hetongdate;

	/**
	 * 表或书
	 */
	private String type;

	/**
	 * 项目负责人
	 */
    private SsoUser ssoUser; 

	private Integer fkUserId;

	/**
	 * 接任务时间
	 */
	private Date receivedate;

	/**
	 * 收集资料看现场时间
	 */
	private Date collectingdata;

	/**
	 * 监测时间
	 */
	private Date monitordate;

	/**
	 * 工程分析完成时间
	 */
	private Date analysisdate;

	/**
	 * 公参完成时间
	 */
	private Date gongcandate;

	/**
	 * 内审时间
	 */
	private Date neishendate;

	/**
	 * 专家会时间
	 */
	private Date expertdate;

	/**
	 * 评估意见出具时间
	 */
	private Date assessdate;

	/**
	 * 预定批复时间
	 */
	private Date scheduleddate;

	/**
	 * 实际批复时间
	 */
	private Date actualdate;

	/**
	 * 拿到批复报告存档时间
	 */
	private Date getreplydate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public Date getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public Double getContractamount() {
		return contractamount;
	}

	public void setContractamount(Double contractamount) {
		this.contractamount = contractamount;
	}

	public Double getReceipted() {
		return receipted;
	}

	public void setReceipted(Double receipted) {
		this.receipted = receipted;
	}

	public String getContaintax() {
		return containtax;
	}

	public void setContaintax(String containtax) {
		this.containtax = containtax;
	}

	public Integer getPreliminary() {
		return preliminary;
	}

	public void setPreliminary(Integer preliminary) {
		this.preliminary = preliminary;
	}

	public Integer getTianed() {
		return tianed;
	}

	public void setTianed(Integer tianed) {
		this.tianed = tianed;
	}

	public Integer getPaied() {
		return paied;
	}

	public void setPaied(Integer paied) {
		this.paied = paied;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getPaymentdate() {
		return paymentdate;
	}

	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}

	public Date getQualificationsdate() {
		return qualificationsdate;
	}

	public void setQualificationsdate(Date qualificationsdate) {
		this.qualificationsdate = qualificationsdate;
	}

	public Date getReportdate() {
		return reportdate;
	}

	public void setReportdate(Date reportdate) {
		this.reportdate = reportdate;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getContactsphone() {
		return contactsphone;
	}

	public void setContactsphone(String contactsphone) {
		this.contactsphone = contactsphone;
	}

	public Date getJieqiadate() {
		return jieqiadate;
	}

	public void setJieqiadate(Date jieqiadate) {
		this.jieqiadate = jieqiadate;
	}

	public Date getHetongdate() {
		return hetongdate;
	}

	public void setHetongdate(Date hetongdate) {
		this.hetongdate = hetongdate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getFkUserId() {
		return fkUserId;
	}

	public void setFkUserId(Integer fkUserId) {
		this.fkUserId = fkUserId;
	}

	public Date getReceivedate() {
		return receivedate;
	}

	public void setReceivedate(Date receivedate) {
		this.receivedate = receivedate;
	}

	public Date getcollectingdata() {
		return collectingdata;
	}

	public void setcollectingdata(Date collectingdata) {
		this.collectingdata = collectingdata;
	}

	public Date getMonitordate() {
		return monitordate;
	}

	public void setMonitordate(Date monitordate) {
		this.monitordate = monitordate;
	}

	public Date getAnalysisdate() {
		return analysisdate;
	}

	public void setAnalysisdate(Date analysisdate) {
		this.analysisdate = analysisdate;
	}

	public Date getGongcandate() {
		return gongcandate;
	}

	public void setGongcandate(Date gongcandate) {
		this.gongcandate = gongcandate;
	}

	public Date getNeishendate() {
		return neishendate;
	}

	public void setNeishendate(Date neishendate) {
		this.neishendate = neishendate;
	}

	public Date getExpertdate() {
		return expertdate;
	}

	public void setExpertdate(Date expertdate) {
		this.expertdate = expertdate;
	}

	public Date getAssessdate() {
		return assessdate;
	}

	public void setAssessdate(Date assessdate) {
		this.assessdate = assessdate;
	}

	public Date getScheduleddate() {
		return scheduleddate;
	}

	public void setScheduleddate(Date scheduleddate) {
		this.scheduleddate = scheduleddate;
	}

	public Date getActualdate() {
		return actualdate;
	}

	public void setActualdate(Date actualdate) {
		this.actualdate = actualdate;
	}

	public Date getGetreplydate() {
		return getreplydate;
	}

	public void setGetreplydate(Date getreplydate) {
		this.getreplydate = getreplydate;
	}

	public SsoUser getSsoUser() {
		return ssoUser;
	}

	public void setSsoUser(SsoUser ssoUser) {
		this.ssoUser = ssoUser;
	}
}