package mao.com.mao_wanandroid_client.base.presenter;

import io.reactivex.disposables.Disposable;
import mao.com.mao_wanandroid_client.base.BaseView;
import mao.com.mao_wanandroid_client.model.home.HomeArticleData;

/**
 * @author maoqitian
 * @Description Presenter 基类
 * @Time 2018/10/25 0025 17:05
 */
public interface AbstractBasePresenter<T extends BaseView> {

    /**
     * 绑定View
     * @param view
     */
    void attachView(T view);

    /**
     * 解绑View
     */
    void detachView();


    /**
     * 添加 rxBing 订阅管理器
     *
     * @param disposable Disposable
     */
    void addRxBindingSubscribe(Disposable disposable);

    /**
     * 是否使用夜间模式
     *
     * @return if is night mode
     */
    boolean getNightModeState();

    /**
     * 设置登录状态
     *
     * @param loginStatus
     */
    void setLoginStatus(boolean loginStatus);

    /**
     * 获取登录状态
     * @return
     */
    boolean getLoginStatus();

    /**
     * Get login account
     *
     * @return
     */
    String getLoginUserName();

    /**
     * set login account
     * @param
     */
    void setLoginUserName(String userName);

    /**
     * 登录密码
     * @param password
     */
    void setLoginPassword(String password);

    /**
     * 当前页数
     * @return current page
     */
    int getCurrentPage();

    /**
     * 文章收藏
     * @param position 文章目前在 recycleview 位置
     * @param homeArticleData 文章信息
     */
    void addArticleCollect(int position, HomeArticleData homeArticleData);
    /**
     * 取消文章收藏
     * @param position 文章目前在 recycleview 位置
     * @param homeArticleData 文章信息
     */
    void cancelArticleCollect(int position,HomeArticleData homeArticleData);
}
