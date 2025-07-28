package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: dcc  reason: default package */
public final class dcc implements e3d, pp7 {
    public final String X = "RestoreScheduledTaskExecutor";
    public final t97 a;
    public final t97 b;
    public final ContextScope c;
    public final grd o = hrd.a(0);

    public dcc(t97 t97, t97 t972, pae pae, ku3 ku3) {
        this.a = t97;
        this.b = t972;
        this.c = n1g.a(((n3a) pae).a().limitedParallelism(1, "restore-tasks-on-connect").plus(ku3));
    }

    public final void a() {
    }

    public final void c(int i) {
        this.o.m((Object) null, Integer.valueOf(i));
    }
}
