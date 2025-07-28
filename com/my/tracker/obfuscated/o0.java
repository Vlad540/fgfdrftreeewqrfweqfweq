package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import org.json.JSONObject;

public final class o0 {
    final t a;
    final z0 b;
    final Context c;

    public static final class a {
        public final int a;
        public final String b;
        public final String c;

        public a(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }
    }

    public o0(t tVar, z0 z0Var, Context context) {
        this.a = tVar;
        this.b = z0Var;
        this.c = context.getApplicationContext();
    }

    public static o0 a(t tVar, z0 z0Var, Context context) {
        return new o0(tVar, z0Var, context);
    }

    public a b() {
        String str = "ro.mtpi." + this.b.g();
        String a2 = w0.a(str);
        if (TextUtils.isEmpty(a2)) {
            y0.a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        y0.a("PreInstallHandler: raw data in SystemProperties has been found: " + a2);
        return a(3, a2, str);
    }

    public void c() {
        String m = this.b.m();
        if (!TextUtils.isEmpty(m)) {
            p0 a2 = p0.a(this.c);
            if (!a2.p()) {
                y0.a("PreInstallHandler: checking preinstall");
                PackageManager packageManager = this.c.getPackageManager();
                try {
                    String a3 = a(packageManager.getResourcesForApplication(m), this.c.getPackageName(), m);
                    a2.t();
                    if (TextUtils.isEmpty(a3)) {
                        y0.a("PreInstallHandler: referrer is empty");
                        return;
                    }
                    y0.a("PreInstallHandler: referrer " + a3);
                    this.a.a(a3, o.b(this.c), (Runnable) null);
                    p0.a(this.c).u();
                } catch (Throwable unused) {
                    y0.a("PreInstallHandler: unable to locate vendor app " + m);
                }
            }
        }
    }

    public static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static a a(int i, String str, String str2) {
        try {
            y0.a("PreInstallHandler: converting raw data to json");
            return new a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            y0.b("PreInstallHandler error: exception when converting raw data to json with pid", th);
            y0.a("PreInstallHandler: nothing has been found for source: " + i);
            return null;
        }
    }

    public a a() {
        if (!this.b.p()) {
            y0.a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a b2 = b();
        if (b2 != null) {
            return b2;
        }
        a a2 = a(1);
        if (a2 != null) {
            return a2;
        }
        if (this.b.q()) {
            return a(2);
        }
        return null;
    }

    public a a(int i) {
        String str;
        if (i == 1) {
            str = "ro.mytracker.preinstall.path";
        } else if (i == 2) {
            str = "ro.appsflyer.preinstall.path";
        } else {
            y0.a("PreInstallHandler: wrong property property key");
            return null;
        }
        String a2 = w0.a(str);
        if (TextUtils.isEmpty(a2)) {
            y0.a("PreInstallHandler: empty path for source: " + i);
            return null;
        }
        String a3 = a(a2);
        if (TextUtils.isEmpty(a3)) {
            y0.a("PreInstallHandler: empty data for source: " + i);
            return null;
        }
        y0.a("PreInstallHandler: raw data for source has been found: " + a3);
        return a(i, a3, a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089 A[SYNTHETIC, Splitter:B:24:0x0089] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "PreInstallHandler: searching string in file "
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r2.<init>(r0)     // Catch:{ all -> 0x0071 }
            r2.append(r7)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0071 }
            com.my.tracker.obfuscated.y0.a((java.lang.String) r0)     // Catch:{ all -> 0x0071 }
            android.content.Context r6 = r6.c     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            r0.append(r6)     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = "="
            r0.append(r6)     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0071 }
            int r0 = r6.length()     // Catch:{ all -> 0x0071 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0071 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0071 }
            r3.<init>(r7)     // Catch:{ all -> 0x0071 }
            r2.<init>(r3)     // Catch:{ all -> 0x0071 }
        L_0x0037:
            java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x006d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r4.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r5 = "PreInstallHandler: processing string "
            r4.append(r5)     // Catch:{ all -> 0x006b }
            r4.append(r3)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006b }
            com.my.tracker.obfuscated.y0.a((java.lang.String) r4)     // Catch:{ all -> 0x006b }
            boolean r4 = r3.startsWith(r6)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0037
            int r4 = r3.length()     // Catch:{ all -> 0x006b }
            if (r4 <= r0) goto L_0x0037
            java.lang.String r3 = r3.substring(r0)     // Catch:{ all -> 0x006b }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x0037
            r2.close()     // Catch:{ all -> 0x006a }
        L_0x006a:
            return r3
        L_0x006b:
            r6 = move-exception
            goto L_0x0073
        L_0x006d:
            r2.close()     // Catch:{ all -> 0x008c }
            goto L_0x008c
        L_0x0071:
            r6 = move-exception
            r2 = r1
        L_0x0073:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r0.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r3 = "PreInstallHandler error: exception while retrieving data in file"
            r0.append(r3)     // Catch:{ all -> 0x008d }
            r0.append(r7)     // Catch:{ all -> 0x008d }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x008d }
            com.my.tracker.obfuscated.y0.b(r7, r6)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x008c
            r2.close()     // Catch:{ all -> 0x008c }
        L_0x008c:
            return r1
        L_0x008d:
            r6 = move-exception
            if (r2 == 0) goto L_0x0093
            r2.close()     // Catch:{ all -> 0x0093 }
        L_0x0093:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.o0.a(java.lang.String):java.lang.String");
    }
}
