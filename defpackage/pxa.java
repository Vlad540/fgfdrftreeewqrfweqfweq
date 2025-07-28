package defpackage;

import android.content.Context;
import android.view.MenuItem;
import androidx.fragment.app.a;

/* renamed from: pxa  reason: default package */
public final class pxa extends b97 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pxa(Object obj, int i, Object obj2) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        zaf n;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(pxa.super.onOptionsItemSelected((MenuItem) this.c));
            case 1:
                return Boolean.valueOf(pxa.super.shouldShowRequestPermissionRationale((String) this.c));
            case 2:
                cbf cbf = (cbf) ((t97) this.c).getValue();
                le6 le6 = cbf instanceof le6 ? (le6) cbf : null;
                return (le6 == null || (n = le6.n()) == null) ? ((a) this.b).n() : n;
            case 3:
                return ((hnc) this.b).c((Class) this.c);
            default:
                return new dp4(ng5.N(ng5.N(((Context) this.b).getCacheDir(), "tracer-lite-".concat((String) this.c)), "drops.json"));
        }
    }
}
