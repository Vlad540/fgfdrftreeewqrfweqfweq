package defpackage;

import android.os.ConditionVariable;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wc3  reason: default package */
public final /* synthetic */ class wc3 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ wc3(xq6 xq6, String str, wq6 wq6) {
        this.a = 6;
        this.b = xq6;
        this.c = str;
        this.o = null;
        this.X = wq6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r7 = nne.a;
        nne.b().a((java.util.List) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        r2.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r4 = (byte[]) r4.c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            jg8 r0 = (jg8) r0
            java.lang.Object r1 = r7.c
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r2 = r7.o
            android.os.ConditionVariable r2 = (android.os.ConditionVariable) r2
            java.lang.Object r7 = r7.X
            i3d r7 = (i3d) r7
            nne r3 = nne.a     // Catch:{ Exception -> 0x0051 }
            r7e r3 = nne.h     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x0051 }
            tm6 r3 = (tm6) r3     // Catch:{ Exception -> 0x0051 }
            om6 r0 = r3.b(r0)     // Catch:{ Exception -> 0x0051 }
            int r3 = r0.b     // Catch:{ all -> 0x0032 }
            java.io.Closeable r4 = r0.o     // Catch:{ all -> 0x0032 }
            be5 r4 = (defpackage.be5) r4     // Catch:{ all -> 0x0032 }
            r5 = 0
            if (r4 == 0) goto L_0x0034
            java.lang.Object r4 = r4.c     // Catch:{ all -> 0x0032 }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = defpackage.p0e.L(r4)     // Catch:{ all -> 0x0032 }
            goto L_0x0035
        L_0x0032:
            r7 = move-exception
            goto L_0x004b
        L_0x0034:
            r4 = r5
        L_0x0035:
            java.lang.String r6 = "CRASH_FREE"
            defpackage.qr4.s(r4, r6, r5)     // Catch:{ all -> 0x0032 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == r4) goto L_0x003f
            goto L_0x0042
        L_0x003f:
            r7.a()     // Catch:{ all -> 0x0032 }
        L_0x0042:
            defpackage.urd.l(r0, r5)     // Catch:{ Exception -> 0x0051 }
        L_0x0045:
            r2.open()
            goto L_0x005d
        L_0x0049:
            r7 = move-exception
            goto L_0x005e
        L_0x004b:
            throw r7     // Catch:{ all -> 0x004c }
        L_0x004c:
            r3 = move-exception
            defpackage.urd.l(r0, r7)     // Catch:{ Exception -> 0x0051 }
            throw r3     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            nne r7 = nne.a     // Catch:{ all -> 0x0049 }
            dp4 r7 = nne.b()     // Catch:{ all -> 0x0049 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0049 }
            r7.a(r1)     // Catch:{ all -> 0x0049 }
            goto L_0x0045
        L_0x005d:
            return
        L_0x005e:
            r2.open()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc3.a():void");
    }

    private final void b() {
        jhe jhe = (jhe) this.b;
        xz xzVar = jhe.l;
        if (xzVar != null) {
            xzVar.h();
            jhe.l = null;
        }
        ((Surface) this.c).release();
        if (jhe.g == ((ch7) this.o)) {
            jhe.g = null;
        }
        if (jhe.h == ((y4e) this.X)) {
            jhe.h = null;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0457 A[Catch:{ all -> 0x045c, all -> 0x0490 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x045f A[Catch:{ all -> 0x045c, all -> 0x0490 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0470 A[SYNTHETIC, Splitter:B:152:0x0470] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0296  */
    public final void run() {
        /*
            r26 = this;
            r0 = r26
            r2 = 0
            r3 = 1
            int r4 = r0.a
            switch(r4) {
                case 0: goto L_0x084f;
                case 1: goto L_0x07dd;
                case 2: goto L_0x07bb;
                case 3: goto L_0x0791;
                case 4: goto L_0x076f;
                case 5: goto L_0x0711;
                case 6: goto L_0x06bc;
                case 7: goto L_0x0677;
                case 8: goto L_0x065a;
                case 9: goto L_0x0559;
                case 10: goto L_0x0530;
                case 11: goto L_0x0514;
                case 12: goto L_0x04fe;
                case 13: goto L_0x04e8;
                case 14: goto L_0x04e4;
                case 15: goto L_0x04ce;
                case 16: goto L_0x04ca;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r0.b
            tne r4 = (tne) r4
            java.lang.Object r5 = r0.c
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.o
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r0 = r0.X
            java.lang.String r0 = (java.lang.String) r0
            zne r7 = r4.a
            boolean r8 = r7.c
            if (r8 == 0) goto L_0x0022
            r0 = r3
            goto L_0x04c7
        L_0x0022:
            boe r8 = r7.a()
            if (r8 == 0) goto L_0x04c4
            boolean r8 = r8.isDisabled()
            if (r8 != 0) goto L_0x04c4
            duf r7 = r4.e
            r8 = 32
            if (r0 == 0) goto L_0x004d
            java.lang.CharSequence r0 = defpackage.h0e.B0(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x004d
            int r9 = r0.length()
            if (r9 <= 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = defpackage.h0e.y0(r8, r0)
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            x3a r9 = r4.c
            java.lang.Object r10 = r9.b
            lr r10 = (defpackage.lr) r10
            monitor-enter(r10)
            java.lang.Object r9 = r9.b     // Catch:{ all -> 0x04c1 }
            lr r9 = (defpackage.lr) r9     // Catch:{ all -> 0x04c1 }
            java.util.List r9 = defpackage.o23.s0(r9)     // Catch:{ all -> 0x04c1 }
            monitor-exit(r10)
            zne r4 = r4.a
            mv4 r4 = r4.g
            r4.getClass()
            lg7 r10 = defpackage.hwf.c()
            java.lang.Object r11 = r4.b
            java.util.concurrent.ConcurrentHashMap r11 = (java.util.concurrent.ConcurrentHashMap) r11
            monitor-enter(r11)
            java.lang.Object r4 = r4.b     // Catch:{ all -> 0x00aa }
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch:{ all -> 0x00aa }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x00aa }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00aa }
        L_0x007a:
            boolean r12 = r4.hasNext()     // Catch:{ all -> 0x00aa }
            if (r12 == 0) goto L_0x00ad
            java.lang.Object r12 = r4.next()     // Catch:{ all -> 0x00aa }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x00aa }
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x00aa }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00aa }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x00aa }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00aa }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }
            r14.<init>()     // Catch:{ all -> 0x00aa }
            r14.append(r13)     // Catch:{ all -> 0x00aa }
            r13 = 61
            r14.append(r13)     // Catch:{ all -> 0x00aa }
            r14.append(r12)     // Catch:{ all -> 0x00aa }
            java.lang.String r12 = r14.toString()     // Catch:{ all -> 0x00aa }
            r10.add(r12)     // Catch:{ all -> 0x00aa }
            goto L_0x007a
        L_0x00aa:
            r0 = move-exception
            goto L_0x04bf
        L_0x00ad:
            monitor-exit(r11)
            lg7 r4 = defpackage.hwf.a(r10)
            java.lang.Object r10 = r7.a
            zne r10 = (zne) r10
            f2b r11 = r10.b     // Catch:{ Exception -> 0x04c9 }
            java.lang.Object r11 = r11.c     // Catch:{ Exception -> 0x04c9 }
            wgd r11 = (wgd) r11     // Catch:{ Exception -> 0x04c9 }
            java.lang.Object r11 = r11.a     // Catch:{ Exception -> 0x04c9 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x04c9 }
            if (r11 != 0) goto L_0x00d9
            boe r11 = r10.a()     // Catch:{ Exception -> 0x04c9 }
            if (r11 == 0) goto L_0x00d8
            boolean r12 = r11.isDisabled()     // Catch:{ Exception -> 0x04c9 }
            r12 = r12 ^ r3
            if (r12 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r11 = r2
        L_0x00d1:
            if (r11 == 0) goto L_0x00d8
            java.lang.String r11 = r11.appToken()     // Catch:{ Exception -> 0x04c9 }
            goto L_0x00d9
        L_0x00d8:
            r11 = r2
        L_0x00d9:
            if (r11 == 0) goto L_0x04b3
            android.content.Context r12 = r10.d
            java.lang.Class<nne> r13 = nne.class
            nne r14 = nne.a     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r14 = "INSTANCE"
            java.lang.reflect.Field r14 = r13.getField(r14)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r15 = "getAppToken"
            java.lang.reflect.Method r13 = r13.getMethod(r15, r2)     // Catch:{ Exception -> 0x00f8 }
            java.lang.Object r14 = r14.get(r2)     // Catch:{ Exception -> 0x00f8 }
            java.lang.Object r13 = r13.invoke(r14, r2)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x00f8 }
            goto L_0x011b
        L_0x00f8:
            java.lang.String r13 = r12.getPackageName()
            coe r13 = defpackage.iu7.t(r13)
            if (r13 == 0) goto L_0x0107
            java.lang.String r13 = r13.appToken()
            goto L_0x011b
        L_0x0107:
            java.lang.String r13 = "tracer_app_token"
            java.lang.String r12 = defpackage.iu7.A(r12, r13)
            if (r12 != 0) goto L_0x0111
        L_0x010f:
            r13 = r2
            goto L_0x011b
        L_0x0111:
            java.lang.String r13 = "0000000000000000000000000000000000000000000"
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L_0x011a
            goto L_0x010f
        L_0x011a:
            r13 = r12
        L_0x011b:
            android.content.Context r12 = r10.d
            t97 r14 = r10.f
            java.lang.Object r14 = r14.getValue()
            vne r14 = (vne) r14
            java.util.Date r15 = new java.util.Date
            r15.<init>()
            boolean r16 = r4.isEmpty()
            r16 = r16 ^ 1
            if (r16 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r4 = r2
        L_0x0134:
            android.content.pm.PackageManager r8 = r12.getPackageManager()
            java.lang.String r2 = r12.getPackageName()
            android.content.pm.PackageInfo r2 = defpackage.n1g.s(r8, r2)
            java.lang.String r8 = r12.getPackageName()
            coe r8 = defpackage.iu7.t(r8)
            if (r8 == 0) goto L_0x014f
            java.lang.String r8 = r8.buildUuid()
            goto L_0x0162
        L_0x014f:
            java.lang.String r8 = "tracer_mapping_uuid"
            java.lang.String r8 = defpackage.iu7.A(r12, r8)
            if (r8 != 0) goto L_0x0159
        L_0x0157:
            r8 = 0
            goto L_0x0162
        L_0x0159:
            java.lang.String r1 = "00000000-0000-0000-0000-000000000000"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0162
            goto L_0x0157
        L_0x0162:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = r2.packageName
            r18 = r5
            java.lang.String r5 = "packageName"
            r1.put(r5, r3)
            java.lang.String r3 = r2.versionName
            r19 = r13
            java.lang.String r13 = "versionName"
            r1.put(r13, r3)
            long r2 = r2.getLongVersionCode()
            r20 = r11
            java.lang.String r11 = "versionCode"
            r1.put(r11, r2)
            java.lang.String r2 = "buildUuid"
            r1.put(r2, r8)
            java.lang.String r3 = p3d.a
            java.lang.String r8 = "sessionUuid"
            r1.put(r8, r3)
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r8 = "device"
            r1.put(r8, r3)
            java.lang.String r11 = defpackage.at7.t(r12)
            r21 = r10
            java.lang.String r10 = "deviceId"
            r1.put(r10, r11)
            java.lang.String r10 = android.os.Build.MANUFACTURER
            java.lang.String r11 = "vendor"
            r1.put(r11, r10)
            int r11 = android.os.Build.VERSION.SDK_INT
            r22 = r7
            java.lang.String r7 = java.lang.String.valueOf(r11)
            r23 = r9
            java.lang.String r9 = "osVersion"
            r1.put(r9, r7)
            android.app.ActivityManager$RunningAppProcessInfo r7 = new android.app.ActivityManager$RunningAppProcessInfo
            r7.<init>()
            android.app.ActivityManager.getMyMemoryState(r7)
            int r7 = r7.importance
            r9 = 100
            r24 = r6
            r6 = 200(0xc8, float:2.8E-43)
            if (r7 == r9) goto L_0x01d1
            if (r7 != r6) goto L_0x01cd
            goto L_0x01d1
        L_0x01cd:
            r7 = 1
            r17 = 0
            goto L_0x01d4
        L_0x01d1:
            r7 = 1
            r17 = 1
        L_0x01d4:
            r9 = r17 ^ 1
            java.lang.String r7 = "inBackground"
            r1.put(r7, r9)
            android.content.ContentResolver r7 = r12.getContentResolver()
            java.lang.String r9 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r9)
            java.lang.String r9 = android.os.Build.PRODUCT
            java.lang.String r12 = "sdk"
            boolean r12 = r12.equals(r9)
            if (r12 != 0) goto L_0x01fc
            java.lang.String r12 = "google_sdk"
            boolean r9 = r12.equals(r9)
            if (r9 != 0) goto L_0x01fc
            if (r7 != 0) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r7 = 0
            goto L_0x01fd
        L_0x01fc:
            r7 = 1
        L_0x01fd:
            java.lang.String r9 = android.os.Build.TAGS
            if (r7 != 0) goto L_0x020e
            if (r9 == 0) goto L_0x020e
            java.lang.String r12 = "test-keys"
            r6 = 0
            boolean r9 = defpackage.h0e.R(r9, r12, r6)
            if (r9 == 0) goto L_0x020e
        L_0x020c:
            r6 = 1
            goto L_0x022d
        L_0x020e:
            java.io.File r6 = new java.io.File
            java.lang.String r9 = "/system/app/Superuser.apk"
            r6.<init>(r9)
            boolean r6 = r6.exists()
            if (r6 == 0) goto L_0x021c
            goto L_0x020c
        L_0x021c:
            java.io.File r6 = new java.io.File
            java.lang.String r9 = "/system/xbin/su"
            r6.<init>(r9)
            if (r7 != 0) goto L_0x022c
            boolean r6 = r6.exists()
            if (r6 == 0) goto L_0x022c
            goto L_0x020c
        L_0x022c:
            r6 = 0
        L_0x022d:
            java.lang.String r7 = "isRooted"
            r1.put(r7, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            java.lang.String r9 = "yyyy-MM-dd'T'HH:mm:ssXXX"
            java.util.Locale r12 = java.util.Locale.US
            r7.<init>(r9, r12)
            java.lang.String r7 = r7.format(r15)
            java.lang.String r9 = "date"
            r6.put(r9, r7)
            java.lang.String r7 = "board"
            java.lang.String r9 = android.os.Build.BOARD
            r6.put(r7, r9)
            java.lang.String r7 = "brand"
            java.lang.String r9 = android.os.Build.BRAND
            r6.put(r7, r9)
            java.lang.String r7 = ", "
            java.lang.String[] r9 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r7 = android.text.TextUtils.join(r7, r9)
            java.lang.String r9 = "cpuABI"
            r6.put(r9, r7)
            java.lang.String r7 = android.os.Build.DEVICE
            r6.put(r8, r7)
            java.lang.String r7 = "manufacturer"
            r6.put(r7, r10)
            java.lang.String r7 = "model"
            r6.put(r7, r3)
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r7 = "cpuCount"
            r6.put(r7, r3)
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r7 = "osVersionSdkInt"
            r6.put(r7, r3)
            java.lang.String r3 = "osVersionRelease"
            java.lang.String r7 = android.os.Build.VERSION.RELEASE
            r6.put(r3, r7)
            if (r0 == 0) goto L_0x029b
            java.lang.String r3 = "issueKey"
            r6.put(r3, r0)
        L_0x029b:
            java.lang.String r0 = "properties"
            r1.put(r0, r6)
            if (r4 == 0) goto L_0x02bf
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r3 = 0
            java.util.ListIterator r3 = r4.listIterator(r3)
        L_0x02ac:
            r4 = r3
            jg7 r4 = (defpackage.jg7) r4
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02c0
            java.lang.Object r4 = r4.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.put(r4)
            goto L_0x02ac
        L_0x02bf:
            r0 = 0
        L_0x02c0:
            java.lang.String r3 = "tags"
            r1.put(r3, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r3 = r14.a
            r0.put(r5, r3)
            java.lang.String r3 = r14.b
            r0.put(r13, r3)
            java.lang.String r3 = r14.c
            r0.put(r2, r3)
            java.lang.String r2 = "environment"
            java.lang.String r3 = r14.d
            r0.put(r2, r3)
            java.lang.String r2 = "libraryInfo"
            r1.put(r2, r0)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r6 = r24
            pa2.b(r6, r1)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r2 = defpackage.e22.a
            byte[] r1 = r1.getBytes(r2)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream
            r4.<init>(r3)
            r4.write(r1)
            r4.close()
            byte[] r1 = r3.toByteArray()
            boolean r3 = r23.isEmpty()
            if (r3 == 0) goto L_0x0319
            r3 = 0
            goto L_0x032c
        L_0x0319:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r4 = r23.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x04aa
            java.lang.String r3 = r3.toString()
        L_0x032c:
            if (r3 == 0) goto L_0x0349
            byte[] r2 = r3.getBytes(r2)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream
            r4.<init>(r3)
            r4.write(r2)
            r4.close()
            byte[] r2 = r3.toByteArray()
            r3 = r22
            goto L_0x034c
        L_0x0349:
            r3 = r22
            r2 = 0
        L_0x034c:
            java.lang.Object r4 = r3.a
            zne r4 = (zne) r4
            fzd r4 = r4.h
            java.lang.Object r4 = r4.b
            r7e r4 = (defpackage.r7e) r4
            java.lang.Object r4 = r4.getValue()
            dp4 r4 = (dp4) r4
            java.util.List r4 = r4.d()
            boolean r5 = r4.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x036a
            r5 = r4
            goto L_0x036b
        L_0x036a:
            r5 = 0
        L_0x036b:
            if (r5 == 0) goto L_0x03a7
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0376:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x03a0
            java.lang.Object r7 = r5.next()
            fp4 r7 = (fp4) r7
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = r7.a
            java.lang.String r10 = "event"
            r8.put(r10, r9)
            java.lang.String r9 = "reason"
            java.lang.String r10 = r7.b
            r8.put(r9, r10)
            java.lang.String r9 = "count"
            int r7 = r7.c
            r8.put(r9, r7)
            r6.put(r8)
            goto L_0x0376
        L_0x03a0:
            java.lang.String r5 = r6.toString()
            r10 = r21
            goto L_0x03aa
        L_0x03a7:
            r10 = r21
            r5 = 0
        L_0x03aa:
            f2b r6 = r10.b
            java.lang.Object r6 = r6.b
            wgd r6 = (wgd) r6
            java.lang.Object r6 = r6.a
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.String r7 = "api/crash/upload"
            android.net.Uri$Builder r6 = r6.appendEncodedPath(r7)
            java.lang.String r7 = "crashToken"
            r11 = r20
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r7, r11)
            if (r19 == 0) goto L_0x03d3
            java.lang.String r7 = "crashHostAppToken"
            r13 = r19
            r6.appendQueryParameter(r7, r13)
        L_0x03d3:
            java.lang.String r6 = r6.toString()
            jm6 r7 = new jm6
            r7.<init>()
            java.lang.String r8 = "type"
            java.lang.String r9 = "NON_FATAL"
            r7.c(r8, r9)
            java.lang.String r8 = "format"
            java.lang.String r9 = "JVM_STACKTRACE"
            r7.c(r8, r9)
            java.lang.String r8 = "severity"
            r9 = r18
            r7.c(r8, r9)
            be5 r8 = new be5
            java.lang.String r9 = "application/octet-stream"
            r10 = 1
            r8.<init>(r9, r10, r1)
            java.lang.String r1 = "stackTrace"
            java.lang.String r10 = "stack.gzip"
            r7.a(r1, r10, r8)
            java.lang.String r1 = "application/json; charset=utf-8"
            be5 r0 = defpackage.mk9.h(r1, r0)
            java.lang.String r1 = "uploadBean"
            r8 = 0
            r7.a(r1, r8, r0)
            if (r2 == 0) goto L_0x041b
            be5 r0 = new be5
            r1 = 1
            r0.<init>(r9, r1, r2)
            java.lang.String r1 = "logs"
            java.lang.String r2 = "logs.gzip"
            r7.a(r1, r2, r0)
        L_0x041b:
            if (r5 == 0) goto L_0x042a
            java.lang.String r0 = "application/json"
            be5 r0 = defpackage.mk9.h(r0, r5)
            java.lang.String r1 = "drops"
            java.lang.String r2 = "drops.json"
            r7.a(r1, r2, r0)
        L_0x042a:
            ws4 r0 = r7.d()
            jg8 r1 = new jg8
            r1.<init>(r6, r0)
            java.lang.Object r0 = r3.b     // Catch:{ IOException -> 0x0496 }
            w4g r0 = (defpackage.w4g) r0     // Catch:{ IOException -> 0x0496 }
            java.lang.Object r0 = r0.o     // Catch:{ IOException -> 0x0496 }
            r7e r0 = (defpackage.r7e) r0     // Catch:{ IOException -> 0x0496 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x0496 }
            tm6 r0 = (tm6) r0     // Catch:{ IOException -> 0x0496 }
            om6 r1 = r0.b(r1)     // Catch:{ IOException -> 0x0496 }
            int r0 = r1.b     // Catch:{ all -> 0x045c }
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x045c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x045c }
            java.io.Closeable r5 = r1.o     // Catch:{ all -> 0x045c }
            be5 r5 = (defpackage.be5) r5     // Catch:{ all -> 0x045c }
            if (r5 == 0) goto L_0x045f
            java.lang.Object r5 = r5.c     // Catch:{ all -> 0x045c }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x045c }
            if (r5 == 0) goto L_0x045f
            java.lang.String r5 = defpackage.p0e.L(r5)     // Catch:{ all -> 0x045c }
            goto L_0x0460
        L_0x045c:
            r0 = move-exception
            r2 = r0
            goto L_0x048f
        L_0x045f:
            r5 = 0
        L_0x0460:
            java.lang.Object r6 = r3.c     // Catch:{ all -> 0x045c }
            qe4 r6 = (defpackage.qe4) r6     // Catch:{ all -> 0x045c }
            r6.B(r5)     // Catch:{ all -> 0x045c }
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x0470
            r5 = 0
            defpackage.urd.l(r1, r5)     // Catch:{ IOException -> 0x0496 }
            goto L_0x04c9
        L_0x0470:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x045c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x045c }
            r6.<init>()     // Catch:{ all -> 0x045c }
            java.lang.String r7 = "HTTP "
            r6.append(r7)     // Catch:{ all -> 0x045c }
            r6.append(r0)     // Catch:{ all -> 0x045c }
            r0 = 32
            r6.append(r0)     // Catch:{ all -> 0x045c }
            r6.append(r2)     // Catch:{ all -> 0x045c }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x045c }
            r5.<init>(r0)     // Catch:{ all -> 0x045c }
            throw r5     // Catch:{ all -> 0x045c }
        L_0x048f:
            throw r2     // Catch:{ all -> 0x0490 }
        L_0x0490:
            r0 = move-exception
            r5 = r0
            defpackage.urd.l(r1, r2)     // Catch:{ IOException -> 0x0496 }
            throw r5     // Catch:{ IOException -> 0x0496 }
        L_0x0496:
            java.lang.Object r0 = r3.a
            zne r0 = (zne) r0
            fzd r0 = r0.h
            java.lang.Object r0 = r0.b
            r7e r0 = (defpackage.r7e) r0
            java.lang.Object r0 = r0.getValue()
            dp4 r0 = (dp4) r0
            r0.a(r4)
            goto L_0x04c9
        L_0x04aa:
            java.lang.Object r0 = r4.next()
            defpackage.hr1.r(r0)
            r0 = 0
            throw r0
        L_0x04b3:
            java.lang.String r0 = "No lib token"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04c9 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04c9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x04c9 }
            throw r1     // Catch:{ Exception -> 0x04c9 }
        L_0x04bf:
            monitor-exit(r11)
            throw r0
        L_0x04c1:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x04c4:
            r0 = r3
            r7.c = r0
        L_0x04c7:
            r4.f = r0
        L_0x04c9:
            return
        L_0x04ca:
            r26.b()
            return
        L_0x04ce:
            java.lang.Object r1 = r0.c
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.b
            ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl r2 = (ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl) r2
            java.lang.Object r3 = r0.o
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.X
            s16 r0 = (defpackage.s16) r0
            ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.c(r2, r1, r3, r0)
            return
        L_0x04e4:
            r26.a()
            return
        L_0x04e8:
            java.lang.Object r1 = r0.b
            jn r1 = (defpackage.jn) r1
            int r1 = r1.b
            java.lang.Object r2 = r0.c
            cf8 r2 = (defpackage.cf8) r2
            java.lang.Object r3 = r0.o
            se8 r3 = (defpackage.se8) r3
            java.lang.Object r0 = r0.X
            i78 r0 = (defpackage.i78) r0
            r2.A(r1, r3, r0)
            return
        L_0x04fe:
            java.lang.Object r1 = r0.b
            af8 r1 = (defpackage.af8) r1
            int r1 = r1.b
            java.lang.Object r2 = r0.c
            bf8 r2 = (defpackage.bf8) r2
            java.lang.Object r3 = r0.o
            re8 r3 = (defpackage.re8) r3
            java.lang.Object r0 = r0.X
            i78 r0 = (defpackage.i78) r0
            r2.E(r1, r3, r0)
            return
        L_0x0514:
            java.lang.Object r1 = r0.b
            cd8 r1 = (defpackage.cd8) r1
            boolean r2 = r1.i()
            if (r2 != 0) goto L_0x052f
            qza r1 = r1.s
            java.lang.Object r2 = r0.o
            ic8 r2 = (defpackage.ic8) r2
            java.lang.Object r3 = r0.X
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.c
            ke8 r0 = (defpackage.ke8) r0
            r0.b(r1, r2, r3)
        L_0x052f:
            return
        L_0x0530:
            java.lang.Object r1 = r0.o
            nf3 r1 = (defpackage.nf3) r1
            java.lang.Object r2 = r0.X
            ch7 r2 = (defpackage.ch7) r2
            java.lang.Object r3 = r0.b
            cd8 r3 = (defpackage.cd8) r3
            boolean r3 = r3.i()
            java.lang.Object r0 = r0.c
            r4 = r0
            a4d r4 = (defpackage.a4d) r4
            if (r3 == 0) goto L_0x054c
            r0 = 0
            r4.l(r0)
            goto L_0x0558
        L_0x054c:
            r0 = 0
            r1.accept(r2)     // Catch:{ all -> 0x0554 }
            r4.l(r0)     // Catch:{ all -> 0x0554 }
            goto L_0x0558
        L_0x0554:
            r0 = move-exception
            r4.m(r0)
        L_0x0558:
            return
        L_0x0559:
            java.lang.Object r1 = r0.c
            ic8 r1 = (defpackage.ic8) r1
            java.lang.Object r2 = r0.o
            cd8 r2 = (defpackage.cd8) r2
            java.lang.Object r3 = r0.X
            hn6 r3 = (defpackage.hn6) r3
            java.lang.Object r0 = r0.b
            r7 = r0
            me8 r7 = (defpackage.me8) r7
            nxc r0 = r7.e
            java.lang.String r4 = "Controller "
            java.util.Set r5 = r7.f     // Catch:{ all -> 0x05ab }
            r5.remove(r1)     // Catch:{ all -> 0x05ab }
            boolean r5 = r2.i()     // Catch:{ all -> 0x05ab }
            if (r5 == 0) goto L_0x057f
            r5 = 0
            r3.c(r5)     // Catch:{ RemoteException -> 0x0652 }
            goto L_0x0652
        L_0x057f:
            hc8 r5 = r1.d     // Catch:{ all -> 0x05ab }
            ie8 r5 = (defpackage.ie8) r5     // Catch:{ all -> 0x05ab }
            defpackage.oyb.l(r5)     // Catch:{ all -> 0x05ab }
            hn6 r5 = r5.a     // Catch:{ all -> 0x05ab }
            android.os.IBinder r5 = r5.asBinder()     // Catch:{ all -> 0x05ab }
            gc8 r6 = r2.l(r1)     // Catch:{ all -> 0x05ab }
            boolean r8 = r0.J(r1)     // Catch:{ all -> 0x05ab }
            if (r8 == 0) goto L_0x05af
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x05ab }
            r8.<init>(r4)     // Catch:{ all -> 0x05ab }
            r8.append(r1)     // Catch:{ all -> 0x05ab }
            java.lang.String r4 = " has sent connection request multiple times"
            r8.append(r4)     // Catch:{ all -> 0x05ab }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x05ab }
            defpackage.ez3.j0(r4)     // Catch:{ all -> 0x05ab }
            goto L_0x05af
        L_0x05ab:
            r0 = move-exception
            r6 = 0
            goto L_0x0653
        L_0x05af:
            w1d r4 = r6.a     // Catch:{ all -> 0x05ab }
            eya r8 = r6.b     // Catch:{ all -> 0x05ab }
            r0.l(r5, r1, r4, r8)     // Catch:{ all -> 0x05ab }
            k96 r0 = r0.B(r1)     // Catch:{ all -> 0x05ab }
            if (r0 != 0) goto L_0x05c7
            java.lang.String r0 = "Ignoring connection request from unknown controller info"
            defpackage.ez3.j0(r0)     // Catch:{ all -> 0x05ab }
            r1 = 0
        L_0x05c2:
            r3.c(r1)     // Catch:{ RemoteException -> 0x0652 }
            goto L_0x0652
        L_0x05c7:
            qza r4 = r2.s     // Catch:{ all -> 0x05ab }
            fza r5 = r4.o()     // Catch:{ all -> 0x05ab }
            fza r15 = r7.G0(r5)     // Catch:{ all -> 0x05ab }
            sd3 r14 = new sd3     // Catch:{ all -> 0x05ab }
            android.app.PendingIntent r8 = r2.t     // Catch:{ all -> 0x05ab }
            ws6 r5 = r6.c     // Catch:{ all -> 0x05ab }
            if (r5 == 0) goto L_0x05db
        L_0x05d9:
            r9 = r5
            goto L_0x05de
        L_0x05db:
            ws6 r5 = r2.A     // Catch:{ all -> 0x05ab }
            goto L_0x05d9
        L_0x05de:
            w1d r10 = r6.a     // Catch:{ all -> 0x05ab }
            eya r11 = r6.b     // Catch:{ all -> 0x05ab }
            eya r12 = r4.s()     // Catch:{ all -> 0x05ab }
            m3d r4 = r2.j     // Catch:{ all -> 0x05ab }
            l3d r4 = r4.a     // Catch:{ all -> 0x05ab }
            android.os.Bundle r13 = r4.getExtras()     // Catch:{ all -> 0x05ab }
            android.os.Bundle r6 = r2.B     // Catch:{ all -> 0x05ab }
            r5 = 1004001300(0x3bd7d814, float:0.006587038)
            r16 = 4
            r4 = r14
            r18 = r6
            r6 = r16
            r25 = r14
            r14 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x05ab }
            boolean r4 = r2.i()     // Catch:{ all -> 0x05ab }
            if (r4 == 0) goto L_0x060c
            r4 = 0
            r3.c(r4)     // Catch:{ RemoteException -> 0x0652 }
            goto L_0x0652
        L_0x060c:
            int r0 = r0.i()     // Catch:{ RemoteException -> 0x0634 }
            boolean r4 = r3 instanceof defpackage.z48     // Catch:{ RemoteException -> 0x0634 }
            if (r4 == 0) goto L_0x0626
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0634 }
            r4.<init>()     // Catch:{ RemoteException -> 0x0634 }
            rd3 r5 = new rd3     // Catch:{ RemoteException -> 0x0634 }
            r6 = r25
            r5.<init>(r6)     // Catch:{ RemoteException -> 0x0634 }
            java.lang.String r6 = defpackage.sd3.w     // Catch:{ RemoteException -> 0x0634 }
            r4.putBinder(r6, r5)     // Catch:{ RemoteException -> 0x0634 }
            goto L_0x062e
        L_0x0626:
            r6 = r25
            int r4 = r1.c     // Catch:{ RemoteException -> 0x0634 }
            android.os.Bundle r4 = r6.b(r4)     // Catch:{ RemoteException -> 0x0634 }
        L_0x062e:
            r3.r(r0, r4)     // Catch:{ RemoteException -> 0x0634 }
            r17 = 1
            goto L_0x0636
        L_0x0634:
            r17 = 0
        L_0x0636:
            if (r17 == 0) goto L_0x064d
            boolean r0 = r2.z     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x0643
            boolean r0 = defpackage.cd8.j(r1)     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x0643
            goto L_0x064d
        L_0x0643:
            hk9 r0 = r2.e     // Catch:{ all -> 0x0649 }
            r0.getClass()     // Catch:{ all -> 0x0649 }
            goto L_0x064d
        L_0x0649:
            r0 = move-exception
            r6 = r17
            goto L_0x0653
        L_0x064d:
            if (r17 != 0) goto L_0x0652
            r1 = 0
            goto L_0x05c2
        L_0x0652:
            return
        L_0x0653:
            if (r6 != 0) goto L_0x0659
            r1 = 0
            r3.c(r1)     // Catch:{ RemoteException -> 0x0659 }
        L_0x0659:
            throw r0
        L_0x065a:
            java.lang.Object r1 = r0.b
            wd8 r1 = (defpackage.wd8) r1
            cd8 r1 = r1.y0
            java.lang.Object r2 = r0.o
            ic8 r2 = (defpackage.ic8) r2
            gc8 r1 = r1.l(r2)
            java.lang.Object r2 = r0.c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            r2.set(r1)
            java.lang.Object r0 = r0.X
            ga3 r0 = (defpackage.ga3) r0
            r0.g()
            return
        L_0x0677:
            r1 = 0
            java.lang.Object r2 = r0.c
            ch7 r2 = (defpackage.ch7) r2
            java.lang.Object r3 = r0.o
            i88 r3 = (defpackage.i88) r3
            java.lang.Object r4 = r0.X
            kc8 r4 = (defpackage.kc8) r4
            java.lang.Object r0 = r0.b
            ue r0 = (defpackage.ue) r0
            r0.getClass()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x06b4 }
            r6 = 0
            java.lang.Object r2 = r2.get(r6, r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x06b4 }
            r38 r2 = (defpackage.r38) r2     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x06b4 }
            r38 r5 = r0.b(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x06b4 }
            if (r5 == 0) goto L_0x06ad
            vje r6 = r5.x0()     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x06b4 }
            boolean r6 = r6.q()     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x06b4 }
            if (r6 != 0) goto L_0x06ad
            int r5 = r5.getPlaybackState()     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x06b4 }
            r6 = 1
            if (r5 == r6) goto L_0x06ad
            r1 = 1
        L_0x06ad:
            r3.s(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x06b4 }
            r2.z(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x06b4 }
            goto L_0x06bb
        L_0x06b4:
            java.lang.Object r0 = r0.c
            vd8 r0 = (defpackage.vd8) r0
            r0.g(r4)
        L_0x06bb:
            return
        L_0x06bc:
            java.lang.Object r1 = r0.c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.o
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.X
            wq6 r3 = (wq6) r3
            java.lang.Object r0 = r0.b
            xq6 r0 = (xq6) r0
            r0.getClass()
            boolean r4 = defpackage.lp.o(r2)     // Catch:{ all -> 0x070d }
            if (r4 == 0) goto L_0x06e1
            if (r3 == 0) goto L_0x0710
            zo5 r1 = new zo5     // Catch:{ all -> 0x070d }
            r4 = 6
            r1.<init>(r3, r4, r2)     // Catch:{ all -> 0x070d }
            r0.c(r1)     // Catch:{ all -> 0x070d }
            goto L_0x0710
        L_0x06e1:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x070d }
            if (r2 == 0) goto L_0x06eb
            r0.b(r3)     // Catch:{ all -> 0x070d }
            goto L_0x0710
        L_0x06eb:
            if (r3 == 0) goto L_0x06f6
            tq6 r2 = new tq6     // Catch:{ all -> 0x070d }
            r4 = 1
            r2.<init>(r3, r4)     // Catch:{ all -> 0x070d }
            r0.c(r2)     // Catch:{ all -> 0x070d }
        L_0x06f6:
            tr6 r1 = defpackage.tr6.b(r1)     // Catch:{ all -> 0x070d }
            fr6 r2 = defpackage.a06.u()     // Catch:{ all -> 0x070d }
            g0 r2 = r2.c(r1)     // Catch:{ all -> 0x070d }
            uq6 r4 = new uq6     // Catch:{ all -> 0x070d }
            r4.<init>(r0, r3, r1)     // Catch:{ all -> 0x070d }
            xn1 r1 = defpackage.xn1.a     // Catch:{ all -> 0x070d }
            r2.m(r4, r1)     // Catch:{ all -> 0x070d }
            goto L_0x0710
        L_0x070d:
            r0.b(r3)
        L_0x0710:
            return
        L_0x0711:
            long r13 = java.lang.System.nanoTime()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            java.lang.Object r3 = r0.b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r2 = defpackage.q23.H(r3, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L_0x0728:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x073a
            java.lang.Object r3 = r2.next()
            pu5 r3 = (pu5) r3
            qu5 r3 = r3.b
            r1.add(r3)
            goto L_0x0728
        L_0x073a:
            java.util.concurrent.ForkJoinTask.invokeAll(r1)
            long r1 = java.lang.System.nanoTime()
            java.lang.Object r3 = r0.c
            s16 r3 = (defpackage.s16) r3
            r3.invoke()
            java.lang.Object r3 = r0.o
            su5 r3 = (su5) r3
            java.util.concurrent.ConcurrentSkipListSet r3 = r3.a
            gy7 r4 = new gy7
            long r7 = r1 - r13
            long r5 = java.lang.System.nanoTime()
            long r9 = r5 - r1
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r12 = r1.getName()
            java.lang.Object r0 = r0.X
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r5 = r4
            r5.<init>(r6, r7, r9, r11, r12, r13)
            r3.add(r4)
            return
        L_0x076f:
            java.lang.Object r1 = r0.c
            zq4 r1 = (defpackage.zq4) r1
            java.lang.Object r2 = r0.o
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r0.X
            sn1 r3 = (defpackage.sn1) r3
            java.lang.Object r0 = r0.b
            pp4 r0 = (defpackage.pp4) r0
            r0.getClass()
            np4 r0 = r0.a     // Catch:{ RuntimeException -> 0x078c }
            r0.n(r1, r2)     // Catch:{ RuntimeException -> 0x078c }
            r0 = 0
            r3.b(r0)     // Catch:{ RuntimeException -> 0x078c }
            goto L_0x0790
        L_0x078c:
            r0 = move-exception
            r3.d(r0)
        L_0x0790:
            return
        L_0x0791:
            java.lang.Object r1 = r0.b
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r0.c
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r1 == 0) goto L_0x079e
            r2.removeView(r1)
        L_0x079e:
            java.lang.Object r1 = r0.o
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x07ad
            android.view.ViewParent r3 = r1.getParent()
            if (r3 != 0) goto L_0x07ad
            r2.addView(r1)
        L_0x07ad:
            android.os.IBinder r1 = r2.getWindowToken()
            if (r1 == 0) goto L_0x07ba
            java.lang.Object r0 = r0.X
            ur3 r0 = (defpackage.ur3) r0
            r0.q()
        L_0x07ba:
            return
        L_0x07bb:
            java.lang.Object r1 = r0.c
            zq4 r1 = (defpackage.zq4) r1
            java.lang.Object r2 = r0.o
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r0.X
            sn1 r3 = (defpackage.sn1) r3
            java.lang.Object r0 = r0.b
            bb4 r0 = (defpackage.bb4) r0
            r0.getClass()
            vj4 r0 = r0.a     // Catch:{ RuntimeException -> 0x07d8 }
            r0.n(r1, r2)     // Catch:{ RuntimeException -> 0x07d8 }
            r0 = 0
            r3.b(r0)     // Catch:{ RuntimeException -> 0x07d8 }
            goto L_0x07dc
        L_0x07d8:
            r0 = move-exception
            r3.d(r0)
        L_0x07dc:
            return
        L_0x07dd:
            java.lang.Object r1 = r0.c
            hb0 r1 = (defpackage.hb0) r1
            java.lang.Object r2 = r0.o
            hs1 r2 = (defpackage.hs1) r2
            java.lang.Object r3 = r0.X
            i90 r3 = (defpackage.i90) r3
            java.lang.Object r0 = r0.b
            ia4 r0 = (defpackage.ia4) r0
            r0.getClass()
            java.util.logging.Logger r4 = defpackage.ia4.f
            java.lang.String r5 = "Transport backend '"
            b39 r6 = r0.c     // Catch:{ Exception -> 0x081d }
            java.lang.String r7 = r1.a     // Catch:{ Exception -> 0x081d }
            qre r6 = r6.a(r7)     // Catch:{ Exception -> 0x081d }
            if (r6 != 0) goto L_0x081f
            java.lang.String r0 = r1.a     // Catch:{ Exception -> 0x081d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x081d }
            r1.<init>(r5)     // Catch:{ Exception -> 0x081d }
            r1.append(r0)     // Catch:{ Exception -> 0x081d }
            java.lang.String r0 = "' is not registered"
            r1.append(r0)     // Catch:{ Exception -> 0x081d }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x081d }
            r4.warning(r0)     // Catch:{ Exception -> 0x081d }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x081d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x081d }
            r2.getClass()     // Catch:{ Exception -> 0x081d }
            goto L_0x084e
        L_0x081d:
            r0 = move-exception
            goto L_0x0836
        L_0x081f:
            lx1 r6 = (defpackage.lx1) r6     // Catch:{ Exception -> 0x081d }
            i90 r3 = r6.a(r3)     // Catch:{ Exception -> 0x081d }
            m7e r5 = r0.e     // Catch:{ Exception -> 0x081d }
            xz r6 = new xz     // Catch:{ Exception -> 0x081d }
            r7 = 4
            r6.<init>(r0, r1, r3, r7)     // Catch:{ Exception -> 0x081d }
            xic r5 = (defpackage.xic) r5     // Catch:{ Exception -> 0x081d }
            r5.e0(r6)     // Catch:{ Exception -> 0x081d }
            r2.getClass()     // Catch:{ Exception -> 0x081d }
            goto L_0x084e
        L_0x0836:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Error scheduling event "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.warning(r0)
            r2.getClass()
        L_0x084e:
            return
        L_0x084f:
            java.lang.Object r1 = r0.b
            nxc r1 = (nxc) r1
            java.lang.Object r2 = r0.c
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r3 = r0.X
            yc3 r3 = (defpackage.yc3) r3
            java.lang.Object r0 = r0.o
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r4 = r1.a
            monitor-enter(r4)
            boolean r2 = r2.get()     // Catch:{ all -> 0x086c }
            if (r2 != 0) goto L_0x086e
            r1.q(r3)     // Catch:{ all -> 0x086c }
            goto L_0x0872
        L_0x086c:
            r0 = move-exception
            goto L_0x0874
        L_0x086e:
            r1 = 1
            r0.set(r1)     // Catch:{ all -> 0x086c }
        L_0x0872:
            monitor-exit(r4)     // Catch:{ all -> 0x086c }
            return
        L_0x0874:
            monitor-exit(r4)     // Catch:{ all -> 0x086c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc3.run():void");
    }

    public /* synthetic */ wc3(jg8 jg8, j3d j3d, List list, ConditionVariable conditionVariable, i3d i3d) {
        this.a = 14;
        this.b = jg8;
        this.c = list;
        this.o = conditionVariable;
        this.X = i3d;
    }

    public /* synthetic */ wc3(nxc nxc, AtomicBoolean atomicBoolean, yc3 yc3, AtomicBoolean atomicBoolean2) {
        this.a = 0;
        this.b = nxc;
        this.c = atomicBoolean;
        this.X = yc3;
        this.o = atomicBoolean2;
    }

    public /* synthetic */ wc3(tne tne, Throwable th, String str) {
        this.a = 17;
        this.b = tne;
        this.c = "NON_FATAL";
        this.o = th;
        this.X = str;
    }

    public /* synthetic */ wc3(View view, boolean z, od4 od4, ViewGroup viewGroup, View view2, ur3 ur3) {
        this.a = 3;
        this.b = view;
        this.c = viewGroup;
        this.o = view2;
        this.X = ur3;
    }

    public /* synthetic */ wc3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }
}
