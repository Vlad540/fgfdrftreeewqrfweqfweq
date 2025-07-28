package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {
    public boolean g = false;

    public SearchBar$ScrollingViewBehavior() {
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.h(coordinatorLayout, view, view2);
        if (!this.g && (view2 instanceof fm)) {
            this.g = true;
            fm fmVar = (fm) view2;
            fmVar.setBackgroundColor(0);
            fmVar.setTargetElevation(0.0f);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
