package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vm2  reason: default package */
public final class vm2 extends l5e implements i26 {
    public final /* synthetic */ List A0;
    public final /* synthetic */ jv5 B0;
    public Serializable X;
    public Serializable Y;
    public int Z;
    public final /* synthetic */ nn2 w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ Long y0;
    public final /* synthetic */ List z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vm2(nn2 nn2, long j, Long l, ArrayList arrayList, ArrayList arrayList2, jv5 jv5, Continuation continuation) {
        super(2, continuation);
        this.w0 = nn2;
        this.x0 = j;
        this.y0 = l;
        this.z0 = arrayList;
        this.A0 = arrayList2;
        this.B0 = jv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vm2(this.w0, this.x0, this.y0, (ArrayList) this.z0, (ArrayList) this.A0, this.B0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.util.LinkedList} */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r1v13, types: [java.util.Queue] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0171 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r19
            r0 = 2
            r1 = 1
            pu3 r6 = defpackage.pu3.a
            int r2 = r5.Z
            r3 = 0
            java.util.List r4 = r5.z0
            r7 = 3
            long r8 = r5.x0
            nn2 r10 = r5.w0
            if (r2 == 0) goto L_0x0049
            if (r2 == r1) goto L_0x003a
            if (r2 == r0) goto L_0x0027
            if (r2 != r7) goto L_0x001f
            defpackage.wx3.H(r20)
            r0 = r20
            goto L_0x0172
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            java.io.Serializable r1 = r5.Y
            java.util.Queue r1 = (java.util.Queue) r1
            java.io.Serializable r2 = r5.X
            java.util.Queue r2 = (java.util.Queue) r2
            defpackage.wx3.H(r20)
            r7 = r8
            r9 = r2
            r2 = r1
            r1 = r0
            r0 = r20
            goto L_0x0139
        L_0x003a:
            java.io.Serializable r2 = r5.Y
            l7c r2 = (defpackage.l7c) r2
            java.io.Serializable r11 = r5.X
            l7c r11 = (defpackage.l7c) r11
            defpackage.wx3.H(r20)
            r12 = r11
            r11 = r20
            goto L_0x0069
        L_0x0049:
            defpackage.wx3.H(r20)
            l7c r2 = new l7c
            r2.<init>()
            t97 r11 = r10.J0
            java.lang.Object r11 = r11.getValue()
            gw8 r11 = (gw8) r11
            r5.X = r2
            r5.Y = r2
            r5.Z = r1
            java.lang.Long r12 = r5.y0
            java.lang.Object r11 = r11.a(r8, r12, r5)
            if (r11 != r6) goto L_0x0068
            return r6
        L_0x0068:
            r12 = r2
        L_0x0069:
            r2.a = r11
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.Iterator r11 = r4.iterator()
            r13 = 0
            r14 = r13
        L_0x0076:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x00b8
            java.lang.Object r15 = r11.next()
            int r16 = r14 + 1
            if (r14 < 0) goto L_0x00b4
            java.lang.Number r15 = (java.lang.Number) r15
            long r0 = r15.longValue()
            if (r14 != 0) goto L_0x009e
            k77[] r14 = defpackage.nn2.g1
            v0d r14 = new v0d
            r14.<init>(r8)
            r14.m = r0
            java.lang.Object r0 = r12.a
            sq8 r0 = (sq8) r0
            r14.b = r0
            r12.a = r3
            goto L_0x00a7
        L_0x009e:
            k77[] r14 = defpackage.nn2.g1
            v0d r14 = new v0d
            r14.<init>(r8)
            r14.m = r0
        L_0x00a7:
            w0d r0 = new w0d
            r0.<init>(r14)
            r2.add(r0)
            r14 = r16
            r0 = 2
            r1 = 1
            goto L_0x0076
        L_0x00b4:
            defpackage.p23.G()
            throw r3
        L_0x00b8:
            java.util.List r0 = r5.A0
            java.util.Iterator r0 = r0.iterator()
        L_0x00be:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011f
            java.lang.Object r1 = r0.next()
            r11 = 1
            int r14 = r13 + 1
            if (r13 < 0) goto L_0x011b
            goa r1 = (goa) r1
            if (r13 != 0) goto L_0x00f5
            java.lang.Object r13 = r12.a
            if (r13 == 0) goto L_0x00f5
            k77[] r15 = defpackage.nn2.g1
            v0d r15 = new v0d
            r15.<init>(r8)
            r17 = r8
            long r7 = r1.a
            int r7 = (int) r7
            r15.n = r7
            java.lang.String r7 = r1.b
            r15.o = r7
            java.lang.String r1 = r1.c
            r15.p = r1
            sq8 r13 = (sq8) r13
            r15.b = r13
            r12.a = r3
            r9 = r12
            r7 = r17
            goto L_0x010e
        L_0x00f5:
            r17 = r8
            k77[] r7 = defpackage.nn2.g1
            v0d r15 = new v0d
            r7 = r17
            r15.<init>(r7)
            r9 = r12
            long r11 = r1.a
            int r11 = (int) r11
            r15.n = r11
            java.lang.String r11 = r1.b
            r15.o = r11
            java.lang.String r1 = r1.c
            r15.p = r1
        L_0x010e:
            w0d r1 = new w0d
            r1.<init>(r15)
            r2.add(r1)
            r12 = r9
            r13 = r14
            r8 = r7
            r7 = 3
            goto L_0x00be
        L_0x011b:
            defpackage.p23.G()
            throw r3
        L_0x011f:
            r7 = r8
            t97 r0 = r10.H0
            java.lang.Object r0 = r0.getValue()
            g86 r0 = (g86) r0
            r5.X = r2
            r5.Y = r2
            r1 = 2
            r5.Z = r1
            jv5 r9 = r5.B0
            java.lang.Object r0 = r0.b(r9, r5)
            if (r0 != r6) goto L_0x0138
            return r6
        L_0x0138:
            r9 = r2
        L_0x0139:
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            g0d r0 = new g0d
            r0.<init>(r7, r9, r1)
            g1d r1 = new g1d
            r1.<init>(r0)
            luf r0 = defpackage.nn2.r(r10)
            r0.a(r1)
            int r2 = r4.size()
            t97 r0 = r10.G0
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            et0 r4 = (defpackage.et0) r4
            r5.X = r3
            r5.Y = r3
            r0 = 3
            r5.Z = r0
            long r0 = r5.x0
            jv5 r7 = r5.B0
            r3 = r4
            r4 = r7
            r5 = r19
            java.lang.Object r0 = ns7.b(r0, r2, r3, r4, r5)
            if (r0 != r6) goto L_0x0172
            return r6
        L_0x0172:
            yl2 r0 = (defpackage.yl2) r0
            l05 r1 = r10.c1
            taf.o(r1, r0)
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm2.o(java.lang.Object):java.lang.Object");
    }
}
