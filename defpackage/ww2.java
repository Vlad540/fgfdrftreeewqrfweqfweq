package defpackage;

/* renamed from: ww2  reason: default package */
public final class ww2 extends t37 implements vw2 {
    public final yw2 b;

    public ww2(yw2 yw2) {
        this.b = yw2;
    }

    public final boolean a(Throwable th) {
        i47 i47 = this.a;
        if (i47 == null) {
            i47 = null;
        }
        return i47.childCancelled(th);
    }

    public final boolean c() {
        return true;
    }

    public final void d(Throwable th) {
        i47 i47 = this.a;
        if (i47 == null) {
            i47 = null;
        }
        this.b.parentCancelled(i47);
    }

    public final g37 getParent() {
        i47 i47 = this.a;
        if (i47 != null) {
            return i47;
        }
        return null;
    }
}
