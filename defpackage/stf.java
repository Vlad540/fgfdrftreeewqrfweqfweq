package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.animated.gif.GifImage;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: stf  reason: default package */
public final class stf implements cf8, ho4, m7, hcf {
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ stf(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public void A(int i, se8 se8, i78 i78) {
        if (z(i, se8)) {
            ((jn) this.b).P(F(i78, se8));
        }
    }

    public void B(int i, se8 se8) {
        if (z(i, se8)) {
            ((fo4) this.c).b();
        }
    }

    public void C(int i, se8 se8) {
        if (z(i, se8)) {
            ((fo4) this.c).a();
        }
    }

    public void D(int i, se8 se8) {
        if (z(i, se8)) {
            ((fo4) this.c).f();
        }
    }

    public void E(int i, se8 se8, i78 i78) {
        if (z(i, se8)) {
            ((jn) this.b).o(F(i78, se8));
        }
    }

    public i78 F(i78 i78, se8 se8) {
        v83 v83 = (v83) this.o;
        Object obj = this.a;
        long j = i78.e;
        long v = v83.v(j, obj);
        long j2 = i78.f;
        long v2 = v83.v(j2, obj);
        if (v == j && v2 == j2) {
            return i78;
        }
        return new i78(i78.a, i78.b, (xu5) i78.g, i78.c, i78.d, v, v2);
    }

    public nu7 G(JSONArray jSONArray, w2d w2d) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("state");
            ge1 K = x87.K(jSONObject);
            ke1 ke1 = (ke1) this.a;
            if (K.equals(ke1.a)) {
                ke1.q = ((b79) this.c).h(jSONObject, w2d);
                ArrayList B = x87.B(jSONObject);
                ArrayList arrayList3 = ke1.d;
                arrayList3.clear();
                arrayList3.addAll(B);
                qb1 qb1 = (qb1) this.b;
                qb1.n(jSONObject, "handleConversationParticipants", qb1.g(w2d, 2), true, w2d, w2d);
            } else if ("ACCEPTED".equals(string)) {
                arrayList.add(e(K, jSONObject, w2d));
            } else if ("CALLED".equals(string)) {
                arrayList.add(j(K, jSONObject, w2d));
            } else {
                hashSet.add(K);
            }
            ie1 D = ((lv1) this.o).D(jSONObject);
            if (D != null) {
                arrayList2.add(D);
            }
        }
        return new nu7(arrayList, arrayList2);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void H() {
        /*
            r8 = this;
            byte[] r0 = defpackage.nze.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.b     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0046 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0046 }
        L_0x0010:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0048
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0046 }
            w0c r2 = (defpackage.w0c) r2     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r8.c     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch:{ all -> 0x0046 }
            int r3 = r3.size()     // Catch:{ all -> 0x0046 }
            r4 = 64
            if (r3 < r4) goto L_0x0029
            goto L_0x0048
        L_0x0029:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch:{ all -> 0x0046 }
            int r3 = r3.get()     // Catch:{ all -> 0x0046 }
            r4 = 5
            if (r3 < r4) goto L_0x0033
            goto L_0x0010
        L_0x0033:
            r1.remove()     // Catch:{ all -> 0x0046 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch:{ all -> 0x0046 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0046 }
            r0.add(r2)     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r8.c     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch:{ all -> 0x0046 }
            r3.add(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0010
        L_0x0046:
            r0 = move-exception
            goto L_0x00a1
        L_0x0048:
            monitor-enter(r8)     // Catch:{ all -> 0x0046 }
            java.lang.Object r1 = r8.c     // Catch:{ all -> 0x009e }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x009e }
            r1.size()     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = r8.o     // Catch:{ all -> 0x009e }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x009e }
            r1.size()     // Catch:{ all -> 0x009e }
            monitor-exit(r8)     // Catch:{ all -> 0x0046 }
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L_0x005e:
            if (r2 >= r1) goto L_0x009d
            java.lang.Object r3 = r0.get(r2)
            w0c r3 = (defpackage.w0c) r3
            java.util.concurrent.ExecutorService r4 = r8.m()
            y0c r5 = r3.c
            qw9 r6 = r5.E0
            stf r6 = r6.a
            byte[] r6 = defpackage.nze.a
            r4.execute(r3)     // Catch:{ RejectedExecutionException -> 0x0078 }
            goto L_0x0092
        L_0x0076:
            r8 = move-exception
            goto L_0x0095
        L_0x0078:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0076 }
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch:{ all -> 0x0076 }
            r6.initCause(r4)     // Catch:{ all -> 0x0076 }
            r5.j(r6)     // Catch:{ all -> 0x0076 }
            nn1 r4 = r3.b     // Catch:{ all -> 0x0076 }
            r4.r(r5, r6)     // Catch:{ all -> 0x0076 }
            qw9 r4 = r5.E0
            stf r4 = r4.a
            r4.p(r3)
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0095:
            qw9 r0 = r5.E0
            stf r0 = r0.a
            r0.p(r3)
            throw r8
        L_0x009d:
            return
        L_0x009e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x00a1:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stf.H():void");
    }

    public void I(int i, qjc qjc) {
        SparseArray sparseArray = (SparseArray) this.b;
        oyb.j("Exactly one SampleExporter can be added for each track type.", !oze.l(sparseArray, i));
        sparseArray.put(i, qjc);
    }

    public boolean J(int i) {
        return ((lqe) ((ArrayList) this.a).get(i)).a.size() > 1;
    }

    public void K(Uri uri) {
        this.o = null;
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            this.o = arrayList;
            arrayList.add(uri);
        }
    }

    public void L(CharSequence charSequence) {
        ((Intent) this.b).putExtra("android.intent.extra.TEXT", charSequence);
    }

    public void M() {
        ((Context) this.a).startActivity(Intent.createChooser(v(), (CharSequence) this.c));
    }

    public void a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xm1 xm1 = ((f31) it.next()).a;
            if (xm1.a == w8f.b) {
                linkedHashSet.add(xm1.b);
            }
        }
        Iterator it2 = ((LinkedHashMap) this.c).entrySet().iterator();
        while (it2.hasNext()) {
            ge1 ge1 = (ge1) ((Map.Entry) it2.next()).getKey();
            if (!linkedHashSet.contains(ge1)) {
                ((LinkedHashSet) this.o).add(ge1);
                it2.remove();
            }
        }
    }

    public m80 b() {
        Integer num = (Integer) this.a;
        String str = BuildConfig.FLAVOR;
        String str2 = num == null ? " audioSource" : str;
        if (((Integer) this.b) == null) {
            str2 = str2.concat(" sampleRate");
        }
        if (((Integer) this.c) == null) {
            str2 = hr1.g(str2, " channelCount");
        }
        if (((Integer) this.o) == null) {
            str2 = hr1.g(str2, " audioFormat");
        }
        if (str2.isEmpty()) {
            int intValue = ((Integer) this.a).intValue();
            int intValue2 = ((Integer) this.b).intValue();
            int intValue3 = ((Integer) this.c).intValue();
            int intValue4 = ((Integer) this.o).intValue();
            m80 m80 = new m80(intValue, intValue2, intValue3, intValue4);
            if (intValue == -1) {
                str = " audioSource";
            }
            if (intValue2 <= 0) {
                str = str.concat(" sampleRate");
            }
            if (intValue3 <= 0) {
                str = hr1.g(str, " channelCount");
            }
            if (intValue4 == -1) {
                str = hr1.g(str, " audioFormat");
            }
            if (str.isEmpty()) {
                return m80;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(str));
        }
        throw new IllegalStateException("Missing required properties:".concat(str2));
    }

    public int c(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        StringBuilder m = me4.m(i, "requested global type ", " does not belong to the adapter:");
        m.append(((zg9) this.c).c);
        throw new IllegalStateException(m.toString());
    }

    public synchronized void d() {
        try {
            Iterator it = ((ArrayDeque) this.b).iterator();
            while (it.hasNext()) {
                ((w0c) it.next()).c.d();
            }
            Iterator it2 = ((ArrayDeque) this.c).iterator();
            while (it2.hasNext()) {
                ((w0c) it2.next()).c.d();
            }
            Iterator it3 = ((ArrayDeque) this.o).iterator();
            while (it3.hasNext()) {
                ((y0c) it3.next()).d();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void dispose() {
        SparseArray sparseArray = (SparseArray) ((og0) this.o).c;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((zg9) sparseArray.valueAt(size)) == ((zg9) this.c)) {
                sparseArray.removeAt(size);
            }
        }
    }

    public pja e(ge1 ge1, JSONObject jSONObject, w2d w2d) {
        w2d w2d2 = w2d;
        qb1 qb1 = (qb1) this.b;
        ac9 f = qb1.f(jSONObject, ge1, "createAddOrUpdateParamsForAcceptedParticipant", qb1.h(w2d2).a(), true);
        cc9 r = x87.r(jSONObject);
        ArrayList B = x87.B(jSONObject);
        wia t = x87.t(jSONObject);
        if (t == null) {
            t = ke1.r;
        }
        y41 m = x87.m(jSONObject);
        nfc dr9 = new dr9(14);
        nfc dr92 = new dr9(14);
        nfc nfc = new nfc(22, (Object) t);
        nfc nfc2 = new nfc(22, (Object) f);
        if (r != null) {
            dr9 = new nfc(22, (Object) r);
        }
        nfc nfc3 = dr9;
        nfc nfc4 = new nfc(22, (Object) B);
        if (m != null) {
            dr92 = new nfc(22, (Object) m);
        }
        return new pja(ge1, nfc, nfc2, nfc3, nfc4, dr92, new nfc(22, (Object) ((b79) this.c).h(jSONObject, w2d2)));
    }

    public int f(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.a;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey > -1) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        og0 og0 = (og0) this.o;
        int i2 = og0.b;
        og0.b = i2 + 1;
        ((SparseArray) og0.c).put(i2, (zg9) this.c);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.b).put(i2, i);
        return i2;
    }

    public void g(int i, se8 se8, yi7 yi7, i78 i78, IOException iOException, boolean z) {
        if (z(i, se8)) {
            ((jn) this.b).D(yi7, F(i78, se8), iOException, z);
        }
    }

    public boolean h(n7 n7Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(q(n7Var), new yl8((Context) this.b, (b4e) menuItem));
    }

    public void i(n7 n7Var) {
        ((ActionMode.Callback) this.a).onDestroyActionMode(q(n7Var));
    }

    public pja j(ge1 ge1, JSONObject jSONObject, w2d w2d) {
        qb1 qb1 = (qb1) this.b;
        ac9 f = qb1.f(jSONObject, ge1, "createAddOrUpdateParamsForCalledParticipant", qb1.h(w2d).a(), true);
        cc9 r = x87.r(jSONObject);
        ArrayList B = x87.B(jSONObject);
        y41 m = x87.m(jSONObject);
        return new pja(ge1, new dr9(14), new nfc(22, (Object) f), r != null ? new nfc(22, (Object) r) : new dr9(14), new nfc(22, (Object) B), m != null ? new nfc(22, (Object) m) : new dr9(14), new nfc(22, (Object) ((b79) this.c).h(jSONObject, w2d)));
    }

    public boolean k(n7 n7Var, pl8 pl8) {
        w3e q = q(n7Var);
        kgd kgd = (kgd) this.o;
        Menu menu = (Menu) kgd.get(pl8);
        if (menu == null) {
            menu = new km8((Context) this.b, pl8);
            kgd.put(pl8, menu);
        }
        return ((ActionMode.Callback) this.a).onCreateActionMode(q, menu);
    }

    public void l(String str) {
        aec aec = (aec) this.a;
        aec.b();
        tdc tdc = (tdc) this.c;
        yz5 f = tdc.f();
        if (str == null) {
            f.W(1);
        } else {
            f.f(1, str);
        }
        aec.c();
        try {
            f.n();
            aec.r();
        } finally {
            aec.l();
            tdc.u(f);
        }
    }

    public synchronized ExecutorService m() {
        try {
            if (((ExecutorService) this.a) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new pa3(nze.g + " Dispatcher", false));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (ExecutorService) this.a;
    }

    public boolean n(n7 n7Var, Menu menu) {
        w3e q = q(n7Var);
        kgd kgd = (kgd) this.o;
        Menu menu2 = (Menu) kgd.get(menu);
        if (menu2 == null) {
            menu2 = new km8((Context) this.b, (pl8) menu);
            kgd.put(menu, menu2);
        }
        return ((ActionMode.Callback) this.a).onPrepareActionMode(q, menu2);
    }

    public void o(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        H();
    }

    public void p(w0c w0c) {
        w0c.a.decrementAndGet();
        o((ArrayDeque) this.c, w0c);
    }

    public w3e q(n7 n7Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w3e w3e = (w3e) arrayList.get(i);
            if (w3e != null && w3e.b == n7Var) {
                return w3e;
            }
        }
        w3e w3e2 = new w3e((Context) this.b, n7Var);
        arrayList.add(w3e2);
        return w3e2;
    }

    public void r(int i, se8 se8, yi7 yi7, i78 i78) {
        if (z(i, se8)) {
            ((jn) this.b).y(yi7, F(i78, se8));
        }
    }

    public void s(int i, se8 se8, Exception exc) {
        if (z(i, se8)) {
            ((fo4) this.c).e(exc);
        }
    }

    public void t(int i, se8 se8, yi7 yi7, i78 i78) {
        if (z(i, se8)) {
            ((jn) this.b).A(yi7, F(i78, se8));
        }
    }

    public void u(int i, se8 se8, int i2) {
        if (z(i, se8)) {
            ((fo4) this.c).d(i2);
        }
    }

    public Intent v() {
        ArrayList arrayList = (ArrayList) this.o;
        Intent intent = (Intent) this.b;
        if (arrayList == null || arrayList.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = (ArrayList) this.o;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData((ClipData) null);
                intent.setFlags(intent.getFlags() & -2);
            } else {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) ((ArrayList) this.o).get(0));
                pa2.B(intent, (ArrayList) this.o);
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList) this.o);
            pa2.B(intent, (ArrayList) this.o);
        }
        return intent;
    }

    public boolean w() {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.a;
            if (i >= arrayList.size()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    lqe lqe = (lqe) arrayList.get(i2);
                    if (lqe.b != lqe.a.size()) {
                        return false;
                    }
                }
                return true;
            } else if (((lqe) arrayList.get(i)).b == -1) {
                return false;
            } else {
                i++;
            }
        }
    }

    public void x(int i, se8 se8, yi7 yi7, i78 i78) {
        if (z(i, se8)) {
            ((jn) this.b).G(yi7, F(i78, se8));
        }
    }

    public void y(int i, se8 se8) {
        if (z(i, se8)) {
            ((fo4) this.c).c();
        }
    }

    public boolean z(int i, se8 se8) {
        se8 se82;
        Object obj = this.a;
        v83 v83 = (v83) this.o;
        if (se8 != null) {
            se82 = v83.u(obj, se8);
            if (se82 == null) {
                return false;
            }
        } else {
            se82 = null;
        }
        int w = v83.w(i, obj);
        jn jnVar = (jn) this.b;
        if (jnVar.b != w || !oze.a((se8) jnVar.c, se82)) {
            this.b = new jn((CopyOnWriteArrayList) v83.c.o, w, se82);
        }
        fo4 fo4 = (fo4) this.c;
        if (fo4.a == w && oze.a(fo4.b, se82)) {
            return true;
        }
        this.c = new fo4(v83.d.c, w, se82);
        return true;
    }

    public stf(int i) {
        switch (i) {
            case 7:
                this.b = new ArrayDeque();
                this.c = new ArrayDeque();
                this.o = new ArrayDeque();
                return;
            default:
                this.a = ez3.O(3, new p22(17));
                this.b = ez3.O(3, new p22(18));
                this.c = ez3.O(3, new p22(19));
                this.o = ez3.O(3, new p22(20));
                return;
        }
    }

    public stf(nxc nxc) {
        ArrayList arrayList;
        GifImage gifImage = (GifImage) nxc.b;
        gifImage.getClass();
        this.a = gifImage;
        this.c = e13.o((e13) nxc.c);
        ArrayList<e13> arrayList2 = (ArrayList) nxc.o;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            for (e13 o2 : arrayList2) {
                arrayList3.add(e13.o(o2));
            }
            arrayList = arrayList3;
        }
        this.o = arrayList;
        this.b = (String) nxc.a;
    }

    public stf(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.o = null;
    }

    public stf(Context context) {
        Activity activity;
        context.getClass();
        this.a = context;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.b = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            ((Intent) this.b).putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            ((Intent) this.b).putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }
}
