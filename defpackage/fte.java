package defpackage;

import android.view.WindowManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: fte  reason: default package */
public final class fte implements q4f, of3, tx9, kx9, gx9 {
    public Object a;

    public /* synthetic */ fte(Object obj) {
        this.a = obj;
    }

    public void a(Object obj) {
        ((CountDownLatch) this.a).countDown();
    }

    public void accept(Object obj) {
        u16 u16 = ((cia) this.a).f;
        u16.invoke("error occurred: " + ((Throwable) obj));
    }

    public void b(xle xle) {
        xle.c(((WindowManager) this.a).getDefaultDisplay());
    }

    public void c() {
    }

    public void d() {
        ((CountDownLatch) this.a).countDown();
    }

    public void onFailure(Exception exc) {
        ((CountDownLatch) this.a).countDown();
    }

    public /* synthetic */ fte(vbe vbe) {
        t4g t4g = new t4g(vbe);
        this.a = a1g.a(new rbf(a1g.a(new ul7(a1g.a(new j1c(t4g, 16, a1g.a(new qqe(t4g)))), a1g.a(new c9(29, t4g)), t4g))));
    }

    public /* synthetic */ fte() {
        this.a = new CountDownLatch(1);
    }
}
