package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: zpf  reason: default package */
public final class zpf extends FrameLayout implements x1e {
    public final jw1 a;
    public final xpf b;
    public List c = Collections.emptyList();
    public mw1 o = mw1.g;
    public float w0 = 0.0533f;
    public int x0 = 0;
    public float y0 = 0.08f;

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, android.webkit.WebView, xpf] */
    public zpf(Context context) {
        super(context, (AttributeSet) null);
        jw1 jw1 = new jw1(context);
        this.a = jw1;
        ? webView = new WebView(context, (AttributeSet) null);
        this.b = webView;
        webView.setBackgroundColor(0);
        addView(jw1);
        addView(webView);
    }

    public final void a(List list, mw1 mw1, float f, int i, float f2) {
        this.o = mw1;
        this.w0 = f;
        this.x0 = i;
        this.y0 = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            tw3 tw3 = (tw3) list.get(i2);
            if (tw3.o != null) {
                arrayList.add(tw3);
            } else {
                arrayList2.add(tw3);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, mw1, f, i, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float K = e07.K(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (K == -3.4028235E38f) {
            return "unset";
        }
        int i2 = mze.a;
        return String.format(Locale.US, "%.2fpx", new Object[]{Float.valueOf(K / getContext().getResources().getDisplayMetrics().density)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f8, code lost:
        if (r1 != false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fa, code lost:
        r4 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fd, code lost:
        r4 = "left";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ff, code lost:
        r25 = r4;
        r23 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0204, code lost:
        if (r1 != false) goto L_0x01fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0547 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r45 = this;
            r0 = r45
            r1 = 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            mw1 r3 = r0.o
            int r3 = r3.a
            java.lang.String r3 = defpackage.vx3.N(r3)
            int r4 = r0.x0
            float r5 = r0.w0
            java.lang.String r4 = r0.b(r4, r5)
            r5 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r6 = java.lang.Float.valueOf(r5)
            mw1 r7 = r0.o
            int r8 = r7.d
            r9 = 2
            java.lang.String r10 = "unset"
            r11 = 3
            int r7 = r7.e
            if (r8 == r1) goto L_0x0061
            if (r8 == r9) goto L_0x0052
            if (r8 == r11) goto L_0x0043
            r12 = 4
            if (r8 == r12) goto L_0x0034
            r7 = r10
            goto L_0x0073
        L_0x0034:
            java.lang.String r7 = defpackage.vx3.N(r7)
            int r8 = defpackage.mze.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = "-0.05em -0.05em 0.15em "
            java.lang.String r7 = r8.concat(r7)
            goto L_0x0073
        L_0x0043:
            java.lang.String r7 = defpackage.vx3.N(r7)
            int r8 = defpackage.mze.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = "0.06em 0.08em 0.15em "
            java.lang.String r7 = r8.concat(r7)
            goto L_0x0073
        L_0x0052:
            java.lang.String r7 = defpackage.vx3.N(r7)
            int r8 = defpackage.mze.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = "0.1em 0.12em 0.15em "
            java.lang.String r7 = r8.concat(r7)
            goto L_0x0073
        L_0x0061:
            java.lang.String r7 = defpackage.vx3.N(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            int r8 = defpackage.mze.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r12 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            java.lang.String r7 = java.lang.String.format(r8, r12, r7)
        L_0x0073:
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r6, r7}
            int r4 = defpackage.mze.a
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r6 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r3 = java.lang.String.format(r4, r6, r3)
            r2.append(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "default_bg"
            java.lang.String r4 = defpackage.vx3.l(r4)
            mw1 r6 = r0.o
            int r6 = r6.b
            java.lang.String r6 = defpackage.vx3.N(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "background-color:"
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = ";"
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            r3.put(r4, r7)
            r7 = 0
        L_0x00ae:
            java.util.List r12 = r0.c
            int r12 = r12.size()
            if (r7 >= r12) goto L_0x06bd
            java.util.List r12 = r0.c
            java.lang.Object r12 = r12.get(r7)
            tw3 r12 = (defpackage.tw3) r12
            float r13 = r12.w0
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r15 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            r16 = 1120403456(0x42c80000, float:100.0)
            if (r15 == 0) goto L_0x00cc
            float r13 = r13 * r16
            goto L_0x00ce
        L_0x00cc:
            r13 = 1112014848(0x42480000, float:50.0)
        L_0x00ce:
            r17 = -100
            int r15 = r12.x0
            if (r15 == r1) goto L_0x00db
            if (r15 == r9) goto L_0x00d8
            r15 = 0
            goto L_0x00dd
        L_0x00d8:
            r15 = r17
            goto L_0x00dd
        L_0x00db:
            r15 = -50
        L_0x00dd:
            float r11 = r12.X
            int r18 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            java.lang.String r4 = "%.2f%%"
            int r14 = r12.E0
            if (r18 == 0) goto L_0x0159
            int r5 = r12.Y
            if (r5 == r1) goto L_0x0122
            float r11 = r11 * r16
            java.lang.Float r5 = java.lang.Float.valueOf(r11)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r5 = java.lang.String.format(r11, r4, r5)
            int r11 = r12.Z
            if (r14 != r1) goto L_0x0112
            if (r11 == r1) goto L_0x010c
            if (r11 == r9) goto L_0x0109
            r11 = 0
            goto L_0x010e
        L_0x0109:
            r11 = r17
            goto L_0x010e
        L_0x010c:
            r11 = -50
        L_0x010e:
            int r11 = -r11
            r17 = r11
            goto L_0x011b
        L_0x0112:
            if (r11 == r1) goto L_0x0119
            if (r11 == r9) goto L_0x011b
            r17 = 0
            goto L_0x011b
        L_0x0119:
            r17 = -50
        L_0x011b:
            r26 = r5
            r1 = 0
            r5 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x0170
        L_0x0122:
            int r5 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            java.lang.String r9 = "%.2fem"
            if (r5 < 0) goto L_0x0140
            r5 = 1067030938(0x3f99999a, float:1.2)
            float r11 = r11 * r5
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r1, r9, r11)
            r26 = r1
            r1 = 0
        L_0x013d:
            r17 = 0
            goto L_0x0170
        L_0x0140:
            r5 = 1067030938(0x3f99999a, float:1.2)
            float r1 = -r11
            float r1 = r1 - r19
            float r1 = r1 * r5
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r11, r9, r1)
            r26 = r1
            r1 = 1
            goto L_0x013d
        L_0x0159:
            float r1 = r0.y0
            float r19 = r19 - r1
            float r19 = r19 * r16
            java.lang.Float r1 = java.lang.Float.valueOf(r19)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r9, r4, r1)
            r26 = r1
            r1 = 0
        L_0x0170:
            float r9 = r12.y0
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x018c
            float r9 = r9 * r16
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r4 = java.lang.String.format(r11, r4, r9)
        L_0x0189:
            r28 = r4
            goto L_0x018f
        L_0x018c:
            java.lang.String r4 = "fit-content"
            goto L_0x0189
        L_0x018f:
            java.lang.String r4 = "start"
            java.lang.String r9 = "end"
            java.lang.String r11 = "center"
            android.text.Layout$Alignment r5 = r12.b
            if (r5 != 0) goto L_0x01a0
            r21 = r4
            r29 = r11
            r4 = 2
        L_0x019e:
            r5 = 1
            goto L_0x01ba
        L_0x01a0:
            int[] r21 = defpackage.ypf.a
            int r5 = r5.ordinal()
            r5 = r21[r5]
            r21 = r4
            r4 = 1
            if (r5 == r4) goto L_0x01b6
            r4 = 2
            if (r5 == r4) goto L_0x01b3
            r29 = r11
            goto L_0x019e
        L_0x01b3:
            r29 = r9
            goto L_0x019e
        L_0x01b6:
            r4 = 2
            r29 = r21
            goto L_0x019e
        L_0x01ba:
            if (r14 == r5) goto L_0x01c6
            if (r14 == r4) goto L_0x01c3
            java.lang.String r4 = "horizontal-tb"
        L_0x01c0:
            r30 = r4
            goto L_0x01c9
        L_0x01c3:
            java.lang.String r4 = "vertical-lr"
            goto L_0x01c0
        L_0x01c6:
            java.lang.String r4 = "vertical-rl"
            goto L_0x01c0
        L_0x01c9:
            int r4 = r12.C0
            float r5 = r12.D0
            java.lang.String r31 = r0.b(r4, r5)
            boolean r4 = r12.A0
            if (r4 == 0) goto L_0x01d8
            int r4 = r12.B0
            goto L_0x01dc
        L_0x01d8:
            mw1 r4 = r0.o
            int r4 = r4.c
        L_0x01dc:
            java.lang.String r32 = defpackage.vx3.N(r4)
            java.lang.String r4 = "right"
            java.lang.String r5 = "top"
            java.lang.String r22 = "left"
            r23 = r4
            r4 = 1
            if (r14 == r4) goto L_0x0204
            r4 = 2
            if (r14 == r4) goto L_0x01f8
            if (r1 == 0) goto L_0x01f2
            java.lang.String r5 = "bottom"
        L_0x01f2:
            r25 = r5
            r23 = r22
        L_0x01f6:
            r1 = 2
            goto L_0x0207
        L_0x01f8:
            if (r1 == 0) goto L_0x01fd
        L_0x01fa:
            r4 = r23
            goto L_0x01ff
        L_0x01fd:
            r4 = r22
        L_0x01ff:
            r25 = r4
            r23 = r5
            goto L_0x01f6
        L_0x0204:
            if (r1 == 0) goto L_0x01fa
            goto L_0x01fd
        L_0x0207:
            if (r14 == r1) goto L_0x0212
            r1 = 1
            if (r14 != r1) goto L_0x020d
            goto L_0x0212
        L_0x020d:
            java.lang.String r1 = "width"
            r27 = r1
            goto L_0x021c
        L_0x0212:
            java.lang.String r1 = "height"
            r27 = r1
            r44 = r17
            r17 = r15
            r15 = r44
        L_0x021c:
            android.content.Context r1 = r45.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            java.util.regex.Pattern r4 = defpackage.emd.a
            java.lang.String r4 = "</span>"
            java.lang.String r5 = ";'>"
            r36 = r9
            java.lang.String r9 = ""
            r37 = r11
            java.lang.CharSequence r11 = r12.a
            if (r11 != 0) goto L_0x0250
            su4 r1 = new su4
            r1.<init>(r9)
            r39 = r2
            r38 = r4
            r42 = r5
            r40 = r6
            r41 = r8
            r22 = r9
        L_0x024b:
            r43 = r14
            r5 = 3
            goto L_0x05e1
        L_0x0250:
            r22 = r9
            boolean r9 = r11 instanceof android.text.Spanned
            if (r9 != 0) goto L_0x026a
            su4 r1 = new su4
            java.lang.String r9 = defpackage.emd.a(r11)
            r1.<init>(r9)
            r39 = r2
            r38 = r4
            r42 = r5
            r40 = r6
            r41 = r8
            goto L_0x024b
        L_0x026a:
            android.text.Spanned r11 = (android.text.Spanned) r11
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            int r0 = r11.length()
            r38 = r4
            java.lang.Class<android.text.style.BackgroundColorSpan> r4 = android.text.style.BackgroundColorSpan.class
            r39 = r2
            r2 = 0
            java.lang.Object[] r0 = r11.getSpans(r2, r0, r4)
            android.text.style.BackgroundColorSpan[] r0 = (android.text.style.BackgroundColorSpan[]) r0
            int r2 = r0.length
            r4 = 0
        L_0x0284:
            if (r4 >= r2) goto L_0x029a
            r24 = r0[r4]
            int r24 = r24.getBackgroundColor()
            r33 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r9.add(r0)
            r0 = 1
            int r4 = r4 + r0
            r0 = r33
            goto L_0x0284
        L_0x029a:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r2 = r9.iterator()
        L_0x02a3:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02e9
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r24 = r2
            r2 = 14
            r9.<init>(r2)
            java.lang.String r2 = "bg_"
            r9.append(r2)
            r9.append(r4)
            java.lang.String r2 = r9.toString()
            java.lang.String r2 = defpackage.vx3.l(r2)
            java.lang.String r4 = defpackage.vx3.N(r4)
            int r9 = defpackage.mze.a
            java.util.Locale r9 = java.util.Locale.US
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r9.append(r4)
            r9.append(r6)
            java.lang.String r4 = r9.toString()
            r0.put(r2, r4)
            r2 = r24
            goto L_0x02a3
        L_0x02e9:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            int r2 = r11.length()
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r9 = 0
            java.lang.Object[] r2 = r11.getSpans(r9, r2, r4)
            int r4 = r2.length
            r9 = 0
        L_0x02fb:
            if (r9 >= r4) goto L_0x0559
            r24 = r4
            r4 = r2[r9]
            r33 = r2
            boolean r2 = r4 instanceof android.text.style.StrikethroughSpan
            r34 = 0
            if (r2 == 0) goto L_0x031b
            java.lang.String r35 = "<span style='text-decoration:line-through;'>"
            r42 = r5
            r40 = r6
            r41 = r8
        L_0x0311:
            r43 = r14
            r44 = r35
            r35 = r1
            r1 = r44
            goto L_0x0485
        L_0x031b:
            r40 = r6
            boolean r6 = r4 instanceof android.text.style.ForegroundColorSpan
            if (r6 == 0) goto L_0x033b
            r6 = r4
            android.text.style.ForegroundColorSpan r6 = (android.text.style.ForegroundColorSpan) r6
            int r6 = r6.getForegroundColor()
            java.lang.String r6 = defpackage.vx3.N(r6)
            int r35 = defpackage.mze.a
            java.util.Locale r35 = java.util.Locale.US
            r41 = r8
            java.lang.String r8 = "<span style='color:"
            java.lang.String r35 = wn6.i(r8, r6, r5)
            r42 = r5
            goto L_0x0311
        L_0x033b:
            r41 = r8
            boolean r6 = r4 instanceof android.text.style.BackgroundColorSpan
            if (r6 == 0) goto L_0x0357
            r6 = r4
            android.text.style.BackgroundColorSpan r6 = (android.text.style.BackgroundColorSpan) r6
            int r6 = r6.getBackgroundColor()
            int r8 = defpackage.mze.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = "<span class='bg_"
            r42 = r5
            java.lang.String r5 = "'>"
            java.lang.String r35 = rf0.f(r6, r8, r5)
            goto L_0x0311
        L_0x0357:
            r42 = r5
            boolean r5 = r4 instanceof defpackage.yj6
            if (r5 == 0) goto L_0x0360
            java.lang.String r35 = "<span style='text-combine-upright:all;'>"
            goto L_0x0311
        L_0x0360:
            boolean r5 = r4 instanceof android.text.style.AbsoluteSizeSpan
            if (r5 == 0) goto L_0x038c
            r5 = r4
            android.text.style.AbsoluteSizeSpan r5 = (android.text.style.AbsoluteSizeSpan) r5
            boolean r6 = r5.getDip()
            if (r6 == 0) goto L_0x0373
            int r5 = r5.getSize()
            float r5 = (float) r5
            goto L_0x0379
        L_0x0373:
            int r5 = r5.getSize()
            float r5 = (float) r5
            float r5 = r5 / r1
        L_0x0379:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            int r6 = defpackage.mze.a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r8 = "<span style='font-size:%.2fpx;'>"
            java.lang.String r35 = java.lang.String.format(r6, r8, r5)
            goto L_0x0311
        L_0x038c:
            boolean r5 = r4 instanceof android.text.style.RelativeSizeSpan
            if (r5 == 0) goto L_0x03ad
            r5 = r4
            android.text.style.RelativeSizeSpan r5 = (android.text.style.RelativeSizeSpan) r5
            float r5 = r5.getSizeChange()
            float r5 = r5 * r16
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            int r6 = defpackage.mze.a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r8 = "<span style='font-size:%.2f%%;'>"
            java.lang.String r35 = java.lang.String.format(r6, r8, r5)
            goto L_0x0311
        L_0x03ad:
            boolean r5 = r4 instanceof android.text.style.TypefaceSpan
            if (r5 == 0) goto L_0x03ce
            r5 = r4
            android.text.style.TypefaceSpan r5 = (android.text.style.TypefaceSpan) r5
            java.lang.String r5 = r5.getFamily()
            if (r5 == 0) goto L_0x03ca
            int r6 = defpackage.mze.a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r6 = "<span style='font-family:\""
            java.lang.String r8 = "\";'>"
            java.lang.String r5 = wn6.i(r6, r5, r8)
            r35 = r5
            goto L_0x0311
        L_0x03ca:
            r35 = r34
            goto L_0x0311
        L_0x03ce:
            boolean r5 = r4 instanceof android.text.style.StyleSpan
            if (r5 == 0) goto L_0x03f6
            r5 = r4
            android.text.style.StyleSpan r5 = (android.text.style.StyleSpan) r5
            int r5 = r5.getStyle()
            r6 = 1
            if (r5 == r6) goto L_0x03f2
            r6 = 2
            if (r5 == r6) goto L_0x03ee
            r6 = 3
            if (r5 == r6) goto L_0x03ea
        L_0x03e2:
            r35 = r1
            r43 = r14
            r1 = r34
            goto L_0x0485
        L_0x03ea:
            java.lang.String r35 = "<b><i>"
            goto L_0x0311
        L_0x03ee:
            java.lang.String r35 = "<i>"
            goto L_0x0311
        L_0x03f2:
            java.lang.String r35 = "<b>"
            goto L_0x0311
        L_0x03f6:
            boolean r5 = r4 instanceof defpackage.fic
            if (r5 == 0) goto L_0x0415
            r5 = r4
            fic r5 = (defpackage.fic) r5
            int r5 = r5.b
            r6 = -1
            if (r5 == r6) goto L_0x0411
            r6 = 1
            if (r5 == r6) goto L_0x040d
            r6 = 2
            if (r5 == r6) goto L_0x0409
            goto L_0x03e2
        L_0x0409:
            java.lang.String r35 = "<ruby style='ruby-position:under;'>"
            goto L_0x0311
        L_0x040d:
            java.lang.String r35 = "<ruby style='ruby-position:over;'>"
            goto L_0x0311
        L_0x0411:
            java.lang.String r35 = "<ruby style='ruby-position:unset;'>"
            goto L_0x0311
        L_0x0415:
            boolean r5 = r4 instanceof android.text.style.UnderlineSpan
            if (r5 == 0) goto L_0x041d
            java.lang.String r35 = "<u>"
            goto L_0x0311
        L_0x041d:
            boolean r5 = r4 instanceof defpackage.lfe
            if (r5 == 0) goto L_0x03e2
            r5 = r4
            lfe r5 = (defpackage.lfe) r5
            int r6 = r5.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r35 = r1
            int r1 = r5.b
            r43 = r14
            r14 = 1
            if (r1 == r14) goto L_0x043e
            r14 = 2
            if (r1 == r14) goto L_0x0438
            goto L_0x0444
        L_0x0438:
            java.lang.String r1 = "open "
            r8.append(r1)
            goto L_0x0444
        L_0x043e:
            r14 = 2
            java.lang.String r1 = "filled "
            r8.append(r1)
        L_0x0444:
            if (r6 == 0) goto L_0x0464
            r1 = 1
            if (r6 == r1) goto L_0x045e
            if (r6 == r14) goto L_0x0458
            r1 = 3
            if (r6 == r1) goto L_0x0452
            r8.append(r10)
            goto L_0x0469
        L_0x0452:
            java.lang.String r1 = "sesame"
            r8.append(r1)
            goto L_0x0469
        L_0x0458:
            java.lang.String r1 = "dot"
            r8.append(r1)
            goto L_0x0469
        L_0x045e:
            java.lang.String r1 = "circle"
            r8.append(r1)
            goto L_0x0469
        L_0x0464:
            java.lang.String r1 = "none"
            r8.append(r1)
        L_0x0469:
            java.lang.String r1 = r8.toString()
            int r5 = r5.c
            r6 = 2
            if (r5 == r6) goto L_0x0475
            java.lang.String r5 = "over right"
            goto L_0x0477
        L_0x0475:
            java.lang.String r5 = "under left"
        L_0x0477:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5}
            int r5 = defpackage.mze.a
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r6 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r1 = java.lang.String.format(r5, r6, r1)
        L_0x0485:
            if (r2 != 0) goto L_0x049f
            boolean r2 = r4 instanceof android.text.style.ForegroundColorSpan
            if (r2 != 0) goto L_0x049f
            boolean r2 = r4 instanceof android.text.style.BackgroundColorSpan
            if (r2 != 0) goto L_0x049f
            boolean r2 = r4 instanceof defpackage.yj6
            if (r2 != 0) goto L_0x049f
            boolean r2 = r4 instanceof android.text.style.AbsoluteSizeSpan
            if (r2 != 0) goto L_0x049f
            boolean r2 = r4 instanceof android.text.style.RelativeSizeSpan
            if (r2 != 0) goto L_0x049f
            boolean r2 = r4 instanceof defpackage.lfe
            if (r2 == 0) goto L_0x04a2
        L_0x049f:
            r5 = 3
            goto L_0x0509
        L_0x04a2:
            boolean r2 = r4 instanceof android.text.style.TypefaceSpan
            if (r2 == 0) goto L_0x04b5
            r2 = r4
            android.text.style.TypefaceSpan r2 = (android.text.style.TypefaceSpan) r2
            java.lang.String r2 = r2.getFamily()
            if (r2 == 0) goto L_0x04b1
            r34 = r38
        L_0x04b1:
            r2 = r34
            r5 = 3
            goto L_0x050b
        L_0x04b5:
            boolean r2 = r4 instanceof android.text.style.StyleSpan
            if (r2 == 0) goto L_0x04d7
            r2 = r4
            android.text.style.StyleSpan r2 = (android.text.style.StyleSpan) r2
            int r2 = r2.getStyle()
            r5 = 1
            if (r2 == r5) goto L_0x04d3
            r5 = 2
            if (r2 == r5) goto L_0x04cf
            r5 = 3
            if (r2 == r5) goto L_0x04ca
            goto L_0x04cc
        L_0x04ca:
            java.lang.String r34 = "</i></b>"
        L_0x04cc:
            r2 = r34
            goto L_0x050b
        L_0x04cf:
            r5 = 3
            java.lang.String r34 = "</i>"
            goto L_0x04cc
        L_0x04d3:
            r5 = 3
            java.lang.String r34 = "</b>"
            goto L_0x04cc
        L_0x04d7:
            r5 = 3
            boolean r2 = r4 instanceof defpackage.fic
            if (r2 == 0) goto L_0x0502
            r2 = r4
            fic r2 = (defpackage.fic) r2
            java.lang.String r2 = r2.a
            java.lang.String r2 = defpackage.emd.a(r2)
            r6 = 16
            int r6 = me4.e(r6, r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = "<rt>"
            r8.append(r6)
            r8.append(r2)
            java.lang.String r2 = "</rt></ruby>"
            r8.append(r2)
            java.lang.String r34 = r8.toString()
            goto L_0x04cc
        L_0x0502:
            boolean r2 = r4 instanceof android.text.style.UnderlineSpan
            if (r2 == 0) goto L_0x04cc
            java.lang.String r34 = "</u>"
            goto L_0x04cc
        L_0x0509:
            r2 = r38
        L_0x050b:
            int r6 = r11.getSpanStart(r4)
            int r4 = r11.getSpanEnd(r4)
            if (r1 == 0) goto L_0x0547
            r2.getClass()
            cmd r8 = new cmd
            r8.<init>(r1, r6, r4, r2)
            java.lang.Object r1 = r0.get(r6)
            dmd r1 = (defpackage.dmd) r1
            if (r1 != 0) goto L_0x052d
            dmd r1 = new dmd
            r1.<init>()
            r0.put(r6, r1)
        L_0x052d:
            java.util.ArrayList r1 = r1.a
            r1.add(r8)
            java.lang.Object r1 = r0.get(r4)
            dmd r1 = (defpackage.dmd) r1
            if (r1 != 0) goto L_0x0542
            dmd r1 = new dmd
            r1.<init>()
            r0.put(r4, r1)
        L_0x0542:
            java.util.ArrayList r1 = r1.b
            r1.add(r8)
        L_0x0547:
            r1 = 1
            int r9 = r9 + r1
            r4 = r24
            r2 = r33
            r1 = r35
            r6 = r40
            r8 = r41
            r5 = r42
            r14 = r43
            goto L_0x02fb
        L_0x0559:
            r42 = r5
            r40 = r6
            r41 = r8
            r43 = r14
            r5 = 3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r11.length()
            r1.<init>(r2)
            r2 = 0
            r4 = 0
        L_0x056d:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x05c8
            int r6 = r0.keyAt(r2)
            java.lang.CharSequence r4 = r11.subSequence(r4, r6)
            java.lang.String r4 = defpackage.emd.a(r4)
            r1.append(r4)
            java.lang.Object r4 = r0.get(r6)
            dmd r4 = (defpackage.dmd) r4
            java.util.ArrayList r8 = r4.b
            xb4 r9 = defpackage.cmd.f
            java.util.Collections.sort(r8, r9)
            java.util.ArrayList r8 = r4.b
            java.util.Iterator r8 = r8.iterator()
        L_0x0595:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x05a7
            java.lang.Object r9 = r8.next()
            cmd r9 = (defpackage.cmd) r9
            java.lang.String r9 = r9.d
            r1.append(r9)
            goto L_0x0595
        L_0x05a7:
            java.util.ArrayList r4 = r4.a
            xb4 r8 = defpackage.cmd.e
            java.util.Collections.sort(r4, r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x05b2:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x05c4
            java.lang.Object r8 = r4.next()
            cmd r8 = (defpackage.cmd) r8
            java.lang.String r8 = r8.c
            r1.append(r8)
            goto L_0x05b2
        L_0x05c4:
            r8 = 1
            int r2 = r2 + r8
            r4 = r6
            goto L_0x056d
        L_0x05c8:
            int r0 = r11.length()
            java.lang.CharSequence r0 = r11.subSequence(r4, r0)
            java.lang.String r0 = defpackage.emd.a(r0)
            r1.append(r0)
            su4 r0 = new su4
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r1 = r0
        L_0x05e1:
            java.util.Set r0 = r3.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x05e9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0615
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r3.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r3.put(r2, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0610
            java.lang.Object r2 = r3.get(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x060e
            goto L_0x0610
        L_0x060e:
            r2 = 0
            goto L_0x0611
        L_0x0610:
            r2 = 1
        L_0x0611:
            swb.h(r2)
            goto L_0x05e9
        L_0x0615:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Float r24 = java.lang.Float.valueOf(r13)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r17)
            float r2 = r12.F0
            int r4 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x064e
            r6 = r43
            r4 = 2
            if (r6 == r4) goto L_0x0637
            r4 = 1
            if (r6 != r4) goto L_0x0634
            goto L_0x0637
        L_0x0634:
            java.lang.String r4 = "skewX"
            goto L_0x0639
        L_0x0637:
            java.lang.String r4 = "skewY"
        L_0x0639:
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            int r4 = defpackage.mze.a
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r6 = "%s(%.2fdeg)"
            java.lang.String r2 = java.lang.String.format(r4, r6, r2)
            r35 = r2
            goto L_0x0650
        L_0x064e:
            r35 = r22
        L_0x0650:
            r22 = r0
            java.lang.Object[] r0 = new java.lang.Object[]{r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35}
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r4 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r0 = java.lang.String.format(r2, r4, r0)
            r2 = r39
            r2.append(r0)
            java.lang.String r0 = "<span class='default_bg'>"
            r2.append(r0)
            java.lang.String r0 = r1.a
            android.text.Layout$Alignment r1 = r12.c
            if (r1 == 0) goto L_0x06a4
            int[] r4 = defpackage.ypf.a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            if (r1 == r4) goto L_0x0682
            r4 = 2
            if (r1 == r4) goto L_0x067f
            r1 = r37
            goto L_0x0685
        L_0x067f:
            r1 = r36
            goto L_0x0685
        L_0x0682:
            r4 = 2
            r1 = r21
        L_0x0685:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "<span style='display:inline-block; text-align:"
            r6.<init>(r8)
            r6.append(r1)
            r1 = r42
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r2.append(r1)
            r2.append(r0)
            r0 = r38
            r2.append(r0)
            goto L_0x06a8
        L_0x06a4:
            r4 = 2
            r2.append(r0)
        L_0x06a8:
            java.lang.String r0 = "</span></div>"
            r2.append(r0)
            r0 = 1
            int r7 = r7 + r0
            r1 = r0
            r9 = r4
            r11 = r5
            r6 = r40
            r8 = r41
            r5 = 1067030938(0x3f99999a, float:1.2)
            r0 = r45
            goto L_0x00ae
        L_0x06bd:
            java.lang.String r0 = "</div></body></html>"
            r2.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<html><head><style>"
            r0.<init>(r1)
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x06d1:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x06f4
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L_0x06d1
        L_0x06f4:
            java.lang.String r1 = "</style></head>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2.insert(r1, r0)
            java.lang.String r0 = r2.toString()
            java.nio.charset.Charset r1 = defpackage.f22.c
            byte[] r0 = r0.getBytes(r1)
            r1 = 1
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "base64"
            r3 = r45
            xpf r3 = r3.b
            r3.loadData(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpf.c():void");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.c.isEmpty()) {
            c();
        }
    }
}
