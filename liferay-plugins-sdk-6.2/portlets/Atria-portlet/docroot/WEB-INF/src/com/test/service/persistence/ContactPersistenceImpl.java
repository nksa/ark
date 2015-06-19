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

import com.test.NoSuchContactException;

import com.test.model.Contact;
import com.test.model.impl.ContactImpl;
import com.test.model.impl.ContactModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nxant
 * @see ContactPersistence
 * @see ContactUtil
 * @generated
 */
public class ContactPersistenceImpl extends BasePersistenceImpl<Contact>
	implements ContactPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ContactUtil} to access the contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ContactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NICKNAME = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNickName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NICKNAME =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNickName",
			new String[] { String.class.getName() },
			ContactModelImpl.NICKNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NICKNAME = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNickName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the contacts where nickName = &#63;.
	 *
	 * @param nickName the nick name
	 * @return the matching contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contact> findByNickName(String nickName)
		throws SystemException {
		return findByNickName(nickName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Contact> findByNickName(String nickName, int start, int end)
		throws SystemException {
		return findByNickName(nickName, start, end, null);
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
	@Override
	public List<Contact> findByNickName(String nickName, int start, int end,
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

		List<Contact> list = (List<Contact>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Contact contact : list) {
				if (!Validator.equals(nickName, contact.getNickName())) {
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

			query.append(_SQL_SELECT_CONTACT_WHERE);

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
				query.append(ContactModelImpl.ORDER_BY_JPQL);
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
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Contact>(list);
				}
				else {
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first contact in the ordered set where nickName = &#63;.
	 *
	 * @param nickName the nick name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws com.test.NoSuchContactException if a matching contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact findByNickName_First(String nickName,
		OrderByComparator orderByComparator)
		throws NoSuchContactException, SystemException {
		Contact contact = fetchByNickName_First(nickName, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nickName=");
		msg.append(nickName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the first contact in the ordered set where nickName = &#63;.
	 *
	 * @param nickName the nick name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact fetchByNickName_First(String nickName,
		OrderByComparator orderByComparator) throws SystemException {
		List<Contact> list = findByNickName(nickName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Contact findByNickName_Last(String nickName,
		OrderByComparator orderByComparator)
		throws NoSuchContactException, SystemException {
		Contact contact = fetchByNickName_Last(nickName, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nickName=");
		msg.append(nickName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the last contact in the ordered set where nickName = &#63;.
	 *
	 * @param nickName the nick name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact fetchByNickName_Last(String nickName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNickName(nickName);

		if (count == 0) {
			return null;
		}

		List<Contact> list = findByNickName(nickName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Contact[] findByNickName_PrevAndNext(long personId, String nickName,
		OrderByComparator orderByComparator)
		throws NoSuchContactException, SystemException {
		Contact contact = findByPrimaryKey(personId);

		Session session = null;

		try {
			session = openSession();

			Contact[] array = new ContactImpl[3];

			array[0] = getByNickName_PrevAndNext(session, contact, nickName,
					orderByComparator, true);

			array[1] = contact;

			array[2] = getByNickName_PrevAndNext(session, contact, nickName,
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

	protected Contact getByNickName_PrevAndNext(Session session,
		Contact contact, String nickName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONTACT_WHERE);

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
			query.append(ContactModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(contact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Contact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contacts where nickName = &#63; from the database.
	 *
	 * @param nickName the nick name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNickName(String nickName) throws SystemException {
		for (Contact contact : findByNickName(nickName, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts where nickName = &#63;.
	 *
	 * @param nickName the nick name
	 * @return the number of matching contacts
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

			query.append(_SQL_COUNT_CONTACT_WHERE);

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

	private static final String _FINDER_COLUMN_NICKNAME_NICKNAME_1 = "contact.nickName IS NULL";
	private static final String _FINDER_COLUMN_NICKNAME_NICKNAME_2 = "contact.nickName = ?";
	private static final String _FINDER_COLUMN_NICKNAME_NICKNAME_3 = "(contact.nickName IS NULL OR contact.nickName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FRIEND = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFriend",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FRIEND =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFriend",
			new String[] { Boolean.class.getName() },
			ContactModelImpl.FRIEND_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FRIEND = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFriend",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the contacts where friend = &#63;.
	 *
	 * @param friend the friend
	 * @return the matching contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contact> findByFriend(boolean friend) throws SystemException {
		return findByFriend(friend, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Contact> findByFriend(boolean friend, int start, int end)
		throws SystemException {
		return findByFriend(friend, start, end, null);
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
	@Override
	public List<Contact> findByFriend(boolean friend, int start, int end,
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

		List<Contact> list = (List<Contact>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Contact contact : list) {
				if ((friend != contact.getFriend())) {
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

			query.append(_SQL_SELECT_CONTACT_WHERE);

			query.append(_FINDER_COLUMN_FRIEND_FRIEND_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(friend);

				if (!pagination) {
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Contact>(list);
				}
				else {
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first contact in the ordered set where friend = &#63;.
	 *
	 * @param friend the friend
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws com.test.NoSuchContactException if a matching contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact findByFriend_First(boolean friend,
		OrderByComparator orderByComparator)
		throws NoSuchContactException, SystemException {
		Contact contact = fetchByFriend_First(friend, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("friend=");
		msg.append(friend);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the first contact in the ordered set where friend = &#63;.
	 *
	 * @param friend the friend
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact fetchByFriend_First(boolean friend,
		OrderByComparator orderByComparator) throws SystemException {
		List<Contact> list = findByFriend(friend, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Contact findByFriend_Last(boolean friend,
		OrderByComparator orderByComparator)
		throws NoSuchContactException, SystemException {
		Contact contact = fetchByFriend_Last(friend, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("friend=");
		msg.append(friend);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the last contact in the ordered set where friend = &#63;.
	 *
	 * @param friend the friend
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact fetchByFriend_Last(boolean friend,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFriend(friend);

		if (count == 0) {
			return null;
		}

		List<Contact> list = findByFriend(friend, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Contact[] findByFriend_PrevAndNext(long personId, boolean friend,
		OrderByComparator orderByComparator)
		throws NoSuchContactException, SystemException {
		Contact contact = findByPrimaryKey(personId);

		Session session = null;

		try {
			session = openSession();

			Contact[] array = new ContactImpl[3];

			array[0] = getByFriend_PrevAndNext(session, contact, friend,
					orderByComparator, true);

			array[1] = contact;

			array[2] = getByFriend_PrevAndNext(session, contact, friend,
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

	protected Contact getByFriend_PrevAndNext(Session session, Contact contact,
		boolean friend, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONTACT_WHERE);

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
			query.append(ContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(friend);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(contact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Contact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contacts where friend = &#63; from the database.
	 *
	 * @param friend the friend
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByFriend(boolean friend) throws SystemException {
		for (Contact contact : findByFriend(friend, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts where friend = &#63;.
	 *
	 * @param friend the friend
	 * @return the number of matching contacts
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

			query.append(_SQL_COUNT_CONTACT_WHERE);

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

	private static final String _FINDER_COLUMN_FRIEND_FRIEND_2 = "contact.friend = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RELATIVE = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRelative",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIVE =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRelative",
			new String[] { Boolean.class.getName() },
			ContactModelImpl.RELATIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RELATIVE = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRelative",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the contacts where relative = &#63;.
	 *
	 * @param relative the relative
	 * @return the matching contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contact> findByRelative(boolean relative)
		throws SystemException {
		return findByRelative(relative, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Contact> findByRelative(boolean relative, int start, int end)
		throws SystemException {
		return findByRelative(relative, start, end, null);
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
	@Override
	public List<Contact> findByRelative(boolean relative, int start, int end,
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

		List<Contact> list = (List<Contact>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Contact contact : list) {
				if ((relative != contact.getRelative())) {
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

			query.append(_SQL_SELECT_CONTACT_WHERE);

			query.append(_FINDER_COLUMN_RELATIVE_RELATIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(relative);

				if (!pagination) {
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Contact>(list);
				}
				else {
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first contact in the ordered set where relative = &#63;.
	 *
	 * @param relative the relative
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws com.test.NoSuchContactException if a matching contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact findByRelative_First(boolean relative,
		OrderByComparator orderByComparator)
		throws NoSuchContactException, SystemException {
		Contact contact = fetchByRelative_First(relative, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("relative=");
		msg.append(relative);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the first contact in the ordered set where relative = &#63;.
	 *
	 * @param relative the relative
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact fetchByRelative_First(boolean relative,
		OrderByComparator orderByComparator) throws SystemException {
		List<Contact> list = findByRelative(relative, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Contact findByRelative_Last(boolean relative,
		OrderByComparator orderByComparator)
		throws NoSuchContactException, SystemException {
		Contact contact = fetchByRelative_Last(relative, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("relative=");
		msg.append(relative);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the last contact in the ordered set where relative = &#63;.
	 *
	 * @param relative the relative
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact fetchByRelative_Last(boolean relative,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRelative(relative);

		if (count == 0) {
			return null;
		}

		List<Contact> list = findByRelative(relative, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Contact[] findByRelative_PrevAndNext(long personId,
		boolean relative, OrderByComparator orderByComparator)
		throws NoSuchContactException, SystemException {
		Contact contact = findByPrimaryKey(personId);

		Session session = null;

		try {
			session = openSession();

			Contact[] array = new ContactImpl[3];

			array[0] = getByRelative_PrevAndNext(session, contact, relative,
					orderByComparator, true);

			array[1] = contact;

			array[2] = getByRelative_PrevAndNext(session, contact, relative,
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

	protected Contact getByRelative_PrevAndNext(Session session,
		Contact contact, boolean relative, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONTACT_WHERE);

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
			query.append(ContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(relative);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(contact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Contact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contacts where relative = &#63; from the database.
	 *
	 * @param relative the relative
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRelative(boolean relative) throws SystemException {
		for (Contact contact : findByRelative(relative, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts where relative = &#63;.
	 *
	 * @param relative the relative
	 * @return the number of matching contacts
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

			query.append(_SQL_COUNT_CONTACT_WHERE);

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

	private static final String _FINDER_COLUMN_RELATIVE_RELATIVE_2 = "contact.relative = ?";

	public ContactPersistenceImpl() {
		setModelClass(Contact.class);
	}

	/**
	 * Caches the contact in the entity cache if it is enabled.
	 *
	 * @param contact the contact
	 */
	@Override
	public void cacheResult(Contact contact) {
		EntityCacheUtil.putResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactImpl.class, contact.getPrimaryKey(), contact);

		contact.resetOriginalValues();
	}

	/**
	 * Caches the contacts in the entity cache if it is enabled.
	 *
	 * @param contacts the contacts
	 */
	@Override
	public void cacheResult(List<Contact> contacts) {
		for (Contact contact : contacts) {
			if (EntityCacheUtil.getResult(
						ContactModelImpl.ENTITY_CACHE_ENABLED,
						ContactImpl.class, contact.getPrimaryKey()) == null) {
				cacheResult(contact);
			}
			else {
				contact.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all contacts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ContactImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ContactImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the contact.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Contact contact) {
		EntityCacheUtil.removeResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactImpl.class, contact.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Contact> contacts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Contact contact : contacts) {
			EntityCacheUtil.removeResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
				ContactImpl.class, contact.getPrimaryKey());
		}
	}

	/**
	 * Creates a new contact with the primary key. Does not add the contact to the database.
	 *
	 * @param personId the primary key for the new contact
	 * @return the new contact
	 */
	@Override
	public Contact create(long personId) {
		Contact contact = new ContactImpl();

		contact.setNew(true);
		contact.setPrimaryKey(personId);

		return contact;
	}

	/**
	 * Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param personId the primary key of the contact
	 * @return the contact that was removed
	 * @throws com.test.NoSuchContactException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact remove(long personId)
		throws NoSuchContactException, SystemException {
		return remove((Serializable)personId);
	}

	/**
	 * Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contact
	 * @return the contact that was removed
	 * @throws com.test.NoSuchContactException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact remove(Serializable primaryKey)
		throws NoSuchContactException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Contact contact = (Contact)session.get(ContactImpl.class, primaryKey);

			if (contact == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(contact);
		}
		catch (NoSuchContactException nsee) {
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
	protected Contact removeImpl(Contact contact) throws SystemException {
		contact = toUnwrappedModel(contact);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contact)) {
				contact = (Contact)session.get(ContactImpl.class,
						contact.getPrimaryKeyObj());
			}

			if (contact != null) {
				session.delete(contact);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (contact != null) {
			clearCache(contact);
		}

		return contact;
	}

	@Override
	public Contact updateImpl(com.test.model.Contact contact)
		throws SystemException {
		contact = toUnwrappedModel(contact);

		boolean isNew = contact.isNew();

		ContactModelImpl contactModelImpl = (ContactModelImpl)contact;

		Session session = null;

		try {
			session = openSession();

			if (contact.isNew()) {
				session.save(contact);

				contact.setNew(false);
			}
			else {
				session.evict(contact);
				session.saveOrUpdate(contact);
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

		if (isNew || !ContactModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((contactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NICKNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						contactModelImpl.getOriginalNickName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NICKNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NICKNAME,
					args);

				args = new Object[] { contactModelImpl.getNickName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NICKNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NICKNAME,
					args);
			}

			if ((contactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FRIEND.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						contactModelImpl.getOriginalFriend()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FRIEND, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FRIEND,
					args);

				args = new Object[] { contactModelImpl.getFriend() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FRIEND, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FRIEND,
					args);
			}

			if ((contactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						contactModelImpl.getOriginalRelative()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RELATIVE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIVE,
					args);

				args = new Object[] { contactModelImpl.getRelative() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RELATIVE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIVE,
					args);
			}
		}

		EntityCacheUtil.putResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactImpl.class, contact.getPrimaryKey(), contact);

		contact.resetOriginalValues();

		return contact;
	}

	protected Contact toUnwrappedModel(Contact contact) {
		if (contact instanceof ContactImpl) {
			return contact;
		}

		ContactImpl contactImpl = new ContactImpl();

		contactImpl.setNew(contact.isNew());
		contactImpl.setPrimaryKey(contact.getPrimaryKey());

		contactImpl.setPersonId(contact.getPersonId());
		contactImpl.setCompanyId(contact.getCompanyId());
		contactImpl.setUserId(contact.getUserId());
		contactImpl.setUserName(contact.getUserName());
		contactImpl.setCreateDate(contact.getCreateDate());
		contactImpl.setModifiedDate(contact.getModifiedDate());
		contactImpl.setFirstName(contact.getFirstName());
		contactImpl.setLastName(contact.getLastName());
		contactImpl.setNickName(contact.getNickName());
		contactImpl.setBirthday(contact.getBirthday());
		contactImpl.setAge(contact.getAge());
		contactImpl.setFriend(contact.isFriend());
		contactImpl.setRelative(contact.isRelative());
		contactImpl.setImage(contact.getImage());

		return contactImpl;
	}

	/**
	 * Returns the contact with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact
	 * @return the contact
	 * @throws com.test.NoSuchContactException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchContactException, SystemException {
		Contact contact = fetchByPrimaryKey(primaryKey);

		if (contact == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return contact;
	}

	/**
	 * Returns the contact with the primary key or throws a {@link com.test.NoSuchContactException} if it could not be found.
	 *
	 * @param personId the primary key of the contact
	 * @return the contact
	 * @throws com.test.NoSuchContactException if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact findByPrimaryKey(long personId)
		throws NoSuchContactException, SystemException {
		return findByPrimaryKey((Serializable)personId);
	}

	/**
	 * Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact
	 * @return the contact, or <code>null</code> if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Contact contact = (Contact)EntityCacheUtil.getResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
				ContactImpl.class, primaryKey);

		if (contact == _nullContact) {
			return null;
		}

		if (contact == null) {
			Session session = null;

			try {
				session = openSession();

				contact = (Contact)session.get(ContactImpl.class, primaryKey);

				if (contact != null) {
					cacheResult(contact);
				}
				else {
					EntityCacheUtil.putResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
						ContactImpl.class, primaryKey, _nullContact);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
					ContactImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return contact;
	}

	/**
	 * Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param personId the primary key of the contact
	 * @return the contact, or <code>null</code> if a contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Contact fetchByPrimaryKey(long personId) throws SystemException {
		return fetchByPrimaryKey((Serializable)personId);
	}

	/**
	 * Returns all the contacts.
	 *
	 * @return the contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Contact> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Contact> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Contact> findAll(int start, int end,
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

		List<Contact> list = (List<Contact>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTACT;

				if (pagination) {
					sql = sql.concat(ContactModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Contact>(list);
				}
				else {
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the contacts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Contact contact : findAll()) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts.
	 *
	 * @return the number of contacts
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

				Query q = session.createQuery(_SQL_COUNT_CONTACT);

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
	 * Initializes the contact persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.Contact")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Contact>> listenersList = new ArrayList<ModelListener<Contact>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Contact>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ContactImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONTACT = "SELECT contact FROM Contact contact";
	private static final String _SQL_SELECT_CONTACT_WHERE = "SELECT contact FROM Contact contact WHERE ";
	private static final String _SQL_COUNT_CONTACT = "SELECT COUNT(contact) FROM Contact contact";
	private static final String _SQL_COUNT_CONTACT_WHERE = "SELECT COUNT(contact) FROM Contact contact WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Contact exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Contact exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ContactPersistenceImpl.class);
	private static Contact _nullContact = new ContactImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Contact> toCacheModel() {
				return _nullContactCacheModel;
			}
		};

	private static CacheModel<Contact> _nullContactCacheModel = new CacheModel<Contact>() {
			@Override
			public Contact toEntityModel() {
				return _nullContact;
			}
		};
}