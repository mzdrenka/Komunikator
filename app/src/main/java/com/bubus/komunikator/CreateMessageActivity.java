package com.bubus.komunikator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    // Metoda onSendMessage() jest wywoływana po kliknięciu przycisku
    public void onSendMessage(View view){

        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        String chooserTitle = getString(R.string.chooser);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        Intent chosenIntent = Intent.createChooser(intent,chooserTitle);
     /*
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
     */


        startActivity(chosenIntent);

    }

}
