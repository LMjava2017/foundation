/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.security.impl.jooq.generation.tables;


import com.wuda.foundation.security.impl.jooq.generation.FoundationSecurity;
import com.wuda.foundation.security.impl.jooq.generation.Indexes;
import com.wuda.foundation.security.impl.jooq.generation.Keys;
import com.wuda.foundation.security.impl.jooq.generation.tables.records.PermissionAssignmentRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
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
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 权限分配。subject可以代表用户，也可以代表想要访问其他资源的应用，比如我们可以说user 【IS A】 subject，role 【IS 
 * A】 subject等等。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionAssignment extends TableImpl<PermissionAssignmentRecord> {

    private static final long serialVersionUID = -304602184;

    /**
     * The reference instance of <code>foundation_security.permission_assignment</code>
     */
    public static final PermissionAssignment PERMISSION_ASSIGNMENT = new PermissionAssignment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PermissionAssignmentRecord> getRecordType() {
        return PermissionAssignmentRecord.class;
    }

    /**
     * The column <code>foundation_security.permission_assignment.id</code>.
     */
    public final TableField<PermissionAssignmentRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_security.permission_assignment.subject_type</code>. subject的类型，比如subject代表用户
     */
    public final TableField<PermissionAssignmentRecord, UByte> SUBJECT_TYPE = createField(DSL.name("subject_type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "subject的类型，比如subject代表用户");

    /**
     * The column <code>foundation_security.permission_assignment.subject_identifier</code>. 如果subject type代表用户，那么这个值可能就是用户ID
     */
    public final TableField<PermissionAssignmentRecord, ULong> SUBJECT_IDENTIFIER = createField(DSL.name("subject_identifier"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "如果subject type代表用户，那么这个值可能就是用户ID");

    /**
     * The column <code>foundation_security.permission_assignment.persission_target_id</code>.
     */
    public final TableField<PermissionAssignmentRecord, ULong> PERSISSION_TARGET_ID = createField(DSL.name("persission_target_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.permission_assignment.permission_action_id</code>. permission action id，如果为0，则表示没有分配action
     */
    public final TableField<PermissionAssignmentRecord, ULong> PERMISSION_ACTION_ID = createField(DSL.name("permission_action_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "permission action id，如果为0，则表示没有分配action");

    /**
     * The column <code>foundation_security.permission_assignment.command</code>. 可选值有grant，revoke
     */
    public final TableField<PermissionAssignmentRecord, String> COMMAND = createField(DSL.name("command"), org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false), this, "可选值有grant，revoke");

    /**
     * The column <code>foundation_security.permission_assignment.create_time</code>.
     */
    public final TableField<PermissionAssignmentRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_security.permission_assignment.create_user_id</code>.
     */
    public final TableField<PermissionAssignmentRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.permission_assignment.is_deleted</code>.
     */
    public final TableField<PermissionAssignmentRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_security.permission_assignment</code> table reference
     */
    public PermissionAssignment() {
        this(DSL.name("permission_assignment"), null);
    }

    /**
     * Create an aliased <code>foundation_security.permission_assignment</code> table reference
     */
    public PermissionAssignment(String alias) {
        this(DSL.name(alias), PERMISSION_ASSIGNMENT);
    }

    /**
     * Create an aliased <code>foundation_security.permission_assignment</code> table reference
     */
    public PermissionAssignment(Name alias) {
        this(alias, PERMISSION_ASSIGNMENT);
    }

    private PermissionAssignment(Name alias, Table<PermissionAssignmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private PermissionAssignment(Name alias, Table<PermissionAssignmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("权限分配。subject可以代表用户，也可以代表想要访问其他资源的应用，比如我们可以说user 【IS A】 subject，role 【IS A】 subject等等。"), TableOptions.table());
    }

    public <O extends Record> PermissionAssignment(Table<O> child, ForeignKey<O, PermissionAssignmentRecord> key) {
        super(child, key, PERMISSION_ASSIGNMENT);
    }

    @Override
    public Schema getSchema() {
        return FoundationSecurity.FOUNDATION_SECURITY;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PERMISSION_ASSIGNMENT_FK_PERMISSION_ACTION_ID, Indexes.PERMISSION_ASSIGNMENT_FK_PERMISSION_TARGET_ID, Indexes.PERMISSION_ASSIGNMENT_IDX_SUBJECT);
    }

    @Override
    public Identity<PermissionAssignmentRecord, ULong> getIdentity() {
        return Keys.IDENTITY_PERMISSION_ASSIGNMENT;
    }

    @Override
    public UniqueKey<PermissionAssignmentRecord> getPrimaryKey() {
        return Keys.KEY_PERMISSION_ASSIGNMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<PermissionAssignmentRecord>> getKeys() {
        return Arrays.<UniqueKey<PermissionAssignmentRecord>>asList(Keys.KEY_PERMISSION_ASSIGNMENT_PRIMARY);
    }

    @Override
    public PermissionAssignment as(String alias) {
        return new PermissionAssignment(DSL.name(alias), this);
    }

    @Override
    public PermissionAssignment as(Name alias) {
        return new PermissionAssignment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PermissionAssignment rename(String name) {
        return new PermissionAssignment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PermissionAssignment rename(Name name) {
        return new PermissionAssignment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, UByte, ULong, ULong, ULong, String, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
