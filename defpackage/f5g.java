package defpackage;

/* renamed from: f5g  reason: default package */
public final class f5g extends m4g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f5g(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((f6g) this.c).f) {
                    try {
                        if (((f6g) this.c).k.get() <= 0 || ((f6g) this.c).k.decrementAndGet() <= 0) {
                            f6g f6g = (f6g) this.c;
                            if (f6g.m != null) {
                                f6g.b.b("Unbind from service.", new Object[0]);
                                f6g f6g2 = (f6g) this.c;
                                f6g2.a.unbindService(f6g2.l);
                                f6g f6g3 = (f6g) this.c;
                                f6g3.g = false;
                                f6g3.m = null;
                                f6g3.l = null;
                            }
                            ((f6g) this.c).c();
                            return;
                        }
                        ((f6g) this.c).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                a6g a6g = (a6g) this.c;
                f6g f6g4 = (f6g) a6g.b;
                f6g4.b.b("unlinkToDeath", new Object[0]);
                f6g4.m.asBinder().unlinkToDeath(f6g4.j, 0);
                f6g f6g5 = (f6g) a6g.b;
                f6g5.m = null;
                f6g5.g = false;
                return;
        }
    }
}
