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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.NoSuchFooException;

import com.test.model.Foo;
import com.test.model.impl.FooImpl;
import com.test.model.impl.FooModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the foo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nxant
 * @see FooPersistence
 * @see FooUtil
 * @generated
 */
public class FooPersistenceImpl extends BasePersistenceImpl<Foo>
	implements FooPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FooUtil} to access the foo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FooImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, FooImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, FooImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NICKNAME = new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, FooImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNickName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NICKNAME =
		new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, FooImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNickName",
			new String[] { String.class.getName() },
			FooModelImpl.NICKNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NICKNAME = new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNickName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the foos where nickName = &#63;.
	 *
	 * @param nickName the nick name
	 * @return the matching foos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Foo> findByNickName(String nickName) throws SystemException {
		return findByNickName(nickName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Foo> findByNickName(String nickName, int start, int end)
		throws SystemException {
		return findByNickName(nickName, start, end, null);
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
	@Override
	public List<Foo> findByNickName(String nickName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NICKNAME;
			finderArgs = new Object[] { nickName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NICKNAME;
			finderArgs = new Object[] { nickName, start, end, orderByComparator };
		}

		List<Foo> list = (List<Foo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Foo foo : list) {
				if (!Validator.equals(nickName, foo.getNickName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FOO_WHERE);

			boolean bindNickName = false;

			if (nickName == null) {
				query.append(_FINDER_COLUMN_NICKNAME_NICKNAME_1);
			}
			else if (nickName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NICKNAME_NICKNAME_3);
			}
			else {
				bindNickName = true;

				query.append(_FINDER_COLUMN_NICKNAME_NICKNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FooModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNickName) {
					qPos.add(nickName);
				}

				if (!pagination) {
					list = (List<Foo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Foo>(list);
				}
				else {
					list = (List<Foo>)QueryUtil.list(q, getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Foo findByNickName_First(String nickName,
		OrderByComparator orderByComparator)
		throws NoSuchFooException, SystemException {
		Foo foo = fetchByNickName_First(nickName, orderByComparator);

		if (foo != null) {
			return foo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nickName=");
		msg.append(nickName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFooException(msg.toString());
	}

	/**
	 * Returns the first foo in the ordered set where nickName = &#63;.
	 *
	 * @param nickName the nick name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching foo, or <code>null</code> if a matching foo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo fetchByNickName_First(String nickName,
		OrderByComparator orderByComparator) throws SystemException {
		List<Foo> list = findByNickName(nickName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Foo findByNickName_Last(String nickName,
		OrderByComparator orderByComparator)
		throws NoSuchFooException, SystemException {
		Foo foo = fetchByNickName_Last(nickName, orderByComparator);

		if (foo != null) {
			return foo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nickName=");
		msg.append(nickName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFooException(msg.toString());
	}

	/**
	 * Returns the last foo in the ordered set where nickName = &#63;.
	 *
	 * @param nickName the nick name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching foo, or <code>null</code> if a matching foo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo fetchByNickName_Last(String nickName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNickName(nickName);

		if (count == 0) {
			return null;
		}

		List<Foo> list = findByNickName(nickName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Foo[] findByNickName_PrevAndNext(long personId, String nickName,
		OrderByComparator orderByComparator)
		throws NoSuchFooException, SystemException {
		Foo foo = findByPrimaryKey(personId);

		Session session = null;

		try {
			session = openSession();

			Foo[] array = new FooImpl[3];

			array[0] = getByNickName_PrevAndNext(session, foo, nickName,
					orderByComparator, true);

			array[1] = foo;

			array[2] = getByNickName_PrevAndNext(session, foo, nickName,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Foo getByNickName_PrevAndNext(Session session, Foo foo,
		String nickName, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FOO_WHERE);

		boolean bindNickName = false;

		if (nickName == null) {
			query.append(_FINDER_COLUMN_NICKNAME_NICKNAME_1);
		}
		else if (nickName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NICKNAME_NICKNAME_3);
		}
		else {
			bindNickName = true;

			query.append(_FINDER_COLUMN_NICKNAME_NICKNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FooModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNickName) {
			qPos.add(nickName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(foo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Foo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the foos where nickName = &#63; from the database.
	 *
	 * @param nickName the nick name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNickName(String nickName) throws SystemException {
		for (Foo foo : findByNickName(nickName, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(foo);
		}
	}

	/**
	 * Returns the number of foos where nickName = &#63;.
	 *
	 * @param nickName the nick name
	 * @return the number of matching foos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNickName(String nickName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NICKNAME;

		Object[] finderArgs = new Object[] { nickName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FOO_WHERE);

			boolean bindNickName = false;

			if (nickName == null) {
				query.append(_FINDER_COLUMN_NICKNAME_NICKNAME_1);
			}
			else if (nickName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NICKNAME_NICKNAME_3);
			}
			else {
				bindNickName = true;

				query.append(_FINDER_COLUMN_NICKNAME_NICKNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNickName) {
					qPos.add(nickName);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NICKNAME_NICKNAME_1 = "foo.nickName IS NULL";
	private static final String _FINDER_COLUMN_NICKNAME_NICKNAME_2 = "foo.nickName = ?";
	private static final String _FINDER_COLUMN_NICKNAME_NICKNAME_3 = "(foo.nickName IS NULL OR foo.nickName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FRIEND = new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, FooImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFriend",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FRIEND =
		new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, FooImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFriend",
			new String[] { Boolean.class.getName() },
			FooModelImpl.FRIEND_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FRIEND = new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFriend",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the foos where friend = &#63;.
	 *
	 * @param friend the friend
	 * @return the matching foos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Foo> findByFriend(boolean friend) throws SystemException {
		return findByFriend(friend, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Foo> findByFriend(boolean friend, int start, int end)
		throws SystemException {
		return findByFriend(friend, start, end, null);
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
	@Override
	public List<Foo> findByFriend(boolean friend, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FRIEND;
			finderArgs = new Object[] { friend };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FRIEND;
			finderArgs = new Object[] { friend, start, end, orderByComparator };
		}

		List<Foo> list = (List<Foo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Foo foo : list) {
				if ((friend != foo.getFriend())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FOO_WHERE);

			query.append(_FINDER_COLUMN_FRIEND_FRIEND_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FooModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(friend);

				if (!pagination) {
					list = (List<Foo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Foo>(list);
				}
				else {
					list = (List<Foo>)QueryUtil.list(q, getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Foo findByFriend_First(boolean friend,
		OrderByComparator orderByComparator)
		throws NoSuchFooException, SystemException {
		Foo foo = fetchByFriend_First(friend, orderByComparator);

		if (foo != null) {
			return foo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("friend=");
		msg.append(friend);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFooException(msg.toString());
	}

	/**
	 * Returns the first foo in the ordered set where friend = &#63;.
	 *
	 * @param friend the friend
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching foo, or <code>null</code> if a matching foo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo fetchByFriend_First(boolean friend,
		OrderByComparator orderByComparator) throws SystemException {
		List<Foo> list = findByFriend(friend, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Foo findByFriend_Last(boolean friend,
		OrderByComparator orderByComparator)
		throws NoSuchFooException, SystemException {
		Foo foo = fetchByFriend_Last(friend, orderByComparator);

		if (foo != null) {
			return foo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("friend=");
		msg.append(friend);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFooException(msg.toString());
	}

	/**
	 * Returns the last foo in the ordered set where friend = &#63;.
	 *
	 * @param friend the friend
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching foo, or <code>null</code> if a matching foo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo fetchByFriend_Last(boolean friend,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFriend(friend);

		if (count == 0) {
			return null;
		}

		List<Foo> list = findByFriend(friend, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Foo[] findByFriend_PrevAndNext(long personId, boolean friend,
		OrderByComparator orderByComparator)
		throws NoSuchFooException, SystemException {
		Foo foo = findByPrimaryKey(personId);

		Session session = null;

		try {
			session = openSession();

			Foo[] array = new FooImpl[3];

			array[0] = getByFriend_PrevAndNext(session, foo, friend,
					orderByComparator, true);

			array[1] = foo;

			array[2] = getByFriend_PrevAndNext(session, foo, friend,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Foo getByFriend_PrevAndNext(Session session, Foo foo,
		boolean friend, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FOO_WHERE);

		query.append(_FINDER_COLUMN_FRIEND_FRIEND_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FooModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(friend);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(foo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Foo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the foos where friend = &#63; from the database.
	 *
	 * @param friend the friend
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByFriend(boolean friend) throws SystemException {
		for (Foo foo : findByFriend(friend, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(foo);
		}
	}

	/**
	 * Returns the number of foos where friend = &#63;.
	 *
	 * @param friend the friend
	 * @return the number of matching foos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByFriend(boolean friend) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FRIEND;

		Object[] finderArgs = new Object[] { friend };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FOO_WHERE);

			query.append(_FINDER_COLUMN_FRIEND_FRIEND_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(friend);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FRIEND_FRIEND_2 = "foo.friend = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RELATIVE = new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, FooImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRelative",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIVE =
		new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, FooImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRelative",
			new String[] { Boolean.class.getName() },
			FooModelImpl.RELATIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RELATIVE = new FinderPath(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRelative",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the foos where relative = &#63;.
	 *
	 * @param relative the relative
	 * @return the matching foos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Foo> findByRelative(boolean relative) throws SystemException {
		return findByRelative(relative, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Foo> findByRelative(boolean relative, int start, int end)
		throws SystemException {
		return findByRelative(relative, start, end, null);
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
	@Override
	public List<Foo> findByRelative(boolean relative, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIVE;
			finderArgs = new Object[] { relative };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RELATIVE;
			finderArgs = new Object[] { relative, start, end, orderByComparator };
		}

		List<Foo> list = (List<Foo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Foo foo : list) {
				if ((relative != foo.getRelative())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FOO_WHERE);

			query.append(_FINDER_COLUMN_RELATIVE_RELATIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FooModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(relative);

				if (!pagination) {
					list = (List<Foo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Foo>(list);
				}
				else {
					list = (List<Foo>)QueryUtil.list(q, getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Foo findByRelative_First(boolean relative,
		OrderByComparator orderByComparator)
		throws NoSuchFooException, SystemException {
		Foo foo = fetchByRelative_First(relative, orderByComparator);

		if (foo != null) {
			return foo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("relative=");
		msg.append(relative);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFooException(msg.toString());
	}

	/**
	 * Returns the first foo in the ordered set where relative = &#63;.
	 *
	 * @param relative the relative
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching foo, or <code>null</code> if a matching foo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo fetchByRelative_First(boolean relative,
		OrderByComparator orderByComparator) throws SystemException {
		List<Foo> list = findByRelative(relative, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Foo findByRelative_Last(boolean relative,
		OrderByComparator orderByComparator)
		throws NoSuchFooException, SystemException {
		Foo foo = fetchByRelative_Last(relative, orderByComparator);

		if (foo != null) {
			return foo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("relative=");
		msg.append(relative);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFooException(msg.toString());
	}

	/**
	 * Returns the last foo in the ordered set where relative = &#63;.
	 *
	 * @param relative the relative
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching foo, or <code>null</code> if a matching foo could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo fetchByRelative_Last(boolean relative,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRelative(relative);

		if (count == 0) {
			return null;
		}

		List<Foo> list = findByRelative(relative, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Foo[] findByRelative_PrevAndNext(long personId, boolean relative,
		OrderByComparator orderByComparator)
		throws NoSuchFooException, SystemException {
		Foo foo = findByPrimaryKey(personId);

		Session session = null;

		try {
			session = openSession();

			Foo[] array = new FooImpl[3];

			array[0] = getByRelative_PrevAndNext(session, foo, relative,
					orderByComparator, true);

			array[1] = foo;

			array[2] = getByRelative_PrevAndNext(session, foo, relative,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Foo getByRelative_PrevAndNext(Session session, Foo foo,
		boolean relative, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FOO_WHERE);

		query.append(_FINDER_COLUMN_RELATIVE_RELATIVE_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FooModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(relative);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(foo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Foo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the foos where relative = &#63; from the database.
	 *
	 * @param relative the relative
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRelative(boolean relative) throws SystemException {
		for (Foo foo : findByRelative(relative, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(foo);
		}
	}

	/**
	 * Returns the number of foos where relative = &#63;.
	 *
	 * @param relative the relative
	 * @return the number of matching foos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRelative(boolean relative) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RELATIVE;

		Object[] finderArgs = new Object[] { relative };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FOO_WHERE);

			query.append(_FINDER_COLUMN_RELATIVE_RELATIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(relative);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_RELATIVE_RELATIVE_2 = "foo.relative = ?";

	public FooPersistenceImpl() {
		setModelClass(Foo.class);
	}

	/**
	 * Caches the foo in the entity cache if it is enabled.
	 *
	 * @param foo the foo
	 */
	@Override
	public void cacheResult(Foo foo) {
		EntityCacheUtil.putResult(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooImpl.class, foo.getPrimaryKey(), foo);

		foo.resetOriginalValues();
	}

	/**
	 * Caches the foos in the entity cache if it is enabled.
	 *
	 * @param foos the foos
	 */
	@Override
	public void cacheResult(List<Foo> foos) {
		for (Foo foo : foos) {
			if (EntityCacheUtil.getResult(FooModelImpl.ENTITY_CACHE_ENABLED,
						FooImpl.class, foo.getPrimaryKey()) == null) {
				cacheResult(foo);
			}
			else {
				foo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all foos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FooImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FooImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the foo.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Foo foo) {
		EntityCacheUtil.removeResult(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooImpl.class, foo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Foo> foos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Foo foo : foos) {
			EntityCacheUtil.removeResult(FooModelImpl.ENTITY_CACHE_ENABLED,
				FooImpl.class, foo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new foo with the primary key. Does not add the foo to the database.
	 *
	 * @param personId the primary key for the new foo
	 * @return the new foo
	 */
	@Override
	public Foo create(long personId) {
		Foo foo = new FooImpl();

		foo.setNew(true);
		foo.setPrimaryKey(personId);

		return foo;
	}

	/**
	 * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param personId the primary key of the foo
	 * @return the foo that was removed
	 * @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo remove(long personId) throws NoSuchFooException, SystemException {
		return remove((Serializable)personId);
	}

	/**
	 * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the foo
	 * @return the foo that was removed
	 * @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo remove(Serializable primaryKey)
		throws NoSuchFooException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Foo foo = (Foo)session.get(FooImpl.class, primaryKey);

			if (foo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFooException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(foo);
		}
		catch (NoSuchFooException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Foo removeImpl(Foo foo) throws SystemException {
		foo = toUnwrappedModel(foo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(foo)) {
				foo = (Foo)session.get(FooImpl.class, foo.getPrimaryKeyObj());
			}

			if (foo != null) {
				session.delete(foo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (foo != null) {
			clearCache(foo);
		}

		return foo;
	}

	@Override
	public Foo updateImpl(com.test.model.Foo foo) throws SystemException {
		foo = toUnwrappedModel(foo);

		boolean isNew = foo.isNew();

		FooModelImpl fooModelImpl = (FooModelImpl)foo;

		Session session = null;

		try {
			session = openSession();

			if (foo.isNew()) {
				session.save(foo);

				foo.setNew(false);
			}
			else {
				session.evict(foo);
				session.saveOrUpdate(foo);
			}

			session.flush();
			session.clear();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FooModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((fooModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NICKNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { fooModelImpl.getOriginalNickName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NICKNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NICKNAME,
					args);

				args = new Object[] { fooModelImpl.getNickName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NICKNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NICKNAME,
					args);
			}

			if ((fooModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FRIEND.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { fooModelImpl.getOriginalFriend() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FRIEND, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FRIEND,
					args);

				args = new Object[] { fooModelImpl.getFriend() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FRIEND, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FRIEND,
					args);
			}

			if ((fooModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { fooModelImpl.getOriginalRelative() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RELATIVE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIVE,
					args);

				args = new Object[] { fooModelImpl.getRelative() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RELATIVE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIVE,
					args);
			}
		}

		EntityCacheUtil.putResult(FooModelImpl.ENTITY_CACHE_ENABLED,
			FooImpl.class, foo.getPrimaryKey(), foo);

		foo.resetOriginalValues();

		return foo;
	}

	protected Foo toUnwrappedModel(Foo foo) {
		if (foo instanceof FooImpl) {
			return foo;
		}

		FooImpl fooImpl = new FooImpl();

		fooImpl.setNew(foo.isNew());
		fooImpl.setPrimaryKey(foo.getPrimaryKey());

		fooImpl.setPersonId(foo.getPersonId());
		fooImpl.setCompanyId(foo.getCompanyId());
		fooImpl.setUserId(foo.getUserId());
		fooImpl.setUserName(foo.getUserName());
		fooImpl.setCreateDate(foo.getCreateDate());
		fooImpl.setModifiedDate(foo.getModifiedDate());
		fooImpl.setFirstName(foo.getFirstName());
		fooImpl.setLastName(foo.getLastName());
		fooImpl.setNickName(foo.getNickName());
		fooImpl.setBirthday(foo.getBirthday());
		fooImpl.setAge(foo.getAge());
		fooImpl.setFriend(foo.isFriend());
		fooImpl.setRelative(foo.isRelative());
		fooImpl.setImage(foo.getImage());

		return fooImpl;
	}

	/**
	 * Returns the foo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the foo
	 * @return the foo
	 * @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFooException, SystemException {
		Foo foo = fetchByPrimaryKey(primaryKey);

		if (foo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFooException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return foo;
	}

	/**
	 * Returns the foo with the primary key or throws a {@link com.test.NoSuchFooException} if it could not be found.
	 *
	 * @param personId the primary key of the foo
	 * @return the foo
	 * @throws com.test.NoSuchFooException if a foo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo findByPrimaryKey(long personId)
		throws NoSuchFooException, SystemException {
		return findByPrimaryKey((Serializable)personId);
	}

	/**
	 * Returns the foo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the foo
	 * @return the foo, or <code>null</code> if a foo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Foo foo = (Foo)EntityCacheUtil.getResult(FooModelImpl.ENTITY_CACHE_ENABLED,
				FooImpl.class, primaryKey);

		if (foo == _nullFoo) {
			return null;
		}

		if (foo == null) {
			Session session = null;

			try {
				session = openSession();

				foo = (Foo)session.get(FooImpl.class, primaryKey);

				if (foo != null) {
					cacheResult(foo);
				}
				else {
					EntityCacheUtil.putResult(FooModelImpl.ENTITY_CACHE_ENABLED,
						FooImpl.class, primaryKey, _nullFoo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FooModelImpl.ENTITY_CACHE_ENABLED,
					FooImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return foo;
	}

	/**
	 * Returns the foo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param personId the primary key of the foo
	 * @return the foo, or <code>null</code> if a foo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Foo fetchByPrimaryKey(long personId) throws SystemException {
		return fetchByPrimaryKey((Serializable)personId);
	}

	/**
	 * Returns all the foos.
	 *
	 * @return the foos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Foo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Foo> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Foo> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Foo> list = (List<Foo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FOO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FOO;

				if (pagination) {
					sql = sql.concat(FooModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Foo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Foo>(list);
				}
				else {
					list = (List<Foo>)QueryUtil.list(q, getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the foos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Foo foo : findAll()) {
			remove(foo);
		}
	}

	/**
	 * Returns the number of foos.
	 *
	 * @return the number of foos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FOO);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the foo persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.Foo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Foo>> listenersList = new ArrayList<ModelListener<Foo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Foo>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FooImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FOO = "SELECT foo FROM Foo foo";
	private static final String _SQL_SELECT_FOO_WHERE = "SELECT foo FROM Foo foo WHERE ";
	private static final String _SQL_COUNT_FOO = "SELECT COUNT(foo) FROM Foo foo";
	private static final String _SQL_COUNT_FOO_WHERE = "SELECT COUNT(foo) FROM Foo foo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "foo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Foo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Foo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FooPersistenceImpl.class);
	private static Foo _nullFoo = new FooImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Foo> toCacheModel() {
				return _nullFooCacheModel;
			}
		};

	private static CacheModel<Foo> _nullFooCacheModel = new CacheModel<Foo>() {
			@Override
			public Foo toEntityModel() {
				return _nullFoo;
			}
		};
}