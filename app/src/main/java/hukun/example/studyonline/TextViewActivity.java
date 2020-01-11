package hukun.example.studyonline;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mTv4,mTv5,mTv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4=findViewById(R.id.tv_4);
        //设置中划线
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
       //去除下划线的锯齿
        mTv4.getPaint().setAntiAlias(true);

        mTv5=findViewById(R.id.tv_5);
        //设置下划线
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        //通过html代码来设置下划线
        mTv6=findViewById(R.id.tv_6);
        mTv6.setText(Html.fromHtml("<u>可笑吧 我终于一个人孤独终老了</u>"));
        //第七个文本框是跑马灯的效果，就是文字要够长
    }
}
