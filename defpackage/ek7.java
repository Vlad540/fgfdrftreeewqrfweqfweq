package defpackage;

import java.util.Map;

/* renamed from: ek7  reason: default package */
public final class ek7 extends mrd {
    public final /* synthetic */ tr6 Y;
    public final /* synthetic */ gk7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ek7(gk7 gk7, ah0 ah0, c5b c5b, z4b z4b, tr6 tr6) {
        super(ah0, c5b, z4b, "LocalExifThumbnailProducer");
        this.Z = gk7;
        this.Y = tr6;
    }

    public final void b(Object obj) {
        ax4.d((ax4) obj);
    }

    public final Map c(Object obj) {
        return at6.a("createdThumbnail", Boolean.toString(((ax4) obj) != null));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: ax4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.util.Pair} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[SYNTHETIC, Splitter:B:18:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3 A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d() {
        /*
            r7 = this;
            tr6 r0 = r7.Y
            android.net.Uri r0 = r0.b
            gk7 r7 = r7.Z
            android.content.ContentResolver r1 = r7.c
            java.lang.String r2 = defpackage.fye.a(r1, r0)
            r3 = 0
            if (r2 != 0) goto L_0x0011
        L_0x000f:
            r0 = r3
            goto L_0x0054
        L_0x0011:
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r4.<init>(r2)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            boolean r5 = r4.exists()     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            if (r5 == 0) goto L_0x0028
            boolean r4 = r4.canRead()     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            if (r4 == 0) goto L_0x0028
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r0.<init>(r2)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            goto L_0x0054
        L_0x0028:
            java.lang.String r2 = defpackage.fye.b(r0)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            java.lang.String r4 = "content"
            boolean r2 = r4.equals(r2)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            if (r2 == 0) goto L_0x003b
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r0 = r1.openAssetFileDescriptor(r0, r2)     // Catch:{ FileNotFoundException -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r0 = r3
        L_0x003c:
            if (r0 == 0) goto L_0x000f
            java.io.FileDescriptor r1 = r0.getFileDescriptor()     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r2.<init>(r1)     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r0.close()     // Catch:{ IOException -> 0x000f, StackOverflowError -> 0x004c }
            r0 = r2
            goto L_0x0054
        L_0x004c:
            java.lang.Class<gk7> r0 = defpackage.gk7.class
            java.lang.String r1 = "StackOverflowError in ExifInterface constructor"
            defpackage.m75.a(r0, r1)
            goto L_0x000f
        L_0x0054:
            if (r0 == 0) goto L_0x012f
            boolean r1 = r0.hasThumbnail()
            if (r1 != 0) goto L_0x005e
            goto L_0x012f
        L_0x005e:
            byte[] r1 = r0.getThumbnail()
            r1.getClass()
            qe4 r7 = r7.b
            r7.getClass()
            kl8 r2 = new kl8
            int r4 = r1.length
            java.lang.Object r7 = r7.b
            il8 r7 = (defpackage.il8) r7
            r2.<init>(r7, r4)
            int r7 = r1.length     // Catch:{ IOException -> 0x0126 }
            r4 = 0
            r2.write(r1, r4, r7)     // Catch:{ IOException -> 0x0126 }
            jl8 r7 = r2.n()     // Catch:{ IOException -> 0x0126 }
            r2.close()
            k0b r1 = new k0b
            r1.<init>(r7)
            r7e r2 = defpackage.mn0.a
            java.lang.Object r4 = r2.getValue()
            p0b r4 = (defpackage.p0b) r4
            java.lang.Object r4 = r4.h()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            if (r4 != 0) goto L_0x009d
            rt0 r4 = defpackage.d24.a
            r4 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
        L_0x009d:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r6 = 1
            r5.inJustDecodeBounds = r6
            byte[] r6 = r4.array()     // Catch:{ all -> 0x00ca }
            r5.inTempStorage = r6     // Catch:{ all -> 0x00ca }
            android.graphics.BitmapFactory.decodeStream(r1, r3, r5)     // Catch:{ all -> 0x00ca }
            int r1 = r5.outWidth     // Catch:{ all -> 0x00ca }
            r6 = -1
            if (r1 == r6) goto L_0x00cc
            int r1 = r5.outHeight     // Catch:{ all -> 0x00ca }
            if (r1 != r6) goto L_0x00b8
            goto L_0x00cc
        L_0x00b8:
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x00ca }
            int r1 = r5.outWidth     // Catch:{ all -> 0x00ca }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00ca }
            int r5 = r5.outHeight     // Catch:{ all -> 0x00ca }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00ca }
            r3.<init>(r1, r5)     // Catch:{ all -> 0x00ca }
            goto L_0x00cc
        L_0x00ca:
            r7 = move-exception
            goto L_0x0118
        L_0x00cc:
            java.lang.Object r1 = r2.getValue()
            p0b r1 = (defpackage.p0b) r1
            r1.g(r4)
            java.lang.String r1 = "Orientation"
            java.lang.String r0 = r0.getAttribute(r1)
            r0.getClass()
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = defpackage.d8.q(r0)
            if (r3 == 0) goto L_0x00f1
            java.lang.Object r1 = r3.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x00f2
        L_0x00f1:
            r1 = r6
        L_0x00f2:
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r2 = r3.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r6 = r2.intValue()
        L_0x00fc:
            t54 r7 = defpackage.e13.o0(r7)
            ax4 r3 = new ax4     // Catch:{ all -> 0x0113 }
            r3.<init>(r7)     // Catch:{ all -> 0x0113 }
            defpackage.e13.S(r7)
            lq6 r7 = defpackage.o84.a
            r3.c = r7
            r3.o = r0
            r3.Y = r1
            r3.Z = r6
            goto L_0x012f
        L_0x0113:
            r0 = move-exception
            defpackage.e13.S(r7)
            throw r0
        L_0x0118:
            r7e r0 = defpackage.mn0.a
            java.lang.Object r0 = r0.getValue()
            p0b r0 = (defpackage.p0b) r0
            r0.g(r4)
            throw r7
        L_0x0124:
            r7 = move-exception
            goto L_0x012b
        L_0x0126:
            r7 = move-exception
            bm3.z(r7)     // Catch:{ all -> 0x0124 }
            throw r3     // Catch:{ all -> 0x0124 }
        L_0x012b:
            r2.close()
            throw r7
        L_0x012f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek7.d():java.lang.Object");
    }
}
