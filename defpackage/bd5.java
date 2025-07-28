package defpackage;

import java.io.File;

/* renamed from: bd5  reason: default package */
public final class bd5 {
    public final File a;

    public bd5(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bd5)) {
            return false;
        }
        return hhd.f(this.a, ((bd5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
