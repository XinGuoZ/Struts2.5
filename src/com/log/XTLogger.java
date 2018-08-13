package com.log;


import org.apache.log4j.Logger;

import com.alibaba.druid.pool.DruidDataSourceStatLogger;
import com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter;
import com.alibaba.druid.pool.DruidDataSourceStatValue;

public class XTLogger extends DruidDataSourceStatLoggerAdapter implements DruidDataSourceStatLogger{

	private static Logger logger = Logger.getLogger(XTLogger.class);

	private static long connTotalCount = 0;
	@Override
	public void log(DruidDataSourceStatValue stat) {
		connTotalCount = connTotalCount + stat.getConnectCount();
		String msg = "共创建连接数：" + connTotalCount + "，当前连接池[活动数：" + stat.getActiveCount() + "，空闲数：" + stat.getPoolingCount() + "]";
		//logger.info(msg);
	}

	

	
}
