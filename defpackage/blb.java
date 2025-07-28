package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: blb  reason: default package */
public final class blb implements ls9 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ blb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b(Throwable th) {
    }

    private final void c(Throwable th) {
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((rf3) this.b).accept(obj);
                return;
            case 1:
                ((y5c) this.b).b.v((Boolean) obj);
                return;
            default:
                ua0 ua0 = (ua0) obj;
                if (ua0 != null) {
                    h2f h2f = (h2f) this.b;
                    if (h2f.v != 3) {
                        Objects.toString(h2f.r);
                        ua0.toString();
                        ua0 ua02 = h2f.r;
                        h2f.r = ua0;
                        va0 va0 = h2f.g;
                        va0.getClass();
                        int i = ua02.a;
                        Set set = ua0.e;
                        boolean contains = set.contains(Integer.valueOf(i));
                        int i2 = ua0.a;
                        if ((contains || set.contains(Integer.valueOf(i2)) || i == i2) && (!h2f.z || ua02.c == null || ua0.c != null)) {
                            int i3 = ua02.a;
                            if ((i3 != -1 && i2 == -1) || (i3 == -1 && i2 != -1)) {
                                h2f.H(h2f.s, ua0, va0);
                                ArrayList arrayList = new ArrayList(1);
                                Object obj2 = new Object[]{h2f.s.c()}[0];
                                Objects.requireNonNull(obj2);
                                arrayList.add(obj2);
                                h2f.E(Collections.unmodifiableList(arrayList));
                                h2f.q();
                                return;
                            } else if (ua02.b != ua0.b) {
                                h2f.H(h2f.s, ua0, va0);
                                ArrayList arrayList2 = new ArrayList(1);
                                Object obj3 = new Object[]{h2f.s.c()}[0];
                                Objects.requireNonNull(obj3);
                                arrayList2.add(obj3);
                                h2f.E(Collections.unmodifiableList(arrayList2));
                                Iterator it = h2f.a.iterator();
                                while (it.hasNext()) {
                                    ((lye) it.next()).i(h2f);
                                }
                                return;
                            } else {
                                return;
                            }
                        } else {
                            h2f.N();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                k96 k96 = ((y5c) this.b).b;
                k96.getClass();
                k96.v(new ta0(th));
                return;
            default:
                return;
        }
    }
}
