package defpackage;

/* renamed from: ro5  reason: default package */
public abstract class ro5 implements Iterable {
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (Object append : this) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(append);
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
