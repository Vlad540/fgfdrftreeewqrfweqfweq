package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: us7  reason: default package */
public final class us7 extends m4b {
    public final ts7 b;
    public final List c;

    public us7(ts7 ts7, List list) {
        this.b = ts7;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || us7.class != obj.getClass()) {
            return false;
        }
        us7 us7 = (us7) obj;
        return Arrays.equals(new Object[]{this.b, this.c}, new Object[]{us7.b, us7.c});
    }

    public final int hashCode() {
        Object[] objArr = {this.b, this.c};
        return us7.class.hashCode() + (Arrays.hashCode(objArr) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.b, this.c};
        String[] split = "b;c".length() == 0 ? new String[0] : "b;c".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(us7.class.getSimpleName());
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
