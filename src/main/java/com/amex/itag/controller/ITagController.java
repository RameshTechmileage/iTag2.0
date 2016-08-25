package com.amex.itag.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amex.itag.model.PageInfo;
import com.amex.itag.repository.ITagRepository;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

@RestController
@EnableMongoRepositories(basePackages={"com.amex.itag.repository"})
public class ITagController {

	@Autowired
	ITagRepository iTagRepository;

	@RequestMapping(value = "/pageInfo", method = RequestMethod.GET)
	public List<PageInfo> getPageInfo() {
		//Iterable<PageInfo> list = iTagRepository.findAll();
		return (List<PageInfo>) iTagRepository.findAll();
	}
	
	@RequestMapping(value = "/dashboardInfo", method = RequestMethod.GET)
	public Iterable<PageInfo> getDashboardInfo() {
		return iTagRepository.findAll();
	}
	
	@RequestMapping(value = "/saveITagData", method = RequestMethod.POST)
	public @ResponseBody void saveITagData(@RequestBody String totalJson) {
		// PageInfo response = iTagRepository.save(totalJson);
	/*	String test = "bbc";//iTagRepository.save(totalJson);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotalJson(totalJson);
		iTagRepository.save(pageInfo);*/
		DBObject dbObject = (DBObject)JSON.parse(totalJson);
			     //mongoTemplate.insert(doc, "foo");

		//iTagRepository.save(pageInfo.getTotalJson());
		iTagRepository.findAll();//insert(dbObject);
		//return test;
	}
	/*
	  @RequestMapping(value = "/user/save", method = RequestMethod.POST)  
	    public View createUser(@ModelAttribute User user, ModelMap model) {
	        if(StringUtils.hasText(user.getId())) {
	        	userDao.updateUser(user);
	        } else {
	        	userDao.addUser(user);
	        }
	        return new RedirectView("/spring-mongodb/user");  
	    }*/
}
