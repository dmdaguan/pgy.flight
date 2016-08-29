package io.github.ryanhoo.firFlight.data.model;

import java.util.List;

/**
 * Created by GuDong on 8/28/16 21:44.
 * Contact with gudong.name@gmail.com.
 */
public class AppDetailModel {
    public String appKey;
    public String userKey;
    public String appType;
    public String appIsLastest;
    public String appFileSize;
    public String appName;
    public String appVersion;
    public String appVersionNo;
    public String appBuildVersion;
    public String appIdentifier;
    public String appIcon;
    public String appDescription;
    public String appUpdateDescription;
    public String appScreenshots;
    public String appShortcutUrl;
    public String appCreated;
    public String appUpdated;
    public String appQRCodeURL;
    public String appFollowed;
    public String otherAppsCount;
    public String commentsCount;
    /**
     * appKey : a8fe6fa3ea26af7930a7fb95212f6f75
     * userKey : 3172bed7694c12e7336ca602d0c158bb
     * appName : Android 6.0
     * appVersion : 6.0002.02
     * appBuildVersion : 35
     * appIdentifier : com.moji.mjweather
     * appCreated : 2天前
     * appUpdateDescription : 1、增加读取5.x 版本UID的方法 @段迪
     2、修改ZoomOutPageTransformer @张徐峰
     3、增加log日志，定位Widget部分图片绘制不出 @张徐峰
     4、修改皮肤小铺请求参数的名称 @张徐峰
     5、修改SkinShop加载图片的View @张徐峰
     6、修改皮肤小铺Constant名字 @张徐峰
     【已知问题】
     无
     */

    public List<AppLite> otherapps;
    public List<?> comments;
}
