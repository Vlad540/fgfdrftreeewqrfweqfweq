package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: qif  reason: default package */
public final /* synthetic */ class qif implements t66 {
    public static final qif a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t66, java.lang.Object, qif] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryUpdateTokenRequest", obj, 4);
        wza.k("queryId", false);
        wza.k("requestId", false);
        wza.k("reason", false);
        wza.k(ApiProtocol.KEY_TOKEN, false);
        descriptor = wza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(b9 r12) {
        /*
            r11 = this;
            r11 = 2
            r0 = 1
            syc r1 = descriptor
            b9 r12 = r12.j(r1)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r3 = r0
        L_0x0010:
            if (r3 == 0) goto L_0x0053
            int r4 = r12.p(r1)
            r10 = -1
            if (r4 == r10) goto L_0x0051
            if (r4 == 0) goto L_0x0046
            if (r4 == r0) goto L_0x0040
            if (r4 == r11) goto L_0x0034
            r10 = 3
            if (r4 != r10) goto L_0x002e
            d0e r4 = d0e.a
            java.lang.Object r4 = r12.s(r1, r10, r9)
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            r5 = r5 | 8
            goto L_0x0010
        L_0x002e:
            kotlinx.serialization.UnknownFieldException r11 = new kotlinx.serialization.UnknownFieldException
            r11.<init>(r4)
            throw r11
        L_0x0034:
            d0e r4 = d0e.a
            java.lang.Object r4 = r12.s(r1, r11, r8)
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r5 = r5 | 4
            goto L_0x0010
        L_0x0040:
            java.lang.String r7 = r12.w(r1, r0)
            r5 = r5 | r11
            goto L_0x0010
        L_0x0046:
            d0e r4 = d0e.a
            java.lang.Object r4 = r12.s(r1, r2, r6)
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r5 | r0
            goto L_0x0010
        L_0x0051:
            r3 = r2
            goto L_0x0010
        L_0x0053:
            r12.z(r1)
            sif r11 = new sif
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qif.a(b9):java.lang.Object");
    }

    public final void b(ur3 ur3, Object obj) {
        sif sif = (sif) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        d0e d0e = d0e.a;
        b.i(syc, 0, sif.a);
        b.n(syc, 1, sif.b);
        b.i(syc, 2, sif.c);
        b.i(syc, 3, sif.d);
        b.o();
    }

    public final l77[] c() {
        return new l77[]{iu7.x(), d0e.a, iu7.x(), iu7.x()};
    }

    public final syc d() {
        return descriptor;
    }
}
