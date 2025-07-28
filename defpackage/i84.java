package defpackage;

import java.util.Map;

/* renamed from: i84  reason: default package */
public final /* synthetic */ class i84 implements u1b {
    public final /* synthetic */ int a;

    public /* synthetic */ i84(int i) {
        this.a = i;
    }

    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((String) obj) != null;
            case 1:
                return ((Map.Entry) obj).getKey() != null;
            case 2:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
