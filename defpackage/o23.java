package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: o23  reason: default package */
public abstract class o23 extends u23 {
    public static final int P(int i, List list) {
        if (i >= 0 && i <= p23.A(list)) {
            return p23.A(list) - i;
        }
        StringBuilder m = me4.m(i, "Element index ", " must be in range [");
        m.append(new dz6(0, p23.A(list), 1));
        m.append("].");
        throw new IndexOutOfBoundsException(m.toString());
    }

    public static final int Q(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder m = me4.m(i, "Position index ", " must be in range [");
        m.append(new dz6(0, list.size(), 1));
        m.append("].");
        throw new IndexOutOfBoundsException(m.toString());
    }

    public static boolean R(Iterable iterable, Object obj) {
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : Z(iterable, obj) >= 0;
    }

    public static List S(int i, List list) {
        if (i >= 0) {
            int size = list.size() - i;
            if (size < 0) {
                size = 0;
            }
            return n0(list, size);
        }
        throw new IllegalArgumentException(rf0.f(i, "Requested element count ", " is less than zero.").toString());
    }

    public static List T(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static Object U(Iterable iterable) {
        if (iterable instanceof List) {
            return V((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object V(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object W(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object X(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object Y(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int Z(Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                p23.G();
                throw null;
            } else if (hhd.f(obj, next)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static final void a0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u16 u16) {
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            xy6.a(appendable, next, u16);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void b0(Collection collection, Appendable appendable, int i, u16 u16, int i2) {
        if ((i2 & 16) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            u16 = null;
        }
        a0(collection, appendable, "\n", BuildConfig.FLAVOR, BuildConfig.FLAVOR, i3, "...", u16);
    }

    public static String c0(Iterable iterable, String str, String str2, String str3, u16 u16, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? BuildConfig.FLAVOR : str2;
        String str6 = (i & 4) != 0 ? BuildConfig.FLAVOR : str3;
        if ((i & 32) != 0) {
            u16 = null;
        }
        StringBuilder sb = new StringBuilder();
        a0(iterable, sb, str4, str5, str6, -1, "...", u16);
        return sb.toString();
    }

    public static Object d0(Iterable iterable) {
        if (iterable instanceof List) {
            return e0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object e0(List list) {
        if (!list.isEmpty()) {
            return list.get(p23.A(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object f0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable g0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List h0(Iterable iterable, Set set) {
        if (set.isEmpty()) {
            return s0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!set.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static ArrayList i0(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        u23.K(iterable, arrayList2);
        return arrayList2;
    }

    public static ArrayList j0(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List k0(Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return s0(iterable);
        }
        List u0 = u0(iterable);
        Collections.reverse(u0);
        return u0;
    }

    public static List l0(List list) {
        if (!(list instanceof Collection)) {
            List u0 = u0(list);
            if (((ArrayList) u0).size() > 1) {
                Collections.sort(u0);
            }
            return u0;
        } else if (list.size() <= 1) {
            return s0(list);
        } else {
            Object[] array = list.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return Arrays.asList(array);
        }
    }

    public static List m0(Iterable iterable, Comparator comparator) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return s0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return Arrays.asList(array);
        }
        List u0 = u0(iterable);
        t23.J(u0, comparator);
        return u0;
    }

    public static List n0(Iterable iterable, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(rf0.f(i, "Requested element count ", " is less than zero.").toString());
        } else if (i == 0) {
            return hw4.a;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return s0(iterable);
                }
                if (i == 1) {
                    return Collections.singletonList(U(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return p23.D(arrayList);
        }
    }

    public static List o0(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(rf0.f(i, "Requested element count ", " is less than zero.").toString());
        } else if (i == 0) {
            return hw4.a;
        } else {
            int size = list.size();
            if (i >= size) {
                return s0(list);
            }
            if (i == 1) {
                return Collections.singletonList(e0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static final void p0(Iterable iterable, AbstractCollection abstractCollection) {
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static HashSet q0(Iterable iterable) {
        HashSet hashSet = new HashSet(ju7.S(q23.H(iterable, 12)));
        p0(iterable, hashSet);
        return hashSet;
    }

    public static int[] r0(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List s0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return p23.D(u0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return hw4.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] t0(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final List u0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        p0(iterable, arrayList);
        return arrayList;
    }

    public static Set v0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        p0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set w0(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        qw4 qw4 = qw4.a;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return qw4;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(ju7.S(collection.size()));
                p0(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        p0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        return size2 != 0 ? size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next()) : qw4;
    }

    public static ArrayList x0(Iterable iterable, int i, int i2) {
        pfa.c(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator G = pfa.G(iterable.iterator(), i, i2, false);
            while (G.hasNext()) {
                arrayList.add((List) G.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static ArrayList y0(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q23.H(iterable, 10), q23.H(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new wia(it.next(), it2.next()));
        }
        return arrayList;
    }
}
