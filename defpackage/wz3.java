package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: wz3  reason: default package */
public final class wz3 {
    public final /* synthetic */ int a;
    public Uri b;
    public long c;
    public int d;
    public byte[] e;
    public Map f;
    public long g;
    public long h;
    public String i;
    public int j;
    public Object k;

    public /* synthetic */ wz3(boolean z, int i2) {
        this.a = i2;
    }

    public xz3 a() {
        if (this.b != null) {
            return new xz3(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public yz3 b() {
        oyb.m(this.b, "The uri must be set.");
        return new yz3(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final void c(int i2) {
        switch (this.a) {
            case 0:
                this.j = i2;
                return;
            default:
                this.j = i2;
                return;
        }
    }

    public void d() {
        this.f = j8c.w0;
    }

    public final void e(String str) {
        switch (this.a) {
            case 0:
                this.i = str;
                return;
            default:
                this.i = str;
                return;
        }
    }

    public wz3(int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.d = 1;
                this.f = Collections.emptyMap();
                this.h = -1;
                return;
            default:
                this.d = 1;
                this.f = Collections.emptyMap();
                this.h = -1;
                return;
        }
    }
}
