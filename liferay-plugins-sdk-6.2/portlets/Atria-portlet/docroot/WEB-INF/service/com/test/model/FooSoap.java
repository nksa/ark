/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.model;

import java.io.Serializable;

import java.sql.Blob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.FooServiceSoap}.
 *
 * @author nxant
 * @see com.test.service.http.FooServiceSoap
 * @generated
 */
public class FooSoap implements Serializable {
	public static FooSoap toSoapModel(Foo model) {
		FooSoap soapModel = new FooSoap();

		soapModel.setPersonId(model.getPersonId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setNickName(model.getNickName());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setAge(model.getAge());
		soapModel.setFriend(model.getFriend());
		soapModel.setRelative(model.getRelative());
		soapModel.setImage(model.getImage());

		return soapModel;
	}

	public static FooSoap[] toSoapModels(Foo[] models) {
		FooSoap[] soapModels = new FooSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FooSoap[][] toSoapModels(Foo[][] models) {
		FooSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FooSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FooSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FooSoap[] toSoapModels(List<Foo> models) {
		List<FooSoap> soapModels = new ArrayList<FooSoap>(models.size());

		for (Foo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FooSoap[soapModels.size()]);
	}

	public FooSoap() {
	}

	public long getPrimaryKey() {
		return _personId;
	}

	public void setPrimaryKey(long pk) {
		setPersonId(pk);
	}

	public long getPersonId() {
		return _personId;
	}

	public void setPersonId(long personId) {
		_personId = personId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getNickName() {
		return _nickName;
	}

	public void setNickName(String nickName) {
		_nickName = nickName;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int age) {
		_age = age;
	}

	public boolean getFriend() {
		return _friend;
	}

	public boolean isFriend() {
		return _friend;
	}

	public void setFriend(boolean friend) {
		_friend = friend;
	}

	public boolean getRelative() {
		return _relative;
	}

	public boolean isRelative() {
		return _relative;
	}

	public void setRelative(boolean relative) {
		_relative = relative;
	}

	public Blob getImage() {
		return _image;
	}

	public void setImage(Blob image) {
		_image = image;
	}

	private long _personId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _firstName;
	private String _lastName;
	private String _nickName;
	private Date _birthday;
	private int _age;
	private boolean _friend;
	private boolean _relative;
	private Blob _image;
}