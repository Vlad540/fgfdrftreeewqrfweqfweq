package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class LiveVideoPlaceHolderView extends ConstraintLayout implements xhe {
    public w6a K0;
    public i03 L0;
    public AppCompatTextView M0;
    public AppCompatTextView N0;
    public GradientDrawable O0;
    public n10 P0;

    public LiveVideoPlaceHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    public final void c() {
        this.O0.setColor(getContext().getResources().getColor(xhc.c));
        this.M0.setTextColor(-1);
        this.N0.setTextColor(-1);
    }

    public void setCorners(float[] fArr) {
        this.O0.setCornerRadii(fArr);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View, android.view.ViewGroup] */
    public final void w() {
        this.K0 = (w6a) vl.b().getAccessor().c(w6a.class);
        this.L0 = vl.b().n().a;
        getContext();
        zg4 b = zg4.b();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.O0 = gradientDrawable;
        setBackground(gradientDrawable);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.M0 = appCompatTextView;
        appCompatTextView.setId(yqb.view_not_started_live_video__title);
        this.M0.setGravity(17);
        this.M0.setTextSize(0, b.J);
        this.M0.setText(getResources().getText(cic.Z2));
        re3 re3 = new re3(0, -2);
        re3.i = 0;
        re3.t = 0;
        re3.v = 0;
        re3.k = yqb.view_not_started_live_video__subtitle;
        re3.K = 2;
        int i = b.e;
        re3.leftMargin = i;
        re3.rightMargin = i;
        addView(this.M0, re3);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.N0 = appCompatTextView2;
        appCompatTextView2.setId(yqb.view_not_started_live_video__subtitle);
        this.N0.setGravity(17);
        this.N0.setTextSize(0, b.J);
        this.N0.setTypeface((Typeface) null, 1);
        re3 re32 = new re3(0, -2);
        re32.j = yqb.view_not_started_live_video__title;
        re32.t = 0;
        re32.v = 0;
        re32.l = 0;
        int i2 = b.e;
        re32.leftMargin = i2;
        re32.rightMargin = i2;
        addView(this.N0, re32);
        c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r12 = this;
            n10 r0 = r12.P0
            if (r0 == 0) goto L_0x0093
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x0093
            i03 r1 = r12.L0
            long r1 = r1.m()
            long r3 = r0.k
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0016
            goto L_0x0093
        L_0x0016:
            w6a r0 = r12.K0
            n10 r1 = r12.P0
            long r1 = r1.k
            i03 r3 = r0.c
            long r4 = r3.m()
            java.util.Locale r3 = r3.u()
            java.lang.String[] r6 = defpackage.dhe.b
            long r1 = r1 - r4
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0032
            java.lang.String r0 = "0:00:00"
            goto L_0x0082
        L_0x0032:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r4.toHours(r1)
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 * r4
            long r6 = r1 - r6
            r8 = 60000(0xea60, double:2.9644E-319)
            long r10 = r6 / r8
            long r8 = r8 * r10
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0066
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "%d:%02d:%02d"
            java.lang.String r0 = java.lang.String.format(r3, r1, r0)
            goto L_0x0082
        L_0x0066:
            r1 = 24
            long r6 = r4 / r1
            long r1 = r1 * r6
            long r4 = r4 - r1
            int r1 = (int) r6
            int r2 = defpackage.fsb.tt_dates_days
            android.content.Context r0 = r0.a
            java.lang.String r1 = xs7.r(r2, r1, r0)
            int r2 = (int) r4
            int r3 = defpackage.fsb.tt_dates_hours
            java.lang.String r0 = xs7.r(r3, r2, r0)
            java.lang.String r2 = " "
            java.lang.String r0 = defpackage.me4.i(r1, r2, r0)
        L_0x0082:
            androidx.appcompat.widget.AppCompatTextView r1 = r12.N0
            r1.setText(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = r12.M0
            r1 = 0
            r0.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r12.N0
            r0.setVisibility(r1)
            goto L_0x009f
        L_0x0093:
            androidx.appcompat.widget.AppCompatTextView r0 = r12.M0
            r1 = 8
            r0.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r12.N0
            r0.setVisibility(r1)
        L_0x009f:
            n10 r0 = r12.P0
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = r0.d
            boolean r0 = r1g.p(r0)
            if (r0 == 0) goto L_0x00b3
            android.graphics.drawable.GradientDrawable r12 = r12.O0
            r0 = 255(0xff, float:3.57E-43)
            r12.setAlpha(r0)
            goto L_0x00ba
        L_0x00b3:
            android.graphics.drawable.GradientDrawable r12 = r12.O0
            r0 = 127(0x7f, float:1.78E-43)
            r12.setAlpha(r0)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.LiveVideoPlaceHolderView.x():void");
    }
}
