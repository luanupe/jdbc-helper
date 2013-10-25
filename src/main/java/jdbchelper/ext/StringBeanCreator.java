package jdbchelper.ext;

import java.sql.ResultSet;
import java.sql.SQLException;

import jdbchelper.BeanCreator;

/**
 * User: erdinc
 * Date: Jul 23, 2009
 * Time: 12:58:15 PM
 */
public class StringBeanCreator implements BeanCreator<String> {
   private int index;

   public StringBeanCreator(int index) {
      this.index = index;
   }

   public StringBeanCreator() {
      index = 1;
   }

   public String createBean(ResultSet rs) throws SQLException {
      return rs.getString(index);
   }
}
