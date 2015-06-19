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

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the image column in Contact.
 *
 * @author nxant
 * @see Contact
 * @generated
 */
public class ContactImageBlobModel {
	public ContactImageBlobModel() {
	}

	public ContactImageBlobModel(long personId) {
		_personId = personId;
	}

	public ContactImageBlobModel(long personId, Blob imageBlob) {
		_personId = personId;
		_imageBlob = imageBlob;
	}

	public long getPersonId() {
		return _personId;
	}

	public void setPersonId(long personId) {
		_personId = personId;
	}

	public Blob getImageBlob() {
		return _imageBlob;
	}

	public void setImageBlob(Blob imageBlob) {
		_imageBlob = imageBlob;
	}

	private long _personId;
	private Blob _imageBlob;
}