package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: e06  reason: default package */
public final class e06 implements rm0 {
    public boolean a;
    public Object b;
    public Object c;
    public Object o;

    public e06(j8e j8e, boolean z) {
        this.b = j8e;
        this.a = z;
        this.c = new SparseArray();
    }

    public static void b(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] e(defpackage.nz3 r16, java.lang.String r17, byte[] r18, java.util.Map r19) {
        /*
            fsd r1 = new fsd
            qz3 r0 = r16.a()
            r1.<init>(r0)
            java.util.Collections.emptyMap()
            android.net.Uri r3 = android.net.Uri.parse(r17)
            java.lang.String r0 = "The uri must be set."
            defpackage.oyb.m(r3, r0)
            yz3 r0 = new yz3
            r14 = 1
            r15 = 0
            r4 = 0
            r6 = 2
            r9 = 0
            r11 = -1
            r13 = 0
            r2 = r0
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15)
            r2 = 0
            r3 = r0
            r4 = r2
        L_0x002c:
            tz3 r5 = new tz3     // Catch:{ Exception -> 0x0039 }
            r5.<init>((defpackage.qz3) r1, (defpackage.yz3) r3)     // Catch:{ Exception -> 0x0039 }
            byte[] r0 = defpackage.tu0.b(r5)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x003d }
            defpackage.oze.h(r5)     // Catch:{ Exception -> 0x0039 }
            return r0
        L_0x0039:
            r0 = move-exception
            goto L_0x0083
        L_0x003b:
            r0 = move-exception
            goto L_0x007f
        L_0x003d:
            r0 = move-exception
            r6 = r0
            int r0 = r6.o     // Catch:{ all -> 0x003b }
            r7 = 307(0x133, float:4.3E-43)
            r8 = 0
            if (r0 == r7) goto L_0x004a
            r7 = 308(0x134, float:4.32E-43)
            if (r0 != r7) goto L_0x0068
        L_0x004a:
            r0 = 5
            if (r4 >= r0) goto L_0x0068
            java.util.Map r0 = r6.X     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0068
            java.lang.String r7 = "Location"
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x003b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0068
            boolean r7 = r0.isEmpty()     // Catch:{ all -> 0x003b }
            if (r7 != 0) goto L_0x0068
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x003b }
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x003b }
        L_0x0068:
            if (r8 == 0) goto L_0x007e
            int r4 = r4 + 1
            wz3 r0 = r3.a()     // Catch:{ all -> 0x003b }
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x003b }
            r0.b = r3     // Catch:{ all -> 0x003b }
            yz3 r3 = r0.b()     // Catch:{ all -> 0x003b }
            defpackage.oze.h(r5)     // Catch:{ Exception -> 0x0039 }
            goto L_0x002c
        L_0x007e:
            throw r6     // Catch:{ all -> 0x003b }
        L_0x007f:
            defpackage.oze.h(r5)     // Catch:{ Exception -> 0x0039 }
            throw r0     // Catch:{ Exception -> 0x0039 }
        L_0x0083:
            androidx.media3.exoplayer.drm.MediaDrmCallbackException r2 = new androidx.media3.exoplayer.drm.MediaDrmCallbackException
            android.net.Uri r3 = r1.c
            r3.getClass()
            qz3 r1 = r1.a
            r1.a()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e06.e(nz3, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        r0 = r6.toByteArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        defpackage.mze.h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        r7 = r5.read(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r7 == -1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r6.write(r0, 0, r7);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] f(defpackage.tl6 r16, java.lang.String r17, byte[] r18, java.util.Map r19) {
        /*
            esd r1 = new esd
            ul6 r0 = r16.a()
            r1.<init>(r0)
            java.util.Collections.emptyMap()
            android.net.Uri r3 = android.net.Uri.parse(r17)
            if (r3 == 0) goto L_0x00a5
            xz3 r0 = new xz3
            r14 = 1
            r15 = 0
            r4 = 0
            r6 = 2
            r9 = 0
            r11 = -1
            r13 = 0
            r2 = r0
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15)
            r2 = 0
            r3 = r0
            r4 = r2
        L_0x0029:
            tz3 r5 = new tz3     // Catch:{ Exception -> 0x004c }
            r5.<init>((defpackage.oz3) r1, (defpackage.xz3) r3)     // Catch:{ Exception -> 0x004c }
            int r0 = defpackage.mze.a     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            r6.<init>()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
        L_0x0039:
            int r7 = r5.read(r0)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            r8 = -1
            if (r7 == r8) goto L_0x0044
            r6.write(r0, r2, r7)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            goto L_0x0039
        L_0x0044:
            byte[] r0 = r6.toByteArray()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            defpackage.mze.h(r5)     // Catch:{ Exception -> 0x004c }
            return r0
        L_0x004c:
            r0 = move-exception
            goto L_0x0095
        L_0x004e:
            r0 = move-exception
            int r6 = r0.c     // Catch:{ all -> 0x008e }
            r7 = 307(0x133, float:4.3E-43)
            r8 = 0
            if (r6 == r7) goto L_0x005a
            r7 = 308(0x134, float:4.32E-43)
            if (r6 != r7) goto L_0x0078
        L_0x005a:
            r6 = 5
            if (r4 >= r6) goto L_0x0078
            java.util.Map r6 = r0.o     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0078
            java.lang.String r7 = "Location"
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x008e }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0078
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x0078
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x008e }
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x008e }
        L_0x0078:
            if (r8 == 0) goto L_0x0090
            int r4 = r4 + 1
            wz3 r0 = r3.a()     // Catch:{ all -> 0x008e }
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x008e }
            r0.b = r3     // Catch:{ all -> 0x008e }
            xz3 r3 = r0.a()     // Catch:{ all -> 0x008e }
            defpackage.mze.h(r5)     // Catch:{ Exception -> 0x004c }
            goto L_0x0029
        L_0x008e:
            r0 = move-exception
            goto L_0x0091
        L_0x0090:
            throw r0     // Catch:{ all -> 0x008e }
        L_0x0091:
            defpackage.mze.h(r5)     // Catch:{ Exception -> 0x004c }
            throw r0     // Catch:{ Exception -> 0x004c }
        L_0x0095:
            com.google.android.exoplayer2.drm.MediaDrmCallbackException r2 = new com.google.android.exoplayer2.drm.MediaDrmCallbackException
            android.net.Uri r3 = r1.c
            r3.getClass()
            oz3 r1 = r1.a
            r1.a()
            r2.<init>(r0)
            throw r2
        L_0x00a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The uri must be set."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e06.f(tl6, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public boolean a(k20 k20, xu5 xu5) {
        boolean equals = "audio/eac3-joc".equals(xu5.n);
        int i = xu5.B;
        if (equals && i == 16) {
            i = 12;
        }
        int t = oze.t(i);
        if (t == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t);
        int i2 = xu5.C;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.b).canBeSpatialized((AudioAttributes) k20.b().b, channelMask.build());
    }

    public byte[] c(UUID uuid, h35 h35) {
        UUID uuid2 = uuid;
        h35 h352 = h35;
        String str = h352.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            UUID uuid3 = vu0.e;
            hashMap.put("Content-Type", uuid3.equals(uuid2) ? "text/xml" : vu0.c.equals(uuid2) ? "application/json" : "application/octet-stream");
            if (uuid3.equals(uuid2)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.o)) {
                hashMap.putAll((HashMap) this.o);
            }
            return f((tl6) this.b, str, h352.a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new xz3(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null);
            throw new IOException(new IllegalStateException("No license URL"));
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public synchronized void clear() {
        try {
            e13.S((t54) this.o);
            this.o = null;
            int size = ((SparseArray) this.c).size();
            for (int i = 0; i < size; i++) {
                e13.S((e13) ((SparseArray) this.c).valueAt(i));
            }
            ((SparseArray) this.c).clear();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public byte[] d(UUID uuid, i35 i35) {
        UUID uuid2 = uuid;
        i35 i352 = i35;
        String str = i352.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            UUID uuid3 = yu0.e;
            hashMap.put("Content-Type", uuid3.equals(uuid2) ? "text/xml" : yu0.c.equals(uuid2) ? "application/json" : "application/octet-stream");
            if (uuid3.equals(uuid2)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.o)) {
                hashMap.putAll((HashMap) this.o);
            }
            return e((nz3) this.b, str, i352.a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        oyb.m(uri, "The uri must be set.");
        new yz3(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null);
        throw new IOException(new IllegalStateException("No license URL"));
    }

    public byte[] g(j35 j35) {
        String n = mze.n(j35.a);
        String str = j35.b;
        StringBuilder sb = new StringBuilder(n.length() + me4.e(15, str));
        sb.append(str);
        sb.append("&signedRequest=");
        sb.append(n);
        return f((tl6) this.b, sb.toString(), (byte[]) null, Collections.emptyMap());
    }

    public byte[] h(k35 k35) {
        return e((nz3) this.b, k35.b + "&signedRequest=" + oze.q(k35.a), (byte[]) null, Collections.emptyMap());
    }

    public int[] i() {
        synchronized (this) {
            try {
                if (!this.a) {
                    return null;
                }
                long[] jArr = (long[]) this.b;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.c;
                    if (z != zArr[i2]) {
                        int[] iArr = (int[]) this.o;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        ((int[]) this.o)[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.a = false;
                int[] iArr2 = (int[]) ((int[]) this.o).clone();
                return iArr2;
            } finally {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [hs1, java.lang.Object] */
    public synchronized void j() {
        try {
            if (!this.a) {
                Boolean n = n();
                this.c = n;
                if (n == null) {
                    ((k05) ((c1e) this.b)).a(new Object());
                }
                this.a = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized boolean k() {
        boolean z;
        boolean z2;
        try {
            j();
            Boolean bool = (Boolean) this.c;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                ih5 ih5 = ((FirebaseMessaging) this.o).a;
                ih5.a();
                dz3 dz3 = (dz3) ih5.g.get();
                synchronized (dz3) {
                    z2 = dz3.a;
                }
                z = z2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r2 = ((android.graphics.Rect) r2.f).height();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(defpackage.ve r3) {
        /*
            r2 = this;
            int r0 = r3.a
            if (r0 != 0) goto L_0x0026
            int r0 = r3.b
            if (r0 != 0) goto L_0x0026
            java.lang.Object r2 = r2.b
            ue r2 = (defpackage.ue) r2
            java.lang.Object r0 = r2.f
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r0 = r0.width()
            int r1 = r3.c
            if (r1 != r0) goto L_0x0026
            java.lang.Object r2 = r2.f
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            int r2 = r2.height()
            int r3 = r3.d
            if (r3 != r2) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e06.l(ve):boolean");
    }

    public boolean m(int i) {
        if (i == 0) {
            return true;
        }
        ve[] veVarArr = (ve[]) ((ue) this.b).h;
        ve veVar = veVarArr[i];
        ve veVar2 = veVarArr[i - 1];
        veVar.getClass();
        return veVar2.e == 2 && l(veVar2);
    }

    public Boolean n() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ih5 ih5 = ((FirebaseMessaging) this.o).a;
        ih5.a();
        Context context = ih5.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public synchronized void o(int i) {
        e13 e13 = (e13) ((SparseArray) this.c).get(i);
        if (e13 != null) {
            ((SparseArray) this.c).delete(i);
            e13.S(e13);
            m75.e(e06.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), (SparseArray) this.c);
        }
    }

    public synchronized boolean p(int i) {
        boolean containsKey;
        j8e j8e = (j8e) this.b;
        cf cfVar = new cf((ov0) j8e.a, i);
        lr7 lr7 = (lr7) ((fv3) j8e.b);
        synchronized (lr7) {
            jn jnVar = lr7.c;
            synchronized (jnVar) {
                containsKey = ((LinkedHashMap) jnVar.o).containsKey(cfVar);
            }
        }
        return containsKey;
    }

    public synchronized e13 q() {
        return qr4.l(e13.o((t54) this.o));
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0041=Splitter:B:16:0x0041, B:9:0x0038=Splitter:B:9:0x0038} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void r(int r4, defpackage.e13 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.o(r4)     // Catch:{ all -> 0x003d }
            et6 r0 = defpackage.et6.d     // Catch:{ all -> 0x003f }
            r1 = 0
            com.facebook.imagepipeline.image.CloseableStaticBitmap r5 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of(r5, r0, r1)     // Catch:{ all -> 0x003f }
            t54 r5 = defpackage.e13.o0(r5)     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0038
            java.lang.Object r0 = r3.o     // Catch:{ all -> 0x0036 }
            t54 r0 = (defpackage.t54) r0     // Catch:{ all -> 0x0036 }
            defpackage.e13.S(r0)     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r3.b     // Catch:{ all -> 0x0036 }
            j8e r0 = (defpackage.j8e) r0     // Catch:{ all -> 0x0036 }
            cf r1 = new cf     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x0036 }
            ov0 r2 = (defpackage.ov0) r2     // Catch:{ all -> 0x0036 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0036 }
            java.lang.Object r4 = r0.b     // Catch:{ all -> 0x0036 }
            fv3 r4 = (defpackage.fv3) r4     // Catch:{ all -> 0x0036 }
            lr7 r4 = (defpackage.lr7) r4     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0036 }
            wwc r0 = (wwc) r0     // Catch:{ all -> 0x0036 }
            t54 r4 = r4.a(r1, r5, r0)     // Catch:{ all -> 0x0036 }
            r3.o = r4     // Catch:{ all -> 0x0036 }
            goto L_0x0038
        L_0x0036:
            r4 = move-exception
            goto L_0x0041
        L_0x0038:
            defpackage.e13.S(r5)     // Catch:{ all -> 0x003d }
            monitor-exit(r3)
            return
        L_0x003d:
            r4 = move-exception
            goto L_0x0045
        L_0x003f:
            r4 = move-exception
            r5 = 0
        L_0x0041:
            defpackage.e13.S(r5)     // Catch:{ all -> 0x003d }
            throw r4     // Catch:{ all -> 0x003d }
        L_0x0045:
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e06.r(int, e13):void");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0063=Splitter:B:20:0x0063, B:14:0x005c=Splitter:B:14:0x005c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void s(int r4, defpackage.e13 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            et6 r0 = defpackage.et6.d     // Catch:{ all -> 0x0061 }
            r1 = 0
            com.facebook.imagepipeline.image.CloseableStaticBitmap r5 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of(r5, r0, r1)     // Catch:{ all -> 0x0061 }
            t54 r5 = defpackage.e13.o0(r5)     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0015
            defpackage.e13.S(r5)     // Catch:{ all -> 0x0013 }
            monitor-exit(r3)
            return
        L_0x0013:
            r4 = move-exception
            goto L_0x0067
        L_0x0015:
            java.lang.Object r0 = r3.b     // Catch:{ all -> 0x005a }
            j8e r0 = (defpackage.j8e) r0     // Catch:{ all -> 0x005a }
            cf r1 = new cf     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x005a }
            ov0 r2 = (defpackage.ov0) r2     // Catch:{ all -> 0x005a }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r0.b     // Catch:{ all -> 0x005a }
            fv3 r2 = (defpackage.fv3) r2     // Catch:{ all -> 0x005a }
            lr7 r2 = (defpackage.lr7) r2     // Catch:{ all -> 0x005a }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x005a }
            wwc r0 = (wwc) r0     // Catch:{ all -> 0x005a }
            t54 r0 = r2.a(r1, r5, r0)     // Catch:{ all -> 0x005a }
            boolean r1 = defpackage.e13.n0(r0)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r3.c     // Catch:{ all -> 0x005a }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x005a }
            e13 r1 = (defpackage.e13) r1     // Catch:{ all -> 0x005a }
            defpackage.e13.S(r1)     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r3.c     // Catch:{ all -> 0x005a }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x005a }
            r1.put(r4, r0)     // Catch:{ all -> 0x005a }
            java.lang.Class<e06> r0 = defpackage.e06.class
            java.lang.String r1 = "cachePreparedFrame(%d) cached. Pending frames: %s"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r3.c     // Catch:{ all -> 0x005a }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x005a }
            defpackage.m75.e(r0, r1, r4, r2)     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r4 = move-exception
            goto L_0x0063
        L_0x005c:
            defpackage.e13.S(r5)     // Catch:{ all -> 0x0013 }
            monitor-exit(r3)
            return
        L_0x0061:
            r4 = move-exception
            r5 = 0
        L_0x0063:
            defpackage.e13.S(r5)     // Catch:{ all -> 0x0013 }
            throw r4     // Catch:{ all -> 0x0013 }
        L_0x0067:
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e06.s(int, e13):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r17 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(android.graphics.Bitmap r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r4 = 1
            java.lang.Object r5 = r0.b
            ue r5 = (defpackage.ue) r5
            boolean r6 = r0.a
            if (r6 == 0) goto L_0x0044
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            java.lang.Object r1 = r5.e
            com.facebook.animated.gif.GifImage r1 = (com.facebook.animated.gif.GifImage) r1
            com.facebook.animated.gif.GifFrame r6 = r1.d(r2)
            ve r7 = r1.g(r2)
            if (r2 != 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            int r2 = r2 - r4
            ve r3 = r1.g(r2)
        L_0x0029:
            int r1 = r6.d()     // Catch:{ all -> 0x003a }
            if (r1 <= 0) goto L_0x003c
            int r1 = r6.c()     // Catch:{ all -> 0x003a }
            if (r1 > 0) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            r5.h(r0, r6, r7, r3)     // Catch:{ all -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r0 = move-exception
            goto L_0x0040
        L_0x003c:
            r6.a()
            return
        L_0x0040:
            r6.a()
            throw r0
        L_0x0044:
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC
            r7 = 0
            r13.drawColor(r7, r1)
            boolean r1 = r0.m(r2)
            java.lang.Object r8 = r0.o
            r14 = r8
            android.graphics.Paint r14 = (android.graphics.Paint) r14
            r15 = 2
            r12 = 3
            java.lang.Object r8 = r0.c
            r11 = r8
            e3 r11 = (e3) r11
            if (r1 != 0) goto L_0x00eb
            int r1 = r2 + -1
        L_0x0063:
            if (r1 < 0) goto L_0x008e
            java.lang.Cloneable r8 = r5.h
            ve[] r8 = (defpackage.ve[]) r8
            r8 = r8[r1]
            int r9 = r8.e
            if (r9 != r4) goto L_0x0071
        L_0x006f:
            r8 = r4
            goto L_0x0080
        L_0x0071:
            if (r9 != r15) goto L_0x007b
            boolean r8 = r0.l(r8)
            if (r8 == 0) goto L_0x006f
            r8 = r15
            goto L_0x0080
        L_0x007b:
            if (r9 != r12) goto L_0x007f
            r8 = r12
            goto L_0x0080
        L_0x007f:
            r8 = 4
        L_0x0080:
            int r8 = defpackage.hr1.t(r8)
            if (r8 == 0) goto L_0x0095
            if (r8 == r4) goto L_0x0092
            if (r8 == r12) goto L_0x008d
            r17 = r11
            goto L_0x00e5
        L_0x008d:
            r7 = r1
        L_0x008e:
            r17 = r11
            goto L_0x00ee
        L_0x0092:
            int r7 = r1 + 1
            goto L_0x008e
        L_0x0095:
            java.lang.Cloneable r8 = r5.h
            ve[] r8 = (defpackage.ve[]) r8
            r8 = r8[r1]
            e13 r16 = r11.a(r1)
            if (r16 == 0) goto L_0x00db
            java.lang.Object r0 = r16.e0()     // Catch:{ all -> 0x00d4 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x00d4 }
            r4 = 0
            r13.drawBitmap(r0, r4, r4, r3)     // Catch:{ all -> 0x00d4 }
            int r0 = r8.e     // Catch:{ all -> 0x00d4 }
            if (r0 != r15) goto L_0x00c8
            int r0 = r8.a     // Catch:{ all -> 0x00d4 }
            float r3 = (float) r0     // Catch:{ all -> 0x00d4 }
            int r4 = r8.b     // Catch:{ all -> 0x00d4 }
            float r9 = (float) r4     // Catch:{ all -> 0x00d4 }
            int r7 = r8.c     // Catch:{ all -> 0x00d4 }
            int r0 = r0 + r7
            float r10 = (float) r0     // Catch:{ all -> 0x00d4 }
            int r0 = r8.d     // Catch:{ all -> 0x00d4 }
            int r4 = r4 + r0
            float r0 = (float) r4     // Catch:{ all -> 0x00d4 }
            r7 = r13
            r8 = r3
            r17 = r11
            r11 = r0
            r0 = r12
            r12 = r14
            r7.drawRect(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00d4 }
            goto L_0x00cb
        L_0x00c8:
            r17 = r11
            r0 = r12
        L_0x00cb:
            int r7 = r1 + 1
            if (r6 != 0) goto L_0x00d2
            r16.close()
        L_0x00d2:
            r12 = r0
            goto L_0x00ee
        L_0x00d4:
            r0 = move-exception
            if (r6 != 0) goto L_0x00da
            r16.close()
        L_0x00da:
            throw r0
        L_0x00db:
            r17 = r11
            boolean r8 = r0.m(r1)
            if (r8 == 0) goto L_0x00e5
            r7 = r1
            goto L_0x00ee
        L_0x00e5:
            int r1 = r1 + -1
            r11 = r17
            goto L_0x0063
        L_0x00eb:
            r17 = r11
            r7 = r2
        L_0x00ee:
            r0 = r7
        L_0x00ef:
            if (r0 >= r2) goto L_0x011d
            java.lang.Cloneable r1 = r5.h
            ve[] r1 = (defpackage.ve[]) r1
            r1 = r1[r0]
            int r3 = r1.e
            if (r3 != r12) goto L_0x00fd
        L_0x00fb:
            r1 = r12
            goto L_0x0119
        L_0x00fd:
            r5.f(r13, r0)
            r17.getClass()
            if (r3 != r15) goto L_0x00fb
            int r3 = r1.a
            float r8 = (float) r3
            int r4 = r1.b
            float r9 = (float) r4
            int r6 = r1.c
            int r3 = r3 + r6
            float r10 = (float) r3
            int r1 = r1.d
            int r4 = r4 + r1
            float r11 = (float) r4
            r7 = r13
            r1 = r12
            r12 = r14
            r7.drawRect(r8, r9, r10, r11, r12)
        L_0x0119:
            int r0 = r0 + 1
            r12 = r1
            goto L_0x00ef
        L_0x011d:
            java.lang.Cloneable r0 = r5.h
            ve[] r0 = (defpackage.ve[]) r0
            r0 = r0[r2]
            r0.getClass()
            r5.f(r13, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e06.t(android.graphics.Bitmap, int):void");
    }

    public synchronized e13 u() {
        if (!this.a) {
            return null;
        }
        return qr4.l(((j8e) this.b).n());
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.e13 v(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.b     // Catch:{ all -> 0x0020 }
            j8e r0 = (defpackage.j8e) r0     // Catch:{ all -> 0x0020 }
            cf r1 = new cf     // Catch:{ all -> 0x0020 }
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x0020 }
            ov0 r2 = (defpackage.ov0) r2     // Catch:{ all -> 0x0020 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r0.b     // Catch:{ all -> 0x0020 }
            fv3 r4 = (defpackage.fv3) r4     // Catch:{ all -> 0x0020 }
            lr7 r4 = (defpackage.lr7) r4     // Catch:{ all -> 0x0020 }
            e13 r4 = r4.get(r1)     // Catch:{ all -> 0x0020 }
            e13 r4 = defpackage.qr4.l(r4)     // Catch:{ all -> 0x0020 }
            monitor-exit(r3)
            return r4
        L_0x001e:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            throw r4
        L_0x0020:
            r4 = move-exception
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e06.v(int):e13");
    }

    public e06(ue ueVar, boolean z, e3 e3Var) {
        this.b = ueVar;
        this.c = e3Var;
        this.a = z;
        Paint paint = new Paint();
        this.o = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
