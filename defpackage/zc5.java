package defpackage;

import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: zc5  reason: default package */
public final /* synthetic */ class zc5 implements j6 {
    public final /* synthetic */ ad5 a;
    public final /* synthetic */ o10 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xm8 d;

    public /* synthetic */ zc5(ad5 ad5, o10 o10, boolean z, xm8 xm8) {
        this.a = ad5;
        this.b = o10;
        this.c = z;
        this.d = xm8;
    }

    public final void run() {
        ad5 ad5 = this.a;
        if (ad5.a()) {
            mg5 mg5 = ad5.g;
            o10 o10 = this.b;
            mg5.h(o10).getAbsolutePath();
            boolean z = this.c;
            FrgBase frgBase = ad5.c;
            if (!z || frgBase == null || (!ete.J(o10) && !ete.L(o10))) {
                xie.z(ad5.a, this.d, o10, ((nqc) ad5.b).n(), ((k93) frgBase.t1.b).h());
            }
        }
    }
}
