package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/messages/video/widgets/VideoPlayerSeekBar;", "Lqn;", "", "color", "Ljue;", "setProgressColor", "(I)V", "setThumbColor", "", "seekBarEnable", "setSeekBarEnable", "(Z)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class VideoPlayerSeekBar extends qn {
    public boolean b;

    public VideoPlayerSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return VideoPlayerSeekBar.super.onTouchEvent(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    public final void setProgressColor(int i) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void setSeekBarEnable(boolean z) {
        this.b = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.AbsSeekBar] */
    public final void setThumbColor(int i) {
        Drawable thumb = getThumb();
        if (thumb != null) {
            thumb.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.AbsSeekBar] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VideoPlayerSeekBar(android.content.Context r1, android.util.AttributeSet r2, int r3) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            int r3 = ylb.seekBarStyle
            r0.<init>(r1, r2, r3)
            if (r2 == 0) goto L_0x001e
            int[] r3 = defpackage.zvb.VideoPlayerSeekBar
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3)
            int r2 = defpackage.zvb.VideoPlayerSeekBar_seekBarEnable
            r3 = 1
            boolean r2 = r1.getBoolean(r2, r3)
            r0.b = r2
            r1.recycle()
        L_0x001e:
            r1 = -1
            r0.setProgressColor(r1)
            r0.setThumbColor(r1)
            android.graphics.drawable.Drawable r1 = r0.getThumb()
            if (r1 == 0) goto L_0x003a
            boolean r2 = r0.b
            if (r2 != 0) goto L_0x003a
            android.graphics.drawable.Drawable r1 = r1.mutate()
            r2 = 0
            r1.setAlpha(r2)
            r0.setSplitTrack(r2)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.VideoPlayerSeekBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
