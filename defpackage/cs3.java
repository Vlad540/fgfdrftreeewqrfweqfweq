package defpackage;

/* renamed from: cs3  reason: default package */
public final class cs3 implements vr3 {
    public final String a;
    public final s16 b;
    public final s16 c;

    public cs3(String str, gq0 gq0, gq0 gq02) {
        this.a = str;
        this.b = gq0;
        this.c = gq02;
    }

    public final void a(rr3 rr3, rr3 rr32, boolean z) {
        if (hhd.f(rr3 != null ? rr3.getInstanceId() : null, this.a) && z) {
            this.b.invoke();
        }
    }

    public final void b(rr3 rr3, rr3 rr32, boolean z) {
        if (hhd.f(rr32 != null ? rr32.getInstanceId() : null, this.a) && !z) {
            this.c.invoke();
        }
    }
}
