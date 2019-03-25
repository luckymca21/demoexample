package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleDao extends CrudRepository<Example, Long> {

	public List<Example> findByTitleLike(String title);

	public List<Example> findBySubmissionGreaterThan(Date date);

}
