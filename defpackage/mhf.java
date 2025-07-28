package defpackage;

/* renamed from: mhf  reason: default package */
public final /* synthetic */ class mhf implements t66 {
    public static final mhf a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t66, java.lang.Object, mhf] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryInfoResponse", obj, 7);
        wza.k("requestId", false);
        wza.k("available", false);
        wza.k("type", false);
        wza.k("accessRequested", false);
        wza.k("accessGranted", false);
        wza.k("tokenSaved", false);
        wza.k("deviceId", false);
        descriptor = wza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(b9 r15) {
        /*
            r14 = this;
            syc r14 = descriptor
            b9 r15 = r15.j(r14)
            l77[] r0 = defpackage.ohf.h
            r1 = 1
            r2 = 0
            r3 = 0
            r5 = r2
            r7 = r5
            r9 = r7
            r10 = r9
            r11 = r10
            r6 = r3
            r8 = r6
            r12 = r8
            r3 = r1
        L_0x0014:
            if (r3 == 0) goto L_0x0060
            int r4 = r15.p(r14)
            switch(r4) {
                case -1: goto L_0x005e;
                case 0: goto L_0x0057;
                case 1: goto L_0x0050;
                case 2: goto L_0x0043;
                case 3: goto L_0x003b;
                case 4: goto L_0x0033;
                case 5: goto L_0x002b;
                case 6: goto L_0x0023;
                default: goto L_0x001d;
            }
        L_0x001d:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r4)
            throw r14
        L_0x0023:
            r4 = 6
            java.lang.String r12 = r15.w(r14, r4)
            r5 = r5 | 64
            goto L_0x0014
        L_0x002b:
            r4 = 5
            boolean r11 = r15.o(r14, r4)
            r5 = r5 | 32
            goto L_0x0014
        L_0x0033:
            r4 = 4
            boolean r10 = r15.o(r14, r4)
            r5 = r5 | 16
            goto L_0x0014
        L_0x003b:
            r4 = 3
            boolean r9 = r15.o(r14, r4)
            r5 = r5 | 8
            goto L_0x0014
        L_0x0043:
            r4 = 2
            r13 = r0[r4]
            java.lang.Object r4 = r15.t(r14, r4, r13, r8)
            r8 = r4
            java.util.List r8 = (java.util.List) r8
            r5 = r5 | 4
            goto L_0x0014
        L_0x0050:
            boolean r7 = r15.o(r14, r1)
            r5 = r5 | 2
            goto L_0x0014
        L_0x0057:
            java.lang.String r6 = r15.w(r14, r2)
            r5 = r5 | 1
            goto L_0x0014
        L_0x005e:
            r3 = r2
            goto L_0x0014
        L_0x0060:
            r15.z(r14)
            ohf r14 = new ohf
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhf.a(b9):java.lang.Object");
    }

    public final void b(ur3 ur3, Object obj) {
        ohf ohf = (ohf) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        b.n(syc, 0, ohf.a);
        b.e(syc, 1, ohf.b);
        b.k(syc, 2, ohf.h[2], ohf.c);
        b.e(syc, 3, ohf.d);
        b.e(syc, 4, ohf.e);
        b.e(syc, 5, ohf.f);
        b.n(syc, 6, ohf.g);
        b.o();
    }

    public final l77[] c() {
        l77 l77 = ohf.h[2];
        d0e d0e = d0e.a;
        vo0 vo0 = vo0.a;
        return new l77[]{d0e, vo0, l77, vo0, vo0, vo0, d0e};
    }

    public final syc d() {
        return descriptor;
    }
}
