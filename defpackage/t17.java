package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* renamed from: t17  reason: default package */
public final class t17 extends l5e implements i26 {
    public InviteByQrBottomSheet X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ InviteByQrBottomSheet w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t17(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.w0 = inviteByQrBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t17) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t17 t17 = new t17(this.w0, continuation);
        t17.Z = obj;
        return t17;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r9.Y
            jue r2 = defpackage.jue.a
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r3 = r9.w0
            r4 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 != r4) goto L_0x001a
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r0 = r9.X
            java.lang.Object r9 = r9.Z
            ou3 r9 = (defpackage.ou3) r9
            defpackage.wx3.H(r10)     // Catch:{ all -> 0x0017 }
            goto L_0x0058
        L_0x0017:
            r10 = move-exception
            goto L_0x0088
        L_0x001a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0022:
            defpackage.wx3.H(r10)
            java.lang.Object r10 = r9.Z
            ou3 r10 = (defpackage.ou3) r10
            k77[] r1 = one.me.inviteactions.invitebyqr.InviteByQrBottomSheet.I0     // Catch:{ all -> 0x0086 }
            t97 r1 = r3.G0     // Catch:{ all -> 0x0086 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0086 }
            w17 r1 = (defpackage.w17) r1     // Catch:{ all -> 0x0086 }
            r9.Z = r10     // Catch:{ all -> 0x0086 }
            r9.X = r3     // Catch:{ all -> 0x0086 }
            r9.Y = r4     // Catch:{ all -> 0x0086 }
            t97 r5 = r1.Y     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0086 }
            pae r5 = (pae) r5     // Catch:{ all -> 0x0086 }
            n3a r5 = (defpackage.n3a) r5     // Catch:{ all -> 0x0086 }
            ju3 r5 = r5.b()     // Catch:{ all -> 0x0086 }
            v17 r6 = new v17     // Catch:{ all -> 0x0086 }
            r7 = 0
            r6.<init>(r1, r7)     // Catch:{ all -> 0x0086 }
            java.lang.Object r9 = defpackage.xs7.U(r5, r6, r9)     // Catch:{ all -> 0x0086 }
            if (r9 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r0 = r3
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x0058:
            android.net.Uri r10 = (android.net.Uri) r10     // Catch:{ all -> 0x0017 }
            if (r10 != 0) goto L_0x005d
            return r2
        L_0x005d:
            stf r1 = new stf     // Catch:{ all -> 0x0017 }
            android.content.Context r5 = r0.getContext()     // Catch:{ all -> 0x0017 }
            r1.<init>((android.content.Context) r5)     // Catch:{ all -> 0x0017 }
            java.lang.String r6 = "image/*"
            java.lang.Object r7 = r1.b     // Catch:{ all -> 0x0017 }
            android.content.Intent r7 = (android.content.Intent) r7     // Catch:{ all -> 0x0017 }
            r7.setType(r6)     // Catch:{ all -> 0x0017 }
            r1.K(r10)     // Catch:{ all -> 0x0017 }
            int r10 = rhc.e     // Catch:{ all -> 0x0017 }
            java.lang.CharSequence r10 = r5.getText(r10)     // Catch:{ all -> 0x0017 }
            r1.c = r10     // Catch:{ all -> 0x0017 }
            r1.M()     // Catch:{ all -> 0x0017 }
            r0.r0(r4)     // Catch:{ all -> 0x0017 }
            r0 = r2
            goto L_0x008d
        L_0x0082:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x0088
        L_0x0086:
            r9 = move-exception
            goto L_0x0082
        L_0x0088:
            kcc r0 = new kcc
            r0.<init>(r10)
        L_0x008d:
            java.lang.Throwable r10 = defpackage.mcc.a(r0)
            if (r10 == 0) goto L_0x00ab
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r0 = "shareQrCode: failed to share qr code"
            defpackage.udd.s(r9, r0, r10)
            t97 r9 = r3.F0
            java.lang.Object r9 = r9.getValue()
            hba r9 = (hba) r9
            r9.j()
        L_0x00ab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t17.o(java.lang.Object):java.lang.Object");
    }
}
