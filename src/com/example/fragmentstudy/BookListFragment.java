package com.example.fragmentstudy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class BookListFragment extends Fragment implements OnCheckedChangeListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View viewHierarchy = inflater.inflate(R.layout.fragment_book_list, container, false);
		RadioGroup group = (RadioGroup) viewHierarchy.findViewById(R.id.bookSelectGroup);
		group.setOnCheckedChangeListener(this);
		return viewHierarchy;
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		int bookIndex = translateIdToIndex(checkedId);
		OnSelectedBookChangeListener listener = (OnSelectedBookChangeListener) getActivity();
		listener.onSelectedBookChanged(bookIndex);
	}
	
	int translateIdToIndex(int id) {
		int index = -1;
		switch(id) {
		case R.id.dynamicUiBook:
			index = 0;
			break;
		case R.id.android4NewBook:
			index = 1;
			break;
		case R.id.android4NewBook1:
			index = 2;
			break;
		case R.id.android4NewBook2:
			index = 3;
			break;
		case R.id.android4NewBook3:
			index = 4;
			break;
		case R.id.android4NewBook4:
			index = 5;
			break;
		}
		return index;
	}

	
}
