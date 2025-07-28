package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: b0a  reason: default package */
public final class b0a implements pp7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ b0a(w4 w4Var, int i) {
        this.a = i;
        this.b = w4Var;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                SharedPreferences.Editor edit = ((jg8) km4.y0.n((Context) this.b.c(Context.class)).Y).s().edit();
                bk9.a.getClass();
                edit.putString("nightmode", y76.o(ak9.b));
                edit.apply();
                return;
            default:
                ((zz2) this.b.c(zz2.class)).b();
                return;
        }
    }
}
