package defpackage;

/* renamed from: d47  reason: default package */
public final class d47 extends t37 {
    public final /* synthetic */ int b;
    public final zvc c;
    public final /* synthetic */ i47 o;

    public /* synthetic */ d47(i47 i47, zvc zvc, int i) {
        this.b = i;
        this.o = i47;
        this.c = zvc;
    }

    public final boolean c() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                i47 i47 = this.o;
                Object state$kotlinx_coroutines_core = i47.getState$kotlinx_coroutines_core();
                if (!(state$kotlinx_coroutines_core instanceof r73)) {
                    state$kotlinx_coroutines_core = j47.a(state$kotlinx_coroutines_core);
                }
                ((yvc) this.c).g(i47, state$kotlinx_coroutines_core);
                return;
            default:
                ((yvc) this.c).g(this.o, jue.a);
                return;
        }
    }
}
