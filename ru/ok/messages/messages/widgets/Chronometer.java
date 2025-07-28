package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Formatter;
import java.util.Locale;

public class Chronometer extends AppCompatTextView {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public String D0;
    public Formatter E0;
    public Locale F0;
    public final Object[] G0 = new Object[1];
    public StringBuilder H0;
    public final StringBuilder I0 = new StringBuilder(8);
    public boolean J0;
    public final re K0 = new re(11, this);
    public long y0;
    public boolean z0;

    public Chronometer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zvb.Chronometer, 0, 0);
        setFormat(obtainStyledAttributes.getString(zvb.Chronometer_format));
        setCountDown(obtainStyledAttributes.getBoolean(zvb.Chronometer_countDown, false));
        obtainStyledAttributes.recycle();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.y0 = elapsedRealtime;
        k(elapsedRealtime);
    }

    public CharSequence getAccessibilityClassName() {
        return Chronometer.class.getName();
    }

    public long getBase() {
        return this.y0;
    }

    public String getFormat() {
        return this.D0;
    }

    public wx2 getOnChronometerTickListener() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ru.ok.messages.messages.widgets.Chronometer, android.view.View] */
    public final void j() {
        boolean z = this.z0 && this.A0 && isShown();
        if (z != this.B0) {
            re reVar = this.K0;
            if (z) {
                k(SystemClock.elapsedRealtime());
                postDelayed(reVar, 1000);
            } else {
                removeCallbacks(reVar);
            }
            this.B0 = z;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.messages.messages.widgets.Chronometer, android.widget.TextView] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|(1:24)) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r2.C0 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r2.C0 = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void k(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.J0     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x000b
            long r0 = r2.y0     // Catch:{ all -> 0x0009 }
            long r0 = r0 - r3
            goto L_0x000f
        L_0x0009:
            r3 = move-exception
            goto L_0x0064
        L_0x000b:
            long r0 = r2.y0     // Catch:{ all -> 0x0009 }
            long r0 = r3 - r0
        L_0x000f:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0019
            long r0 = -r0
        L_0x0019:
            java.lang.StringBuilder r3 = r2.I0     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = android.text.format.DateUtils.formatElapsedTime(r3, r0)     // Catch:{ all -> 0x0009 }
            java.lang.String r4 = r2.D0     // Catch:{ all -> 0x0009 }
            if (r4 == 0) goto L_0x005f
            java.util.Locale$Category r4 = java.util.Locale.Category.DISPLAY     // Catch:{ all -> 0x0009 }
            java.util.Locale r4 = java.util.Locale.getDefault(r4)     // Catch:{ all -> 0x0009 }
            java.util.Formatter r0 = r2.E0     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x0035
            java.util.Locale r0 = r2.F0     // Catch:{ all -> 0x0009 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0009 }
            if (r0 != 0) goto L_0x0040
        L_0x0035:
            r2.F0 = r4     // Catch:{ all -> 0x0009 }
            java.util.Formatter r0 = new java.util.Formatter     // Catch:{ all -> 0x0009 }
            java.lang.StringBuilder r1 = r2.H0     // Catch:{ all -> 0x0009 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0009 }
            r2.E0 = r0     // Catch:{ all -> 0x0009 }
        L_0x0040:
            java.lang.StringBuilder r4 = r2.H0     // Catch:{ all -> 0x0009 }
            r0 = 0
            r4.setLength(r0)     // Catch:{ all -> 0x0009 }
            java.lang.Object[] r4 = r2.G0     // Catch:{ all -> 0x0009 }
            r4[r0] = r3     // Catch:{ all -> 0x0009 }
            java.util.Formatter r0 = r2.E0     // Catch:{ IllegalFormatException -> 0x0058 }
            java.lang.String r1 = r2.D0     // Catch:{ IllegalFormatException -> 0x0058 }
            r0.format(r1, r4)     // Catch:{ IllegalFormatException -> 0x0058 }
            java.lang.StringBuilder r4 = r2.H0     // Catch:{ IllegalFormatException -> 0x0058 }
            java.lang.String r3 = r4.toString()     // Catch:{ IllegalFormatException -> 0x0058 }
            goto L_0x005f
        L_0x0058:
            boolean r4 = r2.C0     // Catch:{ all -> 0x0009 }
            if (r4 != 0) goto L_0x005f
            r4 = 1
            r2.C0 = r4     // Catch:{ all -> 0x0009 }
        L_0x005f:
            r2.setText(r3)     // Catch:{ all -> 0x0009 }
            monitor-exit(r2)
            return
        L_0x0064:
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.messages.widgets.Chronometer.k(long):void");
    }

    public final void onDetachedFromWindow() {
        Chronometer.super.onDetachedFromWindow();
        this.z0 = false;
        j();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.messages.widgets.Chronometer, android.view.View] */
    public final void onVisibilityChanged(View view, int i) {
        Chronometer.super.onVisibilityChanged(view, i);
        j();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.messages.widgets.Chronometer, android.view.View] */
    public final void onWindowVisibilityChanged(int i) {
        Chronometer.super.onWindowVisibilityChanged(i);
        this.z0 = i == 0;
        j();
    }

    public void setBase(long j) {
        this.y0 = j;
        k(SystemClock.elapsedRealtime());
    }

    public void setCountDown(boolean z) {
        this.J0 = z;
        k(SystemClock.elapsedRealtime());
    }

    public void setFormat(String str) {
        this.D0 = str;
        if (str != null && this.H0 == null) {
            this.H0 = new StringBuilder(str.length() * 2);
        }
    }

    public void setOnChronometerTickListener(wx2 wx2) {
    }

    public void setStarted(boolean z) {
        this.A0 = z;
        j();
    }
}
