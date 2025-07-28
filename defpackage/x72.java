package defpackage;

/* renamed from: x72  reason: default package */
public final class x72 {
    public final /* synthetic */ b92 a;

    public x72(b92 b92) {
        this.a = b92;
    }

    @a1e
    public final void onEvent(to7 to7) {
        String str = b92.O0;
        udd.q(str + "/bus", "LoginEvent");
        b92 b92 = this.a;
        qod qod = b92.C0;
        if (qod != null && qod.isCancelled()) {
            b92.i();
        }
        c97 c97 = b92.E0;
        if (c97 != null && c97.h()) {
            b92.h();
        }
    }
}
