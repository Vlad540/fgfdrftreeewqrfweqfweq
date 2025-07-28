package defpackage;

/* renamed from: jx7  reason: default package */
public final class jx7 extends ax7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ jx7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void g(wx7 wx7) {
        switch (this.a) {
            case 0:
                ((dhd) this.b).k(new ix7(wx7, (v1b) this.c, 0));
                return;
            case 1:
                ((ay7) this.b).a(new mx7(wx7, (j26) this.c, 0));
                return;
            default:
                ((dhd) this.b).k(new mx7(wx7, (j26) this.c, 1));
                return;
        }
    }
}
