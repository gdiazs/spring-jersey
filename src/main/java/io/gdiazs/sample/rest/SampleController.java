package io.gdiazs.sample.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.gdiazs.sample.exception.SampleException;
import io.gdiazs.sample.model.Sample;
import io.gdiazs.sample.service.SampleService;

@Component
@Path("/samples")
public class SampleController {

	private SampleService sampleService;

	@Autowired
	public void setSampleService(SampleService sampleService) {
		this.sampleService = sampleService;
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Sample> get() {

		List<Sample> samples = null;
		
		try {
			samples = this.sampleService.findWithSomeBussinesRule();
		} catch (SampleException e) {
			
			e.printStackTrace();
		}
		

		return samples;
	}

}
