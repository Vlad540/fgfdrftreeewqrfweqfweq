package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: f50  reason: default package */
public final class f50 {
    public final ws6 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public h50 d;
    public h50 e;
    public boolean f;

    public f50(ws6 ws6) {
        this.a = ws6;
        h50 h50 = h50.e;
        this.d = h50;
        this.e = h50;
        this.f = false;
    }

    public final h50 a(h50 h50) {
        if (!h50.equals(h50.e)) {
            int i = 0;
            while (true) {
                ws6 ws6 = this.a;
                if (i < ws6.size()) {
                    k50 k50 = (k50) ws6.get(i);
                    h50 e2 = k50.e(h50);
                    if (k50.isActive()) {
                        oyb.k(!e2.equals(h50.e));
                        h50 = e2;
                    }
                    i++;
                } else {
                    this.e = h50;
                    return h50;
                }
            }
        } else {
            throw new AudioProcessor$UnhandledAudioFormatException(h50);
        }
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = this.e;
        this.f = false;
        int i = 0;
        while (true) {
            ws6 ws6 = this.a;
            if (i >= ws6.size()) {
                break;
            }
            k50 k50 = (k50) ws6.get(i);
            k50.flush();
            if (k50.isActive()) {
                arrayList.add(k50);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((k50) arrayList.get(i2)).a();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public final ByteBuffer d() {
        if (!f()) {
            return k50.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(k50.a);
        return this.c[c()];
    }

    public final boolean e() {
        return this.f && ((k50) this.b.get(c())).d() && !this.c[c()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f50)) {
            return false;
        }
        f50 f50 = (f50) obj;
        ws6 ws6 = this.a;
        if (ws6.size() != f50.a.size()) {
            return false;
        }
        for (int i = 0; i < ws6.size(); i++) {
            if (ws6.get(i) != f50.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return !this.b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= c()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    k50 k50 = (k50) arrayList.get(i);
                    if (!k50.d()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : k50.a;
                        k50.b(byteBuffer2);
                        this.c[i] = k50.a();
                        z |= ((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        ((k50) arrayList.get(i + 1)).c();
                    }
                }
                i++;
            }
        }
    }

    public final void h() {
        if (f() && !this.f) {
            this.f = true;
            ((k50) this.b.get(0)).c();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(ByteBuffer byteBuffer) {
        if (f() && !this.f) {
            g(byteBuffer);
        }
    }

    public final void j() {
        int i = 0;
        while (true) {
            ws6 ws6 = this.a;
            if (i < ws6.size()) {
                k50 k50 = (k50) ws6.get(i);
                k50.flush();
                k50.reset();
                i++;
            } else {
                this.c = new ByteBuffer[0];
                h50 h50 = h50.e;
                this.d = h50;
                this.e = h50;
                this.f = false;
                return;
            }
        }
    }
}
