package com.wangjidilidun.gdalFileToolBox;

import org.gdal.gdal.Band;
import org.gdal.gdal.Dataset;
import org.gdal.gdal.Driver;
import org.gdal.gdal.gdal;
import org.gdal.gdalconst.gdalconstConstants;

public class CreateShapeFile {
	public static void test() {
        gdal.AllRegister();

        String fileName = "D:\\School_Materials\\毕业论文\\BIGPaper\\work\\img\\BM_rlt\\0.tif";
        // 读取影像数据
        Dataset dataset = gdal.Open(fileName, gdalconstConstants.GA_ReadOnly);
        if (dataset == null) {
            System.err.println("GDALOpen failed - " + gdal.GetLastErrorNo());
            System.err.println(gdal.GetLastErrorMsg());

            System.exit(1);
        }

        Driver driver = dataset.GetDriver();
        System.out.println("Driver: " + driver.getShortName() + "/" + driver.getLongName());

        // 读取影像信息
        int xSize = dataset.getRasterXSize();
        int ySzie = dataset.getRasterYSize();
        int nBandCount = dataset.getRasterCount();
        System.out.println("Size is " + xSize + ", " + ySzie + ", " + nBandCount);

        Band band = dataset.GetRasterBand(1);
        int type = band.GetRasterDataType();
        // type为1，代表的是Eight bit unsigned integer
        System.out.println(type);

        dataset.delete();
        gdal.GDALDestroyDriverManager();

    }
}
