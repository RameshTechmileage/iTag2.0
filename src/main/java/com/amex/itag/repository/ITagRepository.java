package com.amex.itag.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amex.itag.model.PageInfo;
//@Repository("ITagRepository")
//public interface ITagRepository extends CrudRepository<PageInfo, String>{
public interface ITagRepository extends MongoRepository<PageInfo, String>{

}
