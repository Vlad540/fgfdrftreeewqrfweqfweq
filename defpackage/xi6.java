package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: xi6  reason: default package */
public abstract class xi6 implements qg5 {
    public final String a;
    public final List b;
    public final boolean c;

    public xi6(String str, boolean z, List list) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
