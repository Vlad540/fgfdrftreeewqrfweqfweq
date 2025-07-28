package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* renamed from: b5e  reason: default package */
public final class b5e implements SurfaceHolder.Callback {
    public Size X;
    public boolean Y = false;
    public boolean Z = false;
    public Size a;
    public y4e b;
    public y4e c;
    public xz o;
    public final /* synthetic */ c5e w0;

    public b5e(c5e c5e) {
        this.w0 = c5e;
    }

    public final boolean a() {
        c5e c5e = this.w0;
        Surface surface = c5e.e.getHolder().getSurface();
        if (this.Y || this.b == null || !Objects.equals(this.a, this.X)) {
            return false;
        }
        xz xzVar = this.o;
        y4e y4e = this.b;
        Objects.requireNonNull(y4e);
        y4e.b(surface, kq3.a(c5e.e.getContext()), new jv1(8, xzVar));
        this.Y = true;
        c5e.a = true;
        c5e.m();
        return true;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.X = new Size(i2, i3);
        a();
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        y4e y4e;
        if (this.Z && (y4e = this.c) != null) {
            y4e.d();
            y4e.j.b((Object) null);
            this.c = null;
            this.Z = false;
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.Y) {
            y4e y4e = this.b;
            if (y4e != null) {
                Objects.toString(y4e);
                this.b.l.a();
            }
        } else {
            y4e y4e2 = this.b;
            if (y4e2 != null) {
                Objects.toString(y4e2);
                this.b.d();
            }
        }
        this.Z = true;
        y4e y4e3 = this.b;
        if (y4e3 != null) {
            this.c = y4e3;
        }
        this.Y = false;
        this.b = null;
        this.o = null;
        this.X = null;
        this.a = null;
    }
}
