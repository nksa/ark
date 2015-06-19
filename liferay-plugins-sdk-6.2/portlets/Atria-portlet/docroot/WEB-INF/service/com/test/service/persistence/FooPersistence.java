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

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.model.Foo;

/**
 * The persistence interface for the foo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nxant
 * @see FooPersistenceImpl
 * @see FooUtil
 * @generated
 */
public interface FooPersistence extends BasePersistence<Foo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FooUtil} to access the foo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the foos where nickName = &#63;.
	*
	* @param nickName the nick name
	* @return the matching foos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.Foo> findByNickName(
		java.lang.String nickName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.Foo> findByNickName(
		java.lang.String nickName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.Foo> findByNickName(
		java.lang.String nickName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first foo in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo findByNickName_First(java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo fetchByNickName_First(java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last foo in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo findByNickName_Last(java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where nickName = &#63;.
	*
	* @param nickName the nick name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo fetchByNickName_Last(java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.test.model.Foo[] findByNickName_PrevAndNext(long personId,
		java.lang.String nickName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Removes all the foos where nickName = &#63; from the database.
	*
	* @param nickName the nick name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNickName(java.lang.String nickName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of foos where nickName = &#63;.
	*
	* @param nickName the nick name
	* @return the number of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public int countByNickName(java.lang.String nickName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the foos where friend = &#63;.
	*
	* @param friend the friend
	* @return the matching foos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.Foo> findByFriend(boolean friend)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.Foo> findByFriend(boolean friend,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.Foo> findByFriend(boolean friend,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first foo in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo findByFriend_First(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo fetchByFriend_First(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last foo in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo findByFriend_Last(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where friend = &#63;.
	*
	* @param friend the friend
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo fetchByFriend_Last(boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.test.model.Foo[] findByFriend_PrevAndNext(long personId,
		boolean friend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Removes all the foos where friend = &#63; from the database.
	*
	* @param friend the friend
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFriend(boolean friend)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of foos where friend = &#63;.
	*
	* @param friend the friend
	* @return the number of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public int countByFriend(boolean friend)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the foos where relative = &#63;.
	*
	* @param relative the relative
	* @return the matching foos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.Foo> findByRelative(boolean relative)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.Foo> findByRelative(boolean relative,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.Foo> findByRelative(boolean relative,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first foo in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo findByRelative_First(boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo fetchByRelative_First(boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last foo in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws com.test.NoSuchFooException if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo findByRelative_Last(boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where relative = &#63;.
	*
	* @param relative the relative
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo fetchByRelative_Last(boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.test.model.Foo[] findByRelative_PrevAndNext(long personId,
		boolean relative,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Removes all the foos where relative = &#63; from the database.
	*
	* @param relative the relative
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRelative(boolean relative)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of foos where relative = &#63;.
	*
	* @param relative the relative
	* @return the number of matching foos
	* @throws SystemException if a system exception occurred
	*/
	public int countByRelative(boolean relative)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the foo in the entity cache if it is enabled.
	*
	* @param foo the foo
	*/
	public void cacheResult(com.test.model.Foo foo);

	/**
	* Caches the foos in the entity cache if it is enabled.
	*
	* @param foos the foos
	*/
	public void cacheResult(java.util.List<com.test.model.Foo> foos);

	/**
	* Creates a new foo with the primary key. Does not add the foo to the database.
	*
	* @param personId the primary key for the new foo
	* @return the new foo
	*/
	public com.test.model.Foo create(long personId);

	/**
	* Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param personId the primary key of the foo
	* @return the foo that was removed
	* @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo remove(long personId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	public com.test.model.Foo updateImpl(com.test.model.Foo foo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the foo with the primary key or throws a {@link com.test.NoSuchFooException} if it could not be found.
	*
	* @param personId the primary key of the foo
	* @return the foo
	* @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo findByPrimaryKey(long personId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchFooException;

	/**
	* Returns the foo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param personId the primary key of the foo
	* @return the foo, or <code>null</code> if a foo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.Foo fetchByPrimaryKey(long personId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the foos.
	*
	* @return the foos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.Foo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.Foo> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.test.model.Foo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the foos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of foos.
	*
	* @return the number of foos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}