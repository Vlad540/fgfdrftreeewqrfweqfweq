package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: tb7  reason: default package */
public final class tb7 {
    public final pc7 a;
    public final ob7 b;
    public final hi4 c;
    public final y73 d;

    public tb7(pc7 pc7, ob7 ob7, hi4 hi4, g37 g37) {
        this.a = pc7;
        this.b = ob7;
        this.c = hi4;
        y73 y73 = new y73(this, 1, g37);
        this.d = y73;
        if (pc7.d == ob7.a) {
            g37.cancel((CancellationException) null);
            a();
            return;
        }
        pc7.a(y73);
    }

    public final void a() {
        this.a.f(this.d);
        hi4 hi4 = this.c;
        hi4.b = true;
        hi4.a();
    }
}
