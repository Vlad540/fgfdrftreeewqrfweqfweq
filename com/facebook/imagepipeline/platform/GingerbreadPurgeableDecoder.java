package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.FileDescriptor;
import java.lang.reflect.Method;

@lj4
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public static Method o;
    public final WebpBitmapFactoryImpl c;

    @lj4
    public GingerbreadPurgeableDecoder() {
        WebpBitmapFactoryImpl webpBitmapFactoryImpl;
        if (dqf.b) {
            webpBitmapFactoryImpl = dqf.a;
        } else {
            try {
                webpBitmapFactoryImpl = WebpBitmapFactoryImpl.class.newInstance();
            } catch (Throwable unused) {
                webpBitmapFactoryImpl = null;
            }
            dqf.b = true;
        }
        this.c = webpBitmapFactoryImpl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: k0b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: k0b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: k0b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: k0b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: k0b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: k0b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.MemoryFile g(defpackage.e13 r8, int r9, byte[] r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0006
        L_0x0005:
            int r1 = r10.length
        L_0x0006:
            int r1 = r1 + r9
            android.os.MemoryFile r2 = new android.os.MemoryFile
            r3 = 0
            r2.<init>(r3, r1)
            r2.allowPurging(r0)
            k0b r1 = new k0b     // Catch:{ all -> 0x0052 }
            java.lang.Object r4 = r8.e0()     // Catch:{ all -> 0x0052 }
            jl8 r4 = (defpackage.jl8) r4     // Catch:{ all -> 0x0052 }
            r1.<init>(r4)     // Catch:{ all -> 0x0052 }
            uc7 r4 = new uc7     // Catch:{ all -> 0x004e }
            r4.<init>(r1, r9)     // Catch:{ all -> 0x004e }
            java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ all -> 0x0039 }
            r3.getClass()     // Catch:{ all -> 0x0039 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0039 }
        L_0x002b:
            int r6 = r4.read(r5)     // Catch:{ all -> 0x0039 }
            r7 = -1
            if (r6 != r7) goto L_0x004a
            if (r10 == 0) goto L_0x003d
            int r5 = r10.length     // Catch:{ all -> 0x0039 }
            r2.writeBytes(r10, r0, r9, r5)     // Catch:{ all -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r9 = move-exception
            r10 = r3
        L_0x003b:
            r3 = r1
            goto L_0x0055
        L_0x003d:
            defpackage.e13.S(r8)
            defpackage.g13.b(r1)
            defpackage.g13.b(r4)
            defpackage.g13.a(r3)
            return r2
        L_0x004a:
            r3.write(r5, r0, r6)     // Catch:{ all -> 0x0039 }
            goto L_0x002b
        L_0x004e:
            r9 = move-exception
            r10 = r3
            r4 = r10
            goto L_0x003b
        L_0x0052:
            r9 = move-exception
            r10 = r3
            r4 = r10
        L_0x0055:
            defpackage.e13.S(r8)
            defpackage.g13.b(r3)
            defpackage.g13.b(r4)
            defpackage.g13.a(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.g(e13, int, byte[]):android.os.MemoryFile");
    }

    public final Bitmap b(e13 e13, BitmapFactory.Options options) {
        return h(e13, ((jl8) e13.e0()).U(), (byte[]) null, options);
    }

    public final Bitmap c(e13 e13, int i, BitmapFactory.Options options) {
        return h(e13, i, DalvikPurgeableDecoder.d(i, e13) ? null : DalvikPurgeableDecoder.b, options);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap h(defpackage.e13 r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = g(r2, r3, r4)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            java.io.FileDescriptor r3 = r1.i(r2)     // Catch:{ IOException -> 0x001e }
            com.facebook.webpsupport.WebpBitmapFactoryImpl r1 = r1.c     // Catch:{ IOException -> 0x001e }
            if (r1 == 0) goto L_0x0020
            android.graphics.Bitmap r1 = com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFileDescriptor(r3, r0, r5)     // Catch:{ IOException -> 0x001e }
            java.lang.String r3 = "BitmapFactory returned null"
            defpackage.ez3.n(r1, r3)     // Catch:{ IOException -> 0x001e }
            r2.close()
            return r1
        L_0x001a:
            r0 = r2
            goto L_0x0030
        L_0x001c:
            r1 = move-exception
            goto L_0x001a
        L_0x001e:
            r1 = move-exception
            goto L_0x002c
        L_0x0020:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x001e }
            java.lang.String r3 = "WebpBitmapFactory is null"
            r1.<init>(r3)     // Catch:{ IOException -> 0x001e }
            throw r1     // Catch:{ IOException -> 0x001e }
        L_0x0028:
            r1 = move-exception
            goto L_0x0030
        L_0x002a:
            r1 = move-exception
            r2 = r0
        L_0x002c:
            bm3.z(r1)     // Catch:{ all -> 0x001c }
            throw r0     // Catch:{ all -> 0x001c }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.h(e13, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public final FileDescriptor i(MemoryFile memoryFile) {
        Method method;
        try {
            synchronized (this) {
                if (o == null) {
                    o = MemoryFile.class.getDeclaredMethod("getFileDescriptor", (Class[]) null);
                }
                method = o;
            }
            Object invoke = method.invoke(memoryFile, (Object[]) null);
            invoke.getClass();
            return (FileDescriptor) invoke;
        } catch (Exception e) {
            bm3.z(e);
            throw null;
        } catch (Exception e2) {
            bm3.z(e2);
            throw null;
        }
    }
}
