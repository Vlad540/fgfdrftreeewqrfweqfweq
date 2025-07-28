package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: r80  reason: default package */
public final class r80 extends bk0 {
    public final List a;

    public r80(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bk0)) {
            return false;
        }
        return this.a.equals(((r80) ((bk0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return hr1.i(new StringBuilder("BatchedLogRequest{logRequests="), this.a, "}");
    }
}
