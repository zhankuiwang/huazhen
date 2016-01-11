package com.hzfh.fmp.controller.permission.ajax;

import com.hzfh.api.permission.model.User;
import com.hzfh.api.permission.model.query.UserCondition;
import com.hzfh.fmp.controller.common.JqGridBaseAction;
import com.hzfh.fmp.model.common.helper.EncodeHelper;
import com.hzfh.fmp.model.common.helper.UserHelper;
import com.hzfh.fmp.model.permission.UserModel;
import com.hzframework.contract.PagedList;
import com.hzframework.contract.SortItem;
import com.hzframework.contract.SortType;
import com.hzframework.helper.StringHelper;

import java.util.ArrayList;
import java.util.List;

public class AjaxUserAction extends JqGridBaseAction<User> {
	private String name;
	private String password;
	private String passwordOld;
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswordOld() {
		return passwordOld;
	}

	public void setPasswordOld(String passwordOld) {
		this.passwordOld = passwordOld;
	}

	private String byName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getByName() {
        return byName;
    }

    public void setByName(String byName) {
        this.byName = byName;
    }

	@Override
	public String execute() throws Exception {
		UserCondition userCondition = new UserCondition();
		userCondition.setPageSize(this.getPageSize());
		userCondition.setPageIndex(this.getPageIndex());
		userCondition.setName(this.getByName());
		List<SortItem> sortItemList = new ArrayList<SortItem>();
		SortItem sortItem = new SortItem();
		sortItem.setSortFeild(this.getSidx());
		sortItem.setSortType(SortType.DESC);
		sortItemList.add(sortItem);
		userCondition.setSortItemList(sortItemList);

		PagedList<User> userPagedList = UserModel.getPagingList(userCondition);
		this.setResultList(userPagedList.getResultList());
		this.setPageCount(userPagedList.getPagingInfo().getPageCount());
		this.setPageIndex(userPagedList.getPagingInfo().getPageIndex());
		this.setRecordCount(userPagedList.getPagingInfo().getTotalCount());
		return SUCCESS;
	}

	public String edit() {
		User user = new User();
//		String name = "";
//		if(UserHelper.getEditUserNo()!=0){
//			name = UserModel.getInfo(UserHelper.getEditUserNo()).getName();
//		}
		user.setName(this.name);
		user.setPassword(EncodeHelper.encryptPWD(this.name, this.getPassword()));
		user.setEditComment(this.getEditComment());
        user.setEditUserNo(UserHelper.getEditUserNo());

        if (this.getOper().equalsIgnoreCase("add")) {
            User userByName = UserModel.getUserByUserName(this.name);
            if (userByName != null) {
                this.setErrCode("用户名已存在,请重新输入！");
                this.setErrDesc("用户名已存在,请重新输入！");
                return SUCCESS;
            }
            user.setInUserNo(UserHelper.getEditUserNo());
            if (UserModel.add(user) <= 0) {
                this.setErrCode("add failed");
                this.setErrDesc("add failed");
            }
        } else {
//            if (this.getId().isEmpty()) {
//                this.setErrCode("NoID");
//                this.setErrDesc("NoID");
//                return SUCCESS;
//            }
            if (this.getOper().equalsIgnoreCase("edit")) {
    			user.setId(Integer.parseInt(this.id));
                if (UserModel.update(user) <= 0) {
                    this.setErrCode("update failed");
                    this.setErrDesc("update failed");
        		}
            }
        }
        return SUCCESS;
    }
	public String editSelf() {
		User user = new User();
		String name = "";
		if(UserHelper.getEditUserNo()!=0){
			name = UserModel.getInfo(UserHelper.getEditUserNo()).getName();
		}
		user.setName(name);
		user.setPassword(EncodeHelper.encryptPWD(name, this.getPassword()));
		user.setEditComment(this.getEditComment());
        user.setEditUserNo(UserHelper.getEditUserNo());

        if (this.getOper().equalsIgnoreCase("add")) {
            User userByName = UserModel.getUserByUserName(this.getName());
            if (userByName != null) {
                this.setErrCode("用户名已存在,请重新输入！");
                this.setErrDesc("用户名已存在,请重新输入！");
                return SUCCESS;
            }
            user.setInUserNo(UserHelper.getEditUserNo());
            if (UserModel.add(user) <= 0) {
                this.setErrCode("add failed");
                this.setErrDesc("add failed");
            }
        } else {
//            if (this.getId().isEmpty()) {
//                this.setErrCode("NoID");
//                this.setErrDesc("NoID");
//                return SUCCESS;
//            }
            if (this.getOper().equalsIgnoreCase("edit")) {
            	if(!StringHelper.isNullOrEmpty(this.passwordOld)){
            		String old = EncodeHelper.encryptPWD(name, this.passwordOld);
        			String now = UserModel.getInfo(UserHelper.getEditUserNo()).getPassword();
            		if(old.equals(user.getPassword())){
            			this.setErrCode("update failed");
                        this.setErrDesc("新密码与旧密码不能一致");
            		}else if(!old.equals(now)){
            			this.setErrCode("update failed");
                        this.setErrDesc("旧密码输入错误");
            		}else{
            			user.setId(UserHelper.getEditUserNo());
                        if (UserModel.update(user) <= 0) {
                            this.setErrCode("update failed");
                            this.setErrDesc("update failed");
                        }
            		}
            	}
            }
        }
        return SUCCESS;
    }
}
