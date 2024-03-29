package com.ted.books;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class BookDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        Book book = getIntent().getParcelableExtra("Book");
        ActivityBookDetailBinding binding = DataBindingUtil.setContentView(this,
                                            R.layout.activity_book_detail);
        binding.setBook(book);
    }
}
