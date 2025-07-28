package defpackage;

/* renamed from: nx7  reason: default package */
public final class nx7 extends n2 {
    public final /* synthetic */ int b;
    public final j26 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx7(ay7 ay7, j26 j26, int i) {
        super(ay7);
        this.b = i;
        this.c = j26;
    }

    public final void g(wx7 wx7) {
        switch (this.b) {
            case 0:
                this.a.a(new bx7(wx7, this.c));
                return;
            default:
                this.a.a(new i73(wx7, 1, this.c));
                return;
        }
    }
}
