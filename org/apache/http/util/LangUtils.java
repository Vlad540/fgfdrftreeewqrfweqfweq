package org.apache.http.util;

@Deprecated
public final class LangUtils {
    public static final int HASH_OFFSET = 37;
    public static final int HASH_SEED = 17;

    private LangUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int hashCode(int i, int i2) {
        return (i * 37) + i2;
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!equals(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(int i, boolean z) {
        return hashCode(i, z ? 1 : 0);
    }

    public static int hashCode(int i, Object obj) {
        return hashCode(i, obj != null ? obj.hashCode() : 0);
    }
}
