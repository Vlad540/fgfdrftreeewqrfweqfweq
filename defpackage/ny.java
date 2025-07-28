package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: ny  reason: default package */
public final class ny {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;

    public ny(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978) {
        this.a = t972;
        this.b = t97;
        this.c = t973;
        this.d = t974;
        this.e = t976;
        this.f = t975;
        this.g = t977;
        this.h = t978;
    }

    public static Object b(ny nyVar, vo8 vo8, boolean z, Long l, int i, er3 er3, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            l = null;
        }
        return xs7.U(((pae) nyVar.d.getValue()).b(), new my(nyVar, vo8, (i2 & 8) != 0 ? 0 : i, l, z2, (Continuation) null), er3);
    }

    public final Context a() {
        return (Context) this.f.getValue();
    }
}
