package com.escalandrum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.escalandrum.domain.Zona;
import com.mongodb.client.result.UpdateResult;

@Service
public class PersistDataService {
	
	@Autowired
	private MongoOperations mongoOperation;
	
	public <T> void save( T obj ) {
		mongoOperation.save(obj);
	}
	
	@Nullable
	public <T> T getByName(String key, Class<T> c) {		
		Query query = new Query(Criteria.where("nombre").is(key));
		T result = mongoOperation.findOne(query, c);
		return result;
	}  
	
	public <T> long editar(String key, Object value, Class<T> c) {
		Query query = new Query(Criteria.where("nombre").is(key));		
		UpdateResult result = mongoOperation.updateFirst(query, Update.update(key, value), c);
		return result.getModifiedCount();
	}

	public <T> List<T> getAll(Class<T> c) {
		// TODO Auto-generated method stub
		return mongoOperation.findAll(c);
	}
	
	
}
