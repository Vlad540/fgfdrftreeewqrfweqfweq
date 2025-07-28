package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.rlottie.RLottieDrawable;

/* renamed from: di9  reason: default package */
public final class di9 implements lnc {
    public static di9 e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public di9(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new an(9, this), intentFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = ((java.util.concurrent.CopyOnWriteArrayList) r4.c).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (defpackage.e54) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r2.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        ((java.util.concurrent.CopyOnWriteArrayList) r4.c).remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(int r3, defpackage.di9 r4) {
        /*
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            int r1 = r4.a     // Catch:{ all -> 0x0009 }
            if (r1 != r3) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            goto L_0x0036
        L_0x0009:
            r3 = move-exception
            goto L_0x0037
        L_0x000b:
            r4.a = r3     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.lang.Object r0 = r4.c
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            e54 r2 = (defpackage.e54) r2
            if (r2 == 0) goto L_0x002e
            r2.a(r3)
            goto L_0x0016
        L_0x002e:
            java.lang.Object r2 = r4.c
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            r2.remove(r1)
            goto L_0x0016
        L_0x0036:
            return
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di9.g(int, di9):void");
    }

    public static synchronized di9 h(Context context) {
        di9 di9;
        synchronized (di9.class) {
            try {
                if (e == null) {
                    e = new di9(context);
                }
                di9 = e;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return di9;
    }

    public int a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        defpackage.urd.l(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        defpackage.urd.l(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            r2 = this;
            java.lang.String r0 = "w"
            java.io.OutputStream r3 = r3.openOutputStream(r4, r0)
            if (r3 == 0) goto L_0x003c
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x002e }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x002e }
            r4.<init>(r2)     // Catch:{ all -> 0x002e }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0024 }
            int r0 = r4.read(r2)     // Catch:{ all -> 0x0024 }
        L_0x0019:
            if (r0 <= 0) goto L_0x0026
            r1 = 0
            r3.write(r2, r1, r0)     // Catch:{ all -> 0x0024 }
            int r0 = r4.read(r2)     // Catch:{ all -> 0x0024 }
            goto L_0x0019
        L_0x0024:
            r2 = move-exception
            goto L_0x0030
        L_0x0026:
            r2 = 0
            defpackage.urd.l(r4, r2)     // Catch:{ all -> 0x002e }
            defpackage.urd.l(r3, r2)
            goto L_0x003c
        L_0x002e:
            r2 = move-exception
            goto L_0x0036
        L_0x0030:
            throw r2     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            defpackage.urd.l(r4, r2)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0036:
            throw r2     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r4 = move-exception
            defpackage.urd.l(r3, r2)
            throw r4
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di9.b(android.content.ContentResolver, android.net.Uri):void");
    }

    public Uri c() {
        return (Uri) this.d;
    }

    public String d() {
        return (String) this.c;
    }

    public Integer e() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        defpackage.urd.l(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005f, code lost:
        defpackage.urd.l(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0062, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.io.File r3) {
        /*
            r2 = this;
            java.lang.Object r2 = r2.b
            java.io.File r2 = (java.io.File) r2
            boolean r0 = r2.exists()
            r1 = 0
            if (r0 == 0) goto L_0x0063
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r3.delete()
            if (r0 == 0) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            kotlin.io.FileAlreadyExistsException r0 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x0020:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0035
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L_0x002d
            goto L_0x0053
        L_0x002d:
            kotlin.io.FileSystemException r0 = new kotlin.io.FileSystemException
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x0035:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x003e
            r0.mkdirs()
        L_0x003e:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0054 }
            r2.<init>(r3)     // Catch:{ all -> 0x0054 }
            r3 = 8192(0x2000, float:1.14794E-41)
            defpackage.oyb.p(r0, r2, r3)     // Catch:{ all -> 0x0056 }
            defpackage.urd.l(r2, r1)     // Catch:{ all -> 0x0054 }
            defpackage.urd.l(r0, r1)
        L_0x0053:
            return
        L_0x0054:
            r2 = move-exception
            goto L_0x005d
        L_0x0056:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            defpackage.urd.l(r2, r3)     // Catch:{ all -> 0x0054 }
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x005d:
            throw r2     // Catch:{ all -> 0x005e }
        L_0x005e:
            r3 = move-exception
            defpackage.urd.l(r0, r2)
            throw r3
        L_0x0063:
            kotlin.io.NoSuchFileException r3 = new kotlin.io.NoSuchFileException
            java.lang.String r0 = "The source file doesn't exist."
            r3.<init>(r2, r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di9.f(java.io.File):void");
    }

    public Integer getHeight() {
        return null;
    }

    public Integer getWidth() {
        return null;
    }

    public int i() {
        int i;
        synchronized (this.d) {
            i = this.a;
        }
        return i;
    }

    public int j() {
        int i = this.a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public di9(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List list;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(arrayList);
        }
        this.c = list;
        this.d = bArr;
    }

    public di9() {
        this.a = 20;
    }

    public di9(RLottieDrawable rLottieDrawable) {
        this.d = rLottieDrawable;
    }
}
