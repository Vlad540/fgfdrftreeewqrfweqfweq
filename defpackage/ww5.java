package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ww5  reason: default package */
public final class ww5 implements sac {
    public final ArrayList a;

    public ww5(Set set) {
        if (set == null) {
            this.a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.a = arrayList;
        for (Object next : set) {
            if (next != null) {
                arrayList.add(next);
            }
        }
    }

    public final void a(z4b z4b, String str, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).a(z4b, str, map);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void b(z4b z4b) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).b(z4b);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    public final void c(z4b z4b) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).c(z4b);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    public final void d(z4b z4b, String str, Throwable th, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).d(z4b, str, th, map);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    public final void e(z4b z4b, String str, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).e(z4b, str, z);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void f(z4b z4b, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).f(z4b, th);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    public final void g(z4b z4b) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).g(z4b);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    public final void h(z4b z4b) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).h(z4b);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public final boolean i(z4b z4b, String str) {
        ArrayList arrayList = this.a;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((sac) it.next()).i(z4b, str)) {
                return true;
            }
        }
        return false;
    }

    public final void j(z4b z4b, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).j(z4b, str);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    public final void k(z4b z4b, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((sac) it.next()).k(z4b, str);
            } catch (Exception e) {
                m75.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }
}
