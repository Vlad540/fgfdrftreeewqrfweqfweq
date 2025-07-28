package defpackage;

import java.io.File;
import java.util.Iterator;

/* renamed from: nf5  reason: default package */
public final class nf5 implements dyc {
    public final File a;
    public final int b = 2;

    public nf5(File file) {
        this.a = file;
    }

    public final Iterator iterator() {
        return new lf5(this);
    }
}
