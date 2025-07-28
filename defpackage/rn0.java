package defpackage;

import android.graphics.BitmapFactory;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.rlottie.RLottieDrawable;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: rn0  reason: default package */
public final class rn0 {
    public static ThreadPoolExecutor A;
    public static int B;
    public static jn C;
    public static boolean w;
    public static final ConcurrentHashMap x = new ConcurrentHashMap();
    public static volatile boolean y;
    public static final int z;
    public final pn0 a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f;
    public byte[] g;
    public final Object h;
    public int i;
    public boolean j;
    public volatile boolean k;
    public final int l;
    public final File m;
    public int n;
    public final AtomicBoolean o;
    public final re p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public RandomAccessFile u;
    public BitmapFactory.Options v;

    static {
        eg9 eg9 = ez3.e;
        z = Math.max(Math.min(eg9.d - 2, eg9.e), 1);
    }

    public rn0(File file, pn0 pn0, on0 on0, int i2, int i3, boolean z2) {
        int i4 = i2;
        int i5 = i3;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new re(5, this);
        this.a = pn0;
        this.b = i4;
        this.c = i5;
        on0.getClass();
        this.l = 100;
        String name = file.getName();
        if (A == null) {
            int i6 = z;
            A = new ThreadPoolExecutor(i6, i6, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(ez3.e.c.v(), "acache");
        if (!w) {
            file2.mkdir();
            w = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("_");
        sb.append(i4);
        sb.append("_");
        sb.append(i5);
        File file3 = new File(file2, wn6.l(sb, z2 ? "_nolimit" : " ", ".pcache2"));
        this.m = file3;
        this.f = i4 < je.a(60.0f) && i5 < je.a(60.0f);
        if (((Boolean) ez3.e.g.invoke()).booleanValue()) {
            this.k = file3.exists();
            if (this.k) {
                RandomAccessFile randomAccessFile = null;
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "r");
                    try {
                        this.s = randomAccessFile2.readBoolean();
                        if (this.s && arrayList.isEmpty()) {
                            randomAccessFile2.seek((long) randomAccessFile2.readInt());
                            int readInt = randomAccessFile2.readInt();
                            d(randomAccessFile2, readInt > 10000 ? 0 : readInt);
                            if (arrayList.size() == 0) {
                                this.s = false;
                                this.k = false;
                                this.q = true;
                                file3.delete();
                            } else {
                                if (this.u != randomAccessFile2) {
                                    a();
                                }
                                this.u = randomAccessFile2;
                            }
                        }
                        try {
                            if (this.u != randomAccessFile2) {
                                randomAccessFile2.close();
                            }
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        try {
                            th.printStackTrace();
                            this.m.delete();
                            this.k = false;
                            this.q = true;
                            if (!(this.u == randomAccessFile || randomAccessFile == null)) {
                                randomAccessFile.close();
                            }
                            this.q = true;
                            return;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            try {
                                if (!(this.u == randomAccessFile || randomAccessFile == null)) {
                                    randomAccessFile.close();
                                }
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th.printStackTrace();
                    this.m.delete();
                    this.k = false;
                    this.q = true;
                    randomAccessFile.close();
                    this.q = true;
                    return;
                }
            }
            this.q = true;
            return;
        }
        this.k = false;
        this.s = false;
    }

    public static void c() {
        int i2 = B - 1;
        B = i2;
        if (i2 <= 0) {
            B = 0;
            RLottieDrawable.lottieCacheGenerateQueue.b(new lc(3));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.u;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:19|18|42|43|44|45|48|49|50|51|(0)|54|(5:55|(0)|63|(0)(0)|114)|99|137) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|(11:5|6|7|8|9|(3:11|(1:13)|(8:15|(1:17)|20|21|22|(2:24|25)|26|28)(2:32|33))|34|(1:36)|37|38|(2:40|41))|50|51|(1:53)|54|(4:55|(2:57|58)|63|(1:67)(2:68|(1:142)(3:110|(2:112|144)(2:113|143)|114)))) */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01eb, code lost:
        one.me.rlottie.RLottie.getLogger().e("cancelled cache generation");
        r12.set(true);
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01fa, code lost:
        if (r13 >= z) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01fc, code lost:
        r0 = r22[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01fe, code lost:
        if (r0 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r0.await();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0204, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r15.close();
        r11.a.releaseForGenerateCache();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ff, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0102, code lost:
        if (r1 >= z) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0104, code lost:
        r0 = r8[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0106, code lost:
        if (r0 == null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r0.await();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0114, code lost:
        r0 = (int) r15.length();
        java.util.Collections.sort(r7, new defpackage.zo4(9));
        r1 = r17[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0125, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r1.b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0129, code lost:
        r1 = r7.size();
        r17[r13].d(r1);
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0137, code lost:
        if (r2 >= r7.size()) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0139, code lost:
        r17[r13].d(((defpackage.qn0) r7.get(r2)).c);
        r17[r13].d(((defpackage.qn0) r7.get(r2)).b);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0156, code lost:
        r15.write(r17[r13].a, r13, (r1 * 8) + 4);
        r1 = r17[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0163, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r1.b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0167, code lost:
        r15.seek(r9);
        r15.writeBoolean(true);
        r15.writeInt(r0);
        r6.set(true);
        r15.close();
        r11.e.clear();
        r11.e.addAll(r7);
        a();
        r11.u = new java.io.RandomAccessFile(r11.m, r12);
        r11.s = true;
        r11.k = true;
        r11.q = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0082 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0098 A[Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060, all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d9 A[SYNTHETIC, Splitter:B:57:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0 A[Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060, all -> 0x005d }, EDGE_INSN: B:140:0x00f0->B:67:0x00f0 ?: BREAK  
    EDGE_INSN: B:141:0x00f0->B:67:0x00f0 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f5 A[Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060, all -> 0x005d }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:44:0x0082=Splitter:B:44:0x0082, B:37:0x0075=Splitter:B:37:0x0075, B:50:0x008b=Splitter:B:50:0x008b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r25 = this;
            r11 = r25
            java.io.File r0 = r11.m     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            boolean r0 = r0.exists()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.String r12 = "r"
            r13 = 0
            r14 = 1
            r9 = 0
            if (r0 == 0) goto L_0x008b
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x007d }
            java.io.File r2 = r11.m     // Catch:{ all -> 0x007d }
            r1.<init>(r2, r12)     // Catch:{ all -> 0x007d }
            boolean r0 = r1.readBoolean()     // Catch:{ all -> 0x0048 }
            r11.s = r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r11.s     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x006c
            java.util.ArrayList r0 = r11.e     // Catch:{ all -> 0x0048 }
            r0.clear()     // Catch:{ all -> 0x0048 }
            int r0 = r1.readInt()     // Catch:{ all -> 0x0048 }
            long r2 = (long) r0     // Catch:{ all -> 0x0048 }
            r1.seek(r2)     // Catch:{ all -> 0x0048 }
            int r0 = r1.readInt()     // Catch:{ all -> 0x0048 }
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r0 <= r2) goto L_0x0038
            r0 = r13
        L_0x0038:
            if (r0 <= 0) goto L_0x0066
            r11.d(r1, r0)     // Catch:{ all -> 0x0048 }
            r1.seek(r9)     // Catch:{ all -> 0x0048 }
            java.io.RandomAccessFile r0 = r11.u     // Catch:{ all -> 0x0048 }
            if (r0 == r1) goto L_0x004a
            r25.a()     // Catch:{ all -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r0 = r1
            goto L_0x007d
        L_0x004a:
            r11.u = r1     // Catch:{ all -> 0x0048 }
            r11.k = r14     // Catch:{ all -> 0x0048 }
            r11.q = r14     // Catch:{ all -> 0x0048 }
            java.io.RandomAccessFile r0 = r11.u     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == r1) goto L_0x0057
            r1.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            pn0 r0 = r11.a
            r0.releaseForGenerateCache()
            return
        L_0x005d:
            r0 = move-exception
            goto L_0x0233
        L_0x0060:
            r0 = move-exception
            goto L_0x021d
        L_0x0063:
            r0 = move-exception
            goto L_0x0226
        L_0x0066:
            r11.k = r13     // Catch:{ all -> 0x0048 }
            r11.s = r13     // Catch:{ all -> 0x0048 }
            r11.q = r14     // Catch:{ all -> 0x0048 }
        L_0x006c:
            boolean r0 = r11.s     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0075
            java.io.File r0 = r11.m     // Catch:{ all -> 0x0048 }
            r0.delete()     // Catch:{ all -> 0x0048 }
        L_0x0075:
            java.io.RandomAccessFile r0 = r11.u     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == r1) goto L_0x008b
            r1.close()     // Catch:{ all -> 0x008b }
            goto L_0x008b
        L_0x007d:
            java.io.File r1 = r11.m     // Catch:{ all -> 0x0082 }
            r1.delete()     // Catch:{ all -> 0x0082 }
        L_0x0082:
            java.io.RandomAccessFile r1 = r11.u     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r1 == r0) goto L_0x008b
            if (r0 == 0) goto L_0x008b
            r0.close()     // Catch:{ all -> 0x008b }
        L_0x008b:
            java.io.RandomAccessFile r15 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.io.File r0 = r11.m     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.String r1 = "rw"
            r15.<init>(r0, r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            jn r0 = C     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 != 0) goto L_0x00a1
            jn r0 = new jn     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1 = 3
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            C = r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x00a1:
            jn r0 = C     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r1 = r11.c     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r2 = r11.b     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.f(r1, r2)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            jn r0 = C     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.Object r1 = r0.o     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r16 = r1
            android.graphics.Bitmap[] r16 = (android.graphics.Bitmap[]) r16     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.Object r0 = r0.c     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r17 = r0
            ls6[] r17 = (defpackage.ls6[]) r17     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r0 = z     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.concurrent.CountDownLatch[] r8 = new java.util.concurrent.CountDownLatch[r0]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.writeBoolean(r13)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.writeInt(r13)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r6.<init>(r13)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            pn0 r0 = r11.a     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.prepareForGenerateCache()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r18 = r13
            r19 = r18
        L_0x00d5:
            r0 = r8[r18]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x00e2
            r0.await()     // Catch:{ InterruptedException -> 0x00dd }
            goto L_0x00e2
        L_0x00dd:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x00e2:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.o     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 != 0) goto L_0x00f0
            boolean r0 = r6.get()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x00f5
        L_0x00f0:
            r12 = r6
            r22 = r8
            goto L_0x01eb
        L_0x00f5:
            pn0 r0 = r11.a     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1 = r16[r18]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r0 = r0.getNextFrame(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == r14) goto L_0x019f
            r1 = r13
        L_0x0100:
            int r0 = z     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r1 >= r0) goto L_0x0114
            r0 = r8[r1]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x0111
            r0.await()     // Catch:{ InterruptedException -> 0x010c }
            goto L_0x0111
        L_0x010c:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x0111:
            int r1 = r1 + 1
            goto L_0x0100
        L_0x0114:
            long r0 = r15.length()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r0 = (int) r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            zo4 r1 = new zo4     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r2 = 9
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.Collections.sort(r7, r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1 = r17[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            monitor-enter(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1.b = r13     // Catch:{ all -> 0x019c }
            monitor-exit(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r1 = r7.size()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r2 = r17[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r2.d(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r2 = r13
        L_0x0133:
            int r3 = r7.size()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r2 >= r3) goto L_0x0156
            r3 = r17[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.Object r4 = r7.get(r2)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            qn0 r4 = (defpackage.qn0) r4     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r4 = r4.c     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r3.d(r4)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r3 = r17[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.Object r4 = r7.get(r2)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            qn0 r4 = (defpackage.qn0) r4     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r4 = r4.b     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r3.d(r4)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0133
        L_0x0156:
            r2 = r17[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            byte[] r2 = r2.a     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r1 = r1 * 8
            int r1 = r1 + 4
            r15.write(r2, r13, r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1 = r17[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            monitor-enter(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1.b = r13     // Catch:{ all -> 0x0199 }
            monitor-exit(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.seek(r9)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.writeBoolean(r14)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.writeInt(r0)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r6.set(r14)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r15.close()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.ArrayList r0 = r11.e     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.clear()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.ArrayList r0 = r11.e     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.addAll(r7)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r25.a()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.io.File r1 = r11.m     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.<init>(r1, r12)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r11.u = r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r11.s = r14     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r11.k = r14     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r11.q = r14     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x0192:
            pn0 r0 = r11.a
            r0.releaseForGenerateCache()
            goto L_0x0232
        L_0x0199:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0199 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x019c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x019c }
            throw r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x019f:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.<init>(r14)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r8[r18] = r0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.util.concurrent.ThreadPoolExecutor r0 = A     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            nn0 r5 = new nn0     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r1 = r5
            r2 = r25
            r3 = r6
            r4 = r16
            r13 = r5
            r5 = r18
            r20 = r12
            r12 = r6
            r6 = r17
            r21 = r7
            r7 = r19
            r22 = r8
            r8 = r15
            r23 = r9
            r9 = r21
            r10 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.execute(r13)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            int r0 = r18 + 1
            int r1 = r19 + 1
            int r2 = z     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 < r2) goto L_0x01d6
            r18 = 0
            goto L_0x01d8
        L_0x01d6:
            r18 = r0
        L_0x01d8:
            java.util.concurrent.atomic.AtomicInteger r0 = r11.d     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.set(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r19 = r1
            r6 = r12
            r12 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r13 = 0
            goto L_0x00d5
        L_0x01eb:
            gg9 r0 = one.me.rlottie.RLottie.getLogger()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            java.lang.String r1 = "cancelled cache generation"
            r0.e(r1)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r12.set(r14)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r13 = 0
        L_0x01f8:
            int r0 = z     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r13 >= r0) goto L_0x0213
            r0 = r22[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x0209
            r0.await()     // Catch:{ InterruptedException -> 0x0204 }
            goto L_0x0209
        L_0x0204:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
        L_0x0209:
            r0 = r16[r13]     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            if (r0 == 0) goto L_0x0210
            r0.recycle()     // Catch:{ Exception -> 0x0210 }
        L_0x0210:
            int r13 = r13 + 1
            goto L_0x01f8
        L_0x0213:
            r15.close()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            pn0 r0 = r11.a     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            r0.releaseForGenerateCache()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0060 }
            goto L_0x0057
        L_0x021d:
            gg9 r1 = one.me.rlottie.RLottie.getLogger()     // Catch:{ all -> 0x005d }
            r1.o(r0)     // Catch:{ all -> 0x005d }
            goto L_0x0192
        L_0x0226:
            gg9 r1 = one.me.rlottie.RLottie.getLogger()     // Catch:{ all -> 0x005d }
            r1.o(r0)     // Catch:{ all -> 0x005d }
            r0.printStackTrace()     // Catch:{ all -> 0x005d }
            goto L_0x0192
        L_0x0232:
            return
        L_0x0233:
            pn0 r1 = r11.a
            r1.releaseForGenerateCache()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn0.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i2) {
        if (i2 != 0) {
            byte[] bArr = new byte[(i2 * 8)];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i3 = 0; i3 < i2; i3++) {
                qn0 qn0 = new qn0(i3);
                qn0.c = wrap.getInt();
                qn0.b = wrap.getInt();
                this.e.add(qn0);
            }
        }
    }

    public final byte[] e(qn0 qn0) {
        boolean z2 = this.f && Thread.currentThread().getName().startsWith("rlottie-bg-pool");
        byte[] bArr = z2 ? (byte[]) x.get(Thread.currentThread()) : this.g;
        if (bArr == null || bArr.length < qn0.b) {
            bArr = new byte[((int) (((float) qn0.b) * 1.3f))];
            if (z2) {
                x.put(Thread.currentThread(), bArr);
                if (!y) {
                    y = true;
                    je.e(this.p, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                }
            } else {
                this.g = bArr;
            }
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(android.graphics.Bitmap r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.j
            r1 = -1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            r2 = 1
            boolean r3 = r7.s     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            if (r3 != 0) goto L_0x0014
            boolean r3 = r7.k     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            if (r3 != 0) goto L_0x0014
            return r1
        L_0x0011:
            r8 = move-exception
            goto L_0x00be
        L_0x0014:
            boolean r3 = r7.s     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            r4 = 0
            if (r3 == 0) goto L_0x001d
            java.io.RandomAccessFile r3 = r7.u     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            if (r3 != 0) goto L_0x0063
        L_0x001d:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            java.io.File r5 = r7.m     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            java.lang.String r6 = "r"
            r3.<init>(r5, r6)     // Catch:{ FileNotFoundException -> 0x00d0, all -> 0x0011 }
            boolean r5 = r3.readBoolean()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r7.s = r5     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            boolean r5 = r7.s     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 == 0) goto L_0x004f
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            boolean r5 = r5.isEmpty()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 == 0) goto L_0x004f
            int r5 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            long r5 = (long) r5     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r3.seek(r5)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r7.d(r3, r5)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            r8 = move-exception
            r0 = r3
            goto L_0x00be
        L_0x004c:
            r0 = r3
            goto L_0x00d0
        L_0x004f:
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r5.size()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 != 0) goto L_0x005b
            r7.s = r4     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r7.q = r2     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
        L_0x005b:
            boolean r5 = r7.s     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 != 0) goto L_0x0063
            r3.close()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            return r1
        L_0x0063:
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r5.size()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r5 != 0) goto L_0x006c
            return r1
        L_0x006c:
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r5.size()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r5 - r2
            int r9 = java.lang.Math.min(r9, r5)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r9 = java.lang.Math.max(r9, r4)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            java.util.ArrayList r5 = r7.e     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            java.lang.Object r9 = r5.get(r9)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            qn0 r9 = (defpackage.qn0) r9     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r5 = r9.c     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            long r5 = (long) r5     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r3.seek(r5)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            byte[] r5 = r7.e(r9)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r6 = r9.b     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r3.readFully(r5, r4, r6)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            boolean r6 = r7.t     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r6 != 0) goto L_0x00a0
            java.io.RandomAccessFile r6 = r7.u     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r6 == r3) goto L_0x009d
            r7.a()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
        L_0x009d:
            r7.u = r3     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            goto L_0x00a5
        L_0x00a0:
            r7.u = r0     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
        L_0x00a5:
            android.graphics.BitmapFactory$Options r6 = r7.v     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            if (r6 != 0) goto L_0x00b0
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r7.v = r6     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
        L_0x00b0:
            android.graphics.BitmapFactory$Options r6 = r7.v     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r6.inBitmap = r8     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            int r8 = r9.b     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            android.graphics.BitmapFactory.decodeByteArray(r5, r4, r8, r6)     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            android.graphics.BitmapFactory$Options r8 = r7.v     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            r8.inBitmap = r0     // Catch:{ FileNotFoundException -> 0x004c, all -> 0x0048 }
            return r4
        L_0x00be:
            gg9 r9 = one.me.rlottie.RLottie.getLogger()
            r9.o(r8)
            int r8 = r7.n
            int r8 = r8 + r2
            r7.n = r8
            r9 = 10
            if (r8 <= r9) goto L_0x00d0
            r7.j = r2
        L_0x00d0:
            boolean r7 = r7.j
            if (r7 == 0) goto L_0x00de
            if (r0 == 0) goto L_0x00de
            r0.close()     // Catch:{ IOException -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r7 = move-exception
            r7.printStackTrace()
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn0.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        return !this.s || !this.k;
    }
}
