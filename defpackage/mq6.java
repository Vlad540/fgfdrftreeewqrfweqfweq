package defpackage;

import java.util.List;

/* renamed from: mq6  reason: default package */
public final class mq6 {
    public static final t97 d = ez3.O(1, new fs5(13));
    public int a;
    public List b;
    public final n84 c = new n84();

    public mq6() {
        a();
    }

    public final void a() {
        this.a = this.c.a;
        List<kq6> list = this.b;
        if (list != null) {
            for (kq6 b2 : list) {
                this.a = Math.max(this.a, b2.b());
            }
        }
    }
}
