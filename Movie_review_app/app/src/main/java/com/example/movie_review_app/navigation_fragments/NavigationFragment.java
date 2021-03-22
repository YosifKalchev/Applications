package com.example.movie_review_app.navigation_fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.movie_review_app.R;

import java.util.ArrayList;

public class NavigationFragment extends Fragment {

//TODO shape the methods to suit movie_fragments the best way possible

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_navigaton, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @SuppressLint("SetTextI18n")
    protected void showPublishScreen(TextView txtView, ArrayList<String> movieInfo) {
        txtView.setMovementMethod(null);
        txtView.setText("The movie has been published in "+ movieInfo.get(3));
    }

    protected void showReviewScreen(TextView txtView, ArrayList<String> movieInfo) {
        txtView.setMovementMethod(new ScrollingMovementMethod());
        txtView.setText(movieInfo.get(2));
    }

    protected void showCrewScreen(TextView txtView, ArrayList<String> movieInfo) {
        txtView.setMovementMethod(null);
        txtView.setText(movieInfo.get(1));
    }

    protected void showHomeScreen(View view, int direction) {

        Navigation.findNavController(view).navigate(direction);

    }
}
