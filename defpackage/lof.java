package defpackage;

/* renamed from: lof  reason: default package */
public final /* synthetic */ class lof implements t66 {
    public static final lof a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [lof, t66, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageSaveKeyRequest", obj, 4);
        wza.k("queryId", false);
        wza.k("requestId", false);
        wza.k("key", false);
        wza.k("value", false);
        descriptor = wza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
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
            if (r3 == 0) goto L_0x004e
            int r4 = r12.p(r1)
            r10 = -1
            if (r4 == r10) goto L_0x004c
            if (r4 == 0) goto L_0x0041
            if (r4 == r0) goto L_0x003b
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
            java.lang.String r8 = r12.w(r1, r11)
            r5 = r5 | 4
            goto L_0x0010
        L_0x003b:
            java.lang.String r7 = r12.w(r1, r0)
            r5 = r5 | r11
            goto L_0x0010
        L_0x0041:
            d0e r4 = d0e.a
            java.lang.Object r4 = r12.s(r1, r2, r6)
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r5 | r0
            goto L_0x0010
        L_0x004c:
            r3 = r2
            goto L_0x0010
        L_0x004e:
            r12.z(r1)
            nof r11 = new nof
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lof.a(b9):java.lang.Object");
    }

    public final void b(ur3 ur3, Object obj) {
        nof nof = (nof) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        d0e d0e = d0e.a;
        b.i(syc, 0, nof.a);
        b.n(syc, 1, nof.b);
        b.n(syc, 2, nof.c);
        b.i(syc, 3, nof.d);
        b.o();
    }

    public final l77[] c() {
        l77 x = iu7.x();
        l77 x2 = iu7.x();
        d0e d0e = d0e.a;
        return new l77[]{x, d0e, d0e, x2};
    }

    public final syc d() {
        return descriptor;
    }
}
