package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: xoa  reason: default package */
public final class xoa implements moa {
    public final t97 a;
    public final t97 b;
    public final tt0 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final g15 h;
    public volatile long i;
    public volatile boolean j;
    public final HashMap k = new HashMap();

    public xoa(t97 t97, t97 t972, tt0 tt0, t97 t973, r7e r7e, t97 t974, t97 t975, g15 g15) {
        this.a = t97;
        this.b = t972;
        this.c = tt0;
        this.d = t973;
        this.e = r7e;
        this.f = t974;
        this.g = t975;
        this.h = g15;
        tt0.d(this);
    }

    public final void a(ArrayList arrayList) {
        udd.q("xoa", "onPhonebookUpdated");
        c();
    }

    public final void b(List list, Map map, Map map2) {
        udd.p("xoa", "onSyncSuccess: contacts=%s, phones=%s, requested=%s", new Object[]{Integer.valueOf(list.size()), Integer.valueOf(map.size()), Integer.valueOf(map2.size())});
        int size = list.size();
        t97 t97 = this.f;
        if (size > 0) {
            long s = ((j2b) ((g2b) this.d.getValue())).a.s();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uj3 uj3 = (uj3) it.next();
                if (uj3.a == s) {
                    list.remove(uj3);
                    break;
                }
            }
            ((gy9) ((pk) this.b.getValue())).u((List) list.stream().map(new fi3(2)).collect(Collectors.toList()));
            ((di3) t97.getValue()).u(list);
        }
        boolean z = false;
        for (String str : map.keySet()) {
            HashMap hashMap = this.k;
            Integer num = (Integer) hashMap.get(str);
            int intValue = num != null ? num.intValue() + 1 : 1;
            hashMap.put(str, Integer.valueOf(intValue));
            if (!z && intValue >= 10) {
                this.h.c(new Exception("Contacts sync cycle"), true);
                z = true;
            }
        }
        t97 t972 = this.a;
        oec oec = ((hz3) ((a04) t972.getValue())).e;
        oec.a.m().q(new sbc(map, 4, oec));
        for (String remove : map.keySet()) {
            map2.remove(remove);
        }
        udd.p("xoa", "markInvalidPhones: invalid phones: %s", new Object[]{Integer.valueOf(map2.size())});
        if (!map2.isEmpty()) {
            oec oec2 = ((hz3) ((a04) t972.getValue())).e;
            Set<String> keySet = map2.keySet();
            aec aec = oec2.c().a;
            aec.b();
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE phones SET type = ? WHERE type = ? AND phone in (");
            a06.e(sb, keySet.size());
            sb.append(")");
            yz5 d2 = aec.d(sb.toString());
            d2.j(1, (long) 2);
            d2.j(2, (long) 0);
            int i2 = 3;
            for (String str2 : keySet) {
                if (str2 == null) {
                    d2.W(i2);
                } else {
                    d2.f(i2, str2);
                }
                i2++;
            }
            aec.c();
            try {
                d2.n();
                aec.r();
            } finally {
                aec.l();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : map.entrySet()) {
            oec oec3 = ((hz3) ((a04) t972.getValue())).e;
            Long l = (Long) value.getValue();
            l.longValue();
            oec3.getClass();
            ioa ioa = (ioa) o23.X(oec3.f(Collections.singletonList(l)));
            if (ioa != null) {
                arrayList.add(ioa);
            }
        }
        Set y = ((di3) t97.getValue()).y(arrayList);
        if (!y.isEmpty()) {
            ((nae) this.g.getValue()).f(y);
        }
        this.c.c(new kh0());
        ((qmc) this.e.getValue()).c(new woa(this, 0), 1, TimeUnit.SECONDS);
    }

    public final void c() {
        udd.n("xoa", "sync");
        if (this.j) {
            udd.n("xoa", "sync in progress, return");
            return;
        }
        this.j = true;
        ((qmc) this.e.getValue()).b(new woa(this, 1));
    }

    /* JADX INFO: finally extract failed */
    public final void d() {
        String str;
        Integer num;
        udd.q("xoa", "syncInternal");
        udd.q("xoa", "select unsynced phones");
        HashMap hashMap = new HashMap();
        dpa c2 = ((hz3) ((a04) this.a.getValue())).e.c();
        c2.getClass();
        pec a2 = pec.a(1, "SELECT * FROM phones WHERE type = ?");
        a2.j(1, (long) 0);
        aec aec = c2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "phonebook_id");
            int o4 = gp0.o(o, "contact_id");
            int o5 = gp0.o(o, "phone");
            int o6 = gp0.o(o, "server_phone");
            int o7 = gp0.o(o, "email");
            int o8 = gp0.o(o, "first_name");
            int o9 = gp0.o(o, "last_name");
            int o10 = gp0.o(o, "avatar_path");
            int o11 = gp0.o(o, "type");
            String str2 = "xoa";
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new joa(o.getLong(o2), o.getLong(o3), o.getInt(o4), o.isNull(o5) ? null : o.getString(o5), o.getLong(o6), o.isNull(o7) ? null : o.getString(o7), o.isNull(o8) ? null : o.getString(o8), o.isNull(o9) ? null : o.getString(o9), o.isNull(o10) ? null : o.getString(o10), us8.b(o.getInt(o11))));
            }
            o.close();
            a2.m();
            ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(oec.d((joa) it.next()));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ioa ioa = (ioa) it2.next();
                hashMap.put(ioa.X, new lm3(ioa.w0, ioa.x0));
                if (hashMap.size() == 100) {
                    break;
                }
            }
            if (!hashMap.isEmpty()) {
                for (Map.Entry entry : this.k.entrySet()) {
                    if (!hashMap.containsKey(entry.getKey()) || (num = (Integer) entry.getValue()) == null || num.intValue() < 10) {
                        str = str2;
                    } else {
                        str = str2;
                        udd.q(str, "syncInternal: already synced, skip");
                        hashMap.remove(entry.getKey());
                    }
                    str2 = str;
                }
            }
            String str3 = str2;
            udd.p(str3, "syncInternal: unsyncedPhones size=%s", new Object[]{Integer.valueOf(hashMap.size())});
            if (hashMap.size() == 0) {
                this.j = false;
                udd.q(str3, "syncInternal: everything synced, return");
                return;
            }
            gy9 gy9 = (gy9) ((pk) this.b.getValue());
            this.i = gy9.v(gy9, new q92(((j2b) gy9.z()).a.n(), hashMap, 2));
        } catch (Throwable th) {
            o.close();
            a2.m();
            throw th;
        }
    }

    @a1e
    public void onEvent(k7e k7e) {
        udd.n("xoa", "SyncResultEvent");
        ((qmc) this.e.getValue()).b(new hg9(this, 12, k7e));
    }

    @a1e
    public void onEvent(jh0 jh0) {
        if (jh0.a == this.i) {
            udd.p("xoa", "BaseErrorEvent :%s", new Object[]{jh0});
            this.j = false;
        }
    }
}
