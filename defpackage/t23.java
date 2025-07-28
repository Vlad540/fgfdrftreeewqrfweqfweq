package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: t23  reason: default package */
public abstract class t23 extends s23 {
    public static void J(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
