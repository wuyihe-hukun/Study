package hukun.example.studyonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImagViewActivity extends AppCompatActivity {
private ImageView iV4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imag_view);
        iV4=findViewById(R.id.image4);
        //使用第三方的库进行操作,会出现没有网络权限，需要在manifests里面申明
        Glide.with(this).load("www.baidu.com/img/baidu_85beaf5496f291521eb75ba38eacbd87.svg").into(iV4);
    }
}
