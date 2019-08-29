package poly.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringUtil {

	/**
	 * Object를 json 문자열로 변경한다.
	 * @return
	 */
	public static String ObjectToJsonString(Object object){
		String returnValue = "";
		
		if (object != null){
			ObjectMapper mapper = new ObjectMapper();
			try {
				returnValue = mapper.writeValueAsString(object);
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				mapper = null;
			}
		}

		return returnValue;
	}

	/**
	 * JsonString 을 HashMap으로 변경한다.
	 * @param json
	 * @return
	 */
	public static HashMap<String, Object> JsonStringToObject(String json){
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
			map = mapper.readValue(json, new TypeReference<Map<String, Object>> () {});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	public static String iconv(String in_charset, String out_charset, String str){
		try {
			return new String(str.getBytes(in_charset), out_charset);
		} catch (Exception e) {
			return "";
		}
	}

	public static String join(String[] array, String sep){
		String retStr = "";
		for (String string : array) {
			retStr += "," + string;
		}
		if (retStr.length() > 1){
			int len = sep.length();
			retStr = retStr.substring(len);
		}
		return retStr;
	}

}
