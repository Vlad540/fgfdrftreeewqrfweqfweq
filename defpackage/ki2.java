package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: ki2  reason: default package */
public final class ki2 {
    public final pj5 a;
    public final pk b;
    public String c = null;
    public int d = 0;
    public final ContextScope e;
    public final ArrayList f;
    public hi2 g;
    public boolean h;
    public long i;
    public long j;
    public int k;

    public ki2(zi1 zi1, pk pkVar) {
        this.a = zi1;
        this.b = pkVar;
        n3e c2 = x87.c();
        ha4 ha4 = oi4.a;
        this.e = n1g.a(c2.plus(MainDispatcherLoader.dispatcher.getImmediate()));
        this.f = new ArrayList();
        this.h = true;
    }

    public final void a() {
        this.i = 0;
        this.k = 0;
        this.d = 0;
        this.f.clear();
        this.j = 0;
        this.c = null;
        this.h = true;
    }
}
