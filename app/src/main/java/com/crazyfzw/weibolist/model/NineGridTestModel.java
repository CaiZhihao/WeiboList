package com.crazyfzw.weibolist.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Crazyfzw on 2016/5/19.
 */

public class NineGridTestModel implements Serializable {

    private static final long serialVersionUID = 2189052605715370758L;

    public List<String> urlList = new ArrayList<>();  //用于存储配图的地址

    public boolean isShowAll = false;
}
