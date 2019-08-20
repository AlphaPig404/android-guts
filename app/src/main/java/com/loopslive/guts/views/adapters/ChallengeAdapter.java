package com.loopslive.guts.views.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.loopslive.guts.R;
import com.loopslive.guts.models.Challenge;

public class ChallengeAdapter extends RecyclerView.Adapter<ChallengeAdapter.ChallengeViewHolder> {
    private Challenge[] challenges;

    @NonNull
    @Override
    public ChallengeAdapter.ChallengeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.challenge_item, parent, false);
        ChallengeViewHolder cv = new ChallengeViewHolder(view);
        return cv;
    }

    @Override
    public void onBindViewHolder(@NonNull ChallengeAdapter.ChallengeViewHolder holder, int position) {
        holder.title.setText(challenges[position].getTitle());
        holder.level.setText(challenges[position].getLevel());
        holder.detail.setText(challenges[position].getDescription());
    }

    @Override
    public int getItemCount() {
        return challenges.length;
    }

    public static class ChallengeViewHolder extends RecyclerView.ViewHolder {
        private TextView level;
        private TextView expireTime;
        private TextView point;
        private TextView title;
        private TextView detail;
        private Button button;
        private ImageView cover;

        public ChallengeViewHolder(@NonNull View itemView) {
            super(itemView);
            level = itemView.findViewById(R.id.challenge_item_level);
            expireTime = itemView.findViewById(R.id.challenge_item_expire);
            point = itemView.findViewById(R.id.challenge_item_point);
            title = itemView.findViewById(R.id.challenge_item_title);
            detail = itemView.findViewById(R.id.challenge_item_detail);
            button = itemView.findViewById(R.id.challenge_item_button);
            cover = itemView.findViewById(R.id.challenge_item_cover);
        }
    }

    public ChallengeAdapter(Challenge[] mDataset){
        challenges = mDataset;
    }
}
