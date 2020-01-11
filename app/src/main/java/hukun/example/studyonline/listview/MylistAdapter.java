package hukun.example.studyonline.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import hukun.example.studyonline.R;

public class MylistAdapter extends BaseAdapter {
    private Context mcontext;
    private LayoutInflater mlayoutnflater;
    ///写一个构造方法
    public MylistAdapter(Context context){
        this.mcontext=context;
        mlayoutnflater=LayoutInflater.from(context);

    }

    //重写以下的方法
    @Override
    public int getCount() {//列表长度
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    static class ViewHolder{
        public ImageView imageView;
        public TextView title,time,tvcontent;
    }
    @Override
    //列表显示的样式是怎么样的
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=mlayoutnflater.inflate(R.layout.layout_list_item,null);
            holder=new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.iv_1);
            holder.title=convertView.findViewById(R.id.it_1);
            holder.time=convertView.findViewById(R.id.it_2);
            holder.tvcontent=convertView.findViewById(R.id.it_3);
            convertView.setTag(holder);
        }
        else {
            holder= (ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.title.setText("标题");
        holder.time.setText("2019");
        holder.tvcontent.setText("内容");
        //Glide.with(mcontext).load("").into(holder.imageView);
        return convertView;
    }
}
