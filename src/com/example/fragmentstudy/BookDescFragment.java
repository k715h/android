package com.example.fragmentstudy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BookDescFragment extends Fragment {

	String[] mBookDescriptions;
	TextView mBookDescriptionTextView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View viewHierarchy = inflater.inflate(R.layout.fragment_book_desc, container, false);
		mBookDescriptions = getResources().getStringArray(R.array.bookDescriptions);
		mBookDescriptionTextView = (TextView) viewHierarchy.findViewById(R.id.bookDescription);
		return viewHierarchy;
	}
	
	public void setBook(int bookIndex) {
		String bookDescription = mBookDescriptions[bookIndex];
		mBookDescriptionTextView.setText(bookDescription);
	}

}
