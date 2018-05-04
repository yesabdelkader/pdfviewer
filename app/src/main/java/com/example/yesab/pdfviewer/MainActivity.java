package com.example.yesab.pdfviewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {


        PDFView pdfViewer;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            pdfViewer=(PDFView) findViewById(R.id.pdfviewer);
            pdfViewer.fromAsset("lundi.pdf").swipeHorizontal(true).load();
                // allows to block changing pages using swipe
        }
}
