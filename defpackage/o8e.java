package defpackage;

import android.os.StrictMode;

/* renamed from: o8e  reason: default package */
public final class o8e extends ild {
    public final String b() {
        throw null;
    }

    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public final String toString() {
        return "SystemLoadWrapperSoSource[" + t7e.getClassLoaderLdLoadLibrary() + "]";
    }
}
