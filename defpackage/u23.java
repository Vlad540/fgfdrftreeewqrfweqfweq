package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

/* renamed from: u23  reason: default package */
public abstract class u23 extends t23 {
    public static void K(Iterable iterable, AbstractCollection abstractCollection) {
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static void L(AbstractList abstractList, dyc dyc) {
        for (Object add : dyc) {
            abstractList.add(add);
        }
    }

    public static void M(AbstractList abstractList, Object[] objArr) {
        abstractList.addAll(Arrays.asList(objArr));
    }

    public static void N(ArrayList arrayList, u16 u16) {
        int A;
        int A2 = p23.A(arrayList);
        int i = 0;
        if (A2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) u16.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == A2) {
                    break;
                }
                i++;
            }
            i = i2;
        }
        if (i < arrayList.size() && i <= (A = p23.A(arrayList))) {
            while (true) {
                arrayList.remove(A);
                if (A != i) {
                    A--;
                } else {
                    return;
                }
            }
        }
    }

    public static void O(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            arrayList.remove(p23.A(arrayList));
            return;
        }
        throw new NoSuchElementException("List is empty.");
    }
}
