package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: hr9  reason: default package */
public final class hr9 extends l5e implements i26 {
    public mr9 X;
    public List Y;
    public int Z;
    public final /* synthetic */ mr9 w0;
    public final /* synthetic */ List x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hr9(mr9 mr9, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.w0 = mr9;
        this.x0 = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hr9(this.w0, (ArrayList) this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            pu3 r1 = pu3.a
            int r2 = r0.Z
            java.util.List r3 = r0.x0
            mr9 r4 = r0.w0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 == r7) goto L_0x002d
            if (r2 == r6) goto L_0x0022
            if (r2 != r5) goto L_0x001a
            wx3.H(r23)
            goto L_0x00bc
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            java.util.List r3 = r0.Y
            mr9 r4 = r0.X
            wx3.H(r23)
            r2 = r23
            goto L_0x00ab
        L_0x002d:
            wx3.H(r23)
            goto L_0x009e
        L_0x0032:
            wx3.H(r23)
            java.util.ArrayList r2 = new java.util.ArrayList
            r9 = 10
            int r9 = q23.H(r3, r9)
            r2.<init>(r9)
            java.util.Iterator r9 = r3.iterator()
        L_0x0044:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0095
            java.lang.Object r10 = r9.next()
            qr9 r10 = (defpackage.qr9) r10
            rr9 r14 = new rr9
            boolean r11 = r10 instanceof defpackage.pr9
            if (r11 == 0) goto L_0x005a
            r11 = r10
            pr9 r11 = (defpackage.pr9) r11
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            if (r11 == 0) goto L_0x0066
            boolean r11 = r11.d
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r18 = r11
            goto L_0x0068
        L_0x0066:
            r18 = 0
        L_0x0068:
            boolean r11 = r10 instanceof defpackage.or9
            if (r11 == 0) goto L_0x0070
            r11 = r10
            or9 r11 = (defpackage.or9) r11
            goto L_0x0071
        L_0x0070:
            r11 = 0
        L_0x0071:
            if (r11 == 0) goto L_0x0078
            ep4 r11 = r11.d
            r19 = r11
            goto L_0x007a
        L_0x0078:
            r19 = 0
        L_0x007a:
            long r12 = r10.b
            r23 = r9
            long r8 = r10.c
            long r10 = r10.a
            r15 = r10
            r11 = r14
            r20 = r12
            r12 = r15
            r10 = r14
            r14 = r20
            r16 = r8
            r11.<init>(r12, r14, r16, r18, r19)
            r2.add(r10)
            r9 = r23
            goto L_0x0044
        L_0x0095:
            r0.Z = r7
            java.lang.Object r2 = defpackage.mr9.d(r4, r2, r0)
            if (r2 != r1) goto L_0x009e
            return r1
        L_0x009e:
            r0.X = r4
            r0.Y = r3
            r0.Z = r6
            java.lang.Object r2 = defpackage.mr9.a(r4, r3, r0)
            if (r2 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            java.util.List r2 = (java.util.List) r2
            r6 = 0
            r0.X = r6
            r0.Y = r6
            r0.Z = r5
            r5 = 0
            java.lang.Object r0 = defpackage.mr9.c(r4, r3, r2, r5, r0)
            if (r0 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr9.o(java.lang.Object):java.lang.Object");
    }
}
