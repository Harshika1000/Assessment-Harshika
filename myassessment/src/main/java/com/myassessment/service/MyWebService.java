package com.myassessment.service;
import java.util.List;

import com.myassessment.dao.MyWebDAO;
import com.myassessment.dao.MyWebDAOInterface;
import com.myassessment.entity.MyWebEntity;

public class MyWebService implements MyWebServiceInterface {

	@Override
	public int createProfileService(MyWebEntity w) {
		MyWebDAOInterface md=new MyWebDAO();
		
		return md.createProfileDAO(w);
	}

	@Override
	public boolean loginProfile(MyWebEntity m) {
		MyWebDAOInterface md=new MyWebDAO();
		return md.loginProfileDAO(m);
	}

	@Override
	public MyWebEntity viewprofile(MyWebEntity m) {
		MyWebDAOInterface md=new MyWebDAO();
		return md.viewprofileDAO(m);
	}
	@Override
	public List<MyWebEntity> viewallprofile(MyWebEntity m) {
		MyWebDAOInterface md=new MyWebDAO();
		return md.viewallprofileDAO(m);
		
	}

	@Override
	public int deleteprofile(MyWebEntity m) {
		MyWebDAOInterface md=new MyWebDAO();
		return md.deleteProfileDAO(m);
	}

}
