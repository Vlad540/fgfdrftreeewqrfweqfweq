package defpackage;

import java.util.EnumMap;

/* renamed from: nge  reason: default package */
public final class nge {
    public final boolean a;
    public final EnumMap b;
    public final EnumMap c;
    public final boolean d;
    public final long e;
    public final String f;
    public final int g;

    public nge(boolean z, EnumMap enumMap, EnumMap enumMap2, boolean z2, long j, String str, int i) {
        this.a = z;
        this.b = enumMap;
        this.c = enumMap2;
        this.d = z2;
        this.e = j;
        this.f = str;
        this.g = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: ah4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.text.TextPaint r4, android.util.DisplayMetrics r5, defpackage.yq4 r6) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f
            r1 = 0
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            int r2 = r3.g
            int r2 = defpackage.me4.b(r2)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2, r1)
            r4.setTypeface(r0)
            long r0 = r3.e
            float r0 = defpackage.ah4.d(r0, r5)
            r4.setLetterSpacing(r0)
            java.util.EnumMap r3 = r3.b
            java.lang.Object r6 = r3.get(r6)
            ah4 r6 = (defpackage.ah4) r6
            if (r6 != 0) goto L_0x0032
            java.util.Collection r3 = r3.values()
            java.lang.Object r3 = o23.U(r3)
            r6 = r3
            ah4 r6 = (defpackage.ah4) r6
        L_0x0032:
            long r0 = r6.a
            float r3 = defpackage.ah4.d(r0, r5)
            r4.setTextSize(r3)
            r3 = 1
            r4.setLinearText(r3)
            r4.setSubpixelText(r3)
            r4.setAntiAlias(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.a(android.text.TextPaint, android.util.DisplayMetrics, yq4):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ah4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.widget.TextView r5, defpackage.yq4 r6) {
        /*
            r4 = this;
            int r0 = defpackage.m9a.a
            r5.setTag(r0, r4)
            java.util.EnumMap r0 = r4.b
            java.lang.Object r1 = r0.get(r6)
            ah4 r1 = (defpackage.ah4) r1
            if (r1 != 0) goto L_0x001a
            java.util.Collection r0 = r0.values()
            java.lang.Object r0 = o23.U(r0)
            r1 = r0
            ah4 r1 = (defpackage.ah4) r1
        L_0x001a:
            boolean r0 = r4.a
            r5.setAllCaps(r0)
            long r0 = r1.a
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r0 = defpackage.ah4.e(r0)
            r5.setTextSize(r2, r0)
            java.util.EnumMap r0 = r4.c
            java.lang.Object r6 = r0.get(r6)
            ah4 r6 = (defpackage.ah4) r6
            if (r6 != 0) goto L_0x0041
            java.util.Collection r6 = r0.values()
            java.lang.Object r6 = o23.U(r6)
            ah4 r6 = (defpackage.ah4) r6
        L_0x0041:
            long r0 = r6.a
            android.content.res.Resources r6 = r5.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = defpackage.ah4.d(r0, r6)
            int r6 = (int) r6
            r5.setLineHeight(r6)
            boolean r6 = r4.d
            r5.setIncludeFontPadding(r6)
            android.content.res.Resources r6 = r5.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            long r0 = r4.e
            float r6 = defpackage.ah4.d(r0, r6)
            r5.setLetterSpacing(r6)
            java.lang.String r6 = r4.f
            r0 = 0
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r0)
            int r4 = r4.g
            int r4 = defpackage.me4.b(r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r6, r4, r0)
            r5.setTypeface(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.b(android.widget.TextView, yq4):void");
    }

    public final EnumMap e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.nge) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.nge
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            nge r8 = (defpackage.nge) r8
            boolean r1 = r8.a
            boolean r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.EnumMap r1 = r7.b
            java.util.EnumMap r3 = r8.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.util.EnumMap r1 = r7.c
            java.util.EnumMap r3 = r8.c
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            boolean r1 = r7.d
            boolean r3 = r8.d
            if (r1 == r3) goto L_0x0030
            return r2
        L_0x0030:
            long r3 = r7.e
            long r5 = r8.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = r7.f
            java.lang.String r3 = r8.f
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0043
            return r2
        L_0x0043:
            int r7 = r7.g
            int r8 = r8.g
            if (r7 == r8) goto L_0x004a
            return r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.equals(java.lang.Object):boolean");
    }

    public final EnumMap f() {
        return this.b;
    }

    public final long g(yq4 yq4) {
        EnumMap enumMap = this.b;
        ah4 ah4 = (ah4) enumMap.get(yq4);
        return ah4 != null ? ah4.a : ((ah4) o23.U(enumMap.values())).a;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return hr1.t(this.g) + me4.d(sxe.m(th2.f((this.c.hashCode() + ((hashCode + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String k = wn6.k(new StringBuilder("Dimension(encodedValue="), this.e, ")");
        StringBuilder sb = new StringBuilder("TextStyle(textAllCaps=");
        sb.append(this.a);
        sb.append(", textSizes=");
        sb.append(this.b);
        sb.append(", lineHeights=");
        sb.append(this.c);
        sb.append(", includeFontPadding=");
        sb.append(this.d);
        sb.append(", letterSpacing=");
        sb.append(k);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontWeight=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "Bold" : "Semibold" : "Medium" : "Regular");
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nge(boolean r10, long r11, long r13, boolean r15, long r16, java.lang.String r18, int r19) {
        /*
            r9 = this;
            java.util.EnumMap r2 = new java.util.EnumMap
            java.lang.Class<yq4> r0 = defpackage.yq4.class
            r2.<init>(r0)
            yq4 r1 = defpackage.yq4.b
            r3 = r11
            java.util.EnumMap r3 = defpackage.c3d.k(r11, r2, r1, r0)
            ah4 r0 = new ah4
            r4 = r13
            r0.<init>(r13)
            r3.put(r1, r0)
            r0 = r9
            r1 = r10
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r0.<init>((boolean) r1, (java.util.EnumMap) r2, (java.util.EnumMap) r3, (boolean) r4, (long) r5, (java.lang.String) r7, (int) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.<init>(boolean, long, long, boolean, long, java.lang.String, int):void");
    }
}
