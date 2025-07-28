package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: wy1  reason: default package */
public final class wy1 extends c0d implements tna {
    public final d10 X;
    public final long Y;
    public final String Z = wy1.class.getName();
    public final long b;
    public final String c;
    public final long o;
    public n83 w0;

    public wy1(long j, String str, long j2, d10 d10, long j3) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = d10;
        this.Y = j3;
    }

    public final int e() {
        return 1;
    }

    public final void f() {
        s().d(this.b);
        y();
    }

    public final byte[] g() {
        Tasks.ChangeChatPhoto changeChatPhoto = new Tasks.ChangeChatPhoto();
        changeChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeChatPhoto.file = str;
        changeChatPhoto.chatId = this.o;
        d10 d10 = this.X;
        if (d10 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = d10.b;
            rect.top = d10.c;
            rect.right = d10.d;
            rect.bottom = d10.e;
            changeChatPhoto.crop = rect;
        }
        changeChatPhoto.lastModified = this.Y;
        return gr8.toByteArray(changeChatPhoto);
    }

    public final long getId() {
        return this.b;
    }

    public final una getType() {
        return una.TYPE_CHANGE_CHAT_PHOTO;
    }

    public final void w() {
        y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [af8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [n83, java.lang.Object] */
    public final void x() {
        ? obj = new Object();
        obj.c = this.c;
        obj.a = this.Y;
        obj.b = 4;
        fwe fwe = new fwe(obj);
        y();
        this.w0 = new Object();
        d0d d0d = this.a;
        if (d0d == null) {
            d0d = null;
        }
        ms9 e = ((ewe) d0d.u.getValue()).e(fwe);
        mbe q = q();
        q.getClass();
        nu9 n = e.n(((nbe) q).a());
        c97 c97 = new c97(new wwc(7, this), new lhd(8, (Object) this), z3d.i);
        n.a(c97);
        n83 n83 = this.w0;
        if (n83 != null) {
            n83.a(c97);
        }
    }

    public final void y() {
        n83 n83 = this.w0;
        if (n83 != null) {
            n83.f();
        }
        this.w0 = null;
    }

    public final void z() {
        t52 b2 = b();
        long j = this.o;
        i22 B = b2.B(j);
        if (B != null) {
            b().W(j, z52.b);
            ((gy9) a()).j(B.b.a);
        }
    }
}
