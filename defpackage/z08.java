package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: z08  reason: default package */
public final class z08 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z08(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((z08) n((p3b) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z08 z08 = new z08(continuation, this.Y);
        z08.X = obj;
        return z08;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [rr3, one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget] */
    public final Object o(Object obj) {
        wx3.H(obj);
        int ordinal = ((p3b) this.X).ordinal();
        MediaBarWidget mediaBarWidget = this.Y;
        if (ordinal == 0) {
            k77[] k77Arr = MediaBarWidget.h1;
            ax2 x0 = mediaBarWidget.x0();
            if (!hhd.f(x0.b(), "media_gallery_widget")) {
                vgc vgc = new vgc(new MediaGalleryWidget(mediaBarWidget.a, (q46) null, 2, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc.d("media_gallery_widget");
                x0.a.R(vgc);
            }
            mediaBarWidget.z0().setVisibility(0);
        } else if (ordinal == 1) {
            k77[] k77Arr2 = MediaBarWidget.h1;
            ax2 x02 = mediaBarWidget.x0();
            if (!hhd.f(x02.b(), "permissions_widget")) {
                vgc vgc2 = new vgc(new MediaBarPermissionWidget(), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc2.d("permissions_widget");
                x02.a.R(vgc2);
            }
            mediaBarWidget.z0().setVisibility(8);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
