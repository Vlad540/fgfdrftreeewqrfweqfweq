package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;

/* renamed from: wv4  reason: default package */
public final class wv4 implements fu4 {
    public final Context a;
    public final r7e b = new r7e(new vv4(this, 0));
    public final cv4 c;
    public final jj7 d;
    public final r7e e;
    public final r7e f;

    public wv4(Context context, t97 t97) {
        this.a = context;
        this.c = new cv4(context);
        this.d = new jj7(8);
        this.e = new r7e(new zu4((Object) this, t97, 1));
        this.f = new r7e(new vv4(this, 1));
    }

    public final pj5 a() {
        return ((bv4) this.e.getValue()).e;
    }

    public final void b(Activity activity) {
        ((bv4) this.e.getValue()).b(activity);
    }

    public final hnd c(String str) {
        nv4 a2 = ((ou4) this.b.getValue()).a(str, 0, str.length());
        if (a2 == null) {
            return null;
        }
        cv4 cv4 = this.c;
        cv4.getClass();
        return new hnd(a2, a24.X(((float) 28) * dh4.c().getDisplayMetrics().density), new it4(this.d, cv4, (bv4) this.e.getValue()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List d(java.lang.CharSequence r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x00e1
            int r0 = r14.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00e1
        L_0x000a:
            r7e r13 = r13.f
            java.lang.Object r13 = r13.getValue()
            xu4 r13 = (defpackage.xu4) r13
            int r0 = r14.length()
            r13.getClass()
            boolean r1 = r14 instanceof android.text.Spannable
            if (r1 == 0) goto L_0x0020
            android.text.Spannable r14 = (android.text.Spannable) r14
            goto L_0x0028
        L_0x0020:
            android.text.Spannable$Factory r1 = android.text.Spannable.Factory.getInstance()
            android.text.Spannable r14 = r1.newSpannable(r14)
        L_0x0028:
            gvf r1 = new gvf
            r1.<init>(r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ou4 r13 = r13.a
            r3 = 0
        L_0x0035:
            if (r3 >= r0) goto L_0x00e3
            int r4 = r1.s(r3)
            r5 = 0
            if (r4 >= 0) goto L_0x0040
            r4 = r5
            goto L_0x0046
        L_0x0040:
            java.lang.Object r6 = r1.b
            xld[] r6 = (defpackage.xld[]) r6
            r4 = r6[r4]
        L_0x0046:
            r6 = 1
            java.lang.String r7 = ", "
            java.lang.String r8 = "Can't subSequence by "
            java.lang.Class<xu4> r9 = defpackage.xu4.class
            if (r4 != 0) goto L_0x00a7
            int r4 = r1.s(r3)
            r10 = -1
            if (r4 < 0) goto L_0x0065
            java.lang.Object r11 = r1.b
            xld[] r11 = (defpackage.xld[]) r11
            int r12 = r11.length
            int r12 = r12 - r6
            if (r4 > r12) goto L_0x0065
            int r4 = r4 + 1
            r4 = r11[r4]
            int r4 = r4.a
            goto L_0x0066
        L_0x0065:
            r4 = r10
        L_0x0066:
            if (r4 != r10) goto L_0x0069
            r4 = r0
        L_0x0069:
            nv4 r4 = r13.a(r14, r3, r4)
            if (r4 == 0) goto L_0x00a4
            int r10 = r4.b()
            int r10 = r10 + r3
            java.lang.CharSequence r11 = r14.subSequence(r3, r10)     // Catch:{ Exception -> 0x0086 }
            fz6 r12 = new fz6     // Catch:{ Exception -> 0x0086 }
            r12.<init>(r3, r10, r6)     // Catch:{ Exception -> 0x0086 }
            wia r6 = new wia     // Catch:{ Exception -> 0x0086 }
            r6.<init>(r11, r12)     // Catch:{ Exception -> 0x0086 }
            r2.add(r6)     // Catch:{ Exception -> 0x0086 }
            goto L_0x009e
        L_0x0086:
            java.lang.String r6 = r9.getName()
            fn6 r9 = udd.e
            if (r9 != 0) goto L_0x008f
            goto L_0x009e
        L_0x008f:
            boolean r11 = r9.c()
            if (r11 == 0) goto L_0x009e
            tn7 r11 = defpackage.tn7.w0
            java.lang.String r7 = defpackage.me4.g(r8, r3, r10, r7)
            r9.d(r11, r6, r7, r5)
        L_0x009e:
            int r4 = r4.b()
            int r3 = r3 + r4
            goto L_0x0035
        L_0x00a4:
            int r3 = r3 + 1
            goto L_0x0035
        L_0x00a7:
            int r3 = r4.a     // Catch:{ Exception -> 0x00c1 }
            int r10 = r4.b     // Catch:{ Exception -> 0x00c1 }
            java.lang.CharSequence r3 = r14.subSequence(r3, r10)     // Catch:{ Exception -> 0x00c1 }
            fz6 r10 = new fz6     // Catch:{ Exception -> 0x00c1 }
            int r11 = r4.a     // Catch:{ Exception -> 0x00c1 }
            int r12 = r4.b     // Catch:{ Exception -> 0x00c1 }
            r10.<init>(r11, r12, r6)     // Catch:{ Exception -> 0x00c1 }
            wia r6 = new wia     // Catch:{ Exception -> 0x00c1 }
            r6.<init>(r3, r10)     // Catch:{ Exception -> 0x00c1 }
            r2.add(r6)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x00dd
        L_0x00c1:
            java.lang.String r3 = r9.getName()
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x00ca
            goto L_0x00dd
        L_0x00ca:
            boolean r9 = r6.c()
            if (r9 == 0) goto L_0x00dd
            tn7 r9 = defpackage.tn7.w0
            int r10 = r4.a
            int r11 = r4.b
            java.lang.String r7 = defpackage.me4.g(r8, r10, r11, r7)
            r6.d(r9, r3, r7, r5)
        L_0x00dd:
            int r3 = r4.b
            goto L_0x0035
        L_0x00e1:
            hw4 r2 = hw4.a
        L_0x00e3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv4.d(java.lang.CharSequence):java.util.List");
    }

    public final Spannable e(int i, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        xu4 xu4 = (xu4) this.f.getValue();
        xu4.getClass();
        Spannable newSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence);
        gvf gvf = new gvf(newSpannable);
        int i2 = 0;
        while (i2 < length) {
            int s = gvf.s(i2);
            xld[] xldArr = (xld[]) gvf.b;
            xld xld = s < 0 ? null : xldArr[s];
            if (xld == null) {
                int s2 = gvf.s(i2);
                int i3 = (s2 < 0 || s2 > xldArr.length + -1) ? -1 : xldArr[s2 + 1].a;
                if (i3 == -1) {
                    i3 = length;
                }
                nv4 a2 = xu4.a.a(newSpannable, i2, i3);
                if (a2 != null) {
                    cv4 cv4 = xu4.c;
                    jj7 jj7 = xu4.b;
                    it4 it4 = new it4(jj7, cv4, (bv4) xu4.d.getValue());
                    kr7 kr7 = (kr7) jj7.c;
                    fmd fmd = (fmd) kr7.c(a2);
                    if (fmd == null) {
                        fmd = new fmd(0);
                        kr7.d(a2, fmd);
                    }
                    hnd hnd = (hnd) fmd.c(i);
                    if (hnd == null) {
                        hnd = new hnd(a2, i, it4);
                        fmd.d(i, hnd);
                    }
                    newSpannable.setSpan(new yu4(hnd), i2, a2.b() + i2, 33);
                    i2 += a2.b();
                } else {
                    i2++;
                }
            } else {
                i2 = xld.b;
            }
        }
        return newSpannable;
    }
}
