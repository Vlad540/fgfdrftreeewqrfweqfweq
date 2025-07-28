package defpackage;

import java.util.List;

/* renamed from: m86  reason: default package */
public final class m86 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public m86(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [kcc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096 A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009c A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009f A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(defpackage.i22 r17, java.lang.CharSequence r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = 0
            if (r18 == 0) goto L_0x000c
            java.lang.CharSequence r3 = h0e.B0(r18)
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            if (r3 == 0) goto L_0x0133
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0017
            goto L_0x0133
        L_0x0017:
            t97 r4 = r1.a
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x003e
            java.lang.Object r4 = r4.getValue()
            w6a r4 = (w6a) r4
            r4.getClass()
            o62 r0 = r0.b
            java.util.Map r7 = r0.e
            int r7 = r7.size()
            int r0 = r0.c()
            if (r7 < r0) goto L_0x0036
            r0 = r6
            goto L_0x0037
        L_0x0036:
            r0 = r5
        L_0x0037:
            v6a r4 = r4.n
            java.util.List r0 = r4.c(r3, r0)
            goto L_0x004a
        L_0x003e:
            java.lang.Object r0 = r4.getValue()
            w6a r0 = (w6a) r0
            v6a r0 = r0.n
            java.util.List r0 = r0.c(r3, r6)
        L_0x004a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ r6
            ep8 r15 = defpackage.ep8.Y
            java.lang.String r14 = "url"
            if (r0 == 0) goto L_0x00d7
            java.util.Iterator r7 = r4.iterator()
            r0 = r5
        L_0x005f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d6
            java.lang.Object r8 = r7.next()
            fp8 r8 = (defpackage.fp8) r8
            if (r0 != 0) goto L_0x0086
            ep8 r0 = r8.c
            r0.getClass()
            ep8 r9 = defpackage.ep8.a
            if (r0 == r9) goto L_0x007a
            ep8 r9 = defpackage.ep8.b
            if (r0 != r9) goto L_0x0084
        L_0x007a:
            java.lang.String r0 = r8.b
            if (r0 == 0) goto L_0x0084
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0086
        L_0x0084:
            r9 = r5
            goto L_0x0087
        L_0x0086:
            r9 = r6
        L_0x0087:
            java.util.Map r0 = r8.f
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r10 = r0.get(r14)
            if (r10 != 0) goto L_0x0092
            goto L_0x00d4
        L_0x0092:
            boolean r0 = r3 instanceof android.text.Spanned     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x009c
            r0 = r3
            android.text.Spanned r0 = (android.text.Spanned) r0     // Catch:{ all -> 0x009a }
            goto L_0x009d
        L_0x009a:
            r0 = move-exception
            goto L_0x00af
        L_0x009c:
            r0 = r2
        L_0x009d:
            if (r0 == 0) goto L_0x00ad
            int r11 = r8.d     // Catch:{ all -> 0x009a }
            int r12 = r8.e     // Catch:{ all -> 0x009a }
            int r12 = r12 + r11
            java.lang.Class<lf7> r13 = defpackage.lf7.class
            java.lang.Object[] r0 = r0.getSpans(r11, r12, r13)     // Catch:{ all -> 0x009a }
            lf7[] r0 = (defpackage.lf7[]) r0     // Catch:{ all -> 0x009a }
            goto L_0x00b5
        L_0x00ad:
            r0 = r2
            goto L_0x00b5
        L_0x00af:
            kcc r11 = new kcc
            r11.<init>(r0)
            r0 = r11
        L_0x00b5:
            boolean r11 = r0 instanceof kcc
            if (r11 == 0) goto L_0x00ba
            r0 = r2
        L_0x00ba:
            lf7[] r0 = (defpackage.lf7[]) r0
            ep8 r8 = r8.c
            if (r8 != r15) goto L_0x00d4
            boolean r8 = r10 instanceof java.lang.CharSequence
            if (r8 == 0) goto L_0x00d4
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r8 = h0e.R(r3, r10, r5)
            if (r8 != 0) goto L_0x00d4
            if (r0 == 0) goto L_0x00d1
            int r0 = r0.length
            if (r0 != 0) goto L_0x00d4
        L_0x00d1:
            r7.remove()
        L_0x00d4:
            r0 = r9
            goto L_0x005f
        L_0x00d6:
            r5 = r0
        L_0x00d7:
            t97 r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            bd r0 = (defpackage.bd) r0
            in7 r1 = r0.a()
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x00ea
            goto L_0x00ef
        L_0x00ea:
            java.lang.String r1 = "MENTION_MSG_SEND"
            r0.d(r5, r1)
        L_0x00ef:
            java.util.regex.Pattern r0 = android.util.Patterns.WEB_URL
            java.util.regex.Matcher r1 = r0.matcher(r3)
        L_0x00f5:
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = r1.group()     // Catch:{ all -> 0x0124 }
            fp8 r2 = new fp8     // Catch:{ all -> 0x0124 }
            int r12 = r1.start()     // Catch:{ all -> 0x0124 }
            int r3 = r1.end()     // Catch:{ all -> 0x0124 }
            int r5 = r1.start()     // Catch:{ all -> 0x0124 }
            int r13 = r3 - r5
            java.util.Map r0 = java.util.Collections.singletonMap(r14, r0)     // Catch:{ all -> 0x0124 }
            r8 = 0
            r10 = 0
            r7 = r2
            r11 = r15
            r3 = r14
            r14 = r0
            r7.<init>(r8, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r4.add(r2)     // Catch:{ all -> 0x0122 }
        L_0x0120:
            r14 = r3
            goto L_0x00f5
        L_0x0122:
            r0 = move-exception
            goto L_0x0126
        L_0x0124:
            r0 = move-exception
            r3 = r14
        L_0x0126:
            java.lang.Class<m86> r2 = defpackage.m86.class
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = "failure to find link"
            udd.s(r2, r5, r0)
            goto L_0x0120
        L_0x0132:
            return r4
        L_0x0133:
            hw4 r0 = hw4.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m86.a(i22, java.lang.CharSequence):java.util.List");
    }

    public final List b(CharSequence charSequence, long j) {
        i22 i22 = (i22) ((aw2) ((bv2) this.b.getValue())).m(j).a.getValue();
        return i22 == null ? hw4.a : a(i22, charSequence);
    }
}
