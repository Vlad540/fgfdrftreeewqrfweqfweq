package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: td4  reason: default package */
public final class td4 implements mh9 {
    public final xwb a;
    public volatile mh9 b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public jy7 d = new jy7(1, (ema) null, true);
    public final sd4 e = new sd4(this);

    public td4(xwb xwb) {
        this.a = xwb;
    }

    public final void a(iy7 iy7) {
        this.c.remove(iy7);
    }

    public final void b(iy7 iy7) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (!copyOnWriteArrayList.contains(iy7)) {
            copyOnWriteArrayList.add(iy7);
            iy7.q(this.d);
        }
    }
}
