package defpackage;

import java.io.File;

/* renamed from: j64  reason: default package */
public final class j64 {
    public final String a;
    public final bd5 b;
    public long c = -1;
    public long d = -1;

    public j64(File file, String str) {
        str.getClass();
        this.a = str;
        this.b = new bd5(file);
    }

    public final long a() {
        if (this.d < 0) {
            this.d = this.b.a.lastModified();
        }
        return this.d;
    }
}
