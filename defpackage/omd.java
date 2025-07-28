package defpackage;

/* renamed from: omd  reason: default package */
public abstract class omd implements w29 {
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName.length() != 0 ? "SCTE-35 splice command: type=".concat(simpleName) : new String("SCTE-35 splice command: type=");
    }
}
