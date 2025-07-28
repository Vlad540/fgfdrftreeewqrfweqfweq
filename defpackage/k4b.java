package defpackage;

import android.os.Handler;

/* renamed from: k4b  reason: default package */
public final class k4b implements nc7 {
    public static final k4b w0 = new k4b();
    public Handler X;
    public final pc7 Y = new pc7(this);
    public final eq6 Z = new eq6(27, this);
    public int a;
    public int b;
    public boolean c = true;
    public boolean o = true;

    public final pc7 R() {
        return this.Y;
    }

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i != 1) {
            return;
        }
        if (this.c) {
            this.Y.d(nb7.ON_RESUME);
            this.c = false;
            return;
        }
        this.X.removeCallbacks(this.Z);
    }
}
