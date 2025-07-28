package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: voa  reason: default package */
public final class voa implements noa, pp7 {
    public final t97 X;
    public final t97 Y;
    public final CopyOnWriteArraySet Z = new CopyOnWriteArraySet();
    public final Context a;
    public final tt0 b;
    public final g15 c;
    public final t97 o;
    public final AtomicInteger w0;
    public final grd x0;
    public final ContextScope y0;
    public boolean z0;

    public voa(Context context, t97 t97, t97 t972, t97 t973, tt0 tt0, pae pae, g15 g15) {
        this.a = context;
        this.b = tt0;
        this.c = g15;
        this.o = t97;
        this.X = t972;
        this.Y = t973;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.w0 = atomicInteger;
        grd a2 = hrd.a(Integer.valueOf(atomicInteger.get()));
        this.x0 = a2;
        ContextScope a3 = n1g.a(new s15(((n3a) pae).d().e(1, "phonebook", 1, 1)).plus(new qj(this)));
        this.y0 = a3;
        d();
        u09 u09 = new u09(a2, 13);
        int i = zp4.o;
        ez3.N(new ck5(vx3.M(u09, mt0.P(5, eq4.o)), new poa(this, (Continuation) null), 5), a3);
    }

    public static final ioa b(voa voa, ioa ioa, List list) {
        Object obj;
        voa.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (hhd.f(ioa.X, ((ioa) obj).X)) {
                break;
            }
        }
        return (ioa) obj;
    }

    public final void a() {
        n1g.c(this.y0, (CancellationException) null);
    }

    public final void c() {
        Object value;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "Phonebook", "call checkUpdates from: ".concat(jjd.Q(new RuntimeException())), (Throwable) null);
        }
        grd grd = this.x0;
        do {
            value = grd.getValue();
            ((Number) value).intValue();
        } while (!grd.b(value, Integer.valueOf(this.w0.incrementAndGet())));
    }

    public final void d() {
        if (!((qna) ((zz9) this.X.getValue()).a.getValue()).b(qna.f)) {
            udd.q("Phonebook", "subscribeOnSystemChanges: no permissions, return");
        } else if (!this.z0) {
            this.z0 = true;
            this.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new bx3(this, new Handler(Looper.getMainLooper())));
        }
    }
}
