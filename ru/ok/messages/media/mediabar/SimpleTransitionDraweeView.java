package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;

public class SimpleTransitionDraweeView extends SimpleDraweeView {
    public SimpleTransitionDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.ImageView, android.view.View, ru.ok.messages.media.mediabar.SimpleTransitionDraweeView] */
    public final void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            getDrawable().setBounds(0, 0, getWidth(), getHeight());
        }
        SimpleTransitionDraweeView.super.onDraw(canvas);
    }
}
