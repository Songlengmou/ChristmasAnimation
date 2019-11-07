package com.example.christmasanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.luolc.emojirain.EmojiRainLayout;

/**
 * @author Song
 * desc:圣诞动画 从上至下飘落
 * source：https://github.com/Luolc/EmojiRain
 */
public class MainActivity extends AppCompatActivity {
    private EmojiRainLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainer = findViewById(R.id.group_emoji_container);

        // add emoji sources
        mContainer.addEmoji(R.drawable.emoji_1_3);
        mContainer.addEmoji(R.drawable.emoji_2_3);
        mContainer.addEmoji(R.drawable.emoji_3_3);
        mContainer.addEmoji(R.drawable.emoji_4_3);
        mContainer.addEmoji(R.drawable.emoji_5_3);

        // set emojis per flow, default 6
        mContainer.setPer(10);

        // set total duration in milliseconds, default 8000
        mContainer.setDuration(7200);

        // set average drop duration in milliseconds, default 2400
        mContainer.setDropDuration(2400);

        // set drop frequency in milliseconds, default 500
        mContainer.setDropFrequency(500);

        mContainer.startDropping();
//        mContainer.stopDropping();
    }
}
