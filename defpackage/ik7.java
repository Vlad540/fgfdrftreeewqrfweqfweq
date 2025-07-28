package defpackage;

import java.util.Map;

/* renamed from: ik7  reason: default package */
public final class ik7 extends mrd {
    public final /* synthetic */ int Y = 2;
    public final /* synthetic */ c5b Z;
    public final /* synthetic */ z4b w0;
    public final /* synthetic */ Object x0;
    public final /* synthetic */ y4b y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ik7(ah0 ah0, c5b c5b, z4b z4b, bie bie) {
        super(ah0, c5b, z4b, "BackgroundThreadHandoffProducer");
        this.x0 = ah0;
        this.Z = c5b;
        this.w0 = z4b;
        this.y0 = bie;
    }

    private final void h(Object obj) {
    }

    public final void b(Object obj) {
        switch (this.Y) {
            case 0:
                ax4.d((ax4) obj);
                return;
            case 1:
                e13.S((e13) obj);
                return;
            default:
                return;
        }
    }

    public Map c(Object obj) {
        switch (this.Y) {
            case 1:
                return at6.a("createdThumbnail", String.valueOf(((e13) obj) != null));
            default:
                return super.c(obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c A[SYNTHETIC, Splitter:B:38:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0072 A[SYNTHETIC, Splitter:B:44:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d() {
        /*
            r8 = this;
            int r0 = r8.Y
            switch(r0) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r8 = 0
            return r8
        L_0x0007:
            y4b r0 = r8.y0
            sl7 r0 = (defpackage.sl7) r0
            java.lang.Object r1 = r8.x0
            tr6 r1 = (defpackage.tr6) r1
            r2 = 0
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x001c }
            android.net.Uri r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x001c }
            android.content.ContentResolver r4 = r0.c     // Catch:{ IllegalArgumentException -> 0x001c }
            java.lang.String r3 = defpackage.fye.a(r4, r3)     // Catch:{ IllegalArgumentException -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 == 0) goto L_0x003c
            hbc r4 = r1.i
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0028
            int r6 = r4.a
            goto L_0x0029
        L_0x0028:
            r6 = r5
        L_0x0029:
            r7 = 96
            if (r6 > r7) goto L_0x0036
            if (r4 == 0) goto L_0x0031
            int r5 = r4.b
        L_0x0031:
            if (r5 <= r7) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r4 = 3
            goto L_0x0037
        L_0x0036:
            r4 = 1
        L_0x0037:
            android.graphics.Bitmap r3 = android.media.ThumbnailUtils.createVideoThumbnail(r3, r4)
            goto L_0x003d
        L_0x003c:
            r3 = r2
        L_0x003d:
            if (r3 != 0) goto L_0x0076
            android.content.ContentResolver r0 = r0.c
            android.net.Uri r1 = r1.b
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r1, r3)     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            r0.getClass()     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0070, all -> 0x0063 }
            r1.setDataSource(r0)     // Catch:{ FileNotFoundException -> 0x0070, all -> 0x0063 }
            r3 = -1
            android.graphics.Bitmap r0 = r1.getFrameAtTime(r3)     // Catch:{ FileNotFoundException -> 0x0070, all -> 0x0063 }
            r1.release()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            r3 = r0
            goto L_0x0076
        L_0x0063:
            r8 = move-exception
            r2 = r1
            goto L_0x006a
        L_0x0066:
            r8 = move-exception
            goto L_0x006a
        L_0x0068:
            r1 = r2
            goto L_0x0070
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            r2.release()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            throw r8
        L_0x0070:
            if (r1 == 0) goto L_0x0075
            r1.release()     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            r3 = r2
        L_0x0076:
            if (r3 != 0) goto L_0x0079
            goto L_0x0098
        L_0x0079:
            smc r0 = smc.j()
            et6 r1 = defpackage.et6.d
            r2 = 0
            com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of((android.graphics.Bitmap) r3, (defpackage.nbc) r0, (defpackage.tjb) r1, (int) r2)
            z4b r8 = r8.w0
            ji0 r8 = (defpackage.ji0) r8
            java.lang.String r1 = "image_format"
            java.lang.String r2 = "thumbnail"
            r8.putExtra(r1, r2)
            java.util.HashMap r8 = r8.Y
            r0.putExtras(r8)
            t54 r2 = defpackage.e13.o0(r0)
        L_0x0098:
            return r2
        L_0x0099:
            java.lang.Object r0 = r8.x0
            tr6 r0 = (defpackage.tr6) r0
            y4b r1 = r8.y0
            jk7 r1 = (defpackage.jk7) r1
            ax4 r0 = r1.d(r0)
            java.lang.String r2 = "fetch"
            java.lang.String r3 = "local"
            c5b r4 = r8.Z
            z4b r8 = r8.w0
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = r1.e()
            r1 = 0
            r4.e(r8, r0, r1)
            ji0 r8 = (defpackage.ji0) r8
            r8.h(r3, r2)
            r0 = 0
            goto L_0x00d8
        L_0x00be:
            r0.S()
            java.lang.String r1 = r1.e()
            r5 = 1
            r4.e(r8, r1, r5)
            ji0 r8 = (defpackage.ji0) r8
            r8.h(r3, r2)
            r0.n0()
            android.graphics.ColorSpace r1 = r0.y0
            java.lang.String r2 = "image_color_space"
            r8.putExtra(r2, r1)
        L_0x00d8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik7.d():java.lang.Object");
    }

    public void f(Exception exc) {
        switch (this.Y) {
            case 1:
                super.f(exc);
                c5b c5b = this.Z;
                z4b z4b = this.w0;
                c5b.e(z4b, "VideoThumbnailProducer", false);
                ((ji0) z4b).h("local", "video");
                return;
            default:
                super.f(exc);
                return;
        }
    }

    public void g(Object obj) {
        switch (this.Y) {
            case 1:
                e13 e13 = (e13) obj;
                super.g(e13);
                boolean z = e13 != null;
                c5b c5b = this.Z;
                z4b z4b = this.w0;
                c5b.e(z4b, "VideoThumbnailProducer", z);
                ((ji0) z4b).h("local", "video");
                return;
            case 2:
                c5b c5b2 = this.Z;
                z4b z4b2 = this.w0;
                c5b2.a(z4b2, "BackgroundThreadHandoffProducer", (Map) null);
                ((bie) this.y0).b.a((ah0) this.x0, z4b2);
                return;
            default:
                super.g(obj);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ik7(jk7 jk7, ah0 ah0, c5b c5b, z4b z4b, String str, tr6 tr6, c5b c5b2, z4b z4b2) {
        super(ah0, c5b, z4b, str);
        this.y0 = jk7;
        this.x0 = tr6;
        this.Z = c5b2;
        this.w0 = z4b2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ik7(sl7 sl7, ah0 ah0, c5b c5b, z4b z4b, c5b c5b2, z4b z4b2, tr6 tr6) {
        super(ah0, c5b, z4b, "VideoThumbnailProducer");
        this.y0 = sl7;
        this.Z = c5b2;
        this.w0 = z4b2;
        this.x0 = tr6;
    }
}
