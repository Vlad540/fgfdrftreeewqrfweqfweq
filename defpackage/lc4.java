package defpackage;

/* renamed from: lc4  reason: default package */
public final /* synthetic */ class lc4 implements i4f {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc4 b;
    public final /* synthetic */ jn c;

    public /* synthetic */ lc4(rc4 rc4, jn jnVar, int i) {
        this.a = i;
        this.b = rc4;
        this.c = jnVar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c, true);
                return;
            default:
                this.b.a(this.c, false);
                return;
        }
    }
}
