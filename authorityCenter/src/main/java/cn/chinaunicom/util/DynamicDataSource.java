package cn.chinaunicom.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 数据源配置类
 * @date 2019年12月26日 11:44
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSourceType();
    }
}