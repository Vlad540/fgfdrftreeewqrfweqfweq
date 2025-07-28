package defpackage;

import android.content.res.Configuration;
import androidx.fragment.app.c;

/* renamed from: lx5  reason: default package */
public final /* synthetic */ class lx5 implements rf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ lx5(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                c cVar = this.b;
                if (cVar.N()) {
                    cVar.i(false, configuration);
                    return;
                }
                return;
            case 1:
                Integer num = (Integer) obj;
                c cVar2 = this.b;
                if (cVar2.N() && num.intValue() == 80) {
                    cVar2.m(false);
                    return;
                }
                return;
            case 2:
                ea9 ea9 = (ea9) obj;
                c cVar3 = this.b;
                if (cVar3.N()) {
                    cVar3.n(ea9.a, false);
                    return;
                }
                return;
            default:
                pua pua = (pua) obj;
                c cVar4 = this.b;
                if (cVar4.N()) {
                    cVar4.s(pua.a, false);
                    return;
                }
                return;
        }
    }
}
