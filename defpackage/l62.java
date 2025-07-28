package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: l62  reason: default package */
public final class l62 {
    public final String a;
    public final String b;
    public final List c;
    public final long d;
    public final boolean e;

    public l62(w7 w7Var) {
        this.a = (String) w7Var.c;
        this.b = (String) w7Var.d;
        List list = (List) w7Var.e;
        this.c = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.d = w7Var.a;
        this.e = w7Var.b;
    }
}
