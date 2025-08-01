package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Keep;

public class StickyHeaderRecyclerView extends ty4 {
    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Keep
    public void onDrawVerticalScrollBar(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setBounds(i, i2, i3, i4);
    }

    public void setStickyHeaderDecorator(qyd qyd) {
    }
}
