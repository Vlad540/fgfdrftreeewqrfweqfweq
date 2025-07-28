package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

/* renamed from: h63  reason: default package */
public final /* synthetic */ class h63 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ h63(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return this.b.compare(obj, obj2);
            default:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                return this.b.compare(entry.getKey(), entry2.getKey());
        }
    }
}
