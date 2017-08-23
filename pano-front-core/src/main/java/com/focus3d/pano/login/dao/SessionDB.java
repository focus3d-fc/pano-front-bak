package com.focus3d.pano.login.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.focus3d.pano.model.PanoMemLoginModel;

/**
 * 
 * *
 * @author lihaijun
 *
 */
public class SessionDB {
	//本地会话
	private static Map<String, PanoMemLoginModel> sessionMap = new ConcurrentHashMap<String, PanoMemLoginModel>();
	
	public static void addSession(String sessionId, PanoMemLoginModel loginInfo){
		if(!sessionMap.containsKey(sessionId)){
			sessionMap.put(sessionId, loginInfo);
		}
	}
	
	public static PanoMemLoginModel get(String sessionId){
		PanoMemLoginModel panoLoginModel = sessionMap.get(sessionId);
		return panoLoginModel;
	}
	
	public static void remove(String sessionId){
		if(sessionMap.containsKey(sessionId)){
			sessionMap.remove(sessionId);
		}
	}
}
