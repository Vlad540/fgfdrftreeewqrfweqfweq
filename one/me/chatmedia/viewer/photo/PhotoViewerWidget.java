package one.me.chatmedia.viewer.photo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/photo/PhotoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Linc;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lx54;)V", "tpa", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PhotoViewerWidget extends Widget {
    public static final /* synthetic */ k77[] X;
    public final jr a;
    public final jr b;
    public final t97 c;
    public final n0c o;

    static {
        Class<PhotoViewerWidget> cls = PhotoViewerWidget.class;
        khb khb = new khb(cls, "msgId", "getMsgId()J", 0);
        n7c n7c = m7c.a;
        X = new k77[]{khb, wn6.e(n7c, cls, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), wn6.f(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0, n7c), wn6.f(cls, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0, n7c)};
    }

    public PhotoViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(Long.class, 0L, "chat.media.viewer.message_id");
        this.b = new jr(String.class, BuildConfig.FLAVOR, "chat.media.viewer.attach_id");
        jr jrVar = new jr(inc.class, new inc(getScopeId-IluPPks()), "arg_key_scope_id");
        k77 k77 = X[2];
        this.c = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, ah2.class, (s16) null);
        this.o = viewBinding(a2a.h);
    }

    public final String l0() {
        k77 k77 = X[1];
        return (String) this.b.a(this);
    }

    public final long m0() {
        k77 k77 = X[0];
        return ((Number) this.a.a(this)).longValue();
    }

    public final spa n0() {
        return (spa) this.o.T0(this, X[3]);
    }

    public final ah2 o0() {
        return (ah2) this.c.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [spa, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        ? spa = new spa(frameLayout.getContext());
        spa.setId(a2a.h);
        frameLayout.addView(spa);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        k68 y = o0().y(m0(), l0());
        b68 b68 = y instanceof b68 ? (b68) y : null;
        if (b68 != null) {
            n0().setZoomEnabled(true);
            n0().setListener(new lhd(23, this));
            o0().A(m0(), l0());
            n0().r(b68.o, false);
            ez3.N(new ck5(wx3.e(o0().R0, getViewLifecycleOwner().R(), ob7.o), new upa((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public PhotoViewerWidget(long j, String str, String str2, x54 x54) {
        this(jjd.j(new wia("chat.media.viewer.message_id", Long.valueOf(j)), new wia("chat.media.viewer.attach_id", str), new wia("arg_key_scope_id", new inc(str2))));
    }
}
