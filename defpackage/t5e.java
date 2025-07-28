package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t5e  reason: default package */
public final class t5e extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ h6e Z;
    public final /* synthetic */ fwe w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t5e(h6e h6e, fwe fwe, Continuation continuation) {
        super(2, continuation);
        this.Z = h6e;
        this.w0 = fwe;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t5e t5e = new t5e(this.Z, this.w0, continuation);
        t5e.Y = obj;
        return t5e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: rj5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = pu3.a
            int r1 = r11.X
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001a
            if (r1 != r3) goto L_0x0012
            wx3.H(r12)
            goto L_0x00d6
        L_0x0012:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001a:
            java.lang.Object r1 = r11.Y
            rj5 r1 = (rj5) r1
            wx3.H(r12)
            goto L_0x00a7
        L_0x0023:
            wx3.H(r12)
            java.lang.Object r12 = r11.Y
            r1 = r12
            rj5 r1 = (rj5) r1
            h6e r12 = r11.Z
            java.lang.String r12 = r12.b
            fwe r5 = r11.w0
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x0036
            goto L_0x004f
        L_0x0036:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x004f
            tn7 r7 = defpackage.tn7.X
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Starting uploading data="
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r6.d(r7, r12, r5, r2)
        L_0x004f:
            h6e r12 = r11.Z
            fwe r5 = r11.w0
            r12.getClass()
            java.lang.String r6 = r5.a
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0066 }
            r7.<init>(r6)     // Catch:{ all -> 0x0066 }
            long r6 = r7.lastModified()     // Catch:{ all -> 0x0066 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0066 }
            goto L_0x006d
        L_0x0066:
            r6 = move-exception
            kcc r7 = new kcc
            r7.<init>(r6)
            r6 = r7
        L_0x006d:
            r7 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            boolean r10 = r6 instanceof kcc
            if (r10 == 0) goto L_0x0078
            r6 = r9
        L_0x0078:
            java.lang.Number r6 = (java.lang.Number) r6
            long r9 = r6.longValue()
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0098
            long r5 = r5.b
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            java.lang.String r11 = r12.b
            java.lang.String r12 = "File is changed during uploading, aborting!"
            udd.q(r11, r12)
            one.me.sdk.transfer.domain.UploadException r11 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r12 = "Error to upload, file changed"
            r11.<init>(r12)
            throw r11
        L_0x0098:
            h6e r12 = r11.Z
            fwe r5 = r11.w0
            r11.Y = r1
            r11.X = r4
            java.lang.Object r12 = defpackage.h6e.a(r12, r5, r11)
            if (r12 != r0) goto L_0x00a7
            return r0
        L_0x00a7:
            wve r12 = (defpackage.wve) r12
            h6e r4 = r11.Z
            java.lang.String r4 = r4.b
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x00b2
            goto L_0x00cb
        L_0x00b2:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x00cb
            tn7 r6 = defpackage.tn7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Retrieved upload from repository = "
            r7.<init>(r8)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            r5.d(r6, r4, r7, r2)
        L_0x00cb:
            r11.Y = r2
            r11.X = r3
            java.lang.Object r11 = r1.a(r12, r11)
            if (r11 != r0) goto L_0x00d6
            return r0
        L_0x00d6:
            jue r11 = jue.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t5e.o(java.lang.Object):java.lang.Object");
    }
}
