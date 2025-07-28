package one.me.sdk.gallery.selectalbum;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/sdk/gallery/selectalbum/SelectAlbumWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "parentScope", "(Ljava/lang/String;Lx54;)V", "x9", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SelectAlbumWidget extends Widget {
    public static final /* synthetic */ k77[] Y;
    public final nl0 X;
    public final t97 a;
    public final t97 b;
    public final nl0 c;
    public final nl0 o;

    static {
        Class<SelectAlbumWidget> cls = SelectAlbumWidget.class;
        k77 khb = new khb(cls, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0);
        n7c n7c = m7c.a;
        Y = new k77[]{khb, wn6.e(n7c, cls, "albumAdapter", "getAlbumAdapter()Lone/me/sdk/gallery/selectalbum/SelectedAlbumAdapter;", 0), wn6.f(cls, "contentContainer", "getContentContainer()Lone/me/sdk/gallery/selectalbum/SelectedAlbumRecyclerView;", 0, n7c), wn6.f(cls, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0, n7c)};
    }

    public SelectAlbumWidget(String str, x54 x54) {
        this(jjd.j(new wia[]{new wia(Widget.ARG_SCOPE_ID, new inc(str))}));
    }

    public final gwc l0() {
        k77 k77 = Y[2];
        return (gwc) this.o.getValue();
    }

    public final z0b m0() {
        k77 k77 = Y[3];
        return (z0b) this.X.getValue();
    }

    public final qvc n0() {
        return (qvc) this.a.getValue();
    }

    public final void o0() {
        View f;
        if (m0().getScrollState() == x0b.a) {
            t0b callback = m0().getCallback();
            if (callback == null || (f = callback.f()) == null || f.getHeight() != 0) {
                m0().k();
            } else {
                m0().post(new pzb(9, this));
            }
        } else {
            m0().j(true);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return m0();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(n0().X, getViewLifecycleOwner().R(), ob7.o), new tvc((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public SelectAlbumWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        jr jrVar = new jr(inc.class, Widget.ARG_SCOPE_ID);
        k77 k77 = Y[0];
        this.a = m25getSharedViewModelcp94BC8(((inc) jrVar.a(this)).a, qvc.class, (s16) null);
        this.b = e58.a.getAccessor().d(x4a.class);
        this.c = binding(new rvc(this, 0));
        this.o = binding(new rvc(this, 1));
        this.X = binding(new rvc(this, 2));
    }
}
