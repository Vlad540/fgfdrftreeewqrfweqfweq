package defpackage;

/* renamed from: ys7  reason: default package */
public final /* synthetic */ class ys7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs7 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ys7(zs7 zs7, Object obj, int i) {
        this.a = i;
        this.b = zs7;
        this.c = obj;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ys7.super.c(this.c);
                return;
            case 1:
                zs7 zs7 = this.b;
                zs7.getClass();
                try {
                    ys7.super.d(this.c);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                zs7 zs72 = this.b;
                zs72.getClass();
                try {
                    ys7.super.f(this.c);
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
