package com.loopslive.guts.views.widgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.loopslive.guts.models.Challenge;
import com.loopslive.guts.views.adapters.ChallengeAdapter;
import com.loopslive.guts.R;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] data = {"a","b"};
    private Challenge[] challenges = {
            new Challenge(1, "Sing in full restaurant", "Sing in full restaurant", "cover", 10, 100, "easy", 0),
            new Challenge(1, "Sing in full restaurant", "Sing in full restaurant", "cover", 10, 100, "easy", 0),
            new Challenge(1, "Sing in full restaurant", "Sing in full restaurant", "cover", 10, 100, "easy", 0),
            new Challenge(1, "Sing in full restaurant", "Sing in full restaurant", "cover", 10, 100, "easy", 0),
            new Challenge(1, "Sing in full restaurant", "Sing in full restaurant", "cover", 10, 100, "easy", 0),
            new Challenge(1, "Sing in full restaurant", "Sing in full restaurant", "cover", 10, 100, "easy", 0),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.challenge_recycle_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ChallengeAdapter(challenges);
        recyclerView.setAdapter(adapter);
    }
}
