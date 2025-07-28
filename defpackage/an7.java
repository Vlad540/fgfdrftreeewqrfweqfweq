package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: an7  reason: default package */
public final class an7 extends ol implements qce {
    public final List X;
    public final boolean Y;
    public final String Z = an7.class.getName();
    public final boolean o;

    public an7(long j, List list, boolean z, boolean z2) {
        super(j);
        this.o = z;
        this.X = list;
        this.Y = z2;
    }

    public final void c(lbe lbe) {
        xs7.N(new zm7(this, (Continuation) null));
    }

    public final void d(uae uae) {
        xs7.N(new ym7(this, (Continuation) null));
    }

    public final ibe i() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        kb5 kb5 = (kb5) ((jb5) plVar.U.getValue());
        kb5.getClass();
        if (!kb5.m(PmsKey.f2analyticsenabled, true)) {
            return null;
        }
        return (bn7) xs7.M(bw4.a, new xm7(this, (Continuation) null));
    }
}
