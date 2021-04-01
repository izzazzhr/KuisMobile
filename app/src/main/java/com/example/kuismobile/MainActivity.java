package com.example.kuismobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickBiodata(View view) {
        Intent c = new Intent(MainActivity.this, Biodata.class);
        startActivity(c);

    }

    public void clickMap(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-5.1809264,119.4214486")).setPackage("com.google.android.apps.maps"));
    }

    public void clickPhone(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 082296256938")));
    }

    public void clickPower(View view) {
        logout(this);
    }

    public static void logout(Activity activity) {

        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Logout");
        builder.setMessage("Are u sure?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                activity.finishAffinity();
                System.exit(0);
            }

        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}