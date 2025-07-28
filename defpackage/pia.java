package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: pia  reason: default package */
public final class pia implements ria {
    public final Map a;

    public pia(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pia) && hhd.f(this.a, ((pia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallHistoryPageState(callsHistory=" + this.a + ")";
    }
}
