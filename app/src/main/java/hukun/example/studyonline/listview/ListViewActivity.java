package hukun.example.studyonline.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import hukun.example.studyonline.R;



public class ListViewActivity extends Activity {
    private ListView mlist1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mlist1 = findViewById(R.id.list_1);
        mlist1.setAdapter(new MylistAdapter(ListViewActivity.this));
        //设置点击事件
        mlist1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "pos:" + position, Toast.LENGTH_LONG).show();
                //跳转功能
            }
        });
        //设置长按事件
        mlist1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "pso:" + position, Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}
