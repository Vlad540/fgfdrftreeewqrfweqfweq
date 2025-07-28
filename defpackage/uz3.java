package defpackage;

/* renamed from: uz3  reason: default package */
public final class uz3 implements o3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uz3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return wx3.o((Throwable) this.b);
            case 1:
                sh4 sh4 = (sh4) this.b;
                sh4.j.getClass();
                return sh4.j.getApplicationContext().getCacheDir();
            case 2:
                return ((mg5) ((t97) this.b).getValue()).m();
            default:
                return this.b;
        }
    }

    public uz3() {
        this.a = 0;
        this.b = n0.n;
    }
}
