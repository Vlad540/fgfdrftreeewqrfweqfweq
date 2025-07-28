package defpackage;

/* renamed from: kic  reason: default package */
public final class kic implements g73, zhd, wx7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ kic(zv1 zv1, int i) {
        this.a = i;
        this.b = zv1;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                this.b.resumeWith(obj);
                return;
            default:
                this.b.resumeWith(obj);
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                this.b.resumeWith(jue.a);
                return;
            default:
                this.b.resumeWith((Object) null);
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                ((zv1) this.b).d(new e98(29, xi4));
                return;
            case 1:
                ((zv1) this.b).d(new e98(29, xi4));
                return;
            default:
                ((zv1) this.b).d(new e98(29, xi4));
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.resumeWith(new kcc(th));
                return;
            case 1:
                this.b.resumeWith(new kcc(th));
                return;
            default:
                this.b.resumeWith(new kcc(th));
                return;
        }
    }
}
