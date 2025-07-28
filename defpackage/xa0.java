package defpackage;

import android.util.Size;

/* renamed from: xa0  reason: default package */
public final class xa0 {
    public final int a;
    public final j4e b;
    public final long c;

    public xa0(int i, j4e j4e, long j) {
        if (i != 0) {
            this.a = i;
            this.b = j4e;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null configType");
    }

    public static int a(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    public static xa0 b(int i, int i2, Size size, db0 db0) {
        int a2 = a(i2);
        j4e j4e = j4e.NOT_SUPPORT;
        int a3 = hjd.a(size);
        if (i == 1) {
            if (a3 <= hjd.a((Size) db0.b.get(Integer.valueOf(i2)))) {
                j4e = j4e.s720p;
            } else {
                if (a3 <= hjd.a((Size) db0.d.get(Integer.valueOf(i2)))) {
                    j4e = j4e.s1440p;
                }
            }
        } else if (a3 <= hjd.a(db0.a)) {
            j4e = j4e.VGA;
        } else if (a3 <= hjd.a(db0.c)) {
            j4e = j4e.PREVIEW;
        } else if (a3 <= hjd.a(db0.e)) {
            j4e = j4e.RECORD;
        } else {
            if (a3 <= hjd.a((Size) db0.f.get(Integer.valueOf(i2)))) {
                j4e = j4e.MAXIMUM;
            } else {
                Size size2 = (Size) db0.g.get(Integer.valueOf(i2));
                if (size2 != null) {
                    if (a3 <= size2.getHeight() * size2.getWidth()) {
                        j4e = j4e.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new xa0(a2, j4e, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xa0)) {
            return false;
        }
        xa0 xa0 = (xa0) obj;
        return hr1.c(this.a, xa0.a) && this.b.equals(xa0.b) && this.c == xa0.c;
    }

    public final int hashCode() {
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ ((((hr1.t(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RAW" : "JPEG_R" : "JPEG" : "YUV" : "PRIV");
        sb.append(", configSize=");
        sb.append(this.b);
        sb.append(", streamUseCase=");
        return wn6.k(sb, this.c, "}");
    }
}
