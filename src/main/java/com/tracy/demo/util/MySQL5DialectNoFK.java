package com.tracy.demo.util;

import org.hibernate.dialect.MySQL8Dialect;

public class MySQL5DialectNoFK extends MySQL8Dialect {
    @Override
    public String getTableTypeString() {

        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }

    public MySQL5DialectNoFK() {
        super();
//        registerFunction("order_china", new SQLFunctionTemplate(
//                new StringType(), "convert(?1 using ?2)"));

    }

    @Override
    public String getAddForeignKeyConstraintString(String constraintName, String[] foreignKey, String referencedTable,
                                                   String[] primaryKey, boolean referencesPrimaryKey) {
//        String sql = "";
//        for(String key : foreignKey) {
////            sql += "alter table" + referencedTable + " drop foreign key " + key + ";";
//            sql +=  " drop foreign key " + key + ";";
//        }
//        return sql;

        return "";
    }
}
