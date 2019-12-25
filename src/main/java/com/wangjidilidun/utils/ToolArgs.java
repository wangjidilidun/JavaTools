package com.wangjidilidun.utils;

import org.apache.log4j.Logger;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import com.wangjidilidun.myTools.App;

public class ToolArgs {
	private static Logger logger1 = Logger.getLogger(App.class);
	// 工具类型 (oracleTransfer, CHSC2Featurelyr)
	// 1. oracleTransfer: 从两个数据库中抽取数据;
	// 2. CHSC2Featurelyr:从测绘院的数据库转移数据
	@Option(name = "-strToolType", usage = "工具类型 (oracleTransfer, CHSC2Featurelyr)从两个数据库中抽取数据，从测绘院的数据库转移数据")
	private String strToolType;
	
	
	// oracleTransfer 工具中的参数*********************start***********************
	@Option(name = "-strQueryFeatureUrl", usage = "featurelayer的查询链接")
	private String strQueryFeatureUrl;

	@Option(name = "-strAddFeatureURL", usage = "featurelayer的添加链接")
	private String strAddFeatureURL;
	
	@Option(name = "-strDeleteFeatureURL", usage = "featurelayer的添加链接")
	private String strDeleteFeatureURL;

	@Option(name = "-deleteAllFeature", usage = "删除featurelayer的全部信息")
	private boolean bDeleteAllFeature = false;
	
	@Option(name = "-transferData", usage = "从两个数据库中抽取数据")
	private boolean bTransferData = false;
	
	@Option(name = "-transferOnePrjID", usage = "转移一个特定的项目信息")
	private String strTransferOnePrjID;
	
	public String getStrTransferOnePrjID() {
		return strTransferOnePrjID;
	}

	public void setStrTransferOnePrjID(String strTransferOnePrjID) {
		this.strTransferOnePrjID = strTransferOnePrjID;
	}

	@Option(name = "-oracleURL", usage = "从两个数据库中抽取数据")
	private String strOracleURL;
	
	@Option(name = "-oracleUserName", usage = "从两个数据库中抽取数据")
	private String strOracleUserName;
	
	@Option(name = "-oraclePassword", usage = "从两个数据库中抽取数据")
	private String strOraclePassword;
	
	@Option(name = "-bSyncData", usage = "从测绘院的数据库同步我们的featurelayer")
	private boolean bSyncData;
	
	@Option(name = "-bShowDataStatus", usage = "显示目前数据库的状态")
	private boolean bShowDataStatus;
	// oracleTransfer 工具中的参数*********************end***********************
	
	public boolean isbShowDataStatus() {
		return bShowDataStatus;
	}

	public void setbShowDataStatus(boolean bShowDataStatus) {
		this.bShowDataStatus = bShowDataStatus;
	}

	@Option(name = "-strSrcFilePath", usage = "测试向共享库拷贝文件")
	private String strSrcFilePath;
	@Option(name = "-strDstFilePath", usage = "测试向共享库拷贝文件")
	private String strDstFilePath;
	
	
	public String getStrSrcFilePath() {
		return strSrcFilePath;
	}

	public void setStrSrcFilePath(String strSrcFilePath) {
		this.strSrcFilePath = strSrcFilePath;
	}

	public String getStrDstFilePath() {
		return strDstFilePath;
	}

	public void setStrDstFilePath(String strDstFilePath) {
		this.strDstFilePath = strDstFilePath;
	}

	public void parseArgs(String[] args) {
		CmdLineParser parser = new CmdLineParser(this);
		try {
			parser.parseArgument(args);

		} catch (CmdLineException e) {
			System.err.println(e.getMessage());
		}
		logger1.info("参数： \t" + this.toString());
		System.out.println("参数： \t" + this.toString());
	}
	
	public String getStrToolType() {
		return strToolType;
	}

	public void setStrToolType(String strToolType) {
		this.strToolType = strToolType;
	}

	public String getStrOracleURL() {
		return strOracleURL;
	}

	public void setStrOracleURL(String strOracleURL) {
		this.strOracleURL = strOracleURL;
	}

	public String getStrOracleUserName() {
		return strOracleUserName;
	}

	public void setStrOracleUserName(String strOracleUserName) {
		this.strOracleUserName = strOracleUserName;
	}

	public String getStrOraclePassword() {
		return strOraclePassword;
	}

	public void setStrOraclePassword(String strOraclePassword) {
		this.strOraclePassword = strOraclePassword;
	}

	public String getStrQueryFeatureUrl() {
		return strQueryFeatureUrl;
	}

	public void setStrQueryFeatureUrl(String strQueryFeatureUrl) {
		this.strQueryFeatureUrl = strQueryFeatureUrl;
	}

	public String getStrAddFeatureURL() {
		return strAddFeatureURL;
	}

	public void setStrAddFeatureURL(String strAddFeatureURL) {
		this.strAddFeatureURL = strAddFeatureURL;
	}

	public boolean isbDeleteAllFeature() {
		return bDeleteAllFeature;
	}

	public void setbDeleteAllFeature(boolean bDeleteAllFeature) {
		this.bDeleteAllFeature = bDeleteAllFeature;
	}

	public boolean isbTransferData() {
		return bTransferData;
	}

	public void setbTransferData(boolean bTransferData) {
		this.bTransferData = bTransferData;
	}
	
	public String getStrDeleteFeatureURL() {
		return strDeleteFeatureURL;
	}

	public void setStrDeleteFeatureURL(String strDeleteFeatureURL) {
		this.strDeleteFeatureURL = strDeleteFeatureURL;
	}
	
	public boolean isbSyncData() {
		return bSyncData;
	}

	public void setbSyncData(boolean bSyncData) {
		this.bSyncData = bSyncData;
	}

	@Override
	public String toString() {
		return "ToolArgs [strToolType=" + strToolType + ", strQueryFeatureUrl=" + strQueryFeatureUrl
				+ ", strAddFeatureURL=" + strAddFeatureURL + ", strDeleteFeatureURL=" + strDeleteFeatureURL
				+ ", bDeleteAllFeature=" + bDeleteAllFeature + ", bTransferData=" + bTransferData + ", strOracleURL="
				+ strOracleURL + ", strOracleUserName=" + strOracleUserName + ", strOraclePassword=" + strOraclePassword
				+ "]";
	}
	
	
}
