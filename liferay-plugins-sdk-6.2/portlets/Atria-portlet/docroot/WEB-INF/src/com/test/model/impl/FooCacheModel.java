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

package com.test.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.model.Foo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Foo in entity cache.
 *
 * @author nxant
 * @see Foo
 * @generated
 */
public class FooCacheModel implements CacheModel<Foo>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{personId=");
		sb.append(personId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", nickName=");
		sb.append(nickName);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", age=");
		sb.append(age);
		sb.append(", friend=");
		sb.append(friend);
		sb.append(", relative=");
		sb.append(relative);

		return sb.toString();
	}

	@Override
	public Foo toEntityModel() {
		FooImpl fooImpl = new FooImpl();

		fooImpl.setPersonId(personId);
		fooImpl.setCompanyId(companyId);
		fooImpl.setUserId(userId);

		if (userName == null) {
			fooImpl.setUserName(StringPool.BLANK);
		}
		else {
			fooImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fooImpl.setCreateDate(null);
		}
		else {
			fooImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fooImpl.setModifiedDate(null);
		}
		else {
			fooImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			fooImpl.setFirstName(StringPool.BLANK);
		}
		else {
			fooImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			fooImpl.setLastName(StringPool.BLANK);
		}
		else {
			fooImpl.setLastName(lastName);
		}

		if (nickName == null) {
			fooImpl.setNickName(StringPool.BLANK);
		}
		else {
			fooImpl.setNickName(nickName);
		}

		if (birthday == Long.MIN_VALUE) {
			fooImpl.setBirthday(null);
		}
		else {
			fooImpl.setBirthday(new Date(birthday));
		}

		fooImpl.setAge(age);
		fooImpl.setFriend(friend);
		fooImpl.setRelative(relative);

		fooImpl.resetOriginalValues();

		return fooImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		personId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		nickName = objectInput.readUTF();
		birthday = objectInput.readLong();
		age = objectInput.readInt();
		friend = objectInput.readBoolean();
		relative = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(personId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (nickName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nickName);
		}

		objectOutput.writeLong(birthday);
		objectOutput.writeInt(age);
		objectOutput.writeBoolean(friend);
		objectOutput.writeBoolean(relative);
	}

	public long personId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public String nickName;
	public long birthday;
	public int age;
	public boolean friend;
	public boolean relative;
}