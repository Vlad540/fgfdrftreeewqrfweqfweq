package defpackage;

import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.Continuation;

/* renamed from: i6a  reason: default package */
public final class i6a implements fn6 {
    public final c6a a;
    public final d6a b;
    public final CountDownLatch c = new CountDownLatch(1);
    public final ArrayList d = new ArrayList();
    public final r7e e = new r7e(new a6a(this, 0));
    public final r7e f = new r7e(new a6a(this, 1));
    public final String g = i6a.class.getName();

    public i6a(c6a c6a, d6a d6a) {
        this.a = c6a;
        this.b = d6a;
        if (i()) {
            Thread.setDefaultUncaughtExceptionHandler(new b6a(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
        fn6 fn6 = udd.e;
        n5a n5a = fn6 instanceof n5a ? (n5a) fn6 : null;
        udd.e = this;
        if ((c() || c6a != null) && n5a != null) {
            Iterator it = n5a.a.iterator();
            while (it.hasNext()) {
                nn7 nn7 = (nn7) it.next();
                this.b.getClass();
                String str = (String) nn7.g.getValue();
                ThreadLocal threadLocal = nn7.h;
                j(nn7.a.a, nn7.b, str, nn7.c, hhd.J(nn7.a, str, nn7.c, Long.valueOf(nn7.e)), nn7.f, nn7.e);
            }
            n5a.a.clear();
        }
    }

    public final void a(tn7 tn7, String str, String str2, Object[] objArr, Throwable th) {
        if (c()) {
            super.a(tn7, str, str2, objArr, th);
        }
    }

    public final boolean c() {
        d6a d6a = this.b;
        d6a.getClass();
        t14 t14 = (t14) d6a.c.invoke();
        t14.getClass();
        return t14 != t14.DISABLED;
    }

    public final void d(tn7 tn7, String str, String str2, Throwable th) {
        String str3;
        if (c() || this.a != null) {
            Thread currentThread = Thread.currentThread();
            if (((Looper) aie.a.getValue()).isCurrentThread()) {
                str3 = "ui";
            } else {
                String name = currentThread.getName();
                str3 = (name == null || name.length() == 0) ? String.valueOf(currentThread.getId()) : currentThread.getName();
            }
            this.b.getClass();
            ThreadLocal threadLocal = nn7.h;
            String j = hhd.j(str3, str);
            j(tn7.a, str, j, str2, hhd.J(tn7, j, str2, Long.valueOf(System.currentTimeMillis())), th, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        urd.l(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0215, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0217, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        urd.l(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0239, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x023a, code lost:
        urd.l(r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x023d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        urd.l(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ea, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0107, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        urd.l(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010b, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0113, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        urd.l(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0117, code lost:
        throw r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0229 A[LOOP:4: B:123:0x0223->B:125:0x0229, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.f6a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            f6a r0 = (defpackage.f6a) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            f6a r0 = new f6a
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i6a r10 = r0.o
            wx3.H(r11)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            wx3.H(r11)
            r0.o = r10
            r0.Z = r3
            java.lang.Object r11 = r10.k(r0)
            if (r11 != r1) goto L_0x003f
            return r1
        L_0x003f:
            r7e r11 = r10.f
            java.lang.Object r11 = r11.getValue()
            rp7 r11 = (defpackage.rp7) r11
            java.util.ArrayList r0 = r10.d
            d6a r10 = r10.b
            java.util.Collection r1 = r10.a
            java.util.ArrayList r0 = o23.y0(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = q23.H(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0060:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0128
            java.lang.Object r2 = r0.next()
            wia r2 = (wia) r2
            java.lang.Object r4 = r2.a
            le5 r4 = (defpackage.le5) r4
            java.lang.Object r2 = r2.b
            e6a r2 = (defpackage.e6a) r2
            t97 r5 = r10.b
            java.lang.Object r5 = r5.getValue()
            mg5 r5 = (defpackage.mg5) r5
            r5.getClass()
            java.lang.String r5 = r5.b()
            java.lang.String r6 = "upload"
            java.io.File r5 = defpackage.mg5.g(r5, r6)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r6 = java.io.File.separator
            java.lang.String r2 = r2.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r6)
            r7.append(r2)
            java.lang.String r2 = ".log"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r4.getClass()
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x00ba
            r5.delete()
        L_0x00ba:
            r5.createNewFile()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0110 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0110 }
            t97 r6 = r4.i
            java.lang.Object r7 = r6.getValue()     // Catch:{ all -> 0x00e2 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ all -> 0x00e2 }
            boolean r7 = r7.exists()     // Catch:{ all -> 0x00e2 }
            if (r7 == 0) goto L_0x00eb
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x00e2 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x00e2 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x00e2 }
            r7.<init>(r6)     // Catch:{ all -> 0x00e2 }
            ete.s(r7, r2)     // Catch:{ all -> 0x00e4 }
            urd.l(r7, r3)     // Catch:{ all -> 0x00e2 }
            goto L_0x00eb
        L_0x00e2:
            r3 = move-exception
            goto L_0x0112
        L_0x00e4:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r5 = move-exception
            urd.l(r7, r3)     // Catch:{ all -> 0x00e2 }
            throw r5     // Catch:{ all -> 0x00e2 }
        L_0x00eb:
            java.io.File r6 = r4.c()     // Catch:{ all -> 0x00e2 }
            boolean r6 = r6.exists()     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x010c
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x00e2 }
            java.io.File r7 = r4.c()     // Catch:{ all -> 0x00e2 }
            r6.<init>(r7)     // Catch:{ all -> 0x00e2 }
            ete.s(r6, r2)     // Catch:{ all -> 0x0105 }
            urd.l(r6, r3)     // Catch:{ all -> 0x00e2 }
            goto L_0x010c
        L_0x0105:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r5 = move-exception
            urd.l(r6, r3)     // Catch:{ all -> 0x00e2 }
            throw r5     // Catch:{ all -> 0x00e2 }
        L_0x010c:
            urd.l(r2, r3)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0123
        L_0x0110:
            r2 = move-exception
            goto L_0x0118
        L_0x0112:
            throw r3     // Catch:{ all -> 0x0113 }
        L_0x0113:
            r5 = move-exception
            urd.l(r2, r3)     // Catch:{ Exception -> 0x0110 }
            throw r5     // Catch:{ Exception -> 0x0110 }
        L_0x0118:
            java.lang.String r3 = r4.f
            java.lang.String r5 = "Exception while merging log files:"
            udd.s(r3, r5, r2)
            java.io.File r5 = r4.c()
        L_0x0123:
            r1.add(r5)
            goto L_0x0060
        L_0x0128:
            r11.getClass()
            java.io.File r10 = new java.io.File
            java.lang.String r11 = r11.a
            r10.<init>(r11)
            java.io.File[] r10 = r10.listFiles()
            java.lang.String r0 = "logs-"
            if (r10 == 0) goto L_0x0170
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r10.length
            r5 = 0
            r6 = r5
        L_0x0142:
            if (r6 >= r4) goto L_0x0156
            r7 = r10[r6]
            java.lang.String r8 = r7.getName()
            boolean r8 = h0e.R(r8, r0, r5)
            if (r8 == 0) goto L_0x0153
            r2.add(r7)
        L_0x0153:
            int r6 = r6 + 1
            goto L_0x0142
        L_0x0156:
            java.util.Iterator r10 = r2.iterator()
        L_0x015a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0170
            java.lang.Object r2 = r10.next()
            java.io.File r2 = (java.io.File) r2
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x015a
            r2.delete()
            goto L_0x015a
        L_0x0170:
            java.io.File r10 = new java.io.File
            java.lang.String r2 = java.io.File.separator
            java.time.LocalDateTime r4 = java.time.LocalDateTime.now()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            r5.append(r2)
            r5.append(r0)
            r5.append(r4)
            java.lang.String r11 = ".zip"
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            r10.<init>(r11)
            xie.k(r10)
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L_0x01a9
            boolean r11 = r10.exists()
            if (r11 == 0) goto L_0x021f
            r10.delete()
            goto L_0x021f
        L_0x01a9:
            java.util.zip.ZipOutputStream r11 = new java.util.zip.ZipOutputStream
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r10)
            r11.<init>(r0)
            java.util.Iterator r0 = r1.iterator()     // Catch:{ all -> 0x020b }
        L_0x01b7:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x020b }
            if (r2 == 0) goto L_0x021c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x020b }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x020b }
            boolean r4 = r2.exists()     // Catch:{ all -> 0x020b }
            if (r4 == 0) goto L_0x01b7
            boolean r4 = r2.isFile()     // Catch:{ all -> 0x020b }
            if (r4 == 0) goto L_0x01b7
            long r4 = r2.length()     // Catch:{ all -> 0x020b }
            r6 = 4
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x01da
            goto L_0x01b7
        L_0x01da:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x020b }
            r4.<init>(r2)     // Catch:{ all -> 0x020b }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x020d }
            r5.<init>(r4)     // Catch:{ all -> 0x020d }
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x020f }
            java.lang.String r7 = r2.getPath()     // Catch:{ all -> 0x020f }
            java.lang.String r2 = r2.getPath()     // Catch:{ all -> 0x020f }
            java.lang.String r8 = "/"
            r9 = 6
            int r2 = h0e.f0(r8, r2, r9)     // Catch:{ all -> 0x020f }
            java.lang.String r2 = r7.substring(r2)     // Catch:{ all -> 0x020f }
            r6.<init>(r2)     // Catch:{ all -> 0x020f }
            r11.putNextEntry(r6)     // Catch:{ all -> 0x020f }
            r2 = 1024(0x400, float:1.435E-42)
            oyb.p(r5, r11, r2)     // Catch:{ all -> 0x020f }
            urd.l(r5, r3)     // Catch:{ all -> 0x020d }
            urd.l(r4, r3)     // Catch:{ all -> 0x020b }
            goto L_0x01b7
        L_0x020b:
            r10 = move-exception
            goto L_0x0238
        L_0x020d:
            r10 = move-exception
            goto L_0x0216
        L_0x020f:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0211 }
        L_0x0211:
            r0 = move-exception
            urd.l(r5, r10)     // Catch:{ all -> 0x020d }
            throw r0     // Catch:{ all -> 0x020d }
        L_0x0216:
            throw r10     // Catch:{ all -> 0x0217 }
        L_0x0217:
            r0 = move-exception
            urd.l(r4, r10)     // Catch:{ all -> 0x020b }
            throw r0     // Catch:{ all -> 0x020b }
        L_0x021c:
            urd.l(r11, r3)
        L_0x021f:
            java.util.Iterator r11 = r1.iterator()
        L_0x0223:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0233
            java.lang.Object r0 = r11.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x0223
        L_0x0233:
            java.lang.String r10 = r10.getPath()
            return r10
        L_0x0238:
            throw r10     // Catch:{ all -> 0x0239 }
        L_0x0239:
            r0 = move-exception
            urd.l(r11, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6a.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ArrayList g() {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            le5 le5 = (le5) it.next();
            u23.K(p23.B(new File[]{le5.c(), (File) le5.i.getValue()}), arrayList2);
        }
        return arrayList2;
    }

    public final synchronized void h() {
        if (i()) {
            if (this.c.getCount() != 0) {
                try {
                    for (e6a e6a : this.b.a) {
                        ArrayList arrayList = this.d;
                        int i = e6a.e;
                        p7c p7c = e6a.b;
                        p7c p7c2 = e6a.c;
                        int i2 = e6a.d;
                        arrayList.add(new le5(new zu4((Object) this, 24, (Object) e6a), i, (ou3) this.e.getValue(), i2, p7c, p7c2));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                this.c.countDown();
            }
        }
    }

    public final boolean i() {
        d6a d6a = this.b;
        d6a.getClass();
        t14 t14 = (t14) d6a.c.invoke();
        t14.getClass();
        return t14 == t14.FILE_LOGS || t14 == t14.DEV_OPTIONS_MENU;
    }

    public final void j(int i, String str, String str2, String str3, String str4, Throwable th, long j) {
        p7c p7c;
        if (c()) {
            if (i()) {
                h();
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    le5 le5 = (le5) it.next();
                    le5.getClass();
                    String str5 = str == null ? "" : str;
                    p7c p7c2 = le5.d;
                    if ((p7c2 == null || p7c2.a(str5)) && ((p7c = le5.e) == null || !p7c.a(str5))) {
                        xs7.E(le5.b, le5.k, (ru3) null, new ke5(le5, str4, (Continuation) null), 2);
                    }
                }
            }
            d6a d6a = this.b;
            d6a.getClass();
            if (d6a.c.invoke() == t14.DEV_OPTIONS_MENU && j > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = zp4.o;
                zp4.j(mt0.Q(currentTimeMillis - j, eq4.c));
            }
        }
        mk9 mk9 = tn7.c;
        if (i > 2 && this.a != null) {
            String[] strArr = op.c;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                String str6 = strArr[i3];
                if (str2 == null || !h0e.R(str2, str6, false)) {
                    i3++;
                } else {
                    mk9 mk92 = tn7.c;
                    if (i <= 4) {
                        return;
                    }
                }
            }
            if (!(str3 == null || str3.length() == 0 || ((sne) op.e.getValue()) == null)) {
                sne.a(str2 + ": " + str3);
            }
            mk9 mk93 = tn7.c;
            if (i >= 6 && th != null && ((sne) op.e.getValue()) != null) {
                sne.b((i == 3 ? sn7.Z : i == 4 ? sn7.Y : i == 5 ? sn7.o : i == 6 ? sn7.c : i == 7 ? sn7.b : sn7.X).a, th, (String) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.h6a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            h6a r0 = (defpackage.h6a) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            h6a r0 = new h6a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.util.Iterator r6 = r0.o
            wx3.H(r7)
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            wx3.H(r7)
            boolean r7 = r6.i()
            if (r7 != 0) goto L_0x003d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x003d:
            java.util.concurrent.CountDownLatch r7 = r6.c     // Catch:{ InterruptedException -> 0x0066 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0066 }
            r4 = 3
            r7.await(r4, r2)     // Catch:{ InterruptedException -> 0x0066 }
            java.util.ArrayList r6 = r6.d
            java.util.Iterator r6 = r6.iterator()
        L_0x004c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0063
            java.lang.Object r7 = r6.next()
            le5 r7 = (defpackage.le5) r7
            r0.o = r6
            r0.Z = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x0063:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L_0x0066:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6a.k(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
