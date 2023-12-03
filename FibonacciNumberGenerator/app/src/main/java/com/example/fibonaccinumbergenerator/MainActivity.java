package com.example.fibonaccinumbergenerator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText positionInput = findViewById(R.id.positionInput);
        Button calculateButton = findViewById(R.id.calculateButton);
        final TextView resultTextView = findViewById(R.id.resultTextView);
        final TextView sequenceTextView = findViewById(R.id.fibonacciSequenceTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = positionInput.getText().toString();
                if (!input.isEmpty()) {
                    int position = Integer.parseInt(input);
                    long result = fibonacci(position);
                    resultTextView.setText("Fibonacci(" + position + "): " + result);

                    // Display the Fibonacci sequence from 1 to n
                    StringBuilder sequence = new StringBuilder("Fibonacci Sequence: ");
                    for (int i = 1; i <= position; i++) {
                        sequence.append(fibonacci(i)).append(", ");
                    }
                    sequence.setLength(sequence.length() - 2);  // Remove the last comma and space
                    sequenceTextView.setText(sequence.toString());
                }
            }
        });
    }

    private long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0, b = 1;
            for (int i = 2; i < n; i++) {
                long temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
}
