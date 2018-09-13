package com.example.app.myapplication.Activity.Login.Welcome;


public interface IWelcomeContract {
    interface  View {
        /**Presenter判断完成后通过传递isFirstIn在View判断跳转*/
        public void onJump(boolean isFirstIn);
        public void onfinish();
    }
    interface  Presenter {
        /** 初始化 */
        public void initData();
        /** 主要判断是跳转到M主界面还是引导页 */
        public void onJump();
        /** 版本更新*/
        public void onUpdate(final boolean isForce, final String url);
    }
}
