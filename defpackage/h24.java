package defpackage;

import android.graphics.Bitmap;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h24  reason: default package */
public abstract class h24 extends rd4 {
    public final z4b c;
    public final c5b d;
    public final gq6 e;
    public boolean f;
    public final w37 g;
    public int h;
    public final /* synthetic */ i24 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h24(i24 i24, ah0 ah0, z4b z4b, boolean z, int i2) {
        super(ah0);
        this.i = i24;
        this.c = z4b;
        ji0 ji0 = (ji0) z4b;
        this.d = ji0.c;
        this.e = ji0.a.h;
        this.g = new w37(i24.b, new ph0(this, i24, i2, 4));
        ji0.a(new g24(this, z));
    }

    public final void d() {
        p();
    }

    public final void f(Throwable th) {
        q(th);
    }

    public final void h(int i2, Object obj) {
        ax4 ax4 = (ax4) obj;
        n06.s();
        boolean a = ah0.a(i2);
        z4b z4b = this.c;
        if (a) {
            if (ax4 == null) {
                ji0 ji0 = (ji0) z4b;
                hhd.f(ji0.Y.get("cached_value_found"), Boolean.TRUE);
                ji0.A0.v.getClass();
                q(new Exception("Encoded image is null."));
                return;
            } else if (!ax4.e0()) {
                q(new Exception("Encoded image is not valid."));
                return;
            }
        }
        if (u(ax4, i2)) {
            boolean l = ah0.l(i2, 4);
            if (a || l || ((ji0) z4b).f()) {
                this.g.c();
            }
        }
    }

    public final void j(float f2) {
        super.j(f2 * 0.99f);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [at6, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v8, types: [at6, java.util.HashMap] */
    public final at6 m(b13 b13, long j, tjb tjb, boolean z, String str, String str2, String str3, String str4) {
        Map extras;
        Object obj;
        b13 b132 = b13;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        String str9 = null;
        if (!this.d.i(this.c, "DecodeProducer")) {
            return null;
        }
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(((et6) tjb).b);
        String valueOf3 = String.valueOf(z);
        if (!(b132 == null || (extras = b13.getExtras()) == null || (obj = extras.get(HasExtraData.KEY_NON_FATAL_DECODE_ERROR)) == null)) {
            str9 = obj.toString();
        }
        boolean z2 = b132 instanceof CloseableStaticBitmap;
        Object obj2 = HasExtraData.KEY_NON_FATAL_DECODE_ERROR;
        String str10 = str9;
        if (z2) {
            Bitmap underlyingBitmap = ((CloseableStaticBitmap) b132).getUnderlyingBitmap();
            Bitmap bitmap = underlyingBitmap;
            String str11 = underlyingBitmap.getWidth() + "x" + underlyingBitmap.getHeight();
            HashMap hashMap = new HashMap(8);
            hashMap.put("bitmapSize", str11);
            hashMap.put("queueTime", valueOf);
            hashMap.put("hasGoodQuality", valueOf2);
            hashMap.put("isFinal", valueOf3);
            hashMap.put("encodedImageSize", str6);
            hashMap.put("imageFormat", str5);
            hashMap.put("requestedImageSize", str7);
            hashMap.put("sampleSize", str4);
            int byteCount = bitmap.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            hashMap.put("byteCount", sb.toString());
            if (str10 != null) {
                hashMap.put(obj2, str10);
            }
            return new HashMap(hashMap);
        }
        String str12 = str8;
        String str13 = str10;
        HashMap hashMap2 = new HashMap(7);
        hashMap2.put("queueTime", valueOf);
        hashMap2.put("hasGoodQuality", valueOf2);
        hashMap2.put("isFinal", valueOf3);
        hashMap2.put("encodedImageSize", str6);
        hashMap2.put("imageFormat", str5);
        hashMap2.put("requestedImageSize", str7);
        hashMap2.put("sampleSize", str12);
        if (str10 != null) {
            hashMap2.put(obj2, str10);
        }
        return new HashMap(hashMap2);
    }

    public abstract int n(ax4 ax4);

    public abstract et6 o();

    public final void p() {
        s(true);
        this.b.c();
    }

    public final void q(Throwable th) {
        s(true);
        this.b.e(th);
    }

    public final b13 r(ax4 ax4, int i2, tjb tjb) {
        i24 i24 = this.i;
        i24.getClass();
        return i24.c.a(ax4, i2, tjb, this.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0029
            boolean r2 = r1.f     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0008
            goto L_0x0029
        L_0x0008:
            ah0 r2 = r1.b     // Catch:{ all -> 0x0026 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.i(r0)     // Catch:{ all -> 0x0026 }
            r2 = 1
            r1.f = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)
            w37 r2 = r1.g
            monitor-enter(r2)
            ax4 r1 = r2.e     // Catch:{ all -> 0x0023 }
            r0 = 0
            r2.e = r0     // Catch:{ all -> 0x0023 }
            r0 = 0
            r2.f = r0     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            defpackage.ax4.d(r1)
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r1
        L_0x0026:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0029:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h24.s(boolean):void");
    }

    public final void t(ax4 ax4, b13 b13, int i2) {
        ax4.n0();
        Integer valueOf = Integer.valueOf(ax4.Y);
        ji0 ji0 = (ji0) this.c;
        ji0.putExtra(HasExtraData.KEY_ENCODED_WIDTH, valueOf);
        ax4.n0();
        ji0.putExtra(HasExtraData.KEY_ENCODED_HEIGHT, Integer.valueOf(ax4.Z));
        ji0.putExtra(HasExtraData.KEY_ENCODED_SIZE, Integer.valueOf(ax4.o()));
        ax4.n0();
        ji0.putExtra(HasExtraData.KEY_COLOR_SPACE, ax4.y0);
        if (b13 instanceof CloseableStaticBitmap) {
            ji0.putExtra(HasExtraData.KEY_BITMAP_CONFIG, String.valueOf(((CloseableStaticBitmap) b13).getUnderlyingBitmap().getConfig()));
        }
        if (b13 != null) {
            b13.putExtras(ji0.Y);
        }
        ji0.putExtra(HasExtraData.KEY_LAST_SCAN_NUMBER, Integer.valueOf(i2));
    }

    public abstract boolean u(ax4 ax4, int i2);
}
