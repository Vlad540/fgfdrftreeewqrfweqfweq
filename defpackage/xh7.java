package defpackage;

/* renamed from: xh7  reason: default package */
public abstract class xh7 {
    public final cw9 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ yh7 o;

    public xh7(yh7 yh7, cw9 cw9) {
        this.o = yh7;
        this.a = cw9;
    }

    public final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            int i = z ? 1 : -1;
            yh7 yh7 = this.o;
            int i2 = yh7.c;
            yh7.c = i + i2;
            if (!yh7.d) {
                yh7.d = true;
                while (true) {
                    try {
                        int i3 = yh7.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            yh7.g();
                        } else if (z3) {
                            yh7.h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        yh7.d = false;
                        throw th;
                    }
                }
                yh7.d = false;
            }
            if (this.b) {
                yh7.c(this);
            }
        }
    }

    public void b() {
    }

    public boolean c(nc7 nc7) {
        return false;
    }

    public abstract boolean d();
}
