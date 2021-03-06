package com.chinesedreamer.dubbocenter.web.message;

import org.apache.commons.lang.StringUtils;

public class ResponseVo {
	private Boolean success = Boolean.TRUE;
	private String errorCode;
	private String errorMsg;
	private Object data;
	
	public Boolean getSuccess() {
		return success;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public static ResponseVo getSuccessResponse() {
		return new ResponseVo();
	}
	
	public static ResponseVo getSuccessResponse(Object data) {
		ResponseVo vo = new ResponseVo();
		vo.setData(data);
		return vo;
	}
	
	public static ResponseVo getFailureResponse(String errorCode, String errorMsg, Object data) {
		ResponseVo vo = new ResponseVo();
		vo.setSuccess(Boolean.FALSE);
		if (StringUtils.isNotEmpty(errorCode)) {
			vo.setErrorCode(errorCode);
		}
		if (StringUtils.isNotEmpty(errorMsg)) {
			vo.setErrorMsg(errorMsg);
		}
		if (null != data) {
			vo.setData(data);
		}
		return vo;
	}
}
