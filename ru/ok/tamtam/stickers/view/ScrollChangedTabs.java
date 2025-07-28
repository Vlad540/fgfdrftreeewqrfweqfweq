package ru.ok.tamtam.stickers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;

public class ScrollChangedTabs extends TabLayout {
    public ScrollChangedTabs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.tamtam.stickers.view.ScrollChangedTabs, android.view.View] */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        ScrollChangedTabs.super.onScrollChanged(i, i2, i3, i4);
    }

    public void setOnScrollListener(apc apc) {
    }
}
