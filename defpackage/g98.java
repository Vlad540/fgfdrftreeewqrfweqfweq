package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;
import one.me.mediapicker.permissions.MediaPickerPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: g98  reason: default package */
public final class g98 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g98(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g98 g98 = new g98(continuation, this.Y);
        g98.X = obj;
        return g98;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        dq3 dq3 = (dq3) this.X;
        boolean z = dq3 instanceof aq3;
        MediaPickerScreen mediaPickerScreen = this.Y;
        if (z) {
            MediaPickerScreen.l0(mediaPickerScreen, false);
            nea n0 = mediaPickerScreen.n0();
            CharSequence a = ((aq3) dq3).a.a(mediaPickerScreen.getContext());
            if (a == null) {
                a = "";
            }
            n0.setTitle(a);
            ax2 ax2 = (ax2) mediaPickerScreen.b.T0(mediaPickerScreen, MediaPickerScreen.F0[0]);
            if (!hhd.f(ax2.b(), "MEDIA_GALLERY_WIDGET_TAG")) {
                vgc vgc = new vgc(new MediaGalleryWidget(mediaPickerScreen.c, mediaPickerScreen.m0(), (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc.d("MEDIA_GALLERY_WIDGET_TAG");
                ax2.a.R(vgc);
            }
        } else if (dq3 instanceof bq3) {
            MediaPickerScreen.l0(mediaPickerScreen, true);
        } else if (dq3 instanceof cq3) {
            MediaPickerScreen.l0(mediaPickerScreen, false);
            ax2 ax22 = (ax2) mediaPickerScreen.b.T0(mediaPickerScreen, MediaPickerScreen.F0[0]);
            if (!hhd.f(ax22.b(), "MEDIA_GALLERY_WIDGET_PERMISSION_TAG")) {
                vgc vgc2 = new vgc(new MediaPickerPermissionWidget(mediaPickerScreen.c, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                vgc2.d("MEDIA_GALLERY_WIDGET_PERMISSION_TAG");
                ax22.a.R(vgc2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
