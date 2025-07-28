package defpackage;

/* renamed from: mo1  reason: default package */
public final class mo1 implements dd3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed3 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mo1(ed3 ed3, Object obj, int i) {
        this.a = i;
        this.b = ed3;
        this.c = obj;
    }

    private final void c() {
    }

    public final void a() {
        switch (this.a) {
            case 0:
                return;
            default:
                ed3 ed3 = this.b;
                if (ed3.f()) {
                    ed3.e(this);
                    ((yv1) this.c).resumeWith(jue.a);
                    return;
                }
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((a5b) ((d5b) this.c)).n(this.b.d() ? vye.a : vye.b);
                return;
            default:
                ed3 ed3 = this.b;
                if (ed3.f()) {
                    ed3.e(this);
                    ((yv1) this.c).resumeWith(jue.a);
                    return;
                }
                return;
        }
    }
}
