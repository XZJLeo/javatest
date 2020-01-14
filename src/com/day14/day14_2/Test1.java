package com.day14.day14_2;

public class Test1 {
    public static void main(String[] args) throws Exception{
testThrows();
testTryCatch();
    }
    public static char charAt(String str,int index)throws Exception{
        if(str==null){
            throw new Exception("字符数组不能为null");
        }if (str==""){
            throw new Exception("字符数组不能为空");
        }if (str.charAt(index)>str.length()&&str.charAt(index)<0){
            throw new Exception("索引越界");
        }
        else {
            return str.charAt(index);
        }
    }
    public static void testThrows()throws Exception{
        charAt("fgf",1);
    }
   public static void testTryCatch()throws Exception{
       try {
           charAt("dfgd",5);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

}
