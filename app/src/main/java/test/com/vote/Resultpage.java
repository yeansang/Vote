package test.com.vote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;

public class Resultpage extends AppCompatActivity {

    private RatingBar image1Rating;
    private RatingBar image2Rating;
    private RatingBar image3Rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultpage);
        Intent intent = getIntent();

        image1Rating = (RatingBar) findViewById(R.id.ratingBar);
        image2Rating = (RatingBar) findViewById(R.id.ratingBar2);
        image3Rating = (RatingBar) findViewById(R.id.ratingBar3);

        image1Rating.setNumStars(intent.getIntExtra("image1",0));
        image2Rating.setNumStars(intent.getIntExtra("image2",0));
        image3Rating.setNumStars(intent.getIntExtra("image3",0));
    }
}
