package defpackage;

/* renamed from: m4g  reason: default package */
public abstract class m4g implements Runnable {
    public final vde a;

    public m4g() {
        this.a = null;
    }

    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (Exception e) {
            vde vde = this.a;
            if (vde != null) {
                vde.c(e);
            }
        }
    }

    public m4g(vde vde) {
        this.a = vde;
    }
}
