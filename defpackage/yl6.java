package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: yl6  reason: default package */
public final class yl6 implements xi4, bm6 {
    public final bw9 X;
    public final AtomicBoolean Y = new AtomicBoolean();
    public long Z;
    public final t97 a;
    public final String b;
    public final File c;
    public final omc o;

    public yl6(bw9 bw9, r7e r7e, File file, omc omc) {
        this.a = r7e;
        this.b = "";
        this.c = file;
        this.o = omc;
        this.X = bw9;
    }

    public final void a() {
        if (!this.Y.get()) {
            this.o.b(new wl6(this, 1));
        }
    }

    public final void b() {
        if (!this.Y.get()) {
            this.o.b(new wl6(this, 0));
        }
    }

    public final void c(boolean z) {
        if (this.Y.compareAndSet(false, true)) {
            omc omc = this.o;
            if (!omc.h()) {
                omc.f();
            }
            if (z) {
                udd.q("zl6", "cancelDownload");
                ((em6) this.a.getValue()).a(this.c, (String) null);
            }
        }
    }

    public final void d() {
    }

    public final void e(File file) {
        if (!this.Y.get()) {
            this.o.b(new zo5(this, 3, file));
        }
    }

    public final void f() {
        c(true);
    }

    public final String getDownloadContext() {
        return this.c.getAbsolutePath();
    }

    public final boolean h() {
        return this.Y.get();
    }

    public final void j() {
        if (!this.Y.get()) {
            this.o.b(new wl6(this, 2));
        }
    }

    public final void k(float f, long j) {
        if (!this.Y.get()) {
            this.o.b(new xl6(this, f, j, 0));
        }
    }
}
