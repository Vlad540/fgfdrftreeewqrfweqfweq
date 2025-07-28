package defpackage;

/* renamed from: p97  reason: default package */
public final class p97 {
    public final g15 a;
    public final String b = p97.class.getName();
    public final r7e c;
    public final za6 d;
    public final ThreadLocal e;

    public p97(pae pae, g15 g15) {
        this.a = g15;
        this.c = new r7e(new dv2(pae, 1));
        this.d = new za6(g15);
        this.e = ThreadLocal.withInitial(new tj(1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: android.text.StaticLayout} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r15.charAt(0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout a(java.lang.CharSequence r15, android.text.TextPaint r16, int r17, int r18, boolean r19, android.text.TextUtils.TruncateAt r20) {
        /*
            r14 = this;
            r10 = r14
            r0 = r15
            r9 = r16
            int r1 = r15.length()
            r2 = 0
            if (r1 != 0) goto L_0x000c
            goto L_0x001c
        L_0x000c:
            char r1 = r15.charAt(r2)
            r3 = 1424(0x590, float:1.995E-42)
            if (r3 > r1) goto L_0x001c
            r3 = 1792(0x700, float:2.511E-42)
            if (r1 >= r3) goto L_0x001c
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x001a:
            r11 = r1
            goto L_0x001f
        L_0x001c:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x001a
        L_0x001f:
            int r1 = r15.length()
            float r1 = r9.measureText(r15, r2, r1)
            int r12 = a24.X(r1)
            java.lang.ThreadLocal r1 = r10.e
            java.lang.Object r2 = r1.get()
            android.text.BoringLayout$Metrics r2 = (android.text.BoringLayout.Metrics) r2
            android.text.BoringLayout$Metrics r2 = android.text.BoringLayout.isBoring(r15, r9, r2)
            if (r2 == 0) goto L_0x0080
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L_0x0074
            android.text.BoringLayout$Metrics r2 = (android.text.BoringLayout.Metrics) r2
            int r2 = r2.width
            r13 = r17
            if (r2 > r13) goto L_0x0082
            java.lang.Object r1 = r1.get()
            r7 = r1
            android.text.BoringLayout$Metrics r7 = (android.text.BoringLayout.Metrics) r7
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r8 = 0
            r1 = r15
            r2 = r16
            r3 = r12
            r4 = r11
            android.text.BoringLayout r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8)
            int r2 = r1.getHeight()
            if (r2 != 0) goto L_0x0094
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r12
            r5 = r17
            r6 = r11
            r7 = r19
            r8 = r20
            r9 = r18
            android.text.StaticLayout r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0094
        L_0x0074:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0080:
            r13 = r17
        L_0x0082:
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r12
            r5 = r17
            r6 = r11
            r7 = r19
            r8 = r20
            r9 = r18
            android.text.StaticLayout r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0094:
            r7e r0 = r10.c     // Catch:{ all -> 0x00ac }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00ac }
            ja6 r0 = (defpackage.ja6) r0     // Catch:{ all -> 0x00ac }
            r0.getClass()     // Catch:{ all -> 0x00ac }
            ia6 r2 = new ia6     // Catch:{ all -> 0x00ac }
            r3 = 0
            r2.<init>(r1, r0, r3)     // Catch:{ all -> 0x00ac }
            ou3 r0 = r0.a     // Catch:{ all -> 0x00ac }
            r4 = 3
            xs7.E(r0, r3, r3, r2, r4)     // Catch:{ all -> 0x00ac }
            goto L_0x00b4
        L_0x00ac:
            r0 = move-exception
            java.lang.String r2 = r10.b
            java.lang.String r3 = "could not warm layout"
            udd.S(r2, r3, r0)
        L_0x00b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p97.a(java.lang.CharSequence, android.text.TextPaint, int, int, boolean, android.text.TextUtils$TruncateAt):android.text.Layout");
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0163 A[SYNTHETIC, Splitter:B:67:0x0163] */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.StaticLayout c(java.lang.CharSequence r18, android.text.TextPaint r19, int r20, int r21, android.text.Layout.Alignment r22, boolean r23, android.text.TextUtils.TruncateAt r24, int r25) {
        /*
            r17 = this;
            r1 = r17
            r10 = r21
            java.lang.String r11 = r1.b
            r12 = 0
            float r0 = android.text.Layout.getDesiredWidth(r18, r19)     // Catch:{ all -> 0x0012 }
            int r0 = a24.X(r0)     // Catch:{ all -> 0x0012 }
            r2 = r20
            goto L_0x0024
        L_0x0012:
            r0 = move-exception
            java.lang.String r2 = "fail to getDesiredWidth for message %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r18}
            udd.u(r11, r0, r2, r3)
            g15 r2 = r1.a
            ((r4a) r2).c(r0, false)
            r2 = r20
            r0 = r12
        L_0x0024:
            int r0 = java.lang.Math.max(r0, r2)
            if (r0 <= r10) goto L_0x002c
            r13 = r10
            goto L_0x002d
        L_0x002c:
            r13 = r0
        L_0x002d:
            za6 r2 = r1.d     // Catch:{ all -> 0x0042 }
            r3 = r18
            r4 = r19
            r5 = r13
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            android.text.StaticLayout r0 = r2.P(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0042 }
        L_0x0040:
            r2 = r0
            goto L_0x005e
        L_0x0042:
            r0 = move-exception
            java.lang.String r2 = "static layout create error"
            udd.s(r11, r2, r0)
            za6 r2 = r1.d
            java.lang.String r3 = r18.toString()
            r4 = r19
            r5 = r13
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            android.text.StaticLayout r0 = r2.P(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0040
        L_0x005e:
            int r0 = r2.getLineCount()
            r14 = 1
            if (r0 <= r14) goto L_0x019e
            int r0 = r2.getLineCount()     // Catch:{ all -> 0x009a }
            fz6 r0 = gwf.S(r12, r0)     // Catch:{ all -> 0x009a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009a }
            r3 = r0
            ez6 r3 = (ez6) r3     // Catch:{ all -> 0x009a }
            boolean r3 = r3.c     // Catch:{ all -> 0x009a }
            if (r3 == 0) goto L_0x00a5
            r3 = r0
            ez6 r3 = (ez6) r3     // Catch:{ all -> 0x009a }
            int r3 = r3.a()     // Catch:{ all -> 0x009a }
            float r3 = r2.getLineMax(r3)     // Catch:{ all -> 0x009a }
        L_0x0083:
            r4 = r0
            ez6 r4 = (ez6) r4     // Catch:{ all -> 0x009a }
            boolean r4 = r4.c     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x009c
            r4 = r0
            ez6 r4 = (ez6) r4     // Catch:{ all -> 0x009a }
            int r4 = r4.a()     // Catch:{ all -> 0x009a }
            float r4 = r2.getLineMax(r4)     // Catch:{ all -> 0x009a }
            float r3 = java.lang.Math.max(r3, r4)     // Catch:{ all -> 0x009a }
            goto L_0x0083
        L_0x009a:
            r0 = move-exception
            goto L_0x00ab
        L_0x009c:
            int r0 = a24.X(r3)     // Catch:{ all -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009a }
            goto L_0x00b1
        L_0x00a5:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x009a }
            r0.<init>()     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x00ab:
            kcc r3 = new kcc
            r3.<init>(r0)
            r0 = r3
        L_0x00b1:
            boolean r3 = r0 instanceof kcc
            r15 = 0
            if (r3 == 0) goto L_0x00b7
            r0 = r15
        L_0x00b7:
            r16 = r0
            java.lang.Integer r16 = (java.lang.Integer) r16
            if (r16 == 0) goto L_0x0151
            int r0 = r16.intValue()
            if (r0 >= r13) goto L_0x0154
            za6 r2 = r1.d     // Catch:{ all -> 0x00d9 }
            r3 = r18
            r4 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            android.text.StaticLayout r0 = r2.P(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00d9 }
        L_0x00d7:
            r2 = r0
            goto L_0x00f6
        L_0x00d9:
            r0 = move-exception
            java.lang.String r2 = "static layout create error 2"
            udd.s(r11, r2, r0)
            za6 r2 = r1.d
            java.lang.String r3 = r18.toString()
            r4 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            android.text.StaticLayout r0 = r2.P(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00d7
        L_0x00f6:
            int r0 = r2.getLineCount()
            if (r0 != r14) goto L_0x0151
            int r0 = r2.getLineCount()     // Catch:{ all -> 0x0131 }
            fz6 r0 = gwf.S(r12, r0)     // Catch:{ all -> 0x0131 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0131 }
            r3 = r0
            ez6 r3 = (ez6) r3     // Catch:{ all -> 0x0131 }
            boolean r3 = r3.c     // Catch:{ all -> 0x0131 }
            if (r3 == 0) goto L_0x013c
            r3 = r0
            ez6 r3 = (ez6) r3     // Catch:{ all -> 0x0131 }
            int r3 = r3.a()     // Catch:{ all -> 0x0131 }
            float r3 = r2.getLineMax(r3)     // Catch:{ all -> 0x0131 }
        L_0x011a:
            r4 = r0
            ez6 r4 = (ez6) r4     // Catch:{ all -> 0x0131 }
            boolean r4 = r4.c     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x0133
            r4 = r0
            ez6 r4 = (ez6) r4     // Catch:{ all -> 0x0131 }
            int r4 = r4.a()     // Catch:{ all -> 0x0131 }
            float r4 = r2.getLineMax(r4)     // Catch:{ all -> 0x0131 }
            float r3 = java.lang.Math.max(r3, r4)     // Catch:{ all -> 0x0131 }
            goto L_0x011a
        L_0x0131:
            r0 = move-exception
            goto L_0x0142
        L_0x0133:
            int r0 = a24.X(r3)     // Catch:{ all -> 0x0131 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0131 }
            goto L_0x0148
        L_0x013c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0131 }
            r0.<init>()     // Catch:{ all -> 0x0131 }
            throw r0     // Catch:{ all -> 0x0131 }
        L_0x0142:
            kcc r3 = new kcc
            r3.<init>(r0)
            r0 = r3
        L_0x0148:
            boolean r3 = r0 instanceof kcc
            if (r3 == 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r15 = r0
        L_0x014e:
            java.lang.Integer r15 = (java.lang.Integer) r15
            goto L_0x0161
        L_0x0151:
            r15 = r16
            goto L_0x0161
        L_0x0154:
            int r0 = r16.intValue()
            if (r0 < r13) goto L_0x0151
            if (r13 != r10) goto L_0x0151
            java.lang.String r0 = "maxLineWidth more than maxWidth"
            udd.U(r11, r0)
        L_0x0161:
            if (r15 == 0) goto L_0x019e
            za6 r3 = r1.d     // Catch:{ all -> 0x017d }
            int r0 = r15.intValue()     // Catch:{ all -> 0x017d }
            int r6 = r0 + 2
            r4 = r18
            r5 = r19
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            android.text.StaticLayout r0 = r3.P(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x017d }
        L_0x017b:
            r2 = r0
            goto L_0x019e
        L_0x017d:
            r0 = move-exception
            java.lang.String r2 = "static layout create error 3"
            udd.s(r11, r2, r0)
            java.lang.String r4 = r18.toString()
            int r0 = r15.intValue()
            int r6 = r0 + 2
            za6 r3 = r1.d
            r5 = r19
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            android.text.StaticLayout r0 = r3.P(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x017b
        L_0x019e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p97.c(java.lang.CharSequence, android.text.TextPaint, int, int, android.text.Layout$Alignment, boolean, android.text.TextUtils$TruncateAt, int):android.text.StaticLayout");
    }
}
