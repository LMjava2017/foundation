/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables;


import com.wuda.foundation.notification.impl.jooq.generation.FoundationNotification;
import com.wuda.foundation.notification.impl.jooq.generation.Keys;
import com.wuda.foundation.notification.impl.jooq.generation.tables.records.NotificationTemplateRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * 通知内容的模板
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationTemplate extends TableImpl<NotificationTemplateRecord> {

    private static final long serialVersionUID = 1126992293;

    /**
     * The reference instance of <code>foundation_notification.notification_template</code>
     */
    public static final NotificationTemplate NOTIFICATION_TEMPLATE = new NotificationTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationTemplateRecord> getRecordType() {
        return NotificationTemplateRecord.class;
    }

    /**
     * The column <code>foundation_notification.notification_template.notification_template_id</code>.
     */
    public final TableField<NotificationTemplateRecord, ULong> NOTIFICATION_TEMPLATE_ID = createField(DSL.name("notification_template_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_notification.notification_template.name</code>. 模板名称
     */
    public final TableField<NotificationTemplateRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "模板名称");

    /**
     * The column <code>foundation_notification.notification_template.content</code>. 模板的内容
     */
    public final TableField<NotificationTemplateRecord, String> CONTENT = createField(DSL.name("content"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "模板的内容");

    /**
     * The column <code>foundation_notification.notification_template.description</code>. 对该模板的描述
     */
    public final TableField<NotificationTemplateRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "对该模板的描述");

    /**
     * The column <code>foundation_notification.notification_template.create_time</code>.
     */
    public final TableField<NotificationTemplateRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_template.create_user_id</code>.
     */
    public final TableField<NotificationTemplateRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_template.last_modify_time</code>.
     */
    public final TableField<NotificationTemplateRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_template.last_modify_user_id</code>.
     */
    public final TableField<NotificationTemplateRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_template.is_deleted</code>.
     */
    public final TableField<NotificationTemplateRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_notification.notification_template</code> table reference
     */
    public NotificationTemplate() {
        this(DSL.name("notification_template"), null);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_template</code> table reference
     */
    public NotificationTemplate(String alias) {
        this(DSL.name(alias), NOTIFICATION_TEMPLATE);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_template</code> table reference
     */
    public NotificationTemplate(Name alias) {
        this(alias, NOTIFICATION_TEMPLATE);
    }

    private NotificationTemplate(Name alias, Table<NotificationTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationTemplate(Name alias, Table<NotificationTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("通知内容的模板"), TableOptions.table());
    }

    public <O extends Record> NotificationTemplate(Table<O> child, ForeignKey<O, NotificationTemplateRecord> key) {
        super(child, key, NOTIFICATION_TEMPLATE);
    }

    @Override
    public Schema getSchema() {
        return FoundationNotification.FOUNDATION_NOTIFICATION;
    }

    @Override
    public Identity<NotificationTemplateRecord, ULong> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION_TEMPLATE;
    }

    @Override
    public UniqueKey<NotificationTemplateRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_TEMPLATE_PRIMARY;
    }

    @Override
    public List<UniqueKey<NotificationTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationTemplateRecord>>asList(Keys.KEY_NOTIFICATION_TEMPLATE_PRIMARY);
    }

    @Override
    public NotificationTemplate as(String alias) {
        return new NotificationTemplate(DSL.name(alias), this);
    }

    @Override
    public NotificationTemplate as(Name alias) {
        return new NotificationTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationTemplate rename(String name) {
        return new NotificationTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationTemplate rename(Name name) {
        return new NotificationTemplate(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, String, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
