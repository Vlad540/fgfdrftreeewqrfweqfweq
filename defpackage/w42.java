package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: w42  reason: default package */
public final /* synthetic */ class w42 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t52 b;

    public /* synthetic */ w42(t52 t52, int i) {
        this.a = i;
        this.b = t52;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        ArrayList arrayList;
        int i;
        byte[] bArr;
        switch (this.a) {
            case 0:
                t52 t52 = this.b;
                if (!t52.i) {
                    udd.q("t52", "load 1: start");
                    if (!t52.i) {
                        ((lne) t52.A.get()).getClass();
                        lne.a("ChatController.load()");
                        long nanoTime = System.nanoTime();
                        bs bsVar = new bs(0);
                        ArrayList arrayList2 = new ArrayList();
                        nj4 nj4 = t52.A;
                        ((lne) nj4.get()).getClass();
                        lne.a("ChatController.selectChats()");
                        xdc xdc = ((hz3) ((a04) t52.l.get())).b;
                        yp2 c = xdc.c();
                        c.getClass();
                        pec a2 = pec.a(0, "SELECT * FROM chats");
                        aec aec = c.a;
                        aec.b();
                        Cursor o = aec.o(a2, (CancellationSignal) null);
                        try {
                            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                            int o3 = gp0.o(o, "server_id");
                            int o4 = gp0.o(o, "data");
                            int o5 = gp0.o(o, "favourite_index");
                            int o6 = gp0.o(o, "sort_time");
                            long j = nanoTime;
                            int o7 = gp0.o(o, "cid");
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = new ArrayList(o.getCount());
                            while (o.moveToNext()) {
                                long j2 = o.getLong(o2);
                                long j3 = o.getLong(o3);
                                if (o.isNull(o4)) {
                                    i = o2;
                                    bArr = null;
                                } else {
                                    bArr = o.getBlob(o4);
                                    i = o2;
                                }
                                arrayList4.add(new o72(j2, j3, c.a().a(bArr), o.getLong(o5), o.getLong(o6), o.getLong(o7)));
                                o2 = i;
                            }
                            o.close();
                            a2.m();
                            TreeSet treeSet = new TreeSet(xdc.g);
                            Iterator it = arrayList4.iterator();
                            while (it.hasNext()) {
                                treeSet.add(xdc.a((o72) it.next()));
                            }
                            List<p62> s0 = o23.s0(treeSet);
                            ((lne) nj4.get()).getClass();
                            Trace.endSection();
                            ArrayList arrayList5 = new ArrayList();
                            udd.q("t52", "load 2");
                            for (p62 p62 : s0) {
                                o62 o62 = p62.c;
                                if (o62.b != n62.b || ((o62.r0 != 1 && !o62.i0) || o62.e.containsKey(Long.valueOf(t52.J())))) {
                                    t52.U(p62.b, p62);
                                    bsVar.add(Long.valueOf(p62.b));
                                    long j4 = p62.c.j;
                                    if (j4 > 0) {
                                        arrayList = arrayList3;
                                        arrayList.add(Long.valueOf(j4));
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                    arrayList3 = arrayList;
                                } else {
                                    arrayList5.add(p62);
                                }
                            }
                            ArrayList arrayList6 = arrayList3;
                            udd.q("t52", "load 3");
                            if (!arrayList5.isEmpty()) {
                                t52.y.b(new dr1(t52, 6, arrayList5));
                            }
                            udd.q("t52", "load 4");
                            ((lne) t52.A.get()).getClass();
                            lne.a("ChatController.load().processedChats");
                            yr l = ((to8) t52.s.get()).l(arrayList6);
                            udd.q("t52", "load 5");
                            ur urVar = new ur(bsVar);
                            while (urVar.hasNext()) {
                                p62 p622 = (p62) t52.d.get((Long) urVar.next());
                                if (p622 != null) {
                                    i22 g = t52.g(p622, (vo8) l.get(Long.valueOf(p622.c.j)));
                                    if (g.b.f(((j2b) t52.n).a.s())) {
                                        t52.a = g;
                                    }
                                }
                            }
                            udd.q("t52", "load 6");
                            ((lne) t52.A.get()).getClass();
                            Trace.endSection();
                            t52.i = true;
                            udd.q("t52", "load 7");
                            t52.j.b();
                            fn6 fn6 = udd.e;
                            if (fn6 != null && fn6.c()) {
                                tn7 tn7 = tn7.X;
                                Locale locale = Locale.ROOT;
                                int size = bsVar.size();
                                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
                                fn6.d(tn7, "t52", "chats loaded to memory cache size: " + size + " by time " + millis + "ms", (Throwable) null);
                            }
                            t52.m.c(new mw2(bsVar, true, true, (md4) null, (a4b) null, 120));
                            ((lne) t52.A.get()).getClass();
                            Trace.endSection();
                            udd.q("t52", "load 8: finish");
                            return;
                        } catch (Throwable th) {
                            o.close();
                            a2.m();
                            throw th;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                t52 t522 = this.b;
                t522.f.clear();
                t522.c.clear();
                t522.g.clear();
                t522.d.clear();
                t522.b.clear();
                t522.e.clear();
                t522.h.clear();
                t522.a = null;
                return;
        }
    }
}
