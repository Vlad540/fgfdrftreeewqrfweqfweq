package defpackage;

/* renamed from: ed8  reason: default package */
public final /* synthetic */ class ed8 implements ld8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ md8 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ed8(md8 md8, long j, int i) {
        this.a = i;
        this.b = md8;
        this.c = j;
    }

    public final void b(ic8 ic8) {
        switch (this.a) {
            case 0:
                this.b.f.s.Z((int) this.c);
                return;
            default:
                this.b.f.s.seekTo(this.c);
                return;
        }
    }
}
