package com.myassessment.dao;

import java.util.List;

import com.myassessment.entity.MyWebEntity;

public interface MyWebDAOInterface {

	int createProfileDAO(MyWebEntity w);

	boolean loginProfileDAO(MyWebEntity m);

	MyWebEntity viewprofileDAO(MyWebEntity m);

	List<MyWebEntity> viewallprofileDAO(MyWebEntity m);
	int deleteProfileDAO(MyWebEntity m);

}
