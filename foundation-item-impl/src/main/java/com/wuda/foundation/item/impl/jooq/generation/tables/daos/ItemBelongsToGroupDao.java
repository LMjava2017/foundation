/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation.tables.daos;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemBelongsToGroup;
import com.wuda.foundation.item.impl.jooq.generation.tables.records.ItemBelongsToGroupRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * 表示item所属的组。比如店铺是一种组，分类也是一种组，等等。item与所有的组的关系都记录在这个表里。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemBelongsToGroupDao extends DAOImpl<ItemBelongsToGroupRecord, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup, ULong> {

    /**
     * Create a new ItemBelongsToGroupDao without any configuration
     */
    public ItemBelongsToGroupDao() {
        super(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup.class);
    }

    /**
     * Create a new ItemBelongsToGroupDao with an attached configuration
     */
    public ItemBelongsToGroupDao(Configuration configuration) {
        super(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchRangeOfId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchById(ULong... values) {
        return fetch(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup fetchOneById(ULong value) {
        return fetchOne(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.ID, value);
    }

    /**
     * Fetch records that have <code>item_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchRangeOfItemId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.ITEM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>item_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchByItemId(ULong... values) {
        return fetch(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.ITEM_ID, values);
    }

    /**
     * Fetch records that have <code>group_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchRangeOfGroupType(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.GROUP_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>group_type IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchByGroupType(UShort... values) {
        return fetch(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.GROUP_TYPE, values);
    }

    /**
     * Fetch records that have <code>group_identifier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchRangeOfGroupIdentifier(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.GROUP_IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>group_identifier IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchByGroupIdentifier(ULong... values) {
        return fetch(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.GROUP_IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchByCreateTime(LocalDateTime... values) {
        return fetch(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchByCreateUserId(ULong... values) {
        return fetch(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchByLastModifyUserId(ULong... values) {
        return fetch(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemBelongsToGroup> fetchByIsDeleted(ULong... values) {
        return fetch(ItemBelongsToGroup.ITEM_BELONGS_TO_GROUP.IS_DELETED, values);
    }
}
