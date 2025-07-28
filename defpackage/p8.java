package defpackage;

import android.view.View;

/* renamed from: p8  reason: default package */
public final /* synthetic */ class p8 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pda b;

    public /* synthetic */ p8(int i, pda pda) {
        this.a = i;
        this.b = pda;
    }

    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof mhe) {
                    h2g.c(view, this.b);
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                h2g.c((View) obj, this.b);
                return jue.a;
            case 2:
                pda pda = (pda) obj;
                return Integer.valueOf(this.b.getIcon().g);
            default:
                pda pda2 = (pda) obj;
                return Integer.valueOf(this.b.b().j);
        }
    }
}
