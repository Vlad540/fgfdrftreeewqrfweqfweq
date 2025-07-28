package defpackage;

import java.util.Collections;
import one.me.devmenu.TestCrash;

/* renamed from: wz0  reason: default package */
public final class wz0 implements pf4 {
    public final /* synthetic */ int a;
    public final Object b;

    public wz0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = hrd.a(Collections.singletonList(new z14(System.nanoTime(), new lge("Test crash"), zhc.i, new lge("Тестовый креш для отправки в tracer"), (n06) null, 16)));
                return;
            case 2:
                this.b = new t0c(hrd.a(hw4.a));
                return;
            default:
                this.b = hrd.a(Collections.singletonList(new z14(0, new lge("125.1.0.48.1"), unb.ic_statusbar_call_24, new lge("Версия SDK Звонков"), (n06) null, 16)));
                return;
        }
    }

    private final void e(z14 z14) {
    }

    private final void f(z14 z14) {
    }

    public final zqd c() {
        switch (this.a) {
            case 0:
                return (grd) this.b;
            case 1:
                return (grd) this.b;
            default:
                return (t0c) this.b;
        }
    }

    public final void d(z14 z14) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                throw new TestCrash();
            default:
                return;
        }
    }
}
