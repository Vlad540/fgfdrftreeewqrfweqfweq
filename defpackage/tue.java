package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* renamed from: tue  reason: default package */
public final class tue implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ File b;
    public final /* synthetic */ be5 c;
    public final /* synthetic */ uue o;

    public tue(uue uue, boolean z, File file, be5 be5) {
        this.o = uue;
        this.a = z;
        this.b = file;
        this.c = be5;
    }

    public final void run() {
        be5 be5 = this.c;
        uue uue = this.o;
        boolean z = this.a;
        if (z) {
            try {
                t7e.c(uue.a);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                Objects.toString(uue.a);
                be5.close();
                throw th;
            }
        }
        uue.i(this.b, (byte) 1, z);
        Objects.toString(uue.a);
        be5.close();
    }
}
