package com.bigkoo.pickerview.listener;

/**
 * Created by xiaosong on 2018/3/20.
 */

public interface OnOptionsSelectChangeListener {

    /**
     *
     * @param options1
     * @param options2
     * @param options3
     * @param triggerWv 触发change的wheelView（1,2,3）
     */
    void onOptionsSelectChanged(int options1, int options2, int options3,int triggerWv);

}
