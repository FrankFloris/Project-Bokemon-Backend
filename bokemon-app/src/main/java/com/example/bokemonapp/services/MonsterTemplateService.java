package com.example.bokemonapp.services;

import com.example.bokemonapp.model.MonsterTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterTemplateService extends CrudRepository<MonsterTemplate, Integer> {

}
