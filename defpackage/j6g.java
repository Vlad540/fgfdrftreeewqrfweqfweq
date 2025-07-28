package defpackage;

import android.content.Context;

/* renamed from: j6g  reason: default package */
public final class j6g extends bzf {
    public final Context d;

    public j6g(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 6);
        this.d = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: n4g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: n4g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: lsd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: g0g} */
    /* JADX WARNING: type inference failed for: r5v2, types: [la6, l0g] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, lk9] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object, lk9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J0(int r6, android.os.Parcel r7, android.os.Parcel r8) {
        /*
            r5 = this;
            r7 = 1
            r8 = 0
            android.content.Context r0 = r5.d
            if (r6 == r7) goto L_0x0016
            r1 = 2
            if (r6 == r1) goto L_0x000a
            return r8
        L_0x000a:
            r5.K0()
            u5g r5 = defpackage.u5g.l(r0)
            r5.h()
            goto L_0x00eb
        L_0x0016:
            r5.K0()
            vyd r5 = defpackage.vyd.a(r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r6 = r5.b()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.z0
            if (r6 == 0) goto L_0x0029
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r5.c()
        L_0x0029:
            l0g r5 = new l0g
            defpackage.a24.o(r1)
            hk9 r2 = new hk9
            r3 = 6
            r2.<init>(r3)
            qe4 r3 = defpackage.v60.a
            r5.<init>((android.content.Context) r0, (defpackage.qe4) r3, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r1, (defpackage.hk9) r2)
            r0 = 3
            fzf r1 = r5.w0
            android.content.Context r2 = r5.a
            if (r6 == 0) goto L_0x00ab
            int r5 = r5.e()
            if (r5 != r0) goto L_0x0048
            r5 = r7
            goto L_0x0049
        L_0x0048:
            r5 = r8
        L_0x0049:
            java.lang.Object[] r6 = new java.lang.Object[r8]
            jn r3 = defpackage.h4g.a
            int r4 = r3.b
            if (r4 > r0) goto L_0x0056
            java.lang.String r0 = "Revoking access"
            r3.r(r0, r6)
        L_0x0056:
            vyd r6 = defpackage.vyd.a(r2)
            java.lang.String r0 = "refreshToken"
            java.lang.String r6 = r6.e(r0)
            defpackage.h4g.a(r2)
            if (r5 == 0) goto L_0x0090
            if (r6 != 0) goto L_0x0080
            jn r5 = defpackage.x2g.c
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r6 = 4
            r0 = 0
            r5.<init>(r6, r0, r0, r0)
            r6 = r8 ^ 1
            java.lang.String r8 = "Status code must not be SUCCESS"
            defpackage.a24.h(r8, r6)
            g0g r6 = new g0g
            r6.<init>(r5)
            r6.b0(r5)
            goto L_0x0098
        L_0x0080:
            x2g r5 = new x2g
            r5.<init>(r6)
            java.lang.Thread r6 = new java.lang.Thread
            r6.<init>(r5)
            r6.start()
            lsd r6 = r5.b
            goto L_0x0098
        L_0x0090:
            n4g r6 = new n4g
            r6.<init>(r1, r7)
            r1.a(r6)
        L_0x0098:
            lk9 r5 = new lk9
            r5.<init>()
            vde r8 = new vde
            r8.<init>()
            o0g r0 = new o0g
            r0.<init>(r6, r8, r5)
            r6.X(r0)
            goto L_0x00eb
        L_0x00ab:
            int r5 = r5.e()
            if (r5 != r0) goto L_0x00b3
            r5 = r7
            goto L_0x00b4
        L_0x00b3:
            r5 = r8
        L_0x00b4:
            java.lang.Object[] r6 = new java.lang.Object[r8]
            jn r3 = defpackage.h4g.a
            int r4 = r3.b
            if (r4 > r0) goto L_0x00c1
            java.lang.String r0 = "Signing out"
            r3.r(r0, r6)
        L_0x00c1:
            defpackage.h4g.a(r2)
            if (r5 == 0) goto L_0x00d1
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.X
            lsd r6 = new lsd
            r6.<init>(r1)
            r6.b0(r5)
            goto L_0x00d9
        L_0x00d1:
            n4g r6 = new n4g
            r6.<init>(r1, r8)
            r1.a(r6)
        L_0x00d9:
            lk9 r5 = new lk9
            r5.<init>()
            vde r8 = new vde
            r8.<init>()
            o0g r0 = new o0g
            r0.<init>(r6, r8, r5)
            r6.X(r0)
        L_0x00eb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6g.J0(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K0() {
        /*
            r5 = this;
            int r0 = android.os.Binder.getCallingUid()
            java.lang.String r1 = "com.google.android.gms"
            android.content.Context r5 = r5.d
            u5g r2 = defpackage.suf.a(r5)
            r2.getClass()
            java.lang.Object r2 = r2.b     // Catch:{ SecurityException -> 0x0091 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ SecurityException -> 0x0091 }
            java.lang.String r3 = "appops"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ SecurityException -> 0x0091 }
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch:{ SecurityException -> 0x0091 }
            if (r2 == 0) goto L_0x0089
            r2.checkPackage(r0, r1)     // Catch:{ SecurityException -> 0x0091 }
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r2 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{  }
            za6 r5 = defpackage.za6.Q(r5)
            r5.getClass()
            if (r0 == 0) goto L_0x0091
            r3 = 0
            boolean r4 = defpackage.za6.X(r0, r3)
            if (r4 == 0) goto L_0x003b
            goto L_0x0088
        L_0x003b:
            r4 = 1
            boolean r0 = defpackage.za6.X(r0, r4)
            if (r0 == 0) goto L_0x0091
            java.lang.Object r5 = r5.a
            android.content.Context r5 = (android.content.Context) r5
            boolean r0 = defpackage.xa6.c
            if (r0 != 0) goto L_0x007a
            u5g r0 = defpackage.suf.a(r5)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            java.lang.Object r0 = r0.b     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            defpackage.za6.Q(r5)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            if (r0 == 0) goto L_0x0070
            boolean r5 = defpackage.za6.X(r0, r3)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            if (r5 != 0) goto L_0x0070
            boolean r5 = defpackage.za6.X(r0, r4)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            if (r5 == 0) goto L_0x0070
            defpackage.xa6.b = r4     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r5 = move-exception
            goto L_0x0075
        L_0x0070:
            defpackage.xa6.b = r3     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
        L_0x0072:
            defpackage.xa6.c = r4
            goto L_0x007a
        L_0x0075:
            defpackage.xa6.c = r4
            throw r5
        L_0x0078:
            defpackage.xa6.c = r4
        L_0x007a:
            boolean r5 = defpackage.xa6.b
            if (r5 != 0) goto L_0x0088
            java.lang.String r5 = "user"
            java.lang.String r0 = android.os.Build.TYPE
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0091
        L_0x0088:
            return
        L_0x0089:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ SecurityException -> 0x0091 }
            java.lang.String r0 = "context.getSystemService(Context.APP_OPS_SERVICE) is null"
            r5.<init>(r0)     // Catch:{ SecurityException -> 0x0091 }
            throw r5     // Catch:{ SecurityException -> 0x0091 }
        L_0x0091:
            java.lang.SecurityException r5 = new java.lang.SecurityException
            int r0 = android.os.Binder.getCallingUid()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 52
            r1.<init>(r2)
            java.lang.String r2 = "Calling UID "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " is not Google Play services."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6g.K0():void");
    }
}
