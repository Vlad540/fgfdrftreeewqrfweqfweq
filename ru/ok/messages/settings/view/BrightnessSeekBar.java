package ru.ok.messages.settings.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;

public class BrightnessSeekBar extends qn {
    public static final /* synthetic */ int y0 = 0;
    public final zg4 b;
    public final int c;
    public final GradientDrawable o;
    public float w0 = -1.0f;
    public ValueAnimator x0;

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.messages.settings.view.BrightnessSeekBar, android.view.View] */
    public BrightnessSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        zg4 b2 = zg4.b();
        this.b = b2;
        this.c = b2.e;
        Context context2 = getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context2);
        this.o = swb.H(Integer.valueOf(E.m), Integer.valueOf(n1g.c0(E.k, 0.5f)), Integer.valueOf(this.b.b));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [ru.ok.messages.settings.view.BrightnessSeekBar, android.widget.AbsSeekBar, android.view.View, qn] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0062, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            ru.ok.messages.settings.view.BrightnessSeekBar.super.onDraw(r7)     // Catch:{ all -> 0x005f }
            float r0 = r6.w0     // Catch:{ all -> 0x005f }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            android.graphics.drawable.GradientDrawable r0 = r6.o     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0011
            goto L_0x0061
        L_0x0011:
            int r0 = r6.getMeasuredWidth()     // Catch:{ all -> 0x005f }
            int r1 = r6.getPaddingLeft()     // Catch:{ all -> 0x005f }
            int r0 = r0 - r1
            int r1 = r6.getPaddingRight()     // Catch:{ all -> 0x005f }
            int r0 = r0 - r1
            float r0 = (float) r0     // Catch:{ all -> 0x005f }
            float r1 = r6.w0     // Catch:{ all -> 0x005f }
            float r0 = r0 * r1
            int r0 = (int) r0     // Catch:{ all -> 0x005f }
            android.graphics.drawable.Drawable r1 = r6.getThumb()     // Catch:{ all -> 0x005f }
            android.graphics.Rect r1 = r1.getBounds()     // Catch:{ all -> 0x005f }
            android.graphics.drawable.GradientDrawable r2 = r6.o     // Catch:{ all -> 0x005f }
            int r3 = r6.c     // Catch:{ all -> 0x005f }
            int r3 = r0 - r3
            int r4 = r1.centerY()     // Catch:{ all -> 0x005f }
            int r5 = r6.c     // Catch:{ all -> 0x005f }
            int r4 = r4 - r5
            int r0 = r0 + r5
            int r1 = r1.centerY()     // Catch:{ all -> 0x005f }
            int r5 = r6.c     // Catch:{ all -> 0x005f }
            int r1 = r1 + r5
            r2.setBounds(r3, r4, r0, r1)     // Catch:{ all -> 0x005f }
            int r0 = r7.save()     // Catch:{ all -> 0x005f }
            int r1 = r6.getPaddingLeft()     // Catch:{ all -> 0x005f }
            float r1 = (float) r1     // Catch:{ all -> 0x005f }
            int r2 = r6.getPaddingTop()     // Catch:{ all -> 0x005f }
            float r2 = (float) r2     // Catch:{ all -> 0x005f }
            r7.translate(r1, r2)     // Catch:{ all -> 0x005f }
            android.graphics.drawable.GradientDrawable r1 = r6.o     // Catch:{ all -> 0x005f }
            r1.draw(r7)     // Catch:{ all -> 0x005f }
            r7.restoreToCount(r0)     // Catch:{ all -> 0x005f }
            monitor-exit(r6)
            return
        L_0x005f:
            r7 = move-exception
            goto L_0x0063
        L_0x0061:
            monitor-exit(r6)
            return
        L_0x0063:
            monitor-exit(r6)     // Catch:{ all -> 0x005f }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.settings.view.BrightnessSeekBar.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ru.ok.messages.settings.view.BrightnessSeekBar, android.view.View, java.lang.Object] */
    public void setBrightnessThumbProgress(float f) {
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.x0.cancel();
        }
        float f2 = this.w0;
        if (f2 == -1.0f) {
            this.w0 = f;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{f2, f}).setDuration(500);
        this.x0 = duration;
        duration.addUpdateListener(new c00(3, this));
        this.x0.start();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.settings.view.BrightnessSeekBar, android.widget.ProgressBar] */
    public synchronized void setProgress(int i) {
        BrightnessSeekBar.super.setProgress(i);
    }
}
