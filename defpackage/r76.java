package defpackage;

/* renamed from: r76  reason: default package */
public final class r76 {
    public volatile long a;
    public volatile long b;
    public final /* synthetic */ s76 c;

    public r76(s76 s76) {
        this.c = s76;
    }

    @a1e
    public final void onEvent(o92 o92) {
        if (o92.a == this.b) {
            udd.q("s76", "onEvent " + o92);
            this.c.d.makeCompleting$kotlinx_coroutines_core(this.c.c.y(this.a));
        }
    }
}
