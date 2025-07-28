package defpackage;

/* renamed from: vgc  reason: default package */
public final class vgc {
    public final rr3 a;
    public String b;
    public wr3 c;
    public wr3 d;
    public boolean e;
    public int f;

    public vgc(rr3 rr3, String str, wr3 wr3, wr3 wr32, boolean z, int i) {
        this.a = rr3;
        this.b = str;
        this.c = wr3;
        this.d = wr32;
        this.e = z;
        this.f = i;
    }

    public final void a(wr3 wr3) {
        if (!this.e) {
            this.d = wr3;
            return;
        }
        throw new RuntimeException(vgc.class.getSimpleName().concat("s can not be modified after being added to a Router."));
    }

    public final wr3 b() {
        wr3 overriddenPushHandler = this.a.getOverriddenPushHandler();
        return overriddenPushHandler == null ? this.c : overriddenPushHandler;
    }

    public final void c(wr3 wr3) {
        if (!this.e) {
            this.c = wr3;
            return;
        }
        throw new RuntimeException(vgc.class.getSimpleName().concat("s can not be modified after being added to a Router."));
    }

    public final void d(String str) {
        if (!this.e) {
            this.b = str;
            return;
        }
        throw new RuntimeException(vgc.class.getSimpleName().concat("s can not be modified after being added to a Router."));
    }
}
