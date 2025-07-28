package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: qib  reason: default package */
public final /* synthetic */ class qib implements tx9, r3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qib(int i, Context context, boolean z) {
        this.a = i;
        this.b = context;
        this.c = z;
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        SharedPreferences.Editor edit = udd.B(this.b).edit();
        edit.putBoolean("proxy_retention", this.c);
        edit.apply();
    }

    public Object get() {
        switch (this.a) {
            case 1:
                return dhe.r(this.b, false, this.c);
            case 2:
                return dhe.r(this.b, true, this.c);
            default:
                return dhe.t(this.b, this.c);
        }
    }
}
