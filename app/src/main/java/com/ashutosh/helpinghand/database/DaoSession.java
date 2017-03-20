package com.ashutosh.helpinghand.database;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig contactsDaoConfig;

    private final ContactsDao contactsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        contactsDaoConfig = daoConfigMap.get(ContactsDao.class).clone();
        contactsDaoConfig.initIdentityScope(type);

        contactsDao = new ContactsDao(contactsDaoConfig, this);

        registerDao(Contacts.class, contactsDao);
    }
    
    public void clear() {
        contactsDaoConfig.getIdentityScope().clear();
    }

    public ContactsDao getContactsDao() {
        return contactsDao;
    }

}