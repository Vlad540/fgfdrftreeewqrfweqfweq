package defpackage;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

/* renamed from: msc  reason: default package */
public abstract class msc {
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(SearchView$SearchAutoComplete searchView$SearchAutoComplete, int i) {
        searchView$SearchAutoComplete.setInputMethodMode(i);
    }
}
