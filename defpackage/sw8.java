package defpackage;

import android.content.Context;
import android.text.Layout;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: sw8  reason: default package */
public final class sw8 {
    public final Context a;
    public final String b = sw8.class.getName();
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final r7e f;
    public final ConcurrentHashMap g;
    public final ContextScope h;
    public final r7e i;

    public sw8(pae pae, ua3 ua3, t97 t97, t97 t972, t97 t973, Context context) {
        this.a = context;
        this.c = t97;
        this.d = t972;
        this.e = t973;
        this.f = new r7e(new jw8(100, 0));
        this.g = new ConcurrentHashMap();
        this.h = n1g.a(((n3a) pae).a());
        this.i = new r7e(new z65(6, t97));
        ua3.a(ua3.c | ua3.d, new kw8(0, this));
    }

    public static qs8 c(sw8 sw8, i22 i22, xm8 xm8, boolean z) {
        sw8.getClass();
        mw8 mw8 = new mw8(i22, xm8, false);
        kr7 kr7 = (kr7) sw8.f.getValue();
        Object c2 = kr7.c(mw8);
        if (c2 == null) {
            c2 = sw8.a(i22, xm8, (CharSequence) null, false);
            kr7.d(mw8, c2);
        }
        s97 s97 = (s97) c2;
        return z ? s97.a : s97.b;
    }

    public final s97 a(i22 i22, xm8 xm8, CharSequence charSequence, boolean z) {
        List<xm8> list;
        r7e r7e;
        i22 i222 = i22;
        xm8 xm82 = xm8;
        mw8 mw8 = new mw8(i222, xm82, z);
        ((oda) ((pge) this.d.getValue())).getClass();
        sq8 sq8 = xm82.c;
        if (sq8 == null || sq8.a != 1) {
            list = hw4.a;
        } else {
            xm8 xm83 = sq8.c;
            if (xm83.a() != null) {
                xm83 = xm83.a();
            }
            list = Collections.singletonList(new xm8(xm83.a, xm83.b, xm83.c, xm83.o, xm83.X, xm83.Y, xm83.Z, xm83.w0));
        }
        for (xm8 xm84 : list) {
            if (xm84 != xm82) {
                a(i222, xm84, (CharSequence) null, true);
            }
        }
        r7e r7e2 = this.f;
        t97 t97 = this.c;
        int b2 = ((p0a) ((jr0) t97.getValue())).b();
        s16 s16 = r0;
        int b3 = ((p0a) ((jr0) t97.getValue())).b();
        int i2 = b2;
        mw8 mw82 = mw8;
        s97 s97 = (s97) ((kr7) r7e2.getValue()).c(mw8);
        s16 lw8 = new lw8(this, i22, xm8, b2, charSequence, z, 0);
        r7e r7e3 = new r7e(s16);
        boolean z2 = i2 == b3;
        if (z2) {
            r7e = r7e3;
        } else {
            s16 s162 = r0;
            r7e = r7e3;
            s16 lw82 = new lw8(this, i22, xm8, b3, charSequence, z, 1);
            r7e3 = new r7e(s162);
        }
        boolean z3 = this.a.getResources().getConfiguration().orientation == 1;
        ContextScope contextScope = this.h;
        if (s97 != null) {
            qs8 qs8 = s97.b;
            if (z2 || z3) {
                qs8 qs82 = s97.a;
                qs82.b((Layout) r7e.getValue());
                if (qs82 != qs8) {
                    xs7.E(contextScope, (hu3) null, (ru3) null, new nw8(s97, r7e3, (Continuation) null), 3);
                }
            } else {
                qs8.b((Layout) r7e3.getValue());
                xs7.E(contextScope, (hu3) null, (ru3) null, new ow8(s97, r7e, (Continuation) null), 3);
            }
            return s97;
        }
        qs8 qs83 = new qs8(i222, xm82, r7e);
        qs8 qs84 = z2 ? qs83 : new qs8(i222, xm82, r7e3);
        s97 s972 = new s97(qs83, qs84);
        ((kr7) r7e2.getValue()).d(mw82, s972);
        if (z2 || z3) {
            qs83.b((Layout) r7e.getValue());
            if (qs83 != qs84) {
                xs7.E(contextScope, (hu3) null, (ru3) null, new pw8(s972, r7e3, (Continuation) null), 3);
            }
        } else {
            qs84.b((Layout) r7e3.getValue());
            xs7.E(contextScope, (hu3) null, (ru3) null, new qw8(s972, r7e, (Continuation) null), 3);
        }
        return s972;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: android.text.Spannable} */
    /* JADX WARNING: type inference failed for: r1v18, types: [xfe, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout b(defpackage.i22 r26, defpackage.xm8 r27, int r28, java.lang.CharSequence r29, boolean r30) {
        /*
            r25 = this;
            r6 = r25
            r3 = r26
            r5 = r27
            r0 = r29
            r4 = r30
            r15 = 2
            r14 = 1
            t97 r13 = r6.d
            java.lang.Object r7 = r13.getValue()
            pge r7 = (defpackage.pge) r7
            oda r7 = (defpackage.oda) r7
            r7.getClass()
            boolean r8 = r5 instanceof defpackage.nda
            vo8 r9 = r5.a
            s59 r12 = km4.y0
            o1b r11 = r5.X
            android.content.Context r2 = r7.a
            if (r8 == 0) goto L_0x01ca
            j2b r8 = r7.b
            kp r1 = r8.c
            x97 r1 = r1.g
            java.lang.String r10 = "audio.transcription.enabled"
            boolean r1 = r1.getBoolean(r10, r14)
            java.lang.String r10 = r9.w0
            if (r10 == 0) goto L_0x0048
            int r10 = r10.length()
            if (r10 != 0) goto L_0x003c
            goto L_0x0048
        L_0x003c:
            boolean r10 = r9.B()
            if (r10 != 0) goto L_0x0048
            java.lang.CharSequence r1 = r5.b(r3)
            goto L_0x0108
        L_0x0048:
            boolean r10 = r9.s()
            if (r10 == 0) goto L_0x008f
            if (r1 == 0) goto L_0x006b
            l00 r1 = r9.c()
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = r1.f
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            if (r1 == 0) goto L_0x006b
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            l00 r1 = r9.c()
            java.lang.String r1 = r1.f
            goto L_0x0108
        L_0x006b:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            int r7 = defpackage.whc.s
            java.lang.String r2 = r2.getString(r7)
            l00 r7 = r9.c()
            long r7 = r7.c
            java.lang.String[] r10 = defpackage.dhe.b
            java.lang.String r7 = d8.a(r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r7}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r15)
            java.lang.String r7 = "%s %s"
            java.lang.String r1 = java.lang.String.format(r1, r7, r2)
            goto L_0x0108
        L_0x008f:
            boolean r1 = r9.w()
            if (r1 == 0) goto L_0x009e
            v00 r1 = r9.g()
            if (r1 == 0) goto L_0x0107
            java.lang.String r1 = r1.c
            goto L_0x0108
        L_0x009e:
            boolean r1 = r9.u()
            if (r1 == 0) goto L_0x00dd
            q00 r1 = r9.e()
            k93 r7 = defpackage.vl.b()
            o2a r7 = (o2a) r7
            w4 r7 = r7.getAccessor()
            java.lang.Class<zf3> r8 = defpackage.zf3.class
            java.lang.Object r7 = r7.c(r8)
            zf3 r7 = (defpackage.zf3) r7
            tf3 r7 = r7.b(r1)
            int r10 = defpackage.cic.d
            k93 r17 = defpackage.vl.b()
            o2a r17 = (o2a) r17
            w4 r15 = r17.getAccessor()
            java.lang.Object r8 = r15.c(r8)
            zf3 r8 = (defpackage.zf3) r8
            java.lang.String r1 = n06.o(r7, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = r2.getString(r10, r1)
            goto L_0x0108
        L_0x00dd:
            boolean r1 = r9.x()
            if (r1 == 0) goto L_0x00ea
            int r1 = defpackage.whc.x
            java.lang.String r1 = r2.getString(r1)
            goto L_0x0108
        L_0x00ea:
            boolean r1 = r9.t()
            if (r1 == 0) goto L_0x0107
            i03 r1 = r8.a
            long r23 = r1.s()
            android.content.Context r1 = r7.a
            r22 = 0
            vo8 r2 = r5.a
            r21 = 0
            r19 = r1
            r20 = r2
            java.lang.String r1 = defpackage.dhe.h(r19, r20, r21, r22, r23)
            goto L_0x0108
        L_0x0107:
            r1 = 0
        L_0x0108:
            if (r1 == 0) goto L_0x016d
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0111
            goto L_0x016d
        L_0x0111:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            int r7 = r1.length()
            r8 = 3
            if (r7 != 0) goto L_0x011d
        L_0x011a:
            r9 = r1
            r1 = r8
            goto L_0x0165
        L_0x011d:
            boolean r7 = r9.s()
            if (r7 == 0) goto L_0x0125
            r8 = r14
            goto L_0x012c
        L_0x0125:
            boolean r7 = r9.u()
            if (r7 == 0) goto L_0x012c
            r8 = 2
        L_0x012c:
            boolean r7 = r1 instanceof android.text.Spannable
            if (r7 == 0) goto L_0x011a
            int r7 = r1.length()
            r10 = 0
            java.lang.CharSequence r1 = r1.subSequence(r10, r7)
            boolean r7 = r1 instanceof android.text.Spannable
            if (r7 == 0) goto L_0x0141
            r7 = r1
            android.text.Spannable r7 = (android.text.Spannable) r7
            goto L_0x0142
        L_0x0141:
            r7 = 0
        L_0x0142:
            if (r7 == 0) goto L_0x0160
            int r9 = r7.length()
            java.lang.Class<uu7> r15 = defpackage.uu7.class
            java.lang.Object[] r9 = r7.getSpans(r10, r9, r15)
            int r15 = r9.length
        L_0x014f:
            if (r10 >= r15) goto L_0x0160
            r17 = r9[r10]
            r19 = r1
            r1 = r17
            uu7 r1 = (defpackage.uu7) r1
            r7.removeSpan(r1)
            int r10 = r10 + r14
            r1 = r19
            goto L_0x014f
        L_0x0160:
            r19 = r1
            r1 = r8
            r9 = r19
        L_0x0165:
            if (r9 == 0) goto L_0x016d
            int r7 = r9.length()
            if (r7 != 0) goto L_0x0171
        L_0x016d:
            r4 = r12
            r1 = r13
            r2 = r14
            goto L_0x01c5
        L_0x0171:
            oge r17 = new oge
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r8 = 1096810496(0x41600000, float:14.0)
            r15 = 2
            float r8 = android.util.TypedValue.applyDimension(r15, r8, r7)
            r11.getClass()
            java.util.List r7 = java.util.Collections.emptyList()
            boolean r7 = r7.isEmpty()
            r10 = r7 ^ 1
            r7 = 10
            float r11 = (float) r7
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r11
            int r18 = a24.X(r7)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r11 = r11 * r7
            int r19 = a24.X(r11)
            r11 = 0
            r7 = r17
            r4 = 0
            r4 = r12
            r12 = r1
            r1 = r13
            r13 = r2
            r2 = r14
            r14 = r27
            r15 = r18
            r16 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r11 = r17
            goto L_0x01c6
        L_0x01c5:
            r11 = 0
        L_0x01c6:
            r8 = r2
        L_0x01c7:
            r10 = 2
            goto L_0x02ed
        L_0x01ca:
            r4 = r12
            r1 = r13
            r8 = r14
            java.lang.String r10 = r9.w0
            if (r10 == 0) goto L_0x01de
            int r10 = r10.length()
            if (r10 != 0) goto L_0x01d8
            goto L_0x01de
        L_0x01d8:
            boolean r10 = r9.B()
            if (r10 == 0) goto L_0x01e1
        L_0x01de:
            r10 = 2
            goto L_0x02ec
        L_0x01e1:
            java.lang.CharSequence r10 = r11.b(r3)
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0263
            vo8 r10 = r5.a
            int r12 = r10.b()
            if (r12 != 0) goto L_0x0263
            oge r12 = new oge
            nge r13 = defpackage.jp2.b
            t97 r7 = r7.d
            java.lang.Object r7 = r7.getValue()
            o4a r7 = (defpackage.o4a) r7
            zqd r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            yq4 r7 = (defpackage.yq4) r7
            long r13 = r13.g(r7)
            float r18 = defpackage.ah4.c(r13, r2)
            r11.f = r3
            w6a r2 = r11.a
            int r7 = r2.f()
            int r2 = r2.e()
            r11.i(r3, r7, r2)
            r11.g(r3)
            java.lang.CharSequence r2 = r11.i
            if (r2 != 0) goto L_0x0227
            java.lang.String r2 = ""
        L_0x0227:
            r19 = r2
            boolean r2 = r9.B()
            if (r2 != 0) goto L_0x023f
            java.lang.CharSequence r2 = r11.b(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0255
            int r2 = r10.b()
            if (r2 != 0) goto L_0x0255
        L_0x023f:
            sq8 r2 = r5.c
            if (r2 != 0) goto L_0x0255
            r11.getClass()
            java.util.List r2 = java.util.Collections.emptyList()
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r8
            if (r2 == 0) goto L_0x0252
            goto L_0x0255
        L_0x0252:
            r20 = 0
            goto L_0x0257
        L_0x0255:
            r20 = r8
        L_0x0257:
            r21 = 0
            r22 = 504(0x1f8, float:7.06E-43)
            r17 = r12
            r17.<init>(r18, r19, r20, r21, r22)
            r11 = r12
            goto L_0x01c7
        L_0x0263:
            java.lang.CharSequence r10 = r5.b(r3)
            km4 r11 = r4.n(r2)
            pda r11 = r11.g()
            jo2 r11 = r11.a()
            boolean r12 = r27.d()
            dr0 r11 = r11.a(r12)
            gr0 r11 = r11.b
            int r11 = r11.b
            r12 = 28
            android.text.Spannable r11 = defpackage.lu7.m(r10, r11, r12)
            if (r11 != 0) goto L_0x028a
            r19 = r10
            goto L_0x028c
        L_0x028a:
            r19 = r11
        L_0x028c:
            t97 r7 = r7.e
            java.lang.Object r7 = r7.getValue()
            jr0 r7 = (defpackage.jr0) r7
            r27.d()
            p0a r7 = (defpackage.p0a) r7
            float r7 = r7.c()
            xm8 r10 = r27.a()
            if (r10 == 0) goto L_0x02aa
            vo8 r10 = r10.a
            if (r10 == 0) goto L_0x02aa
            int r9 = r10.S0
            goto L_0x02ac
        L_0x02aa:
            int r9 = r9.S0
        L_0x02ac:
            float r10 = (float) r9
            r11 = 1120403456(0x42c80000, float:100.0)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x02bf
            r10 = 300(0x12c, float:4.2E-43)
            int r9 = java.lang.Math.min(r9, r10)
            float r9 = (float) r9
            float r9 = r9 / r11
            float r7 = r7 * r9
            r21 = 0
            goto L_0x02c1
        L_0x02bf:
            r21 = r8
        L_0x02c1:
            yte r2 = e07.a(r2)
            grd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            r10 = 2
            float r2 = android.util.TypedValue.applyDimension(r10, r2, r9)
            float r18 = r2 + r7
            oge r11 = new oge
            r20 = 1
            r22 = 496(0x1f0, float:6.95E-43)
            r17 = r11
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x02ed
        L_0x02ec:
            r11 = 0
        L_0x02ed:
            t97 r7 = r6.c
            if (r11 != 0) goto L_0x0311
            oge r11 = new oge
            java.lang.Object r2 = r7.getValue()
            jr0 r2 = (defpackage.jr0) r2
            r27.d()
            p0a r2 = (defpackage.p0a) r2
            float r18 = r2.c()
            java.lang.CharSequence r19 = r5.b(r3)
            r20 = 1
            r21 = 0
            r22 = 504(0x1f8, float:7.06E-43)
            r17 = r11
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x0311:
            if (r0 == 0) goto L_0x031b
            r2 = 501(0x1f5, float:7.02E-43)
            r9 = 0
            oge r11 = defpackage.oge.a(r11, r0, r9, r2)
            goto L_0x031c
        L_0x031b:
            r9 = 0
        L_0x031c:
            java.lang.Object r0 = r1.getValue()
            pge r0 = (defpackage.pge) r0
            oda r0 = (defpackage.oda) r0
            java.lang.String r0 = r0.c
            java.lang.CharSequence r2 = r11.b
            r12 = r9
            r9 = r30
            if (r9 != 0) goto L_0x032e
            goto L_0x036f
        L_0x032e:
            boolean r13 = r2 instanceof android.text.Spannable
            if (r13 != 0) goto L_0x0333
            goto L_0x036f
        L_0x0333:
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r2)
            int r14 = r13.length()
            java.lang.Class<trc> r15 = defpackage.trc.class
            java.lang.Object[] r14 = r13.getSpans(r12, r14, r15)
            trc[] r14 = (defpackage.trc[]) r14
            int r15 = r14.length
            if (r15 != 0) goto L_0x0348
            goto L_0x036f
        L_0x0348:
            int r2 = r14.length
            r15 = r12
        L_0x034a:
            if (r15 >= r2) goto L_0x036e
            r10 = r14[r15]
            android.text.style.ForegroundColorSpan r12 = r10.a     // Catch:{ all -> 0x0365 }
            if (r12 == 0) goto L_0x0355
            r13.removeSpan(r12)     // Catch:{ all -> 0x0365 }
        L_0x0355:
            android.text.style.BackgroundColorSpan r12 = r10.b     // Catch:{ all -> 0x0365 }
            if (r12 == 0) goto L_0x035c
            r13.removeSpan(r12)     // Catch:{ all -> 0x0365 }
        L_0x035c:
            r13.removeSpan(r10)     // Catch:{ all -> 0x0365 }
            java.lang.String r10 = "reformatText: remove search span"
            udd.Q(r0, r10)     // Catch:{ all -> 0x0365 }
            goto L_0x036a
        L_0x0365:
            java.lang.String r10 = "reformatText: could not remove search spans"
            udd.U(r0, r10)
        L_0x036a:
            int r15 = r15 + r8
            r10 = 2
            r12 = 0
            goto L_0x034a
        L_0x036e:
            r2 = r13
        L_0x036f:
            r0 = 509(0x1fd, float:7.13E-43)
            r10 = 0
            oge r11 = defpackage.oge.a(r11, r2, r10, r0)
            boolean r0 = r11.d
            java.lang.CharSequence r10 = r11.b
            if (r0 == 0) goto L_0x0442
            mw8 r12 = new mw8
            r12.<init>(r3, r5, r9)
            java.util.concurrent.ConcurrentHashMap r13 = r6.g
            boolean r0 = r13.containsKey(r12)
            if (r0 == 0) goto L_0x0399
            java.lang.Object r0 = r13.get(r12)
            xi4 r0 = (xi4) r0
            if (r0 == 0) goto L_0x0399
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x0399
            goto L_0x0442
        L_0x0399:
            java.lang.Object r0 = r13.get(r12)
            xi4 r0 = (xi4) r0
            if (r0 == 0) goto L_0x03a4
            r0.f()
        L_0x03a4:
            java.lang.Object r0 = r1.getValue()
            pge r0 = (defpackage.pge) r0
            oda r0 = (defpackage.oda) r0
            r7e r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            yfe r0 = (defpackage.yfe) r0
            r0.getClass()
            rz3 r1 = new rz3
            r2 = 8
            r1.<init>(r0, r2, r10)
            ox7 r2 = new ox7
            r2.<init>(r1)
            xfe r1 = new xfe
            r1.<init>()
            r14 = 0
            r1.a = r14
            r1.b = r10
            mv9 r1 = dhd.g(r1)
            java.lang.Iterable r14 = r0.b
            java.util.Iterator r14 = r14.iterator()
            boolean r15 = r14.hasNext()
            if (r15 != 0) goto L_0x0434
            joc r14 = new joc
            r15 = 7
            r14.<init>(r0, r15, r10)
            mhd r0 = new mhd
            r15 = 2
            r0.<init>(r1, r14, r15)
            o73 r1 = new o73
            r1.<init>(r2, r8, r0)
            kce r0 = new kce
            r2 = 10
            r0.<init>(r2)
            jx7 r2 = new jx7
            r2.<init>(r1, r15, r0)
            sic r0 = new sic
            r1 = 27
            r0.<init>(r1, r10)
            zx7 r14 = new zx7
            gf6 r1 = z3d.j
            z26 r15 = z3d.i
            r14.<init>(r2, r1, r0, r15)
            te r15 = new te
            r0 = r15
            r1 = r10
            r8 = 7
            r2 = r25
            r3 = r26
            r9 = r4
            r4 = r27
            r5 = r30
            r0.<init>(r1, r2, r3, r4, r5)
            u5g r0 = new u5g
            r1 = 19
            r0.<init>(r1, r6)
            sz r1 = new sz
            r1.<init>(r6, r8, r12)
            bx7 r2 = new bx7
            r2.<init>(r15, r0, r1)
            r14.a(r2)
            r13.put(r12, r2)
        L_0x0432:
            r1 = 0
            goto L_0x0444
        L_0x0434:
            java.lang.Object r0 = r14.next()
            hr1.r(r0)
            java.lang.String r0 = "transformer is null"
            r1 = 0
            java.util.Objects.requireNonNull(r1, r0)
            throw r1
        L_0x0442:
            r9 = r4
            goto L_0x0432
        L_0x0444:
            boolean r0 = r11.j
            if (r0 != 0) goto L_0x044f
            r0 = 495(0x1ef, float:6.94E-43)
            r2 = 1
            oge r11 = defpackage.oge.a(r11, r1, r2, r0)
        L_0x044f:
            r7e r0 = r6.i
            java.lang.Object r0 = r0.getValue()
            rw8 r0 = (defpackage.rw8) r0
            java.lang.Object r1 = r7.getValue()
            jr0 r1 = (defpackage.jr0) r1
            boolean r2 = r27.d()
            p0a r1 = (defpackage.p0a) r1
            android.content.Context r1 = r1.a
            km4 r1 = r9.n(r1)
            pda r1 = r1.g()
            jo2 r1 = r1.a()
            dr0 r1 = r1.a(r2)
            gr0 r1 = r1.b
            int r1 = r1.d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            float r2 = r11.a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            wia r3 = new wia
            r3.<init>(r1, r2)
            java.lang.Object r0 = r0.c(r3)
            if (r0 == 0) goto L_0x04b7
            r19 = r0
            android.text.TextPaint r19 = (android.text.TextPaint) r19
            int r0 = r11.h
            int r0 = r28 - r0
            int r1 = r11.i
            int r20 = r0 - r1
            t97 r0 = r6.e
            java.lang.Object r0 = r0.getValue()
            r17 = r0
            p97 r17 = (defpackage.p97) r17
            boolean r0 = r11.c
            android.text.TextUtils$TruncateAt r1 = r11.f
            int r2 = r11.e
            r18 = r10
            r21 = r2
            r22 = r0
            r23 = r1
            android.text.Layout r0 = r17.a(r18, r19, r20, r21, r22, r23)
            return r0
        L_0x04b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.b(i22, xm8, int, java.lang.CharSequence, boolean):android.text.Layout");
    }
}
