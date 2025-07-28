package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gte  reason: default package */
public abstract class gte {
    public static final kk9 a;
    public static final kr7 b = new kr7(16);

    /* JADX WARNING: type inference failed for: r0v0, types: [kk9, java.lang.Object] */
    static {
        ? obj = new Object();
        new ConcurrentHashMap();
        a = obj;
    }

    public static Typeface a(Context context, cu5[] cu5Arr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        a.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (cu5 cu5 : cu5Arr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(cu5.a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(cu5.c).setSlant(cu5.d ? 1 : 0).setTtcIndex(cu5.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(kk9.q(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r13v5, types: [fte, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r2.equals(r4) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b(android.content.Context r16, defpackage.yt5 r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, defpackage.vx3 r23, boolean r24) {
        /*
            r0 = r17
            r6 = r22
            r1 = r23
            r7 = 6
            r8 = 2
            r9 = 1
            boolean r2 = r0 instanceof defpackage.bu5
            r3 = 0
            r10 = 0
            r11 = -3
            if (r2 == 0) goto L_0x018c
            bu5 r0 = (defpackage.bu5) r0
            java.lang.String r2 = r0.d
            if (r2 == 0) goto L_0x0030
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x001d
            goto L_0x0030
        L_0x001d:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r2 == 0) goto L_0x0030
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = r10
        L_0x0031:
            if (r2 == 0) goto L_0x0047
            if (r1 == 0) goto L_0x0046
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            sbc r4 = new sbc
            r4.<init>(r1, r3, r2)
            r0.post(r4)
        L_0x0046:
            return r2
        L_0x0047:
            if (r24 == 0) goto L_0x0051
            int r2 = r0.c
            if (r2 != 0) goto L_0x004f
        L_0x004d:
            r2 = r9
            goto L_0x0054
        L_0x004f:
            r2 = r3
            goto L_0x0054
        L_0x0051:
            if (r1 != 0) goto L_0x004f
            goto L_0x004d
        L_0x0054:
            r4 = -1
            if (r24 == 0) goto L_0x005b
            int r5 = r0.b
            r12 = r5
            goto L_0x005c
        L_0x005b:
            r12 = r4
        L_0x005c:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r5.<init>(r13)
            fte r13 = new fte
            r13.<init>()
            r13.a = r1
            bd4 r14 = r0.a
            mn r15 = new mn
            r15.<init>(r13, r5, r3, r7)
            if (r2 == 0) goto L_0x00fa
            kr7 r0 = defpackage.wt5.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r14.Y
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = r0.toString()
            kr7 r0 = defpackage.wt5.a
            java.lang.Object r0 = r0.c(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00a4
            q36 r1 = new q36
            r1.<init>((java.lang.Object) r13, (int) r8, (java.lang.Object) r0)
            r5.post(r1)
        L_0x00a1:
            r10 = r0
            goto L_0x0186
        L_0x00a4:
            if (r12 != r4) goto L_0x00b3
            r2 = r16
            vt5 r0 = defpackage.wt5.a(r1, r2, r14, r6)
            r15.R(r0)
            android.graphics.Typeface r10 = r0.a
            goto L_0x0186
        L_0x00b3:
            r2 = r16
            ut5 r7 = new ut5
            r5 = 0
            r0 = r7
            r3 = r14
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r0 = defpackage.wt5.b     // Catch:{ InterruptedException -> 0x00e8 }
            java.util.concurrent.Future r0 = r0.submit(r7)     // Catch:{ InterruptedException -> 0x00e8 }
            long r1 = (long) r12
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00d7, InterruptedException -> 0x00d5, TimeoutException -> 0x00d9 }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ ExecutionException -> 0x00d7, InterruptedException -> 0x00d5, TimeoutException -> 0x00d9 }
            vt5 r0 = (defpackage.vt5) r0     // Catch:{ InterruptedException -> 0x00e8 }
            r15.R(r0)     // Catch:{ InterruptedException -> 0x00e8 }
            android.graphics.Typeface r10 = r0.a     // Catch:{ InterruptedException -> 0x00e8 }
            goto L_0x0186
        L_0x00d5:
            r0 = move-exception
            goto L_0x00e1
        L_0x00d7:
            r0 = move-exception
            goto L_0x00e2
        L_0x00d9:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00e8 }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x00e8 }
            throw r0     // Catch:{ InterruptedException -> 0x00e8 }
        L_0x00e1:
            throw r0     // Catch:{ InterruptedException -> 0x00e8 }
        L_0x00e2:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00e8 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x00e8 }
            throw r1     // Catch:{ InterruptedException -> 0x00e8 }
        L_0x00e8:
            ui0 r0 = new ui0
            java.lang.Object r1 = r15.b
            fte r1 = (defpackage.fte) r1
            r0.<init>(r11, r9, r1)
            java.lang.Object r1 = r15.c
            android.os.Handler r1 = (android.os.Handler) r1
            r1.post(r0)
            goto L_0x0186
        L_0x00fa:
            r2 = r16
            kr7 r0 = defpackage.wt5.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r14.Y
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r11 = r0.toString()
            kr7 r0 = defpackage.wt5.a
            java.lang.Object r0 = r0.c(r11)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x012a
            q36 r1 = new q36
            r1.<init>((java.lang.Object) r13, (int) r8, (java.lang.Object) r0)
            r5.post(r1)
            goto L_0x00a1
        L_0x012a:
            ir4 r0 = new ir4
            r0.<init>(r9, r15)
            java.lang.Object r4 = defpackage.wt5.c
            monitor-enter(r4)
            kgd r1 = defpackage.wt5.d     // Catch:{ all -> 0x0141 }
            java.lang.Object r3 = r1.get(r11)     // Catch:{ all -> 0x0141 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0141 }
            if (r3 == 0) goto L_0x0143
            r3.add(r0)     // Catch:{ all -> 0x0141 }
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            goto L_0x0186
        L_0x0141:
            r0 = move-exception
            goto L_0x018a
        L_0x0143:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0141 }
            r3.<init>()     // Catch:{ all -> 0x0141 }
            r3.add(r0)     // Catch:{ all -> 0x0141 }
            r1.put(r11, r3)     // Catch:{ all -> 0x0141 }
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            ut5 r9 = new ut5
            r5 = 1
            r0 = r9
            r1 = r11
            r2 = r16
            r3 = r14
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r0 = defpackage.wt5.b
            ir4 r1 = new ir4
            r1.<init>(r8, r11)
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L_0x0173
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            goto L_0x0178
        L_0x0173:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
        L_0x0178:
            ue3 r3 = new ue3
            r3.<init>(r7)
            r3.b = r9
            r3.c = r1
            r3.o = r2
            r0.execute(r3)
        L_0x0186:
            r13 = r18
            goto L_0x020c
        L_0x018a:
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            throw r0
        L_0x018c:
            kk9 r2 = a
            zt5 r0 = (defpackage.zt5) r0
            r2.getClass()
            au5[] r0 = r0.a     // Catch:{ Exception -> 0x01ce }
            int r2 = r0.length     // Catch:{ Exception -> 0x01ce }
            r4 = r3
            r5 = r10
        L_0x0198:
            if (r4 >= r2) goto L_0x01d5
            r7 = r0[r4]     // Catch:{ Exception -> 0x01ce }
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch:{ IOException -> 0x01d1 }
            int r12 = r7.e     // Catch:{ IOException -> 0x01d1 }
            r13 = r18
            r8.<init>(r13, r12)     // Catch:{ IOException -> 0x01d3 }
            int r12 = r7.a     // Catch:{ IOException -> 0x01d3 }
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r12)     // Catch:{ IOException -> 0x01d3 }
            boolean r12 = r7.b     // Catch:{ IOException -> 0x01d3 }
            android.graphics.fonts.Font$Builder r8 = r8.setSlant(r12)     // Catch:{ IOException -> 0x01d3 }
            int r12 = r7.d     // Catch:{ IOException -> 0x01d3 }
            android.graphics.fonts.Font$Builder r8 = r8.setTtcIndex(r12)     // Catch:{ IOException -> 0x01d3 }
            java.lang.String r7 = r7.c     // Catch:{ IOException -> 0x01d3 }
            android.graphics.fonts.Font$Builder r7 = r8.setFontVariationSettings(r7)     // Catch:{ IOException -> 0x01d3 }
            android.graphics.fonts.Font r7 = r7.build()     // Catch:{ IOException -> 0x01d3 }
            if (r5 != 0) goto L_0x01ca
            android.graphics.fonts.FontFamily$Builder r8 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ IOException -> 0x01d3 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x01d3 }
            r5 = r8
            goto L_0x01d3
        L_0x01ca:
            r5.addFont(r7)     // Catch:{ IOException -> 0x01d3 }
            goto L_0x01d3
        L_0x01ce:
            r13 = r18
            goto L_0x01f3
        L_0x01d1:
            r13 = r18
        L_0x01d3:
            int r4 = r4 + r9
            goto L_0x0198
        L_0x01d5:
            r13 = r18
            if (r5 != 0) goto L_0x01da
            goto L_0x01f3
        L_0x01da:
            android.graphics.fonts.FontFamily r0 = r5.build()     // Catch:{ Exception -> 0x01f3 }
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x01f3 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x01f3 }
            android.graphics.fonts.Font r0 = defpackage.kk9.q(r0, r6)     // Catch:{ Exception -> 0x01f3 }
            android.graphics.fonts.FontStyle r0 = r0.getStyle()     // Catch:{ Exception -> 0x01f3 }
            android.graphics.Typeface$CustomFallbackBuilder r0 = r2.setStyle(r0)     // Catch:{ Exception -> 0x01f3 }
            android.graphics.Typeface r10 = r0.build()     // Catch:{ Exception -> 0x01f3 }
        L_0x01f3:
            if (r1 == 0) goto L_0x020c
            if (r10 == 0) goto L_0x0209
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            sbc r2 = new sbc
            r2.<init>(r1, r3, r10)
            r0.post(r2)
            goto L_0x020c
        L_0x0209:
            r1.e(r11)
        L_0x020c:
            if (r10 == 0) goto L_0x0217
            kr7 r0 = b
            java.lang.String r1 = d(r18, r19, r20, r21, r22)
            r0.d(r1, r10)
        L_0x0217:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gte.b(android.content.Context, yt5, android.content.res.Resources, int, java.lang.String, int, int, vx3, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Resources resources, int i, String str, int i2, int i3) {
        Typeface typeface;
        a.getClass();
        try {
            Font build = new Font.Builder(resources, i).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            typeface = null;
        }
        if (typeface != null) {
            b.d(d(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
