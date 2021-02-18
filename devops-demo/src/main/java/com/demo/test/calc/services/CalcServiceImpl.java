package com.demo.test.calc.services;

import org.springframework.stereotype.Service;

import com.demo.test.calc.models.CalcRequest;
import com.demo.test.calc.services.core.AddComponent;


@Service("calcService")
public class CalcServiceImpl implements CalcService {

	@Override
	public Integer add(CalcRequest request) {
		return AddComponent.add(request);
	}

}
