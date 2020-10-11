/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemCategory;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemCategoryRelationship;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemCore;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemDescription;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemGeneral;
import com.wuda.foundation.item.impl.jooq.generation.tables.ItemVariation;


/**
 * Convenience access to all tables in foundation_item
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 物品分类
     */
    public static final ItemCategory ITEM_CATEGORY = ItemCategory.ITEM_CATEGORY;

    /**
     * 物品与分类的关系表，有很多设计是在物品表中放分类一，分类二，分类三这样的字段，这样设计的扩展性很弱
     */
    public static final ItemCategoryRelationship ITEM_CATEGORY_RELATIONSHIP = ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP;

    /**
     * 物品核心信息，代表所有的物品，之前有把用户ID放进来，表示该物品所属的用户，但是考虑到如果有子账号的情况，物品难道属于这个子账号所属的用户吗？而且记录了创建人用户ID，考虑这两个因素，因此不设置用户ID列
     */
    public static final ItemCore ITEM_CORE = ItemCore.ITEM_CORE;

    /**
     * item的描述信息，通常作为详情的一个字段，但是，由于描述信息通常内容较多，很多orm框架都是select *，分开了可以避免查询出来（有时候根本就没用到），而且大数据量的字段更新性能较差，如果需要更新，会影响到核心item表，因此单独作为一个表保存。也可以表示物品某个规格的描述信息，如果variation id不等于0
     */
    public static final ItemDescription ITEM_DESCRIPTION = ItemDescription.ITEM_DESCRIPTION;

    /**
     * 物品基本信息，也可以表示物品某个规格的基本信息，如果variation id不等于0
     */
    public static final ItemGeneral ITEM_GENERAL = ItemGeneral.ITEM_GENERAL;

    /**
     * 规格。比如一件衣服，有红色，白色两种规格。具体的属性和值保存在MongoDB. 不能用属性ID关联, 而是要具体的属性名称和值, 避免关联的属性修改. 注意和SKU之间的区别.
     */
    public static final ItemVariation ITEM_VARIATION = ItemVariation.ITEM_VARIATION;
}
