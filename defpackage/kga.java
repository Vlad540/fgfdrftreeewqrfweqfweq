package defpackage;

import java.util.Comparator;

/* renamed from: kga  reason: default package */
public abstract class kga implements Comparator {
    public static kga a(Comparator comparator) {
        return comparator instanceof kga ? (kga) comparator : new c63(comparator);
    }

    public kga b() {
        return new ycc(this);
    }
}
