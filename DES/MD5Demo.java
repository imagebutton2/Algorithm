package My;



/**


 *
 */
public class MD5Demo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //双方约定好的签名
        final String key ="asd";
        //数据
       // final String data ="{a:21}";
        final String data ="你是猪吗";
        System.out.println("原文：\n" + data);
        //对数据和签名进行加密处理
        String nt_data = QuickSDKDesUtil.encode(data, key);
        System.out.println("加密为:"+nt_data);

        //对加密后的数据进行md5处理
        System.out.println("对数据进行md5加密后在进行加密"+QuickSDKSignUtil.sign("nt_data=" + nt_data));

        //对进过md5处理后的数据进行签名后加密
        String nt_data2 = QuickSDKDesUtil.encode(QuickSDKSignUtil.sign("nt_data=" + nt_data), key);
        System.out.println(nt_data2);

        //对加密后的数据进行解密处理
        String sign_en = QuickSDKDesUtil.decode(nt_data2, key);
        System.out.println(sign_en);


    }

}