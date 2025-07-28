package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: p32  reason: default package */
public final class p32 extends ViewGroup implements mhe {
    public final t97 A0 = ez3.O(3, new n32(this, 1));
    public final t97 B0 = ez3.O(3, new n32(this, 2));
    public final t97 C0;
    public final t97 D0;
    public final View E0;
    public final View F0;
    public final View G0;
    public final BitSet H0;
    public final BitSet I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public final int Q0;
    public final int R0;
    public boolean S0;
    public final re T0;
    public long U0;
    public final kte V0;
    public final mz9 a;
    public final TextView b;
    public final dt4 c;
    public final dt4 o;
    public final TextView w0;
    public final np9 x0;
    public final View y0;
    public final t97 z0 = ez3.O(3, new n32(this, 0));

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p32(android.content.Context r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r3)
            mz9 r2 = new mz9
            r2.<init>(r1)
            r2.setFocusable(r3)
            r0.a = r2
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            nge r5 = defpackage.nte.F
            r5.b(r4, defpackage.yq4.b)
            s59 r5 = km4.y0
            pda r6 = r5.r(r4)
            cfe r6 = r6.getText()
            int r6 = r6.e
            r4.setTextColor(r6)
            r4.setSingleLine()
            r4.setFallbackLineSpacing(r3)
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r6)
            r4.setFocusable(r3)
            r0.b = r4
            dt4 r7 = new dt4
            r7.<init>(r1)
            nge r8 = defpackage.nte.H
            r8.b(r7, defpackage.yq4.b)
            pda r9 = r5.r(r7)
            cfe r9 = r9.getText()
            int r9 = r9.f
            r7.setTextColor(r9)
            r9 = 2
            r7.setMaxLines(r9)
            r7.setFallbackLineSpacing(r3)
            r7.setEllipsize(r6)
            r7.setFocusable(r3)
            fja.d(r7)
            r0.c = r7
            dt4 r10 = new dt4
            r10.<init>(r1)
            r8.b(r10, defpackage.yq4.b)
            pda r8 = r5.r(r10)
            cfe r8 = r8.getText()
            int r8 = r8.f
            r10.setTextColor(r8)
            r10.setFallbackLineSpacing(r3)
            r10.setMaxLines(r9)
            r10.setEllipsize(r6)
            r10.setFocusable(r3)
            r0.o = r10
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r1)
            nge r8 = defpackage.nte.G
            r8.b(r6, defpackage.yq4.b)
            r6.setFallbackLineSpacing(r3)
            pda r8 = r5.r(r6)
            cfe r8 = r8.getText()
            int r8 = r8.h
            r6.setTextColor(r8)
            r6.setFocusable(r3)
            r0.w0 = r6
            np9 r8 = new np9
            r8.<init>(r1)
            r8.setFocusable(r3)
            r0.x0 = r8
            android.view.View r11 = new android.view.View
            r11.<init>(r1)
            r11.setFocusable(r3)
            r0.y0 = r11
            n32 r12 = new n32
            r13 = 0
            r12.<init>(r0, r13)
            r13 = 3
            t97 r12 = ez3.O(r13, r12)
            r0.z0 = r12
            n32 r12 = new n32
            r14 = 1
            r12.<init>(r0, r14)
            t97 r12 = ez3.O(r13, r12)
            r0.A0 = r12
            n32 r12 = new n32
            r14 = 2
            r12.<init>(r0, r14)
            t97 r12 = ez3.O(r13, r12)
            r0.B0 = r12
            x2 r12 = new x2
            r14 = 18
            r12.<init>(r1, r14, r0)
            t97 r12 = ez3.O(r13, r12)
            r0.C0 = r12
            n32 r12 = new n32
            r14 = 3
            r12.<init>(r0, r14)
            t97 r12 = ez3.O(r13, r12)
            r0.D0 = r12
            android.view.View r12 = new android.view.View
            r12.<init>(r1)
            int r14 = defpackage.phc.C1
            android.content.Context r15 = r12.getContext()
            android.graphics.drawable.Drawable r14 = gq3.b(r15, r14)
            pda r15 = r5.r(r12)
            yn6 r15 = r15.getIcon()
            int r15 = r15.g
            js.D(r14, r15)
            r12.setBackground(r14)
            r12.setFocusable(r3)
            r0.E0 = r12
            android.view.View r14 = new android.view.View
            r14.<init>(r1)
            int r15 = defpackage.phc.s1
            android.content.Context r13 = r14.getContext()
            android.graphics.drawable.Drawable r13 = gq3.b(r13, r15)
            pda r15 = r5.r(r14)
            yn6 r15 = r15.getIcon()
            int r15 = r15.g
            js.D(r13, r15)
            r14.setBackground(r13)
            r14.setFocusable(r3)
            r0.F0 = r14
            android.view.View r13 = new android.view.View
            r13.<init>(r1)
            android.graphics.drawable.ColorDrawable r15 = new android.graphics.drawable.ColorDrawable
            r9 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15.<init>(r9)
            r13.setBackground(r15)
            r13.setFocusable(r3)
            r0.G0 = r13
            java.util.BitSet r9 = new java.util.BitSet
            r15 = 8
            r9.<init>(r15)
            r0.H0 = r9
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>(r15)
            r0.I0 = r3
            r15 = 1
            r0.J0 = r15
            r15 = 2
            r0.K0 = r15
            r15 = 3
            r0.L0 = r15
            r15 = 4
            r0.M0 = r15
            r15 = 5
            r0.N0 = r15
            r15 = 6
            r0.O0 = r15
            r15 = 7
            r0.P0 = r15
            r15 = 8
            r0.Q0 = r15
            r15 = 9
            r0.R0 = r15
            re r15 = new re
            r16 = r3
            r3 = 8
            r15.<init>(r3, r0)
            r0.T0 = r15
            kte r3 = new kte
            km4 r1 = r5.n(r1)
            pda r1 = r1.g()
            hd1 r5 = new hd1
            r15 = 5
            r5.<init>(r15)
            r3.<init>(r1, r5)
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = a24.X(r1)
            r5 = 0
            r3.setBounds(r5, r5, r1, r1)
            r3.setCallback(r0)
            r0.V0 = r3
            android.graphics.drawable.RippleDrawable r1 = r17.getRippleDrawable()
            r0.setBackground(r1)
            r0.addView(r2)
            r1 = -1
            r2 = -2
            r0.addView(r4, r1, r2)
            r0.addView(r7, r1, r2)
            r0.addView(r10, r1, r2)
            r0.addView(r6)
            r0.addView(r14)
            r0.addView(r8)
            r0.addView(r11)
            r0.addView(r12)
            r0.addView(r13)
            r1 = 6
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = a24.X(r2)
            r3 = 10
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r4 = a24.X(r4)
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = a24.X(r1)
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = a24.X(r3)
            r0.setPadding(r2, r4, r1, r3)
            int r0 = r9.size()
            r1 = 0
            r2 = 1
            r9.set(r1, r0, r2)
            int r0 = r16.size()
            r2 = r16
            r2.set(r1, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p32.<init>(android.content.Context):void");
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.D0.getValue();
    }

    public final boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        dt4 dt4 = this.c;
        return dt4.getPaint().measureText(str) > ((float) dt4.getMeasuredWidth());
    }

    public final boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        TextView textView = this.b;
        return textView.getPaint().measureText(str) > ((float) textView.getMeasuredWidth());
    }

    public final void c(BitSet bitSet, boolean z) {
        bitSet.set(0, z);
    }

    public final void d(CharSequence charSequence, Long l) {
        mz9 mz9 = this.a;
        mz9.setAvatarUrl((String) null);
        boolean z = true;
        mz9.g(new ub0(charSequence == null ? "" : charSequence, l.longValue()), true);
        this.H0.set(0, true);
        if (charSequence == null || h0e.c0(charSequence)) {
            z = false;
        }
        this.I0.set(0, z);
        requestLayout();
    }

    public final void e(BitSet bitSet, boolean z) {
        bitSet.set(this.M0, z);
    }

    public final void f(int i, boolean z) {
        np9 np9 = this.x0;
        mp9 mp9 = np9.o;
        int i2 = mp9.a;
        mp9 a2 = mp9.a(mp9, i, false, false, false, 14);
        np9.o = a2;
        boolean z2 = false;
        if (i2 != i) {
            BitSet bitSet = np9.w0;
            int i3 = np9.y0;
            boolean z3 = z && bitSet.get(i3);
            t3a t3a = np9.B0;
            t3a.g(a2.a, z3);
            t3a.setAppearance(a2.d ? o3a.c : o3a.a);
            bitSet.set(i3, a2.e);
            np9.requestLayout();
        }
        BitSet bitSet2 = this.I0;
        int i4 = this.M0;
        if (bitSet2.get(i4) || i > 0) {
            z2 = true;
        }
        bitSet2.set(i4, z2);
        e(this.H0, true);
        requestLayout();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(km4.y0.r(this));
        if (this.o.getVisibility() == 0) {
            this.V0.start();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        BitSet bitSet = this.H0;
        bitSet.set(0, bitSet.size(), true);
        requestLayout();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V0.stop();
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        dt4 dt4 = this.o;
        if (dt4.getVisibility() == 0) {
            Rect bottomLineRect = dt4.getBottomLineRect();
            if (!bottomLineRect.isEmpty()) {
                bottomLineRect.offset(dt4.getLeft(), dt4.getTop());
                kte kte = this.V0;
                int save = canvas.save();
                canvas.translate(((float) bottomLineRect.right) - ((float) kte.getBounds().width()), (float) bottomLineRect.top);
                try {
                    kte.draw(canvas);
                    canvas.restoreToCount(save);
                    kte.start();
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int i6;
        int i7;
        float measuredHeight = ((float) (getMeasuredHeight() - (getPaddingBottom() + getPaddingTop()))) / 2.0f;
        mz9 mz9 = this.a;
        int paddingTop = (int) ((measuredHeight + ((float) getPaddingTop())) - (((float) mz9.getMeasuredWidth()) / 2.0f));
        BitSet bitSet = this.I0;
        int i8 = 0;
        if (bitSet.get(0)) {
            xy6.z(getPaddingStart(), paddingTop, getPaddingStart() + mz9.getMeasuredWidth(), mz9.getMeasuredHeight() + paddingTop, this.a, this);
        }
        float f = (float) 12;
        int c2 = me4.c(f, dh4.c().getDisplayMetrics().density, mz9.getMeasuredWidth() + getPaddingStart());
        boolean z2 = bitSet.get(this.J0);
        TextView textView = this.b;
        if (z2) {
            xy6.z(c2, getPaddingTop(), textView.getMeasuredWidth() + c2, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        }
        float measuredHeight2 = ((float) textView.getMeasuredHeight()) / 2.0f;
        View view = this.F0;
        int top = (int) ((measuredHeight2 + ((float) textView.getTop())) - (((float) view.getMeasuredHeight()) / 2.0f));
        if (bitSet.get(this.P0)) {
            if (z2) {
                i7 = me4.c((float) 4, dh4.c().getDisplayMetrics().density, textView.getMeasuredWidth());
            } else {
                i7 = 0;
            }
            int i9 = i7 + c2;
            if (z2) {
                i8 = me4.c((float) 4, dh4.c().getDisplayMetrics().density, textView.getMeasuredWidth());
            }
            xy6.z(i9, top, view.getMeasuredWidth() + c2 + i8, view.getMeasuredHeight() + top, view, this);
        }
        int c3 = me4.c(f, dh4.c().getDisplayMetrics().density, mz9.getMeasuredWidth() + getPaddingStart());
        float f2 = (float) 2;
        int c4 = me4.c(f2, dh4.c().getDisplayMetrics().density, textView.getBottom());
        if (bitSet.get(this.K0)) {
            dt4 dt4 = this.c;
            xy6.z(c3, c4, dt4.getMeasuredWidth() + c3, this.c.getMeasuredHeight() + c4, dt4, this);
        }
        if (bitSet.get(this.R0)) {
            dt4 dt42 = this.o;
            xy6.z(c3, c4, dt42.getMeasuredWidth() + c3, this.o.getMeasuredHeight() + c4, dt42, this);
        }
        int measuredWidth2 = getMeasuredWidth() - getPaddingEnd();
        float measuredHeight3 = ((float) textView.getMeasuredHeight()) / 2.0f;
        View view2 = this.E0;
        int top2 = (int) ((measuredHeight3 + ((float) textView.getTop())) - (((float) view2.getMeasuredHeight()) / 2.0f));
        int i10 = this.O0;
        if (bitSet.get(i10)) {
            xy6.z(measuredWidth2 - view2.getMeasuredWidth(), top2, measuredWidth2, view2.getMeasuredHeight() + top2, view2, this);
        }
        if (bitSet.get(i10)) {
            measuredWidth = me4.p((float) 4, dh4.c().getDisplayMetrics().density, measuredWidth2 - view2.getMeasuredWidth());
        } else {
            measuredWidth = getMeasuredWidth() - getPaddingEnd();
        }
        int i11 = measuredWidth;
        float measuredHeight4 = ((float) textView.getMeasuredHeight()) / 2.0f;
        TextView textView2 = this.w0;
        int top3 = (int) ((measuredHeight4 + ((float) textView.getTop())) - (((float) textView2.getMeasuredHeight()) / 2.0f));
        int i12 = this.L0;
        if (bitSet.get(i12)) {
            xy6.z(i11 - textView2.getMeasuredWidth(), top3, i11, textView2.getMeasuredHeight() + top3, textView2, this);
        }
        if (bitSet.get(i12)) {
            i5 = me4.p(f2, dh4.c().getDisplayMetrics().density, i11 - textView2.getMeasuredWidth());
        } else {
            i5 = i11;
        }
        float measuredHeight5 = ((float) textView.getMeasuredHeight()) / 2.0f;
        View view3 = this.y0;
        int top4 = (int) ((measuredHeight5 + ((float) textView.getTop())) - (((float) view3.getMeasuredHeight()) / 2.0f));
        if (bitSet.get(this.N0)) {
            xy6.z(i5 - view3.getMeasuredWidth(), top4, i5, view3.getMeasuredHeight() + top4, view3, this);
        }
        int measuredWidth3 = getMeasuredWidth() - getPaddingEnd();
        int i13 = this.M0;
        boolean z3 = bitSet.get(i13);
        np9 np9 = this.x0;
        if (z3) {
            int p = me4.p((float) 1, dh4.c().getDisplayMetrics().density, c4);
            np9 np92 = this.x0;
            xy6.z(measuredWidth3 - np92.getMeasuredWidth(), p, measuredWidth3, np9.getMeasuredHeight() + p, np92, this);
        }
        if (bitSet.get(i13)) {
            i6 = me4.p((float) 4, dh4.c().getDisplayMetrics().density, measuredWidth3 - np9.getMeasuredWidth());
        } else {
            i6 = measuredWidth3;
        }
        if (bitSet.get(this.Q0)) {
            View view4 = this.G0;
            xy6.z(i6 - view4.getMeasuredWidth(), c4, i6, view4.getMeasuredHeight() + c4, view4, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x044f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            android.widget.TextView r3 = r0.b
            boolean r4 = defpackage.tge.c(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0012
            r0.setVerified(r5)
        L_0x0012:
            java.util.BitSet r4 = r0.I0
            r6 = 0
            boolean r7 = r4.get(r6)
            if (r7 == 0) goto L_0x001d
            r7 = r6
            goto L_0x001f
        L_0x001d:
            r7 = 8
        L_0x001f:
            mz9 r9 = r0.a
            r9.setVisibility(r7)
            int r7 = r0.J0
            boolean r10 = r4.get(r7)
            if (r10 == 0) goto L_0x002e
            r10 = r6
            goto L_0x0030
        L_0x002e:
            r10 = 8
        L_0x0030:
            r3.setVisibility(r10)
            int r10 = r0.R0
            boolean r11 = r4.get(r10)
            if (r11 == 0) goto L_0x003d
            r11 = r6
            goto L_0x003f
        L_0x003d:
            r11 = 8
        L_0x003f:
            dt4 r12 = r0.o
            r12.setVisibility(r11)
            int r11 = r0.K0
            boolean r13 = r4.get(r11)
            if (r13 == 0) goto L_0x004e
            r13 = r6
            goto L_0x0050
        L_0x004e:
            r13 = 8
        L_0x0050:
            dt4 r14 = r0.c
            r14.setVisibility(r13)
            android.widget.TextView r13 = r0.w0
            int r15 = r0.L0
            boolean r16 = r4.get(r15)
            if (r16 == 0) goto L_0x0061
            r8 = r6
            goto L_0x0063
        L_0x0061:
            r8 = 8
        L_0x0063:
            r13.setVisibility(r8)
            android.view.View r8 = r0.F0
            int r5 = r0.P0
            boolean r17 = r4.get(r5)
            if (r17 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r6 = 8
        L_0x0073:
            r8.setVisibility(r6)
            int r6 = r0.M0
            boolean r18 = r4.get(r6)
            r19 = r11
            if (r18 == 0) goto L_0x0084
            r18 = r12
            r12 = 0
            goto L_0x0088
        L_0x0084:
            r18 = r12
            r12 = 8
        L_0x0088:
            np9 r11 = r0.x0
            r11.setVisibility(r12)
            android.view.View r12 = r0.y0
            r20 = r14
            int r14 = r0.N0
            boolean r21 = r4.get(r14)
            if (r21 == 0) goto L_0x009d
            r21 = r11
            r11 = 0
            goto L_0x00a1
        L_0x009d:
            r21 = r11
            r11 = 8
        L_0x00a1:
            r12.setVisibility(r11)
            android.view.View r11 = r0.E0
            r22 = r6
            int r6 = r0.O0
            boolean r23 = r4.get(r6)
            if (r23 == 0) goto L_0x00b4
            r23 = r3
            r3 = 0
            goto L_0x00b8
        L_0x00b4:
            r23 = r3
            r3 = 8
        L_0x00b8:
            r11.setVisibility(r3)
            android.view.View r3 = r0.G0
            r24 = r7
            int r7 = r0.Q0
            boolean r25 = r4.get(r7)
            if (r25 == 0) goto L_0x00cb
            r25 = r7
            r7 = 0
            goto L_0x00cf
        L_0x00cb:
            r25 = r7
            r7 = 8
        L_0x00cf:
            r3.setVisibility(r7)
            boolean r7 = r4.get(r10)
            r16 = r10
            kte r10 = r0.V0
            if (r7 == 0) goto L_0x00e1
            r10.start()
        L_0x00df:
            r10 = r8
            goto L_0x00e5
        L_0x00e1:
            r10.stop()
            goto L_0x00df
        L_0x00e5:
            long r7 = r0.U0
            r26 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r29 = r10
            r28 = r11
            long r10 = r7 & r26
            int r10 = (int) r10
            java.util.BitSet r11 = r0.H0
            r26 = 32
            if (r10 != r1) goto L_0x00fe
            long r7 = r7 << r26
            int r7 = (int) r7
            if (r7 == r2) goto L_0x0107
        L_0x00fe:
            int r7 = r11.size()
            r8 = 1
            r10 = 0
            r11.set(r10, r7, r8)
        L_0x0107:
            long r7 = (long) r1
            long r1 = (long) r2
            long r1 = r1 << r26
            long r1 = r1 | r7
            r0.U0 = r1
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            if (r1 != 0) goto L_0x0116
            r8 = 1
            goto L_0x0117
        L_0x0116:
            r8 = 0
        L_0x0117:
            if (r8 == 0) goto L_0x0128
            android.content.Context r1 = r30.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            goto L_0x012c
        L_0x0128:
            int r1 = android.view.View.MeasureSpec.getSize(r31)
        L_0x012c:
            r2 = 54
            float r2 = (float) r2
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r2 = r2 * r7
            int r2 = a24.X(r2)
            int r7 = r30.getPaddingStart()
            int r7 = r1 - r7
            int r10 = r30.getPaddingEnd()
            int r7 = r7 - r10
            int r10 = r30.getPaddingStart()
            int r10 = r1 - r10
            int r26 = r30.getPaddingEnd()
            int r10 = r10 - r26
            r32 = r1
            r1 = 0
            boolean r17 = r4.get(r1)
            r26 = r8
            r8 = 1073741824(0x40000000, float:2.0)
            if (r17 == 0) goto L_0x0173
            boolean r27 = r11.get(r1)
            if (r27 == 0) goto L_0x0173
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            r9.measure(r1, r2)
        L_0x0173:
            int r1 = r9.getMeasuredWidth()
            r2 = 12
            float r2 = (float) r2
            android.content.res.Resources r27 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r27.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r2
            int r8 = a24.X(r8)
            int r8 = r8 + r1
            int r7 = r7 - r8
            int r1 = r9.getMeasuredWidth()
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r2
            int r8 = a24.X(r8)
            int r8 = r8 + r1
            int r10 = r10 - r8
            boolean r1 = r4.get(r15)
            if (r1 == 0) goto L_0x01aa
            r1 = 0
            r13.measure(r1, r1)
        L_0x01aa:
            int r1 = r13.getMeasuredWidth()
            int r7 = r7 - r1
            boolean r1 = r4.get(r14)
            r8 = 16
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01e9
            boolean r1 = r11.get(r14)
            if (r1 == 0) goto L_0x01e9
            float r1 = (float) r8
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r1
            int r13 = a24.X(r13)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r9)
            android.content.res.Resources r27 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r27.getDisplayMetrics()
            float r8 = r8.density
            float r1 = r1 * r8
            int r1 = a24.X(r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r12.measure(r13, r1)
        L_0x01e9:
            boolean r1 = r4.get(r14)
            if (r1 == 0) goto L_0x01f4
            int r1 = r12.getMeasuredWidth()
            int r7 = r7 - r1
        L_0x01f4:
            boolean r1 = r4.get(r14)
            r8 = 2
            if (r1 == 0) goto L_0x0210
            boolean r1 = r4.get(r15)
            if (r1 == 0) goto L_0x0210
            float r1 = (float) r8
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            int r7 = defpackage.me4.p(r1, r12, r7)
        L_0x0210:
            boolean r1 = r4.get(r6)
            if (r1 == 0) goto L_0x024b
            boolean r1 = r11.get(r6)
            if (r1 == 0) goto L_0x024b
            r1 = 16
            float r12 = (float) r1
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r12
            int r1 = a24.X(r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r12 = r12 * r13
            int r12 = a24.X(r12)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            r13 = r28
            r13.measure(r1, r12)
            goto L_0x024d
        L_0x024b:
            r13 = r28
        L_0x024d:
            boolean r1 = r4.get(r6)
            r12 = 4
            if (r1 == 0) goto L_0x0274
            int r1 = r13.getMeasuredWidth()
            int r7 = r7 - r1
            boolean r1 = r4.get(r15)
            if (r1 != 0) goto L_0x0265
            boolean r1 = r4.get(r14)
            if (r1 == 0) goto L_0x0274
        L_0x0265:
            float r1 = (float) r12
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            int r7 = defpackage.me4.p(r1, r13, r7)
        L_0x0274:
            boolean r1 = r4.get(r5)
            if (r1 == 0) goto L_0x02af
            boolean r1 = r11.get(r5)
            if (r1 == 0) goto L_0x02af
            r1 = 16
            float r1 = (float) r1
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r1
            int r13 = a24.X(r13)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r9)
            android.content.res.Resources r27 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r27.getDisplayMetrics()
            float r8 = r8.density
            float r1 = r1 * r8
            int r1 = a24.X(r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r8 = r29
            r8.measure(r13, r1)
            goto L_0x02b1
        L_0x02af:
            r8 = r29
        L_0x02b1:
            boolean r1 = r4.get(r5)
            if (r1 == 0) goto L_0x02cd
            int r1 = r8.getMeasuredWidth()
            float r8 = (float) r12
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r8 = r8 * r12
            int r8 = a24.X(r8)
            int r8 = r8 + r1
            int r7 = r7 - r8
        L_0x02cd:
            boolean r1 = r4.get(r15)
            if (r1 != 0) goto L_0x02e3
            boolean r1 = r4.get(r14)
            if (r1 != 0) goto L_0x02e3
            boolean r1 = r4.get(r6)
            if (r1 == 0) goto L_0x02e0
            goto L_0x02e3
        L_0x02e0:
            r1 = r24
            goto L_0x02f2
        L_0x02e3:
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r7 = defpackage.me4.p(r2, r1, r7)
            goto L_0x02e0
        L_0x02f2:
            boolean r8 = r4.get(r1)
            if (r8 == 0) goto L_0x0340
            boolean r1 = r11.get(r1)
            if (r1 != 0) goto L_0x0323
            boolean r1 = r11.get(r15)
            if (r1 != 0) goto L_0x0323
            boolean r1 = r11.get(r14)
            if (r1 != 0) goto L_0x0323
            boolean r1 = r11.get(r6)
            if (r1 != 0) goto L_0x0323
            boolean r1 = r11.get(r5)
            if (r1 == 0) goto L_0x0317
            goto L_0x0323
        L_0x0317:
            boolean r1 = r23.isLayoutRequested()
            if (r1 == 0) goto L_0x031e
            goto L_0x0323
        L_0x031e:
            r1 = r22
            r6 = r23
            goto L_0x0343
        L_0x0323:
            if (r7 > 0) goto L_0x0327
            r1 = 0
            goto L_0x032b
        L_0x0327:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
        L_0x032b:
            int r5 = r23.getLineHeight()
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            r23.forceLayout()
            r6 = r23
            r6.measure(r1, r5)
        L_0x033d:
            r1 = r22
            goto L_0x0343
        L_0x0340:
            r6 = r23
            goto L_0x033d
        L_0x0343:
            boolean r5 = r4.get(r1)
            if (r5 == 0) goto L_0x0356
            boolean r5 = r11.get(r1)
            if (r5 == 0) goto L_0x0356
            r7 = r21
            r5 = 0
            r7.measure(r5, r5)
            goto L_0x0358
        L_0x0356:
            r7 = r21
        L_0x0358:
            boolean r5 = r4.get(r1)
            if (r5 == 0) goto L_0x0363
            int r5 = r7.getMeasuredWidth()
            int r10 = r10 - r5
        L_0x0363:
            r5 = r25
            boolean r7 = r4.get(r5)
            if (r7 == 0) goto L_0x03a2
            boolean r7 = r11.get(r5)
            if (r7 == 0) goto L_0x03a2
            r7 = 68
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = a24.X(r7)
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            r12 = 20
            float r12 = (float) r12
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r12 = r12 * r13
            int r12 = a24.X(r12)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r8)
            r3.measure(r7, r12)
        L_0x03a2:
            boolean r7 = r4.get(r5)
            if (r7 == 0) goto L_0x03ad
            int r3 = r3.getMeasuredWidth()
            int r10 = r10 - r3
        L_0x03ad:
            boolean r3 = r4.get(r5)
            if (r3 != 0) goto L_0x03b9
            boolean r3 = r4.get(r1)
            if (r3 == 0) goto L_0x03c7
        L_0x03b9:
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r10 = defpackage.me4.p(r2, r3, r10)
        L_0x03c7:
            if (r10 > 0) goto L_0x03cb
            r10 = 0
            goto L_0x03cf
        L_0x03cb:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
        L_0x03cf:
            int r2 = r20.getLineHeight()
            r3 = 2
            int r2 = r2 * r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r3 = r19
            boolean r7 = r4.get(r3)
            if (r7 == 0) goto L_0x040c
            boolean r3 = r11.get(r3)
            if (r3 != 0) goto L_0x0401
            boolean r3 = r11.get(r5)
            if (r3 != 0) goto L_0x0401
            boolean r3 = r11.get(r1)
            if (r3 != 0) goto L_0x0401
            boolean r3 = r20.isLayoutRequested()
            if (r3 == 0) goto L_0x03fc
            goto L_0x0401
        L_0x03fc:
            r7 = r16
            r3 = r20
            goto L_0x040f
        L_0x0401:
            r20.forceLayout()
            r3 = r20
            r3.measure(r10, r2)
        L_0x0409:
            r7 = r16
            goto L_0x040f
        L_0x040c:
            r3 = r20
            goto L_0x0409
        L_0x040f:
            boolean r4 = r4.get(r7)
            if (r4 == 0) goto L_0x0435
            boolean r4 = r11.get(r7)
            if (r4 != 0) goto L_0x042d
            boolean r4 = r11.get(r5)
            if (r4 != 0) goto L_0x042d
            boolean r1 = r11.get(r1)
            if (r1 != 0) goto L_0x042d
            boolean r1 = r18.isLayoutRequested()
            if (r1 == 0) goto L_0x0435
        L_0x042d:
            r18.forceLayout()
            r1 = r18
            r1.measure(r10, r2)
        L_0x0435:
            re r1 = r0.T0
            if (r26 == 0) goto L_0x044f
            int r2 = android.view.View.MeasureSpec.getSize(r31)
            if (r2 > 0) goto L_0x044f
            android.os.Handler r2 = r30.getHandler()
            if (r2 == 0) goto L_0x0468
            r2.removeCallbacks(r1)
            r2.post(r1)
            r1 = 1
            r0.S0 = r1
            goto L_0x0468
        L_0x044f:
            boolean r2 = r0.S0
            if (r2 == 0) goto L_0x0460
            android.os.Handler r2 = r30.getHandler()
            if (r2 == 0) goto L_0x045c
            r2.removeCallbacks(r1)
        L_0x045c:
            r1 = 0
            r0.S0 = r1
            goto L_0x0461
        L_0x0460:
            r1 = 0
        L_0x0461:
            int r2 = r11.size()
            r11.set(r1, r2, r1)
        L_0x0468:
            int r1 = r30.getPaddingTop()
            int r2 = r30.getPaddingBottom()
            int r2 = r2 + r1
            int r1 = r6.getMeasuredHeight()
            int r1 = r1 + r2
            int r2 = r3.getMeasuredHeight()
            int r2 = r2 + r1
            r1 = 2
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r1 = defpackage.me4.c(r1, r3, r2)
            r2 = 82
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = a24.X(r2)
            int r1 = java.lang.Math.max(r1, r2)
            r2 = r32
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p32.onMeasure(int, int):void");
    }

    public final void onThemeChanged(pda pda) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        this.a.onThemeChanged(pda);
        TextView textView = this.b;
        textView.setTextColor(pda.getText().e);
        cfe text = pda.getText();
        dt4 dt4 = this.c;
        dt4.setTextColor(text.f);
        TextView textView2 = this.w0;
        textView2.setTextColor(pda.getText().h);
        this.x0.onThemeChanged(pda);
        js.D(this.E0.getBackground(), pda.getIcon().g);
        js.D(this.F0.getBackground(), pda.getIcon().g);
        t97 t97 = this.A0;
        Object[] objArr = null;
        t97 t972 = t97.a() ? t97 : null;
        if (!(t972 == null || (drawable4 = (Drawable) t972.getValue()) == null)) {
            js.D(drawable4, -16745729);
        }
        t97 t973 = this.z0;
        if (!t973.a()) {
            t973 = null;
        }
        if (!(t973 == null || (drawable3 = (Drawable) t973.getValue()) == null)) {
            js.D(drawable3, pda.getIcon().g);
        }
        if (!t97.a()) {
            t97 = null;
        }
        if (!(t97 == null || (drawable2 = (Drawable) t97.getValue()) == null)) {
            js.D(drawable2, -16745729);
        }
        t97 t974 = this.B0;
        if (!t974.a()) {
            t974 = null;
        }
        if (!(t974 == null || (drawable = (Drawable) t974.getValue()) == null)) {
            js.D(drawable, -16745729);
        }
        t97 t975 = this.C0;
        if (!t975.a()) {
            t975 = null;
        }
        Drawable drawable5 = t975 != null ? (Drawable) t975.getValue() : null;
        EnhancedVectorDrawable enhancedVectorDrawable = drawable5 instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable5 : null;
        if (enhancedVectorDrawable != null) {
            xs7.P(enhancedVectorDrawable, "error", pda.b().a.e);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(pda.c().a.f));
        CharSequence text2 = textView.getText();
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        Class<mhe> cls = mhe.class;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), cls) : null;
        if (spans == null) {
            spans = new mhe[0];
        }
        for (Object obj : spans) {
            mhe mhe = (mhe) obj;
            mhe.onThemeChanged(pda);
            tge.b(textView, mhe);
        }
        CharSequence text3 = dt4.getText();
        Spanned spanned2 = text3 instanceof Spanned ? (Spanned) text3 : null;
        Object[] spans2 = spanned2 != null ? spanned2.getSpans(0, dt4.getText().length(), cls) : null;
        if (spans2 == null) {
            spans2 = new mhe[0];
        }
        for (Object obj2 : spans2) {
            mhe mhe2 = (mhe) obj2;
            mhe2.onThemeChanged(pda);
            tge.b(dt4, mhe2);
        }
        CharSequence text4 = textView2.getText();
        Spanned spanned3 = text4 instanceof Spanned ? (Spanned) text4 : null;
        Object[] spans3 = spanned3 != null ? spanned3.getSpans(0, textView2.getText().length(), cls) : null;
        if (spans3 == null) {
            spans3 = new mhe[0];
        }
        for (Object obj3 : spans3) {
            mhe mhe3 = (mhe) obj3;
            mhe3.onThemeChanged(pda);
            tge.b(textView2, mhe3);
        }
        this.V0.onThemeChanged(pda);
        pda r = km4.y0.r(this);
        dt4 dt42 = this.o;
        CharSequence text5 = dt42.getText();
        Spanned spanned4 = text5 instanceof Spanned ? (Spanned) text5 : null;
        if (spanned4 != null) {
            objArr = spanned4.getSpans(0, dt42.getText().length(), cls);
        }
        if (objArr == null) {
            objArr = new mhe[0];
        }
        for (Object obj4 : objArr) {
            mhe mhe4 = (mhe) obj4;
            mhe4.onThemeChanged(r);
            tge.b(dt42, mhe4);
        }
        invalidate();
    }

    public final void setAvatar(Uri uri) {
        String uri2 = uri != null ? uri.toString() : null;
        mz9 mz9 = this.a;
        mz9.setAvatarUrl(uri2);
        boolean z = true;
        mz9.g((ub0) null, true);
        this.H0.set(0, true);
        BitSet bitSet = this.I0;
        if (uri == null) {
            z = false;
        }
        bitSet.set(0, z);
        requestLayout();
    }

    public final void setAvatarClickListener(View.OnClickListener onClickListener) {
        a24.Z(this.a, 300, onClickListener);
    }

    public final void setCall(CharSequence charSequence) {
        BitSet bitSet = this.I0;
        boolean z = charSequence == null || h0e.c0(charSequence);
        int i = this.Q0;
        bitSet.set(i, !z);
        this.H0.set(i, true);
        requestLayout();
    }

    public final void setCallBadge(boolean z) {
        this.a.setCallBadgeVisibility(z);
        c(this.H0, true);
        requestLayout();
    }

    public final void setMention(boolean z) {
        this.x0.c(z);
        BitSet bitSet = this.I0;
        e(bitSet, bitSet.get(this.M0) || z);
        e(this.H0, true);
        requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMuted(boolean r13) {
        /*
            r12 = this;
            java.util.BitSet r0 = r12.I0
            int r1 = r12.P0
            r0.set(r1, r13)
            java.util.BitSet r2 = r12.H0
            boolean r3 = r2.get(r1)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0025
            android.view.View r3 = r12.F0
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x001b
            r3 = r5
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            boolean r6 = r0.get(r1)
            if (r3 == r6) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r3 = r4
            goto L_0x0026
        L_0x0025:
            r3 = r5
        L_0x0026:
            r2.set(r1, r3)
            np9 r1 = r12.x0
            mp9 r6 = r1.o
            boolean r3 = r6.d
            r7 = 0
            r11 = 7
            r8 = 0
            r9 = 0
            r10 = r13
            mp9 r6 = defpackage.mp9.a(r6, r7, r8, r9, r10, r11)
            r1.o = r6
            if (r3 == r13) goto L_0x0045
            s59 r3 = km4.y0
            pda r3 = r3.r(r1)
            r1.b(r13, r3)
        L_0x0045:
            int r1 = r12.M0
            boolean r3 = r0.get(r1)
            if (r3 != 0) goto L_0x004f
            if (r13 == 0) goto L_0x0050
        L_0x004f:
            r4 = r5
        L_0x0050:
            r0.set(r1, r4)
            r2.set(r1, r5)
            r12.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p32.setMuted(boolean):void");
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
        c(this.H0, true);
        requestLayout();
    }

    public final void setPinned(boolean z) {
        this.I0.set(this.O0, z);
        requestLayout();
    }

    public final void setReaction(boolean z) {
        this.x0.d(z);
        BitSet bitSet = this.I0;
        e(bitSet, bitSet.get(this.M0) || z);
        e(this.H0, true);
        requestLayout();
    }

    public final void setStatus(o32 o32) {
        Drawable drawable;
        View view = this.y0;
        int ordinal = o32.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            drawable = null;
        } else if (ordinal == 1) {
            drawable = (Drawable) this.z0.getValue();
        } else if (ordinal == 2) {
            drawable = (Drawable) this.A0.getValue();
        } else if (ordinal == 3) {
            drawable = (Drawable) this.B0.getValue();
        } else if (ordinal == 4) {
            drawable = (Drawable) this.C0.getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        view.setBackground(drawable);
        BitSet bitSet = this.I0;
        boolean z2 = view.getBackground() != null;
        int i = this.N0;
        bitSet.set(i, z2);
        BitSet bitSet2 = this.H0;
        if ((view.getVisibility() == 0) == bitSet.get(i)) {
            z = false;
        }
        bitSet2.set(i, z);
        requestLayout();
    }

    public final void setSubtitle(CharSequence charSequence) {
        dt4 dt4 = this.c;
        CharSequence text = dt4.getText();
        BitSet bitSet = this.H0;
        int i = this.K0;
        boolean z = true;
        if (text != charSequence) {
            dt4.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.I0;
        bitSet2.set(i, charSequence != null && !h0e.c0(charSequence) && !bitSet2.get(this.R0));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (dt4.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        pda r = km4.y0.r(this);
        CharSequence text2 = dt4.getText();
        Object[] objArr = null;
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, dt4.getText().length(), mhe.class);
        }
        if (objArr == null) {
            objArr = new mhe[0];
        }
        for (Object obj : objArr) {
            mhe mhe = (mhe) obj;
            mhe.onThemeChanged(r);
            tge.b(dt4, mhe);
        }
        requestLayout();
    }

    public final void setTime(CharSequence charSequence) {
        TextView textView = this.w0;
        CharSequence text = textView.getText();
        BitSet bitSet = this.H0;
        int i = this.L0;
        boolean z = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.I0;
        bitSet2.set(i, charSequence != null && !h0e.c0(charSequence));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        requestLayout();
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.b;
        CharSequence text = textView.getText();
        BitSet bitSet = this.H0;
        int i = this.J0;
        boolean z = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.I0;
        bitSet2.set(i, charSequence != null && !h0e.c0(charSequence));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        pda r = km4.y0.r(this);
        CharSequence text2 = textView.getText();
        Object[] objArr = null;
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, textView.getText().length(), mhe.class);
        }
        if (objArr == null) {
            objArr = new mhe[0];
        }
        for (Object obj : objArr) {
            mhe mhe = (mhe) obj;
            mhe.onThemeChanged(r);
            tge.b(textView, mhe);
        }
        requestLayout();
    }

    public final void setTyping(CharSequence charSequence) {
        dt4 dt4 = this.o;
        CharSequence text = dt4.getText();
        BitSet bitSet = this.H0;
        int i = this.R0;
        boolean z = true;
        if (text != charSequence) {
            dt4.setText(charSequence);
            this.V0.start();
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.I0;
        bitSet2.set(i, charSequence != null && !h0e.c0(charSequence));
        dt4 dt42 = this.c;
        CharSequence text2 = dt42.getText();
        bitSet2.set(this.K0, text2 != null && !h0e.c0(text2) && !bitSet2.get(i));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (dt42.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        pda r = km4.y0.r(this);
        CharSequence text3 = dt4.getText();
        Object[] objArr = null;
        Spanned spanned = text3 instanceof Spanned ? (Spanned) text3 : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, dt4.getText().length(), mhe.class);
        }
        if (objArr == null) {
            objArr = new mhe[0];
        }
        for (Object obj : objArr) {
            mhe mhe = (mhe) obj;
            mhe.onThemeChanged(r);
            tge.b(dt4, mhe);
        }
        requestLayout();
    }

    public final void setVerified(boolean z) {
        b1f b1f;
        TextView textView = this.b;
        int C = xy6.C(tge.e(textView));
        int i = 0;
        if (z) {
            b1f a2 = tge.a(textView);
            if ((a2 != null ? a2.a : 0) == C) {
                return;
            }
        }
        if (z) {
            b1f a3 = tge.a(textView);
            if (a3 != null) {
                i = a3.a;
            }
            if (i != C) {
                b1f = new b1f(getContext(), C, new hd1(6));
                tge.d(textView, b1f);
            }
        }
        b1f = null;
        tge.d(textView, b1f);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.V0;
    }
}
