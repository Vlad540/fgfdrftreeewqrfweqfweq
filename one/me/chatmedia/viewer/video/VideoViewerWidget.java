package one.me.chatmedia.viewer.video;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/video/VideoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Linc;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lx54;)V", "i9f", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class VideoViewerWidget extends Widget {
    public static final /* synthetic */ k77[] y0;
    public final n0c X;
    public final n0c Y;
    public ydc Z;
    public final String a;
    public final jr b;
    public final jr c;
    public final t97 o;
    public v2f w0;
    public final mv4 x0;

    static {
        Class<VideoViewerWidget> cls = VideoViewerWidget.class;
        khb khb = new khb(cls, "msgId", "getMsgId()J", 0);
        n7c n7c = m7c.a;
        y0 = new k77[]{khb, wn6.e(n7c, cls, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), wn6.f(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0, n7c), wn6.f(cls, "videoPreviewView", "getVideoPreviewView()Lone/me/chatmedia/viewer/video/VideoPreviewView;", 0, n7c), wn6.f(cls, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0, n7c)};
    }

    public VideoViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = VideoViewerWidget.class.getName();
        this.b = new jr(Long.class, 0L, "chat.media.viewer.message_id");
        this.c = new jr(String.class, BuildConfig.FLAVOR, "chat.media.viewer.attach_id");
        jr jrVar = new jr(inc.class, new inc(getScopeId-IluPPks()), "arg_key_scope_id");
        k77 k77 = y0[2];
        this.o = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, ah2.class, (s16) null);
        this.X = viewBinding(a2a.o);
        this.Y = viewBinding(a2a.p);
        this.x0 = new mv4(28, this);
    }

    public final String l0() {
        k77 k77 = y0[1];
        return (String) this.c.a(this);
    }

    public final long m0() {
        k77 k77 = y0[0];
        return ((Number) this.b.a(this)).longValue();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.chatmedia.viewer.video.VideoViewerWidget] */
    public final i9f n0() {
        rr3 targetController = getTargetController();
        if (targetController instanceof i9f) {
            return (i9f) targetController;
        }
        return null;
    }

    public final f9f o0() {
        return (f9f) this.Y.T0(this, y0[4]);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chatmedia.viewer.video.VideoViewerWidget] */
    public final void onActivityStarted(Activity activity) {
        i9f n0;
        k7f z0;
        VideoViewerWidget.super.onActivityStarted(activity);
        if (getView() != null && this.w0 != null && (n0 = n0()) != null && (z0 = ((ChatMediaViewerScreen) n0).z0()) != null) {
            n45 n45 = z0.o;
            if (n45.getPlaybackState() == 3 && !n45.u()) {
                o0().a(this.x0);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.chatmedia.viewer.video.VideoViewerWidget] */
    public final void onActivityStopped(Activity activity) {
        k7f z0;
        VideoViewerWidget.super.onActivityStopped(activity);
        if (getView() != null && this.w0 != null) {
            i9f n0 = n0();
            if (!(n0 == null || (z0 = ((ChatMediaViewerScreen) n0).z0()) == null)) {
                z0.pause();
                z0.L0((Surface) null);
            }
            o0().b();
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [r7f, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nva nva = new nva(getContext());
        nva.setId(a2a.q);
        nva.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nva.setTouchEventDelegate(new vj4(nva.getContext(), nva, new q6e(10, this), new ygd(this)));
        ? r7f = new r7f(nva.getContext());
        r7f.setId(a2a.o);
        r7f.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        nva.addView(r7f);
        f9f f9f = new f9f(nva.getContext());
        f9f.setId(a2a.p);
        f9f.setAlpha(0.0f);
        f9f.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.Z = new ydc(f9f);
        nva.addView(f9f);
        return nva;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.chatmedia.viewer.video.VideoViewerWidget] */
    public final void onDestroyView(View view) {
        ObjectAnimator objectAnimator;
        VideoViewerWidget.super.onDestroyView(view);
        ydc ydc = this.Z;
        if (!(ydc == null || (objectAnimator = (ObjectAnimator) ydc.c) == null)) {
            objectAnimator.cancel();
        }
        this.Z = null;
        this.w0 = null;
        o0().b();
    }

    public final void onViewCreated(View view) {
        t97 t97 = this.o;
        t0c t0c = ((ah2) t97.getValue()).a1;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new j9f((Continuation) null, this), 5), getViewLifecycleScope());
        k68 y = ((ah2) t97.getValue()).y(m0(), l0());
        i68 i68 = y instanceof i68 ? (i68) y : null;
        if (i68 != null) {
            r7f r7f = (r7f) this.X.T0(this, y0[3]);
            q1f q1f = r7f.H0;
            q1f q1f2 = i68.o;
            boolean z = !q1f2.equals(q1f);
            r7f.H0 = q1f2;
            if (z) {
                r7f.o(tr6.a(q1f2.b), tr6.a(q1f2.h));
            }
            ez3.N(new ck5(wx3.e(((ah2) t97.getValue()).R0, getViewLifecycleOwner().R(), ob7), new k9f((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public VideoViewerWidget(long j, String str, String str2, x54 x54) {
        this(jjd.j(new wia("chat.media.viewer.message_id", Long.valueOf(j)), new wia("chat.media.viewer.attach_id", str), new wia("arg_key_scope_id", new inc(str2))));
    }
}
