package ru.ok.messages.media.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class MediaViewPager extends ViewPager {
    public float r1;

    public MediaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.messages.media.chat.MediaViewPager, androidx.viewpager.widget.ViewPager, android.view.View] */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.r1 = motionEvent.getX();
        } else if (motionEvent.getAction() == 2 && !xy6.w(this) && this.r1 < motionEvent.getX() && getCurrentItem() == 0) {
            return false;
        }
        return MediaViewPager.super.onInterceptTouchEvent(motionEvent);
    }
}
