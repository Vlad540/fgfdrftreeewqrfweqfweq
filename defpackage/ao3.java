package defpackage;

import android.view.View;

/* renamed from: ao3  reason: default package */
public final /* synthetic */ class ao3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ b7c o;

    public /* synthetic */ ao3(b7c b7c, un3 un3, boolean z, int i) {
        this.a = i;
        this.o = b7c;
        this.b = un3;
        this.c = z;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bo3 bo3 = (bo3) this.o;
                sn3 sn3 = bo3.J0;
                int i = this.b.a;
                sn3.w(i);
                bo3.K0.a(xs7.R(i), 1, this.c ? 1 : 2);
                return;
            default:
                po3 po3 = (po3) this.o;
                sn3 sn32 = po3.J0;
                int i2 = this.b.a;
                sn32.w(i2);
                po3.K0.a(xs7.R(i2), 2, this.c ? 1 : 2);
                return;
        }
    }
}
