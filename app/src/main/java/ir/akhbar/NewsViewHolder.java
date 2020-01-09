package ir.akhbar;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView description;
    private ImageView newsImage;

    public NewsViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.description);
        newsImage = (ImageView) itemView.findViewById(R.id.newsImage);
    }

    public void bind(NewsData newsData) {
        title.setText(newsData.getTitle());
        description.setText(newsData.getDescription());

        Glide.with(newsImage.getContext())
                .load(newsData.getImage())
                .fitCenter()
                .into(newsImage);
    }
}
