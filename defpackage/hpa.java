package defpackage;

/* renamed from: hpa  reason: default package */
public final class hpa extends oy {
    public final t97 c;
    public vw d;

    public hpa(o10 o10, r7e r7e) {
        super(o10);
        this.c = r7e;
    }

    public final void a() {
        b(this.d, new Throwable("cancelled"));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [l7c, java.lang.Object] */
    public final ms9 d() {
        ms9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        ? obj = new Object();
        vw vwVar = this.d;
        obj.a = vwVar;
        if (vwVar != null) {
            return vwVar;
        }
        vw vwVar2 = new vw();
        this.d = vwVar2;
        obj.a = vwVar2;
        ((xq6) this.c.getValue()).a(this.a.b.a(), new mn(this, obj, false, 27));
        return (ms9) obj.a;
    }
}
