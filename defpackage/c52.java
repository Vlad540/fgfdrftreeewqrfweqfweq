package defpackage;

/* renamed from: c52  reason: default package */
public final /* synthetic */ class c52 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t52 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ c52(t52 t52, long j, long j2, int i) {
        this.a = i;
        this.b = t52;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.i0(this.c, this.d);
                return;
            default:
                t52 t52 = this.b;
                p62 z = t52.z(this.c);
                t52.j0(z.b, z.c, this.d);
                return;
        }
    }
}
