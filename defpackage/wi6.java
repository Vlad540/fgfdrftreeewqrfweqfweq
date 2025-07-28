package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: wi6  reason: default package */
public abstract class wi6 implements pg5 {
    public final String a;
    public final List b;
    public final boolean c;

    public wi6(String str, boolean z, List list) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
