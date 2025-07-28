package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class SelectableTextView extends AppCompatTextView {
    public SelectableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.messages.views.widgets.SelectableTextView, android.view.View] */
    public final void onAttachedToWindow() {
        SelectableTextView.super.onAttachedToWindow();
        setEnabled(false);
        setEnabled(true);
    }
}
