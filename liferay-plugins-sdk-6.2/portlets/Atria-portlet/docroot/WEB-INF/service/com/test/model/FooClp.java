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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.test.service.ClpSerializer;
import com.test.service.FooLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author nxant
 */
public class FooClp extends BaseModelImpl<Foo> implements Foo {
	public FooClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Foo.class;
	}

	@Override
	public String getModelClassName() {
		return Foo.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _personId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPersonId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _personId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("personId", getPersonId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("nickName", getNickName());
		attributes.put("birthday", getBirthday());
		attributes.put("age", getAge());
		attributes.put("friend", getFriend());
		attributes.put("relative", getRelative());
		attributes.put("image", getImage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long personId = (Long)attributes.get("personId");

		if (personId != null) {
			setPersonId(personId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String nickName = (String)attributes.get("nickName");

		if (nickName != null) {
			setNickName(nickName);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		Integer age = (Integer)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		Boolean friend = (Boolean)attributes.get("friend");

		if (friend != null) {
			setFriend(friend);
		}

		Boolean relative = (Boolean)attributes.get("relative");

		if (relative != null) {
			setRelative(relative);
		}

		Blob image = (Blob)attributes.get("image");

		if (image != null) {
			setImage(image);
		}
	}

	@Override
	public long getPersonId() {
		return _personId;
	}

	@Override
	public void setPersonId(long personId) {
		_personId = personId;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setPersonId", long.class);

				method.invoke(_fooRemoteModel, personId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_fooRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_fooRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_fooRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_fooRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_fooRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFirstName() {
		return _firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		_firstName = firstName;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstName", String.class);

				method.invoke(_fooRemoteModel, firstName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastName() {
		return _lastName;
	}

	@Override
	public void setLastName(String lastName) {
		_lastName = lastName;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setLastName", String.class);

				method.invoke(_fooRemoteModel, lastName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNickName() {
		return _nickName;
	}

	@Override
	public void setNickName(String nickName) {
		_nickName = nickName;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setNickName", String.class);

				method.invoke(_fooRemoteModel, nickName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBirthday() {
		return _birthday;
	}

	@Override
	public void setBirthday(Date birthday) {
		_birthday = birthday;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthday", Date.class);

				method.invoke(_fooRemoteModel, birthday);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAge() {
		return _age;
	}

	@Override
	public void setAge(int age) {
		_age = age;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setAge", int.class);

				method.invoke(_fooRemoteModel, age);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getFriend() {
		return _friend;
	}

	@Override
	public boolean isFriend() {
		return _friend;
	}

	@Override
	public void setFriend(boolean friend) {
		_friend = friend;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setFriend", boolean.class);

				method.invoke(_fooRemoteModel, friend);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getRelative() {
		return _relative;
	}

	@Override
	public boolean isRelative() {
		return _relative;
	}

	@Override
	public void setRelative(boolean relative) {
		_relative = relative;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setRelative", boolean.class);

				method.invoke(_fooRemoteModel, relative);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getImage() {
		return _image;
	}

	@Override
	public void setImage(Blob image) {
		_image = image;

		if (_fooRemoteModel != null) {
			try {
				Class<?> clazz = _fooRemoteModel.getClass();

				Method method = clazz.getMethod("setImage", Blob.class);

				method.invoke(_fooRemoteModel, image);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFooRemoteModel() {
		return _fooRemoteModel;
	}

	public void setFooRemoteModel(BaseModel<?> fooRemoteModel) {
		_fooRemoteModel = fooRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _fooRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_fooRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FooLocalServiceUtil.addFoo(this);
		}
		else {
			FooLocalServiceUtil.updateFoo(this);
		}
	}

	@Override
	public Foo toEscapedModel() {
		return (Foo)ProxyUtil.newProxyInstance(Foo.class.getClassLoader(),
			new Class[] { Foo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FooClp clone = new FooClp();

		clone.setPersonId(getPersonId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setFirstName(getFirstName());
		clone.setLastName(getLastName());
		clone.setNickName(getNickName());
		clone.setBirthday(getBirthday());
		clone.setAge(getAge());
		clone.setFriend(getFriend());
		clone.setRelative(getRelative());
		clone.setImage(getImage());

		return clone;
	}

	@Override
	public int compareTo(Foo foo) {
		int value = 0;

		if (getPersonId() < foo.getPersonId()) {
			value = -1;
		}
		else if (getPersonId() > foo.getPersonId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FooClp)) {
			return false;
		}

		FooClp foo = (FooClp)obj;

		long primaryKey = foo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{personId=");
		sb.append(getPersonId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", nickName=");
		sb.append(getNickName());
		sb.append(", birthday=");
		sb.append(getBirthday());
		sb.append(", age=");
		sb.append(getAge());
		sb.append(", friend=");
		sb.append(getFriend());
		sb.append(", relative=");
		sb.append(getRelative());
		sb.append(", image=");
		sb.append(getImage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.test.model.Foo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>personId</column-name><column-value><![CDATA[");
		sb.append(getPersonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nickName</column-name><column-value><![CDATA[");
		sb.append(getNickName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthday</column-name><column-value><![CDATA[");
		sb.append(getBirthday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>age</column-name><column-value><![CDATA[");
		sb.append(getAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>friend</column-name><column-value><![CDATA[");
		sb.append(getFriend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relative</column-name><column-value><![CDATA[");
		sb.append(getRelative());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _personId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _fooRemoteModel;
	private Class<?> _clpSerializerClass = com.test.service.ClpSerializer.class;
}