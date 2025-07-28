package defpackage;

/* renamed from: ap9  reason: default package */
public enum ap9 {
    ;

    public static boolean a(bw9 bw9, Object obj) {
        if (obj == a) {
            bw9.b();
            return true;
        } else if (obj instanceof yo9) {
            bw9.onError(((yo9) obj).a);
            return true;
        } else {
            bw9.c(obj);
            return false;
        }
    }

    public static boolean b(bw9 bw9, Object obj) {
        if (obj == a) {
            bw9.b();
            return true;
        } else if (obj instanceof yo9) {
            bw9.onError(((yo9) obj).a);
            return true;
        } else if (obj instanceof xo9) {
            bw9.d(((xo9) obj).a);
            return false;
        } else {
            bw9.c(obj);
            return false;
        }
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }
}
