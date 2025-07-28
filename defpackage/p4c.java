package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: p4c  reason: default package */
public final class p4c extends l5e implements i26 {
    public int X;
    public final /* synthetic */ byte[] Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p4c(Continuation continuation, RecordControlsWidget recordControlsWidget, byte[] bArr) {
        super(2, continuation);
        this.Y = bArr;
        this.Z = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p4c(continuation, this.Z, this.Y);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 1
            pu3 r1 = pu3.a
            int r2 = r12.X
            if (r2 == 0) goto L_0x0016
            if (r2 != r0) goto L_0x000e
            wx3.H(r13)
            goto L_0x009a
        L_0x000e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0016:
            wx3.H(r13)
            r13 = 0
            one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget r2 = r12.Z
            byte[] r3 = r12.Y
            if (r3 == 0) goto L_0x007b
            android.animation.IntEvaluator r4 = defpackage.q60.J0
            k77[] r4 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.m1
            q60 r4 = r2.N0()
            int r4 = r4.getPeaksCount()
            int r5 = r3.length
            if (r5 != 0) goto L_0x0030
            goto L_0x007c
        L_0x0030:
            byte[] r5 = new byte[r4]
            r6 = 0
            r7 = r6
        L_0x0034:
            if (r7 >= r4) goto L_0x0079
            if (r7 == 0) goto L_0x0072
            int r8 = r3.length
            if (r8 != r0) goto L_0x003c
            goto L_0x0072
        L_0x003c:
            int r8 = r4 + -1
            if (r7 != r8) goto L_0x0045
            int r8 = r3.length
            int r8 = r8 - r0
            byte r8 = r3[r8]
            goto L_0x0074
        L_0x0045:
            float r8 = (float) r7
            float r9 = (float) r4
            float r8 = r8 / r9
            int r9 = r3.length
            int r9 = r9 - r0
            float r9 = (float) r9
            float r8 = r8 * r9
            int r9 = (int) r8
            int r10 = r9 + 1
            int r11 = r3.length
            int r11 = r11 - r0
            if (r9 >= r11) goto L_0x0070
            int r11 = r3.length
            int r11 = r11 - r0
            if (r10 >= r11) goto L_0x0070
            float r11 = (float) r9
            float r8 = r8 - r11
            byte r9 = r3[r9]
            byte r10 = r3[r10]
            android.animation.IntEvaluator r11 = defpackage.q60.J0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r8 = r11.evaluate(r8, r9, r10)
            int r8 = r8.intValue()
            goto L_0x0074
        L_0x0070:
            r8 = r6
            goto L_0x0074
        L_0x0072:
            byte r8 = r3[r6]
        L_0x0074:
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r7 + r0
            goto L_0x0034
        L_0x0079:
            r3 = r5
            goto L_0x007c
        L_0x007b:
            r3 = r13
        L_0x007c:
            k77[] r4 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.m1
            t97 r4 = r2.X
            java.lang.Object r4 = r4.getValue()
            pae r4 = (defpackage.pae) r4
            n3a r4 = (n3a) r4
            zr7 r4 = r4.c()
            o4c r5 = new o4c
            r5.<init>(r13, r2, r3)
            r12.X = r0
            java.lang.Object r12 = xs7.U(r4, r5, r12)
            if (r12 != r1) goto L_0x009a
            return r1
        L_0x009a:
            jue r12 = jue.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4c.o(java.lang.Object):java.lang.Object");
    }
}
