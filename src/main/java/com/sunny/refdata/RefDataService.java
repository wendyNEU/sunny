package com.sunny.refdata;

import java.util.List;

public interface RefDataService {
	RefData getRefDataById(long id);
	List<RefData> getAllRefDatas();
}
