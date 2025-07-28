package defpackage;

/* renamed from: j5g  reason: default package */
public abstract class j5g implements Runnable {
    public final vde a;

    public j5g() {
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

    public j5g(vde vde) {
        this.a = vde;
    }
}
