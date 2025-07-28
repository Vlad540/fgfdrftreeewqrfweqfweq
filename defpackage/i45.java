package defpackage;

import android.media.MediaFormat;

/* renamed from: i45  reason: default package */
public final class i45 implements e4f, nu1, iza {
    public e4f a;
    public nu1 b;
    public e4f c;
    public nu1 o;

    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (e4f) obj;
        } else if (i == 8) {
            this.b = (nu1) obj;
        } else if (i == 10000) {
            nmd nmd = (nmd) obj;
            if (nmd == null) {
                this.c = null;
                this.o = null;
                return;
            }
            this.c = nmd.getVideoFrameMetadataListener();
            this.o = nmd.getCameraMotionListener();
        }
    }

    public final void b(long j, float[] fArr) {
        nu1 nu1 = this.o;
        if (nu1 != null) {
            nu1.b(j, fArr);
        }
        nu1 nu12 = this.b;
        if (nu12 != null) {
            nu12.b(j, fArr);
        }
    }

    public final void c() {
        nu1 nu1 = this.o;
        if (nu1 != null) {
            nu1.c();
        }
        nu1 nu12 = this.b;
        if (nu12 != null) {
            nu12.c();
        }
    }

    public final void d(long j, long j2, vu5 vu5, MediaFormat mediaFormat) {
        e4f e4f = this.c;
        if (e4f != null) {
            e4f.d(j, j2, vu5, mediaFormat);
        }
        e4f e4f2 = this.a;
        if (e4f2 != null) {
            e4f2.d(j, j2, vu5, mediaFormat);
        }
    }
}
