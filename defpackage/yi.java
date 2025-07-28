package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: yi  reason: default package */
public final class yi extends l5e implements i26 {
    public final /* synthetic */ gj A0;
    public List X;
    public List Y;
    public nj Z;
    public int w0;
    public int x0;
    public int y0;
    public /* synthetic */ Object z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yi(gj gjVar, Continuation continuation) {
        super(2, continuation);
        this.A0 = gjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yi yiVar = new yi(this.A0, continuation);
        yiVar.z0 = obj;
        return yiVar;
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [java.util.List, java.lang.Object, nj] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0175 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0176 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            r2 = 1
            pu3 r3 = pu3.a
            int r4 = r0.y0
            hw4 r5 = hw4.a
            jue r6 = jue.a
            r7 = 0
            r8 = 5
            r9 = 4
            r10 = 3
            gj r11 = r0.A0
            r12 = 0
            if (r4 == 0) goto L_0x0054
            if (r4 == r2) goto L_0x0050
            if (r4 == r1) goto L_0x0045
            if (r4 == r10) goto L_0x0041
            if (r4 == r9) goto L_0x002c
            if (r4 != r8) goto L_0x0024
            wx3.H(r20)
            goto L_0x0176
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002c:
            int r1 = r0.x0
            int r4 = r0.w0
            nj r5 = r0.Z
            java.util.List r10 = r0.Y
            java.util.List r13 = r0.X
            java.lang.Object r14 = r0.z0
            rj5 r14 = (rj5) r14
            wx3.H(r20)
            r7 = r20
            goto L_0x00dc
        L_0x0041:
            wx3.H(r20)
            goto L_0x00a8
        L_0x0045:
            java.lang.Object r1 = r0.z0
            rj5 r1 = (rj5) r1
            wx3.H(r20)
            r4 = r1
            r1 = r20
            goto L_0x0095
        L_0x0050:
            wx3.H(r20)
            goto L_0x006c
        L_0x0054:
            wx3.H(r20)
            java.lang.Object r4 = r0.z0
            rj5 r4 = (rj5) r4
            rj r13 = r11.e
            boolean r13 = r13.a()
            if (r13 != 0) goto L_0x006d
            r0.y0 = r2
            java.lang.Object r0 = r4.a(r5, r0)
            if (r0 != r3) goto L_0x006c
            return r3
        L_0x006c:
            return r6
        L_0x006d:
            r7e r13 = r11.h
            java.lang.Object r13 = r13.getValue()
            oj r13 = (defpackage.oj) r13
            r0.z0 = r4
            r0.y0 = r1
            r13.getClass()
            java.lang.String r14 = "SELECT * FROM animoji_set"
            pec r14 = pec.a(r7, r14)
            android.os.CancellationSignal r15 = new android.os.CancellationSignal
            r15.<init>()
            uh r7 = new uh
            r7.<init>(r13, r1, r14)
            aec r1 = r13.a
            java.lang.Object r1 = r1g.g(r1, r15, r7, r0)
            if (r1 != r3) goto L_0x0095
            return r3
        L_0x0095:
            java.util.List r1 = (java.util.List) r1
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x00a9
            r0.z0 = r12
            r0.y0 = r10
            java.lang.Object r0 = r4.a(r5, r0)
            if (r0 != r3) goto L_0x00a8
            return r3
        L_0x00a8:
            return r6
        L_0x00a9:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r1.size()
            r13 = r1
            r14 = r4
            r10 = r5
            r1 = r7
            r4 = 0
        L_0x00b7:
            if (r4 >= r1) goto L_0x0163
            java.lang.Object r5 = r13.get(r4)
            nj r5 = (defpackage.nj) r5
            k77[] r7 = defpackage.gj.p
            wh r7 = r11.h()
            java.util.List r15 = r5.f
            r0.z0 = r14
            r0.X = r13
            r0.Y = r10
            r0.Z = r5
            r0.w0 = r4
            r0.x0 = r1
            r0.y0 = r9
            java.lang.Object r7 = r7.a(r15, r0)
            if (r7 != r3) goto L_0x00dc
            return r3
        L_0x00dc:
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r7)
            boolean r7 = r15.isEmpty()
            if (r7 == 0) goto L_0x00ee
            r20 = r1
            r1 = r2
            goto L_0x015a
        L_0x00ee:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r9 = r5.f
            int r9 = r9.size()
            r8 = 0
        L_0x00fa:
            if (r8 >= r9) goto L_0x0149
            java.util.List r12 = r5.f
            java.lang.Object r12 = r12.get(r8)
            java.lang.Number r12 = (java.lang.Number) r12
            long r16 = r12.longValue()
            java.util.Iterator r12 = r15.iterator()
        L_0x010c:
            boolean r18 = r12.hasNext()
            if (r18 == 0) goto L_0x0127
            java.lang.Object r18 = r12.next()
            r2 = r18
            ii r2 = (defpackage.ii) r2
            r20 = r1
            long r1 = r2.a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0123
            goto L_0x012b
        L_0x0123:
            r1 = r20
            r2 = 1
            goto L_0x010c
        L_0x0127:
            r20 = r1
            r18 = 0
        L_0x012b:
            r1 = r18
            ii r1 = (defpackage.ii) r1
            if (r1 != 0) goto L_0x0133
        L_0x0131:
            r1 = 1
            goto L_0x0143
        L_0x0133:
            k77[] r2 = defpackage.gj.p
            r11.getClass()
            ph r2 = defpackage.gj.l(r1)
            r7.add(r2)
            r15.remove(r1)
            goto L_0x0131
        L_0x0143:
            int r8 = r8 + r1
            r2 = r1
            r12 = 0
            r1 = r20
            goto L_0x00fa
        L_0x0149:
            r20 = r1
            r1 = r2
            lj r2 = new lj
            java.lang.String r8 = r5.c
            java.lang.String r9 = r5.d
            java.lang.String r5 = r5.b
            r2.<init>(r5, r8, r9, r7)
            r10.add(r2)
        L_0x015a:
            int r4 = r4 + r1
            r2 = r1
            r8 = 5
            r9 = 4
            r12 = 0
            r1 = r20
            goto L_0x00b7
        L_0x0163:
            r2 = r12
            r0.z0 = r2
            r0.X = r2
            r0.Y = r2
            r0.Z = r2
            r1 = 5
            r0.y0 = r1
            java.lang.Object r0 = r14.a(r10, r0)
            if (r0 != r3) goto L_0x0176
            return r3
        L_0x0176:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi.o(java.lang.Object):java.lang.Object");
    }
}
