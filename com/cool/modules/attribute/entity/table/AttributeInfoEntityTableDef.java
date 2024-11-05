package com.cool.modules.attribute.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class AttributeInfoEntityTableDef extends TableDef {

    public static final AttributeInfoEntityTableDef ATTRIBUTE_INFO_ENTITY = new AttributeInfoEntityTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn REMARK = new QueryColumn(this, "remark");

    public final QueryColumn STATUS = new QueryColumn(this, "status");

    public final QueryColumn REQUIRED = new QueryColumn(this, "required");

    public final QueryColumn FIELD_TYPE = new QueryColumn(this, "field_type");

    public final QueryColumn CREATE_TIME = new QueryColumn(this, "create_time");

    public final QueryColumn UPDATE_TIME = new QueryColumn(this, "update_time");

    public final QueryColumn ENGLISH_NAME = new QueryColumn(this, "english_name");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, NAME, REMARK, STATUS, REQUIRED, FIELD_TYPE, CREATE_TIME, UPDATE_TIME, ENGLISH_NAME};

    public AttributeInfoEntityTableDef() {
        super("", "attribute_info");
    }

    private AttributeInfoEntityTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public AttributeInfoEntityTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new AttributeInfoEntityTableDef("", "attribute_info", alias));
    }

}
