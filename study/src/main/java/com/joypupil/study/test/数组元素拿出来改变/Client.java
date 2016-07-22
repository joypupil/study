package com.joypupil.study.test.数组元素拿出来改变;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<BaseResponse> responses = new ArrayList<BaseResponse>();
		responses.add(get());
//		BaseResponse response = responses.get(0);
		for(BaseResponse response : responses){
			response.setErrCode("TTTTT");
		}
//		response.setErrCode("TTTTTT");
		System.out.println(responses.get(0).getErrCode());
	}
	
	
	public static BaseResponse get(){
		BaseResponse response = new BaseResponse();
		response.setErrCode("test");
		response.setErrMsg("err");
		return response;
	}

}

class BaseResponse{
	private String ErrCode;
	
	private String ErrMsg;

	public String getErrCode() {
		return ErrCode;
	}

	public void setErrCode(String errCode) {
		ErrCode = errCode;
	}

	public String getErrMsg() {
		return ErrMsg;
	}

	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}
	
}