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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Foo}.
 * </p>
 *
 * @author nxant
 * @see Foo
 * @generated
 */
public class FooWrapper implements Foo, ModelWrapper<Foo> {
	public FooWrapper(Foo foo) {
		_foo = foo;
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

	/**
	* Returns the primary key of this foo.
	*
	* @return the primary key of this foo
	*/
	@Override
	public long getPrimaryKey() {
		return _foo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this foo.
	*
	* @param primaryKey the primary key of this foo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_foo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the person ID of this foo.
	*
	* @return the person ID of this foo
	*/
	@Override
	public long getPersonId() {
		return _foo.getPersonId();
	}

	/**
	* Sets the person ID of this foo.
	*
	* @param personId the person ID of this foo
	*/
	@Override
	public void setPersonId(long personId) {
		_foo.setPersonId(personId);
	}

	/**
	* Returns the company ID of this foo.
	*
	* @return the company ID of this foo
	*/
	@Override
	public long getCompanyId() {
		return _foo.getCompanyId();
	}

	/**
	* Sets the company ID of this foo.
	*
	* @param companyId the company ID of this foo
	*/
	@Override
	public void setCompanyId(long companyId) {
		_foo.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this foo.
	*
	* @return the user ID of this foo
	*/
	@Override
	public long getUserId() {
		return _foo.getUserId();
	}

	/**
	* Sets the user ID of this foo.
	*
	* @param userId the user ID of this foo
	*/
	@Override
	public void setUserId(long userId) {
		_foo.setUserId(userId);
	}

	/**
	* Returns the user uuid of this foo.
	*
	* @return the user uuid of this foo
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _foo.getUserUuid();
	}

	/**
	* Sets the user uuid of this foo.
	*
	* @param userUuid the user uuid of this foo
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_foo.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this foo.
	*
	* @return the user name of this foo
	*/
	@Override
	public java.lang.String getUserName() {
		return _foo.getUserName();
	}

	/**
	* Sets the user name of this foo.
	*
	* @param userName the user name of this foo
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_foo.setUserName(userName);
	}

	/**
	* Returns the create date of this foo.
	*
	* @return the create date of this foo
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _foo.getCreateDate();
	}

	/**
	* Sets the create date of this foo.
	*
	* @param createDate the create date of this foo
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_foo.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this foo.
	*
	* @return the modified date of this foo
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _foo.getModifiedDate();
	}

	/**
	* Sets the modified date of this foo.
	*
	* @param modifiedDate the modified date of this foo
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_foo.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the first name of this foo.
	*
	* @return the first name of this foo
	*/
	@Override
	public java.lang.String getFirstName() {
		return _foo.getFirstName();
	}

	/**
	* Sets the first name of this foo.
	*
	* @param firstName the first name of this foo
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_foo.setFirstName(firstName);
	}

	/**
	* Returns the last name of this foo.
	*
	* @return the last name of this foo
	*/
	@Override
	public java.lang.String getLastName() {
		return _foo.getLastName();
	}

	/**
	* Sets the last name of this foo.
	*
	* @param lastName the last name of this foo
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_foo.setLastName(lastName);
	}

	/**
	* Returns the nick name of this foo.
	*
	* @return the nick name of this foo
	*/
	@Override
	public java.lang.String getNickName() {
		return _foo.getNickName();
	}

	/**
	* Sets the nick name of this foo.
	*
	* @param nickName the nick name of this foo
	*/
	@Override
	public void setNickName(java.lang.String nickName) {
		_foo.setNickName(nickName);
	}

	/**
	* Returns the birthday of this foo.
	*
	* @return the birthday of this foo
	*/
	@Override
	public java.util.Date getBirthday() {
		return _foo.getBirthday();
	}

	/**
	* Sets the birthday of this foo.
	*
	* @param birthday the birthday of this foo
	*/
	@Override
	public void setBirthday(java.util.Date birthday) {
		_foo.setBirthday(birthday);
	}

	/**
	* Returns the age of this foo.
	*
	* @return the age of this foo
	*/
	@Override
	public int getAge() {
		return _foo.getAge();
	}

	/**
	* Sets the age of this foo.
	*
	* @param age the age of this foo
	*/
	@Override
	public void setAge(int age) {
		_foo.setAge(age);
	}

	/**
	* Returns the friend of this foo.
	*
	* @return the friend of this foo
	*/
	@Override
	public boolean getFriend() {
		return _foo.getFriend();
	}

	/**
	* Returns <code>true</code> if this foo is friend.
	*
	* @return <code>true</code> if this foo is friend; <code>false</code> otherwise
	*/
	@Override
	public boolean isFriend() {
		return _foo.isFriend();
	}

	/**
	* Sets whether this foo is friend.
	*
	* @param friend the friend of this foo
	*/
	@Override
	public void setFriend(boolean friend) {
		_foo.setFriend(friend);
	}

	/**
	* Returns the relative of this foo.
	*
	* @return the relative of this foo
	*/
	@Override
	public boolean getRelative() {
		return _foo.getRelative();
	}

	/**
	* Returns <code>true</code> if this foo is relative.
	*
	* @return <code>true</code> if this foo is relative; <code>false</code> otherwise
	*/
	@Override
	public boolean isRelative() {
		return _foo.isRelative();
	}

	/**
	* Sets whether this foo is relative.
	*
	* @param relative the relative of this foo
	*/
	@Override
	public void setRelative(boolean relative) {
		_foo.setRelative(relative);
	}

	/**
	* Returns the image of this foo.
	*
	* @return the image of this foo
	*/
	@Override
	public java.sql.Blob getImage() {
		return _foo.getImage();
	}

	/**
	* Sets the image of this foo.
	*
	* @param image the image of this foo
	*/
	@Override
	public void setImage(java.sql.Blob image) {
		_foo.setImage(image);
	}

	@Override
	public boolean isNew() {
		return _foo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_foo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _foo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_foo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _foo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _foo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_foo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _foo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_foo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_foo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_foo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FooWrapper((Foo)_foo.clone());
	}

	@Override
	public int compareTo(com.test.model.Foo foo) {
		return _foo.compareTo(foo);
	}

	@Override
	public int hashCode() {
		return _foo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.Foo> toCacheModel() {
		return _foo.toCacheModel();
	}

	@Override
	public com.test.model.Foo toEscapedModel() {
		return new FooWrapper(_foo.toEscapedModel());
	}

	@Override
	public com.test.model.Foo toUnescapedModel() {
		return new FooWrapper(_foo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _foo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _foo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_foo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FooWrapper)) {
			return false;
		}

		FooWrapper fooWrapper = (FooWrapper)obj;

		if (Validator.equals(_foo, fooWrapper._foo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Foo getWrappedFoo() {
		return _foo;
	}

	@Override
	public Foo getWrappedModel() {
		return _foo;
	}

	@Override
	public void resetOriginalValues() {
		_foo.resetOriginalValues();
	}

	private Foo _foo;
}