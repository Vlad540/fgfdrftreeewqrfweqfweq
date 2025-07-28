package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.OutputStream;
import java.util.List;

/* renamed from: z29  reason: default package */
public final class z29 implements lnc {
    public int a;
    public String b;
    public int c;
    public final Object d;
    public Comparable e;

    public z29(jl8 jl8, int i, String str) {
        this.d = jl8;
        this.a = i;
        this.b = str;
        this.c = jl8.U();
        this.e = MediaStore.Images.Media.getContentUri("external_primary");
    }

    public static String h(ih5 ih5) {
        ih5.a();
        rh5 rh5 = ih5.c;
        String str = rh5.e;
        if (str != null) {
            return str;
        }
        ih5.a();
        String str2 = rh5.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public int a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        defpackage.urd.l(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.ContentResolver r2, android.net.Uri r3) {
        /*
            r1 = this;
            java.lang.String r0 = "w"
            java.io.OutputStream r2 = r2.openOutputStream(r3, r0)
            if (r2 == 0) goto L_0x0017
            r1.k(r2)     // Catch:{ all -> 0x0010 }
            r1 = 0
            defpackage.urd.l(r2, r1)
            goto L_0x0017
        L_0x0010:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r3 = move-exception
            defpackage.urd.l(r2, r1)
            throw r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z29.b(android.content.ContentResolver, android.net.Uri):void");
    }

    public Uri c() {
        return (Uri) this.e;
    }

    public String d() {
        return this.b;
    }

    public Integer e() {
        return Integer.valueOf(this.c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        defpackage.urd.l(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.io.File r2) {
        /*
            r1 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            r1.k(r0)     // Catch:{ all -> 0x000d }
            r1 = 0
            defpackage.urd.l(r0, r1)
            return
        L_0x000d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000f }
        L_0x000f:
            r2 = move-exception
            defpackage.urd.l(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z29.f(java.io.File):void");
    }

    public synchronized String g() {
        try {
            if (this.b == null) {
                j();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.b;
    }

    public Integer getHeight() {
        return null;
    }

    public Integer getWidth() {
        return null;
    }

    public boolean i() {
        int i;
        synchronized (this) {
            i = this.c;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.d).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        this.c = 2;
                    } else {
                        this.c = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    public synchronized void j() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.d).getPackageManager().getPackageInfo(((Context) this.d).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.b = Integer.toString(packageInfo.versionCode);
            this.e = packageInfo.versionName;
        }
    }

    public void k(OutputStream outputStream) {
        int i;
        byte[] bArr = new byte[2048];
        int i2 = 0;
        do {
            i = this.c;
            int min = Math.min(2048, i - i2);
            ((jl8) this.d).S(i2, 0, min, bArr);
            outputStream.write(bArr, 0, min);
            i2 += min;
        } while (i2 < i);
        outputStream.flush();
    }

    public z29(Context context) {
        this.c = 0;
        this.d = context;
    }
}
