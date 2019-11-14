package com.example.testoutbrain;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.outbrain.OBSDK.SmartFeed.OBSmartFeed;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<String> items = new ArrayList();

    private OBSmartFeed obSmartFeed;

    public MyAdapter() {
        items.add("");
        items.add("");
        items.add("");
    }

    public void setOBSmartFeed(OBSmartFeed obSmartFeed) {
        this.obSmartFeed = obSmartFeed;
    }


    @Override
    public int getItemCount() {
        return items.size()/* + this.obSmartFeed.getSmartFeedItemCount()*/;
    }

    public int getItemViewType(int position) {
        switch (position % 2) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
//                return this.obSmartFeed.getItemViewType(position, items.size());
        }
        return 0;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case 0:
                return new ViewHolder0(inflater.inflate(R.layout.text_item, parent,false));
            case 1:
                return new ViewHolder2(inflater.inflate(R.layout.image_item, parent,false));
//            default:
//                return this.obSmartFeed.onCreateViewHolder(parent, viewType);
        }
        return new ViewHolder2(inflater.inflate(R.layout.image_item, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case 0:
                ViewHolder0 viewHolder0 = (ViewHolder0)holder;
                viewHolder0.textView.setText("item #" + position);
                break;

            case 2:
                ViewHolder2 viewHolder2 = (ViewHolder2)holder;
                viewHolder2.imageView.setBackgroundColor(Color.BLUE);
                break;
            default:
//                this.obSmartFeed.onBindViewHolder(holder, position, items.size());
        }
    }
}

class ViewHolder0 extends RecyclerView.ViewHolder {
    TextView textView;
    public ViewHolder0(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv);
    }
}

class ViewHolder2 extends RecyclerView.ViewHolder {
    ImageView imageView;
    public ViewHolder2(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.iv);
    }
}