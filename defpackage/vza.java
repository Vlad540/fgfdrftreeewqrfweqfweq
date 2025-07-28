package defpackage;

import java.util.ArrayList;

/* renamed from: vza  reason: default package */
public final /* synthetic */ class vza implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wza b;

    public /* synthetic */ vza(wza wza, int i) {
        this.a = i;
        this.b = wza;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                t66 t66 = this.b.b;
                return t66 != null ? t66.c() : gwf.b;
            case 1:
                return ete.q(this.b.b != null ? new ArrayList(0) : null);
            default:
                wza wza = this.b;
                return Integer.valueOf(vx3.x(wza, (syc[]) wza.j.getValue()));
        }
    }
}
