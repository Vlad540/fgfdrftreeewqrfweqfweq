package com.my.tracker.obfuscated;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;

public final class r {
    private q a;

    public static final class a {
        static final int a = (a() ? 1 : 0);

        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0095 */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0090 A[SYNTHETIC, Splitter:B:41:0x0090] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00f8 A[SYNTHETIC, Splitter:B:74:0x00f8] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00fe A[SYNTHETIC, Splitter:B:80:0x00fe] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0098 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean a() {
            /*
                java.lang.String r0 = android.os.Build.TAGS
                r1 = 1
                if (r0 == 0) goto L_0x000e
                java.lang.String r2 = "test-keys"
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x000e
                return r1
            L_0x000e:
                java.lang.String r10 = "/data/local/su"
                java.lang.String r11 = "/su/bin/su"
                java.lang.String r2 = "/system/app/Superuser.apk"
                java.lang.String r3 = "/sbin/su"
                java.lang.String r4 = "/system/bin/su"
                java.lang.String r5 = "/system/xbin/su"
                java.lang.String r6 = "/data/local/xbin/su"
                java.lang.String r7 = "/data/local/bin/su"
                java.lang.String r8 = "/system/sd/xbin/su"
                java.lang.String r9 = "/system/bin/failsafe/su"
                java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
                r2 = 0
                r3 = r2
            L_0x0028:
                r4 = 10
                if (r3 >= r4) goto L_0x003d
                r4 = r0[r3]
                java.io.File r5 = new java.io.File
                r5.<init>(r4)
                boolean r4 = r5.exists()
                if (r4 == 0) goto L_0x003a
                return r1
            L_0x003a:
                int r3 = r3 + 1
                goto L_0x0028
            L_0x003d:
                java.lang.String r0 = "/system/bin/which su"
                java.lang.String r3 = "which su"
                java.lang.String r4 = "/system/xbin/which su"
                java.lang.String[] r0 = new java.lang.String[]{r4, r0, r3}
                java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
                r4 = r2
            L_0x004c:
                r5 = 0
                r6 = 3
                if (r4 >= r6) goto L_0x009b
                r6 = r0[r4]
                java.lang.Process r6 = r3.exec(r6)     // Catch:{ all -> 0x008d }
                java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x008e }
                java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ all -> 0x008e }
                java.io.InputStream r9 = r6.getInputStream()     // Catch:{ all -> 0x008e }
                r8.<init>(r9)     // Catch:{ all -> 0x008e }
                r7.<init>(r8)     // Catch:{ all -> 0x008e }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
                r5.<init>()     // Catch:{ all -> 0x008b }
            L_0x0069:
                java.lang.String r8 = r7.readLine()     // Catch:{ all -> 0x008b }
                if (r8 == 0) goto L_0x0073
                r5.append(r8)     // Catch:{ all -> 0x008b }
                goto L_0x0069
            L_0x0073:
                r6.destroy()     // Catch:{ all -> 0x008b }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008b }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x008b }
                if (r5 != 0) goto L_0x0087
                r7.close()     // Catch:{ all -> 0x0083 }
            L_0x0083:
                r6.destroy()     // Catch:{ all -> 0x0086 }
            L_0x0086:
                return r1
            L_0x0087:
                r7.close()     // Catch:{ all -> 0x0095 }
                goto L_0x0095
            L_0x008b:
                r5 = r7
                goto L_0x008e
            L_0x008d:
                r6 = r5
            L_0x008e:
                if (r5 == 0) goto L_0x0093
                r5.close()     // Catch:{ all -> 0x0093 }
            L_0x0093:
                if (r6 == 0) goto L_0x0098
            L_0x0095:
                r6.destroy()     // Catch:{ all -> 0x0098 }
            L_0x0098:
                int r4 = r4 + 1
                goto L_0x004c
            L_0x009b:
                java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                int r0 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r3.<init>()     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.String r4 = "/proc/"
                r3.append(r4)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r3.append(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.String r0 = "/mounts"
                r3.append(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r6.<init>(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r4.<init>(r6)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00fc, all -> 0x00f5 }
                java.lang.String r0 = "/sbin/.magisk/"
                java.lang.String r4 = "/sbin/.core/mirror"
                java.lang.String r5 = "/sbin/.core/img"
                java.lang.String r6 = "/sbin/.core/db-0/magisk.db"
                java.lang.String[] r0 = new java.lang.String[]{r0, r4, r5, r6}     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }
            L_0x00d2:
                java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }
                if (r4 == 0) goto L_0x00ed
                r5 = r2
            L_0x00d9:
                r6 = 4
                if (r5 >= r6) goto L_0x00d2
                r6 = r0[r5]     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }
                boolean r6 = r4.contains(r6)     // Catch:{ Exception -> 0x00f3, all -> 0x00eb }
                if (r6 == 0) goto L_0x00e8
                r3.close()     // Catch:{ all -> 0x00e7 }
            L_0x00e7:
                return r1
            L_0x00e8:
                int r5 = r5 + 1
                goto L_0x00d9
            L_0x00eb:
                r0 = move-exception
                goto L_0x00f1
            L_0x00ed:
                r3.close()     // Catch:{ all -> 0x0101 }
                goto L_0x0101
            L_0x00f1:
                r5 = r3
                goto L_0x00f6
            L_0x00f3:
                r5 = r3
                goto L_0x00fc
            L_0x00f5:
                r0 = move-exception
            L_0x00f6:
                if (r5 == 0) goto L_0x00fb
                r5.close()     // Catch:{ all -> 0x00fb }
            L_0x00fb:
                throw r0
            L_0x00fc:
                if (r5 == 0) goto L_0x0101
                r5.close()     // Catch:{ all -> 0x0101 }
            L_0x0101:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.r.a.a():boolean");
        }
    }

    private static Point b(Context context) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            return point;
        } catch (Throwable th) {
            y0.a("DeviceParamsDataProvider: collecting screen size exception: ", th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c A[Catch:{ all -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ec A[Catch:{ all -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.my.tracker.obfuscated.q a(android.content.Context r30) {
        /*
            r29 = this;
            r1 = r29
            java.lang.String r2 = ""
            com.my.tracker.obfuscated.q r0 = r1.a
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.String r0 = "DeviceParamsDataProvider: collect application info..."
            com.my.tracker.obfuscated.y0.a((java.lang.String) r0)
            java.lang.String r6 = android.os.Build.DEVICE
            java.lang.String r11 = android.os.Build.MANUFACTURER
            java.lang.String r12 = android.os.Build.MODEL
            java.lang.String r7 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = r30.getPackageName()     // Catch:{ all -> 0x001c }
            r8 = r0
            goto L_0x0024
        L_0x001c:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "DeviceParamsDataProvider: collecting packageName exception: "
            com.my.tracker.obfuscated.y0.a(r0, r3)
            r8 = r2
        L_0x0024:
            android.content.res.Resources r0 = r30.getResources()     // Catch:{ all -> 0x0034 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x0034 }
            java.util.Locale r0 = r0.locale     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r0.getLanguage()     // Catch:{ all -> 0x0034 }
            r14 = r0
            goto L_0x003b
        L_0x0034:
            r0 = move-exception
            java.lang.String r3 = "DeviceParamsDataProvider: collecting app lang exception: "
            com.my.tracker.obfuscated.y0.a(r3, r0)
            r14 = r2
        L_0x003b:
            android.content.pm.PackageInfo r0 = com.my.tracker.obfuscated.o.a(r30)     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0053
            java.lang.String r3 = r0.versionName     // Catch:{ all -> 0x0050 }
            long r4 = r0.getLongVersionCode()     // Catch:{ all -> 0x004e }
            java.lang.String r0 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x004e }
            r9 = r0
        L_0x004c:
            r10 = r3
            goto L_0x005d
        L_0x004e:
            r0 = move-exception
            goto L_0x0056
        L_0x0050:
            r0 = move-exception
            r3 = r2
            goto L_0x0056
        L_0x0053:
            r9 = r2
            r10 = r9
            goto L_0x005d
        L_0x0056:
            java.lang.String r4 = "DeviceParamsDataProvider: collecting app package info exception: "
            com.my.tracker.obfuscated.y0.a(r4, r0)
            r9 = r2
            goto L_0x004c
        L_0x005d:
            android.graphics.Point r0 = b(r30)
            if (r0 == 0) goto L_0x006c
            int r4 = r0.x
            int r0 = r0.y
            r17 = r0
            r16 = r4
            goto L_0x0070
        L_0x006c:
            r16 = -1
            r17 = -1
        L_0x0070:
            r4 = 2143289344(0x7fc00000, float:NaN)
            android.content.res.Resources r0 = r30.getResources()     // Catch:{ all -> 0x0096 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x009b
            int r5 = r0.densityDpi     // Catch:{ all -> 0x0096 }
            float r13 = r0.density     // Catch:{ all -> 0x0092 }
            float r15 = r0.xdpi     // Catch:{ all -> 0x008f }
            float r0 = r0.ydpi     // Catch:{ all -> 0x008d }
            r22 = r0
        L_0x0086:
            r19 = r5
            r20 = r13
            r21 = r15
            goto L_0x00ac
        L_0x008d:
            r0 = move-exception
            goto L_0x00a4
        L_0x008f:
            r0 = move-exception
            r15 = r4
            goto L_0x00a4
        L_0x0092:
            r0 = move-exception
            r13 = r4
            r15 = r13
            goto L_0x00a4
        L_0x0096:
            r0 = move-exception
            r13 = r4
            r15 = r13
            r5 = -1
            goto L_0x00a4
        L_0x009b:
            r20 = r4
            r21 = r20
            r22 = r21
            r19 = -1
            goto L_0x00ac
        L_0x00a4:
            java.lang.String r3 = "DeviceParamsDataProvider: collecting display metrics exception: "
            com.my.tracker.obfuscated.y0.a(r3, r0)
            r22 = r4
            goto L_0x0086
        L_0x00ac:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x00cf }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r3.<init>()     // Catch:{ all -> 0x00cf }
            r4 = 0
            java.lang.String r4 = r0.getDisplayName(r4, r4)     // Catch:{ all -> 0x00cf }
            r3.append(r4)     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = r0.getID()     // Catch:{ all -> 0x00cf }
            r3.append(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00cf }
            r15 = r0
            goto L_0x00d6
        L_0x00cf:
            r0 = move-exception
            java.lang.String r3 = "DeviceParamsDataProvider: collecting timezone exception: "
            com.my.tracker.obfuscated.y0.a(r3, r0)
            r15 = r2
        L_0x00d6:
            int r0 = com.my.tracker.obfuscated.r.a.a     // Catch:{ all -> 0x00db }
            r23 = r0
            goto L_0x00e4
        L_0x00db:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "DeviceParamsDataProvider: collecting isRooted exception: "
            com.my.tracker.obfuscated.y0.a(r0, r3)
            r23 = -1
        L_0x00e4:
            r3 = -1
            java.io.File r0 = r30.getFilesDir()     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00fd
            long r24 = r0.getTotalSpace()     // Catch:{ all -> 0x00f9 }
            long r3 = r0.getFreeSpace()     // Catch:{ all -> 0x00f7 }
        L_0x00f4:
            r26 = r3
            goto L_0x0108
        L_0x00f7:
            r0 = move-exception
            goto L_0x0102
        L_0x00f9:
            r0 = move-exception
            r24 = r3
            goto L_0x0102
        L_0x00fd:
            r24 = r3
            r26 = r24
            goto L_0x0108
        L_0x0102:
            java.lang.String r5 = "DeviceParamsDataProvider: collecting disk info exception: "
            com.my.tracker.obfuscated.y0.a(r5, r0)
            goto L_0x00f4
        L_0x0108:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = r0.getLanguage()     // Catch:{ all -> 0x0112 }
        L_0x0110:
            r13 = r2
            goto L_0x0119
        L_0x0112:
            r0 = move-exception
            java.lang.String r3 = "DeviceParamsDataProvider: collecting lang exception: "
            com.my.tracker.obfuscated.y0.a(r3, r0)
            goto L_0x0110
        L_0x0119:
            android.content.pm.PackageManager r0 = r30.getPackageManager()     // Catch:{ all -> 0x0125 }
            java.lang.String r2 = "android.hardware.touchscreen"
            boolean r0 = r0.hasSystemFeature(r2)     // Catch:{ all -> 0x0125 }
            r2 = r0
            goto L_0x012c
        L_0x0125:
            r0 = move-exception
            java.lang.String r2 = "DeviceParamsDataProvider: collecting touchscreen info exception: "
            com.my.tracker.obfuscated.y0.a(r2, r0)
            r2 = -1
        L_0x012c:
            java.lang.String r0 = "uimode"
            r3 = r30
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ all -> 0x013d }
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0     // Catch:{ all -> 0x013d }
            int r0 = r0.getCurrentModeType()     // Catch:{ all -> 0x013d }
            r28 = r0
            goto L_0x0149
        L_0x013d:
            r0 = move-exception
            goto L_0x0142
        L_0x013f:
            r0 = move-exception
            r3 = r30
        L_0x0142:
            java.lang.String r4 = "DeviceParamsDataProvider: collecting ui mode info exception: "
            com.my.tracker.obfuscated.y0.a(r4, r0)
            r28 = -1
        L_0x0149:
            java.lang.String r5 = com.my.tracker.obfuscated.c1.a(r30)
            com.my.tracker.obfuscated.q r0 = new com.my.tracker.obfuscated.q
            r3 = r0
            r4 = 3
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r25 = r26
            r27 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r28)
            java.lang.String r2 = "DeviceParamsDataProvider: collected"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r2)
            r1.a = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.r.a(android.content.Context):com.my.tracker.obfuscated.q");
    }
}
