package defpackage;

import android.os.Looper;

/* renamed from: lt4  reason: default package */
public final class lt4 {
    public final Object a;
    public volatile Object b;
    public volatile Object c;

    public /* synthetic */ lt4(Object obj) {
        this.a = obj;
    }

    public void a() {
        String str;
        az3 az3;
        kj kjVar = (kj) this.a;
        xwb xwb = (xwb) kjVar.a.b;
        Integer num = kjVar.c;
        Integer num2 = (Integer) this.b;
        if (num2 != null) {
            iu7.f(16);
            String l = Long.toString(((long) num2.intValue()) & 4294967295L, 16);
            int i = 6;
            if (l.length() > 6) {
                i = 8;
            }
            str = h0e.h0(l, i, '0');
        } else {
            str = null;
        }
        az3 az32 = ((kj) this.a).d;
        Boolean valueOf = az32 != null ? Boolean.valueOf(az32.b()) : null;
        xwb.log("AniSend", kjVar + ": isReady: v=" + num + " bgColor=" + str + "} connected=" + valueOf + " senderThread=" + ((kj) this.a).e);
        Integer num3 = ((kj) this.a).c;
        if (num3 != null) {
            if (num3.intValue() == 1 || (((Integer) this.b) != null && ((kj) this.a).e != null && (az3 = ((kj) this.a).d) != null && az3.b())) {
                ((kj) this.a).g = null;
                Integer num4 = (Integer) this.b;
                if (num4 != null) {
                    ((kj) this.a).c(num4.intValue());
                }
                if (((Double[]) this.c) != null) {
                    kj kjVar2 = (kj) this.a;
                    lt4 lt4 = kjVar2.g;
                    Integer num5 = kjVar2.c;
                    if (lt4 != null) {
                        lt4.c = null;
                    } else if (num5 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
                        xwb xwb2 = (xwb) kjVar2.a.b;
                        String message = illegalStateException.getMessage();
                        if (message == null) {
                            message = "animoji error";
                        }
                        xwb2.reportException("AniSend", message, illegalStateException);
                        lt4 lt42 = new lt4(kjVar2);
                        lt42.c = null;
                        kjVar2.g = lt42;
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public void b(jh7 jh7) {
        ((yf6) this.a).execute(new mzf((Object) this, 0, (Object) jh7));
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [vue, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[Catch:{ all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[Catch:{ all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence c(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            java.lang.Object r10 = r10.b
            r0 = r10
            te r0 = (defpackage.te) r0
            r0.getClass()
            boolean r10 = r11 instanceof defpackage.amd
            if (r10 == 0) goto L_0x0012
            r1 = r11
            amd r1 = (defpackage.amd) r1
            r1.a()
        L_0x0012:
            r1 = 0
            java.lang.Class<ite> r2 = defpackage.ite.class
            if (r10 != 0) goto L_0x0041
            boolean r3 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x001c
            goto L_0x0041
        L_0x001c:
            boolean r3 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x003f
            r3 = r11
            android.text.Spanned r3 = (android.text.Spanned) r3     // Catch:{ all -> 0x003c }
            int r4 = r12 + -1
            int r5 = r13 + 1
            int r3 = r3.nextSpanTransition(r4, r5, r2)     // Catch:{ all -> 0x003c }
            if (r3 > r13) goto L_0x003f
            vue r3 = new vue     // Catch:{ all -> 0x003c }
            r3.<init>()     // Catch:{ all -> 0x003c }
            r3.a = r1     // Catch:{ all -> 0x003c }
            android.text.SpannableString r4 = new android.text.SpannableString     // Catch:{ all -> 0x003c }
            r4.<init>(r11)     // Catch:{ all -> 0x003c }
            r3.b = r4     // Catch:{ all -> 0x003c }
            goto L_0x0049
        L_0x003c:
            r12 = move-exception
            goto L_0x00c8
        L_0x003f:
            r3 = 0
            goto L_0x0049
        L_0x0041:
            vue r3 = new vue     // Catch:{ all -> 0x003c }
            r4 = r11
            android.text.Spannable r4 = (android.text.Spannable) r4     // Catch:{ all -> 0x003c }
            r3.<init>(r4)     // Catch:{ all -> 0x003c }
        L_0x0049:
            if (r3 == 0) goto L_0x007a
            android.text.Spannable r4 = r3.b     // Catch:{ all -> 0x003c }
            java.lang.Object[] r4 = r4.getSpans(r12, r13, r2)     // Catch:{ all -> 0x003c }
            ite[] r4 = (defpackage.ite[]) r4     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x007a
            int r5 = r4.length     // Catch:{ all -> 0x003c }
            if (r5 <= 0) goto L_0x007a
            int r5 = r4.length     // Catch:{ all -> 0x003c }
            r6 = r1
        L_0x005a:
            if (r6 >= r5) goto L_0x007a
            r7 = r4[r6]     // Catch:{ all -> 0x003c }
            android.text.Spannable r8 = r3.b     // Catch:{ all -> 0x003c }
            int r8 = r8.getSpanStart(r7)     // Catch:{ all -> 0x003c }
            android.text.Spannable r9 = r3.b     // Catch:{ all -> 0x003c }
            int r9 = r9.getSpanEnd(r7)     // Catch:{ all -> 0x003c }
            if (r8 == r13) goto L_0x006f
            r3.removeSpan(r7)     // Catch:{ all -> 0x003c }
        L_0x006f:
            int r12 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x003c }
            int r13 = java.lang.Math.max(r9, r13)     // Catch:{ all -> 0x003c }
            int r6 = r6 + 1
            goto L_0x005a
        L_0x007a:
            if (r12 == r13) goto L_0x00c4
            int r4 = r11.length()     // Catch:{ all -> 0x003c }
            if (r12 < r4) goto L_0x0083
            goto L_0x00c4
        L_0x0083:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r4) goto L_0x009a
            if (r3 == 0) goto L_0x009a
            android.text.Spannable r4 = r3.b     // Catch:{ all -> 0x003c }
            int r4 = r4.length()     // Catch:{ all -> 0x003c }
            android.text.Spannable r5 = r3.b     // Catch:{ all -> 0x003c }
            java.lang.Object[] r1 = r5.getSpans(r1, r4, r2)     // Catch:{ all -> 0x003c }
            ite[] r1 = (defpackage.ite[]) r1     // Catch:{ all -> 0x003c }
            int r1 = r1.length     // Catch:{ all -> 0x003c }
            int r14 = r14 - r1
        L_0x009a:
            r4 = r14
            otf r6 = new otf     // Catch:{ all -> 0x003c }
            java.lang.Object r14 = r0.b     // Catch:{ all -> 0x003c }
            qr4 r14 = (defpackage.qr4) r14     // Catch:{ all -> 0x003c }
            r6.<init>(r3, r14)     // Catch:{ all -> 0x003c }
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            java.lang.Object r12 = r0.c(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x003c }
            vue r12 = (defpackage.vue) r12     // Catch:{ all -> 0x003c }
            if (r12 == 0) goto L_0x00bb
            android.text.Spannable r12 = r12.b     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x00b9
            amd r11 = (defpackage.amd) r11
            r11.b()
        L_0x00b9:
            r11 = r12
            goto L_0x00c7
        L_0x00bb:
            if (r10 == 0) goto L_0x00c7
        L_0x00bd:
            r10 = r11
            amd r10 = (defpackage.amd) r10
            r10.b()
            goto L_0x00c7
        L_0x00c4:
            if (r10 == 0) goto L_0x00c7
            goto L_0x00bd
        L_0x00c7:
            return r11
        L_0x00c8:
            if (r10 == 0) goto L_0x00cf
            amd r11 = (defpackage.amd) r11
            r11.b()
        L_0x00cf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt4.c(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public lt4(Looper looper, ta6 ta6, String str) {
        this.a = new yf6(looper);
        this.b = ta6;
        a24.k(str);
        this.c = new ih7(ta6, str);
    }
}
