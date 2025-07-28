package defpackage;

/* renamed from: im6  reason: default package */
public abstract class im6 {
    static {
        new uu0("\"\\".getBytes(e22.a)).b = "\"\\";
        new uu0("\t ,=".getBytes(e22.a)).b = "\t ,=";
    }

    public static final boolean a(xbc xbc) {
        if (hhd.f(xbc.a.c, "HEAD")) {
            return false;
        }
        int i = xbc.o;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && nze.j(xbc) == -1) {
            String a = xbc.Y.a("Transfer-Encoding");
            if (a == null) {
                a = null;
            }
            return "chunked".equalsIgnoreCase(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0213 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(oa2 r35, defpackage.sm6 r36, defpackage.ye6 r37) {
        /*
            r0 = r37
            r1 = 1
            oa2 r2 = oa2.b
            r3 = r35
            if (r3 != r2) goto L_0x000a
            return
        L_0x000a:
            java.util.regex.Pattern r2 = defpackage.ht3.j
            int r2 = r37.size()
            r3 = 0
            r5 = r3
            r6 = 0
        L_0x0013:
            r7 = 2
            if (r5 >= r2) goto L_0x0032
            java.lang.String r8 = r0.b(r5)
            java.lang.String r9 = "Set-Cookie"
            boolean r8 = r9.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0030
            if (r6 != 0) goto L_0x0029
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r7)
        L_0x0029:
            java.lang.String r7 = r0.d(r5)
            r6.add(r7)
        L_0x0030:
            int r5 = r5 + r1
            goto L_0x0013
        L_0x0032:
            hw4 r2 = defpackage.hw4.a
            if (r6 == 0) goto L_0x003c
            java.util.List r0 = java.util.Collections.unmodifiableList(r6)
            r5 = r0
            goto L_0x003d
        L_0x003c:
            r5 = r2
        L_0x003d:
            int r6 = r5.size()
            r8 = r3
            r9 = 0
        L_0x0043:
            if (r8 >= r6) goto L_0x0218
            java.lang.Object r0 = r5.get(r8)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            long r11 = java.lang.System.currentTimeMillis()
            r13 = 59
            r14 = 6
            int r0 = defpackage.nze.g(r10, r13, r3, r3, r14)
            r15 = 61
            int r4 = defpackage.nze.g(r10, r15, r3, r0, r7)
            if (r4 != r0) goto L_0x0065
        L_0x005f:
            r4 = r3
            r0 = 0
            r3 = r36
            goto L_0x0207
        L_0x0065:
            java.lang.String r17 = defpackage.nze.y(r3, r4, r10)
            int r16 = r17.length()
            if (r16 != 0) goto L_0x0070
            goto L_0x0077
        L_0x0070:
            int r7 = defpackage.nze.l(r17)
            r14 = -1
            if (r7 == r14) goto L_0x0078
        L_0x0077:
            goto L_0x005f
        L_0x0078:
            int r4 = r4 + r1
            java.lang.String r18 = defpackage.nze.y(r4, r0, r10)
            int r4 = defpackage.nze.l(r18)
            if (r4 == r14) goto L_0x0084
            goto L_0x005f
        L_0x0084:
            int r0 = r0 + r1
            int r4 = r10.length()
            r19 = -1
            r21 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r26 = r1
            r23 = r3
            r24 = r23
            r25 = r24
            r27 = r19
            r29 = r21
            r7 = 0
            r14 = 0
        L_0x009e:
            r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r33 = -9223372036854775808
            if (r0 >= r4) goto L_0x0163
            int r3 = defpackage.nze.e(r13, r0, r4, r10)
            int r13 = defpackage.nze.e(r15, r0, r3, r10)
            java.lang.String r0 = defpackage.nze.y(r0, r13, r10)
            if (r13 >= r3) goto L_0x00bb
            int r13 = r13 + r1
            java.lang.String r13 = defpackage.nze.y(r13, r3, r10)
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r13 = ""
        L_0x00bd:
            java.lang.String r15 = "expires"
            boolean r15 = r0.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x00d1
            int r0 = r13.length()     // Catch:{ IllegalArgumentException -> 0x015a }
            long r29 = defpackage.oyb.M(r0, r13)     // Catch:{ IllegalArgumentException -> 0x015a }
        L_0x00cd:
            r25 = r1
            goto L_0x015a
        L_0x00d1:
            java.lang.String r15 = "max-age"
            boolean r15 = r0.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x010a
            long r27 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x00e9 }
            r31 = 0
            int r0 = (r27 > r31 ? 1 : (r27 == r31 ? 0 : -1))
            if (r0 > 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r33 = r27
        L_0x00e6:
            r27 = r33
            goto L_0x00cd
        L_0x00e9:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = "-?\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{  }
            java.util.regex.Matcher r0 = r0.matcher(r13)     // Catch:{  }
            boolean r0 = r0.matches()     // Catch:{  }
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "-"
            r15 = 0
            boolean r0 = defpackage.p0e.Q(r13, r0, r15)     // Catch:{  }
            if (r0 == 0) goto L_0x0106
            r31 = r33
        L_0x0106:
            r27 = r31
            goto L_0x00cd
        L_0x0109:
            throw r15     // Catch:{  }
        L_0x010a:
            java.lang.String r15 = "domain"
            boolean r15 = r0.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x013b
            java.lang.String r0 = "."
            boolean r15 = r13.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x015a }
            r15 = r15 ^ r1
            if (r15 == 0) goto L_0x012f
            java.lang.String r0 = defpackage.h0e.k0(r13, r0)     // Catch:{ IllegalArgumentException -> 0x015a }
            java.lang.String r0 = bm3.J(r0)     // Catch:{ IllegalArgumentException -> 0x015a }
            if (r0 == 0) goto L_0x0129
            r7 = r0
            r26 = 0
            goto L_0x015a
        L_0x0129:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x015a }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x015a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x015a }
        L_0x012f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x015a }
            java.lang.String r13 = "Failed requirement."
            java.lang.String r13 = r13.toString()     // Catch:{ IllegalArgumentException -> 0x015a }
            r0.<init>(r13)     // Catch:{ IllegalArgumentException -> 0x015a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x015a }
        L_0x013b:
            java.lang.String r15 = "path"
            boolean r15 = r0.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x0145
            r14 = r13
            goto L_0x015a
        L_0x0145:
            java.lang.String r13 = "secure"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0150
            r23 = r1
            goto L_0x015a
        L_0x0150:
            java.lang.String r13 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x015a
            r24 = r1
        L_0x015a:
            int r0 = r3 + 1
            r3 = 0
            r13 = 59
            r15 = 61
            goto L_0x009e
        L_0x0163:
            int r0 = (r27 > r33 ? 1 : (r27 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x016c
            r3 = r36
            r19 = r33
            goto L_0x0197
        L_0x016c:
            int r0 = (r27 > r19 ? 1 : (r27 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0193
            r3 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x017e
            r0 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r0
            long r31 = r27 * r3
        L_0x017e:
            long r31 = r11 + r31
            int r0 = (r31 > r11 ? 1 : (r31 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x018e
            int r0 = (r31 > r21 ? 1 : (r31 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0189
            goto L_0x018e
        L_0x0189:
            r3 = r36
            r19 = r31
            goto L_0x0197
        L_0x018e:
            r3 = r36
            r19 = r21
            goto L_0x0197
        L_0x0193:
            r3 = r36
            r19 = r29
        L_0x0197:
            java.lang.String r0 = r3.e
            if (r7 != 0) goto L_0x019d
            r7 = r0
            goto L_0x01c4
        L_0x019d:
            boolean r4 = defpackage.hhd.f(r0, r7)
            if (r4 == 0) goto L_0x01a4
            goto L_0x01c4
        L_0x01a4:
            boolean r4 = r0.endsWith(r7)
            if (r4 == 0) goto L_0x0205
            int r4 = r0.length()
            int r10 = r7.length()
            int r4 = r4 - r10
            int r4 = r4 - r1
            char r4 = r0.charAt(r4)
            r10 = 46
            if (r4 != r10) goto L_0x0205
            p7c r4 = defpackage.nze.f
            boolean r4 = r4.a(r0)
            if (r4 != 0) goto L_0x0205
        L_0x01c4:
            int r0 = r0.length()
            int r4 = r7.length()
            if (r0 == r4) goto L_0x01d9
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.g
            java.lang.String r0 = r0.a(r7)
            if (r0 != 0) goto L_0x01d9
            r0 = 0
            r4 = 0
            goto L_0x0207
        L_0x01d9:
            java.lang.String r0 = "/"
            r4 = 0
            if (r14 == 0) goto L_0x01e8
            boolean r10 = defpackage.p0e.Q(r14, r0, r4)
            if (r10 != 0) goto L_0x01e5
            goto L_0x01e8
        L_0x01e5:
            r22 = r14
            goto L_0x01fb
        L_0x01e8:
            java.lang.String r10 = r36.b()
            r11 = 47
            r12 = 6
            int r11 = defpackage.h0e.e0(r10, r11, r4, r12)
            if (r11 == 0) goto L_0x01f9
            java.lang.String r0 = r10.substring(r4, r11)
        L_0x01f9:
            r22 = r0
        L_0x01fb:
            ht3 r0 = new ht3
            r16 = r0
            r21 = r7
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26)
            goto L_0x0207
        L_0x0205:
            r4 = 0
            r0 = 0
        L_0x0207:
            if (r0 == 0) goto L_0x0213
            if (r9 != 0) goto L_0x0210
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0210:
            r9.add(r0)
        L_0x0213:
            int r8 = r8 + r1
            r3 = r4
            r7 = 2
            goto L_0x0043
        L_0x0218:
            if (r9 == 0) goto L_0x021e
            java.util.List r2 = java.util.Collections.unmodifiableList(r9)
        L_0x021e:
            r2.isEmpty()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im6.b(oa2, sm6, ye6):void");
    }
}
