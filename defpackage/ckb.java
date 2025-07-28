package defpackage;

import java.io.File;

/* renamed from: ckb  reason: default package */
public final class ckb implements fkb {
    public final File a;

    public ckb(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckb) && hhd.f(this.a, ((ckb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartRecordVideo(file=" + this.a + ")";
    }
}
