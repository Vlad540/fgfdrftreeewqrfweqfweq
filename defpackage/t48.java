package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* renamed from: t48  reason: default package */
public final class t48 {
    public final w38 a;
    public final cya b;
    public final a88 c;
    public final List d;
    public final CharSequence e;
    public final int f;
    public final int g;
    public final Bundle h;

    public t48() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = Collections.emptyList();
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = Bundle.EMPTY;
    }

    public t48(w38 w38, cya cya, a88 a88, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.a = w38;
        this.b = cya;
        this.c = a88;
        list.getClass();
        this.d = list;
        this.e = charSequence;
        this.f = i;
        this.g = i2;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public t48(t48 t48) {
        this.a = t48.a;
        this.b = t48.b;
        this.c = t48.c;
        this.d = t48.d;
        this.e = t48.e;
        this.f = t48.f;
        this.g = t48.g;
        this.h = t48.h;
    }
}
