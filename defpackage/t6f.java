package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: t6f  reason: default package */
public final class t6f implements b9f {
    public final v2f X;
    public final int Y;
    public final k7f Z;
    public final long a;
    public final String b;
    public final rz c;
    public final float o;
    public final yya w0;

    public t6f(long j, String str, rz rzVar, float f, v2f v2f, int i, k7f k7f, yya yya) {
        this.a = j;
        this.b = str;
        this.c = rzVar;
        this.o = f;
        this.X = v2f;
        this.Y = i;
        this.Z = k7f;
        this.w0 = yya;
    }

    public static t6f a(t6f t6f, int i) {
        return new t6f(t6f.a, t6f.b, t6f.c, t6f.o, t6f.X, i, t6f.Z, t6f.w0);
    }

    public final void G(Surface surface) {
        this.Z.L0(surface);
    }

    public final int M0() {
        return this.X.getHeight();
    }

    public final int R() {
        return this.X.getWidth();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6f)) {
            return false;
        }
        t6f t6f = (t6f) obj;
        return this.a == t6f.a && hhd.f(this.b, t6f.b) && hhd.f(this.c, t6f.c) && Float.compare(this.o, t6f.o) == 0 && hhd.f(this.X, t6f.X) && this.Y == t6f.Y && hhd.f(this.Z, t6f.Z) && hhd.f(this.w0, t6f.w0);
    }

    public final int hashCode() {
        int e = th2.e((this.c.hashCode() + me4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, this.o, 31);
        int h = us8.h(this.Y, (this.X.hashCode() + e) * 31, 31);
        return this.w0.hashCode() + ((this.Z.hashCode() + h) * 31);
    }

    public final int j() {
        return 3;
    }

    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        yya yya = this.w0;
        k7f k7f = this.Z;
        yya.a(k7f);
        k7f.M0();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMessageState(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", currentPosition=");
        sb.append(this.o);
        sb.append(", videoContent=");
        sb.append(this.X);
        sb.append(", state=");
        int i = this.Y;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "STOP" : "PAUSE" : "PLAY" : "PREPARE");
        sb.append(", player=");
        sb.append(this.Z);
        sb.append(", playerHolder=");
        sb.append(this.w0);
        sb.append(")");
        return sb.toString();
    }
}
