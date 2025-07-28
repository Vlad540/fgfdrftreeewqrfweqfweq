package defpackage;

import android.os.Bundle;

/* renamed from: ho3  reason: default package */
public final class ho3 implements z24 {
    public final /* synthetic */ int a;
    public final t97 b;

    public /* synthetic */ ho3(int i, t97 t97) {
        this.a = i;
        this.b = t97;
    }

    public final g34 a() {
        switch (this.a) {
            case 0:
                return io3.b;
            default:
                return (bs7) this.b.getValue();
        }
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        i iVar;
        switch (this.a) {
            case 0:
                if (!io3.b.a.contains(c34)) {
                    return null;
                }
                if (c34.equals(io3.c)) {
                    iVar = new i(9);
                } else if (c34.equals(io3.d)) {
                    iVar = new eo3(0, this);
                } else if (c34.equals(io3.e)) {
                    return new j34(str, c34, bundle, 0, (h34) null, new i(10), 24);
                } else {
                    throw new IllegalStateException(hr1.f("unknown route ", c34));
                }
                return new j34(str, c34, bundle, 3, (h34) null, iVar, 16);
            default:
                if (!((bs7) this.b.getValue()).a.contains(c34)) {
                    return null;
                }
                bs7.b.getClass();
                if (c34.equals(bs7.c) || c34.equals(bs7.d) || c34.equals(bs7.e) || c34.equals(bs7.f)) {
                    return new j34(str, c34, bundle, 0, (h34) null, new as7(c34, bundle), 24);
                }
                throw new IllegalStateException(hr1.f("unknown route ", c34));
        }
    }
}
