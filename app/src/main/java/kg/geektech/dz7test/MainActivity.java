package kg.geektech.dz7test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import kg.geektech.dz7test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
     ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClickers();
    }

    private void initClickers() {
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math math = new Math();
                String a = binding.first.getText().toString();
                String b = binding.second.getText().toString();
                String result = math.add(a,b);
                binding.result0.setText(result);
            }
        });
    }
}