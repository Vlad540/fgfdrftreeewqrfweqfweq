package defpackage;

import java.util.List;

/* renamed from: lu  reason: default package */
public final class lu implements Runnable {
    public final /* synthetic */ mu X;
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable o;

    public lu(mu muVar, List list, List list2, int i, Runnable runnable) {
        this.X = muVar;
        this.a = list;
        this.b = list2;
        this.c = i;
        this.o = runnable;
    }

    public final void run() {
        this.X.c.execute(new p36((Object) this, (Object) iu7.e(new ku(this)), false, 2));
    }
}
