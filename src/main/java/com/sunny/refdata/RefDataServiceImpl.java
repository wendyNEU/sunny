package com.sunny.refdata;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("refDataService")
public class RefDataServiceImpl implements RefDataService {
	@Autowired
	RefDataRepository refDataRepository; 
	
	@Override
	public RefData getRefDataById(long id) {
		// TODO Auto-generated method stub
		return refDataRepository.getOne(id);
	}

	@Override
	public List<RefData> getAllRefDatas() {
		// TODO Auto-generated method stub
		return refDataRepository.findAll();
	}

}
