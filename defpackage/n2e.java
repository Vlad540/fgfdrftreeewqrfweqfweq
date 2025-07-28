package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: n2e  reason: default package */
public final class n2e extends l5e implements i26 {
    public final /* synthetic */ m3e A0;
    public final /* synthetic */ String B0;
    public final /* synthetic */ int C0;
    public final /* synthetic */ yha D0;
    public final /* synthetic */ int E0 = 10;
    public List X;
    public j7c Y;
    public int Z;
    public int w0;
    public int x0;
    public int y0;
    public /* synthetic */ Object z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n2e(m3e m3e, String str, int i, yha yha, Continuation continuation) {
        super(2, continuation);
        this.A0 = m3e;
        this.B0 = str;
        this.C0 = i;
        this.D0 = yha;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n2e n2e = new n2e(this.A0, this.B0, this.C0, this.D0, continuation);
        n2e.z0 = obj;
        return n2e;
    }

    /* JADX WARNING: type inference failed for: r15v7, types: [j7c, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00df A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 1
            r6 = 2
            int r8 = r0.E0
            m3e r9 = r0.A0
            yha r10 = r0.D0
            int r11 = r0.C0
            java.lang.String r12 = r0.B0
            if (r2 == 0) goto L_0x004d
            if (r2 == r3) goto L_0x0038
            if (r2 != r6) goto L_0x0030
            int r1 = r0.Z
            j7c r2 = r0.Y
            java.util.List r6 = r0.X
            java.lang.Object r0 = r0.z0
            ou3 r0 = (ou3) r0
            wx3.H(r18)     // Catch:{ all -> 0x002b }
            r0 = r18
            r15 = r2
            r2 = 0
            goto L_0x017e
        L_0x002b:
            r0 = move-exception
            r15 = r2
            r2 = 0
            goto L_0x0187
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            int r2 = r0.x0
            int r13 = r0.w0
            int r14 = r0.Z
            j7c r15 = r0.Y
            java.util.List r6 = r0.X
            java.lang.Object r4 = r0.z0
            ou3 r4 = (ou3) r4
            wx3.H(r18)     // Catch:{ all -> 0x00a7 }
            r5 = r18
            goto L_0x00d1
        L_0x004d:
            wx3.H(r18)
            java.lang.Object r2 = r0.z0
            r4 = r2
            ou3 r4 = (ou3) r4
            java.lang.String r2 = r9.a
            boolean r2 = hhd.f(r2, r12)
            if (r2 == 0) goto L_0x0066
            int r2 = r9.b
            if (r2 != r11) goto L_0x0066
            boolean r2 = r9.f
            if (r2 != 0) goto L_0x0066
            return r9
        L_0x0066:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            j7c r15 = new j7c
            r15.<init>()
            java.lang.Object r2 = r10.a
            n62 r2 = (defpackage.n62) r2
            n62 r13 = defpackage.n62.b
            if (r2 == r13) goto L_0x007f
            n62 r13 = defpackage.n62.o
            if (r2 != r13) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r13 = 0
            goto L_0x0080
        L_0x007f:
            r13 = r3
        L_0x0080:
            mz4 r2 = new mz4
            r14 = 4
            r2.<init>(r12, r11, r10, r14)
            r7e r14 = new r7e
            r14.<init>(r2)
            int r2 = r9.e
            if (r13 != 0) goto L_0x00aa
            java.lang.Object r16 = r14.getValue()
            r5 = r16
            p2e r5 = (defpackage.p2e) r5
            p2e r7 = defpackage.p2e.c
            if (r5 == r7) goto L_0x00aa
            java.lang.Object r5 = r14.getValue()
            p2e r5 = (defpackage.p2e) r5
            p2e r7 = defpackage.p2e.o
            if (r5 != r7) goto L_0x00a6
            goto L_0x00aa
        L_0x00a6:
            r14 = r2
        L_0x00a7:
            r2 = 0
            goto L_0x011e
        L_0x00aa:
            r0.z0 = r4     // Catch:{ all -> 0x011b }
            r0.X = r6     // Catch:{ all -> 0x011b }
            r0.Y = r15     // Catch:{ all -> 0x011b }
            r0.Z = r2     // Catch:{ all -> 0x011b }
            r0.w0 = r13     // Catch:{ all -> 0x011b }
            r0.x0 = r8     // Catch:{ all -> 0x011b }
            r0.y0 = r3     // Catch:{ all -> 0x011b }
            java.lang.Object r5 = r10.b     // Catch:{ all -> 0x011b }
            pae r5 = (defpackage.pae) r5     // Catch:{ all -> 0x011b }
            n3a r5 = (n3a) r5     // Catch:{ all -> 0x011b }
            ju3 r5 = r5.a()     // Catch:{ all -> 0x011b }
            l2e r7 = new l2e     // Catch:{ all -> 0x011b }
            r14 = 0
            r7.<init>(r10, r12, r11, r14)     // Catch:{ all -> 0x011b }
            java.lang.Object r5 = xs7.U(r5, r7, r0)     // Catch:{ all -> 0x011b }
            if (r5 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            r14 = r2
            r2 = r8
        L_0x00d1:
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x00a7 }
            int r7 = r5.size()     // Catch:{ all -> 0x00a7 }
            r15.a = r7     // Catch:{ all -> 0x00a7 }
            int r7 = r5.size()     // Catch:{ all -> 0x00a7 }
            if (r7 <= r14) goto L_0x00a7
            int r2 = r2 + r14
            int r7 = r5.size()     // Catch:{ all -> 0x00a7 }
            if (r2 <= r7) goto L_0x00e7
            r2 = r7
        L_0x00e7:
            java.util.List r2 = r5.subList(r14, r2)     // Catch:{ all -> 0x00a7 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00a7 }
            r7 = 10
            int r3 = q23.H(r2, r7)     // Catch:{ all -> 0x00a7 }
            r5.<init>(r3)     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x00fa:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0114
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a7 }
            e2e r3 = (defpackage.e2e) r3     // Catch:{ all -> 0x00a7 }
            l3e r7 = new l3e     // Catch:{ all -> 0x00a7 }
            r18 = r2
            r2 = 0
            r7.<init>(r3, r2)     // Catch:{ all -> 0x011e }
            r5.add(r7)     // Catch:{ all -> 0x011e }
            r2 = r18
            goto L_0x00fa
        L_0x0114:
            r2 = 0
            r6.addAll(r5)     // Catch:{ all -> 0x011e }
            goto L_0x011e
        L_0x0119:
            r14 = r3
            goto L_0x011e
        L_0x011b:
            r3 = r2
            r2 = 0
            goto L_0x0119
        L_0x011e:
            if (r13 == 0) goto L_0x015b
            java.lang.Object r3 = r10.Z
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x015b
            boolean r3 = r3.isEmpty()
            r5 = 1
            r3 = r3 ^ r5
            if (r3 != r5) goto L_0x015b
            java.lang.Object r3 = r10.Z
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0140
            java.lang.Object r3 = o23.X(r3)
            e2e r3 = (defpackage.e2e) r3
            if (r3 == 0) goto L_0x0140
            int r3 = r3.b
        L_0x013e:
            r5 = 1
            goto L_0x0142
        L_0x0140:
            r3 = r2
            goto L_0x013e
        L_0x0142:
            if (r3 == r5) goto L_0x015b
            r10.X = r12
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
            r10.Y = r0
            java.util.List r0 = r9.d
            java.util.ArrayList r0 = o23.i0(r0, r6)
            int r1 = r15.a
            m3e r2 = new m3e
            r2.<init>(r12, r11, r1, r0)
            return r2
        L_0x015b:
            r0.z0 = r4     // Catch:{ all -> 0x0185 }
            r0.X = r6     // Catch:{ all -> 0x0185 }
            r0.Y = r15     // Catch:{ all -> 0x0185 }
            r0.Z = r14     // Catch:{ all -> 0x0185 }
            r3 = 2
            r0.y0 = r3     // Catch:{ all -> 0x0185 }
            java.lang.Object r3 = r10.b     // Catch:{ all -> 0x0185 }
            pae r3 = (defpackage.pae) r3     // Catch:{ all -> 0x0185 }
            n3a r3 = (n3a) r3     // Catch:{ all -> 0x0185 }
            ju3 r3 = r3.a()     // Catch:{ all -> 0x0185 }
            m2e r4 = new m2e     // Catch:{ all -> 0x0185 }
            r5 = 0
            r4.<init>(r10, r12, r11, r5)     // Catch:{ all -> 0x0185 }
            java.lang.Object r0 = xs7.U(r3, r4, r0)     // Catch:{ all -> 0x0185 }
            if (r0 != r1) goto L_0x017d
            return r1
        L_0x017d:
            r1 = r14
        L_0x017e:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0181 }
            goto L_0x018d
        L_0x0181:
            r0 = move-exception
            goto L_0x0187
        L_0x0183:
            r1 = r14
            goto L_0x0187
        L_0x0185:
            r0 = move-exception
            goto L_0x0183
        L_0x0187:
            kcc r3 = new kcc
            r3.<init>(r0)
            r0 = r3
        L_0x018d:
            hw4 r3 = hw4.a
            boolean r4 = r0 instanceof kcc
            if (r4 == 0) goto L_0x0194
            r0 = r3
        L_0x0194:
            java.util.List r0 = (java.util.List) r0
            int r3 = r6.size()
            if (r3 < r8) goto L_0x01af
            java.util.List r1 = r9.d
            java.util.ArrayList r1 = o23.i0(r1, r6)
            int r2 = r15.a
            int r0 = r0.size()
            int r0 = r0 + r2
            m3e r2 = new m3e
            r2.<init>(r12, r11, r0, r1)
            return r2
        L_0x01af:
            int r3 = r15.a
            int r1 = r1 - r3
            if (r1 >= 0) goto L_0x01b6
            r4 = r2
            goto L_0x01b7
        L_0x01b6:
            r4 = r1
        L_0x01b7:
            int r1 = r0.size()
            int r1 = r1 + r3
            r15.a = r1
            int r1 = r6.size()     // Catch:{ all -> 0x01fd }
            int r8 = r8 - r1
            int r1 = r0.size()     // Catch:{ all -> 0x01fd }
            if (r1 <= r4) goto L_0x01fd
            int r8 = r8 + r4
            int r1 = r0.size()     // Catch:{ all -> 0x01fd }
            if (r8 <= r1) goto L_0x01d1
            r8 = r1
        L_0x01d1:
            java.util.List r0 = r0.subList(r4, r8)     // Catch:{ all -> 0x01fd }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x01fd }
            r2 = 10
            int r2 = q23.H(r0, r2)     // Catch:{ all -> 0x01fd }
            r1.<init>(r2)     // Catch:{ all -> 0x01fd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01fd }
        L_0x01e4:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x01fd }
            if (r2 == 0) goto L_0x01fa
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x01fd }
            e2e r2 = (defpackage.e2e) r2     // Catch:{ all -> 0x01fd }
            l3e r3 = new l3e     // Catch:{ all -> 0x01fd }
            r4 = 1
            r3.<init>(r2, r4)     // Catch:{ all -> 0x01fd }
            r1.add(r3)     // Catch:{ all -> 0x01fd }
            goto L_0x01e4
        L_0x01fa:
            r6.addAll(r1)     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r10.X = r12
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
            r10.Y = r0
            java.util.List r0 = r9.d
            java.util.ArrayList r0 = o23.i0(r0, r6)
            int r1 = r15.a
            m3e r2 = new m3e
            r2.<init>(r12, r11, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2e.o(java.lang.Object):java.lang.Object");
    }
}
