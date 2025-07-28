package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: yja  reason: default package */
public final class yja implements ue1 {
    public final /* synthetic */ int a;
    public final Object b;

    public yja() {
        this.a = 0;
        this.b = new CopyOnWriteArraySet();
    }

    private final void a(re1 re1) {
    }

    private final void b(se1 se1) {
    }

    private final void c(te1 te1) {
    }

    public final void onCallParticipantsAdded(qe1 qe1) {
        switch (this.a) {
            case 0:
                if (!qe1.b.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((ue1) it.next()).onCallParticipantsAdded(qe1);
                    }
                    return;
                }
                return;
            default:
                nu7 nu7 = (nu7) this.b;
                if (!((gx0) nu7.a).s() && !((gx0) nu7.a).t1.i().isEmpty()) {
                    gx0 gx0 = (gx0) nu7.a;
                    gx0.B(gx0.C1.f);
                    return;
                }
                return;
        }
    }

    public final void onCallParticipantsChanged(re1 re1) {
        switch (this.a) {
            case 0:
                if (!re1.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((ue1) it.next()).onCallParticipantsChanged(re1);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onCallParticipantsDeAnonimized(se1 se1) {
        switch (this.a) {
            case 0:
                if (!se1.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((ue1) it.next()).onCallParticipantsDeAnonimized(se1);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onCallParticipantsRemoved(te1 te1) {
        switch (this.a) {
            case 0:
                if (!te1.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((ue1) it.next()).onCallParticipantsRemoved(te1);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public yja(nu7 nu7) {
        this.a = 1;
        this.b = nu7;
    }
}
