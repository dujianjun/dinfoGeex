package geek.common;


import com.alibaba.fastjson.JSONObject;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-05-16  23:32  星期三
 * version 1.0
 */
public class utils {

    public static void main(String[] args) {

        JSONObject jsonObj =new JSONObject();
        jsonObj.put("fd", "23");
        jsonObj.put("add", "33");
        jsonObj.put("b", "32");
        //toJSONString对明文参数进行字母排序

        String plain = jsonObj.toJSONString();
        System.out.println(plain);
    }

}
