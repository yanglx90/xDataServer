package cn.chinaunicom.util;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 数据源配置类
 * @date 2019年12月26日 11:44
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXTHOLDER = new ThreadLocal<String>();

    public static void setDataSourceType(String dataSourceType) {
        CONTEXTHOLDER.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return CONTEXTHOLDER.get();
    }

    public static void clearDataSourceType() {
        CONTEXTHOLDER.remove();
    }

}