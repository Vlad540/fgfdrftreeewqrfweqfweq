package defpackage;

/* renamed from: z5g  reason: default package */
public final class z5g extends j5g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z5g(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((r6g) this.c).f) {
                    try {
                        if (((r6g) this.c).k.get() > 0) {
                            if (((r6g) this.c).k.decrementAndGet() > 0) {
                                ((r6g) this.c).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                                return;
                            }
                        }
                        r6g r6g = (r6g) this.c;
                        if (r6g.m != null) {
                            r6g.b.b("Unbind from service.", new Object[0]);
                            r6g r6g2 = (r6g) this.c;
                            r6g2.a.unbindService(r6g2.l);
                            r6g r6g3 = (r6g) this.c;
                            r6g3.g = false;
                            r6g3.m = null;
                            r6g3.l = null;
                        }
                        ((r6g) this.c).d();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                a6g a6g = (a6g) this.c;
                r6g r6g4 = (r6g) a6g.b;
                r6g4.b.b("unlinkToDeath", new Object[0]);
                r6g4.m.asBinder().unlinkToDeath(r6g4.j, 0);
                r6g r6g5 = (r6g) a6g.b;
                r6g5.m = null;
                r6g5.g = false;
                return;
        }
    }
}
