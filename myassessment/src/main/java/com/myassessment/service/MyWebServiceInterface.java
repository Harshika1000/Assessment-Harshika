package com.myassessment.service;

import java.util.List;

import com.myassessment.entity.MyWebEntity;

public interface MyWebServiceInterface {

	int createProfileService(MyWebEntity w);

	boolean loginProfile(MyWebEntity m);

	MyWebEntity viewprofile(MyWebEntity m);

	List<MyWebEntity> viewallprofile(MyWebEntity m);

	int deleteprofile(MyWebEntity m);

}
