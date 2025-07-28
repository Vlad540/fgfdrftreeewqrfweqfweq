package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: gj  reason: default package */
public final class gj {
    public static final /* synthetic */ k77[] p;
    public final pk a;
    public final bec b;
    public final f03 c;
    public final pae d;
    public final rj e;
    public final String f = gj.class.getName();
    public final r7e g = new r7e(new qi(this, 0));
    public final r7e h = new r7e(new qi(this, 1));
    public final r7e i = new r7e(new qi(this, 2));
    public final ContextScope j;
    public final e3 k;
    public final e3 l;
    public final e3 m;
    public final ConcurrentHashMap n;
    public final CopyOnWriteArrayList o;

    static {
        Class<gj> cls = gj.class;
        p = new k77[]{new hc9(cls, "warmupJob", "getWarmupJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "updateJob", "getUpdateJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "animojiSetsUpdateJob", "getAnimojiSetsUpdateJob()Lkotlinx/coroutines/Job;")};
    }

    public gj(pk pkVar, bec bec, f03 f03, pae pae, rj rjVar, g15 g15) {
        this.a = pkVar;
        this.b = bec;
        this.c = f03;
        this.d = pae;
        this.e = rjVar;
        this.j = n1g.a(((n3a) pae).b().plus(new qj(g15)));
        this.k = hwf.t();
        this.l = hwf.t();
        this.m = hwf.t();
        this.n = new ConcurrentHashMap();
        this.o = new CopyOnWriteArrayList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.gj r10, java.util.Map r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.ri
            if (r0 == 0) goto L_0x0016
            r0 = r12
            ri r0 = (defpackage.ri) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x001b
        L_0x0016:
            ri r0 = new ri
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.util.ArrayList r10 = r0.Y
            java.util.Map r11 = r0.X
            gj r0 = r0.o
            wx3.H(r12)
            r1 = r10
            r10 = r0
            goto L_0x0079
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003a:
            wx3.H(r12)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0047
            hw4 r1 = hw4.a
            goto L_0x0105
        L_0x0047:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            wh r2 = r10.h()
            r0.o = r10
            r0.X = r11
            r0.Y = r12
            r0.x0 = r3
            r2.getClass()
            java.lang.String r3 = "SELECT * FROM animoji"
            r4 = 0
            pec r3 = pec.a(r4, r3)
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            vh r5 = new vh
            r6 = 0
            r5.<init>(r2, r3, r6)
            aec r2 = r2.a
            java.lang.Object r0 = r1g.g(r2, r4, r5, r0)
            if (r0 != r1) goto L_0x0077
            goto L_0x0105
        L_0x0077:
            r1 = r12
            r12 = r0
        L_0x0079:
            java.util.List r12 = (java.util.List) r12
            boolean r0 = r12.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x008a
            java.util.Set r11 = r11.keySet()
            r1.addAll(r11)
            goto L_0x00de
        L_0x008a:
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0092:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            java.util.Iterator r0 = r12.iterator()
        L_0x00b6:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00ca
            java.lang.Object r7 = r0.next()
            r8 = r7
            ii r8 = (defpackage.ii) r8
            long r8 = r8.a
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00b6
            goto L_0x00cb
        L_0x00ca:
            r7 = r2
        L_0x00cb:
            ii r7 = (defpackage.ii) r7
            if (r7 == 0) goto L_0x00d5
            long r7 = r7.b
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
        L_0x00d5:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            r1.add(r0)
            goto L_0x0092
        L_0x00de:
            java.lang.String r10 = r10.f
            fn6 r11 = udd.e
            if (r11 != 0) goto L_0x00e5
            goto L_0x0105
        L_0x00e5:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x0105
            tn7 r12 = defpackage.tn7.X
            int r0 = r1.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " animojis for update"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r11.d(r12, r10, r0, r2)
        L_0x0105:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.a(gj, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.gj r10, defpackage.vt r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.si
            if (r0 == 0) goto L_0x0016
            r0 = r12
            si r0 = (defpackage.si) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x001b
        L_0x0016:
            si r0 = new si
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.util.Map r10 = r0.Z
            java.util.ArrayList r11 = r0.Y
            java.util.ArrayList r1 = r0.X
            gj r0 = r0.o
            wx3.H(r12)
            goto L_0x00a8
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            wx3.H(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r2 = r11.o
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x004e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r2.next()
            vsc r5 = (defpackage.vsc) r5
            java.util.List r5 = r5.n
            u23.K(r5, r4)
            goto L_0x004e
        L_0x0060:
            java.util.Map r11 = r11.x0
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0072
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0072
            hw4 r1 = hw4.a
            goto L_0x014a
        L_0x0072:
            r7e r2 = r10.h
            java.lang.Object r2 = r2.getValue()
            oj r2 = (defpackage.oj) r2
            r0.o = r10
            r0.X = r12
            r0.Y = r4
            r0.Z = r11
            r0.y0 = r3
            r2.getClass()
            java.lang.String r5 = "SELECT * FROM animoji_set"
            r6 = 0
            pec r5 = pec.a(r6, r5)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            uh r7 = new uh
            r8 = 2
            r7.<init>(r2, r8, r5)
            aec r2 = r2.a
            java.lang.Object r0 = r1g.g(r2, r6, r7, r0)
            if (r0 != r1) goto L_0x00a3
            goto L_0x014a
        L_0x00a3:
            r1 = r12
            r12 = r0
            r0 = r10
            r10 = r11
            r11 = r4
        L_0x00a8:
            java.util.List r12 = (java.util.List) r12
            boolean r2 = r12.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x00c0
            boolean r2 = r10.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00c0
            java.util.Set r10 = r10.keySet()
            r1.addAll(r10)
            goto L_0x0123
        L_0x00c0:
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x00d1
            boolean r2 = r11.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00d1
            r1.addAll(r11)
            goto L_0x0123
        L_0x00d1:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00d9:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0123
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Object r11 = r11.getValue()
            java.lang.Long r11 = (java.lang.Long) r11
            java.util.Iterator r3 = r12.iterator()
        L_0x00f5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0110
            java.lang.Object r5 = r3.next()
            r6 = r5
            nj r6 = (defpackage.nj) r6
            long r6 = r6.a
            if (r2 != 0) goto L_0x0107
            goto L_0x00f5
        L_0x0107:
            long r8 = r2.longValue()
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x00f5
            goto L_0x0111
        L_0x0110:
            r5 = r4
        L_0x0111:
            nj r5 = (defpackage.nj) r5
            if (r5 == 0) goto L_0x011f
            long r5 = r5.e
            long r7 = r11.longValue()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x00d9
        L_0x011f:
            r1.add(r2)
            goto L_0x00d9
        L_0x0123:
            java.lang.String r10 = r0.f
            fn6 r11 = udd.e
            if (r11 != 0) goto L_0x012a
            goto L_0x014a
        L_0x012a:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x014a
            tn7 r12 = defpackage.tn7.X
            int r0 = r1.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " animoji sets for update"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r11.d(r12, r10, r0, r4)
        L_0x014a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.b(gj, vt, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: l7c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: gj} */
    /* JADX WARNING: type inference failed for: r1v31, types: [l7c, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c0, code lost:
        r1 = new kcc(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c5, code lost:
        r0 = mcc.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c9, code lost:
        if (r0 != null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02cb, code lost:
        udd.s(r6.f, "Fail request reactions by ids.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d6, code lost:
        if ((!(r1 instanceof kcc)) != false) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d8, code lost:
        r2.o = r1;
        r2.X = null;
        r2.Y = null;
        r2.Z = null;
        r2.w0 = null;
        r2.z0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02f3, code lost:
        if (r6.m(r1.X, (defpackage.wzb) r4.a, r2) == r3) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0118, code lost:
        r4 = (defpackage.xzb) r0.i.getValue();
        r2.o = r0;
        r2.X = r9;
        r2.Y = r1;
        r2.Z = null;
        r2.z0 = 2;
        r4.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013f, code lost:
        if (r1g.h(r4.a, new defpackage.uh(r4, 18, (defpackage.wzb) r1.a), r2) != r3) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0143, code lost:
        r4 = r9;
        r9 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0146, code lost:
        r1 = r9.h();
        r10 = ((defpackage.wzb) r0.a).c;
        r2.o = r9;
        r2.X = r4;
        r2.Y = r0;
        r2.z0 = 3;
        r1 = r1.a(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015d, code lost:
        if (r1 != r3) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0161, code lost:
        r4 = (java.util.List) r1;
        r1 = new zb9((java.lang.Object) null);
        r11 = ((defpackage.wzb) r0.a).c.size();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0174, code lost:
        if (r12 >= r11) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0176, code lost:
        r13 = ((java.lang.Number) ((defpackage.wzb) r0.a).c.get(r12)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0188, code lost:
        if ((r4 instanceof java.util.Collection) == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018e, code lost:
        if (r4.isEmpty() == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0191, code lost:
        r15 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0199, code lost:
        if (r15.hasNext() == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a7, code lost:
        if (((defpackage.ii) r15.next()).a != r13) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ad, code lost:
        r1.a(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b0, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b5, code lost:
        r7 = r9.h();
        r2.o = r9;
        r2.X = r10;
        r2.Y = r0;
        r2.Z = r4;
        r2.w0 = r1;
        r2.z0 = 4;
        r7.getClass();
        r7 = r1g.g(r7.a, new android.os.CancellationSignal(), new defpackage.vh(r7, pec.a(0, "SELECT COUNT(*) FROM animoji"), 2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e0, code lost:
        if (r7 != r3) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e4, code lost:
        r17 = r4;
        r4 = r0;
        r0 = r1;
        r1 = r7;
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f1, code lost:
        if (((java.lang.Number) r1).intValue() != 0) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f3, code lost:
        r0.b(lp.V(r10.keySet()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ff, code lost:
        r1 = r10.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020b, code lost:
        if (r1.hasNext() == false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020d, code lost:
        r8 = (java.util.Map.Entry) r1.next();
        r10 = ((java.lang.Number) r8.getKey()).longValue();
        r12 = ((java.lang.Number) r8.getValue()).longValue();
        r8 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x022f, code lost:
        if (r8.hasNext() == false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0231, code lost:
        r14 = r8.next();
        r18 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x023e, code lost:
        if (((defpackage.ii) r14).a != r10) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0241, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0245, code lost:
        r18 = r7;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0248, code lost:
        r14 = (defpackage.ii) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024a, code lost:
        if (r14 == null) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0250, code lost:
        if (r14.b >= r12) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0252, code lost:
        r0.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0255, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025d, code lost:
        if (r0.i() == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025f, code lost:
        udd.q(r9.f, "Didn't have reactions for update, fill from db.");
        r0 = (g37) r9.k.T0(r9, p[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0273, code lost:
        if (r0 == null) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0279, code lost:
        if (r0.isActive() != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027b, code lost:
        r2.o = null;
        r2.X = null;
        r2.Y = null;
        r2.Z = null;
        r2.w0 = null;
        r2.z0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0291, code lost:
        if (r9.f((defpackage.wzb) r4.a, r2) != r3) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r1 = r9.a;
        r6 = new defpackage.dt(8, lp.T(r0));
        r2.o = r9;
        r2.X = r4;
        r2.Y = null;
        r2.Z = null;
        r2.w0 = null;
        r2.z0 = 6;
        r1 = ((defpackage.gy9) r1).K(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b5, code lost:
        if (r1 != r3) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b8, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r1 = (defpackage.ht) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02bc, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02be, code lost:
        r0 = th;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.gj r18, java.util.List r19, java.util.Map r20, kotlin.coroutines.Continuation r21) {
        /*
            r0 = r18
            r1 = r21
            r18.getClass()
            boolean r2 = r1 instanceof defpackage.aj
            if (r2 == 0) goto L_0x001a
            r2 = r1
            aj r2 = (defpackage.aj) r2
            int r3 = r2.z0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.z0 = r3
            goto L_0x001f
        L_0x001a:
            aj r2 = new aj
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.x0
            pu3 r3 = pu3.a
            int r4 = r2.z0
            jue r5 = jue.a
            r6 = 0
            r7 = 0
            r8 = 1
            switch(r4) {
                case 0: goto L_0x009c;
                case 1: goto L_0x0083;
                case 2: goto L_0x0074;
                case 3: goto L_0x0064;
                case 4: goto L_0x004c;
                case 5: goto L_0x0047;
                case 6: goto L_0x0035;
                case 7: goto L_0x0047;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            java.lang.Object r0 = r2.X
            r4 = r0
            l7c r4 = (l7c) r4
            java.lang.Object r0 = r2.o
            r6 = r0
            gj r6 = (defpackage.gj) r6
            wx3.H(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x02b9
        L_0x0044:
            r0 = move-exception
            goto L_0x02c0
        L_0x0047:
            wx3.H(r1)
            goto L_0x0111
        L_0x004c:
            zb9 r0 = r2.w0
            java.lang.Object r4 = r2.Z
            java.util.List r4 = (java.util.List) r4
            l7c r9 = r2.Y
            java.lang.Object r10 = r2.X
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r2.o
            gj r11 = (defpackage.gj) r11
            wx3.H(r1)
            r7 = r4
            r4 = r9
            r9 = r11
            goto L_0x01eb
        L_0x0064:
            l7c r0 = r2.Y
            java.lang.Object r4 = r2.X
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r9 = r2.o
            gj r9 = (defpackage.gj) r9
            wx3.H(r1)
        L_0x0071:
            r10 = r4
            goto L_0x0161
        L_0x0074:
            l7c r0 = r2.Y
            java.lang.Object r4 = r2.X
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r9 = r2.o
            gj r9 = (defpackage.gj) r9
            wx3.H(r1)
            goto L_0x0146
        L_0x0083:
            java.lang.Object r0 = r2.Z
            l7c r0 = (l7c) r0
            l7c r4 = r2.Y
            java.lang.Object r9 = r2.X
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r10 = r2.o
            gj r10 = (defpackage.gj) r10
            wx3.H(r1)
            r17 = r1
            r1 = r0
            r0 = r10
            r10 = r4
            r4 = r17
            goto L_0x0104
        L_0x009c:
            wx3.H(r1)
            l7c r1 = new l7c
            r1.<init>()
            java.util.Iterator r4 = r19.iterator()
        L_0x00a8:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00ca
            java.lang.Object r9 = r4.next()
            r10 = r9
            vsc r10 = (defpackage.vsc) r10
            bqc r11 = r10.a
            bqc r12 = defpackage.bqc.y0
            boolean r11 = hhd.f(r11, r12)
            if (r11 == 0) goto L_0x00a8
            java.lang.String r10 = r10.b
            java.lang.String r11 = "POPULAR"
            boolean r10 = hhd.f(r10, r11)
            if (r10 == 0) goto L_0x00a8
            goto L_0x00cb
        L_0x00ca:
            r9 = r7
        L_0x00cb:
            vsc r9 = (defpackage.vsc) r9
            if (r9 == 0) goto L_0x00db
            wzb r4 = new wzb
            java.lang.String r10 = r9.b
            java.util.List r11 = r9.f
            long r12 = r9.j
            r4.<init>(r12, r10, r11)
            goto L_0x00dc
        L_0x00db:
            r4 = r7
        L_0x00dc:
            r1.a = r4
            if (r4 != 0) goto L_0x0116
            java.lang.String r4 = r0.f
            java.lang.String r9 = "Didn't find section with Reactions from backend response"
            udd.q(r4, r9)
            r7e r4 = r0.i
            java.lang.Object r4 = r4.getValue()
            xzb r4 = (defpackage.xzb) r4
            r2.o = r0
            r9 = r20
            r2.X = r9
            r2.Y = r1
            r2.Z = r1
            r2.z0 = r8
            java.lang.Object r4 = r4.a(r2)
            if (r4 != r3) goto L_0x0103
            goto L_0x02f5
        L_0x0103:
            r10 = r1
        L_0x0104:
            r1.a = r4
            java.lang.Object r1 = r10.a
            if (r1 != 0) goto L_0x0114
            java.lang.String r0 = r0.f
            java.lang.String r1 = "Didn't find section with Reactions in database"
            udd.q(r0, r1)
        L_0x0111:
            r3 = r5
            goto L_0x02f5
        L_0x0114:
            r1 = r10
            goto L_0x0118
        L_0x0116:
            r9 = r20
        L_0x0118:
            r7e r4 = r0.i
            java.lang.Object r4 = r4.getValue()
            xzb r4 = (defpackage.xzb) r4
            java.lang.Object r10 = r1.a
            wzb r10 = (defpackage.wzb) r10
            r2.o = r0
            r2.X = r9
            r2.Y = r1
            r2.Z = r7
            r11 = 2
            r2.z0 = r11
            r4.getClass()
            uh r11 = new uh
            r12 = 18
            r11.<init>(r4, r12, r10)
            aec r4 = r4.a
            java.lang.Object r4 = r1g.h(r4, r11, r2)
            if (r4 != r3) goto L_0x0143
            goto L_0x02f5
        L_0x0143:
            r4 = r9
            r9 = r0
            r0 = r1
        L_0x0146:
            wh r1 = r9.h()
            java.lang.Object r10 = r0.a
            wzb r10 = (defpackage.wzb) r10
            java.util.List r10 = r10.c
            r2.o = r9
            r2.X = r4
            r2.Y = r0
            r11 = 3
            r2.z0 = r11
            java.lang.Object r1 = r1.a(r10, r2)
            if (r1 != r3) goto L_0x0071
            goto L_0x02f5
        L_0x0161:
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            zb9 r1 = new zb9
            r1.<init>(r7)
            java.lang.Object r11 = r0.a
            wzb r11 = (defpackage.wzb) r11
            java.util.List r11 = r11.c
            int r11 = r11.size()
            r12 = r6
        L_0x0174:
            if (r12 >= r11) goto L_0x01b5
            java.lang.Object r13 = r0.a
            wzb r13 = (defpackage.wzb) r13
            java.util.List r13 = r13.c
            java.lang.Object r13 = r13.get(r12)
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            boolean r15 = r4 instanceof java.util.Collection
            if (r15 == 0) goto L_0x0191
            boolean r15 = r4.isEmpty()
            if (r15 == 0) goto L_0x0191
            goto L_0x01ad
        L_0x0191:
            java.util.Iterator r15 = r4.iterator()
        L_0x0195:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x01ad
            java.lang.Object r16 = r15.next()
            r8 = r16
            ii r8 = (defpackage.ii) r8
            long r7 = r8.a
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x01aa
            goto L_0x01b0
        L_0x01aa:
            r7 = 0
            r8 = 1
            goto L_0x0195
        L_0x01ad:
            r1.a(r13)
        L_0x01b0:
            int r12 = r12 + 1
            r7 = 0
            r8 = 1
            goto L_0x0174
        L_0x01b5:
            wh r7 = r9.h()
            r2.o = r9
            r2.X = r10
            r2.Y = r0
            r2.Z = r4
            r2.w0 = r1
            r8 = 4
            r2.z0 = r8
            r7.getClass()
            java.lang.String r8 = "SELECT COUNT(*) FROM animoji"
            pec r8 = pec.a(r6, r8)
            android.os.CancellationSignal r11 = new android.os.CancellationSignal
            r11.<init>()
            vh r12 = new vh
            r13 = 2
            r12.<init>(r7, r8, r13)
            aec r7 = r7.a
            java.lang.Object r7 = r1g.g(r7, r11, r12, r2)
            if (r7 != r3) goto L_0x01e4
            goto L_0x02f5
        L_0x01e4:
            r17 = r4
            r4 = r0
            r0 = r1
            r1 = r7
            r7 = r17
        L_0x01eb:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x01ff
            java.util.Set r1 = r10.keySet()
            zb9 r1 = lp.V(r1)
            r0.b(r1)
            goto L_0x0259
        L_0x01ff:
            java.util.Set r1 = r10.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0207:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0259
            java.lang.Object r8 = r1.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getKey()
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            long r12 = r8.longValue()
            java.util.Iterator r8 = r7.iterator()
        L_0x022b:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x0245
            java.lang.Object r14 = r8.next()
            r15 = r14
            ii r15 = (defpackage.ii) r15
            r18 = r7
            long r6 = r15.a
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0241
            goto L_0x0248
        L_0x0241:
            r7 = r18
            r6 = 0
            goto L_0x022b
        L_0x0245:
            r18 = r7
            r14 = 0
        L_0x0248:
            ii r14 = (defpackage.ii) r14
            if (r14 == 0) goto L_0x0252
            long r6 = r14.b
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x0255
        L_0x0252:
            r0.a(r10)
        L_0x0255:
            r7 = r18
            r6 = 0
            goto L_0x0207
        L_0x0259:
            boolean r1 = r0.i()
            if (r1 == 0) goto L_0x0294
            java.lang.String r0 = r9.f
            java.lang.String r1 = "Didn't have reactions for update, fill from db."
            udd.q(r0, r1)
            k77[] r0 = p
            r1 = 0
            r0 = r0[r1]
            e3 r1 = r9.k
            java.lang.Object r0 = r1.T0(r9, r0)
            g37 r0 = (g37) r0
            if (r0 == 0) goto L_0x027b
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L_0x0111
        L_0x027b:
            java.lang.Object r0 = r4.a
            wzb r0 = (defpackage.wzb) r0
            r1 = 0
            r2.o = r1
            r2.X = r1
            r2.Y = r1
            r2.Z = r1
            r2.w0 = r1
            r1 = 5
            r2.z0 = r1
            java.lang.Object r0 = r9.f(r0, r2)
            if (r0 != r3) goto L_0x0111
            goto L_0x02f5
        L_0x0294:
            pk r1 = r9.a     // Catch:{ all -> 0x02be }
            dt r6 = new dt     // Catch:{ all -> 0x02be }
            long[] r0 = lp.T(r0)     // Catch:{ all -> 0x02be }
            r7 = 8
            r6.<init>((int) r7, (long[]) r0)     // Catch:{ all -> 0x02be }
            r2.o = r9     // Catch:{ all -> 0x02be }
            r2.X = r4     // Catch:{ all -> 0x02be }
            r7 = 0
            r2.Y = r7     // Catch:{ all -> 0x02be }
            r2.Z = r7     // Catch:{ all -> 0x02be }
            r2.w0 = r7     // Catch:{ all -> 0x02be }
            r0 = 6
            r2.z0 = r0     // Catch:{ all -> 0x02be }
            gy9 r1 = (defpackage.gy9) r1     // Catch:{ all -> 0x02be }
            java.lang.Object r1 = r1.K(r6, r2)     // Catch:{ all -> 0x02be }
            if (r1 != r3) goto L_0x02b8
            goto L_0x02f5
        L_0x02b8:
            r6 = r9
        L_0x02b9:
            ht r1 = (defpackage.ht) r1     // Catch:{ all -> 0x0044 }
            goto L_0x02c5
        L_0x02bc:
            r6 = r9
            goto L_0x02c0
        L_0x02be:
            r0 = move-exception
            goto L_0x02bc
        L_0x02c0:
            kcc r1 = new kcc
            r1.<init>(r0)
        L_0x02c5:
            java.lang.Throwable r0 = mcc.a(r1)
            if (r0 == 0) goto L_0x02d2
            java.lang.String r7 = r6.f
            java.lang.String r8 = "Fail request reactions by ids."
            udd.s(r7, r8, r0)
        L_0x02d2:
            boolean r0 = r1 instanceof kcc
            r7 = 1
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x0111
            r0 = r1
            ht r0 = (defpackage.ht) r0
            java.util.List r0 = r0.X
            java.lang.Object r4 = r4.a
            wzb r4 = (defpackage.wzb) r4
            r2.o = r1
            r1 = 0
            r2.X = r1
            r2.Y = r1
            r2.Z = r1
            r2.w0 = r1
            r1 = 7
            r2.z0 = r1
            java.lang.Object r0 = r6.m(r0, r4, r2)
            if (r0 != r3) goto L_0x0111
        L_0x02f5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.c(gj, java.util.List, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static ph l(ii iiVar) {
        return new ph(iiVar.a, iiVar.c, iiVar.d, iiVar.e, iiVar.g);
    }

    public final void d() {
        ((lqc) this.c).k("user.reactionsLastSync", 0L);
        wh h2 = h();
        aec aec = h2.a;
        aec.b();
        th thVar = h2.c;
        yz5 f2 = thVar.f();
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            thVar.u(f2);
            oj ojVar = (oj) this.h.getValue();
            aec aec2 = ojVar.a;
            aec2.b();
            th thVar2 = ojVar.c;
            yz5 f3 = thVar2.f();
            try {
                aec2.c();
                f3.n();
                aec2.r();
                aec2.l();
                thVar2.u(f3);
                xzb xzb = (xzb) this.i.getValue();
                aec aec3 = xzb.a;
                aec3.b();
                yv8 yv8 = xzb.c;
                yz5 f4 = yv8.f();
                try {
                    aec3.c();
                    f4.n();
                    aec3.r();
                    aec3.l();
                    yv8.u(f4);
                } catch (Throwable th) {
                    yv8.u(f4);
                    throw th;
                }
            } catch (Throwable th2) {
                thVar2.u(f3);
                throw th2;
            }
        } catch (Throwable th3) {
            thVar.u(f2);
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r4 = xs7.U(r4.d.a(), new defpackage.wi(r4, r5, (kotlin.coroutines.Continuation) null), r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(zb9 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r5.i()
            jue r1 = jue.a
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            pae r0 = r4.d
            n3a r0 = (n3a) r0
            ju3 r0 = r0.a()
            wi r2 = new wi
            r3 = 0
            r2.<init>(r4, r5, r3)
            java.lang.Object r4 = xs7.U(r0, r2, r6)
            pu3 r5 = pu3.a
            if (r4 != r5) goto L_0x0020
            return r4
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.e(zb9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(defpackage.wzb r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.xi
            if (r0 == 0) goto L_0x0013
            r0 = r12
            xi r0 = (defpackage.xi) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            xi r0 = new xi
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r5) goto L_0x002c
            wx3.H(r12)
            goto L_0x0078
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            wzb r11 = r0.X
            gj r10 = r0.o
            wx3.H(r12)
            goto L_0x0057
        L_0x003c:
            wx3.H(r12)
            java.util.concurrent.CopyOnWriteArrayList r12 = r10.o
            r12.clear()
            wh r12 = r10.h()
            java.util.List r2 = r11.c
            r0.o = r10
            r0.X = r11
            r0.w0 = r4
            java.lang.Object r12 = r12.a(r2, r0)
            if (r12 != r1) goto L_0x0057
            return r1
        L_0x0057:
            java.util.List r12 = (java.util.List) r12
            boolean r2 = r12.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0079
            java.util.List r11 = r11.c
            java.util.concurrent.CopyOnWriteArrayList r12 = r10.o
            r12.addAll(r11)
            zb9 r11 = lp.V(r11)
            r0.o = r4
            r0.X = r4
            r0.w0 = r5
            java.lang.Object r10 = r10.e(r11, r0)
            if (r10 != r1) goto L_0x0078
            return r1
        L_0x0078:
            return r3
        L_0x0079:
            java.util.List r0 = r11.c
            int r0 = r0.size()
            r1 = 0
        L_0x0080:
            if (r1 >= r0) goto L_0x00bf
            java.util.List r2 = r11.c
            java.lang.Object r2 = r2.get(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            java.util.concurrent.CopyOnWriteArrayList r2 = r10.o
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r2.add(r7)
            java.util.Iterator r2 = r12.iterator()
        L_0x009c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00b0
            java.lang.Object r7 = r2.next()
            r8 = r7
            ii r8 = (defpackage.ii) r8
            long r8 = r8.a
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x009c
            goto L_0x00b1
        L_0x00b0:
            r7 = r4
        L_0x00b1:
            ii r7 = (defpackage.ii) r7
            if (r7 == 0) goto L_0x00bc
            ph r2 = l(r7)
            r10.j(r2)
        L_0x00bc:
            int r1 = r1 + 1
            goto L_0x0080
        L_0x00bf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.f(wzb, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ph g(String str) {
        Object obj;
        if (str.length() == 0) {
            return null;
        }
        Iterator it = this.n.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ph phVar = (ph) ((mc9) obj).getValue();
            if (hhd.f(phVar != null ? phVar.b : null, str)) {
                break;
            }
        }
        mc9 mc9 = (mc9) obj;
        if (mc9 != null) {
            return (ph) mc9.getValue();
        }
        return null;
    }

    public final wh h() {
        return (wh) this.g.getValue();
    }

    public final mc9 i(long j2) {
        return (mc9) this.n.computeIfAbsent(Long.valueOf(j2), new di(1, new o8(9)));
    }

    public final void j(ph phVar) {
        Object value;
        mc9 i2 = i(phVar.a);
        do {
            value = i2.getValue();
            ph phVar2 = (ph) value;
        } while (!i2.b(value, phVar));
    }

    public final void k() {
        ru3 ru3 = ru3.b;
        cj cjVar = new cj(this, (Continuation) null);
        ContextScope contextScope = this.j;
        qod E = xs7.E(contextScope, (hu3) null, ru3, cjVar, 1);
        k77[] k77Arr = p;
        this.l.o1(this, k77Arr[1], E);
        if (this.e.a()) {
            qod E2 = xs7.E(contextScope, (hu3) null, ru3, new bj(this, (Continuation) null), 1);
            this.m.o1(this, k77Arr[2], E2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0156 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(java.util.List r21, defpackage.wzb r22, kotlin.coroutines.Continuation r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            boolean r2 = r1 instanceof defpackage.dj
            if (r2 == 0) goto L_0x0017
            r2 = r1
            dj r2 = (defpackage.dj) r2
            int r3 = r2.x0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x0 = r3
            goto L_0x001c
        L_0x0017:
            dj r2 = new dj
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Z
            pu3 r3 = pu3.a
            int r4 = r2.x0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0045
            if (r4 == r7) goto L_0x0038
            if (r4 != r6) goto L_0x0030
            wx3.H(r1)
            goto L_0x0157
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            wzb r0 = r2.Y
            java.util.List r4 = r2.X
            gj r7 = r2.o
            wx3.H(r1)
            r9 = r0
            r0 = r7
            goto L_0x00b9
        L_0x0045:
            wx3.H(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r21.iterator()
        L_0x0051:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x008b
            java.lang.Object r8 = r4.next()
            oh r8 = (defpackage.oh) r8
            if (r8 == 0) goto L_0x0084
            ii r19 = new ii
            long r10 = r8.a
            long r12 = r8.d
            java.lang.Long r17 = java.lang.Long.valueOf(r12)
            java.lang.String r15 = r8.f
            java.lang.String r14 = r8.g
            long r12 = r8.b
            java.lang.String r9 = r8.c
            java.lang.String r8 = r8.e
            r16 = r9
            r9 = r19
            r18 = r14
            r14 = r16
            r16 = r15
            r15 = r8
            r9.<init>(r10, r12, r14, r15, r16, r17, r18)
            r8 = r19
            goto L_0x0085
        L_0x0084:
            r8 = r5
        L_0x0085:
            if (r8 == 0) goto L_0x0051
            r1.add(r8)
            goto L_0x0051
        L_0x008b:
            boolean r4 = r1.isEmpty()
            r4 = r4 ^ r7
            if (r4 == 0) goto L_0x00b4
            wh r4 = r20.h()
            r2.o = r0
            r8 = r21
            r2.X = r8
            r9 = r22
            r2.Y = r9
            r2.x0 = r7
            r4.getClass()
            uh r7 = new uh
            r10 = 0
            r7.<init>(r4, r10, r1)
            aec r1 = r4.a
            java.lang.Object r1 = r1g.h(r1, r7, r2)
            if (r1 != r3) goto L_0x00b8
            return r3
        L_0x00b4:
            r8 = r21
            r9 = r22
        L_0x00b8:
            r4 = r8
        L_0x00b9:
            r0.getClass()
            k77[] r1 = p
            r7 = 0
            r1 = r1[r7]
            e3 r7 = r0.k
            java.lang.Object r1 = r7.T0(r0, r1)
            g37 r1 = (g37) r1
            if (r1 == 0) goto L_0x00ce
            r1.cancel(r5)
        L_0x00ce:
            java.lang.String r1 = r0.f
            java.lang.String r7 = "updateReactions"
            udd.q(r1, r7)
            zb9 r1 = new zb9
            int r7 = r4.size()
            r1.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x00e2:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00f6
            java.lang.Object r7 = r4.next()
            oh r7 = (defpackage.oh) r7
            if (r7 == 0) goto L_0x00e2
            long r7 = r7.a
            r1.a(r7)
            goto L_0x00e2
        L_0x00f6:
            java.util.concurrent.ConcurrentHashMap r4 = r0.n
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0100:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0148
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Number r8 = (java.lang.Number) r8
            long r10 = r8.longValue()
            java.lang.Object r7 = r7.getValue()
            mc9 r7 = (mc9) r7
            boolean r8 = r1.d(r10)
            if (r8 == 0) goto L_0x0100
            java.lang.String r8 = r0.f
            fn6 r12 = udd.e
            if (r12 != 0) goto L_0x0129
            goto L_0x013a
        L_0x0129:
            boolean r13 = r12.c()
            if (r13 == 0) goto L_0x013a
            tn7 r13 = defpackage.tn7.X
            java.lang.String r14 = "set null for #"
            java.lang.String r10 = defpackage.us8.i(r10, r14)
            r12.d(r13, r8, r10, r5)
        L_0x013a:
            java.lang.Object r8 = r7.getValue()
            r10 = r8
            ph r10 = (defpackage.ph) r10
            boolean r8 = r7.b(r8, r5)
            if (r8 == 0) goto L_0x013a
            goto L_0x0100
        L_0x0148:
            r2.o = r5
            r2.X = r5
            r2.Y = r5
            r2.x0 = r6
            java.lang.Object r0 = r0.f(r9, r2)
            if (r0 != r3) goto L_0x0157
            return r3
        L_0x0157:
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.m(java.util.List, wzb, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
