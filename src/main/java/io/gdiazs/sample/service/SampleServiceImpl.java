package io.gdiazs.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.gdiazs.sample.exception.SampleException;
import io.gdiazs.sample.model.Sample;
import io.gdiazs.sample.repository.SampleDAO;

@Service
public class SampleServiceImpl implements SampleService{

	
	private SampleDAO sampleDAO;

	
	@Autowired
	public void setSampleDAO(SampleDAO sampleDAO) {
		this.sampleDAO = sampleDAO;
	}

	@Override
	public List<Sample> findWithSomeBussinesRule() throws SampleException {
		return (List<Sample>) this.sampleDAO.findAll();
	}

}
