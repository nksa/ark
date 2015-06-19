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

import com.test.model.Foo;

import java.util.List;

/**
 * The persistence utility for the foo service. This utility wraps {@link FooPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nxant
 * @see FooPersistence
 * @see FooPersistenceImpl
 * @generated
 */
public class FooUtil {
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
	public static void clearCache(Foo foo) {
		getPersistence().clearCache(foo);
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
	public static List<Foo> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Foo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Foo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Foo update(Foo foo) throws SystemException {
		return getPersistence().update(foo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Foo update(Foo foo, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(foo, serviceContext);
	}

	/**
	* Returns all the foos where nickName = &#63;.
	*
	* @param nickName the nick name
	* @return the matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findByNickName(
		java.lang.String nickName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNickName(nickName);
	}

	/**
	* Returns a range of all the foos where nickName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nickName the nick name
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findByNickName(
		java.lang.String nickName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNickName(nickName, start, end);
	}

	/**
	* Returns an ordered range of all the foos where nickName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nickName the nick name
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findByNickName(
		java.lang.String nickName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNickName(nickName, start, end, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo findByNickName_First(
		java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence().findByNickName_First(nickName, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo fetchByNickName_First(
		java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNickName_First(nickName, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo findByNickName_Last(
		java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence().findByNickName_Last(nickName, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo fetchByNickName_Last(
		java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNickName_Last(nickName, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where nickName = &#63;.
	*
	* @param personId the primary key of the current foo
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo[] findByNickName_PrevAndNext(
		long personId, java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence()
				   .findByNickName_PrevAndNext(personId, nickName,
			orderByComparator);
	}

	/**
	* Removes all the foos where nickName = &#63; from the database.
	*
	* @param nickName the nick name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNickName(java.lang.String nickName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNickName(nickName);
	}

	/**
	* Returns the number of foos where nickName = &#63;.
	*
	* @param nickName the nick name
	* @return the number of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNickName(java.lang.String nickName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNickName(nickName);
	}

	/**
	* Returns all the foos where friend = &#63;.
	*
	* @param friend the friend
	* @return the matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findByFriend(
		boolean friend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFriend(friend);
	}

	/**
	* Returns a range of all the foos where friend = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param friend the friend
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findByFriend(
		boolean friend, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFriend(friend, start, end);
	}

	/**
	* Returns an ordered range of all the foos where friend = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param friend the friend
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findByFriend(
		boolean friend, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFriend(friend, start, end, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo findByFriend_First(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence().findByFriend_First(friend, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo fetchByFriend_First(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFriend_First(friend, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo findByFriend_Last(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence().findByFriend_Last(friend, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo fetchByFriend_Last(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFriend_Last(friend, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where friend = &#63;.
	*
	* @param personId the primary key of the current foo
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo[] findByFriend_PrevAndNext(long personId,
		boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence()
				   .findByFriend_PrevAndNext(personId, friend, orderByComparator);
	}

	/**
	* Removes all the foos where friend = &#63; from the database.
	*
	* @param friend the friend
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFriend(boolean friend)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFriend(friend);
	}

	/**
	* Returns the number of foos where friend = &#63;.
	*
	* @param friend the friend
	* @return the number of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFriend(boolean friend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFriend(friend);
	}

	/**
	* Returns all the foos where relative = &#63;.
	*
	* @param relative the relative
	* @return the matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findByRelative(
		boolean relative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRelative(relative);
	}

	/**
	* Returns a range of all the foos where relative = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param relative the relative
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findByRelative(
		boolean relative, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRelative(relative, start, end);
	}

	/**
	* Returns an ordered range of all the foos where relative = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param relative the relative
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findByRelative(
		boolean relative, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRelative(relative, start, end, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo findByRelative_First(boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence().findByRelative_First(relative, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo fetchByRelative_First(boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRelative_First(relative, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo findByRelative_Last(boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence().findByRelative_Last(relative, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo fetchByRelative_Last(boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRelative_Last(relative, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where relative = &#63;.
	*
	* @param personId the primary key of the current foo
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo[] findByRelative_PrevAndNext(
		long personId, boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence()
				   .findByRelative_PrevAndNext(personId, relative,
			orderByComparator);
	}

	/**
	* Removes all the foos where relative = &#63; from the database.
	*
	* @param relative the relative
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRelative(boolean relative)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRelative(relative);
	}

	/**
	* Returns the number of foos where relative = &#63;.
	*
	* @param relative the relative
	* @return the number of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRelative(boolean relative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRelative(relative);
	}

	/**
	* Caches the foo in the entity cache if it is enabled.
	*
	* @param foo the foo
	*/
	public static void cacheResult(com.test.model.Foo foo) {
		getPersistence().cacheResult(foo);
	}

	/**
	* Caches the foos in the entity cache if it is enabled.
	*
	* @param foos the foos
	*/
	public static void cacheResult(java.util.List<com.test.model.Foo> foos) {
		getPersistence().cacheResult(foos);
	}

	/**
	* Creates a new foo with the primary key. Does not add the foo to the database.
	*
	* @param personId the primary key for the new foo
	* @return the new foo
	*/
	public static com.test.model.Foo create(long personId) {
		return getPersistence().create(personId);
	}

	/**
	* Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param personId the primary key of the foo
	* @return the foo that was removed
	* @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo remove(long personId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence().remove(personId);
	}

	public static com.test.model.Foo updateImpl(com.test.model.Foo foo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(foo);
	}

	/**
	* Returns the foo with the primary key or throws a {@link com.test.NoSuchFooException} if it could not be found.
	*
	* @param personId the primary key of the foo
	* @return the foo
	* @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo findByPrimaryKey(long personId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException {
		return getPersistence().findByPrimaryKey(personId);
	}

	/**
	* Returns the foo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param personId the primary key of the foo
	* @return the foo, or <code>null</code> if a foo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Foo fetchByPrimaryKey(long personId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(personId);
	}

	/**
	* Returns all the foos.
	*
	* @return the foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of foos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Foo> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the foos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of foos.
	*
	* @return the number of foos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FooPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FooPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					FooPersistence.class.getName());

			ReferenceRegistry.registerReference(FooUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FooPersistence persistence) {
	}

	private static FooPersistence _persistence;
}