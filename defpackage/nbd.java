package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: nbd  reason: default package */
public final class nbd implements pf4 {
    public static final t97 h = ez3.O(3, new vfc(23));
    public final t97 a;
    public final t97 b;
    public final ContextScope c;
    public int d;
    public boolean e;
    public qod f;
    public final t0c g;

    public nbd(t97 t97, t97 t972) {
        this.a = t972;
        this.b = t97;
        long nanoTime = System.nanoTime();
        this.c = n1g.a(((pae) t972.getValue()).a());
        this.g = new t0c(hrd.a(Collections.singletonList(new z14(nanoTime, new hge(mtb.oneme_settings_send_logs), phc.c, (mge) null, (n06) null, 24))));
    }

    public final zqd c() {
        return this.g;
    }

    public final void d(z14 z14) {
        qod qod = this.f;
        if (qod == null || !qod.isActive()) {
            this.f = xs7.E(this.c, ((pae) this.a.getValue()).b(), (ru3) null, new mbd(this, (Continuation) null), 2);
            return;
        }
        hba hba = (hba) ff4.a.getAccessor().c(hba.class);
        hba.i("Логи уже скачиваются");
        if (this.e) {
            List list = (List) h.getValue();
            int i = this.d;
            if (i > 3) {
                i = 3;
            }
            hba.b((CharSequence) list.get(i));
        }
        hba.j();
        this.d++;
    }
}
