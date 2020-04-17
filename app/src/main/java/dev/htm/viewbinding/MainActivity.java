package dev.htm.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import dev.htm.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //
    private ActivityMainBinding binding;
    volatile boolean isChange = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onChangeClick();
    }

    private void onChangeClick() {
        binding.btnChange.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!isChange) {
                    binding.changeText.setText("Change text");
                    isChange = true;
                } else {
                    binding.changeText.setText("Demo viewBinding");
                    isChange = false;
                }
            }
        });
    }
}
