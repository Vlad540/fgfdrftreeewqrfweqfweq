package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

/* renamed from: en0  reason: default package */
public final class en0 {
    public final gvf a;
    public final t97 b;
    public final t97 c;

    public en0(gvf gvf, t97 t97, t97 t972) {
        this.a = gvf;
        this.b = t97;
        this.c = t972;
    }

    public static Bitmap a(byte[] bArr) {
        Object obj;
        Object obj2 = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(bArr, 0);
            if (decode != null) {
                if (decode.length != 0) {
                    obj = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    if (obj == null) {
                        return null;
                    }
                    if (!(obj instanceof kcc)) {
                        obj2 = obj;
                    }
                    return (Bitmap) obj2;
                }
            }
            return null;
        } catch (Throwable th) {
            obj = new kcc(th);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kcc] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        defpackage.urd.l(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        throw r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] c(android.graphics.Bitmap r9, byte[] r10) {
        /*
            java.lang.String r0 = "try to encode bitmap by size "
            boolean r1 = r9.isRecycled()
            if (r1 == 0) goto L_0x0009
            return r10
        L_0x0009:
            int r1 = defpackage.mn0.d(r9)
            if (r1 != 0) goto L_0x0010
            return r10
        L_0x0010:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r1)
            java.lang.Class<en0> r1 = defpackage.en0.class
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0049 }
            fn6 r3 = defpackage.udd.e     // Catch:{ all -> 0x0049 }
            r4 = 0
            if (r3 != 0) goto L_0x0021
            goto L_0x004b
        L_0x0021:
            boolean r5 = r3.c()     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x004b
            tn7 r5 = tn7.X     // Catch:{ all -> 0x0049 }
            int r6 = r9.getWidth()     // Catch:{ all -> 0x0049 }
            int r7 = r9.getHeight()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r8.<init>(r0)     // Catch:{ all -> 0x0049 }
            r8.append(r6)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "x"
            r8.append(r0)     // Catch:{ all -> 0x0049 }
            r8.append(r7)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0049 }
            r3.d(r5, r1, r0, r4)     // Catch:{ all -> 0x0049 }
            goto L_0x004b
        L_0x0049:
            r9 = move-exception
            goto L_0x0074
        L_0x004b:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0061 }
            r1 = 100
            r9.compress(r0, r1, r2)     // Catch:{ all -> 0x0061 }
            byte[] r9 = r2.toByteArray()     // Catch:{ all -> 0x0061 }
            int r0 = r9.length     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x005b
            r9 = r10
            goto L_0x0068
        L_0x005b:
            r0 = 0
            byte[] r9 = android.util.Base64.encode(r9, r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0068
        L_0x0061:
            r9 = move-exception
            kcc r0 = new kcc     // Catch:{ all -> 0x0049 }
            r0.<init>(r9)     // Catch:{ all -> 0x0049 }
            r9 = r0
        L_0x0068:
            boolean r0 = r9 instanceof defpackage.kcc     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r10 = r9
        L_0x006e:
            byte[] r10 = (byte[]) r10     // Catch:{ all -> 0x0049 }
            defpackage.urd.l(r2, r4)
            return r10
        L_0x0074:
            throw r9     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r10 = move-exception
            defpackage.urd.l(r2, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en0.c(android.graphics.Bitmap, byte[]):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.io.Serializable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[SYNTHETIC, Splitter:B:18:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable b(defpackage.tr6 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dn0
            if (r0 == 0) goto L_0x0014
            r0 = r9
            dn0 r0 = (defpackage.dn0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.Z = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            dn0 r0 = new dn0
            r0.<init>(r7, r9)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r9 = r6.X
            pu3 r0 = defpackage.pu3.a
            int r1 = r6.Z
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            en0 r7 = r6.o
            defpackage.wx3.H(r9)
            goto L_0x0051
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            defpackage.wx3.H(r9)
            t97 r9 = r7.b
            java.lang.Object r9 = r9.getValue()
            r1 = r9
            fr6 r1 = (defpackage.fr6) r1
            r6.o = r7
            r6.Z = r2
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            r2 = r8
            java.lang.Object r9 = defpackage.hhd.h(r1, r2, r3, r5, r6)
            if (r9 != r0) goto L_0x0051
            return r0
        L_0x0051:
            e13 r9 = (defpackage.e13) r9
            r8 = 0
            if (r9 == 0) goto L_0x0087
            java.lang.Object r0 = r9.e0()     // Catch:{ all -> 0x0061 }
            boolean r1 = r0 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0063
            com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r0     // Catch:{ all -> 0x0061 }
            goto L_0x0064
        L_0x0061:
            r7 = move-exception
            goto L_0x0081
        L_0x0063:
            r0 = r8
        L_0x0064:
            if (r0 == 0) goto L_0x007b
            android.graphics.Bitmap r0 = r0.getUnderlyingBitmap()     // Catch:{ all -> 0x0061 }
            gvf r7 = r7.a     // Catch:{ all -> 0x0061 }
            java.lang.Object r7 = r7.b     // Catch:{ all -> 0x0061 }
            r7e r7 = (defpackage.r7e) r7     // Catch:{ all -> 0x0061 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0061 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0061 }
            byte[] r7 = c(r0, r7)     // Catch:{ all -> 0x0061 }
            goto L_0x007c
        L_0x007b:
            r7 = r8
        L_0x007c:
            defpackage.urd.l(r9, r8)
            r8 = r7
            goto L_0x0087
        L_0x0081:
            throw r7     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r8 = move-exception
            defpackage.urd.l(r9, r7)
            throw r8
        L_0x0087:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en0.b(tr6, kotlin.coroutines.Continuation):java.io.Serializable");
    }
}
