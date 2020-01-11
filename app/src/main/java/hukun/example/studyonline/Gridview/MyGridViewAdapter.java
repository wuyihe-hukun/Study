package hukun.example.studyonline.Gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import hukun.example.studyonline.R;

public class MyGridViewAdapter extends BaseAdapter {
    private  Context mcontext;
   private LayoutInflater mlayoutInflater;
    //写一个构造方法
    public MyGridViewAdapter(Context context){
        this.mcontext=context;
        mlayoutInflater=LayoutInflater.from(context);

    }
    //重写方法
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    static class Viewholder{
        public ImageView imageView;
        public TextView textView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder holder=null;
        if (convertView==null){
            convertView=mlayoutInflater.inflate(R.layout.layout_grid_item,null);
            holder=new Viewholder();
            holder.imageView=convertView.findViewById(R.id.grid_img);
            holder.textView=convertView.findViewById(R.id.grid_title);
            convertView.setTag(holder);
        }
        else {
            holder= (Viewholder) convertView.getTag();
        }
        //赋值
        holder.textView.setText("flower");
        Glide.with(mcontext).load("http://photocdn.sohu.com/20120711/Img347901073.jpg").into(holder.imageView);
        return convertView;
    }
}
