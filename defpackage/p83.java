package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: p83  reason: default package */
public final class p83 extends gt0 {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ p83(int i2, Object obj) {
        this.h = i2;
        this.i = obj;
    }

    public final gt0 c(Object obj) {
        switch (this.h) {
            case 0:
                ((PrintStream) this.i).print(obj);
                return this;
            default:
                ((PrintWriter) this.i).print(obj);
                return this;
        }
    }
}
