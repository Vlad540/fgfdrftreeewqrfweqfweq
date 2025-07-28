package defpackage;

import android.content.Context;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Size;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

/* renamed from: j8e  reason: default package */
public final class j8e implements pz3, bf8, go4, h25, a7e, Provider {
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ j8e(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static void B(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static void k(ge1 ge1, ke1 ke1, HashMap hashMap) {
        hashMap.put("participant_id", ge1.c());
        if (ke1 != null) {
            if (ke1.b()) {
                wia wia = ke1.j;
                hashMap.put("participant_accept_peer_id", wia.a);
                hashMap.put("participant_accept_peer_type", wia.b);
            }
            hashMap.put("participant_connected", Boolean.toString(ke1.g));
            ac9 ac9 = ke1.b;
            int ordinal = ac9.a.ordinal();
            if (ordinal == 0) {
                hashMap.put("participant_audio_option_state", "UNMUTE");
            } else if (ordinal == 1) {
                hashMap.put("participant_audio_option_state", "MUTE");
            } else if (ordinal == 2 || ordinal == 3) {
                hashMap.put("participant_audio_option_state", "MUTE_PERMANENT");
            }
            int ordinal2 = ac9.b.ordinal();
            if (ordinal2 == 0) {
                hashMap.put("participant_video_option_state", "UNMUTE");
            } else if (ordinal2 == 1) {
                hashMap.put("participant_video_option_state", "MUTE");
            } else if (ordinal2 == 2 || ordinal2 == 3) {
                hashMap.put("participant_video_option_state", "MUTE_PERMANENT");
            }
            int ordinal3 = ac9.c.ordinal();
            if (ordinal3 == 0) {
                hashMap.put("participant_screenshare_option_state", "UNMUTE");
            } else if (ordinal3 == 1) {
                hashMap.put("participant_screenshare_option_state", "MUTE");
            } else if (ordinal3 == 2 || ordinal3 == 3) {
                hashMap.put("participant_screenshare_option_state", "MUTE_PERMANENT");
            }
            cc9 cc9 = ke1.c;
            hashMap.put("participant_audio_enabled", String.valueOf(cc9.e));
            hashMap.put("participant_video_enabled", String.valueOf(cc9.f));
            hashMap.put("participant_screen_cast_enabled", String.valueOf(cc9.b));
        }
    }

    public void A(int i, re8 re8) {
        if (t(i, re8)) {
            ((eo4) this.c).f();
        }
    }

    public hj0 C(List list) {
        ArrayList l = l(list);
        if (l.size() < 2) {
            return (hj0) gwf.s(l, (Object) null);
        }
        Collections.sort(l, new yz(4));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((hj0) l.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= l.size()) {
                break;
            }
            hj0 hj0 = (hj0) l.get(i3);
            if (i2 == hj0.c) {
                arrayList.add(new Pair(hj0.b, Integer.valueOf(hj0.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (hj0) l.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.c;
        hj0 hj02 = (hj0) hashMap.get(arrayList);
        if (hj02 == null) {
            List subList = l.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((hj0) subList.get(i5)).d;
            }
            int nextInt = ((Random) this.o).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= subList.size()) {
                    hj02 = (hj0) gwf.t(subList);
                    break;
                }
                hj0 hj03 = (hj0) subList.get(i);
                i6 += hj03.d;
                if (nextInt < i6) {
                    hj02 = hj03;
                    break;
                }
                i++;
            }
            hashMap.put(arrayList, hj02);
        }
        return hj02;
    }

    public void D(int i, re8 re8, i78 i78) {
        if (t(i, re8)) {
            ((af8) this.b).c(x(i78));
        }
    }

    public void E(int i, re8 re8, i78 i78) {
        if (t(i, re8)) {
            ((af8) this.b).m(x(i78));
        }
    }

    public void F(int i, re8 re8) {
        if (t(i, re8)) {
            ((eo4) this.c).c();
        }
    }

    public void G(of3 of3, of3 of32) {
        c97 c97 = (c97) this.o;
        if (c97 == null || c97.h()) {
            ms9 d = ((oy) ((List) this.b).get(0)).d();
            nbe nbe = (mbe) ((nj4) this.a).get();
            nbe.getClass();
            ov9 r = d.r(nbe.a());
            c97 c972 = new c97(of3, of32, z3d.i);
            r.a(c972);
            this.o = c972;
        }
    }

    public void H(int i, re8 re8) {
        if (t(i, re8)) {
            ((eo4) this.c).b();
        }
    }

    public void I() {
        int j;
        int i = 16908360;
        ViewPager2 viewPager2 = (ViewPager2) this.o;
        eaf.h(viewPager2, 16908360);
        boolean z = false;
        eaf.e(viewPager2, 0);
        eaf.h(viewPager2, 16908361);
        eaf.e(viewPager2, 0);
        eaf.h(viewPager2, 16908358);
        eaf.e(viewPager2, 0);
        eaf.h(viewPager2, 16908359);
        eaf.e(viewPager2, 0);
        if (viewPager2.getAdapter() != null && (j = viewPager2.getAdapter().j()) != 0 && viewPager2.J0) {
            int orientation = viewPager2.getOrientation();
            sbf sbf = (sbf) this.b;
            rbf rbf = (rbf) this.a;
            if (orientation == 0) {
                if (viewPager2.y0.H() == 1) {
                    z = true;
                }
                int i2 = z ? 16908360 : 16908361;
                if (z) {
                    i = 16908361;
                }
                if (viewPager2.o < j - 1) {
                    eaf.i(viewPager2, new g4(i2), rbf);
                }
                if (viewPager2.o > 0) {
                    eaf.i(viewPager2, new g4(i), sbf);
                    return;
                }
                return;
            }
            if (viewPager2.o < j - 1) {
                eaf.i(viewPager2, new g4(16908359), rbf);
            }
            if (viewPager2.o > 0) {
                eaf.i(viewPager2, new g4(16908358), sbf);
            }
        }
    }

    public void K(int i, re8 re8, xi7 xi7, i78 i78) {
        if (t(i, re8)) {
            ((af8) this.b).g(xi7, x(i78));
        }
    }

    public void L(int i, re8 re8, xi7 xi7, i78 i78) {
        if (t(i, re8)) {
            ((af8) this.b).l(xi7, x(i78));
        }
    }

    public ExecutorService a() {
        return (ExecutorService) ((r7e) this.c).getValue();
    }

    public ExecutorService b() {
        return ((x4a) ((t97) this.a).getValue()).c();
    }

    public ExecutorService c() {
        return (ExecutorService) ((r7e) this.o).getValue();
    }

    public ExecutorService d() {
        return (ExecutorService) ((r7e) this.b).getValue();
    }

    public void e(int i, re8 re8, xi7 xi7, i78 i78) {
        if (t(i, re8)) {
            ((af8) this.b).e(xi7, x(i78));
        }
    }

    public ExecutorService f() {
        return (ExecutorService) ((r7e) this.b).getValue();
    }

    public void g(int i, re8 re8, Exception exc) {
        if (t(i, re8)) {
            ((eo4) this.c).e(exc);
        }
    }

    public Object get() {
        eye eye = (eye) ((Provider) this.o).get();
        return new i37((Context) ((Provider) this.a).get(), (a15) ((Provider) this.b).get(), (pa0) ((Provider) this.c).get());
    }

    public List h(long j, rg6 rg6, int i, int i2, long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        to8 to8 = (to8) this.b;
        hb2 hb2 = (hb2) this.a;
        i22 i22 = (i22) this.c;
        if (i > 0) {
            long j4 = i22.a;
            hb2.getClass();
            ArrayList l = to8.a.c.l(j4, j, (Set) this.o, Integer.valueOf(i), true);
            arrayList.addAll(!l.isEmpty() ? hb2.f.b(l) : Collections.emptyList());
        }
        if (i2 > 0) {
            long j5 = i22.a;
            hb2.getClass();
            ArrayList l2 = to8.a.c.l(j5, j, (Set) this.o, Integer.valueOf(i2), false);
            arrayList.addAll(!l2.isEmpty() ? hb2.f.b(l2) : Collections.emptyList());
        }
        return new ArrayList(arrayList);
    }

    public ExecutorService i() {
        return (ExecutorService) ((r7e) this.b).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ope j(org.json.JSONObject r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            jk9 r0 = (defpackage.jk9) r0
            r0.getClass()
            w2d r2 = defpackage.jk9.q(r14)
            java.lang.String r0 = "participantCount"
            r1 = 0
            int r3 = r14.optInt(r0, r1)
            java.lang.String r0 = "addedParticipantIds"
            org.json.JSONArray r0 = r14.optJSONArray(r0)
            hw4 r4 = defpackage.hw4.a
            java.lang.Object r5 = r13.c
            zja r5 = (zja) r5
            if (r0 == 0) goto L_0x0025
            java.util.ArrayList r0 = r5.a(r0)
            goto L_0x0026
        L_0x0025:
            r0 = r4
        L_0x0026:
            java.lang.String r6 = "removedParticipantMarkers"
            org.json.JSONArray r6 = r14.optJSONArray(r6)
            r7 = 0
            if (r6 == 0) goto L_0x007b
            r5.getClass()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            int r8 = r6.length()
        L_0x003b:
            if (r1 >= r8) goto L_0x0075
            org.json.JSONObject r9 = r6.getJSONObject(r1)
            java.lang.String r10 = "GRID"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ JSONException -> 0x0056 }
            if (r10 != 0) goto L_0x004b
        L_0x0049:
            r9 = r7
            goto L_0x006d
        L_0x004b:
            java.lang.String r11 = "id"
            java.lang.String r10 = r10.getString(r11)     // Catch:{ JSONException -> 0x0056 }
            ge1 r9 = ge1.a(r10)     // Catch:{ JSONException -> 0x0056 }
            goto L_0x006d
        L_0x0056:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Can't parse id from "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.lang.String r11 = "ParticipantParser"
            xwb r12 = r5.a
            r12.logException(r11, r9, r10)
            goto L_0x0049
        L_0x006d:
            if (r9 == 0) goto L_0x0072
            r4.add(r9)
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0075:
            java.util.List r1 = defpackage.o23.s0(r4)
            r6 = r1
            goto L_0x007c
        L_0x007b:
            r6 = r4
        L_0x007c:
            java.lang.String r1 = "addedParticipants"
            org.json.JSONArray r14 = r14.optJSONArray(r1)
            if (r14 == 0) goto L_0x008e
            java.lang.Object r13 = r13.o
            stf r13 = (defpackage.stf) r13
            nu7 r13 = r13.G(r14, r2)
            r5 = r13
            goto L_0x008f
        L_0x008e:
            r5 = r7
        L_0x008f:
            ope r13 = new ope
            r1 = r13
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8e.j(org.json.JSONObject):ope");
    }

    public ArrayList l(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        B(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        B(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            hj0 hj0 = (hj0) list.get(i);
            if (!hashMap.containsKey(hj0.b) && !hashMap2.containsKey(Integer.valueOf(hj0.c))) {
                arrayList.add(hj0);
            }
        }
        return arrayList;
    }

    public void m(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((kgd) this.b).get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public e13 n() {
        e13 e13;
        ov0 ov0;
        ev3 ev3;
        boolean z;
        do {
            synchronized (this) {
                Iterator it = ((LinkedHashSet) this.o).iterator();
                e13 = null;
                if (it.hasNext()) {
                    ov0 = (ov0) it.next();
                    it.remove();
                } else {
                    ov0 = null;
                }
            }
            if (ov0 == null) {
                return null;
            }
            lr7 lr7 = (lr7) ((fv3) this.b);
            lr7.getClass();
            synchronized (lr7) {
                try {
                    ev3 = (ev3) lr7.b.M(ov0);
                    z = false;
                    if (ev3 != null) {
                        ev3 ev32 = (ev3) lr7.c.M(ov0);
                        ev32.getClass();
                        if (ev32.c == 0) {
                            z = true;
                        }
                        ez3.o(z);
                        e13 = ev32.b;
                        z = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z) {
                lr7.e(ev3);
                continue;
            }
        } while (e13 == null);
        return e13;
    }

    public Size[] o(int i) {
        HashMap hashMap = (HashMap) this.c;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            Size[] outputSizes = ((StreamConfigurationMap) ((fzd) this.a).b).getOutputSizes(i);
            if (outputSizes == null || outputSizes.length == 0) {
                return outputSizes;
            }
            Size[] p = ((qe4) this.b).p(outputSizes, i);
            hashMap.put(Integer.valueOf(i), p);
            return (Size[]) p.clone();
        } else if (((Size[]) hashMap.get(Integer.valueOf(i))) == null) {
            return null;
        } else {
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i))).clone();
        }
    }

    public int p() {
        boolean z = true;
        if ((((fca) ((k40) this.a).o).X.a & 1) == 0) {
            z = false;
        }
        hca hca = (hca) this.c;
        if (z) {
            return hca.getMeasuredHeight();
        }
        return me4.p((float) 12, dh4.c().getDisplayMetrics().density, ((b7e) this.o).getMeasuredHeight() - hca.getMeasuredHeight());
    }

    public int q() {
        if ((((fca) ((k40) this.a).o).X.a & 1) != 0) {
            return 0;
        }
        return ((b7e) this.o).getMeasuredHeight();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: i8e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.i8e r(defpackage.btf r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r1 = 2
            pec r0 = defpackage.pec.a(r1, r0)
            java.lang.String r2 = r6.a
            r3 = 1
            if (r2 != 0) goto L_0x0010
            r0.W(r3)
            goto L_0x0013
        L_0x0010:
            r0.f(r3, r2)
        L_0x0013:
            int r6 = r6.b
            long r2 = (long) r6
            r0.j(r1, r2)
            java.lang.Object r5 = r5.a
            aec r5 = (defpackage.aec) r5
            r5.b()
            r6 = 0
            android.database.Cursor r5 = r5.o(r0, r6)
            java.lang.String r1 = "work_spec_id"
            int r1 = gp0.o(r5, r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "generation"
            int r2 = gp0.o(r5, r2)     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "system_id"
            int r3 = gp0.o(r5, r3)     // Catch:{ all -> 0x0057 }
            boolean r4 = r5.moveToFirst()     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0059
            boolean r4 = r5.isNull(r1)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            java.lang.String r6 = r5.getString(r1)     // Catch:{ all -> 0x0057 }
        L_0x0048:
            int r1 = r5.getInt(r2)     // Catch:{ all -> 0x0057 }
            int r2 = r5.getInt(r3)     // Catch:{ all -> 0x0057 }
            i8e r3 = new i8e     // Catch:{ all -> 0x0057 }
            r3.<init>(r6, r1, r2)     // Catch:{ all -> 0x0057 }
            r6 = r3
            goto L_0x0059
        L_0x0057:
            r6 = move-exception
            goto L_0x0060
        L_0x0059:
            r5.close()
            r0.m()
            return r6
        L_0x0060:
            r5.close()
            r0.m()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8e.r(btf):i8e");
    }

    public void s(i8e i8e) {
        aec aec = (aec) this.a;
        aec.b();
        aec.c();
        try {
            ((sh) this.b).C(i8e);
            aec.r();
        } finally {
            aec.l();
        }
    }

    public boolean t(int i, re8 re8) {
        re8 re82;
        u83 u83 = (u83) this.o;
        if (re8 != null) {
            re82 = u83.p(this.a, re8);
            if (re82 == null) {
                return false;
            }
        } else {
            re82 = null;
        }
        u83.getClass();
        af8 af8 = (af8) this.b;
        if (af8.b != i || !mze.a((re8) af8.c, re82)) {
            this.b = new af8((CopyOnWriteArrayList) u83.c.d, i, re82, 0);
        }
        eo4 eo4 = (eo4) this.c;
        if (eo4.a == i && mze.a(eo4.b, re82)) {
            return true;
        }
        this.c = new eo4(u83.d.c, i, re82);
        return true;
    }

    public void u(int i, re8 re8, xi7 xi7, i78 i78, IOException iOException, boolean z) {
        if (t(i, re8)) {
            ((af8) this.b).j(xi7, x(i78), iOException, z);
        }
    }

    public void v(int i, re8 re8) {
        if (t(i, re8)) {
            ((eo4) this.c).a();
        }
    }

    public void w(int i, re8 re8, int i2) {
        if (t(i, re8)) {
            ((eo4) this.c).d(i2);
        }
    }

    public i78 x(i78 i78) {
        ((u83) this.o).getClass();
        long j = i78.e;
        long j2 = i78.e;
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        long j3 = i78.f;
        if (i == 0 && j3 == j3) {
            return i78;
        }
        return new i78(i78.a, i78.b, (vu5) i78.g, i78.c, i78.d, j2, j3);
    }

    public void y() {
        k40 k40 = (k40) this.a;
        ViewGroup viewGroup = (ViewGroup) ((WeakReference) k40.c).get();
        if (viewGroup != null) {
            viewGroup.post(new hg9(k40, 5, (l7c) this.b));
        }
        Handler handler = nba.a;
        AtomicBoolean atomicBoolean = nba.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            mba mba = nba.b;
            if (mba != null ? hhd.f(mba.b.get(), (kba) k40.w0) : false) {
                nba.b = null;
                if (nba.c != null) {
                    nba.d();
                }
            }
            atomicBoolean.set(false);
        }
    }

    public void z(RecyclerView recyclerView) {
        recyclerView.setImportantForAccessibility(2);
        this.c = new mbf(1, this);
        ViewPager2 viewPager2 = (ViewPager2) this.o;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    public j8e(int i) {
        switch (i) {
            case 7:
                this.a = new o0b(10);
                this.b = new kgd(0);
                this.c = new ArrayList();
                this.o = new HashSet();
                return;
            case 11:
                this.a = new otf(28);
                this.b = new f2b(1);
                this.c = new mn(29);
                this.o = new e3(23);
                return;
            default:
                Random random = new Random();
                this.c = new HashMap();
                this.o = random;
                this.a = new HashMap();
                this.b = new HashMap();
                return;
        }
    }

    public j8e(cg cgVar, fv3 fv3) {
        this.a = cgVar;
        this.b = fv3;
        this.o = new LinkedHashSet();
        this.c = new wwc(1, this);
    }

    public j8e(nj4 nj4, ArrayList arrayList, ArrayList arrayList2) {
        this.a = nj4;
        this.b = arrayList;
        this.c = arrayList2;
    }
}
