package defpackage;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: lg9  reason: default package */
public abstract class lg9 {
    public static final String a = "lg9";
    public static final ThreadLocal b = new ThreadLocal();
    public static final ThreadLocal c = new ThreadLocal();

    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        urd.l(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        urd.l(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.io.File r7, java.io.File r8) {
        /*
            boolean r0 = r8.exists()
            if (r0 != 0) goto L_0x0009
            r8.createNewFile()
        L_0x0009:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            java.nio.channels.FileChannel r7 = r0.getChannel()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x002e }
            r0.<init>(r8)     // Catch:{ all -> 0x002e }
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ all -> 0x002e }
            long r5 = r7.size()     // Catch:{ all -> 0x0030 }
            r3 = 0
            r1 = r8
            r2 = r7
            r1.transferFrom(r2, r3, r5)     // Catch:{ all -> 0x0030 }
            r0 = 0
            urd.l(r8, r0)     // Catch:{ all -> 0x002e }
            urd.l(r7, r0)
            return
        L_0x002e:
            r8 = move-exception
            goto L_0x0037
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            urd.l(r8, r0)     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0037:
            throw r8     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            urd.l(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg9.b(java.io.File, java.io.File):void");
    }

    /* JADX INFO: finally extract failed */
    public static String c(InputStream inputStream) {
        ThreadLocal threadLocal = b;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            ThreadLocal threadLocal2 = c;
            byte[] bArr2 = (byte[]) threadLocal2.get();
            if (bArr2 == null) {
                bArr2 = new byte[4096];
                threadLocal2.set(bArr2);
            }
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr2, 0, bArr2.length);
                if (read >= 0) {
                    int i2 = i + read;
                    if (bArr.length < i2) {
                        byte[] bArr3 = new byte[(bArr.length * 2)];
                        System.arraycopy(bArr, 0, bArr3, 0, i);
                        threadLocal.set(bArr3);
                        bArr = bArr3;
                    }
                    if (read > 0) {
                        System.arraycopy(bArr2, 0, bArr, i, read);
                        i = i2;
                    }
                } else {
                    String str = new String(bArr, 0, i, e22.a);
                    a(inputStream);
                    return str;
                }
            }
        } catch (Throwable th) {
            a(inputStream);
            throw th;
        }
    }
}
