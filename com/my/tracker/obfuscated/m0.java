package com.my.tracker.obfuscated;

import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.c0;
import java.util.regex.Pattern;

public final class m0 extends c0 {
    static final lg8 d;
    final c0.a a;
    final MyTrackerConfig.OkHttpClientProvider b;
    final boolean c;

    static {
        lg8 lg8;
        Pattern pattern = lg8.d;
        try {
            lg8 = oyb.A("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            lg8 = null;
        }
        d = lg8;
    }

    public m0(c0.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        this.a = aVar;
        this.b = okHttpClientProvider;
        this.c = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: xbc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be A[Catch:{ all -> 0x00b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2 A[SYNTHETIC, Splitter:B:49:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7 A[Catch:{ all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.my.tracker.obfuscated.c0.b a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "OkHttpPostRequest error: error while sending data"
            java.lang.String r1 = "OkHttpPostRequest error: response code "
            java.lang.String r2 = "OkHttpPostRequest: send request to "
            com.my.tracker.obfuscated.c0$b r3 = com.my.tracker.obfuscated.c0.b.c()
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r6.<init>(r2)     // Catch:{ all -> 0x007f }
            r6.append(r11)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x007f }
            com.my.tracker.obfuscated.y0.a((java.lang.String) r2)     // Catch:{ all -> 0x007f }
            r2 = 27498374(0x1a39786, float:6.009417E-38)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ all -> 0x007f }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00dd }
            r2.<init>()     // Catch:{ all -> 0x00dd }
            boolean r6 = r10.c     // Catch:{ all -> 0x0040 }
            if (r6 == 0) goto L_0x0044
            java.lang.String r6 = "OkHttpPostRequest: populating post request body using gzip"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r6)     // Catch:{ all -> 0x0040 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0040 }
            r6.<init>(r2)     // Catch:{ all -> 0x0040 }
            com.my.tracker.obfuscated.c0$a r7 = r10.a     // Catch:{ all -> 0x003d }
            r7.a(r6)     // Catch:{ all -> 0x003d }
            r6.finish()     // Catch:{ all -> 0x003d }
            goto L_0x0052
        L_0x003d:
            r10 = move-exception
            goto L_0x00e0
        L_0x0040:
            r10 = move-exception
            r6 = r5
            goto L_0x00e0
        L_0x0044:
            java.lang.String r6 = "OkHttpPostRequest: populating post request body without using gzip"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r6)     // Catch:{ all -> 0x0040 }
            com.my.tracker.obfuscated.c0$a r6 = r10.a     // Catch:{ all -> 0x0040 }
            r6.a(r2)     // Catch:{ all -> 0x0040 }
            r2.flush()     // Catch:{ all -> 0x0040 }
            r6 = r5
        L_0x0052:
            s86 r7 = new s86     // Catch:{ all -> 0x003d }
            r7.<init>()     // Catch:{ all -> 0x003d }
            r7.q(r11)     // Catch:{ all -> 0x003d }
            java.lang.String r11 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            java.lang.Object r9 = r7.c     // Catch:{ all -> 0x003d }
            xe6 r9 = (defpackage.xe6) r9     // Catch:{ all -> 0x003d }
            r9.n(r11, r8)     // Catch:{ all -> 0x003d }
            byte[] r11 = r2.toByteArray()     // Catch:{ all -> 0x003d }
            lg8 r8 = d     // Catch:{ all -> 0x003d }
            r9 = 6
            nac r11 = oa2.A(r11, r8, r9)     // Catch:{ all -> 0x003d }
            java.lang.String r8 = "POST"
            r7.m(r8, r11)     // Catch:{ all -> 0x003d }
            lac r11 = r7.j()     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0082
            r6.close()     // Catch:{ all -> 0x007f }
            goto L_0x0082
        L_0x007f:
            r10 = move-exception
            goto L_0x00eb
        L_0x0082:
            r2.close()     // Catch:{ all -> 0x007f }
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r10 = r10.b     // Catch:{ all -> 0x007f }
            qw9 r10 = r10.getOkHttpClient()     // Catch:{ all -> 0x007f }
            y0c r10 = r10.b(r11)     // Catch:{ all -> 0x007f }
            xbc r10 = r10.f()     // Catch:{ all -> 0x007f }
            int r11 = r10.o     // Catch:{ all -> 0x00b0 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r11 == r2) goto L_0x00b4
            r6 = 204(0xcc, float:2.86E-43)
            if (r11 != r6) goto L_0x009e
            goto L_0x00b4
        L_0x009e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r6.<init>(r1)     // Catch:{ all -> 0x00b0 }
            r6.append(r11)     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x00b0 }
            com.my.tracker.obfuscated.y0.a((java.lang.String) r1)     // Catch:{ all -> 0x00b0 }
            r3.a = r4     // Catch:{ all -> 0x00b0 }
            goto L_0x00bc
        L_0x00b0:
            r11 = move-exception
            r5 = r10
            r10 = r11
            goto L_0x00eb
        L_0x00b4:
            java.lang.String r1 = "OkHttpPostRequest: response successfully received"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r1)     // Catch:{ all -> 0x00b0 }
            r1 = 1
            r3.a = r1     // Catch:{ all -> 0x00b0 }
        L_0x00bc:
            if (r11 != r2) goto L_0x00d9
            java.lang.String r11 = "OkHttpPostRequest: processing server response"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r11)     // Catch:{ all -> 0x00b0 }
            f1c r11 = r10.Z     // Catch:{ all -> 0x00b0 }
            if (r11 == 0) goto L_0x00cb
            java.lang.String r5 = r11.U()     // Catch:{ all -> 0x00b0 }
        L_0x00cb:
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00b0 }
            if (r11 != 0) goto L_0x00d4
            r3.b = r5     // Catch:{ all -> 0x00b0 }
            goto L_0x00d9
        L_0x00d4:
            java.lang.String r11 = "OkHttpPostRequest: response data is empty"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r11)     // Catch:{ all -> 0x00b0 }
        L_0x00d9:
            r10.close()
            return r3
        L_0x00dd:
            r10 = move-exception
            r2 = r5
            r6 = r2
        L_0x00e0:
            if (r6 == 0) goto L_0x00e5
            r6.close()     // Catch:{ all -> 0x007f }
        L_0x00e5:
            if (r2 == 0) goto L_0x00ea
            r2.close()     // Catch:{ all -> 0x007f }
        L_0x00ea:
            throw r10     // Catch:{ all -> 0x007f }
        L_0x00eb:
            com.my.tracker.obfuscated.y0.a(r0, r10)     // Catch:{ all -> 0x00f8 }
            r3.a = r4     // Catch:{ all -> 0x00f8 }
            r3.c = r0     // Catch:{ all -> 0x00f8 }
            if (r5 == 0) goto L_0x00f7
            r5.close()
        L_0x00f7:
            return r3
        L_0x00f8:
            r10 = move-exception
            if (r5 == 0) goto L_0x00fe
            r5.close()
        L_0x00fe:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.m0.a(java.lang.String):com.my.tracker.obfuscated.c0$b");
    }
}
