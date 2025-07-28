package defpackage;

import android.accounts.Account;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h2d  reason: default package */
public final class h2d implements yx4, s3e {
    public final Object X;
    public final Object Y;
    public Object Z;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object o;

    public h2d(int i) {
        switch (i) {
            case 3:
                this.a = new le4(0);
                this.b = new le4(0);
                this.c = new le4(0);
                this.o = new le4(0);
                this.X = new le4(0);
                this.Y = new le4(0);
                this.Z = new ygd();
                return;
            default:
                this.a = new AtomicInteger(0);
                this.b = new AtomicInteger(0);
                this.c = new AtomicInteger(0);
                this.o = new AtomicInteger(0);
                this.X = new AtomicInteger(0);
                this.Y = new AtomicInteger(0);
                this.Z = new AtomicInteger(0);
                new ConcurrentHashMap();
                return;
        }
    }

    public zx4 a(int i) {
        ma0 ma0;
        f90 f90;
        Object obj;
        lw1 lw1;
        h2d h2d = this;
        int i2 = i;
        HashMap hashMap = (HashMap) h2d.Y;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (zx4) hashMap.get(Integer.valueOf(i));
        }
        yx4 yx4 = (yx4) h2d.a;
        zx4 r = yx4.r(i2);
        HashSet hashSet = (HashSet) h2d.b;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                ma0 = null;
                break;
            }
            ma0 = (ma0) it.next();
            if (ma0.a == i2) {
                break;
            }
        }
        if (ma0 != null) {
            HashSet hashSet2 = (HashSet) h2d.o;
            if (r != null) {
                Iterator it2 = hashSet2.iterator();
                loop1:
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    zq4 zq4 = (zq4) it2.next();
                    Iterator it3 = r.d().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break loop1;
                        } else if (cr4.a((g90) it3.next(), zq4)) {
                        }
                    }
                }
            }
            e07.k(hashSet.contains(ma0));
            zx4 r2 = yx4.r(ma0.a);
            Iterator it4 = ma0.c.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    f90 = null;
                    break;
                }
                Size size = (Size) it4.next();
                if (((HashSet) h2d.c).contains(size)) {
                    TreeMap treeMap = new TreeMap(new d63(false));
                    ArrayList arrayList = new ArrayList();
                    Iterator it5 = hashSet2.iterator();
                    while (it5.hasNext()) {
                        zq4 zq42 = (zq4) it5.next();
                        if (r2 != null) {
                            Iterator it6 = r2.d().iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (cr4.a((g90) it6.next(), zq42)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        HashMap hashMap2 = (HashMap) h2d.Z;
                        if (hashMap2.containsKey(zq42)) {
                            lw1 = (lw1) hashMap2.get(zq42);
                            Objects.requireNonNull(lw1);
                        } else {
                            lw1 lw12 = new lw1(new w4g(yx4, zq42));
                            hashMap2.put(zq42, lw12);
                            lw1 = lw12;
                        }
                        nb0 a2 = lw1.a(size);
                        if (a2 != null) {
                            g90 g90 = a2.f;
                            q3f q3f = (q3f) ((t26) h2d.X).apply(t2f.d(g90));
                            if (q3f != null) {
                                if (!q3f.Q0(size.getWidth(), size.getHeight())) {
                                    h2d = this;
                                } else {
                                    treeMap.put(new Size(g90.e, g90.f), a2);
                                    arrayList.add(x87.D(g90, size, q3f.b1()));
                                }
                            }
                            h2d = this;
                            int i3 = i;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Size size2 = hjd.a;
                        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
                        if (ceilingEntry != null) {
                            obj = ceilingEntry.getValue();
                        } else {
                            Map.Entry floorEntry = treeMap.floorEntry(size);
                            obj = floorEntry != null ? floorEntry.getValue() : null;
                        }
                        zx4 zx4 = (zx4) obj;
                        Objects.requireNonNull(zx4);
                        f90 = f90.e(zx4.a(), zx4.b(), zx4.c(), arrayList);
                    } else {
                        h2d = this;
                        int i4 = i;
                    }
                }
            }
            if (r == null && f90 == null) {
                r = null;
            } else {
                int a3 = r != null ? r.a() : f90.a;
                int b2 = r != null ? r.b() : f90.b;
                List c2 = r != null ? r.c() : f90.c;
                ArrayList arrayList2 = new ArrayList();
                if (r != null) {
                    arrayList2.addAll(r.d());
                }
                if (f90 != null) {
                    arrayList2.addAll(f90.d);
                }
                r = f90.e(a3, b2, c2, arrayList2);
            }
        }
        hashMap.put(Integer.valueOf(i), r);
        return r;
    }

    public void b() {
        ((le4) this.a).a = -1;
        ((le4) this.b).a = -1;
        ((le4) this.c).a = -1;
        ((le4) this.o).a = -1;
        ((le4) this.X).a = -1;
        ((le4) this.Y).a = -1;
    }

    public Object get() {
        g90 g90 = (g90) this.X;
        int i = g90.d;
        Range range = y4e.p;
        Range range2 = (Range) this.Z;
        int intValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(i))).intValue() : i;
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf(i);
        boolean equals = Objects.equals(range2, range);
        Object obj = range2;
        if (!equals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", new Object[]{valueOf, valueOf2, obj});
        Range range3 = ((mb0) this.c).c;
        int i2 = ((zq4) this.Y).b;
        Size size = (Size) this.o;
        int i3 = intValue;
        int c2 = t2f.c(g90.c, i2, g90.h, i3, g90.d, size.getWidth(), g90.e, size.getHeight(), g90.f, range3);
        String str = (String) this.a;
        int i4 = g90.g;
        jb0 a2 = t2f.a(i4, str);
        km4 d = ib0.d();
        if (str != null) {
            d.a = str;
            kje kje = (kje) this.b;
            if (kje != null) {
                d.c = kje;
                d.o = size;
                d.x0 = Integer.valueOf(c2);
                d.Z = Integer.valueOf(intValue);
                d.b = Integer.valueOf(i4);
                d.Y = a2;
                return d.b();
            }
            throw new NullPointerException("Null inputTimebase");
        }
        throw new NullPointerException("Null mimeType");
    }

    public boolean o(int i) {
        return a(i) != null;
    }

    public zx4 r(int i) {
        return a(i);
    }

    public h2d(Account account, Set set, String str, String str2) {
        efd efd = efd.a;
        this.a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.o = str;
        this.X = str2;
        this.Y = efd;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.c = Collections.unmodifiableSet(hashSet);
        } else {
            hr1.r(it.next());
            throw null;
        }
    }

    public h2d(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, r7e r7e) {
        this.a = new g2d(t97);
        this.b = t972;
        this.c = t973;
        this.o = r7e;
        this.X = t975;
        this.Y = t976;
        this.Z = new r7e(new r9c(1, t974));
    }

    public h2d(String str, kje kje, mb0 mb0, Size size, g90 g90, zq4 zq4, Range range) {
        this.a = str;
        this.b = kje;
        this.c = mb0;
        this.o = size;
        this.X = g90;
        this.Y = zq4;
        this.Z = range;
    }

    public h2d(f2b f2b, ArrayList arrayList, Set set, List list) {
        sr1 sr1 = r3f.o;
        this.Y = new HashMap();
        this.Z = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zq4 zq4 = (zq4) it.next();
            if (!zq4.b()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + zq4);
            }
        }
        this.a = f2b;
        this.b = new HashSet(arrayList);
        this.o = new HashSet(set);
        this.c = new HashSet(list);
        this.X = sr1;
    }
}
