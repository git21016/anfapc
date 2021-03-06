package com.supyuan.kd.finance.payable;

import com.supyuan.jfinal.base.BindModel;

public class PayRebateSearchModel extends BindModel{

	private int shipNetWorkId; //开单网点
	private String state; //状态
	private String shipSn; //运单单号
	private String startTime;//开始日期;
	private String endTime;//结束日期;
	private String senderId;//托运方
	private String receiverId;//收货方
	private String fromAddCode;//出发地
	private String toAddCode;//到达地

	public int getShipNetWorkId() {
		return shipNetWorkId;
	}

	public void setShipNetWorkId(int shipNetWorkId) {
		this.shipNetWorkId = shipNetWorkId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getShipSn() {
		return shipSn;
	}

	public void setShipSn(String shipSn) {
		this.shipSn = shipSn;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getFromAddCode() {
		return fromAddCode;
	}

	public void setFromAddCode(String fromAddCode) {
		this.fromAddCode = fromAddCode;
	}

	public String getToAddCode() {
		return toAddCode;
	}

	public void setToAddCode(String toAddCode) {
		this.toAddCode = toAddCode;
	}
}
