package defpackage;

import java.util.Comparator;

/* renamed from: ng9  reason: default package */
public final class ng9 implements Comparator {
    public static final ng9 b = new ng9(0);
    public static final ng9 c = new ng9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ng9(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    public final Comparator reversed() {
        switch (this.a) {
            case 0:
                return c;
            default:
                return b;
        }
    }
}
