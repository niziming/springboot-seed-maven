package cn.zm.gcp;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
public class GoogleOAuth2ServiceAccountSample {
    /** OAuth 2.0 scopes. 重要，规范访问者的查看范围*/
    private static final List<String> SCOPES = Arrays.asList(
            "https://www.googleapis.com/auth/androidpublisher");

    public static void main(String[] args) {
        try {
            //File file = new File("zm-gcp-vm-20907ab63732.json");
            //System.out.println(file.exists());
            //if (!file.exists()) file.createNewFile();
            //System.out.println(file.exists());
            // 根据Service Account文件构造认证实例 GoogleCredential
            GoogleCredential credential = GoogleCredential
                    .fromStream(new FileInputStream(
                            "zm-gcp-vm-20907ab63732.json"))// 加载服务帐户认证文件
                    .createScoped(SCOPES);

            // 刷新token
            credential.refreshToken();

            // 获取token
            System.out.println(credential.getAccessToken());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
