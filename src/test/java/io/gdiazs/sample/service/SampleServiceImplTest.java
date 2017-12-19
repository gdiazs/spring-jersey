package io.gdiazs.sample.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.gdiazs.sample.exception.SampleException;
import io.gdiazs.sample.model.Sample;
import io.gdiazs.sample.repository.SampleDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {
		"/application-context-test.xml"
})
public class SampleServiceImplTest {

	@Mock
	private SampleDAO sampleDAO;
	
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testFindWithSomeBussinesRule() throws SampleException {
		SampleServiceImpl sampleService = new SampleServiceImpl();
		
		
		List<Sample> samples = Arrays.asList(new Sample(1, "Test Sample", new Date()));
		
		when(sampleDAO.findAll()).thenReturn(samples);
		
		sampleService.setSampleDAO(sampleDAO);
		
		List<Sample> samplesActual= sampleService.findWithSomeBussinesRule();
		
		verify(sampleService.findWithSomeBussinesRule(), atLeastOnce());
		
		Assert.assertTrue(samplesActual.size() == 1);
	
	}

}
