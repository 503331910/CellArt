package com.project.typeHandler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 大哲哥 on 2018/4/25.
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
public class JSONObjectTypeHandler extends BaseTypeHandler<Object> {


    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSON.toJSONString(parameter));
    }

    @Override
    public Object getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return JSONObject.parseObject(rs.getString(columnName), Object.class);
    }

    @Override
    public Object getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return JSONObject.parseObject(rs.getString(columnIndex), Object.class);
    }

    @Override
    public Object getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return JSONObject.parseObject(cs.getString(columnIndex), Object.class);
    }
}
