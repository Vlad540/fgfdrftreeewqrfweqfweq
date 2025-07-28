package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: mz  reason: default package */
public final class mz extends tk7 {
    public static final /* synthetic */ int D0 = 0;
    public final long A0;
    public File B0;
    public final Uri C0;
    public o10 y0;
    public final long z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mz(defpackage.o10 r16, defpackage.a10 r17, long r18, long r20, android.net.Uri r22) {
        /*
            r15 = this;
            r13 = r15
            r14 = r16
            r0 = r17
            java.lang.String r1 = r14.q
            int r1 = r1.hashCode()
            long r2 = (long) r1
            java.lang.String r1 = r14.r
            if (r1 == 0) goto L_0x001c
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            java.lang.String r4 = at7.y(r1)
            goto L_0x0020
        L_0x001c:
            java.lang.String r4 = r17.a()
        L_0x0020:
            boolean r5 = r0.X
            java.lang.String r6 = r0.z0
            if (r5 == 0) goto L_0x0030
            if (r6 != 0) goto L_0x002e
            java.lang.String r1 = r17.a()
        L_0x002c:
            r5 = r1
            goto L_0x0045
        L_0x002e:
            r5 = r6
            goto L_0x0045
        L_0x0030:
            if (r1 == 0) goto L_0x003e
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            java.lang.String r1 = at7.y(r1)
            goto L_0x002c
        L_0x003e:
            if (r6 != 0) goto L_0x002e
            java.lang.String r1 = r17.a()
            goto L_0x002c
        L_0x0045:
            boolean r0 = r0.X
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "image/gif"
        L_0x004b:
            r9 = r0
            goto L_0x0050
        L_0x004d:
            java.lang.String r0 = "image/jpeg"
            goto L_0x004b
        L_0x0050:
            r6 = 0
            r7 = 0
            r1 = 1
            r10 = 0
            r12 = 0
            r0 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10, r12)
            r13.y0 = r14
            r0 = r18
            r13.z0 = r0
            r0 = r20
            r13.A0 = r0
            r0 = r22
            r13.C0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz.<init>(o10, a10, long, long, android.net.Uri):void");
    }

    public final String a() {
        Uri uri = this.C0;
        if (uri != null) {
            return String.valueOf(uri);
        }
        File file = this.B0;
        if (file == null) {
            return super.a();
        }
        String path = file.getPath();
        if (path != null) {
            return path;
        }
        Uri c = c();
        if (c != null) {
            return c.getPath();
        }
        return null;
    }

    public final Uri c() {
        Uri uri = this.C0;
        if (uri != null) {
            return uri;
        }
        Uri x = at7.x(this.y0.r);
        return x != null ? x : super.c();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mz(defpackage.o10 r16, defpackage.n10 r17, int r18, long r19, long r21, android.net.Uri r23, boolean r24) {
        /*
            r15 = this;
            r13 = r15
            r14 = r16
            r0 = r17
            if (r24 == 0) goto L_0x000f
            r1 = 2
            r2 = r18
            if (r2 != r1) goto L_0x000f
            r1 = 11
            goto L_0x0010
        L_0x000f:
            r1 = 3
        L_0x0010:
            java.lang.String r2 = r14.q
            int r2 = r2.hashCode()
            long r2 = (long) r2
            java.lang.String r4 = r14.r
            if (r4 == 0) goto L_0x0030
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0022
            goto L_0x0030
        L_0x0022:
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            android.net.Uri r4 = android.net.Uri.fromFile(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x0032
        L_0x0030:
            java.lang.String r4 = r0.h
        L_0x0032:
            java.lang.String r5 = r0.d
            long r7 = r0.c
            r12 = 0
            r6 = 0
            java.lang.String r9 = "video/mp4"
            r10 = 0
            r0 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10, r12)
            r13.y0 = r14
            r0 = r19
            r13.z0 = r0
            r0 = r21
            r13.A0 = r0
            r0 = r23
            r13.C0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz.<init>(o10, n10, int, long, long, android.net.Uri, boolean):void");
    }
}
