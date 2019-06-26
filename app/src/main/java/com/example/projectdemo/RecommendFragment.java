package com.example.projectdemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecommendFragment extends Fragment {

    private ViewFlipper viewFlipper;
    private int[]picData;
    private List<Map<String, Object>> mylistList;
    private SimpleAdapter mysimAdapter;
    private ListView listView;
    public RecommendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view=  inflater.inflate(R.layout.fragment_recommend, container, false);

        picData=new int []{R.drawable.news_1,R.drawable.news_2,R.drawable.news_3,R.drawable.nesw_4,R.drawable.news_5};
        viewFlipper=(ViewFlipper)view.findViewById(R.id.vf_video);
        for (int i=0;i<picData.length;i++){
            ImageView imageView=new ImageView(getContext());
            imageView.setImageResource(picData[i]);
            viewFlipper.addView(imageView);
        }

        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();


        mylistList = new ArrayList<Map<String, Object>>();
        Map<String,Object> m1=new HashMap<String, Object>();
        m1.put("logo_1",R.drawable.qq);
        m1.put("title","QQ凶吉测试");
        mylistList.add(m1);

        Map<String,Object> m2=new HashMap<String, Object>();
        m2.put("logo_1",R.drawable.id);
        m2.put("title","身份证查询");
        mylistList.add(m2);

        Map<String,Object> m3=new HashMap<String, Object>();
        m3.put("logo_1",R.drawable.weather);
        m3.put("title","天气预报");
        mylistList.add(m3);

        Map<String,Object> m4=new HashMap<String, Object>();
        m4.put("logo_1",R.drawable.mucin);
        m4.put("title","音乐");
        mylistList.add(m4);


        Map<String,Object> m5=new HashMap<String, Object>();
        m5.put("logo_1",R.drawable.game);
        m5.put("title","游戏");
        mylistList.add(m5);



        Map<String,Object> m6=new HashMap<String, Object>();
        m6.put("logo_1",R.drawable.exercise);
        m6.put("title","运动");
        mylistList.add(m6);



        Map<String,Object> m7=new HashMap<String, Object>();
        m7.put("logo_1",R.drawable.book);
        m7.put("title","看书");
        mylistList.add(m7);

        Map<String,Object> m8=new HashMap<String, Object>();
        m8.put("logo_1",R.drawable.travel);
        m8.put("title","旅行");
        mylistList.add(m8);


        mysimAdapter = new SimpleAdapter(getContext(), mylistList, R.layout.recommend_list,
                new String[]{"logo_1", "title" }, new int[]{
                R.id.im_rc_logo, R.id.tv_rc_title});
        listView = (ListView) view.findViewById(R.id.lv_rc_list);
        listView.setAdapter(mysimAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(getContext(),QQActivity.class);
                    startActivity(intent);
                }



            }
        });



        return view;

    }




}
