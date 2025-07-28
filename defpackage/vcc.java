package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: vcc  reason: default package */
public final class vcc extends BufferedOutputStream {
    public final /* synthetic */ int a;
    public boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vcc(OutputStream outputStream, int i) {
        super(outputStream);
        this.a = i;
    }

    public final void a(OutputStream outputStream) {
        switch (this.a) {
            case 0:
                swb.h(this.b);
                this.out = outputStream;
                this.count = 0;
                this.b = false;
                return;
            default:
                oyb.k(this.b);
                this.out = outputStream;
                this.count = 0;
                this.b = false;
                return;
        }
    }

    public final void close() {
        Throwable th = null;
        switch (this.a) {
            case 0:
                this.b = true;
                try {
                    flush();
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.out.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                if (th != null) {
                    int i = mze.a;
                    throw th;
                }
                return;
            default:
                this.b = true;
                try {
                    flush();
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    this.out.close();
                } catch (Throwable th5) {
                    if (th == null) {
                        th = th5;
                    }
                }
                if (th != null) {
                    int i2 = oze.a;
                    throw th;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vcc(OutputStream outputStream, int i, int i2) {
        super(outputStream, i);
        this.a = i2;
    }
}
