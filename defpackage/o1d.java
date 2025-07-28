package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.tamtam.util.HandledException;

/* renamed from: o1d  reason: default package */
public final class o1d extends c0d {
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final luf w0;

    public o1d(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, luf luf) {
        this.b = t97;
        this.c = t972;
        this.o = t973;
        this.X = t974;
        this.Y = t975;
        this.Z = t976;
        this.w0 = luf;
    }

    public static void y(luf luf) {
        luf.a(new o1d(luf.a, luf.d, luf.b, luf.e, luf.f, luf.g, luf));
    }

    public final void x() {
        ArrayList arrayList;
        HashSet hashSet;
        Iterator it;
        boolean z;
        int i;
        boolean z2;
        t97 t97 = this.o;
        t97 t972 = this.b;
        try {
            if (!((ed3) this.X.getValue()).f()) {
                udd.q("o1d", "Can't process transmit task because not connected to network");
                return;
            }
            udd.q("o1d", "Start process transmit task");
            boolean z3 = true;
            try {
                arrayList = ((jee) t972.getValue()).l();
            } catch (Exception e) {
                int k = ((jee) t972.getValue()).k();
                udd.p("o1d", "process: selectWaitingAndFailedTaskCount count=%d", new Object[]{Integer.valueOf(k)});
                ((g15) t97.getValue()).c(new Exception("Exception during selectWaitingAndFailedTasks. Count=" + k + "; Exception: " + e.getMessage()), true);
                arrayList = ((hz3) ((a04) ((jee) t972.getValue()).a.get())).f.b().b(500, p23.B(new lee[]{lee.WAITING, lee.FAILED}));
            }
            int size = arrayList.size();
            udd.q("o1d", "selected taskIds count = " + size);
            boolean z4 = false;
            if (size > 2000) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = ((jee) t972.getValue()).m().iterator();
                while (it2.hasNext()) {
                    yde yde = (yde) it2.next();
                    sb.append("t=");
                    sb.append(yde.a);
                    sb.append(", c=");
                    sb.append(yde.b);
                    sb.append("; ");
                }
                String sb2 = sb.toString();
                j06 j06 = una.b;
                ((jee) t972.getValue()).f();
                ArrayList l = ((jee) t972.getValue()).l();
                ((g15) t97.getValue()).c(new HandledException("Too much tasks, count=%d. Count by type: %s", Integer.valueOf(size), sb2), false);
                arrayList = l;
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it3 = arrayList.iterator();
            boolean z5 = false;
            while (it3.hasNext()) {
                zde j = ((jee) t972.getValue()).j(((Long) it3.next()).longValue());
                if (j != null) {
                    udd.p("o1d", "process task: %s", new Object[]{j.f.getClass().getName()});
                    tna tna = j.f;
                    if (tna instanceof c0d) {
                        ((c0d) tna).a = (d0d) this.Y.getValue();
                    } else if (tna instanceof ol) {
                        ((ol) tna).c = (pl) this.Z.getValue();
                    } else {
                        throw new IllegalStateException("unknown task! " + j.f.getClass());
                    }
                    if (j.b != lee.FAILED || j.c < j.f.h()) {
                        if (j.e != 0) {
                            long j2 = j.d;
                            if (!(j2 == 0 || ((jee) t972.getValue()).j(j2) == null || j.e != z3)) {
                            }
                        }
                        boolean z6 = j.f.getType() == una.TYPE_SYNC_CHAT_HISTORY ? z3 : z4;
                        if (z6) {
                            n1d n1d = (n1d) j.f;
                            md4 md4 = n1d.X;
                            hashSet = hashSet3;
                            long j3 = n1d.c;
                            HashSet hashSet4 = md4 == md4.REGULAR ? hashSet2 : hashSet;
                            if (hashSet4.contains(Long.valueOf(j3))) {
                                udd.p("o1d", "task <%s> already in list, delete it!", new Object[]{n1d.Y});
                                arrayList2.add(j);
                            } else {
                                hashSet4.add(Long.valueOf(j3));
                            }
                            if (z5) {
                                it = it3;
                                z = true;
                                z3 = z;
                                it3 = it;
                                hashSet3 = hashSet;
                                z4 = false;
                            }
                        } else {
                            hashSet = hashSet3;
                        }
                        try {
                            i = j.f.e();
                            it = it3;
                            z = true;
                        } catch (Throwable th) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("failed to execute onPreExecute method for task ");
                            it = it3;
                            sb3.append(j.f.getId());
                            sb3.append(" type ");
                            sb3.append(j.f.getType());
                            String sb4 = sb3.toString();
                            udd.s("o1d", sb4, th);
                            z(j.f);
                            Exception exc = new Exception(sb4, th);
                            z = true;
                            ((g15) t97.getValue()).c(exc, true);
                            i = 3;
                        }
                        if (i == 2) {
                            ((jee) t972.getValue()).n(j.a, lee.WAITING);
                            if (z6) {
                                z3 = z;
                                z5 = z3;
                                it3 = it;
                                hashSet3 = hashSet;
                                z4 = false;
                            } else {
                                udd.q("o1d", "task " + j + " skip");
                            }
                        } else if (i == 3) {
                            udd.q("o1d", "task " + j + " will be removed, reason: onPreExecute returned REMOVE");
                            arrayList2.add(j);
                        } else {
                            ((jee) t972.getValue()).n(j.a, lee.PROCESSING);
                            if (z6) {
                                z5 = z;
                            }
                            if (j.c > 0) {
                                udd.q("o1d", "task " + j + " retry");
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            tna tna2 = j.f;
                            if (tna2 instanceof ol) {
                                ol olVar = (ol) tna2;
                                ((ybe) ((qbe) this.c.getValue())).b(olVar, (qce) olVar, z2);
                            } else {
                                this.w0.a((c0d) tna2);
                            }
                        }
                        z3 = z;
                        it3 = it;
                        hashSet3 = hashSet;
                        z4 = false;
                    } else {
                        arrayList2.add(j);
                        udd.q("o1d", "task " + j + " will be removed, reason: max fails count limit is reached");
                    }
                }
                z = z3;
                hashSet = hashSet3;
                it = it3;
                z3 = z;
                it3 = it;
                hashSet3 = hashSet;
                z4 = false;
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                zde zde = (zde) it4.next();
                tna tna3 = zde.f;
                if (zde.c >= tna3.h()) {
                    z(tna3);
                }
                ((jee) t972.getValue()).d(zde.a);
                udd.q("o1d", "task " + zde + " deleted");
            }
        } catch (Exception e2) {
            udd.s("o1d", "process: failed", e2);
        }
    }

    public final void z(tna tna) {
        try {
            tna.f();
        } catch (Throwable th) {
            ((g15) this.o.getValue()).c(new Exception("failed to execute onMaxFailCount method for task " + tna.getId() + " type " + tna.getType(), th), true);
        }
    }
}
