package defpackage;

/* renamed from: a70  reason: default package */
public final class a70 {
    public final t97 a;

    public a70(t97 t97) {
        this.a = t97;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.z7c r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.z60
            if (r0 == 0) goto L_0x0013
            r0 = r11
            z60 r0 = (defpackage.z60) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            z60 r0 = new z60
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            wx3.H(r11)
            goto L_0x00b5
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0030:
            wx3.H(r11)
            t97 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            yy9 r9 = (defpackage.yy9) r9
            java.lang.String r11 = r10.a
            r2 = 0
            java.lang.Long r4 = r10.X
            if (r4 == 0) goto L_0x0044
            r5 = r3
            goto L_0x0045
        L_0x0044:
            r5 = r2
        L_0x0045:
            r0.Y = r3
            r9.getClass()
            dt r6 = new dt
            dfa r7 = defpackage.dfa.AUTH_CONFIRM
            r8 = 7
            r6.<init>((defpackage.dfa) r7, (int) r8)
            if (r11 == 0) goto L_0x005d
            int r7 = r11.length()
            if (r7 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r7 = r2
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x00c4
            java.lang.String r7 = "token"
            r6.s(r7, r11)
            java.lang.String r11 = "tokenType"
            java.lang.String r7 = "REGISTER"
            r6.s(r11, r7)
            java.lang.String r11 = r10.c
            if (r11 == 0) goto L_0x0077
            int r7 = r11.length()
            if (r7 != 0) goto L_0x0078
        L_0x0077:
            r2 = r3
        L_0x0078:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00b8
            java.lang.String r2 = "firstName"
            r6.s(r2, r11)
            java.lang.String r10 = r10.o
            if (r10 == 0) goto L_0x0090
            int r11 = r10.length()
            if (r11 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            java.lang.String r11 = "lastName"
            r6.s(r11, r10)
        L_0x0090:
            if (r4 == 0) goto L_0x009b
            long r10 = r4.longValue()
            java.lang.String r2 = "photoId"
            r6.n(r10, r2)
        L_0x009b:
            if (r5 == 0) goto L_0x00a6
            java.lang.String r10 = hr1.e(r5)
            java.lang.String r11 = "avatarType"
            r6.s(r11, r10)
        L_0x00a6:
            t97 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            sce r9 = (defpackage.sce) r9
            java.lang.Object r11 = r9.e(r6, r0)
            if (r11 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            y60 r11 = (defpackage.y60) r11
            return r11
        L_0x00b8:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "AuthConfirmCmd param 'firstName' can't be null"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00c4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "AuthConfirmCmd param 'token' can't be null"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a70.a(z7c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
