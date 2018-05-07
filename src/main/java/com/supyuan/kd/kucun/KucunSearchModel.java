package com.supyuan.kd.kucun;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.commons.lang3.StringUtils;

import com.supyuan.jfinal.base.BindModel;

public class KucunSearchModel extends BindModel{
	
	private int loadnetworkId;
	
	private String startTime;
	
	private String endTime;
	
	private int networkId;
	
	private int sendName;
	
	private int receiveName;
	
	private String startCode;
	
	private String endCode;
	
	private String shipSn;

	
	public int getLoadnetworkId() {
		return loadnetworkId;
	}

	public void setLoadnetworkId(int loadnetworkId) {
		this.loadnetworkId = loadnetworkId;
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

	public int getNetworkId() {
		return networkId;
	}

	public void setNetworkId(int networkId) {
		this.networkId = networkId;
	}

	public String getStartCode() {
		return startCode;
	}

	public void setStartCode(String startCode) {
		this.startCode = startCode;
	}

	public String getEndCode() {
		return endCode;
	}

	public void setEndCode(String endCode) {
		this.endCode = endCode;
	}

	public String getShipSn() {
		try {
			return StringUtils.isNotBlank(shipSn)? URLDecoder.decode(shipSn , "UTF-8").trim():null;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setShipSn(String shipSn) {
		this.shipSn = shipSn;
	}

	public int getSendName() {
		return sendName;
	}

	public void setSendName(int sendName) {
		this.sendName = sendName;
	}

	public int getReceiveName() {
		return receiveName;
	}

	public void setReceiveName(int receiveName) {
		this.receiveName = receiveName;
	}

}
