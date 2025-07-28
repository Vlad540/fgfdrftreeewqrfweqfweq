package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xa6  reason: default package */
public abstract class xa6 {
    public static final AtomicBoolean a = new AtomicBoolean();
    public static boolean b = false;
    public static boolean c = false;
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final /* synthetic */ int e = 0;

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r9, int r10) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x0009 }
            int r1 = defpackage.fvb.common_google_play_services_unknown_issue     // Catch:{ all -> 0x0009 }
            r0.getString(r1)     // Catch:{ all -> 0x0009 }
        L_0x0009:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0083
            java.util.concurrent.atomic.AtomicBoolean r0 = d
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x001f
            goto L_0x0083
        L_0x001f:
            java.lang.Object r0 = defpackage.pfa.f
            monitor-enter(r0)
            boolean r2 = defpackage.pfa.g     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x005f
        L_0x0028:
            r9 = move-exception
            goto L_0x0081
        L_0x002a:
            defpackage.pfa.g = r1     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = r9.getPackageName()     // Catch:{ all -> 0x0028 }
            u5g r3 = defpackage.suf.a(r9)     // Catch:{ all -> 0x0028 }
            java.lang.Object r3 = r3.b     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0056 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r2 != 0) goto L_0x0048
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x005f
        L_0x0048:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            defpackage.pfa.h = r2     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0028 }
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
        L_0x005f:
            int r0 = defpackage.pfa.h
            if (r0 == 0) goto L_0x007b
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x0069
            goto L_0x0083
        L_0x0069:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            int r10 = defpackage.na6.a
            java.lang.String r1 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            java.lang.String r2 = " but found "
            java.lang.String r3 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            java.lang.String r10 = rf0.g(r1, r10, r2, r0, r3)
            r9.<init>(r10)
            throw r9
        L_0x007b:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L_0x0081:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r9
        L_0x0083:
            boolean r0 = defpackage.oyb.J(r9)
            r2 = 0
            if (r0 != 0) goto L_0x00b9
            java.lang.Boolean r0 = defpackage.oyb.e
            if (r0 != 0) goto L_0x00af
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x00a6
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x00a8
        L_0x00a6:
            r0 = r1
            goto L_0x00a9
        L_0x00a8:
            r0 = r2
        L_0x00a9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.oyb.e = r0
        L_0x00af:
            java.lang.Boolean r0 = defpackage.oyb.e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b9
            r0 = r1
            goto L_0x00ba
        L_0x00b9:
            r0 = r2
        L_0x00ba:
            if (r10 < 0) goto L_0x0169
            java.lang.String r3 = r9.getPackageName()
            android.content.pm.PackageManager r4 = r9.getPackageManager()
            r5 = 9
            if (r0 == 0) goto L_0x00dd
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00d1 }
            goto L_0x00de
        L_0x00d1:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
            r9.concat(r10)
        L_0x00da:
            r1 = r5
            goto L_0x0168
        L_0x00dd:
            r6 = 0
        L_0x00de:
            java.lang.String r7 = "com.google.android.gms"
            r8 = 64
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x015f }
            defpackage.za6.Q(r9)
            boolean r9 = defpackage.za6.X(r7, r1)
            if (r9 != 0) goto L_0x00f9
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            r9.concat(r10)
            goto L_0x00da
        L_0x00f9:
            if (r0 == 0) goto L_0x010e
            defpackage.a24.o(r6)
            boolean r9 = defpackage.za6.X(r6, r1)
            if (r9 != 0) goto L_0x010e
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            r9.concat(r10)
            goto L_0x00da
        L_0x010e:
            if (r0 == 0) goto L_0x012a
            if (r6 == 0) goto L_0x012a
            android.content.pm.Signature[] r9 = r6.signatures
            r9 = r9[r2]
            android.content.pm.Signature[] r0 = r7.signatures
            r0 = r0[r2]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x012a
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            r9.concat(r10)
            goto L_0x00da
        L_0x012a:
            int r9 = r7.versionCode
            r0 = -1
            if (r9 != r0) goto L_0x0131
            r9 = r0
            goto L_0x0133
        L_0x0131:
            int r9 = r9 / 1000
        L_0x0133:
            if (r10 != r0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            int r0 = r10 / 1000
        L_0x0138:
            if (r9 >= r0) goto L_0x013c
            r1 = 2
            goto L_0x0168
        L_0x013c:
            android.content.pm.ApplicationInfo r9 = r7.applicationInfo
            if (r9 != 0) goto L_0x0158
            java.lang.String r9 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r9 = r4.getApplicationInfo(r9, r2)     // Catch:{ NameNotFoundException -> 0x0147 }
            goto L_0x0158
        L_0x0147:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r2 = "GooglePlayServicesUtil"
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.wtf(r2, r10, r9)
            goto L_0x0168
        L_0x0158:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L_0x015e
            r1 = 3
            goto L_0x0168
        L_0x015e:
            return r2
        L_0x015f:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            r9.concat(r10)
        L_0x0168:
            return r1
        L_0x0169:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa6.a(android.content.Context, int):int");
    }
}
