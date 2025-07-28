package defpackage;

import android.os.Bundle;
import androidx.fragment.app.c;

/* renamed from: ox5  reason: default package */
public final class ox5 implements dc7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ yx5 b;
    public final /* synthetic */ pc7 c;
    public final /* synthetic */ c o;

    public ox5(c cVar, String str, yx5 yx5, pc7 pc7) {
        this.o = cVar;
        this.a = str;
        this.b = yx5;
        this.c = pc7;
    }

    public final void m(nc7 nc7, nb7 nb7) {
        Bundle bundle;
        nb7 nb72 = nb7.ON_START;
        c cVar = this.o;
        String str = this.a;
        if (nb7 == nb72 && (bundle = (Bundle) cVar.l.get(str)) != null) {
            this.b.b(str, bundle);
            cVar.l.remove(str);
        }
        if (nb7 == nb7.ON_DESTROY) {
            this.c.f(this);
            cVar.m.remove(str);
        }
    }
}
