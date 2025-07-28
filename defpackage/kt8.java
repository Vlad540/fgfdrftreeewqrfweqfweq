package defpackage;

/* renamed from: kt8  reason: default package */
public final class kt8 extends lt8 {
    public final int a;

    public kt8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt8) && this.a == ((kt8) obj).a;
    }

    public final int hashCode() {
        return hr1.t(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleEmoji(state=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "KEYBOARD_BY_SYSTEM" : "KEYBOARD" : "EMOJI" : "DEFAULT");
        sb.append(")");
        return sb.toString();
    }
}
