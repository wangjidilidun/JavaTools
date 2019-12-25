package com.wangjidilidun.myTools;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;

import com.wangjidilidun.jsonToolBox.JsonFileIO;
import com.wangjidilidun.utils.ToolArgs;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger log = Logger.getLogger(App.class.getClass());
    public static void main( String[] args )
    {
    	ToolArgs argsParser = new ToolArgs();
    	argsParser.parseArgs(args);
    	if("opencvToolBox".equals(argsParser.getStrToolType())) {
    		String strFilePath = "d:\\work\\GuiHuaYuan\\workspace\\DataBaseTool\\jsonFolder\\huge.json";
    		JsonFileIO jsio = new JsonFileIO();
    		try {
    			log.debug("debug");
				System.out.println(jsio.readJSONArrayFromFile(strFilePath));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
    	}
        System.out.println( "Hello World!" );
    }
}
