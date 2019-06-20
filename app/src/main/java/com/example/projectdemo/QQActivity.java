package com.example.projectdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QQActivity extends AppCompatActivity {
    private Button btn_send;
    private EditText ed_set;
    private TextView tv_content,tv_content_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qq);

        btn_send = findViewById(R.id.btn_send);
        ed_set = findViewById(R.id.ed_set);
        tv_content = findViewById(R.id.tv_content);
        tv_content_1 = findViewById(R.id.tv_content_1);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String qqNumber = "http://japi.juhe.cn/qqevaluate/qq?key=6825b3a77d09bf45a5066e4ee8153408&qq=" + ed_set.getText().toString().trim();
                GetQQInfo(qqNumber);

            }
        });

    }

    public void GetQQInfo(final String url) {
        OkhttpUntil.enqueueGetrequest(url, QQbean.class, new NetworkListining<QQbean>() {
            @Override
            public void BackResultSuccess(QQbean bean, int code) {
                try {
                    if (code == 200) {
                        tv_content.setText(bean.getResult().getData().getConclusion());
                        tv_content_1.setText(bean.getResult().getData().getAnalysis());

                    }
                } catch (Exception e) {
                    Toast.makeText(QQActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void BackResultFail(Exception errow) {
                Toast.makeText(QQActivity.this, "请输入正确的QQ号码", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void tostring(String responseString) {

            }
        });
    }
}
