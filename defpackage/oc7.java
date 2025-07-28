package defpackage;

/* renamed from: oc7  reason: default package */
public final class oc7 {
    public ob7 a;
    public dc7 b;

    public final void a(nc7 nc7, nb7 nb7) {
        ob7 a2 = nb7.a();
        ob7 ob7 = this.a;
        if (a2.compareTo(ob7) < 0) {
            ob7 = a2;
        }
        this.a = ob7;
        this.b.m(nc7, nb7);
        this.a = a2;
    }
}
