package defpackage;

import java.util.function.Predicate;

/* renamed from: dsc  reason: default package */
public final /* synthetic */ class dsc implements Predicate {
    public final /* synthetic */ gsc a;
    public final /* synthetic */ String b;

    public /* synthetic */ dsc(gsc gsc, String str) {
        this.a = gsc;
        this.b = str;
    }

    public final boolean test(Object obj) {
        String str = (String) obj;
        gsc gsc = this.a;
        gsc.getClass();
        return !r1g.p(str) && gsc.h(str, this.b);
    }
}
