package defpackage;

import java.util.Arrays;

/* renamed from: gu  reason: default package */
public final class gu extends m4b implements h73 {
    public final h73 b;

    public gu(h73 h73) {
        this.b = h73;
    }

    public final void b(x63 x63) {
        try {
            this.b.b(x63);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof InterruptedException)) {
                throw e;
            } else if (!x63.h()) {
                Throwable cause = e.getCause();
                if (!x63.a(cause)) {
                    xs7.F(cause);
                }
            } else {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || gu.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(new Object[]{this.b}, new Object[]{((gu) obj).b});
    }

    public final int hashCode() {
        Object[] objArr = {this.b};
        return gu.class.hashCode() + (Arrays.hashCode(objArr) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.b};
        String[] split = "b".length() == 0 ? new String[0] : "b".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(gu.class.getSimpleName());
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
