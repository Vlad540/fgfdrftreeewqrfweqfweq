package defpackage;

import java.util.Collections;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: a9c  reason: default package */
public final class a9c extends ol implements qce, tna {
    public final long o;

    public a9c(long j, long j2) {
        super(j);
        this.o = j2;
    }

    public final void c(lbe lbe) {
        b9c b9c = (b9c) lbe;
        ((j2b) r()).a.l("user.deviceAvatarPath", (String) null);
        n().u(Collections.singletonList(b9c.c));
        l().c(new c9c(this.a, b9c.c));
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
        }
        l().c(new jh0(this.a, uae));
    }

    public final int e() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [long[], java.io.Serializable] */
    public final void f() {
        long s = ((j2b) r()).a.s();
        if (s > 0) {
            gy9 gy9 = (gy9) j();
            gy9.v(gy9, new q92(((j2b) gy9.z()).a.n(), new long[]{s}, 1));
        }
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.RemoveContactPhoto removeContactPhoto = new Tasks.RemoveContactPhoto();
        removeContactPhoto.requestId = this.a;
        removeContactPhoto.photoId = this.o;
        return gr8.toByteArray(removeContactPhoto);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_REMOVE_CONTACT_PHOTO;
    }

    public final ibe i() {
        return new bm9(this.o);
    }
}
