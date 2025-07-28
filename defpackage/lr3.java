package defpackage;

import android.content.Intent;

/* renamed from: lr3  reason: default package */
public final /* synthetic */ class lr3 implements tgc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Cloneable d;

    public /* synthetic */ lr3(rr3 rr3, Cloneable cloneable, int i, int i2) {
        this.a = i2;
        this.b = rr3;
        this.d = cloneable;
        this.c = i;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                rr3 rr3 = this.b;
                rr3.router.U(rr3.instanceId, (Intent) this.d, this.c);
                return;
            default:
                rr3 rr32 = this.b;
                rr32.router.M(rr32.instanceId, (String[]) this.d, this.c);
                return;
        }
    }
}
