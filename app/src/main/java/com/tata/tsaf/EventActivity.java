package com.tata.tsaf;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class EventActivity extends AppCompatActivity {

    ListView listEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        listEvents=(ListView)findViewById(R.id.event_list);
        listEvents.setAdapter(new MyAdapter(this));
        
    }

}
class SingleRow
{
    String title;
    SingleRow(String title)
    {
        this.title=title;
    }
}

class MyAdapter extends BaseAdapter
{
    ArrayList<SingleRow> list;
    Context context;
    MyAdapter(Context c){
    list= new ArrayList<SingleRow>();
        Resources resources=c.getResources();
        String titles[]=resources.getStringArray(R.array.event_names);
        for(int i=0;i<5;i++)
        {
            list.add(new SingleRow(titles[i]));
        }
}


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.event_listitem_layout,viewGroup,false);
        TextView title=(TextView)row.findViewById(R.id.titleEventName);

        SingleRow temp=list.get(i);
        title.setText(temp.title);

        return row;
    }
}

