package com.zc.study.abstractFactory;

import com.zc.study.Sender;
/**
 * @Author zhouchao
 * @Description
 * @Param 
 * @return 
 * @Version  v1.0     
 **/
public interface Provider {
	public Sender produce();
}