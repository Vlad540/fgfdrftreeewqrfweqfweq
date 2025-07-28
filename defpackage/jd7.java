package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: jd7  reason: default package */
public final class jd7 implements Iterator, z67 {
    public String a;
    public boolean b;
    public final /* synthetic */ es c;

    public jd7(es esVar) {
        this.c = esVar;
    }

    public final boolean hasNext() {
        if (this.a == null && !this.b) {
            String readLine = ((BufferedReader) this.c.b).readLine();
            this.a = readLine;
            if (readLine == null) {
                this.b = true;
            }
        }
        return this.a != null;
    }

    public final Object next() {
        if (hasNext()) {
            String str = this.a;
            this.a = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
