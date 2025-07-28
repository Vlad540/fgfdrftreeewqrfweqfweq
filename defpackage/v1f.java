package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: v1f  reason: default package */
public final class v1f implements b9f {
    public final v2f X;
    public final WeakReference Y;
    public final kr7 Z;
    public final String a;
    public final long b;
    public final k7f c;
    public final yya o;

    public v1f(String str, long j, k7f k7f, yya yya, v2f v2f, WeakReference weakReference, ja2 ja2) {
        this.a = str;
        this.b = j;
        this.c = k7f;
        this.o = yya;
        this.X = v2f;
        this.Y = weakReference;
        this.Z = ja2;
    }

    public final void G(Surface surface) {
        String name = v1f.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            long j = this.b;
            String str = this.a;
            boolean a2 = this.c.a();
            StringBuilder j2 = m4b.j("Player autoplay. Surface created, \n                            |msgId:", j, ", \n                            |attachId:", str);
            j2.append("\n                            |playing:");
            j2.append(a2);
            fn6.d(tn7, name, i0e.E(j2.toString()), (Throwable) null);
        }
        this.c.L0(surface);
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
        if (!(obj instanceof v1f)) {
            return false;
        }
        v1f v1f = (v1f) obj;
        return hhd.f(this.a, v1f.a) && this.b == v1f.b && hhd.f(this.c, v1f.c) && hhd.f(this.o, v1f.o) && hhd.f(this.X, v1f.X) && hhd.f(this.Y, v1f.Y) && hhd.f(this.Z, v1f.Z);
    }

    public final int hashCode() {
        int m = sxe.m(this.a.hashCode() * 31, 31, this.b);
        int hashCode = this.o.hashCode();
        int hashCode2 = this.X.hashCode();
        int hashCode3 = this.Y.hashCode();
        return this.Z.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.c.hashCode() + m) * 31)) * 31)) * 31)) * 31);
    }

    public final int j() {
        this.X.getClass();
        return 2;
    }

    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String name = v1f.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            long j = this.b;
            String str = this.a;
            boolean a2 = this.c.a();
            int g = this.Z.g();
            StringBuilder j2 = m4b.j("Player autoplay. Surface destroyed, \n                            |msgId:", j, ", \n                            |attachId:", str);
            j2.append("\n                            |playing:");
            j2.append(a2);
            j2.append("\n                            |states:");
            j2.append(g);
            fn6.d(tn7, name, i0e.E(j2.toString()), (Throwable) null);
        }
        this.o.a(this.c);
        h9f h9f = (h9f) this.Y.get();
        if (h9f != null) {
            h9f.t();
        }
        this.Z.e(this.a);
    }

    public final String toString() {
        return "PlayingState(attachId=" + this.a + ", messageId=" + this.b + ", player=" + this.c + ", playerHolder=" + this.o + ", videoContent=" + this.X + ", weakViewRef=" + this.Y + ", states=" + this.Z + ")";
    }
}
