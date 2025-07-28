package defpackage;

import android.content.Context;

/* renamed from: src  reason: default package */
public final class src {
    public final Context a;
    public final w6a b;
    public final ho2 c;
    public final i5a d;
    public final bv2 e;
    public final q2b f;
    public final f03 g;
    public final t97 h;

    public src(Context context, w6a w6a, ho2 ho2, i5a i5a, bv2 bv2, q2b q2b, f03 f03, t97 t97) {
        this.a = context;
        this.b = w6a;
        this.c = ho2;
        this.d = i5a;
        this.e = bv2;
        this.f = q2b;
        this.g = f03;
        this.h = t97;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(prc r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.rrc
            if (r3 == 0) goto L_0x0019
            r3 = r2
            rrc r3 = (defpackage.rrc) r3
            int r4 = r3.w0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.w0 = r4
            goto L_0x001e
        L_0x0019:
            rrc r3 = new rrc
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.Y
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.w0
            r6 = 1
            if (r5 == 0) goto L_0x003e
            if (r5 != r6) goto L_0x0036
            prc r0 = r3.X
            src r1 = r3.o
            defpackage.wx3.H(r2)
            r17 = r1
            r1 = r0
            r0 = r17
            goto L_0x0058
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            defpackage.wx3.H(r2)
            i22 r2 = r1.o
            if (r2 != 0) goto L_0x005a
            bv2 r2 = r0.e
            long r7 = r1.Z
            r3.o = r0
            r3.X = r1
            r3.w0 = r6
            aw2 r2 = (aw2) r2
            java.lang.Object r2 = r2.k(r7, r3)
            if (r2 != r4) goto L_0x0058
            return r4
        L_0x0058:
            i22 r2 = (i22) r2
        L_0x005a:
            r11 = r2
            r2 = 0
            if (r11 == 0) goto L_0x0078
            fj0 r3 = fj0.c
            ej0 r4 = ej0.a
            java.lang.String r3 = r11.f(r3, r4)
            if (r3 == 0) goto L_0x0078
            boolean r4 = defpackage.h0e.c0(r3)
            if (r4 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = r2
        L_0x0070:
            if (r3 == 0) goto L_0x0078
            android.net.Uri r3 = defpackage.at7.x(r3)
            r8 = r3
            goto L_0x0079
        L_0x0078:
            r8 = r2
        L_0x0079:
            ym8 r3 = r1.Y
            rq8 r4 = r3.x0
            r5 = 0
            if (r4 == 0) goto L_0x0083
            int r7 = r4.a
            goto L_0x0084
        L_0x0083:
            r7 = r5
        L_0x0084:
            r9 = 3
            if (r7 != r9) goto L_0x0089
            ym8 r3 = r4.c
        L_0x0089:
            r10 = r3
            if (r11 == 0) goto L_0x0091
            r11.h0()
            java.lang.CharSequence r2 = r11.y0
        L_0x0091:
            r14 = r2
            java.util.List r2 = r10.G0
            java.util.ArrayList r2 = fu7.u(r2)
            java.lang.String r3 = r10.Z
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x00a4
            java.lang.String r3 = ehe.e(r3)
            if (r3 != 0) goto L_0x00a5
        L_0x00a4:
            r3 = r4
        L_0x00a5:
            java.util.List r7 = r1.c
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x017d
            i5a r7 = r0.d
            w6a r0 = r0.b
            q1b r0 = r0.i(r3, r2)
            java.util.List r2 = r1.c
            r7.getClass()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00c3
            goto L_0x017b
        L_0x00c3:
            java.lang.CharSequence r3 = r0.a
            java.lang.String r3 = r3.toString()
            java.util.List r3 = defpackage.udd.z(r3, r2)
            boolean r12 = r3.isEmpty()
            r12 = r12 ^ r6
            java.lang.String[] r13 = r0.b
            if (r12 == 0) goto L_0x00f0
            s59 r2 = defpackage.km4.y0
            android.content.Context r4 = r7.a
            km4 r2 = r2.n(r4)
            pda r2 = r2.g()
            java.lang.CharSequence r0 = r0.a
            android.text.SpannableString r0 = defpackage.udd.F(r0, r3, r2)
            q1b r2 = new q1b
            r2.<init>(r0, r13)
            r0 = r2
            goto L_0x017b
        L_0x00f0:
            zy r3 = r10.w0
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L_0x00fa
            goto L_0x017b
        L_0x00fa:
            java.util.Iterator r3 = r3.iterator()
        L_0x00fe:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x016f
            java.lang.Object r12 = r3.next()
            fy r12 = (fy) r12
            e00 r15 = r12.a
            if (r15 != 0) goto L_0x0110
            r15 = -1
            goto L_0x0118
        L_0x0110:
            int[] r16 = h5a.$EnumSwitchMapping$0
            int r15 = r15.ordinal()
            r15 = r16[r15]
        L_0x0118:
            if (r15 == r6) goto L_0x0157
            r6 = 2
            if (r15 == r6) goto L_0x0144
            if (r15 == r9) goto L_0x0133
            r6 = 4
            if (r15 == r6) goto L_0x0124
        L_0x0122:
            r12 = 1
            goto L_0x0166
        L_0x0124:
            y10 r12 = (y10) r12
            java.lang.String r4 = r12.x0
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r6 = "🎤"
            java.lang.CharSequence r4 = r7.a(r6, r2, r5, r4)
            goto L_0x0122
        L_0x0133:
            yf3 r12 = (yf3) r12
            java.lang.String r4 = r12.Z
            java.lang.String r6 = r12.w0
            java.lang.String[] r4 = new java.lang.String[]{r4, r6}
            java.lang.String r6 = "👤"
            java.lang.CharSequence r4 = r7.a(r6, r2, r5, r4)
            goto L_0x0122
        L_0x0144:
            qad r12 = (qad) r12
            java.lang.String r4 = r12.Y
            java.lang.String r6 = r12.Z
            java.lang.String r12 = r12.w0
            java.lang.String[] r4 = new java.lang.String[]{r12, r4, r6}
            java.lang.String r6 = "🔗"
            java.lang.CharSequence r4 = r7.a(r6, r2, r5, r4)
            goto L_0x0122
        L_0x0157:
            dc5 r12 = (dc5) r12
            java.lang.String r4 = r12.Y
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r6 = "📄"
            r12 = 1
            java.lang.CharSequence r4 = r7.a(r6, r2, r12, r4)
        L_0x0166:
            int r6 = r4.length()
            if (r6 <= 0) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r6 = r12
            goto L_0x00fe
        L_0x016f:
            int r2 = r4.length()
            if (r2 != 0) goto L_0x0176
            goto L_0x017b
        L_0x0176:
            q1b r0 = new q1b
            r0.<init>(r4, r13)
        L_0x017b:
            r13 = r0
            goto L_0x0184
        L_0x017d:
            w6a r0 = r0.b
            q1b r0 = r0.i(r3, r2)
            goto L_0x017b
        L_0x0184:
            cs8 r0 = new cs8
            java.util.List r9 = r1.c
            java.lang.String r12 = r1.b
            long r1 = r1.Z
            r7 = r0
            r15 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.src.a(prc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x05b9  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05c4  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05c7  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(prc r45, kotlin.coroutines.Continuation r46) {
        /*
            r44 = this;
            r0 = r44
            r1 = r45
            r2 = 13
            int r3 = r1.a
            ej0 r4 = ej0.a
            fj0 r5 = fj0.c
            s59 r6 = defpackage.km4.y0
            java.lang.String r8 = "Sequence is empty."
            x51 r9 = defpackage.x51.w0
            r11 = 4
            r12 = 1
            r13 = 2
            r14 = 0
            if (r3 == r12) goto L_0x037e
            if (r3 != r13) goto L_0x001c
            goto L_0x037e
        L_0x001c:
            if (r3 != r11) goto L_0x0156
            android.content.Context r3 = r0.a
            km4 r4 = r6.n(r3)
            pda r4 = r4.g()
            tf3 r6 = r1.X
            java.util.List r11 = r1.c
            java.lang.Object r17 = defpackage.o23.X(r11)
            r10 = r17
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r15 = r6.i()
            java.lang.String r6 = r6.j()
            es r7 = new es
            r7.<init>(r13, r15)
            qq9 r15 = new qq9
            r15.<init>(r2)
            vqe r2 = new vqe
            r2.<init>(r7, r15)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            dyc r6 = defpackage.cs.K(r6)
            dyc[] r7 = new defpackage.dyc[r13]
            r7[r14] = r2
            r7[r12] = r6
            dyc r2 = defpackage.cs.K(r7)
            xi5 r2 = defpackage.myc.P(r2, r9)
            uy1 r6 = new uy1
            r7 = 5
            r6.<init>(r10, r7)
            sg5 r2 = defpackage.myc.L(r2, r6)
            to1 r6 = new to1
            r6.<init>(r10, r4)
            java.util.Iterator r2 = r2.iterator()
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0150
            java.lang.Object r2 = r2.next()
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r4 = r11.isEmpty()
            r4 = r4 ^ r12
            tf3 r1 = r1.X
            if (r4 == 0) goto L_0x00a9
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x00a4
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r1.d()
            boolean r4 = defpackage.hhd.f(r4, r6)
            if (r4 == 0) goto L_0x00a4
        L_0x00a1:
            r22 = r2
            goto L_0x00be
        L_0x00a4:
            java.lang.String r2 = r1.d()
            goto L_0x00a1
        L_0x00a9:
            w6a r2 = r0.b
            java.lang.CharSequence r4 = r1.b
            if (r4 != 0) goto L_0x00bb
            java.lang.String r4 = r1.d()
            nu4 r2 = r2.j
            java.lang.CharSequence r2 = r2.b(r14, r4)
            r1.b = r2
        L_0x00bb:
            java.lang.CharSequence r2 = r1.b
            goto L_0x00a1
        L_0x00be:
            int r2 = r1.k()
            if (r2 != 0) goto L_0x00cd
            boolean r2 = r1.w()
            if (r2 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r2 = r14
            goto L_0x00ce
        L_0x00cd:
            r2 = r12
        L_0x00ce:
            q2b r4 = r0.f
            if (r2 == 0) goto L_0x00d5
            r23 = 0
            goto L_0x0107
        L_0x00d5:
            boolean r2 = r1.Y
            if (r2 == 0) goto L_0x00e2
            int r2 = whc.F
            java.lang.String r15 = r3.getString(r2)
        L_0x00df:
            r23 = r15
            goto L_0x0107
        L_0x00e2:
            boolean r2 = r1.t()
            if (r2 == 0) goto L_0x00f5
            boolean r2 = r1.v()
            if (r2 == 0) goto L_0x00f5
            int r2 = cic.K2
            java.lang.String r15 = r3.getString(r2)
            goto L_0x00df
        L_0x00f5:
            boolean r2 = r1.t()
            if (r2 == 0) goto L_0x0102
            int r2 = cic.p
            java.lang.String r15 = r3.getString(r2)
            goto L_0x00df
        L_0x0102:
            java.lang.CharSequence r15 = r4.b(r1)
            goto L_0x00df
        L_0x0107:
            long r2 = r1.n()
            o2b r4 = r4.d()
            l2b r2 = r4.b(r2)
            int r2 = r2.a
            r3 = 10
            if (r2 == r3) goto L_0x0125
            r3 = 20
            if (r2 == r3) goto L_0x0125
            r3 = 40
            if (r2 != r3) goto L_0x0122
            goto L_0x0125
        L_0x0122:
            r24 = r14
            goto L_0x0127
        L_0x0125:
            r24 = r12
        L_0x0127:
            fn3 r2 = new fn3
            long r20 = r1.n()
            boolean r25 = r1.u()
            f03 r0 = r0.g
            lqc r0 = (lqc) r0
            java.lang.String r0 = r0.p()
            int r3 = lc0.j
            java.lang.String r0 = r1.q(r0, r5)
            android.net.Uri r27 = defpackage.at7.x(r0)
            java.lang.CharSequence r28 = r1.m()
            r19 = r2
            r26 = r11
            r19.<init>(r20, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x05fb
        L_0x0150:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r8)
            throw r0
        L_0x0156:
            java.lang.String r2 = ""
            java.lang.String r7 = "Required value was null."
            r8 = 5
            if (r3 != r8) goto L_0x022d
            yib r8 = r1.w0
            if (r8 == 0) goto L_0x0168
            gn3 r9 = r8.c
            if (r9 == 0) goto L_0x0168
            uj3 r9 = r9.a
            goto L_0x0169
        L_0x0168:
            r9 = 0
        L_0x0169:
            if (r9 == 0) goto L_0x022c
            if (r8 == 0) goto L_0x0170
            gn3 r15 = r8.c
            goto L_0x0171
        L_0x0170:
            r15 = 0
        L_0x0171:
            if (r15 == 0) goto L_0x0222
            uj3 r3 = r15.a
            if (r3 == 0) goto L_0x0218
            ka r4 = new ka
            r6 = 29
            r4.<init>(r0, r6, r1)
            java.lang.String r0 = r3.a()
            if (r0 == 0) goto L_0x018d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r0 = r14
            goto L_0x018e
        L_0x018d:
            r0 = r12
        L_0x018e:
            r0 = r0 ^ r12
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = r3.a()
            java.lang.Object r0 = r4.invoke(r0)
            q1b r0 = (q1b) r0
        L_0x019b:
            r25 = r0
            goto L_0x01a3
        L_0x019e:
            q1b r0 = q1b.a()
            goto L_0x019b
        L_0x01a3:
            java.util.regex.Pattern r0 = t5a.a
            java.lang.String r0 = r3.b()
            if (r0 != 0) goto L_0x01ac
            goto L_0x01ad
        L_0x01ac:
            r2 = r0
        L_0x01ad:
            java.lang.String r0 = r3.c()
            java.lang.String r24 = t5a.b(r2, r0)
            java.lang.String r0 = r3.A0
            java.lang.String r0 = ehe.c(r0)
            nqc r2 = nqc.a
            gsc r2 = r2.r()
            java.util.List r1 = r1.c
            java.util.List r2 = r2.d(r0, r1)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r12
            if (r2 == 0) goto L_0x01d7
            java.lang.Object r0 = r4.invoke(r0)
            q1b r0 = (q1b) r0
        L_0x01d4:
            r26 = r0
            goto L_0x01dc
        L_0x01d7:
            q1b r0 = q1b.a()
            goto L_0x01d4
        L_0x01dc:
            m2b r0 = r15.o
            l2b r0 = fu7.l(r0)
            int r2 = r0.a
            r4 = 10
            if (r2 == r4) goto L_0x01f3
            r4 = 20
            if (r2 == r4) goto L_0x01f3
            r4 = 40
            if (r2 == r4) goto L_0x01f3
            r27 = r14
            goto L_0x01f5
        L_0x01f3:
            r27 = r12
        L_0x01f5:
            ba6 r2 = new ba6
            tj3 r4 = tj3.b
            java.util.List r6 = r3.y0
            boolean r28 = r6.contains(r4)
            java.lang.String r4 = r3.d(r5)
            android.net.Uri r29 = defpackage.at7.x(r4)
            long r4 = r3.a
            r21 = r2
            r22 = r4
            r30 = r0
            r31 = r3
            r32 = r1
            r21.<init>(r22, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x05fb
        L_0x0218:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x0222:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x022c:
            r8 = 5
        L_0x022d:
            if (r3 != r8) goto L_0x035b
            yib r8 = r1.w0
            if (r8 == 0) goto L_0x0236
            j22 r9 = r8.a
            goto L_0x0237
        L_0x0236:
            r9 = 0
        L_0x0237:
            if (r9 == 0) goto L_0x035b
            if (r8 == 0) goto L_0x023e
            j22 r3 = r8.a
            goto L_0x023f
        L_0x023e:
            r3 = 0
        L_0x023f:
            if (r3 == 0) goto L_0x0351
            java.lang.String r7 = r3.Z
            boolean r8 = defpackage.r1g.p(r7)
            if (r8 != 0) goto L_0x024e
            java.lang.String r4 = defpackage.vx3.t(r7, r5, r4)
            goto L_0x024f
        L_0x024e:
            r4 = 0
        L_0x024f:
            if (r4 == 0) goto L_0x0262
            boolean r5 = defpackage.h0e.c0(r4)
            if (r5 != 0) goto L_0x0258
            goto L_0x0259
        L_0x0258:
            r4 = 0
        L_0x0259:
            if (r4 == 0) goto L_0x0262
            android.net.Uri r4 = defpackage.at7.x(r4)
            r22 = r4
            goto L_0x0264
        L_0x0262:
            r22 = 0
        L_0x0264:
            w6a r4 = r0.b
            java.lang.String r5 = r3.Y
            q1b r23 = r4.h(r5)
            java.lang.CharSequence r27 = t5a.a(r5, r4)
            java.lang.String r7 = r3.H0
            java.lang.String r7 = ehe.c(r7)
            yib r8 = r1.w0
            if (r8 == 0) goto L_0x027d
            java.util.List r9 = r8.b
            goto L_0x027e
        L_0x027d:
            r9 = 0
        L_0x027e:
            boolean r9 = defpackage.udd.J(r7, r9)
            if (r9 != 0) goto L_0x0292
            if (r8 == 0) goto L_0x0289
            java.util.List r10 = r8.b
            goto L_0x028a
        L_0x0289:
            r10 = 0
        L_0x028a:
            boolean r5 = defpackage.udd.J(r5, r10)
            if (r5 == 0) goto L_0x0292
            r5 = r12
            goto L_0x0293
        L_0x0292:
            r5 = r14
        L_0x0293:
            java.util.List r1 = r1.c
            int r10 = r3.b1
            if (r10 == r11) goto L_0x02a4
            r13 = 3
            if (r10 == r13) goto L_0x02a4
            q1b r4 = q1b.a()
            r24 = r4
            goto L_0x0317
        L_0x02a4:
            java.lang.String r13 = r3.D0
            if (r9 == 0) goto L_0x02ad
            q1b r15 = r4.h(r7)
            goto L_0x02cc
        L_0x02ad:
            if (r5 != 0) goto L_0x02cb
            if (r8 == 0) goto L_0x02b4
            java.util.List r5 = r8.b
            goto L_0x02b5
        L_0x02b4:
            r5 = 0
        L_0x02b5:
            nqc r8 = nqc.a
            gsc r8 = r8.r()
            java.util.List r5 = r8.d(r13, r5)
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r12
            if (r5 == 0) goto L_0x02cb
            q1b r15 = r4.h(r13)
            goto L_0x02cc
        L_0x02cb:
            r15 = 0
        L_0x02cc:
            if (r15 == 0) goto L_0x02d6
            java.lang.CharSequence r5 = r15.a
            int r5 = r5.length()
            if (r5 != 0) goto L_0x02ea
        L_0x02d6:
            if (r13 == 0) goto L_0x02e5
            int r5 = r13.length()
            if (r5 != 0) goto L_0x02df
            goto L_0x02e5
        L_0x02df:
            q1b r5 = r4.h(r13)
        L_0x02e3:
            r15 = r5
            goto L_0x02ea
        L_0x02e5:
            q1b r5 = r4.h(r7)
            goto L_0x02e3
        L_0x02ea:
            java.lang.CharSequence r5 = r15.a
            java.lang.String r5 = r5.toString()
            java.util.List r7 = defpackage.udd.z(r5, r1)
            android.content.Context r8 = r0.a
            km4 r6 = r6.n(r8)
            pda r6 = r6.g()
            android.text.SpannableString r5 = defpackage.udd.F(r5, r7, r6)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x0315
            q1b r15 = new q1b
            java.lang.String r6 = r5.toString()
            java.lang.String[] r4 = ehe.d(r6, r4)
            r15.<init>(r5, r4)
        L_0x0315:
            r24 = r15
        L_0x0317:
            ym8 r4 = r3.x0
            if (r4 == 0) goto L_0x0333
            f03 r2 = r0.g
            lqc r2 = (lqc) r2
            java.util.Locale r16 = r2.u()
            long r4 = r4.b
            long r19 = r2.m()
            android.content.Context r15 = r0.a
            r21 = 0
            r17 = r4
            java.lang.String r2 = defpackage.xs7.o(r15, r16, r17, r19, r21)
        L_0x0333:
            r21 = r2
            w96 r2 = new w96
            if (r10 != r11) goto L_0x033c
            r26 = r12
            goto L_0x033e
        L_0x033c:
            r26 = r14
        L_0x033e:
            nj2 r0 = r3.G0
            boolean r0 = r0.c
            long r3 = r3.a
            r18 = r2
            r19 = r3
            r25 = r1
            r28 = r0
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x05fb
        L_0x0351:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x035b:
            r2 = 3
            if (r3 != r2) goto L_0x036c
            java.lang.Object r0 = r44.a(r45, r46)
            pu3 r1 = defpackage.pu3.a
            if (r0 != r1) goto L_0x0367
            return r0
        L_0x0367:
            r2 = r0
            nrc r2 = (defpackage.nrc) r2
            goto L_0x05fb
        L_0x036c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r1.a
            java.lang.String r1 = m4b.l(r1)
            java.lang.String r2 = "Unsupported search result type: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x037e:
            i22 r3 = r1.o
            java.lang.String r3 = r3.f(r5, r4)
            if (r3 == 0) goto L_0x0397
            boolean r4 = defpackage.h0e.c0(r3)
            if (r4 != 0) goto L_0x038d
            goto L_0x038e
        L_0x038d:
            r3 = 0
        L_0x038e:
            if (r3 == 0) goto L_0x0397
            android.net.Uri r3 = defpackage.at7.x(r3)
            r32 = r3
            goto L_0x0399
        L_0x0397:
            r32 = 0
        L_0x0399:
            w6a r3 = r0.b
            i22 r4 = r1.o
            r4.h0()
            java.lang.CharSequence r4 = r4.y0
            q1b r3 = r3.h(r4)
            i5a r4 = r0.d
            java.util.List r5 = r1.c
            i22 r7 = r1.o
            r4.getClass()
            o62 r10 = r7.b
            java.lang.String r15 = r10.I
            java.lang.String r15 = ehe.c(r15)
            boolean r40 = defpackage.udd.J(r15, r5)
            if (r40 != 0) goto L_0x03ca
            java.lang.String r15 = r7.p()
            boolean r15 = defpackage.udd.J(r15, r5)
            if (r15 == 0) goto L_0x03ca
            r39 = r12
            goto L_0x03cc
        L_0x03ca:
            r39 = r14
        L_0x03cc:
            java.lang.CharSequence r15 = r3.a
            java.lang.String r15 = r15.toString()
            java.util.List r15 = defpackage.udd.z(r15, r5)
            android.content.Context r11 = r4.a
            km4 r19 = r6.n(r11)
            pda r2 = r19.g()
            android.text.SpannableString r2 = defpackage.udd.G(r2, r3, r15)
            java.lang.String r10 = r10.I
            java.lang.String r10 = ehe.c(r10)
            if (r40 == 0) goto L_0x0400
            java.util.List r5 = defpackage.udd.z(r10, r5)
            km4 r6 = r6.n(r11)
            pda r6 = r6.g()
            android.text.SpannableString r5 = defpackage.udd.F(r10, r5, r6)
            r41 = r14
            goto L_0x0489
        L_0x0400:
            if (r39 != 0) goto L_0x0486
            boolean r10 = r5.isEmpty()
            r10 = r10 ^ r12
            if (r10 == 0) goto L_0x0486
            tf3 r7 = r7.k()
            if (r7 == 0) goto L_0x0486
            java.lang.Object r5 = r5.get(r14)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Collections.singletonList(r5)
            km4 r6 = r6.n(r11)
            pda r6 = r6.g()
            java.util.List r10 = r7.i()
            java.lang.String r7 = r7.j()
            es r11 = new es
            r11.<init>(r13, r10)
            qq9 r10 = new qq9
            r15 = 13
            r10.<init>(r15)
            vqe r15 = new vqe
            r15.<init>(r11, r10)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            dyc r7 = defpackage.cs.K(r7)
            dyc[] r10 = new defpackage.dyc[r13]
            r10[r14] = r15
            r10[r12] = r7
            dyc r7 = defpackage.cs.K(r10)
            xi5 r7 = defpackage.myc.P(r7, r9)
            uy1 r9 = new uy1
            r10 = 5
            r9.<init>(r5, r10)
            sg5 r7 = defpackage.myc.L(r7, r9)
            to1 r9 = new to1
            r9.<init>(r5, r6)
            java.util.Iterator r5 = r7.iterator()
            rg5 r5 = (defpackage.rg5) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0480
            java.lang.Object r5 = r5.next()
            java.lang.Object r5 = r9.invoke(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x047c
            r6 = r12
            goto L_0x047d
        L_0x047c:
            r6 = r14
        L_0x047d:
            r41 = r6
            goto L_0x0489
        L_0x0480:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r8)
            throw r0
        L_0x0486:
            r41 = r14
            r5 = 0
        L_0x0489:
            q1b r6 = new q1b
            java.lang.String[] r3 = r3.b
            r6.<init>(r2, r3)
            if (r5 != 0) goto L_0x0493
            goto L_0x049f
        L_0x0493:
            java.lang.String r2 = r5.toString()
            w6a r3 = r4.b
            r3.getClass()
            ehe.d(r2, r3)
        L_0x049f:
            i22 r2 = r1.o
            xm8 r3 = r2.c
            if (r3 == 0) goto L_0x04bb
            tf3 r3 = r3.b
            if (r3 == 0) goto L_0x04bb
            long r3 = r3.n()
            f03 r5 = r0.g
            lqc r5 = (lqc) r5
            long r7 = r5.s()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x04bb
            r3 = r12
            goto L_0x04bc
        L_0x04bb:
            r3 = r14
        L_0x04bc:
            xm8 r2 = r2.c
            if (r2 == 0) goto L_0x04f9
            if (r3 == 0) goto L_0x04f9
            vo8 r2 = r2.a
            bp8 r2 = r2.y0
            bp8 r3 = bp8.Y
            if (r2 != r3) goto L_0x04cb
            goto L_0x04f9
        L_0x04cb:
            if (r2 != 0) goto L_0x04cf
            r2 = -1
            goto L_0x04d7
        L_0x04cf:
            int[] r3 = defpackage.qrc.$EnumSwitchMapping$1
            int r2 = r2.ordinal()
            r2 = r3[r2]
        L_0x04d7:
            if (r2 == r12) goto L_0x04f6
            if (r2 == r13) goto L_0x04f3
            r3 = 3
            if (r2 == r3) goto L_0x04f0
            r3 = 4
            if (r2 == r3) goto L_0x04ed
            r3 = 5
            if (r2 != r3) goto L_0x04e7
            oi2 r2 = defpackage.oi2.X
            goto L_0x04fb
        L_0x04e7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04ed:
            oi2 r2 = defpackage.oi2.o
            goto L_0x04fb
        L_0x04f0:
            oi2 r2 = defpackage.oi2.c
            goto L_0x04fb
        L_0x04f3:
            oi2 r2 = defpackage.oi2.b
            goto L_0x04fb
        L_0x04f6:
            oi2 r2 = defpackage.oi2.a
            goto L_0x04fb
        L_0x04f9:
            oi2 r2 = defpackage.oi2.a
        L_0x04fb:
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x051c
            if (r2 == r12) goto L_0x0519
            if (r2 == r13) goto L_0x0516
            r3 = 3
            if (r2 == r3) goto L_0x0516
            r3 = 4
            if (r2 != r3) goto L_0x0510
            o32 r2 = o32.X
        L_0x050d:
            r31 = r2
            goto L_0x051f
        L_0x0510:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0516:
            o32 r2 = o32.c
            goto L_0x050d
        L_0x0519:
            o32 r2 = o32.b
            goto L_0x050d
        L_0x051c:
            o32 r2 = o32.a
            goto L_0x050d
        L_0x051f:
            rn2 r2 = new rn2
            i22 r3 = r1.o
            long r4 = r3.a
            boolean r25 = r3.K()
            i22 r3 = r1.o
            f03 r7 = r0.g
            boolean r26 = r3.S(r7)
            i22 r3 = r1.o
            boolean r27 = r3.z()
            i22 r3 = r1.o
            t97 r7 = r0.h
            java.lang.Object r7 = r7.getValue()
            xzc r7 = (xzc) r7
            r7.getClass()
            o62 r3 = r3.b
            java.lang.String r3 = r3.m0
            if (r3 == 0) goto L_0x0554
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0551
            goto L_0x0554
        L_0x0551:
            r28 = r12
            goto L_0x0556
        L_0x0554:
            r28 = r14
        L_0x0556:
            i22 r3 = r1.o
            long r19 = r3.l()
            r7 = 0
            int r7 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x0565
            r29 = 0
            goto L_0x058d
        L_0x0565:
            java.lang.String r7 = r3.D0
            if (r7 != 0) goto L_0x0589
            go2 r7 = r3.F0
            nj4 r7 = r7.b
            java.lang.Object r7 = r7.get()
            w6a r7 = (defpackage.w6a) r7
            i03 r8 = r7.c
            java.util.Locale r18 = r8.u()
            long r21 = r8.m()
            android.content.Context r7 = r7.a
            r23 = 1
            r17 = r7
            java.lang.String r7 = defpackage.xs7.o(r17, r18, r19, r21, r23)
            r3.D0 = r7
        L_0x0589:
            java.lang.String r3 = r3.D0
            r29 = r3
        L_0x058d:
            i22 r3 = r1.o
            o62 r7 = r3.b
            int r7 = r7.m
            long r33 = r3.e()
            ho2 r0 = r0.c
            i22 r3 = r1.o
            ma2 r0 = (defpackage.ma2) r0
            r0.getClass()
            ha2 r8 = new ha2
            r8.<init>(r3)
            ja2 r0 = r0.t
            java.lang.Object r0 = r0.c(r8)
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x05b9
            boolean r3 = defpackage.h0e.c0(r3)
            if (r3 == 0) goto L_0x05b7
            goto L_0x05b9
        L_0x05b7:
            r15 = r0
            goto L_0x05ba
        L_0x05b9:
            r15 = 0
        L_0x05ba:
            r36 = r15
            java.lang.CharSequence r36 = (java.lang.CharSequence) r36
            java.util.List r0 = r1.c
            int r3 = r1.a
            if (r3 != r13) goto L_0x05c7
            r38 = r12
            goto L_0x05c9
        L_0x05c7:
            r38 = r14
        L_0x05c9:
            i22 r3 = r1.o
            r3.i0()
            java.lang.CharSequence r3 = r3.B0
            i22 r8 = r1.o
            boolean r8 = r8.U()
            if (r8 != 0) goto L_0x05ea
            i22 r1 = r1.o
            tf3 r1 = r1.k()
            if (r1 == 0) goto L_0x05e7
            boolean r1 = r1.u()
            if (r1 != r12) goto L_0x05e7
            goto L_0x05ea
        L_0x05e7:
            r43 = r14
            goto L_0x05ec
        L_0x05ea:
            r43 = r12
        L_0x05ec:
            r22 = r2
            r23 = r4
            r30 = r7
            r35 = r6
            r37 = r0
            r42 = r3
            r22.<init>(r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r42, r43)
        L_0x05fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.src.b(prc, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
