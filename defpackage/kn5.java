package defpackage;

/* renamed from: kn5  reason: default package */
public final class kn5 extends an5 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ kn5(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [dd4, zhd] */
    public final void g(b1e b1e) {
        Object obj = this.c;
        switch (this.b) {
            case 0:
                try {
                    Object obj2 = ((q3e) obj).get();
                    if (obj2 != null) {
                        h15 h15 = i15.a;
                        th = (Throwable) obj2;
                        vw4.b(th, b1e);
                        return;
                    }
                    throw i15.b("Callable returned a null Throwable.");
                } catch (Throwable th) {
                    th = th;
                    ek8.a0(th);
                }
            case 1:
                b1e.e(new sn5(b1e, (Object[]) obj));
                return;
            case 2:
                ((nv9) obj).a(new un5(b1e));
                return;
            default:
                ((dhd) obj).k(new dd4(b1e));
                return;
        }
    }
}
