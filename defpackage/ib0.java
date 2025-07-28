package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* renamed from: ib0  reason: default package */
public final class ib0 implements kx4 {
    public final String a;
    public final int b;
    public final kje c;
    public final Size d;
    public final int e;
    public final jb0 f;
    public final int g;
    public final int h;
    public final int i;

    public ib0(String str, int i2, kje kje, Size size, int i3, jb0 jb0, int i4, int i5, int i6) {
        this.a = str;
        this.b = i2;
        this.c = kje;
        this.d = size;
        this.e = i3;
        this.f = jb0;
        this.g = i4;
        this.h = i5;
        this.i = i6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [km4, java.lang.Object] */
    public static km4 d() {
        ? obj = new Object();
        obj.b = -1;
        obj.w0 = 1;
        obj.X = 2130708361;
        obj.Y = jb0.d;
        return obj;
    }

    public final String a() {
        return this.a;
    }

    public final MediaFormat b() {
        Size size = this.d;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", this.e);
        createVideoFormat.setInteger("bitrate", this.i);
        createVideoFormat.setInteger("frame-rate", this.g);
        createVideoFormat.setInteger("i-frame-interval", this.h);
        int i2 = this.b;
        if (i2 != -1) {
            createVideoFormat.setInteger("profile", i2);
        }
        jb0 jb0 = this.f;
        int i3 = jb0.a;
        if (i3 != 0) {
            createVideoFormat.setInteger("color-standard", i3);
        }
        int i4 = jb0.b;
        if (i4 != 0) {
            createVideoFormat.setInteger("color-transfer", i4);
        }
        int i5 = jb0.c;
        if (i5 != 0) {
            createVideoFormat.setInteger("color-range", i5);
        }
        return createVideoFormat;
    }

    public final kje c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0 = (ib0) obj;
        return this.a.equals(ib0.a) && this.b == ib0.b && this.c.equals(ib0.c) && this.d.equals(ib0.d) && this.e == ib0.e && this.f.equals(ib0.f) && this.g == ib0.g && this.h == ib0.h && this.i == ib0.i;
    }

    public final int hashCode() {
        return this.i ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", frameRate=");
        sb.append(this.g);
        sb.append(", IFrameInterval=");
        sb.append(this.h);
        sb.append(", bitrate=");
        return wn6.j(sb, this.i, "}");
    }
}
