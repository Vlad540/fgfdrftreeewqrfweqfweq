package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;

/* renamed from: yz7  reason: default package */
public final class yz7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ i08 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yz7(i08 i08, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = i08;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yz7) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yz7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        i08 i08 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((b29) i08.c.getValue()).a(this.Z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj;
        if (vo8 == null) {
            return jue;
        }
        CharSequence charSequence = i08.q(i08).f.k;
        ((wk7) i08.o.getValue()).f.k = null;
        ArrayList d = i08.r().d();
        pwc r = i08.r();
        r.getClass();
        boolean z = false;
        int size = vo8.m() ? ek8.s((List) vo8.D0.a, new lpa(25)).size() : 0;
        CopyOnWriteArraySet copyOnWriteArraySet = r.a;
        if (size == copyOnWriteArraySet.size()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rwc rwc = (rwc) it.next();
                boolean z2 = rwc.f;
                tk7 tk7 = rwc.a;
                if (!z2) {
                    if (tk7 instanceof mz) {
                        break;
                    }
                }
                if (!kpa.b(rwc.c, tk7)) {
                    if (!(tk7 instanceof mz)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        taf.o(i08.A0, new pz7(charSequence, d, z));
        vy7 vy7 = new vy7(true);
        this.X = 2;
        return i08.x0.o(vy7, this) == pu3 ? pu3 : jue;
    }
}
