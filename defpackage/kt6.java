package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: kt6  reason: default package */
public final class kt6 extends zs6 implements NavigableMap {
    public static final og9 w0;
    public static final kt6 x0;
    public final transient l8c X;
    public final transient ws6 Y;
    public final transient kt6 Z;

    static {
        og9 og9 = og9.a;
        w0 = og9;
        l8c n = lt6.n(og9);
        po5 po5 = ws6.b;
        x0 = new kt6(n, e8c.X, (kt6) null);
    }

    public kt6(l8c l8c, ws6 ws6, kt6 kt6) {
        this.X = l8c;
        this.Y = ws6;
        this.Z = kt6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kt6 k(java.util.TreeMap r11) {
        /*
            java.util.Comparator r0 = r11.comparator()
            r1 = 1
            og9 r2 = w0
            if (r0 != 0) goto L_0x000b
            r0 = r1
            goto L_0x000f
        L_0x000b:
            boolean r0 = r2.equals(r0)
        L_0x000f:
            java.util.Set r11 = r11.entrySet()
            java.util.Map$Entry[] r3 = defpackage.zs6.o
            boolean r4 = r11 instanceof java.util.Collection
            if (r4 == 0) goto L_0x001a
            goto L_0x0035
        L_0x001a:
            java.util.Iterator r11 = r11.iterator()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11.getClass()
        L_0x0026:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r11.next()
            r4.add(r5)
            goto L_0x0026
        L_0x0034:
            r11 = r4
        L_0x0035:
            java.lang.Object[] r11 = r11.toArray(r3)
            java.util.Map$Entry[] r11 = (java.util.Map.Entry[]) r11
            int r3 = r11.length
            if (r3 == 0) goto L_0x00fa
            r4 = 0
            r5 = 0
            if (r3 == r1) goto L_0x00d6
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Object[] r7 = new java.lang.Object[r3]
            if (r0 == 0) goto L_0x0061
        L_0x0048:
            if (r4 >= r3) goto L_0x00c3
            r0 = r11[r4]
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            defpackage.ete.j(r1, r0)
            r6[r4] = r1
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0061:
            h63 r0 = new h63
            r8 = 1
            r0.<init>(r2, r8)
            java.util.Arrays.sort(r11, r4, r3, r0)
            r0 = r11[r4]
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r8 = r0.getKey()
            r6[r4] = r8
            java.lang.Object r0 = r0.getValue()
            r7[r4] = r0
            r4 = r6[r4]
            defpackage.ete.j(r4, r0)
        L_0x0080:
            if (r1 >= r3) goto L_0x00c3
            int r0 = r1 + -1
            r0 = r11[r0]
            java.util.Objects.requireNonNull(r0)
            r4 = r11[r1]
            java.util.Objects.requireNonNull(r4)
            java.lang.Object r9 = r4.getKey()
            java.lang.Object r10 = r4.getValue()
            defpackage.ete.j(r9, r10)
            r6[r1] = r9
            r7[r1] = r10
            int r8 = r2.compare(r8, r9)
            if (r8 == 0) goto L_0x00a7
            int r1 = r1 + 1
            r8 = r9
            goto L_0x0080
        L_0x00a7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Multiple entries with same key: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L_0x00c3:
            kt6 r11 = new kt6
            l8c r0 = new l8c
            e8c r1 = defpackage.ws6.h(r3, r6)
            r0.<init>(r1, r2)
            e8c r1 = defpackage.ws6.h(r3, r7)
            r11.<init>(r0, r1, r5)
            goto L_0x00fe
        L_0x00d6:
            r11 = r11[r4]
            java.util.Objects.requireNonNull(r11)
            java.lang.Object r0 = r11.getKey()
            java.lang.Object r11 = r11.getValue()
            kt6 r1 = new kt6
            l8c r3 = new l8c
            e8c r0 = defpackage.ws6.n(r0)
            r2.getClass()
            r3.<init>(r0, r2)
            e8c r11 = defpackage.ws6.n(r11)
            r1.<init>(r3, r11, r5)
            r11 = r1
            goto L_0x00fe
        L_0x00fa:
            kt6 r11 = l(r2)
        L_0x00fe:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt6.k(java.util.TreeMap):kt6");
    }

    public static kt6 l(Comparator comparator) {
        return og9.a.equals(comparator) ? x0 : new kt6(lt6.n(comparator), e8c.X, (kt6) null);
    }

    public static kt6 o() {
        return x0;
    }

    public final gt6 c() {
        if (!isEmpty()) {
            return new jt6(this);
        }
        int i = gt6.c;
        return k8c.y0;
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    public final Comparator comparator() {
        return this.X.o;
    }

    public final gt6 d() {
        throw new AssertionError("should never be called");
    }

    public final NavigableSet descendingKeySet() {
        return this.X.descendingSet();
    }

    public final NavigableMap descendingMap() {
        kt6 kt6 = this.Z;
        if (kt6 != null) {
            return kt6;
        }
        boolean isEmpty = isEmpty();
        l8c l8c = this.X;
        return isEmpty ? l(kga.a(l8c.o).b()) : new kt6((l8c) l8c.descendingSet(), this.Y.q(), this);
    }

    public final ns6 e() {
        throw new AssertionError("should never be called");
    }

    public final Set entrySet() {
        return super.entrySet();
    }

    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().a().get(0);
    }

    public final Object firstKey() {
        return this.X.first();
    }

    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    public final boolean g() {
        return this.X.Y.f() || this.Y.f();
    }

    public final Object get(Object obj) {
        int indexOf = this.X.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.Y.get(indexOf);
    }

    public final gt6 h() {
        return this.X;
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    public final ns6 i() {
        return this.Y;
    }

    public final Set keySet() {
        return this.X;
    }

    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().a().get(this.Y.size() - 1);
    }

    public final Object lastKey() {
        return this.X.last();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    public final kt6 m(int i, int i2) {
        ws6 ws6 = this.Y;
        if (i == 0 && i2 == ws6.size()) {
            return this;
        }
        l8c l8c = this.X;
        return i == i2 ? l(l8c.o) : new kt6(l8c.p(i, i2), ws6.subList(i, i2), (kt6) null);
    }

    /* renamed from: n */
    public final kt6 headMap(Object obj, boolean z) {
        obj.getClass();
        return m(0, this.X.q(obj, z));
    }

    public final NavigableSet navigableKeySet() {
        return this.X;
    }

    /* renamed from: p */
    public final kt6 subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.X.o.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        throw new IllegalArgumentException(n06.x("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public final kt6 tailMap(Object obj, boolean z) {
        obj.getClass();
        return m(this.X.r(obj, z), this.Y.size());
    }

    public final int size() {
        return this.Y.size();
    }

    public final Collection values() {
        return this.Y;
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
