package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fo7  reason: default package */
public final class fo7 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ go7 Z;
    public final /* synthetic */ jo7 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fo7(go7 go7, jo7 jo7, Continuation continuation) {
        super(2, continuation);
        this.Z = go7;
        this.w0 = jo7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fo7 fo7 = new fo7(this.Z, this.w0, continuation);
        fo7.Y = obj;
        return fo7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r11.Z.d(r12.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000e, B:10:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012 A[ExcHandler: TamErrorException (r12v4 'e' ru.ok.tamtam.errors.TamErrorException A[CUSTOM_DECLARE]), Splitter:B:4:0x000e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = pu3.a
            int r1 = r11.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            java.lang.Object r0 = r11.Y
            ou3 r0 = (ou3) r0
            wx3.H(r12)     // Catch:{ TamErrorException -> 0x0012, all -> 0x0049 }
            goto L_0x006b
        L_0x0012:
            r12 = move-exception
            goto L_0x0064
        L_0x0014:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001c:
            wx3.H(r12)
            java.lang.Object r12 = r11.Y
            ou3 r12 = (ou3) r12
            go7 r1 = r11.Z     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            pl r1 = r1.c     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            if (r1 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r2
        L_0x002b:
            t97 r1 = r1.j     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            r4 = r1
            bp7 r4 = (defpackage.bp7) r4     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            go7 r1 = r11.Z     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            long r5 = r1.a     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            jo7 r7 = r11.w0     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            long r8 = r1.X     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            r11.Y = r12     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            r11.X = r3     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            r10 = r11
            java.lang.Object r11 = r4.s(r5, r7, r8, r10)     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            if (r11 != r0) goto L_0x006b
            return r0
        L_0x0048:
            r0 = r12
        L_0x0049:
            java.lang.Class r11 = r0.getClass()
            java.lang.String r11 = r11.getName()
            fn6 r12 = udd.e
            if (r12 != 0) goto L_0x0056
            goto L_0x006b
        L_0x0056:
            boolean r0 = r12.c()
            if (r0 == 0) goto L_0x006b
            tn7 r0 = defpackage.tn7.w0
            java.lang.String r1 = "beans.loginLogic.onLogin fail"
            r12.d(r0, r11, r1, r2)
            goto L_0x006b
        L_0x0064:
            go7 r11 = r11.Z
            uae r12 = r12.a
            r11.d(r12)
        L_0x006b:
            jue r11 = jue.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo7.o(java.lang.Object):java.lang.Object");
    }
}
