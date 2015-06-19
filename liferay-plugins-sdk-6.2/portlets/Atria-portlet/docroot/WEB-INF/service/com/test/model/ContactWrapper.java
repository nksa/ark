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
 * This class is a wrapper for {@link Contact}.
 * </p>
 *
 * @author nxant
 * @see Contact
 * @generated
 */
public class ContactWrapper implements Contact, ModelWrapper<Contact> {
	public ContactWrapper(Contact contact) {
		_contact = contact;
	}

	@Override
	public Class<?> getModelClass() {
		return Contact.class;
	}

	@Override
	public String getModelClassName() {
		return Contact.class.getName();
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
	* Returns the primary key of this contact.
	*
	* @return the primary key of this contact
	*/
	@Override
	public long getPrimaryKey() {
		return _contact.getPrimaryKey();
	}

	/**
	* Sets the primary key of this contact.
	*
	* @param primaryKey the primary key of this contact
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_contact.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the person ID of this contact.
	*
	* @return the person ID of this contact
	*/
	@Override
	public long getPersonId() {
		return _contact.getPersonId();
	}

	/**
	* Sets the person ID of this contact.
	*
	* @param personId the person ID of this contact
	*/
	@Override
	public void setPersonId(long personId) {
		_contact.setPersonId(personId);
	}

	/**
	* Returns the company ID of this contact.
	*
	* @return the company ID of this contact
	*/
	@Override
	public long getCompanyId() {
		return _contact.getCompanyId();
	}

	/**
	* Sets the company ID of this contact.
	*
	* @param companyId the company ID of this contact
	*/
	@Override
	public void setCompanyId(long companyId) {
		_contact.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this contact.
	*
	* @return the user ID of this contact
	*/
	@Override
	public long getUserId() {
		return _contact.getUserId();
	}

	/**
	* Sets the user ID of this contact.
	*
	* @param userId the user ID of this contact
	*/
	@Override
	public void setUserId(long userId) {
		_contact.setUserId(userId);
	}

	/**
	* Returns the user uuid of this contact.
	*
	* @return the user uuid of this contact
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact.getUserUuid();
	}

	/**
	* Sets the user uuid of this contact.
	*
	* @param userUuid the user uuid of this contact
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_contact.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this contact.
	*
	* @return the user name of this contact
	*/
	@Override
	public java.lang.String getUserName() {
		return _contact.getUserName();
	}

	/**
	* Sets the user name of this contact.
	*
	* @param userName the user name of this contact
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_contact.setUserName(userName);
	}

	/**
	* Returns the create date of this contact.
	*
	* @return the create date of this contact
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _contact.getCreateDate();
	}

	/**
	* Sets the create date of this contact.
	*
	* @param createDate the create date of this contact
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_contact.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this contact.
	*
	* @return the modified date of this contact
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _contact.getModifiedDate();
	}

	/**
	* Sets the modified date of this contact.
	*
	* @param modifiedDate the modified date of this contact
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_contact.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the first name of this contact.
	*
	* @return the first name of this contact
	*/
	@Override
	public java.lang.String getFirstName() {
		return _contact.getFirstName();
	}

	/**
	* Sets the first name of this contact.
	*
	* @param firstName the first name of this contact
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_contact.setFirstName(firstName);
	}

	/**
	* Returns the last name of this contact.
	*
	* @return the last name of this contact
	*/
	@Override
	public java.lang.String getLastName() {
		return _contact.getLastName();
	}

	/**
	* Sets the last name of this contact.
	*
	* @param lastName the last name of this contact
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_contact.setLastName(lastName);
	}

	/**
	* Returns the nick name of this contact.
	*
	* @return the nick name of this contact
	*/
	@Override
	public java.lang.String getNickName() {
		return _contact.getNickName();
	}

	/**
	* Sets the nick name of this contact.
	*
	* @param nickName the nick name of this contact
	*/
	@Override
	public void setNickName(java.lang.String nickName) {
		_contact.setNickName(nickName);
	}

	/**
	* Returns the birthday of this contact.
	*
	* @return the birthday of this contact
	*/
	@Override
	public java.util.Date getBirthday() {
		return _contact.getBirthday();
	}

	/**
	* Sets the birthday of this contact.
	*
	* @param birthday the birthday of this contact
	*/
	@Override
	public void setBirthday(java.util.Date birthday) {
		_contact.setBirthday(birthday);
	}

	/**
	* Returns the age of this contact.
	*
	* @return the age of this contact
	*/
	@Override
	public int getAge() {
		return _contact.getAge();
	}

	/**
	* Sets the age of this contact.
	*
	* @param age the age of this contact
	*/
	@Override
	public void setAge(int age) {
		_contact.setAge(age);
	}

	/**
	* Returns the friend of this contact.
	*
	* @return the friend of this contact
	*/
	@Override
	public boolean getFriend() {
		return _contact.getFriend();
	}

	/**
	* Returns <code>true</code> if this contact is friend.
	*
	* @return <code>true</code> if this contact is friend; <code>false</code> otherwise
	*/
	@Override
	public boolean isFriend() {
		return _contact.isFriend();
	}

	/**
	* Sets whether this contact is friend.
	*
	* @param friend the friend of this contact
	*/
	@Override
	public void setFriend(boolean friend) {
		_contact.setFriend(friend);
	}

	/**
	* Returns the relative of this contact.
	*
	* @return the relative of this contact
	*/
	@Override
	public boolean getRelative() {
		return _contact.getRelative();
	}

	/**
	* Returns <code>true</code> if this contact is relative.
	*
	* @return <code>true</code> if this contact is relative; <code>false</code> otherwise
	*/
	@Override
	public boolean isRelative() {
		return _contact.isRelative();
	}

	/**
	* Sets whether this contact is relative.
	*
	* @param relative the relative of this contact
	*/
	@Override
	public void setRelative(boolean relative) {
		_contact.setRelative(relative);
	}

	/**
	* Returns the image of this contact.
	*
	* @return the image of this contact
	*/
	@Override
	public java.sql.Blob getImage() {
		return _contact.getImage();
	}

	/**
	* Sets the image of this contact.
	*
	* @param image the image of this contact
	*/
	@Override
	public void setImage(java.sql.Blob image) {
		_contact.setImage(image);
	}

	@Override
	public boolean isNew() {
		return _contact.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_contact.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _contact.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_contact.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _contact.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _contact.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_contact.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _contact.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_contact.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_contact.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_contact.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ContactWrapper((Contact)_contact.clone());
	}

	@Override
	public int compareTo(com.test.model.Contact contact) {
		return _contact.compareTo(contact);
	}

	@Override
	public int hashCode() {
		return _contact.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.Contact> toCacheModel() {
		return _contact.toCacheModel();
	}

	@Override
	public com.test.model.Contact toEscapedModel() {
		return new ContactWrapper(_contact.toEscapedModel());
	}

	@Override
	public com.test.model.Contact toUnescapedModel() {
		return new ContactWrapper(_contact.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _contact.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _contact.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_contact.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactWrapper)) {
			return false;
		}

		ContactWrapper contactWrapper = (ContactWrapper)obj;

		if (Validator.equals(_contact, contactWrapper._contact)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Contact getWrappedContact() {
		return _contact;
	}

	@Override
	public Contact getWrappedModel() {
		return _contact;
	}

	@Override
	public void resetOriginalValues() {
		_contact.resetOriginalValues();
	}

	private Contact _contact;
}