package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dc4  reason: default package */
public final class dc4 {
    public final String a;
    public final ea6 b;

    public dc4(Set set, ea6 ea6) {
        this.a = b(set);
        this.b = ea6;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            u90 u90 = (u90) it.next();
            sb.append(u90.a);
            sb.append('/');
            sb.append(u90.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        ea6 ea6 = this.b;
        synchronized (((HashSet) ea6.b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) ea6.b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) ea6.b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) ea6.b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
