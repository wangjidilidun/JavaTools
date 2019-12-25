package com.wangjidilidun.jsonToolBox;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;

public class JsonFileIO {
	public JSONArray readJSONArrayFromFile(String strFilePath) throws FileNotFoundException {
		JSONReader reader = new JSONReader(new FileReader(strFilePath));
		reader.startArray();
		JSONArray arrayJson = new JSONArray();
		while(reader.hasNext()) {
			JSONObject jsonObj = (JSONObject) reader.readObject();
			arrayJson.add(jsonObj);
		}
		reader.endArray();
		reader.close();
		return arrayJson;
	}
}
