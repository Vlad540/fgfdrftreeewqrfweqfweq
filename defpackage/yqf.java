package defpackage;

import java.util.Comparator;

/* renamed from: yqf  reason: default package */
public final /* synthetic */ class yqf implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ yqf(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((jqf) obj).b, ((jqf) obj2).b);
            default:
                return zb4.c((zb4) obj, (zb4) obj2);
        }
    }
}
