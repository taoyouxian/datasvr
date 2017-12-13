
package cn.edu.hhuc.si.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.alibaba.fastjson.JSONException;

import cn.edu.hhuc.si.util.DBUtils;
import cn.edu.hhuc.si.util.JsonDBUtil;

public class TestService {

	private static Logger log = Logger.getLogger(TestService.class);

	@Test
	public void getUser() {
		DBUtils dbUtils = DBUtils.Instance();
		ResultSet rs = dbUtils.Select("select * from T_User");
		try {
			String aStr = JsonDBUtil.rSetToJson(rs);
			System.out.println(aStr);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
