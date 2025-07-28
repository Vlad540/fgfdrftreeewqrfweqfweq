package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* renamed from: t05  reason: default package */
public abstract class t05 extends ju3 {
    public static final /* synthetic */ int o = 0;
    public long a;
    public boolean b;
    public lr c;

    public final void S(boolean z) {
        this.a = (z ? 4294967296L : 1) + this.a;
        if (!z) {
            this.b = true;
        }
    }

    public final boolean U() {
        return this.a >= 4294967296L;
    }

    public final void d(boolean z) {
        long j = this.a - (z ? 4294967296L : 1);
        this.a = j;
        if (j <= 0 && this.b) {
            shutdown();
        }
    }

    public abstract long e0();

    public final ju3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    public final boolean m0() {
        lr lrVar = this.c;
        if (lrVar == null) {
            return false;
        }
        mi4 mi4 = (mi4) (lrVar.isEmpty() ? null : lrVar.j());
        if (mi4 == null) {
            return false;
        }
        mi4.run();
        return true;
    }

    public final void n(mi4 mi4) {
        lr lrVar = this.c;
        if (lrVar == null) {
            lrVar = new lr();
            this.c = lrVar;
        }
        lrVar.b(mi4);
    }

    public void n0(long j, q05 q05) {
        o74.w0.s0(j, q05);
    }

    public abstract Thread o();

    public abstract void shutdown();
}
