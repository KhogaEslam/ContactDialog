package com.example.technical.mydialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactDialogActivity extends AppCompatActivity {
    private String name;
    private String email;
    private String website;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_activity);
        start=(Button)findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createWebsiteDialog();
                createEmailDialog();
                createNameDialog();
            }
        });

    }
    private Dialog createNameDialog(){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("hello user");
        builder.setMessage("what is your name");
        final EditText input = new EditText(this);
        builder.setView(input);

        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                name = input.getText().toString();
                dialog.dismiss();

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });

        return builder.show();

    }

    private Dialog createEmailDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("hello again");
        builder.setMessage("what is your email:");

        final EditText input=new EditText(this);
        builder.setView(input);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                email = input.getText().toString();
                dialog.dismiss();
            }
        });
         builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
             }
         });
        return builder.show();

    }

    private Dialog createWebsiteDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("hello again el again");
        builder.setMessage("what is your website");
        final EditText input = new EditText(this);
        builder.setView(input);

        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                website = input.getText().toString();
                Toast.makeText(ContactDialogActivity.this, name + "\n" + email + "\n" + website, Toast.LENGTH_LONG).show();

            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
            }
        });

        return builder.show();

    }
}


