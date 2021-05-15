package com.neatwhiskey.mymessanger;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        EditText messageView = findViewById(R.id.message);
        String messageText = messageView.getText().toString();
       // Intent intent = new Intent(this, ReceiveMessageActivity.class);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        Intent chosenIntent;
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        //intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        //intent.putExtra("message", messageText);
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        String chooserTitle = getString(R.string.chooser);
        chosenIntent = Intent.createChooser(intent,
                chooserTitle);
        //startActivity(intent);
        startActivity(chosenIntent);


    }
}