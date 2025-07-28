package defpackage;

import java.util.Collections;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: k5b  reason: default package */
public final class k5b extends ol implements qce, tna {
    public final String X;
    public final String Y;
    public final long Z;
    public final String o;
    public final d10 w0;
    public final String x0;
    public final String y0;
    public final int z0;

    public k5b(long j, String str, String str2, String str3, long j2, d10 d10, String str4, String str5, int i) {
        super(j);
        this.o = str;
        this.X = str2;
        this.Y = str3;
        this.Z = j2;
        this.w0 = d10;
        this.x0 = str4;
        this.y0 = str5;
        this.z0 = i;
    }

    public final void c(lbe lbe) {
        h6b h6b = (h6b) lbe;
        ((j2b) r()).a.l("user.deviceAvatarPath", (String) null);
        n().u(Collections.singletonList(h6b.c));
        tt0 l = l();
        uj3 uj3 = h6b.c;
        long j = this.a;
        l.c(new mab(j, uj3));
        if (this.Z != 0) {
            l().c(new m5b(j, h6b.c.Y));
        }
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
        }
        l().c(new jh0(uae));
    }

    public final int e() {
        return 1;
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.Profile profile = new Tasks.Profile();
        profile.requestId = this.a;
        profile.photoId = this.Z;
        String str = this.o;
        if (!(str == null || str.length() == 0)) {
            profile.firstName = str;
        }
        String str2 = this.X;
        if (!(str2 == null || str2.length() == 0)) {
            profile.lastName = str2;
        }
        String str3 = this.Y;
        if (!(str3 == null || str3.length() == 0)) {
            profile.photoToken = str3;
        }
        String str4 = this.x0;
        if (!(str4 == null || str4.length() == 0)) {
            profile.description = str4;
        }
        String str5 = this.y0;
        if (!(str5 == null || str5.length() == 0)) {
            profile.link = str5;
        }
        int i = this.z0;
        if (hr1.e(i).length() != 0) {
            profile.avatarType = hr1.e(i);
        }
        d10 d10 = this.w0;
        if (d10 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = d10.b;
            rect.top = d10.c;
            rect.right = d10.d;
            rect.bottom = d10.e;
            profile.crop = rect;
        }
        return gr8.toByteArray(profile);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_PROFILE;
    }

    public final ibe i() {
        String str = this.y0;
        return new bm9(this.z0, this.Z, this.w0, this.o, this.X, this.Y, this.x0, str);
    }
}
