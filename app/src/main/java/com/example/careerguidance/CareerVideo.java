package com.example.careerguidance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.MediaController;
import android.widget.VideoView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class CareerVideo extends AppCompatActivity {

    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_video);

        youTubePlayerView = findViewById(R.id.video_view);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "tqvSHqR7pjU";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        youTubePlayerView = findViewById(R.id.video_view2);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "qi4sgAVPAyc";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        youTubePlayerView = findViewById(R.id.video_view3);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "3iWSxamM5pg";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        youTubePlayerView = findViewById(R.id.video_view4);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "Phtp0ksvoYo";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        youTubePlayerView = findViewById(R.id.video_view5);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "MkFbxU2xWjY";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        youTubePlayerView = findViewById(R.id.video_view6);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "XUMovfgpW-U";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        youTubePlayerView = findViewById(R.id.video_view7);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "ACXyIw4yDvk";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
    }
}
