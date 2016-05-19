package com.crazyfzw.weibolist.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.crazyfzw.weibolist.R;
import com.crazyfzw.weibolist.adapter.MyRecyclerViewAdapter;
import com.crazyfzw.weibolist.model.NineGridTestModel;

import java.util.ArrayList;
import java.util.List;


public class WeiboListActivity extends AppCompatActivity {


    private RecyclerView mRecyclerview;
    private MyRecyclerViewAdapter adapter;


    private List<NineGridTestModel> mList = new ArrayList<>();
    private String[] mUrls = new String[]{"http://d.hiphotos.baidu.com/image/h%3D200/sign=201258cbcd80653864eaa313a7dca115/ca1349540923dd54e54f7aedd609b3de9c824873.jpg",
            "http://img3.fengniao.com/forum/attachpics/537/165/21472986.jpg",
            "http://d.hiphotos.baidu.com/image/h%3D200/sign=ea218b2c5566d01661199928a729d498/a08b87d6277f9e2fd4f215e91830e924b999f308.jpg",
            "http://img4.imgtn.bdimg.com/it/u=3445377427,2645691367&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=2644422079,4250545639&fm=21&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=1444023808,3753293381&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=882039601,2636712663&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=4119861953,350096499&fm=21&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=2437456944,1135705439&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=3251359643,4211266111&fm=21&gp=0.jpg",
            "http://img4.duitang.com/uploads/item/201506/11/20150611000809_yFe5Z.jpeg",
            "http://img5.imgtn.bdimg.com/it/u=1717647885,4193212272&fm=21&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=2024625579,507531332&fm=21&gp=0.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weibo_list);
        mRecyclerview = (RecyclerView) findViewById(R.id.tab3Recyclerview);

        //显示RecyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerview.setLayoutManager(layoutManager);
        mRecyclerview.setHasFixedSize(true);
        queryData(); //从网络查询数据

        adapter = new MyRecyclerViewAdapter(this, mList);
        mRecyclerview.setAdapter(adapter);
    }


    /**
     * 模拟从网络获取数据
     */
    public void queryData(){

        NineGridTestModel model1 = new NineGridTestModel();
        model1.urlList.add(mUrls[0]);
        mList.add(model1);

        NineGridTestModel model2 = new NineGridTestModel();
        model2.urlList.add(mUrls[4]);
        mList.add(model2);

        NineGridTestModel model3 = new NineGridTestModel();
        model3.urlList.add(mUrls[2]);
        mList.add(model3);

        NineGridTestModel model4 = new NineGridTestModel();
        for (int i = 0; i < mUrls.length; i++) {
            model4.urlList.add(mUrls[i]);
        }
        model4.isShowAll = false;
        mList.add(model4);

        NineGridTestModel model5 = new NineGridTestModel();
        for (int i = 0; i < mUrls.length; i++) {
            model5.urlList.add(mUrls[i]);
        }
        model5.isShowAll = false;//显示全部图片
        mList.add(model5);

        NineGridTestModel model6 = new NineGridTestModel();
        for (int i = 0; i < 9; i++) {
            model6.urlList.add(mUrls[i]);
        }
        mList.add(model6);

        NineGridTestModel model7 = new NineGridTestModel();
        for (int i = 3; i < 7; i++) {
            model7.urlList.add(mUrls[i]);
        }
        mList.add(model7);

        NineGridTestModel model8 = new NineGridTestModel();
        for (int i = 3; i < 6; i++) {
            model8.urlList.add(mUrls[i]);
        }
        mList.add(model8);
    }
}
