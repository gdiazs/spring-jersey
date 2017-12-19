package io.gdiazs.sample.service;

import java.util.List;

import io.gdiazs.sample.exception.SampleException;
import io.gdiazs.sample.model.Sample;

public interface SampleService {

	List<Sample> findWithSomeBussinesRule() throws SampleException;
	
}
