package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: rp1  reason: default package */
public final class rp1 implements pp7 {
    public final pk A0;
    public final to8 B0;
    public final t52 C0;
    public final qmc D0;
    public final bf5 E0;
    public final tt0 F0;
    public final g2b G0;
    public final rp8 H0;
    public final HashSet X = new HashSet();
    public final HashSet Y = new HashSet();
    public long Z;
    public boolean a;
    public volatile boolean b;
    public volatile qp1 c;
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    public long w0;
    public long x0;
    public final x4a y0;
    public final sk7 z0;

    public rp1(pk pkVar, to8 to8, t52 t52, qmc qmc, bf5 bf5, tt0 tt0, g2b g2b, x4a x4a, sk7 sk7, rp8 rp8) {
        this.A0 = pkVar;
        this.B0 = to8;
        this.C0 = t52;
        this.D0 = qmc;
        this.E0 = bf5;
        this.F0 = tt0;
        this.G0 = g2b;
        this.y0 = x4a;
        this.z0 = sk7;
        this.H0 = rp8;
    }

    public final void a() {
        g(new pp1(this, 0));
    }

    public final void b(int i, List list) {
        HashSet hashSet;
        int size = list.size();
        while (true) {
            size--;
            hashSet = this.X;
            if (size < 0) {
                break;
            } else if (hashSet.contains(Long.valueOf(((xm8) list.get(size)).a.b))) {
                list.remove(size);
            }
        }
        this.o.addAll(i, list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Long.valueOf(((xm8) it.next()).a.b));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        hashSet.addAll(arrayList);
    }

    public final void c() {
        if (this.x0 == 0 && this.c.Y.b() > 0) {
            for (Long l : ((LinkedHashMap) this.c.Y.a).keySet()) {
                if (this.C0.y(l.longValue()) != null) {
                    List list = (List) ((LinkedHashMap) this.c.Y.a).get(l);
                    if (list != null && !list.isEmpty()) {
                        if (list.size() > 100) {
                            list = list.subList(0, 100);
                        }
                        udd.q("rp1", "loadMissedMessages: for chat: " + l + " messages size: " + list.size());
                        this.x0 = ((gy9) this.A0).E(l.longValue(), new ArrayList(list));
                        return;
                    }
                } else {
                    udd.q("rp1", "loadMissedMessages: chat not found: " + l);
                }
            }
        }
    }

    public final void d() {
        if (this.w0 == 0) {
            udd.q("rp1", "loadNext: loading from network from: " + this.c.c + " backward");
            pk pkVar = this.A0;
            gy9 gy9 = (gy9) pkVar;
            this.w0 = gy9.v(gy9, new j2f(((j2b) gy9.z()).a.n(), this.c.c, false));
        }
    }

    public final void e() {
        if (this.c == null) {
            this.c = new qp1();
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(((mg5) this.E0).b(), "call_history_state"));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ete.s(fileInputStream, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ete.o(fileInputStream);
                ete.n(byteArrayOutputStream);
                Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
                gr8.mergeFrom(callHistoryState, byteArray);
                this.c.a = b.i(callHistoryState.chunk);
                this.c.b = callHistoryState.forwardMarker;
                this.c.c = callHistoryState.backwardMarker;
                this.c.o = callHistoryState.hasNext;
                this.c.X = callHistoryState.hasPrev;
                Map<Long, Protos.CallHistoryState.MissedMessagesItem> map = callHistoryState.missedMessagesIds;
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        s77 s77 = this.c.Y;
                        Long l = (Long) next.getKey();
                        ArrayList m = ek8.m(((Protos.CallHistoryState.MissedMessagesItem) next.getValue()).ids);
                        LinkedHashMap linkedHashMap = (LinkedHashMap) s77.a;
                        List list = (List) linkedHashMap.get(l);
                        if (list != null) {
                            list.addAll(m);
                        } else {
                            linkedHashMap.put(l, m);
                        }
                    }
                }
            } catch (Exception e) {
                udd.q("rp1", "loadState error, set default state " + e.getMessage());
            }
        }
    }

    public final void f() {
        this.D0.b(new pp1(this, 2));
    }

    public final void g(Runnable runnable) {
        this.y0.b().execute(runnable);
    }

    public final void h() {
        Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
        callHistoryState.chunk = b.j(this.c.a);
        callHistoryState.forwardMarker = this.c.b;
        callHistoryState.backwardMarker = this.c.c;
        callHistoryState.hasNext = this.c.o;
        callHistoryState.hasPrev = this.c.X;
        if (this.c.Y != null) {
            callHistoryState.missedMessagesIds = new HashMap();
            for (Long l : ((LinkedHashMap) this.c.Y.a).keySet()) {
                Protos.CallHistoryState.MissedMessagesItem missedMessagesItem = new Protos.CallHistoryState.MissedMessagesItem();
                missedMessagesItem.ids = ek8.n((List) ((LinkedHashMap) this.c.Y.a).get(l));
                callHistoryState.missedMessagesIds.put(l, missedMessagesItem);
            }
        }
        byte[] byteArray = gr8.toByteArray(callHistoryState);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(((mg5) this.E0).b(), "call_history_state"));
            fileOutputStream.write(byteArray);
            ete.n(fileOutputStream);
        } catch (IOException e) {
            udd.R("rp1", (IOException) null, "failed to save state: " + e.getMessage(), Arrays.copyOf(new Object[0], 0));
        }
    }

    public final void i() {
        j2b j2b = (j2b) this.G0;
        long j = j2b.a.g.getLong("user.callsLastSync", 0);
        long o2 = j2b.a.o();
        StringBuilder k = hr1.k(j, "setCallsLastSync: from: ", " to: ");
        k.append(o2);
        udd.q("rp1", k.toString());
        j2b.a.k("user.callsLastSync", Long.valueOf(o2));
    }

    @a1e
    public void onEvent(mw2 mw2) {
        g(new c(this, 25, mw2));
    }

    @a1e
    public void onEvent(l2f l2f) {
        g(new c(this, 21, l2f));
    }

    @a1e
    public void onEvent(to7 to7) {
        g(new c(this, 23, to7));
    }

    @a1e
    public void onEvent(gv6 gv6) {
        g(new c(this, 22, gv6));
    }

    @a1e
    public void onEvent(l89 l89) {
        g(new c(this, 26, l89));
    }

    @a1e
    public void onEvent(u89 u89) {
        g(new c(this, 24, u89));
    }

    @a1e
    public void onEvent(jh0 jh0) {
        g(new c(this, 20, jh0));
    }

    @a1e
    public void onEvent(t89 t89) {
        g(new c(this, 19, t89));
    }
}
