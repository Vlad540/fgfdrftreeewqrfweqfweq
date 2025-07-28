package defpackage;

/* renamed from: lx4  reason: default package */
public final /* synthetic */ class lx4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx4 b;

    public /* synthetic */ lx4(xx4 xx4, int i) {
        this.a = i;
        this.b = xx4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                xx4 xx4 = this.b;
                ct0.a(xx4.a(), new ea6(13, xx4), xx4.h);
                return;
            case 1:
                xx4 xx42 = this.b;
                xx42.h.execute(new lx4(xx42, 2));
                return;
            case 2:
                xx4 xx43 = this.b;
                if (xx43.v) {
                    xx43.w = null;
                    xx43.j();
                    xx43.v = false;
                    return;
                }
                return;
            case 3:
                xx4 xx44 = this.b;
                int t = hr1.t(xx44.D);
                if (t == 1) {
                    xx44.g();
                    return;
                } else if (t == 6 || t == 8) {
                    throw new IllegalStateException("Encoder is released");
                } else {
                    return;
                }
            case 4:
                xx4 xx45 = this.b;
                switch (hr1.t(xx45.D)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        xx45.f();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        xx45.i(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(me4.r(xx45.D)));
                }
            default:
                xx4 xx46 = this.b;
                xx46.A = true;
                if (xx46.z) {
                    xx46.e.stop();
                    xx46.h();
                    return;
                }
                return;
        }
    }
}
