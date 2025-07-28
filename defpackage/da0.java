package defpackage;

import android.opengl.EGLSurface;

/* renamed from: da0  reason: default package */
public final class da0 {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public da0(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface != null) {
            this.a = eGLSurface;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof da0)) {
            return false;
        }
        da0 da0 = (da0) obj;
        return this.a.equals(da0.a) && this.b == da0.b && this.c == da0.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return wn6.j(sb, this.c, "}");
    }
}
