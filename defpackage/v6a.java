package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: v6a  reason: default package */
public final class v6a {
    public final Context a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final fi g = new fi();
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public v6a(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, Context context) {
        this.a = context;
        this.b = t97;
        this.c = t972;
        this.d = t973;
        this.e = t974;
        this.f = t975;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0116, code lost:
        r10 = r17;
        r12 = r18;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence a(java.lang.CharSequence r18, java.util.List r19, int r20, boolean r21, int r22, boolean r23) {
        /*
            r17 = this;
            r10 = r17
            r0 = r18
            int r1 = r18.length()
            if (r1 != 0) goto L_0x000c
            goto L_0x0177
        L_0x000c:
            if (r19 == 0) goto L_0x0177
            boolean r1 = r19.isEmpty()
            if (r1 == 0) goto L_0x0016
            goto L_0x0177
        L_0x0016:
            bmd r11 = new bmd
            r11.<init>(r0)
            java.util.Iterator r12 = r19.iterator()
        L_0x001f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r0 = r12.next()
            fp8 r0 = (fp8) r0
            long r13 = r0.a
            int r1 = r0.e
            int r15 = r0.d
            int r9 = r15 + r1
            ep8 r1 = r0.c
            int r1 = r1.ordinal()
            android.content.Context r2 = r10.a
            java.lang.String r8 = "MessageElementFormatter"
            switch(r1) {
                case 0: goto L_0x0171;
                case 1: goto L_0x0171;
                case 2: goto L_0x0163;
                case 3: goto L_0x0154;
                case 4: goto L_0x0145;
                case 5: goto L_0x00e9;
                case 6: goto L_0x00dc;
                case 7: goto L_0x00d0;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00b7;
                case 10: goto L_0x0046;
                default: goto L_0x0040;
            }
        L_0x0040:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0046:
            if (r23 == 0) goto L_0x00b3
            if (r22 <= 0) goto L_0x004d
            r3 = r22
            goto L_0x005e
        L_0x004d:
            nge r0 = nte.i
            yq4 r1 = yq4.b
            long r0 = r0.g(r1)
            float r0 = ah4.c(r0, r2)
            int r0 = defpackage.a24.X(r0)
            r3 = r0
        L_0x005e:
            ei r0 = new ei
            r0.<init>(r13, r3)
            java.util.concurrent.ConcurrentHashMap r7 = r10.h
            t6a r6 = new t6a
            r1 = r6
            r2 = r17
            r4 = r13
            r10 = r6
            r6 = r20
            r18 = r12
            r12 = r7
            r7 = r11
            r16 = r8
            r8 = r15
            r19 = r9
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            di r1 = new di
            r2 = 12
            r1.<init>(r2, r10)
            java.lang.Object r0 = r12.computeIfAbsent(r0, r1)
            zj r0 = (zj) r0
            java.lang.Class<yu4> r1 = yu4.class
            r3 = r19
            defpackage.mt0.C(r11, r1, r15, r3)     // Catch:{ all -> 0x009b }
            ak r1 = new ak     // Catch:{ all -> 0x009b }
            r1.<init>(r13, r0)     // Catch:{ all -> 0x009b }
            r0 = 33
            r11.setSpan(r1, r15, r3, r0)     // Catch:{ all -> 0x009b }
            jue r0 = defpackage.jue.a     // Catch:{ all -> 0x009b }
            goto L_0x00a2
        L_0x009b:
            r0 = move-exception
            kcc r1 = new kcc
            r1.<init>(r0)
            r0 = r1
        L_0x00a2:
            java.lang.Throwable r0 = defpackage.mcc.a(r0)
            if (r0 == 0) goto L_0x00af
            java.lang.String r1 = "Can't process animoji by message element"
            r4 = r16
            defpackage.udd.s(r4, r1, r0)
        L_0x00af:
            r5 = r21
            goto L_0x0116
        L_0x00b3:
            r10 = r17
            goto L_0x001f
        L_0x00b7:
            r3 = r9
            r18 = r12
            af6 r0 = new af6
            r0.<init>()
            pa2.L(r11, r0, r15, r3)
            goto L_0x00af
        L_0x00c3:
            r3 = r9
            r18 = r12
            wzd r0 = new wzd
            r1 = 1
            r0.<init>(r1)
            pa2.L(r11, r0, r15, r3)
            goto L_0x00af
        L_0x00d0:
            r3 = r9
            r18 = r12
            j13 r0 = new j13
            r0.<init>()
            pa2.L(r11, r0, r15, r3)
            goto L_0x00af
        L_0x00dc:
            r3 = r9
            r18 = r12
            wzd r0 = new wzd
            r1 = 0
            r0.<init>(r1)
            pa2.L(r11, r0, r15, r3)
            goto L_0x00af
        L_0x00e9:
            r4 = r8
            r3 = r9
            r18 = r12
            r1 = 0
            java.util.Map r0 = r0.f
            if (r0 == 0) goto L_0x013f
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x00f9
            goto L_0x013f
        L_0x00f9:
            java.lang.String r5 = "url"
            boolean r6 = r0.containsKey(r5)
            if (r6 != 0) goto L_0x0108
            java.lang.String r0 = "Link message element is missing"
            defpackage.udd.s(r4, r0, r1)
            goto L_0x0176
        L_0x0108:
            java.lang.Object r0 = r0.get(r5)
            boolean r4 = r0 instanceof java.lang.String
            if (r4 == 0) goto L_0x0113
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0114
        L_0x0113:
            r0 = r1
        L_0x0114:
            if (r0 != 0) goto L_0x011c
        L_0x0116:
            r10 = r17
            r12 = r18
            goto L_0x001f
        L_0x011c:
            s59 r4 = defpackage.km4.y0
            km4 r2 = r4.n(r2)
            pda r2 = r2.g()
            jo2 r2 = r2.a()
            r5 = r21
            dr0 r2 = r2.a(r5)
            gr0 r2 = r2.b
            int r2 = r2.b
            lf7 r4 = new lf7
            r4.<init>(r0, r2)
            r4.c = r1
            pa2.L(r11, r4, r15, r3)
            goto L_0x0116
        L_0x013f:
            java.lang.String r0 = "missing attributes"
            defpackage.udd.s(r4, r0, r1)
            goto L_0x0176
        L_0x0145:
            r5 = r21
            r3 = r9
            r18 = r12
            so0 r0 = new so0
            r1 = 1
            r0.<init>(r1)
            pa2.L(r11, r0, r15, r3)
            goto L_0x0116
        L_0x0154:
            r5 = r21
            r3 = r9
            r18 = r12
            so0 r0 = new so0
            r1 = 0
            r0.<init>(r1)
            pa2.L(r11, r0, r15, r3)
            goto L_0x0116
        L_0x0163:
            r5 = r21
            r3 = r9
            r18 = r12
            a69 r0 = new a69
            r0.<init>()
            pa2.L(r11, r0, r15, r3)
            goto L_0x0116
        L_0x0171:
            r5 = r21
            r18 = r12
            goto L_0x0116
        L_0x0176:
            return r11
        L_0x0177:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6a.a(java.lang.CharSequence, java.util.List, int, boolean, int, boolean):java.lang.CharSequence");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: hw4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: hw4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: hw4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: hw4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: hw4} */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List c(java.lang.CharSequence r20, boolean r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = 1
            int r2 = r20.length()
            hw4 r3 = defpackage.hw4.a
            if (r2 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            boolean r2 = r0 instanceof android.text.Spannable
            if (r2 != 0) goto L_0x0011
        L_0x0010:
            return r3
        L_0x0011:
            android.text.Spannable r0 = (android.text.Spannable) r0
            android.text.Spannable r0 = ge.a(r0)
            lg7 r2 = defpackage.hwf.c()
            int r4 = r0.length()
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L_0x0025
            r4 = r3
            goto L_0x007a
        L_0x0025:
            int r4 = r0.length()
            java.lang.Class<ip8> r7 = ip8.class
            java.lang.Object[] r4 = r0.getSpans(r6, r4, r7)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r4 = r5
        L_0x0031:
            if (r4 != 0) goto L_0x0035
            ip8[] r4 = new ip8[r6]
        L_0x0035:
            ip8[] r4 = (ip8[]) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r4.length
            r9 = r6
        L_0x003e:
            if (r9 >= r8) goto L_0x0061
            r10 = r4[r9]
            int r11 = r0.getSpanStart(r10)
            int r12 = r0.getSpanEnd(r10)
            int r12 = r12 - r11
            fp8 r10 = r10.a
            r10.getClass()
            r13 = 39
            fp8 r10 = fp8.a(r10, r11, r12, r13)
            fp8 r10 = r10.b()
            if (r10 == 0) goto L_0x005f
            r7.add(r10)
        L_0x005f:
            int r9 = r9 + r1
            goto L_0x003e
        L_0x0061:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>(r7)
            java.util.regex.Pattern r7 = ehe.a
            java.util.regex.Pattern r8 = defpackage.gla.b
            qa5 r9 = new qa5
            r10 = r19
            r11 = r21
            r9.<init>((defpackage.v6a) r10, (boolean) r11, (java.util.LinkedHashSet) r4)
            defpackage.fhe.c(r0, r7, r8, r1, r9)
            java.util.List r4 = defpackage.o23.s0(r4)
        L_0x007a:
            boolean r7 = r4.isEmpty()
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r4 = r5
        L_0x0083:
            if (r4 == 0) goto L_0x0088
            r2.addAll(r4)
        L_0x0088:
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0091
        L_0x008e:
            r7 = r3
            goto L_0x0140
        L_0x0091:
            int r4 = r0.length()
            java.lang.Class<uu7> r7 = uu7.class
            java.lang.Object[] r4 = r0.getSpans(r6, r4, r7)     // Catch:{ all -> 0x009c }
            goto L_0x009d
        L_0x009c:
            r4 = r5
        L_0x009d:
            if (r4 != 0) goto L_0x00a1
            uu7[] r4 = new uu7[r6]
        L_0x00a1:
            uu7[] r4 = (uu7[]) r4
            int r7 = r4.length
            if (r7 != 0) goto L_0x00a7
            goto L_0x008e
        L_0x00a7:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r4.length
            r9 = r6
        L_0x00ae:
            if (r9 >= r8) goto L_0x0140
            r10 = r4[r9]
            int r16 = r0.getSpanStart(r10)
            int r11 = r0.getSpanEnd(r10)
            int r17 = r11 - r16
            int r11 = r10.getType()
            int r11 = defpackage.hr1.t(r11)
            switch(r11) {
                case 1: goto L_0x012c;
                case 2: goto L_0x0129;
                case 3: goto L_0x0126;
                case 4: goto L_0x0123;
                case 5: goto L_0x0113;
                case 6: goto L_0x0110;
                case 7: goto L_0x010d;
                case 8: goto L_0x0107;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            fn6 r11 = defpackage.udd.e
            if (r11 != 0) goto L_0x00cc
            goto L_0x0103
        L_0x00cc:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x0103
            tn7 r12 = tn7.w0
            int r10 = r10.getType()
            switch(r10) {
                case 1: goto L_0x00f6;
                case 2: goto L_0x00f3;
                case 3: goto L_0x00f0;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00ea;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00e4;
                case 8: goto L_0x00e1;
                case 9: goto L_0x00de;
                default: goto L_0x00db;
            }
        L_0x00db:
            java.lang.String r10 = "null"
            goto L_0x00f8
        L_0x00de:
            java.lang.String r10 = "CODE"
            goto L_0x00f8
        L_0x00e1:
            java.lang.String r10 = "HEADING"
            goto L_0x00f8
        L_0x00e4:
            java.lang.String r10 = "STRIKETHROUGH"
            goto L_0x00f8
        L_0x00e7:
            java.lang.String r10 = "LINK"
            goto L_0x00f8
        L_0x00ea:
            java.lang.String r10 = "MONOSPACE"
            goto L_0x00f8
        L_0x00ed:
            java.lang.String r10 = "UNDERLINE"
            goto L_0x00f8
        L_0x00f0:
            java.lang.String r10 = "ITALIC"
            goto L_0x00f8
        L_0x00f3:
            java.lang.String r10 = "BOLD"
            goto L_0x00f8
        L_0x00f6:
            java.lang.String r10 = "REGULAR"
        L_0x00f8:
            java.lang.String r13 = "Unknown markdown span type = "
            java.lang.String r10 = r13.concat(r10)
            java.lang.String r13 = "w6a"
            r11.d(r12, r13, r10, r5)
        L_0x0103:
            r15 = r5
            r18 = r15
            goto L_0x012f
        L_0x0107:
            ep8 r10 = ep8.w0
        L_0x0109:
            r18 = r5
            r15 = r10
            goto L_0x012f
        L_0x010d:
            ep8 r10 = ep8.y0
            goto L_0x0109
        L_0x0110:
            ep8 r10 = ep8.Z
            goto L_0x0109
        L_0x0113:
            ep8 r11 = ep8.Y
            lf7 r10 = (lf7) r10
            java.lang.String r10 = r10.b
            java.lang.String r12 = "url"
            java.util.Map r10 = java.util.Collections.singletonMap(r12, r10)
            r18 = r10
            r15 = r11
            goto L_0x012f
        L_0x0123:
            ep8 r10 = ep8.c
            goto L_0x0109
        L_0x0126:
            ep8 r10 = ep8.x0
            goto L_0x0109
        L_0x0129:
            ep8 r10 = ep8.X
            goto L_0x0109
        L_0x012c:
            ep8 r10 = ep8.o
            goto L_0x0109
        L_0x012f:
            if (r15 == 0) goto L_0x013d
            fp8 r10 = new fp8
            r12 = 0
            r14 = 0
            r11 = r10
            r11.<init>(r12, r14, r15, r16, r17, r18)
            r7.add(r10)
        L_0x013d:
            int r9 = r9 + r1
            goto L_0x00ae
        L_0x0140:
            boolean r4 = r7.isEmpty()
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r7 = r5
        L_0x0149:
            if (r7 == 0) goto L_0x014e
            r2.addAll(r7)
        L_0x014e:
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0155
            goto L_0x0194
        L_0x0155:
            int r4 = r0.length()
            java.lang.Class<ak> r7 = ak.class
            java.lang.Object[] r4 = r0.getSpans(r6, r4, r7)     // Catch:{ all -> 0x0160 }
            goto L_0x0161
        L_0x0160:
            r4 = r5
        L_0x0161:
            if (r4 != 0) goto L_0x0165
            ak[] r4 = new ak[r6]
        L_0x0165:
            ak[] r4 = (ak[]) r4
            int r7 = r4.length
            if (r7 != 0) goto L_0x016b
            goto L_0x0194
        L_0x016b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r7 = r4.length
        L_0x0171:
            if (r6 >= r7) goto L_0x0194
            r8 = r4[r6]
            int r14 = r0.getSpanStart(r8)
            int r9 = r0.getSpanEnd(r8)
            int r15 = r9 - r14
            fp8 r13 = new fp8
            long r10 = r8.Z
            ep8 r8 = ep8.z0
            r16 = 0
            r12 = 0
            r9 = r13
            r5 = r13
            r13 = r8
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r3.add(r5)
            int r6 = r6 + r1
            r5 = 0
            goto L_0x0171
        L_0x0194:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x019d
            r5 = r3
            goto L_0x019e
        L_0x019d:
            r5 = 0
        L_0x019e:
            if (r5 == 0) goto L_0x01a3
            r2.addAll(r5)
        L_0x01a3:
            lg7 r0 = defpackage.hwf.a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6a.c(java.lang.CharSequence, boolean):java.util.List");
    }
}
