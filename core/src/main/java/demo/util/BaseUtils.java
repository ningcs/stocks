package demo.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseUtils {

    public BaseUtils() {
    }

    /**
     * 判断手机号格式是否正确
     *
     * @param str
     * @return boolean
     */
    public static boolean isMobile(String str) {
        boolean bl = false;
        if (str != null && !"".equals(str.trim()) && str.length() == 11) {
            Pattern p = Pattern.compile("^[1][0-9]{10}$");
            Matcher m = p.matcher(str);
            bl = m.matches();
            return bl;
        } else {
            return bl;
        }
    }

    /**
     * 判断邮箱格式是否正确
     *
     * @param email
     * @return boolean
     */
    public static boolean isEmail(String email) {
        boolean bl = false;
        if (email != null && !"".equals(email.trim())) {
            Pattern p = Pattern.compile("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?");
            Matcher m = p.matcher(email);
            bl = m.matches();
            return bl;
        } else {
            return bl;
        }
    }

    /**
     * 字符串转时间
     *
     * @param dateStr
     * @return
     */
    public static Date formatStrToDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        if (dateStr != null && !"".equals(dateStr.trim())) {
            try {
                date = sdf.parse(dateStr);
            } catch (ParseException var4) {
                var4.printStackTrace();
            }
        }

        return date;
    }

    /**
     * 时间转字符串
     *
     * @param date
     * @return
     */
    public static String formatDateToStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = "";
        if (date != null) {
            try {
                dateStr = sdf.format(date);
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

        return dateStr;
    }

    /**
     * 时间戳转字符串
     *
     * @param timestamp
     * @return
     */
    public static String formatTimestampToStr(Timestamp timestamp) {

        String dateStr = "";
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {

            dateStr = sdf.format(timestamp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }

    /**
     * 时间转字符串到分钟
     *
     * @param date
     * @return
     */
    public static String formatDateToStrMin(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateStr = "";
        if (date != null) {
            try {
                dateStr = sdf.format(date);
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

        return dateStr;
    }

    /**
     * 时间年月日转字符串
     *
     * @param date
     * @return
     */
    public static String formatDayDateToStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = "";
        if (date != null) {
            try {
                dateStr = sdf.format(date);
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

        return dateStr;
    }

    /**
     * 获取时间的年份
     *
     * @param date
     * @return
     */
    public static String formatDateToStrYear(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String dateStr = "";
        if (date != null) {
            try {
                dateStr = sdf.format(date);
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

        return dateStr;
    }

    /**
     * 获取时间的年月
     *
     * @param date
     * @return
     */
    public static String formatDateToStrMonth(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String dateStr = "";
        if (date != null) {
            try {
                dateStr = sdf.format(date);
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

        return dateStr;
    }

    /**
     * 获取时间的年月日
     *
     * @param date
     * @return
     */
    public static String formatDateToStrDay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = "";
        if (date != null) {
            try {
                dateStr = sdf.format(date);
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

        return dateStr;
    }

    /**
     * 字符串转年月日时间
     *
     * @param dateStr
     * @return
     */
    public static Date formatStrToDateDay(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        if (dateStr != null && !"".equals(dateStr.trim())) {
            try {
                date = sdf.parse(dateStr);
            } catch (ParseException var4) {
                var4.printStackTrace();
            }
        }

        return date;
    }

    /**
     * 字符串转年月日时分时间
     *
     * @param dateStr
     * @return
     */
    public static Date formatStrToDateDayHourMin(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = null;
        if (dateStr != null && !"".equals(dateStr.trim())) {
            try {
                date = sdf.parse(dateStr);
            } catch (ParseException var4) {
                var4.printStackTrace();
            }
        }

        return date;
    }

    /**
     * 字符串转年月时间
     *
     * @param dateStr
     * @return
     */
    public static Date formatStrToDateMonth(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = null;
        if (dateStr != null && !"".equals(dateStr.trim())) {
            try {
                date = sdf.parse(dateStr);
            } catch (ParseException var4) {
                var4.printStackTrace();
            }
        }

        return date;
    }

    public static String formatYearMonth(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String yearMonth = "";
        if (date != null) {
            try {
                yearMonth = sdf.format(date);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return yearMonth;
    }

    public static String formatDay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        String day = "";
        if (date != null) {
            try {
                day = sdf.format(date);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return day;
    }

    /**
     * 校验字符串只包含数字
     *
     * @param str
     * @return
     */
    public static boolean checkNumberStr(String str) {
        boolean bl = str.matches("[0-9]+");
        if (bl) {
            // "该字符串是纯数字";
        } else {
            // "该字符串不是纯数字";
        }
        return bl;
    }

    /**
     * 校验字符串中只有数字字母组成
     *
     * @param str
     * @return
     */
    public static boolean checkNumberAbcStr(String str) {
        boolean bl = str.matches("[0-9a-zA-Z]+");
        if (bl) {
            // "该字符串是数字字母";
        } else {
            // "该字符串不是数字字母";
        }

        return bl;
    }

    /**
     * 校验字符串中只有字母组成
     *
     * @param str
     * @return
     */
    public static boolean checkAbcStr(String str) {
        boolean bl = str.matches("[a-zA-Z]+");
        if (bl) {
            // "该字符串是字母";
        } else {
            // "该字符串不是字母";
        }

        return bl;
    }

    /**
     * 校验字符串是否是非符号字符
     *
     * @param str
     * @return
     */
    public static boolean checkNumberChineseStr(String str) {
        boolean bl = str.matches("[0-9a-zA-Z\\u4e00-\\u9fa5]+");
        if (bl) {
            // "该字符串是纯非符号字符";
        } else {
            // "该字符串不是纯非符号字符";
        }
        return bl;
    }


    /**
     * 校验字符串是否是中文字母
     *
     * @param str
     * @return
     */
    public static boolean checkChineseAbcStr(String str) {
        boolean bl = str.matches("[a-zA-Z\\u4e00-\\u9fa5]+");
        if (bl) {
            // "该字符串是中文字母";
        } else {
            // "该字符串不是中文字母";
        }
        return bl;
    }

    /**
     * 校验字符串是否是中文
     *
     * @param str
     * @return
     */
    public static boolean checkChineseStr(String str) {
        boolean bl = str.matches("[\\u4e00-\\u9fa5]+");
        if (bl) {
            // "该字符串是中文";
        } else {
            // "该字符串不是中文";
        }
        return bl;
    }


    /**
     * 通过身份证号获取生日
     *
     * @param idNumber
     * @return
     */
    public static Date getBirthday(String idNumber) {
        Date userBirthday = null;
        if (idNumber != null && !"".equals(idNumber.trim())) {
            String birthday = idNumber.substring(6, 14);
            StringBuilder sb = new StringBuilder(birthday);
            sb.insert(4, "-");
            sb.insert(7, "-");

            userBirthday = BaseUtils.formatStrToDateDay(sb.toString());
        }
        return userBirthday;
    }

    /**
     * 通过身份证号获取性别
     * 0:女 1：男
     *
     * @param idNumber
     */
    public static Integer getSex(String idNumber) {
        Integer ss = null;
        if (idNumber != null && !"".equals(idNumber.trim())) {
            String sex = idNumber.substring(16, 17);
            if (Integer.parseInt(sex) % 2 == 0) {
                ss = 0;
            } else {
                ss = 1;
            }
        }
        return ss;
    }

    /**
     * 对身份证号进行加密
     *
     * @param idNumber
     * @return
     */
    public static String getStarIdNumber(String idNumber) {
        String starIdNumber = "";
        if (idNumber != null) {
            starIdNumber = idNumber.substring(0, 6)+"********"+idNumber.substring(14,18);
        }
        return starIdNumber;
    }
    /**
     * 从26为字母中获得一个十位随机数（纯字母）
     * ok
     */
    public static String getTenRandomLetter() {
        String word = "abcdefghijklmnopqrstuvwxyz";
        String tmp="";

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            Integer index = random.nextInt(word.length());
            char c = word.charAt(index);
            tmp = tmp + c;
        }
        return tmp;
    }

    /**
     * 从26为字母中获得一个十位随机数（字母和数字）
     * ok
     */
    public static String getTenRandomLetterAndNumber() {
        String word = "0123456789abcdefghijklmnopqrstuvwxyz";
        String tmp="";

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            Integer index = random.nextInt(word.length());
            char c = word.charAt(index);
            tmp = tmp + c;
        }
        return tmp;
    }

    /**
     * 以逗号截取数字字符串获得number
     * @param str
     */
    public static List<Integer> getListNumberByStr(String str){
        List<Integer> list =new ArrayList<Integer>();
        if(str!=null && !"".equals(str.trim())) {
            str = str.trim();
            String[] ss = str.split(",");

            if (ss != null) {
                for (int i = 0; i < ss.length; i++) {
                    list.add(Integer.parseInt(ss[i]));
                }
            }
        }
        return list;
    }

    /**
     * 根据生日计算当前年龄
     * @param birthDay
     * @return
     */
    public static int getAgeByDate(Date birthDay) {
        Calendar cal = Calendar.getInstance();

        if (cal.before(birthDay)) {
//            throw new IllegalArgumentException(
//                    "The birthDay is before Now.It's unbelievable!");
            return 0;
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);

        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            }else{
                age--;
            }
        }
        return age;
    }

    /**
     * 通过身份证号获取年龄
     * @return
     */
    public static Integer   getAgeByIdNumber(String idNumber){
        String birthday="";
        String date ="";
        Integer  age=0;
        if (idNumber != null && !"".equals(idNumber.trim())) {
            birthday = idNumber.substring(6, 10);
            date = BaseUtils.formatDateToStrYear(new Date());
            age =Integer.parseInt(date)-Integer.parseInt(birthday);
        }
        return age;
    }

    /**
     * 通过身份证号获取性别
     * @return
     */
    public static String getSexNameByIdNumber(String idNumber){
        String sexName="";
        if (idNumber != null && !"".equals(idNumber.trim())) {
            String sex = idNumber.substring(16, 17);
            if (Integer.parseInt(sex) % 2 == 0) {
                sexName = "女";
            } else {
                sexName = "男";
            }
        }

        return sexName;
    }


    /**
     * 获取json对象
     * @param jsonFile
     * @return
     * @ningcs
     *
     */
    public static JSONObject getFileJson(String jsonFile){
        JSONArray jsonArray = JSONArray.fromObject(jsonFile);
        JSONObject jsonObject=null;
        for (int i = 0; i < jsonArray.size(); i++) {
            jsonObject = jsonArray.getJSONObject(i);
        }
        return jsonObject;
    }




    public static void main(String[] args) {
        boolean bl = isMobile("18811211318");
        System.out.println(bl);

        boolean bl_email = isEmail("songrf@1.2");
        System.out.println("bl_email = " + bl_email);

        System.out.println("Math.random() = "+Math.random()*26);

        Random random = new Random();
        Integer ran = random.nextInt(26);
        System.out.println("ran"+ran);
    }


    /**
     * 替换所有中文年月日为-
     * 2016年5月30日2016-5-30
     * @param dateStr
     * @return
     * @ningcs
     *
     */
    public static Date getReplaceAllDate(String dateStr) {
        String dates ="";
        Date date1 =null;
        if (dateStr!=null && !"".equals(dateStr.trim())){
            dates = dateStr.replaceAll("[\\u4e00-\\u9fa5]+", "-");
            dates = dates.substring(0,dates.length() - 1);
            date1= BaseUtils.formatStrToDateDay(dates);
        }
        System.out.println(dates);
        return date1;
    }

    /**
     * 将字符串去重并将字符串重新合并
     *
     * @ningcs
     *
     */
    public static String getRemoveSame(String str) {
        List<String> list = new ArrayList<>();
        if (str != null && !"".equals(str.trim())) {
            str = str.trim();
            String[] ss = str.split("/");
            if (ss != null) {
                for (int i = 0; i < ss.length; i++) {
                    list.add(ss[i]);
                    }
            }
        }
        HashSet<String > hs = new HashSet<String>(list);
        List<String> list1 = new ArrayList<>();
        for (String string :hs){
            list1.add(string);
        }
        String str1 ="";
        if (!list1.isEmpty()){
            for (String strs :list1){
                str1 =str1+strs+"/";
            }
        }
        return str1;
    }

    /**
     * 传入的时间与当前时间比较
     * 当前时间早于 传入时间 true
     *  当前时间晚于 传入时间 false
     * @ningcs
     *
     */
    public static Boolean compareCurrentTime(String dateStr) {
        Boolean checkResult=false;
        SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        Date date =new Date();
        String date1 =dateFormater.format(date);
        date = BaseUtils.formatStrToDateDay(date1);
        Date date2 = BaseUtils.formatStrToDate(dateStr+" 12:30:00");
        //2017-7-4 早于2017-9-30
        if (date.before(date2)){
            checkResult =true;
        }
        return checkResult;

    }

//    /**
//     * 循环取出100条数据
//     * @ningcs
//     *
//     */
//    public static List getHundredList(List list){
//        int k = 0;
//        for(int i = 0;i<list.size();i+=100){
//            List  newlist = list.subList(i,i+99);
//            k++;
//        }
//        return  newlist;
//    }


}