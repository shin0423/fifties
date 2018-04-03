package com.internousdev.fifties.util;

<<<<<<< HEAD
public class DateUtil {

}
=======
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/**
	 * 現在時刻取得メソッド
	 *
	 * @return String
	 */
	public String getDate() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		return simpleDateFormat.format(date);
	}
 }
>>>>>>> 71dc1576d68e4ff809948ab7a61b03cc1b6ebda7
