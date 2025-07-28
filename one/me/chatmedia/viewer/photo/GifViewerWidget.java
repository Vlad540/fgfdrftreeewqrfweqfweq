package one.me.chatmedia.viewer.photo;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/chatmedia/viewer/photo/GifViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Linc;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lx54;)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class GifViewerWidget extends Widget {
    public static final /* synthetic */ k77[] y0;
    public final n0c X;
    public final n0c Y;
    public ydc Z;
    public final String a;
    public final jr b;
    public final jr c;
    public final t97 o;
    public v2f w0;
    public final gvf x0;

    static {
        Class<GifViewerWidget> cls = GifViewerWidget.class;
        khb khb = new khb(cls, "msgId", "getMsgId()J", 0);
        n7c n7c = m7c.a;
        y0 = new k77[]{khb, wn6.e(n7c, cls, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), wn6.f(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0, n7c), wn6.f(cls, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0, n7c), wn6.f(cls, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0, n7c)};
    }

    public GifViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = GifViewerWidget.class.getName();
        this.b = new jr(Long.class, 0L, "chat.media.viewer.message_id");
        this.c = new jr(String.class, BuildConfig.FLAVOR, "chat.media.viewer.attach_id");
        jr jrVar = new jr(inc.class, new inc(getScopeId-IluPPks()), "arg_key_scope_id");
        k77 k77 = y0[2];
        this.o = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, ah2.class, (s16) null);
        this.X = viewBinding(a2a.h);
        this.Y = viewBinding(a2a.f);
        this.x0 = new gvf(16, (Object) this);
    }

    public final String l0() {
        k77 k77 = y0[1];
        return (String) this.c.a(this);
    }

    public final long m0() {
        k77 k77 = y0[0];
        return ((Number) this.b.a(this)).longValue();
    }

    public final spa n0() {
        return (spa) this.X.T0(this, y0[3]);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chatmedia.viewer.photo.GifViewerWidget] */
    public final k7f o0() {
        rr3 targetController = getTargetController();
        i9f i9f = targetController instanceof i9f ? (i9f) targetController : null;
        if (i9f != null) {
            return ((ChatMediaViewerScreen) i9f).z0();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.chatmedia.viewer.photo.GifViewerWidget] */
    public final void onActivityStarted(Activity activity) {
        GifViewerWidget.super.onActivityStarted(activity);
        if (getView() != null && this.w0 != null) {
            p0().a(this.x0);
            k7f o0 = o0();
            if (o0 != null) {
                o0.play();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.chatmedia.viewer.photo.GifViewerWidget] */
    public final void onActivityStopped(Activity activity) {
        GifViewerWidget.super.onActivityStopped(activity);
        if (getView() != null && this.w0 != null) {
            k7f o0 = o0();
            if (o0 != null) {
                o0.pause();
                o0.L0((Surface) null);
            }
            p0().b();
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [spa, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        ? spa = new spa(frameLayout.getContext());
        spa.setId(a2a.h);
        spa.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(spa);
        f9f f9f = new f9f(frameLayout.getContext());
        f9f.setId(a2a.f);
        f9f.setAlpha(0.0f);
        f9f.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.Z = new ydc(f9f);
        frameLayout.addView(f9f);
        return frameLayout;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.chatmedia.viewer.photo.GifViewerWidget] */
    public final void onDestroyView(View view) {
        ObjectAnimator objectAnimator;
        GifViewerWidget.super.onDestroyView(view);
        ydc ydc = this.Z;
        if (!(ydc == null || (objectAnimator = (ObjectAnimator) ydc.c) == null)) {
            objectAnimator.cancel();
        }
        this.Z = null;
        this.w0 = null;
        p0().b();
    }

    public final void onViewCreated(View view) {
        k68 y = q0().y(m0(), l0());
        b68 b68 = y instanceof b68 ? (b68) y : null;
        if (b68 != null) {
            n0().setZoomEnabled(false);
            n0().setListener(new mod(17, this));
            q0().A(m0(), l0());
            n0().r(b68.o, false);
            l05 l05 = q0().R0;
            ob7 ob7 = ob7.o;
            ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new f96((Continuation) null, this), 5), getViewLifecycleScope());
            ez3.N(new ck5(wx3.e(q0().a1, getViewLifecycleOwner().R(), ob7), new g96((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public final f9f p0() {
        return (f9f) this.Y.T0(this, y0[4]);
    }

    public final ah2 q0() {
        return (ah2) this.o.getValue();
    }

    public GifViewerWidget(long j, String str, String str2, x54 x54) {
        this(jjd.j(new wia("chat.media.viewer.message_id", Long.valueOf(j)), new wia("chat.media.viewer.attach_id", str), new wia("arg_key_scope_id", new inc(str2))));
    }
}
