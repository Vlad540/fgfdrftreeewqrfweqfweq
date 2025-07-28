package defpackage;

import android.content.Context;
import java.io.File;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: are  reason: default package */
public final /* synthetic */ class are implements bre, i83, j75, k75, of3, v1b, j26 {
    public final /* synthetic */ int a;

    public /* synthetic */ are(int i) {
        this.a = i;
    }

    public d75[] a() {
        switch (this.a) {
            case 5:
                return new d75[]{new lse()};
            default:
                return new d75[]{new uef()};
        }
    }

    public void accept(Object obj) {
        g10 g10 = g10.o;
        switch (this.a) {
            case 7:
                udd.s("ewe", "clear: failed to clear uploads repository", (Throwable) obj);
                return;
            case 8:
                udd.p("ewe", "getUploadFromRepository: found upload in cache, upload=%s", (wve) obj);
                return;
            case 9:
                udd.s("ewe", "getUploadFromRepository: failed to get upload from cache", (Throwable) obj);
                return;
            case 11:
                ((m00) obj).i = g10;
                return;
            case 19:
                udd.s("j3f", "clear: failed", (Throwable) obj);
                return;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                udd.p("j3f", "convertObs: progress %f", (Float) obj);
                return;
            case 21:
                udd.p("j3f", "convertVideo: loaded from storage = %s", (z2f) obj);
                return;
            case 25:
                m00 m00 = (m00) obj;
                if (m00.c().g || !r1g.p(m00.c().h)) {
                    g10 = g10.a;
                }
                m00.i = g10;
                return;
            default:
                Throwable th = (Throwable) obj;
                int i = VideoPlayerSeekBarPreview.I0;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, e06] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 13:
                ((i22) obj).b.f0.getClass();
                return hw4.a;
            case 14:
                return new File((String) obj);
            case 15:
                yxe yxe = (yxe) obj;
                yxe.getClass();
                return new y63(2, new g74(14, yxe));
            case 16:
                return js.z((gwe) obj);
            case 17:
                List list = (List) obj;
                return list.isEmpty() ? hx7.a : ax7.e(list);
            case 18:
                return ((OneMeRoomDatabase) obj).T();
            case 22:
                e3f e3f = (e3f) obj;
                e3f.getClass();
                return new y63(2, new g74(15, e3f));
            case 23:
                c3f c3f = (c3f) obj;
                a3f a3f = null;
                if (c3f == null) {
                    return null;
                }
                ? obj2 = new Object();
                b3f b3f = c3f.a;
                if (b3f != null) {
                    l10 l10 = new l10(1);
                    l10.a = b3f.b;
                    l10.b = b3f.c;
                    l10.c = b3f.d;
                    l10.d = b3f.e;
                    f3f f3f = new f3f(l10);
                    f2b f2b = new f2b(13);
                    f2b.b = b3f.a;
                    f2b.c = f3f;
                    a3f = new a3f(f2b);
                }
                obj2.b = a3f;
                obj2.c = c3f.c;
                obj2.o = c3f.d;
                obj2.a = c3f.b;
                return new z2f(obj2);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return ((OneMeRoomDatabase) obj).U();
            default:
                return ((kj0) obj).a();
        }
    }

    public void c(zqe zqe, cre cre, boolean z) {
        switch (this.a) {
            case 0:
                zqe.b();
                return;
            default:
                zqe.f();
                return;
        }
    }

    public Object h(uwb uwb) {
        switch (this.a) {
            case 2:
                return tre.b((Context) uwb.a(Context.class));
            case 3:
                return tre.b((Context) uwb.a(Context.class));
            default:
                return tre.b((Context) uwb.a(Context.class));
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 10:
                return ((wve) obj).a();
            default:
                return ((i22) obj).b.f0 != null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public e75[] m10a() {
        switch (this.a) {
            case 6:
                hk9 hk9 = s1e.W;
                cke cke = new cke(0);
                po5 po5 = ws6.b;
                return new e75[]{new mse(1, 1, hk9, cke, new cc4(e8c.X, 0, 1))};
            default:
                return new e75[]{new vef()};
        }
    }
}
