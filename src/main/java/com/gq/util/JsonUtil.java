package com.gq.util;

import net.sf.json.JSONArray;

public class JsonUtil {
	  public  static JSONArray   ListToJSON(Object object){
	        JSONArray jsonArray = JSONArray.fromObject( object );  
	        return jsonArray;
	    }
	    
}
