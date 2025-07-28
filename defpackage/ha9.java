package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: ha9  reason: default package */
public final class ha9 implements p3e, Serializable {
    public final int a;

    public ha9(int i) {
        ete.l(i, "expectedValuesPerKey");
        this.a = i;
    }

    public final Object get() {
        return new ArrayList(this.a);
    }
}
