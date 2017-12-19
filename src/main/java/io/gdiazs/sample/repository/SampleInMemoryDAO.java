package io.gdiazs.sample.repository;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import io.gdiazs.sample.common.DataAccessException;
import io.gdiazs.sample.model.Sample;

@Repository
public class SampleInMemoryDAO implements SampleDAO {

	private List<Sample> samples;

	public SampleInMemoryDAO(List<Sample> samples) {
		super();
		this.samples = samples;
	}

	public SampleInMemoryDAO() {
		this.samples = Arrays.asList(new Sample(1, "Sample 1", new Date()), new Sample(2, "Sample 2", new Date()),
				new Sample(3, "Sample 3", new Date()));
	}

	@Override
	public void save(Sample entity) throws DataAccessException {
		this.samples.add(entity);
	}

	@Override
	public void update(Sample entity) throws DataAccessException {
		for (int i = 0; i < this.samples.size(); i++) {
			if (entity.getId().equals(this.samples.get(i).getId())) {
				this.samples.set(i, entity);
			}
		}
	}

	@Override
	public Collection<Sample> findAll() throws DataAccessException {
		return this.samples;
	}

	@Override
	public Sample findOne(Integer id) throws DataAccessException {
		return this.samples.stream().filter((sample) -> {
			return sample.getId().equals(id);
		}).findFirst().get();
	}

}
