package hukun.example.studyonline.Gridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import hukun.example.studyonline.R;

public class GridViewActivity extends Activity {
    private GridView mgrdview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_gridview);
       mgrdview=findViewById(R.id.gridview_1);
       mgrdview.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
    }
}
