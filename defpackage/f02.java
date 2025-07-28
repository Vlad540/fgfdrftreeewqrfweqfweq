package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: f02  reason: default package */
public final class f02 extends c0d implements tna {
    public final d10 X;
    public final long Y;
    public final String Z;
    public final long b;
    public final String c;
    public final long o;
    public c97 w0;

    public f02(long j, String str, long j2, d10 d10, long j3) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = d10;
        this.Y = j3;
        this.Z = f02.class.getName();
    }

    public final int e() {
        return 1;
    }

    public final void f() {
    }

    public final byte[] g() {
        Tasks.ChangeProfileOrChatPhoto changeProfileOrChatPhoto = new Tasks.ChangeProfileOrChatPhoto();
        changeProfileOrChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeProfileOrChatPhoto.file = str;
        changeProfileOrChatPhoto.chatId = this.o;
        d10 d10 = this.X;
        if (d10 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = d10.b;
            rect.top = d10.c;
            rect.right = d10.d;
            rect.bottom = d10.e;
            changeProfileOrChatPhoto.crop = rect;
        }
        changeProfileOrChatPhoto.lastModified = this.Y;
        return gr8.toByteArray(changeProfileOrChatPhoto);
    }

    public final long getId() {
        return this.b;
    }

    public final una getType() {
        return una.TYPE_CHANGE_PROFILE_OR_CHAT_PHOTO;
    }

    public final int h() {
        return 1;
    }

    public final void w() {
        c97 c97 = this.w0;
        if (c97 != null) {
            bj4.a(c97);
        }
        this.w0 = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [af8, java.lang.Object] */
    public final void x() {
        ? obj = new Object();
        obj.c = this.c;
        obj.a = this.Y;
        obj.b = 4;
        fwe fwe = new fwe(obj);
        c97 c97 = this.w0;
        if (c97 != null) {
            bj4.a(c97);
        }
        d0d d0d = this.a;
        if (d0d == null) {
            d0d = null;
        }
        ms9 e = ((ewe) d0d.u.getValue()).e(fwe);
        mbe q = q();
        q.getClass();
        nu9 n = e.n(((nbe) q).a());
        c97 c972 = new c97(new c9(6, this), new u5g(8, this), z3d.i);
        n.a(c972);
        this.w0 = c972;
    }

    public /* synthetic */ f02(long j, String str, long j2, d10 d10) {
        this(j, str, j2, d10, lp.x(str));
    }
}
