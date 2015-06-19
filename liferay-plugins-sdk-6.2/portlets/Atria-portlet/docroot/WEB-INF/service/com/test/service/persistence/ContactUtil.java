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

package com.test.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.model.Contact;

import java.util.List;

/**
 * The persistence utility for the contact service. This utility wraps {@link ContactPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nxant
 * @see ContactPersistence
 * @see ContactPersistenceImpl
 * @generated
 */
public class ContactUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Contact contact) {
		getPersistence().clearCache(contact);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Contact> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Contact update(Contact contact) throws SystemException {
		return getPersistence().update(contact);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Contact update(Contact contact, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(contact, serviceContext);
	}

	/**
	* Returns all the contacts where nickName = &#63;.
	*
	* @param nickName the nick name
	* @return the matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findByNickName(
		java.lang.String nickName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNickName(nickName);
	}

	/**
	* Returns a range of all the contacts where nickName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nickName the nick name
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findByNickName(
		java.lang.String nickName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNickName(nickName, start, end);
	}

	/**
	* Returns an ordered range of all the contacts where nickName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nickName the nick name
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findByNickName(
		java.lang.String nickName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNickName(nickName, start, end, orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws com.test.NoSuchContactException if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact findByNickName_First(
		java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence().findByNickName_First(nickName, orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact fetchByNickName_First(
		java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNickName_First(nickName, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws com.test.NoSuchContactException if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact findByNickName_Last(
		java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence().findByNickName_Last(nickName, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact fetchByNickName_Last(
		java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNickName_Last(nickName, orderByComparator);
	}

	/**
	* Returns the contacts before and after the current contact in the ordered set where nickName = &#63;.
	*
	* @param personId the primary key of the current contact
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws com.test.NoSuchContactException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact[] findByNickName_PrevAndNext(
		long personId, java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence()
				   .findByNickName_PrevAndNext(personId, nickName,
			orderByComparator);
	}

	/**
	* Removes all the contacts where nickName = &#63; from the database.
	*
	* @param nickName the nick name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNickName(java.lang.String nickName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNickName(nickName);
	}

	/**
	* Returns the number of contacts where nickName = &#63;.
	*
	* @param nickName the nick name
	* @return the number of matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNickName(java.lang.String nickName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNickName(nickName);
	}

	/**
	* Returns all the contacts where friend = &#63;.
	*
	* @param friend the friend
	* @return the matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findByFriend(
		boolean friend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFriend(friend);
	}

	/**
	* Returns a range of all the contacts where friend = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param friend the friend
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findByFriend(
		boolean friend, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFriend(friend, start, end);
	}

	/**
	* Returns an ordered range of all the contacts where friend = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param friend the friend
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findByFriend(
		boolean friend, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFriend(friend, start, end, orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws com.test.NoSuchContactException if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact findByFriend_First(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence().findByFriend_First(friend, orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact fetchByFriend_First(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFriend_First(friend, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws com.test.NoSuchContactException if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact findByFriend_Last(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence().findByFriend_Last(friend, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact fetchByFriend_Last(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFriend_Last(friend, orderByComparator);
	}

	/**
	* Returns the contacts before and after the current contact in the ordered set where friend = &#63;.
	*
	* @param personId the primary key of the current contact
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws com.test.NoSuchContactException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact[] findByFriend_PrevAndNext(
		long personId, boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence()
				   .findByFriend_PrevAndNext(personId, friend, orderByComparator);
	}

	/**
	* Removes all the contacts where friend = &#63; from the database.
	*
	* @param friend the friend
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFriend(boolean friend)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFriend(friend);
	}

	/**
	* Returns the number of contacts where friend = &#63;.
	*
	* @param friend the friend
	* @return the number of matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFriend(boolean friend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFriend(friend);
	}

	/**
	* Returns all the contacts where relative = &#63;.
	*
	* @param relative the relative
	* @return the matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findByRelative(
		boolean relative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRelative(relative);
	}

	/**
	* Returns a range of all the contacts where relative = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param relative the relative
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findByRelative(
		boolean relative, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRelative(relative, start, end);
	}

	/**
	* Returns an ordered range of all the contacts where relative = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param relative the relative
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findByRelative(
		boolean relative, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRelative(relative, start, end, orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact
	* @throws com.test.NoSuchContactException if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact findByRelative_First(
		boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence().findByRelative_First(relative, orderByComparator);
	}

	/**
	* Returns the first contact in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contact, or <code>null</code> if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact fetchByRelative_First(
		boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRelative_First(relative, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact
	* @throws com.test.NoSuchContactException if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact findByRelative_Last(boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence().findByRelative_Last(relative, orderByComparator);
	}

	/**
	* Returns the last contact in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contact, or <code>null</code> if a matching contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact fetchByRelative_Last(
		boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRelative_Last(relative, orderByComparator);
	}

	/**
	* Returns the contacts before and after the current contact in the ordered set where relative = &#63;.
	*
	* @param personId the primary key of the current contact
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contact
	* @throws com.test.NoSuchContactException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact[] findByRelative_PrevAndNext(
		long personId, boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence()
				   .findByRelative_PrevAndNext(personId, relative,
			orderByComparator);
	}

	/**
	* Removes all the contacts where relative = &#63; from the database.
	*
	* @param relative the relative
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRelative(boolean relative)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRelative(relative);
	}

	/**
	* Returns the number of contacts where relative = &#63;.
	*
	* @param relative the relative
	* @return the number of matching contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRelative(boolean relative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRelative(relative);
	}

	/**
	* Caches the contact in the entity cache if it is enabled.
	*
	* @param contact the contact
	*/
	public static void cacheResult(com.test.model.Contact contact) {
		getPersistence().cacheResult(contact);
	}

	/**
	* Caches the contacts in the entity cache if it is enabled.
	*
	* @param contacts the contacts
	*/
	public static void cacheResult(
		java.util.List<com.test.model.Contact> contacts) {
		getPersistence().cacheResult(contacts);
	}

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param personId the primary key for the new contact
	* @return the new contact
	*/
	public static com.test.model.Contact create(long personId) {
		return getPersistence().create(personId);
	}

	/**
	* Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param personId the primary key of the contact
	* @return the contact that was removed
	* @throws com.test.NoSuchContactException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact remove(long personId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence().remove(personId);
	}

	public static com.test.model.Contact updateImpl(
		com.test.model.Contact contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(contact);
	}

	/**
	* Returns the contact with the primary key or throws a {@link com.test.NoSuchContactException} if it could not be found.
	*
	* @param personId the primary key of the contact
	* @return the contact
	* @throws com.test.NoSuchContactException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact findByPrimaryKey(long personId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchContactException {
		return getPersistence().findByPrimaryKey(personId);
	}

	/**
	* Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param personId the primary key of the contact
	* @return the contact, or <code>null</code> if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Contact fetchByPrimaryKey(long personId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(personId);
	}

	/**
	* Returns all the contacts.
	*
	* @return the contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Contact> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the contacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ContactPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ContactPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					ContactPersistence.class.getName());

			ReferenceRegistry.registerReference(ContactUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ContactPersistence persistence) {
	}

	private static ContactPersistence _persistence;
}