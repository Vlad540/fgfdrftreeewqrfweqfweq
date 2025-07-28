package defpackage;

import java.util.Arrays;

/* renamed from: g62  reason: default package */
public final class g62 extends m4b {
    public final long[] b;

    public g62(long[] jArr) {
        this.b = jArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || g62.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(new Object[]{this.b}, new Object[]{((g62) obj).b});
    }

    public final int hashCode() {
        Object[] objArr = {this.b};
        return g62.class.hashCode() + (Arrays.hashCode(objArr) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.b};
        String[] split = "b".length() == 0 ? new String[0] : "b".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(g62.class.getSimpleName());
        sb.append("[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
