package defpackage;

/* renamed from: u55  reason: default package */
public final class u55 implements b65 {
    public final int b;

    public u55(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u55) && this.b == ((u55) obj).b;
    }

    public final int hashCode() {
        return hr1.t(this.b);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Failed(reason=");
        switch (this.b) {
            case 1:
                str = "UNAVAILABLE";
                break;
            case 2:
                str = "BUSY";
                break;
            case 3:
                str = "PRIVACY";
                break;
            case 4:
                str = "FAILED";
                break;
            case 5:
                str = "CONNECTION_ERROR";
                break;
            case 6:
                str = "REMOVE_FROM_CALL";
                break;
            case 7:
                str = "REMOVE_FROM_WAITING_ROOM";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
